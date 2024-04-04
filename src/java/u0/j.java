package u0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class j implements TypeEvaluator {
   private Rect a;

   public Rect a(float var1, Rect var2, Rect var3) {
      int var4 = var2.left;
      var4 += (int)((float)(var3.left - var4) * var1);
      int var5 = var2.top;
      var5 += (int)((float)(var3.top - var5) * var1);
      int var6 = var2.right;
      var6 += (int)((float)(var3.right - var6) * var1);
      int var7 = var2.bottom;
      var7 += (int)((float)(var3.bottom - var7) * var1);
      var2 = this.a;
      if (var2 == null) {
         return new Rect(var4, var5, var6, var7);
      } else {
         var2.set(var4, var5, var6, var7);
         return this.a;
      }
   }
}
