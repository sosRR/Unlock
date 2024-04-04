package r0;

import android.database.sqlite.SQLiteProgram;

class d implements q0.d {
   private final SQLiteProgram m;

   d(SQLiteProgram var1) {
      this.m = var1;
   }

   public void B(int var1, long var2) {
      this.m.bindLong(var1, var2);
   }

   public void F(int var1, byte[] var2) {
      this.m.bindBlob(var1, var2);
   }

   public void close() {
      this.m.close();
   }

   public void j(int var1, String var2) {
      this.m.bindString(var1, var2);
   }

   public void q(int var1) {
      this.m.bindNull(var1);
   }

   public void s(int var1, double var2) {
      this.m.bindDouble(var1, var2);
   }
}
