package e2;

import android.content.Intent;

final class b0 extends c0 {
   final Intent m;
   final d2.e n;

   b0(Intent var1, d2.e var2, int var3) {
      this.m = var1;
      this.n = var2;
   }

   public final void a() {
      Intent var1 = this.m;
      if (var1 != null) {
         this.n.startActivityForResult(var1, 2);
      }

   }
}
