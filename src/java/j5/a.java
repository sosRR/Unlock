package j5;

import android.content.Context;

public class a {
   public static String a(Context var0) {
      try {
         String var3 = var0.getPackageManager().getPackageInfo(var0.getPackageName(), 0).versionName;
         return var3;
      } catch (Throwable var2) {
         var2.getMessage();
         return null;
      }
   }

   public static boolean b(String var0, Context var1) {
      try {
         var1.getPackageManager().getPackageInfo(var0, 0);
         return true;
      } catch (Throwable var3) {
         var3.getMessage();
         return false;
      }
   }
}
