package i2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public final class n {
   public static boolean a(Context var0, int var1) {
      if (!b(var0, var1, "com.google.android.gms")) {
         return false;
      } else {
         PackageManager var2 = var0.getPackageManager();

         PackageInfo var4;
         try {
            var4 = var2.getPackageInfo("com.google.android.gms", 64);
         } catch (PackageManager.NameNotFoundException var3) {
            Log.isLoggable("UidVerifier", 3);
            return false;
         }

         return b2.i.a(var0).b(var4);
      }
   }

   @TargetApi(19)
   public static boolean b(Context var0, int var1, String var2) {
      return k2.c.a(var0).g(var1, var2);
   }
}
