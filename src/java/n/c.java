package n;

class c {
   static final int[] a = new int[0];
   static final long[] b = new long[0];
   static final Object[] c = new Object[0];

   static int a(int[] var0, int var1, int var2) {
      --var1;
      int var3 = 0;

      while(var3 <= var1) {
         int var5 = var3 + var1 >>> 1;
         int var4 = var0[var5];
         if (var4 < var2) {
            var3 = var5 + 1;
         } else {
            if (var4 <= var2) {
               return var5;
            }

            var1 = var5 - 1;
         }
      }

      return ~var3;
   }

   static int b(long[] var0, int var1, long var2) {
      --var1;
      int var4 = 0;

      while(var4 <= var1) {
         int var6 = var4 + var1 >>> 1;
         long var7;
         int var5 = (var7 = var0[var6] - var2) == 0L ? 0 : (var7 < 0L ? -1 : 1);
         if (var5 < 0) {
            var4 = var6 + 1;
         } else {
            if (var5 <= 0) {
               return var6;
            }

            var1 = var6 - 1;
         }
      }

      return ~var4;
   }

   public static boolean c(Object var0, Object var1) {
      boolean var2;
      if (var0 == var1 || var0 != null && var0.equals(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static int d(int var0) {
      for(int var1 = 4; var1 < 32; ++var1) {
         int var2 = (1 << var1) - 12;
         if (var0 <= var2) {
            return var2;
         }
      }

      return var0;
   }

   public static int e(int var0) {
      return d(var0 * 4) / 4;
   }

   public static int f(int var0) {
      return d(var0 * 8) / 8;
   }
}
