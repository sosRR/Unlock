package z4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import q4.c;

public class a {
   private final Context a;
   private final SharedPreferences b;
   private final c c;
   private boolean d;

   public a(Context var1, String var2, c var3) {
      var1 = a(var1);
      this.a = var1;
      StringBuilder var4 = new StringBuilder();
      var4.append("com.google.firebase.common.prefs:");
      var4.append(var2);
      this.b = var1.getSharedPreferences(var4.toString(), 0);
      this.c = var3;
      this.d = this.c();
   }

   private static Context a(Context var0) {
      return androidx.core.content.a.b(var0);
   }

   private boolean c() {
      return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : this.d();
   }

   private boolean d() {
      boolean var10001;
      PackageManager var2;
      try {
         var2 = this.a.getPackageManager();
      } catch (PackageManager.NameNotFoundException var7) {
         var10001 = false;
         return true;
      }

      if (var2 != null) {
         ApplicationInfo var3;
         try {
            var3 = var2.getApplicationInfo(this.a.getPackageName(), 128);
         } catch (PackageManager.NameNotFoundException var6) {
            var10001 = false;
            return true;
         }

         if (var3 != null) {
            Bundle var8;
            try {
               var8 = var3.metaData;
            } catch (PackageManager.NameNotFoundException var5) {
               var10001 = false;
               return true;
            }

            if (var8 != null) {
               try {
                  if (var8.containsKey("firebase_data_collection_default_enabled")) {
                     boolean var1 = var3.metaData.getBoolean("firebase_data_collection_default_enabled");
                     return var1;
                  }
               } catch (PackageManager.NameNotFoundException var4) {
                  var10001 = false;
               }
            }
         }
      }

      return true;
   }

   public boolean b() {
      synchronized(this){}

      boolean var1;
      try {
         var1 = this.d;
      } finally {
         ;
      }

      return var1;
   }
}
