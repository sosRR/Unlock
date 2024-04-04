package b2;

final class a0 {
   static int a(int var0) {
      for(int var1 = 0; var1 < 6; ++var1) {
         int var2 = (new int[]{1, 2, 3, 4, 5, 6})[var1];
         if (var2 == 0) {
            throw null;
         }

         if (var2 - 1 == var0) {
            return var2;
         }
      }

      return 1;
   }
}
