package u0;

import android.annotation.SuppressLint;
import android.view.View;

class c0 extends l0 {
   private static boolean c;

   public void a(View var1) {
   }

   @SuppressLint({"NewApi"})
   public float b(View var1) {
      if (c) {
         try {
            float var2 = b0.a(var1);
            return var2;
         } catch (NoSuchMethodError var4) {
            c = false;
         }
      }

      return var1.getAlpha();
   }

   public void c(View var1) {
   }

   @SuppressLint({"NewApi"})
   public void e(View var1, float var2) {
      if (c) {
         try {
            a0.a(var1, var2);
            return;
         } catch (NoSuchMethodError var4) {
            c = false;
         }
      }

      var1.setAlpha(var2);
   }
}
