package g5;

import java.util.Random;

public class f {
   public static String a(int var0) {
      StringBuilder var3 = new StringBuilder("");
      Random var2 = new Random();

      for(int var1 = 0; var1 < var0; ++var1) {
         var3.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(var2.nextInt(62)));
      }

      return var3.toString();
   }
}
