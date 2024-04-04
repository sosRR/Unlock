package u0;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;

class j0 extends h0 {
   private static boolean g;

   @SuppressLint({"NewApi"})
   public void f(View var1, int var2) {
      if (VERSION.SDK_INT == 28) {
         super.f(var1, var2);
      } else if (g) {
         try {
            i0.a(var1, var2);
         } catch (NoSuchMethodError var3) {
            g = false;
         }
      }

   }
}
