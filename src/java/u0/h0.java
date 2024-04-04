package u0;

import android.annotation.SuppressLint;
import android.view.View;

class h0 extends f0 {
   private static boolean f;

   @SuppressLint({"NewApi"})
   public void d(View var1, int var2, int var3, int var4, int var5) {
      if (f) {
         try {
            g0.a(var1, var2, var3, var4, var5);
         } catch (NoSuchMethodError var6) {
            f = false;
         }
      }

   }
}
