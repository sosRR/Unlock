package t1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class m0 implements d, u1.a, c {
   private static final i1.b r = i1.b.b("proto");
   private final t0 m;
   private final v1.a n;
   private final v1.a o;
   private final e p;
   private final m1.a q;

   m0(v1.a var1, v1.a var2, e var3, t0 var4, m1.a var5) {
      this.m = var4;
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var5;
   }

   // $FF: synthetic method
   private static o1.f A0(long var0, SQLiteDatabase var2) {
      return (o1.f)a1(var2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new d0(var0));
   }

   // $FF: synthetic method
   private static Long B0(Cursor var0) {
      return !var0.moveToNext() ? null : var0.getLong(0);
   }

   // $FF: synthetic method
   private Boolean C0(k1.o var1, SQLiteDatabase var2) {
      Long var3 = this.p0(var2, var1);
      return var3 == null ? Boolean.FALSE : (Boolean)a1(this.k0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{var3.toString()}), new x());
   }

   // $FF: synthetic method
   private static List D0(SQLiteDatabase var0) {
      return (List)a1(var0.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new j0());
   }

   // $FF: synthetic method
   public static Object E(SQLiteDatabase var0) {
      return v0(var0);
   }

   // $FF: synthetic method
   private static List E0(Cursor var0) {
      ArrayList var1 = new ArrayList();

      while(var0.moveToNext()) {
         var1.add(k1.o.a().b(var0.getString(1)).d(w1.a.b(var0.getInt(2))).c(U0(var0.getString(3))).a());
      }

      return var1;
   }

   // $FF: synthetic method
   private List F0(k1.o var1, SQLiteDatabase var2) {
      List var3 = this.S0(var2, var1);
      return this.s0(var3, this.T0(var2, var3));
   }

   // $FF: synthetic method
   private o1.a G0(Map var1, o1.a.a var2, Cursor var3) {
      long var4;
      String var6;
      o1.c.b var7;
      for(; var3.moveToNext(); ((List)var1.get(var6)).add(o1.c.c().c(var7).b(var4).a())) {
         var6 = var3.getString(0);
         var7 = this.g0(var3.getInt(1));
         var4 = var3.getLong(2);
         if (!var1.containsKey(var6)) {
            var1.put(var6, new ArrayList());
         }
      }

      this.V0(var2, var1);
      var2.e(this.o0());
      var2.d(this.l0());
      var2.c((String)this.q.get());
      return var2.b();
   }

   // $FF: synthetic method
   private o1.a H0(String var1, Map var2, o1.a.a var3, SQLiteDatabase var4) {
      return (o1.a)a1(var4.rawQuery(var1, new String[0]), new z(this, var2, var3));
   }

   // $FF: synthetic method
   private Object I0(List var1, k1.o var2, Cursor var3) {
      long var5;
      k1.i.a var7;
      for(; var3.moveToNext(); var1.add(k.a(var5, var2, var7.d()))) {
         boolean var4 = false;
         var5 = var3.getLong(0);
         if (var3.getInt(7) != 0) {
            var4 = true;
         }

         var7 = k1.i.a().j(var3.getString(1)).i(var3.getLong(2)).k(var3.getLong(3));
         if (var4) {
            var7.h(new k1.h(Y0(var3.getString(4)), var3.getBlob(5)));
         } else {
            var7.h(new k1.h(Y0(var3.getString(4)), this.W0(var5)));
         }

         if (!var3.isNull(6)) {
            var7.g(var3.getInt(6));
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static Object J0(Map var0, Cursor var1) {
      Object var4;
      for(; var1.moveToNext(); ((Set)var4).add(new c(var1.getString(1), var1.getString(2), (m0$a)null))) {
         long var2 = var1.getLong(0);
         Set var5 = (Set)var0.get(var2);
         var4 = var5;
         if (var5 == null) {
            var4 = new HashSet();
            var0.put(var2, var4);
         }
      }

      return null;
   }

   // $FF: synthetic method
   private Long K0(k1.i var1, k1.o var2, SQLiteDatabase var3) {
      if (this.r0()) {
         this.f(1L, o1.c.b.p, var1.j());
         return -1L;
      } else {
         long var7 = this.i0(var3, var2);
         int var5 = this.p.e();
         byte[] var10 = var1.e().a();
         int var6 = var10.length;
         int var4 = 1;
         boolean var9;
         if (var6 <= var5) {
            var9 = true;
         } else {
            var9 = false;
         }

         ContentValues var11 = new ContentValues();
         var11.put("context_id", var7);
         var11.put("transport_name", var1.j());
         var11.put("timestamp_ms", var1.f());
         var11.put("uptime_ms", var1.k());
         var11.put("payload_encoding", var1.e().b().a());
         var11.put("code", var1.d());
         var11.put("num_attempts", 0);
         var11.put("inline", var9);
         byte[] var13;
         if (var9) {
            var13 = var10;
         } else {
            var13 = new byte[0];
         }

         var11.put("payload", var13);
         var7 = var3.insert("events", (String)null, var11);
         if (!var9) {
            for(var6 = (int)Math.ceil((double)var10.length / (double)var5); var4 <= var6; ++var4) {
               byte[] var17 = Arrays.copyOfRange(var10, (var4 - 1) * var5, Math.min(var4 * var5, var10.length));
               ContentValues var14 = new ContentValues();
               var14.put("event_id", var7);
               var14.put("sequence_num", var4);
               var14.put("bytes", var17);
               var3.insert("event_payloads", (String)null, var14);
            }
         }

         Iterator var15 = var1.i().entrySet().iterator();

         while(var15.hasNext()) {
            Map.Entry var12 = (Map.Entry)var15.next();
            ContentValues var16 = new ContentValues();
            var16.put("event_id", var7);
            var16.put("name", (String)var12.getKey());
            var16.put("value", (String)var12.getValue());
            var3.insert("event_metadata", (String)null, var16);
         }

         return var7;
      }
   }

   // $FF: synthetic method
   public static Object L(long var0, k1.o var2, SQLiteDatabase var3) {
      return Q0(var0, var2, var3);
   }

   // $FF: synthetic method
   private static byte[] L0(Cursor var0) {
      ArrayList var3 = new ArrayList();

      int var1;
      byte[] var4;
      for(var1 = 0; var0.moveToNext(); var1 += var4.length) {
         var4 = var0.getBlob(0);
         var3.add(var4);
      }

      var4 = new byte[var1];
      int var2 = 0;

      for(var1 = 0; var2 < var3.size(); ++var2) {
         byte[] var5 = (byte[])var3.get(var2);
         System.arraycopy(var5, 0, var4, var1, var5.length);
         var1 += var5.length;
      }

      return var4;
   }

   // $FF: synthetic method
   private Object M0(Cursor var1) {
      while(var1.moveToNext()) {
         int var2 = var1.getInt(0);
         String var3 = var1.getString(1);
         this.f((long)var2, o1.c.b.r, var3);
      }

      return null;
   }

   // $FF: synthetic method
   public static byte[] N(Cursor var0) {
      return L0(var0);
   }

   // $FF: synthetic method
   private Object N0(String var1, String var2, SQLiteDatabase var3) {
      var3.compileStatement(var1).execute();
      a1(var3.rawQuery(var2, (String[])null), new v(this));
      var3.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
      return null;
   }

   // $FF: synthetic method
   public static List O(Cursor var0) {
      return E0(var0);
   }

   // $FF: synthetic method
   private static Boolean O0(Cursor var0) {
      boolean var1;
      if (var0.getCount() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   public static Object P(String var0, o1.c.b var1, long var2, SQLiteDatabase var4) {
      return P0(var0, var1, var2, var4);
   }

   // $FF: synthetic method
   private static Object P0(String var0, o1.c.b var1, long var2, SQLiteDatabase var4) {
      if (!(Boolean)a1(var4.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{var0, Integer.toString(var1.d())}), new u())) {
         ContentValues var5 = new ContentValues();
         var5.put("log_source", var0);
         var5.put("reason", var1.d());
         var5.put("events_dropped_count", var2);
         var4.insert("log_event_dropped", (String)null, var5);
      } else {
         StringBuilder var6 = new StringBuilder();
         var6.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
         var6.append(var2);
         var6.append(" WHERE log_source = ? AND reason = ?");
         var4.execSQL(var6.toString(), new String[]{var0, Integer.toString(var1.d())});
      }

      return null;
   }

   // $FF: synthetic method
   public static Object Q(m0 var0, Cursor var1) {
      return var0.t0(var1);
   }

   // $FF: synthetic method
   private static Object Q0(long var0, k1.o var2, SQLiteDatabase var3) {
      ContentValues var4 = new ContentValues();
      var4.put("next_request_ms", var0);
      if (var3.update("transport_contexts", var4, "backend_name = ? and priority = ?", new String[]{var2.b(), String.valueOf(w1.a.a(var2.d()))}) < 1) {
         var4.put("backend_name", var2.b());
         var4.put("priority", w1.a.a(var2.d()));
         var3.insert("transport_contexts", (String)null, var4);
      }

      return null;
   }

   // $FF: synthetic method
   public static Boolean R(m0 var0, k1.o var1, SQLiteDatabase var2) {
      return var0.C0(var1, var2);
   }

   // $FF: synthetic method
   private Object R0(SQLiteDatabase var1) {
      var1.compileStatement("DELETE FROM log_event_dropped").execute();
      StringBuilder var2 = new StringBuilder();
      var2.append("UPDATE global_log_event_state SET last_metrics_upload_ms=");
      var2.append(this.n.a());
      var1.compileStatement(var2.toString()).execute();
      return null;
   }

   // $FF: synthetic method
   public static o1.f S(long var0, SQLiteDatabase var2) {
      return A0(var0, var2);
   }

   private List S0(SQLiteDatabase var1, k1.o var2) {
      ArrayList var4 = new ArrayList();
      Long var5 = this.p0(var1, var2);
      if (var5 == null) {
         return var4;
      } else {
         String var6 = var5.toString();
         int var3 = this.p.d();
         a1(var1.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{var6}, (String)null, (String)null, (String)null, String.valueOf(var3)), new t(this, var4, var2));
         return var4;
      }
   }

   // $FF: synthetic method
   public static Long T(Cursor var0) {
      return y0(var0);
   }

   private Map T0(SQLiteDatabase var1, List var2) {
      HashMap var4 = new HashMap();
      StringBuilder var5 = new StringBuilder("event_id IN (");

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         var5.append(((k)var2.get(var3)).c());
         if (var3 < var2.size() - 1) {
            var5.append(',');
         }
      }

      var5.append(')');
      String var6 = var5.toString();
      a1(var1.query("event_metadata", new String[]{"event_id", "name", "value"}, var6, (String[])null, (String)null, (String)null, (String)null), new r(var4));
      return var4;
   }

   // $FF: synthetic method
   public static o1.a U(m0 var0, String var1, Map var2, o1.a.a var3, SQLiteDatabase var4) {
      return var0.H0(var1, var2, var3, var4);
   }

   private static byte[] U0(String var0) {
      return var0 == null ? null : Base64.decode(var0, 0);
   }

   // $FF: synthetic method
   public static Object V(m0 var0, List var1, k1.o var2, Cursor var3) {
      return var0.I0(var1, var2, var3);
   }

   private void V0(o1.a.a var1, Map var2) {
      Iterator var3 = var2.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var1.a(o1.d.c().c((String)var4.getKey()).b((List)var4.getValue()).a());
      }

   }

   // $FF: synthetic method
   public static Object W(m0 var0, SQLiteDatabase var1) {
      return var0.R0(var1);
   }

   private byte[] W0(long var1) {
      return (byte[])a1(this.k0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(var1)}, (String)null, (String)null, "sequence_num"), new y());
   }

   // $FF: synthetic method
   public static Long X(Cursor var0) {
      return B0(var0);
   }

   private Object X0(d var1, b var2) {
      long var3 = this.o.a();

      while(true) {
         try {
            Object var5 = var1.a();
            return var5;
         } catch (SQLiteDatabaseLockedException var6) {
            if (this.o.a() >= (long)this.p.b() + var3) {
               return var2.apply(var6);
            }

            SystemClock.sleep(50L);
         }
      }
   }

   // $FF: synthetic method
   public static Object Y(m0 var0, String var1, String var2, SQLiteDatabase var3) {
      return var0.N0(var1, var2, var3);
   }

   private static i1.b Y0(String var0) {
      return var0 == null ? r : i1.b.b(var0);
   }

   // $FF: synthetic method
   public static Long Z(m0 var0, k1.i var1, k1.o var2, SQLiteDatabase var3) {
      return var0.K0(var1, var2, var3);
   }

   private static String Z0(Iterable var0) {
      StringBuilder var1 = new StringBuilder("(");
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.append(((k)var2.next()).c());
         if (var2.hasNext()) {
            var1.append(',');
         }
      }

      var1.append(')');
      return var1.toString();
   }

   // $FF: synthetic method
   public static Object a0(Map var0, Cursor var1) {
      return J0(var0, var1);
   }

   static Object a1(Cursor var0, b var1) {
      Object var4;
      try {
         var4 = var1.apply(var0);
      } finally {
         var0.close();
      }

      return var4;
   }

   // $FF: synthetic method
   public static o1.a b0(m0 var0, Map var1, o1.a.a var2, Cursor var3) {
      return var0.G0(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Object c0(m0 var0, Cursor var1) {
      return var0.M0(var1);
   }

   // $FF: synthetic method
   public static Integer d0(m0 var0, long var1, SQLiteDatabase var3) {
      return var0.u0(var1, var3);
   }

   // $FF: synthetic method
   public static List e0(SQLiteDatabase var0) {
      return D0(var0);
   }

   // $FF: synthetic method
   public static Boolean f0(Cursor var0) {
      return O0(var0);
   }

   private o1.c.b g0(int var1) {
      o1.c.b var2 = o1.c.b.n;
      if (var1 == var2.d()) {
         return var2;
      } else {
         o1.c.b var3 = o1.c.b.o;
         if (var1 == var3.d()) {
            return var3;
         } else {
            var3 = o1.c.b.p;
            if (var1 == var3.d()) {
               return var3;
            } else {
               var3 = o1.c.b.q;
               if (var1 == var3.d()) {
                  return var3;
               } else {
                  var3 = o1.c.b.r;
                  if (var1 == var3.d()) {
                     return var3;
                  } else {
                     var3 = o1.c.b.s;
                     if (var1 == var3.d()) {
                        return var3;
                     } else {
                        var3 = o1.c.b.t;
                        if (var1 == var3.d()) {
                           return var3;
                        } else {
                           p1.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", var1);
                           return var2;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void h0(SQLiteDatabase var1) {
      this.X0(new g0(var1), new h0());
   }

   private long i0(SQLiteDatabase var1, k1.o var2) {
      Long var3 = this.p0(var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         ContentValues var4 = new ContentValues();
         var4.put("backend_name", var2.b());
         var4.put("priority", w1.a.a(var2.d()));
         var4.put("next_request_ms", 0);
         if (var2.c() != null) {
            var4.put("extras", Base64.encodeToString(var2.c(), 0));
         }

         return var1.insert("transport_contexts", (String)null, var4);
      }
   }

   // $FF: synthetic method
   public static SQLiteDatabase l(Throwable var0) {
      return x0(var0);
   }

   private o1.b l0() {
      return o1.b.b().b(o1.e.c().b(this.j0()).c(e.a.f()).a()).a();
   }

   private long m0() {
      return this.k0().compileStatement("PRAGMA page_count").simpleQueryForLong();
   }

   private long n0() {
      return this.k0().compileStatement("PRAGMA page_size").simpleQueryForLong();
   }

   private o1.f o0() {
      return (o1.f)this.q0(new c0(this.n.a()));
   }

   private Long p0(SQLiteDatabase var1, k1.o var2) {
      StringBuilder var4 = new StringBuilder("backend_name = ? and priority = ?");
      ArrayList var3 = new ArrayList(Arrays.asList(new String[]{var2.b(), String.valueOf(w1.a.a(var2.d()))}));
      if (var2.c() != null) {
         var4.append(" and extras = ?");
         var3.add(Base64.encodeToString(var2.c(), 0));
      } else {
         var4.append(" and extras is null");
      }

      String var5 = var4.toString();
      String[] var6 = (String[])var3.toArray(new String[0]);
      return (Long)a1(var1.query("transport_contexts", new String[]{"_id"}, var5, var6, (String)null, (String)null, (String)null), new b0());
   }

   private boolean r0() {
      boolean var1;
      if (this.m0() * this.n0() >= this.p.f()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private List s0(List var1, Map var2) {
      ListIterator var6 = var1.listIterator();

      while(true) {
         k var3;
         do {
            if (!var6.hasNext()) {
               return var1;
            }

            var3 = (k)var6.next();
         } while(!var2.containsKey(var3.c()));

         k1.i.a var7 = var3.b().l();
         Iterator var4 = ((Set)var2.get(var3.c())).iterator();

         while(var4.hasNext()) {
            c var5 = (c)var4.next();
            var7.c(var5.a, var5.b);
         }

         var6.set(k.a(var3.c(), var3.d(), var7.d()));
      }
   }

   // $FF: synthetic method
   private Object t0(Cursor var1) {
      while(var1.moveToNext()) {
         int var2 = var1.getInt(0);
         String var3 = var1.getString(1);
         this.f((long)var2, o1.c.b.o, var3);
      }

      return null;
   }

   // $FF: synthetic method
   private Integer u0(long var1, SQLiteDatabase var3) {
      String[] var4 = new String[]{String.valueOf(var1)};
      a1(var3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", var4), new q(this));
      return var3.delete("events", "timestamp_ms < ?", var4);
   }

   // $FF: synthetic method
   private static Object v0(SQLiteDatabase var0) {
      var0.beginTransaction();
      return null;
   }

   // $FF: synthetic method
   private static Object w0(Throwable var0) {
      throw new SynchronizationException("Timed out while trying to acquire the lock.", var0);
   }

   // $FF: synthetic method
   public static Object x(Throwable var0) {
      return w0(var0);
   }

   // $FF: synthetic method
   private static SQLiteDatabase x0(Throwable var0) {
      throw new SynchronizationException("Timed out while trying to open db.", var0);
   }

   // $FF: synthetic method
   public static o1.f y(long var0, Cursor var2) {
      return z0(var0, var2);
   }

   // $FF: synthetic method
   private static Long y0(Cursor var0) {
      return var0.moveToNext() ? var0.getLong(0) : 0L;
   }

   // $FF: synthetic method
   public static List z(m0 var0, k1.o var1, SQLiteDatabase var2) {
      return var0.F0(var1, var2);
   }

   // $FF: synthetic method
   private static o1.f z0(long var0, Cursor var2) {
      var2.moveToNext();
      long var3 = var2.getLong(0);
      return o1.f.c().c(var3).b(var0).a();
   }

   public boolean A(k1.o var1) {
      return (Boolean)this.q0(new k0(this, var1));
   }

   public void G(Iterable var1) {
      if (var1.iterator().hasNext()) {
         StringBuilder var2 = new StringBuilder();
         var2.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
         var2.append(Z0(var1));
         this.q0(new p(this, var2.toString(), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
      }
   }

   public long H(k1.o var1) {
      return (Long)a1(this.k0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{var1.b(), String.valueOf(w1.a.a(var1.d()))}), new f0());
   }

   public void M(k1.o var1, long var2) {
      this.q0(new m(var2, var1));
   }

   public o1.a a() {
      o1.a.a var1 = o1.a.e();
      return (o1.a)this.q0(new s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), var1));
   }

   public void close() {
      this.m.close();
   }

   public int d() {
      return (Integer)this.q0(new i0(this, this.n.a() - this.p.c()));
   }

   public void e(Iterable var1) {
      if (var1.iterator().hasNext()) {
         StringBuilder var2 = new StringBuilder();
         var2.append("DELETE FROM events WHERE _id in ");
         var2.append(Z0(var1));
         String var3 = var2.toString();
         this.k0().compileStatement(var3).execute();
      }
   }

   public void f(long var1, o1.c.b var3, String var4) {
      this.q0(new l0(var4, var3, var1));
   }

   public void g() {
      this.q0(new n(this));
   }

   long j0() {
      return this.m0() * this.n0();
   }

   public Object k(u1.a.a var1) {
      SQLiteDatabase var2 = this.k0();
      this.h0(var2);

      Object var5;
      try {
         var5 = var1.a();
         var2.setTransactionSuccessful();
      } finally {
         var2.endTransaction();
      }

      return var5;
   }

   SQLiteDatabase k0() {
      t0 var1 = this.m;
      Objects.requireNonNull(var1);
      return (SQLiteDatabase)this.X0(new w(var1), new e0());
   }

   public k p(k1.o var1, k1.i var2) {
      p1.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", var1.d(), var2.j(), var1.b());
      long var3 = (Long)this.q0(new a0(this, var2, var1));
      return var3 < 1L ? null : k.a(var3, var1, var2);
   }

   Object q0(b var1) {
      SQLiteDatabase var2 = this.k0();
      var2.beginTransaction();

      Object var5;
      try {
         var5 = var1.apply(var2);
         var2.setTransactionSuccessful();
      } finally {
         var2.endTransaction();
      }

      return var5;
   }

   public Iterable r(k1.o var1) {
      return (Iterable)this.q0(new o(this, var1));
   }

   public Iterable w() {
      return (Iterable)this.q0(new l());
   }

   interface b {
      Object apply(Object var1);
   }

   private static class c {
      final String a;
      final String b;

      private c(String var1, String var2) {
         this.a = var1;
         this.b = var2;
      }

      // $FF: synthetic method
      c(String var1, String var2, m0$a var3) {
         this(var1, var2);
      }
   }

   interface d {
      Object a();
   }
}
