package d6;

class k extends j {
   public static Long a(String var0) {
      x5.g.e(var0, "<this>");
      return b(var0, 10);
   }

   public static final Long b(String var0, int var1) {
      x5.g.e(var0, "<this>");
      a.a(var1);
      int var4 = var0.length();
      if (var4 == 0) {
         return null;
      } else {
         int var2 = 0;
         int var5 = var0.charAt(0);
         int var3 = x5.g.f(var5, 48);
         long var6 = -9223372036854775807L;
         boolean var15;
         if (var3 < 0) {
            var15 = true;
            if (var4 == 1) {
               return null;
            }

            if (var5 == 45) {
               var6 = Long.MIN_VALUE;
               var2 = 1;
            } else {
               if (var5 != 43) {
                  return null;
               }

               var15 = false;
               var2 = 1;
            }
         } else {
            var15 = false;
         }

         long var10 = 0L;
         long var12 = -256204778801521550L;

         while(true) {
            if (var2 >= var4) {
               Long var14;
               if (var15) {
                  var14 = var10;
               } else {
                  var14 = -var10;
               }

               return var14;
            }

            var5 = a.b(var0.charAt(var2), var1);
            if (var5 < 0) {
               return null;
            }

            long var8 = var12;
            if (var10 < var12) {
               if (var12 != -256204778801521550L) {
                  break;
               }

               var12 = var6 / (long)var1;
               var8 = var12;
               if (var10 < var12) {
                  break;
               }
            }

            var10 *= (long)var1;
            var12 = (long)var5;
            if (var10 < var6 + var12) {
               return null;
            }

            var10 -= var12;
            ++var2;
            var12 = var8;
         }

         return null;
      }
   }
}
