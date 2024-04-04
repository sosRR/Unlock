package r5;

public final class c {
   private static final int a(int var0, int var1, int var2) {
      return c(c(var0, var2) - c(var1, var2), var2);
   }

   public static final int b(int var0, int var1, int var2) {
      if (var2 > 0) {
         if (var0 < var1) {
            var1 -= a(var1, var0, var2);
         }
      } else {
         if (var2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
         }

         if (var0 > var1) {
            var1 += a(var0, var1, -var2);
         }
      }

      return var1;
   }

   private static final int c(int var0, int var1) {
      var0 %= var1;
      if (var0 < 0) {
         var0 += var1;
      }

      return var0;
   }
}
