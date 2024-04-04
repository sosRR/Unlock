package x5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class d {
   private static final Object[] a = new Object[0];

   public static final Object[] a(Collection var0) {
      g.e(var0, "collection");
      int var1 = var0.size();
      Object[] var6;
      if (var1 != 0) {
         Iterator var5 = var0.iterator();
         if (var5.hasNext()) {
            var6 = new Object[var1];
            var1 = 0;

            while(true) {
               int var2 = var1 + 1;
               var6[var1] = var5.next();
               Object[] var4;
               if (var2 >= var6.length) {
                  if (!var5.hasNext()) {
                     return var6;
                  }

                  int var3 = var2 * 3 + 1 >>> 1;
                  var1 = var3;
                  if (var3 <= var2) {
                     var1 = 2147483645;
                     if (var2 >= 2147483645) {
                        throw new OutOfMemoryError();
                     }
                  }

                  var4 = Arrays.copyOf(var6, var1);
                  g.d(var4, "copyOf(result, newSize)");
               } else {
                  var4 = var6;
                  if (!var5.hasNext()) {
                     var6 = Arrays.copyOf(var6, var2);
                     g.d(var6, "copyOf(result, size)");
                     return var6;
                  }
               }

               var1 = var2;
               var6 = var4;
            }
         }
      }

      var6 = a;
      return var6;
   }

   public static final Object[] b(Collection var0, Object[] var1) {
      g.e(var0, "collection");
      var1.getClass();
      int var3 = var0.size();
      int var2 = 0;
      Object[] var7;
      if (var3 == 0) {
         var7 = var1;
         if (var1.length > 0) {
            var1[0] = null;
            var7 = var1;
         }
      } else {
         Iterator var6 = var0.iterator();
         if (!var6.hasNext()) {
            var7 = var1;
            if (var1.length > 0) {
               var1[0] = null;
               var7 = var1;
            }
         } else {
            if (var3 <= var1.length) {
               var7 = var1;
            } else {
               Object var8 = Array.newInstance(var1.getClass().getComponentType(), var3);
               g.c(var8, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
               var7 = (Object[])var8;
            }

            while(true) {
               var3 = var2 + 1;
               var7[var2] = var6.next();
               Object[] var5;
               if (var3 >= var7.length) {
                  if (!var6.hasNext()) {
                     break;
                  }

                  int var4 = var3 * 3 + 1 >>> 1;
                  var2 = var4;
                  if (var4 <= var3) {
                     var2 = 2147483645;
                     if (var3 >= 2147483645) {
                        throw new OutOfMemoryError();
                     }
                  }

                  var5 = Arrays.copyOf(var7, var2);
                  g.d(var5, "copyOf(result, newSize)");
               } else {
                  var5 = var7;
                  if (!var6.hasNext()) {
                     if (var7 == var1) {
                        var1[var3] = null;
                        var7 = var1;
                     } else {
                        var7 = Arrays.copyOf(var7, var3);
                        g.d(var7, "copyOf(result, size)");
                     }
                     break;
                  }
               }

               var2 = var3;
               var7 = var5;
            }
         }
      }

      return var7;
   }
}
