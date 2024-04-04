package r0;

import android.database.sqlite.SQLiteStatement;
import q0.f;

class e extends d implements f {
   private final SQLiteStatement n;

   e(SQLiteStatement var1) {
      super(var1);
      this.n = var1;
   }

   public long J() {
      return this.n.executeInsert();
   }

   public int n() {
      return this.n.executeUpdateDelete();
   }
}
