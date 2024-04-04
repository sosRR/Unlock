package i2;

public class i {
   private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   private static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static String a(byte[] var0) {
      int var1 = var0.length;
      char[] var5 = new char[var1 + var1];
      var1 = 0;

      for(int var2 = 0; var1 < var0.length; ++var1) {
         int var4 = var0[var1] & 255;
         int var3 = var2 + 1;
         char[] var6 = b;
         var5[var2] = var6[var4 >>> 4];
         var2 = var3 + 1;
         var5[var3] = var6[var4 & 15];
      }

      return new String(var5);
   }

   public static String b(byte[] var0, boolean var1) {
      int var3 = var0.length;
      StringBuilder var5 = new StringBuilder(var3 + var3);

      for(int var2 = 0; var2 < var3 && (!var1 || var2 != var3 - 1 || (var0[var2] & 255) != 0); ++var2) {
         char[] var4 = a;
         var5.append(var4[(var0[var2] & 240) >>> 4]);
         var5.append(var4[var0[var2] & 15]);
      }

      return var5.toString();
   }
}
