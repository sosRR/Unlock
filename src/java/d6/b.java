package d6;

class b extends a {
   public static final boolean d(char var0, char var1, boolean var2) {
      boolean var3 = true;
      if (var0 == var1) {
         return true;
      } else if (!var2) {
         return false;
      } else {
         var0 = Character.toUpperCase(var0);
         var1 = Character.toUpperCase(var1);
         var2 = var3;
         if (var0 != var1) {
            if (Character.toLowerCase(var0) == Character.toLowerCase(var1)) {
               var2 = var3;
            } else {
               var2 = false;
            }
         }

         return var2;
      }
   }
}
