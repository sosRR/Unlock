package g0;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {
   private final float[] a;
   private final float b;

   protected d(float[] var1) {
      this.a = var1;
      this.b = 1.0F / (float)(var1.length - 1);
   }

   public float getInterpolation(float var1) {
      if (var1 >= 1.0F) {
         return 1.0F;
      } else if (var1 <= 0.0F) {
         return 0.0F;
      } else {
         float[] var5 = this.a;
         int var4 = Math.min((int)((float)(var5.length - 1) * var1), var5.length - 2);
         float var3 = (float)var4;
         float var2 = this.b;
         var1 = (var1 - var3 * var2) / var2;
         var5 = this.a;
         var2 = var5[var4];
         return var2 + var1 * (var5[var4 + 1] - var2);
      }
   }
}
