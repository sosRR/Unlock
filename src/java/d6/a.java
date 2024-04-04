package d6;

class a {
   public static final int a(int var0) {
      if ((new a6.c(2, 36)).k(var0)) {
         return var0;
      } else {
         StringBuilder var1 = new StringBuilder();
         var1.append("radix ");
         var1.append(var0);
         var1.append(" was not in valid range ");
         var1.append(new a6.c(2, 36));
         throw new IllegalArgumentException(var1.toString());
      }
   }

   public static final int b(char var0, int var1) {
      return Character.digit(var0, var1);
   }

   public static final boolean c(char var0) {
      boolean var1;
      if (!Character.isWhitespace(var0) && !Character.isSpaceChar(var0)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }
}
