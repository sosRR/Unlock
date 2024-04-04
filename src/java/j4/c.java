package j4;

import java.util.HashMap;

public class c implements d {
   private final int a;

   public c(int var1) {
      this.a = var1;
   }

   private static boolean b(StackTraceElement[] var0, int var1, int var2) {
      int var4 = var2 - var1;
      if (var2 + var4 > var0.length) {
         return false;
      } else {
         for(int var3 = 0; var3 < var4; ++var3) {
            if (!var0[var1 + var3].equals(var0[var2 + var3])) {
               return false;
            }
         }

         return true;
      }
   }

   private static StackTraceElement[] c(StackTraceElement[] var0, int var1) {
      HashMap var11 = new HashMap();
      StackTraceElement[] var8 = new StackTraceElement[var0.length];
      int var2 = 0;
      int var5 = 0;

      int var3;
      for(int var4 = 1; var2 < var0.length; var4 = var3) {
         StackTraceElement var9 = var0[var2];
         Integer var10 = (Integer)var11.get(var9);
         if (var10 != null && b(var0, var10, var2)) {
            int var7 = var2 - var10;
            int var6 = var5;
            var3 = var4;
            if (var4 < var1) {
               System.arraycopy(var0, var2, var8, var5, var7);
               var6 = var5 + var7;
               var3 = var4 + 1;
            }

            var4 = var7 - 1 + var2;
            var5 = var6;
         } else {
            var8[var5] = var0[var2];
            ++var5;
            var3 = 1;
            var4 = var2;
         }

         var11.put(var9, var2);
         var2 = var4 + 1;
      }

      var0 = new StackTraceElement[var5];
      System.arraycopy(var8, 0, var0, 0, var5);
      return var0;
   }

   public StackTraceElement[] a(StackTraceElement[] var1) {
      StackTraceElement[] var2 = c(var1, this.a);
      return var2.length < var1.length ? var2 : var1;
   }
}
