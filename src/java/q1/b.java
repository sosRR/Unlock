package q1;

public final class b {
   public static Object a(int var0, Object var1, a var2, c var3) {
      int var4 = var0;
      Object var5 = var1;
      if (var0 < 1) {
         return var2.apply(var1);
      } else {
         do {
            var1 = var2.apply(var5);
            var5 = var3.a(var5, var1);
            if (var5 == null) {
               break;
            }

            var0 = var4 - 1;
            var4 = var0;
         } while(var0 >= 1);

         return var1;
      }
   }
}
