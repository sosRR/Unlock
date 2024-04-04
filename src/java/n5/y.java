package n5;

import java.util.Collections;
import java.util.Map;

class y extends x {
   public static int a(int var0) {
      if (var0 >= 0) {
         if (var0 < 3) {
            ++var0;
         } else if (var0 < 1073741824) {
            var0 = (int)((float)var0 / 0.75F + 1.0F);
         } else {
            var0 = Integer.MAX_VALUE;
         }
      }

      return var0;
   }

   public static final Map b(m5.i var0) {
      x5.g.e(var0, "pair");
      Map var1 = Collections.singletonMap(var0.c(), var0.d());
      x5.g.d(var1, "singletonMap(pair.first, pair.second)");
      return var1;
   }

   public static final Map c(Map var0) {
      x5.g.e(var0, "<this>");
      Map.Entry var1 = (Map.Entry)var0.entrySet().iterator().next();
      var0 = Collections.singletonMap(var1.getKey(), var1.getValue());
      x5.g.d(var0, "with(entries.iterator().…ingletonMap(key, value) }");
      return var0;
   }
}
