package k2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import i2.k;

public class b {
   protected final Context a;

   public b(Context var1) {
      this.a = var1;
   }

   public int a(String var1) {
      return this.a.checkCallingOrSelfPermission(var1);
   }

   public int b(String var1, String var2) {
      return this.a.getPackageManager().checkPermission(var1, var2);
   }

   public ApplicationInfo c(String var1, int var2) {
      return this.a.getPackageManager().getApplicationInfo(var1, var2);
   }

   public CharSequence d(String var1) {
      return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(var1, 0));
   }

   public PackageInfo e(String var1, int var2) {
      return this.a.getPackageManager().getPackageInfo(var1, var2);
   }

   public boolean f() {
      if (Binder.getCallingUid() == Process.myUid()) {
         return k2.a.a(this.a);
      } else {
         if (k.h()) {
            String var1 = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (var1 != null) {
               return this.a.getPackageManager().isInstantApp(var1);
            }
         }

         return false;
      }
   }

   @TargetApi(19)
   public final boolean g(int var1, String var2) {
      if (k.d()) {
         boolean var10001;
         AppOpsManager var8;
         try {
            var8 = (AppOpsManager)this.a.getSystemService("appops");
         } catch (SecurityException var6) {
            var10001 = false;
            return false;
         }

         if (var8 != null) {
            try {
               var8.checkPackage(var1, var2);
               return true;
            } catch (SecurityException var4) {
               var10001 = false;
            }
         } else {
            try {
               NullPointerException var7 = new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
               throw var7;
            } catch (SecurityException var5) {
               var10001 = false;
            }
         }

         return false;
      } else {
         String[] var3 = this.a.getPackageManager().getPackagesForUid(var1);
         if (var2 != null && var3 != null) {
            for(var1 = 0; var1 < var3.length; ++var1) {
               if (var2.equals(var3[var1])) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
