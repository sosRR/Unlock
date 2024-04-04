package n5;

import java.util.Set;

class d0 extends c0 {
   public static final Set b() {
      return u.m;
   }

   public static final Set c(Set var0) {
      x5.g.e(var0, "<this>");
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 == 1) {
            var0 = c0.a(var0.iterator().next());
         }
      } else {
         var0 = b();
      }

      return var0;
   }
}
