package n5;

import java.util.List;

class d extends c {
   public static final List a(Object[] var0) {
      x5.g.e(var0, "<this>");
      List var1 = f.a(var0);
      x5.g.d(var1, "asList(this)");
      return var1;
   }

   public static final Object[] b(Object[] var0, Object[] var1, int var2, int var3, int var4) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "destination");
      System.arraycopy(var0, var3, var1, var2, var4 - var3);
      return var1;
   }

   // $FF: synthetic method
   public static Object[] c(Object[] var0, Object[] var1, int var2, int var3, int var4, int var5, Object var6) {
      if ((var5 & 2) != 0) {
         var2 = 0;
      }

      if ((var5 & 4) != 0) {
         var3 = 0;
      }

      if ((var5 & 8) != 0) {
         var4 = var0.length;
      }

      return b(var0, var1, var2, var3, var4);
   }
}
