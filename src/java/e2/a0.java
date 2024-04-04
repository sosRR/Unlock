package e2;

import android.app.Activity;
import android.content.Intent;

final class a0 extends c0 {
   final Intent m;
   final Activity n;
   final int o;

   a0(Intent var1, Activity var2, int var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public final void a() {
      Intent var1 = this.m;
      if (var1 != null) {
         this.n.startActivityForResult(var1, this.o);
      }

   }
}
