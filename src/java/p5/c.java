package p5;

import x5.g;

class c {
   public static o5.d a(o5.d var0) {
      g.e(var0, "<this>");
      q5.c var1;
      if (var0 instanceof q5.c) {
         var1 = (q5.c)var0;
      } else {
         var1 = null;
      }

      o5.d var2 = var0;
      if (var1 != null) {
         var2 = var1.g();
         if (var2 == null) {
            var2 = var0;
         }
      }

      return var2;
   }
}
