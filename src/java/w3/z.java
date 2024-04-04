package w3;

public final class z {
   public static void a(boolean var0, String var1) {
      if (!var0) {
         throw new IllegalArgumentException(var1);
      }
   }

   public static Object b(Object var0) {
      var0.getClass();
      return var0;
   }

   public static Object c(Object var0, String var1) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException(var1);
      }
   }

   public static void d(boolean var0, String var1) {
      if (!var0) {
         throw new IllegalStateException(var1);
      }
   }
}
