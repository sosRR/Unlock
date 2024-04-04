package d6;

class l extends k {
   public static final boolean c(String var0, int var1, String var2, int var3, int var4, boolean var5) {
      x5.g.e(var0, "<this>");
      x5.g.e(var2, "other");
      if (!var5) {
         var5 = var0.regionMatches(var1, var2, var3, var4);
      } else {
         var5 = var0.regionMatches(var5, var1, var2, var3, var4);
      }

      return var5;
   }

   public static final boolean d(String var0, String var1, boolean var2) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "prefix");
      return !var2 ? var0.startsWith(var1) : c(var0, 0, var1, 0, var1.length(), var2);
   }

   // $FF: synthetic method
   public static boolean e(String var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return d(var0, var1, var2);
   }
}
