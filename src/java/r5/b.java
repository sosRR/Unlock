package r5;

import x5.g;

public final class b {
   public static final a a;

   static {
      // $FF: Couldn't be decompiled
   }

   private static final int a() {
      String var6 = System.getProperty("java.specification.version");
      int var0 = 65542;
      if (var6 == null) {
         return 65542;
      } else {
         int var4 = d6.c.k(var6, '.', 0, false, 6, (Object)null);
         int var1;
         if (var4 < 0) {
            try {
               var1 = Integer.parseInt(var6);
            } catch (NumberFormatException var7) {
               return var0;
            }

            var0 = var1 * 65536;
            return var0;
         } else {
            int var3 = var4 + 1;
            int var2 = d6.c.k(var6, '.', var3, false, 4, (Object)null);
            var1 = var2;
            if (var2 < 0) {
               var1 = var6.length();
            }

            String var5 = var6.substring(0, var4);
            g.d(var5, "this as java.lang.String…ing(startIndex, endIndex)");
            var6 = var6.substring(var3, var1);
            g.d(var6, "this as java.lang.String…ing(startIndex, endIndex)");

            try {
               var2 = Integer.parseInt(var5);
               var1 = Integer.parseInt(var6);
            } catch (NumberFormatException var8) {
               return var0;
            }

            var0 = var2 * 65536 + var1;
            return var0;
         }
      }
   }
}
