package a3;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class a {
   public static final TimeInterpolator a = new LinearInterpolator();
   public static final TimeInterpolator b = new g0.b();
   public static final TimeInterpolator c = new g0.a();
   public static final TimeInterpolator d = new g0.c();
   public static final TimeInterpolator e = new DecelerateInterpolator();

   public static float a(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static float b(float var0, float var1, float var2, float var3, float var4) {
      if (var4 < var2) {
         return var0;
      } else {
         return var4 > var3 ? var1 : a(var0, var1, (var4 - var2) / (var3 - var2));
      }
   }

   public static int c(int var0, int var1, float var2) {
      return var0 + Math.round(var2 * (float)(var1 - var0));
   }
}
