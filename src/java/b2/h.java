package b2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import e2.r0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class h {
   @Deprecated
   public static final int a = 12451000;
   static final AtomicBoolean b = new AtomicBoolean();
   private static boolean c;
   static boolean d;
   private static final AtomicBoolean e = new AtomicBoolean();

   @Deprecated
   public static int a(Context var0) {
      PackageInfo var2;
      try {
         var2 = var0.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      } catch (PackageManager.NameNotFoundException var1) {
         Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
         return 0;
      }

      return var2.versionCode;
   }

   @Deprecated
   public static String b(int var0) {
      return b2.b.z(var0);
   }

   public static Resources c(Context var0) {
      try {
         Resources var2 = var0.getPackageManager().getResourcesForApplication("com.google.android.gms");
         return var2;
      } catch (PackageManager.NameNotFoundException var1) {
         return null;
      }
   }

   public static boolean d(Context param0) {
      // $FF: Couldn't be decompiled
   }

   @Deprecated
   public static int e(Context var0, int var1) {
      boolean var13 = false;

      label185:
      try {
         var13 = true;
         var0.getResources().getString(j.a);
         var13 = false;
      } finally {
         if (var13) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            break label185;
         }
      }

      int var2;
      if (!"com.google.android.gms".equals(var0.getPackageName()) && !e.get()) {
         var2 = r0.a(var0);
         if (var2 == 0) {
            throw new GooglePlayServicesMissingManifestValueException();
         }

         if (var2 != a) {
            throw new GooglePlayServicesIncorrectManifestValueException(var2);
         }
      }

      boolean var4 = i2.h.d(var0);
      byte var3 = 1;
      boolean var21;
      if (!var4 && !i2.h.f(var0)) {
         var21 = true;
      } else {
         var21 = false;
      }

      if (var1 >= 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      byte var20;
      label189: {
         e2.n.a(var4);
         String var6 = var0.getPackageName();
         PackageManager var7 = var0.getPackageManager();
         PackageInfo var5;
         if (var21) {
            try {
               var5 = var7.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException var16) {
               Log.w("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires the Google Play Store, but it is missing."));
               break label189;
            }
         } else {
            var5 = null;
         }

         PackageInfo var8;
         try {
            var8 = var7.getPackageInfo("com.google.android.gms", 64);
         } catch (PackageManager.NameNotFoundException var15) {
            Log.w("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires Google Play services, but they are missing."));
            var20 = var3;
            return var20;
         }

         i.a(var0);
         if (!i.e(var8, true)) {
            Log.w("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires Google Play services, but their signature is invalid."));
         } else {
            label191: {
               if (var21) {
                  e2.n.i(var5);
                  if (!i.e(var5, true)) {
                     Log.w("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires Google Play Store, but its signature is invalid."));
                     break label191;
                  }
               }

               if (!var21 || var5 == null || var5.signatures[0].equals(var8.signatures[0])) {
                  if (i2.p.a(var8.versionCode) < i2.p.a(var1)) {
                     var2 = var8.versionCode;
                     StringBuilder var18 = new StringBuilder(String.valueOf(var6).length() + 82);
                     var18.append("Google Play services out of date for ");
                     var18.append(var6);
                     var18.append(".  Requires ");
                     var18.append(var1);
                     var18.append(" but found ");
                     var18.append(var2);
                     Log.w("GooglePlayServicesUtil", var18.toString());
                     var20 = 2;
                  } else {
                     ApplicationInfo var22 = var8.applicationInfo;
                     ApplicationInfo var19 = var22;
                     if (var22 == null) {
                        try {
                           var19 = var7.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException var14) {
                           Log.wtf("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires Google Play services, but they're missing when getting application info."), var14);
                           var20 = var3;
                           return var20;
                        }
                     }

                     if (var19.enabled) {
                        return 0;
                     }

                     var20 = 3;
                  }

                  return var20;
               }

               Log.w("GooglePlayServicesUtil", String.valueOf(var6).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            }
         }
      }

      var20 = 9;
      return var20;
   }

   @Deprecated
   public static boolean f(Context var0, int var1) {
      if (var1 == 18) {
         return true;
      } else {
         return var1 == 1 ? j(var0, "com.google.android.gms") : false;
      }
   }

   @TargetApi(18)
   public static boolean g(Context var0) {
      if (i2.k.c()) {
         Object var1 = var0.getSystemService("user");
         e2.n.i(var1);
         Bundle var2 = ((UserManager)var1).getApplicationRestrictions(var0.getPackageName());
         if (var2 != null && "true".equals(var2.getString("restricted_profile"))) {
            return true;
         }
      }

      return false;
   }

   @Deprecated
   public static boolean h(int var0) {
      return var0 == 1 || var0 == 2 || var0 == 3 || var0 == 9;
   }

   @Deprecated
   @TargetApi(19)
   public static boolean i(Context var0, int var1, String var2) {
      return i2.n.b(var0, var1, var2);
   }

   @TargetApi(21)
   static boolean j(Context var0, String var1) {
      boolean var2 = var1.equals("com.google.android.gms");
      if (i2.k.f()) {
         List var3;
         try {
            var3 = var0.getPackageManager().getPackageInstaller().getAllSessions();
         } catch (Exception var4) {
            return false;
         }

         Iterator var9 = var3.iterator();

         while(var9.hasNext()) {
            if (var1.equals(((PackageInstaller.SessionInfo)var9.next()).getAppPackageName())) {
               return true;
            }
         }
      }

      PackageManager var10 = var0.getPackageManager();

      boolean var10001;
      ApplicationInfo var8;
      try {
         var8 = var10.getApplicationInfo(var1, 8192);
      } catch (PackageManager.NameNotFoundException var7) {
         var10001 = false;
         return false;
      }

      if (var2) {
         try {
            return var8.enabled;
         } catch (PackageManager.NameNotFoundException var5) {
            var10001 = false;
         }
      } else {
         try {
            if (!var8.enabled) {
               return false;
            }

            var2 = g(var0);
         } catch (PackageManager.NameNotFoundException var6) {
            var10001 = false;
            return false;
         }

         if (!var2) {
            return true;
         }
      }

      return false;
   }
}
