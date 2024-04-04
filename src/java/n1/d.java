package n1;

public final class d {
   public static void a(Object var0, Class var1) {
      if (var0 == null) {
         StringBuilder var2 = new StringBuilder();
         var2.append(var1.getCanonicalName());
         var2.append(" must be set");
         throw new IllegalStateException(var2.toString());
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
}
