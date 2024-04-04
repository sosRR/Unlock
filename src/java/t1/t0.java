package t1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

final class t0 extends SQLiteOpenHelper {
   private static final String o;
   static int p;
   private static final a q;
   private static final a r;
   private static final a s;
   private static final a t;
   private static final a u;
   private static final List v;
   private final int m;
   private boolean n = false;

   static {
      StringBuilder var0 = new StringBuilder();
      var0.append("INSERT INTO global_log_event_state VALUES (");
      var0.append(System.currentTimeMillis());
      var0.append(")");
      o = var0.toString();
      p = 5;
      o0 var5 = new o0();
      q = var5;
      p0 var2 = new p0();
      r = var2;
      q0 var3 = new q0();
      s = var3;
      r0 var1 = new r0();
      t = var1;
      s0 var4 = new s0();
      u = var4;
      v = Arrays.asList(new a[]{var5, var2, var3, var1, var4});
   }

   t0(Context var1, String var2, int var3) {
      super(var1, var2, (SQLiteDatabase.CursorFactory)null, var3);
      this.m = var3;
   }

   // $FF: synthetic method
   private static void E(SQLiteDatabase var0) {
      var0.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
   }

   // $FF: synthetic method
   private static void L(SQLiteDatabase var0) {
      var0.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
      var0.execSQL("DROP TABLE IF EXISTS event_payloads");
      var0.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
   }

   // $FF: synthetic method
   private static void N(SQLiteDatabase var0) {
      var0.execSQL("DROP TABLE IF EXISTS log_event_dropped");
      var0.execSQL("DROP TABLE IF EXISTS global_log_event_state");
      var0.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
      var0.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
      var0.execSQL(o);
   }

   private void O(SQLiteDatabase var1, int var2) {
      this.x(var1);
      this.P(var1, 0, var2);
   }

   private void P(SQLiteDatabase var1, int var2, int var3) {
      List var4 = v;
      if (var3 > var4.size()) {
         StringBuilder var5 = new StringBuilder();
         var5.append("Migration from ");
         var5.append(var2);
         var5.append(" to ");
         var5.append(var3);
         var5.append(" was requested, but cannot be performed. Only ");
         var5.append(var4.size());
         var5.append(" migrations are provided");
         throw new IllegalArgumentException(var5.toString());
      } else {
         while(var2 < var3) {
            ((a)v.get(var2)).a(var1);
            ++var2;
         }

      }
   }

   // $FF: synthetic method
   public static void a(SQLiteDatabase var0) {
      z(var0);
   }

   // $FF: synthetic method
   public static void f(SQLiteDatabase var0) {
      E(var0);
   }

   // $FF: synthetic method
   public static void g(SQLiteDatabase var0) {
      L(var0);
   }

   // $FF: synthetic method
   public static void k(SQLiteDatabase var0) {
      y(var0);
   }

   // $FF: synthetic method
   public static void l(SQLiteDatabase var0) {
      N(var0);
   }

   private void x(SQLiteDatabase var1) {
      if (!this.n) {
         this.onConfigure(var1);
      }

   }

   // $FF: synthetic method
   private static void y(SQLiteDatabase var0) {
      var0.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
      var0.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
      var0.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
      var0.execSQL("CREATE INDEX events_backend_id on events(context_id)");
      var0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
   }

   // $FF: synthetic method
   private static void z(SQLiteDatabase var0) {
      var0.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
      var0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
      var0.execSQL("DROP INDEX contexts_backend_priority");
   }

   public void onConfigure(SQLiteDatabase var1) {
      this.n = true;
      var1.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
      var1.setForeignKeyConstraintsEnabled(true);
   }

   public void onCreate(SQLiteDatabase var1) {
      this.O(var1, this.m);
   }

   public void onDowngrade(SQLiteDatabase var1, int var2, int var3) {
      var1.execSQL("DROP TABLE events");
      var1.execSQL("DROP TABLE event_metadata");
      var1.execSQL("DROP TABLE transport_contexts");
      var1.execSQL("DROP TABLE IF EXISTS event_payloads");
      var1.execSQL("DROP TABLE IF EXISTS log_event_dropped");
      var1.execSQL("DROP TABLE IF EXISTS global_log_event_state");
      this.O(var1, var3);
   }

   public void onOpen(SQLiteDatabase var1) {
      this.x(var1);
   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      this.x(var1);
      this.P(var1, var2, var3);
   }

   public interface a {
      void a(SQLiteDatabase var1);
   }
}
