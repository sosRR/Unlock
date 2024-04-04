package i2;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class b {
   public static Object[] a(Object[]... var0) {
      if (var0.length == 0) {
         return (Object[])Array.newInstance(var0.getClass(), 0);
      } else {
         int var1 = 0;

         int var2;
         for(var2 = 0; var1 < var0.length; ++var1) {
            var2 += var0[var1].length;
         }

         Object[] var4 = Arrays.copyOf(var0[0], var2);
         var2 = var0[0].length;

         for(var1 = 1; var1 < var0.length; ++var1) {
            Object[] var5 = var0[var1];
            int var3 = var5.length;
            System.arraycopy(var5, 0, var4, var2, var3);
            var2 += var3;
         }

         return var4;
      }
   }

   public static boolean b(int[] var0, int var1) {
      if (var0 == null) {
         return false;
      } else {
         int var3 = var0.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            if (var0[var2] == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean c(Object[] var0, Object var1) {
      int var2;
      if (var0 != null) {
         var2 = var0.length;
      } else {
         var2 = 0;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         if (e2.m.a(var0[var3], var1)) {
            if (var3 >= 0) {
               return true;
            }
            break;
         }
      }

      return false;
   }
}
