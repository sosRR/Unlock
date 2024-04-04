package i2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e {
   @Deprecated
   public static List a() {
      return Collections.emptyList();
   }

   @Deprecated
   public static List b(Object var0) {
      return Collections.singletonList(var0);
   }

   @Deprecated
   public static List c(Object... var0) {
      int var1 = var0.length;
      if (var1 != 0) {
         return var1 != 1 ? Collections.unmodifiableList(Arrays.asList(var0)) : b(var0[0]);
      } else {
         return a();
      }
   }
}
