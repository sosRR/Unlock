package a3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator {
   private final float[] a = new float[9];
   private final float[] b = new float[9];
   private final Matrix c = new Matrix();

   public Matrix a(float var1, Matrix var2, Matrix var3) {
      var2.getValues(this.a);
      var3.getValues(this.b);

      for(int var6 = 0; var6 < 9; ++var6) {
         float[] var7 = this.b;
         float var5 = var7[var6];
         float var4 = this.a[var6];
         var7[var6] = var4 + (var5 - var4) * var1;
      }

      this.c.setValues(this.b);
      return this.c;
   }
}
