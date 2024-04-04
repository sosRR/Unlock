package n5;

import java.util.List;

class i extends h {
   public static final List b() {
      return s.m;
   }

   public static List c(Object... var0) {
      x5.g.e(var0, "elements");
      List var1;
      if (var0.length > 0) {
         var1 = d.a(var0);
      } else {
         var1 = b();
      }

      return var1;
   }

   public static List d(List var0) {
      x5.g.e(var0, "<this>");
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 == 1) {
            var0 = h.a(var0.get(0));
         }
      } else {
         var0 = b();
      }

      return var0;
   }

   public static void e() {
      throw new ArithmeticException("Index overflow has happened.");
   }
}
