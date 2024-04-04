package m;

import android.graphics.drawable.Drawable;

class f extends Drawable {
   private static final double a = Math.cos(Math.toRadians(45.0));

   static float a(float var0, float var1, boolean var2) {
      float var3 = var0;
      if (var2) {
         var3 = (float)((double)var0 + (1.0 - a) * (double)var1);
      }

      return var3;
   }

   static float b(float var0, float var1, boolean var2) {
      return var2 ? (float)((double)(var0 * 1.5F) + (1.0 - a) * (double)var1) : var0 * 1.5F;
   }
}
