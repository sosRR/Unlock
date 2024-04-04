package n5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

class e extends d {
   public static List d(Object[] var0) {
      x5.g.e(var0, "<this>");
      return (List)e(var0, new ArrayList());
   }

   public static final Collection e(Object[] var0, Collection var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "destination");
      int var3 = var0.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         Object var4 = var0[var2];
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   public static char f(char[] var0) {
      x5.g.e(var0, "<this>");
      int var1 = var0.length;
      if (var1 != 0) {
         if (var1 == 1) {
            return var0[0];
         } else {
            throw new IllegalArgumentException("Array has more than one element.");
         }
      } else {
         throw new NoSuchElementException("Array is empty.");
      }
   }

   public static Object g(Object[] var0) {
      x5.g.e(var0, "<this>");
      Object var1;
      if (var0.length == 1) {
         var1 = var0[0];
      } else {
         var1 = null;
      }

      return var1;
   }
}
