package g1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public class g {
   private static final String a = x0.k.f("PackageManagerHelper");

   public static void a(Context var0, Class var1, boolean var2) {
      String var4 = "enabled";

      String var7;
      String var11;
      x0.k var13;
      Exception var10000;
      label47: {
         PackageManager var5;
         ComponentName var6;
         boolean var10001;
         try {
            var5 = var0.getPackageManager();
            var6 = new ComponentName(var0, var1.getName());
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label47;
         }

         byte var3;
         if (var2) {
            var3 = 1;
         } else {
            var3 = 2;
         }

         String var14;
         try {
            var5.setComponentEnabledSetting(var6, var3, 1);
            var13 = x0.k.c();
            var14 = a;
            var7 = var1.getName();
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label47;
         }

         if (var2) {
            var11 = "enabled";
         } else {
            var11 = "disabled";
         }

         try {
            var13.a(var14, String.format("%s %s", new Object[]{var7, var11}));
            return;
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      Exception var15 = var10000;
      var13 = x0.k.c();
      var7 = a;
      String var12 = var1.getName();
      if (var2) {
         var11 = var4;
      } else {
         var11 = "disabled";
      }

      var13.a(var7, String.format("%s could not be %s", new Object[]{var12, var11}), var15);
   }
}
