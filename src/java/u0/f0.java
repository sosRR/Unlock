package u0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

class f0 extends c0 {
   private static boolean d;
   private static boolean e;

   @SuppressLint({"NewApi"})
   public void g(View var1, Matrix var2) {
      if (d) {
         try {
            e0.a(var1, var2);
         } catch (NoSuchMethodError var3) {
            d = false;
         }
      }

   }

   @SuppressLint({"NewApi"})
   public void h(View var1, Matrix var2) {
      if (e) {
         try {
            d0.a(var1, var2);
         } catch (NoSuchMethodError var3) {
            e = false;
         }
      }

   }
}
