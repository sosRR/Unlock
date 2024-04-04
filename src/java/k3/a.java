package k3;

public final class a {
   public static float a(float var0, float var1, float var2, float var3) {
      return (float)Math.hypot((double)(var2 - var0), (double)(var3 - var1));
   }

   public static float b(float var0, float var1, float var2, float var3, float var4, float var5) {
      return d(a(var0, var1, var2, var3), a(var0, var1, var4, var3), a(var0, var1, var4, var5), a(var0, var1, var2, var5));
   }

   public static float c(float var0, float var1, float var2) {
      return (1.0F - var2) * var0 + var2 * var1;
   }

   private static float d(float var0, float var1, float var2, float var3) {
      if (!(var0 > var1) || !(var0 > var2) || !(var0 > var3)) {
         if (var1 > var2 && var1 > var3) {
            var0 = var1;
         } else if (var2 > var3) {
            var0 = var2;
         } else {
            var0 = var3;
         }
      }

      return var0;
   }
}
