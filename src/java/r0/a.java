package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import java.util.List;
import q0.f;

class a implements q0.b {
   private static final String[] n = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
   private static final String[] o = new String[0];
   private final SQLiteDatabase m;

   a(SQLiteDatabase var1) {
      this.m = var1;
   }

   public void C() {
      this.m.setTransactionSuccessful();
   }

   public void D(String var1, Object[] var2) {
      this.m.execSQL(var1, var2);
   }

   public Cursor K(String var1) {
      return this.t(new q0.a(var1));
   }

   boolean a(SQLiteDatabase var1) {
      boolean var2;
      if (this.m == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void b() {
      this.m.endTransaction();
   }

   public void c() {
      this.m.beginTransaction();
   }

   public void close() {
      this.m.close();
   }

   public List h() {
      return this.m.getAttachedDbs();
   }

   public void i(String var1) {
      this.m.execSQL(var1);
   }

   public boolean isOpen() {
      return this.m.isOpen();
   }

   public Cursor m(q0.e var1, CancellationSignal var2) {
      return this.m.rawQueryWithFactory(new a$b(this, var1), var1.a(), o, (String)null, var2);
   }

   public f o(String var1) {
      return new e(this.m.compileStatement(var1));
   }

   public Cursor t(q0.e var1) {
      return this.m.rawQueryWithFactory(new a$a(this, var1), var1.a(), o, (String)null);
   }

   public String u() {
      return this.m.getPath();
   }

   public boolean v() {
      return this.m.inTransaction();
   }
}
