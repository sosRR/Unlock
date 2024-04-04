package b4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;

public class r {
   private final SharedPreferences a;
   private final com.google.firebase.d b;
   private final Object c;
   y2.h d;
   boolean e;
   private boolean f;
   private Boolean g;
   private final y2.h h;

   public r(com.google.firebase.d var1) {
      Object var3 = new Object();
      this.c = var3;
      this.d = new y2.h();
      this.e = false;
      this.f = false;
      this.h = new y2.h();
      Context var4 = var1.j();
      this.b = var1;
      this.a = b4.g.r(var4);
      Boolean var2 = this.b();
      Boolean var18 = var2;
      if (var2 == null) {
         var18 = this.a(var4);
      }

      this.g = var18;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label136: {
         try {
            if (this.d()) {
               this.d.e((Object)null);
               this.e = true;
            }
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label136;
         }

         label133:
         try {
            return;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label133;
         }
      }

      while(true) {
         Throwable var19 = var10000;

         try {
            throw var19;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            continue;
         }
      }
   }

   private Boolean a(Context var1) {
      Boolean var2 = f(var1);
      if (var2 == null) {
         this.f = false;
         return null;
      } else {
         this.f = true;
         return Boolean.TRUE.equals(var2);
      }
   }

   private Boolean b() {
      if (this.a.contains("firebase_crashlytics_collection_enabled")) {
         this.f = false;
         return this.a.getBoolean("firebase_crashlytics_collection_enabled", true);
      } else {
         return null;
      }
   }

   private void e(boolean var1) {
      String var3;
      if (var1) {
         var3 = "ENABLED";
      } else {
         var3 = "DISABLED";
      }

      String var2;
      if (this.g == null) {
         var2 = "global Firebase setting";
      } else if (this.f) {
         var2 = "firebase_crashlytics_collection_enabled manifest flag";
      } else {
         var2 = "API";
      }

      y3.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{var3, var2}));
   }

   private static Boolean f(Context var0) {
      PackageManager.NameNotFoundException var10000;
      label47: {
         boolean var10001;
         PackageManager var2;
         try {
            var2 = var0.getPackageManager();
         } catch (PackageManager.NameNotFoundException var6) {
            var10000 = var6;
            var10001 = false;
            break label47;
         }

         if (var2 == null) {
            return null;
         }

         ApplicationInfo var7;
         try {
            var7 = var2.getApplicationInfo(var0.getPackageName(), 128);
         } catch (PackageManager.NameNotFoundException var5) {
            var10000 = var5;
            var10001 = false;
            break label47;
         }

         if (var7 == null) {
            return null;
         }

         Bundle var9;
         try {
            var9 = var7.metaData;
         } catch (PackageManager.NameNotFoundException var4) {
            var10000 = var4;
            var10001 = false;
            break label47;
         }

         if (var9 == null) {
            return null;
         }

         try {
            if (var9.containsKey("firebase_crashlytics_collection_enabled")) {
               boolean var1 = var7.metaData.getBoolean("firebase_crashlytics_collection_enabled");
               return var1;
            }

            return null;
         } catch (PackageManager.NameNotFoundException var3) {
            var10000 = var3;
            var10001 = false;
         }
      }

      PackageManager.NameNotFoundException var8 = var10000;
      y3.f.f().e("Could not read data collection permission from manifest", var8);
      return null;
   }

   public void c(boolean var1) {
      if (var1) {
         this.h.e((Object)null);
      } else {
         throw new IllegalStateException("An invalid data collection token was used.");
      }
   }

   public boolean d() {
      synchronized(this){}

      Throwable var10000;
      label170: {
         boolean var10001;
         Boolean var2;
         try {
            var2 = this.g;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label170;
         }

         boolean var1;
         if (var2 != null) {
            try {
               var1 = var2;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label170;
            }
         } else {
            try {
               var1 = this.b.s();
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label170;
            }
         }

         label156:
         try {
            this.e(var1);
            return var1;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label156;
         }
      }

      Throwable var24 = var10000;
      throw var24;
   }

   public y2.g g() {
      // $FF: Couldn't be decompiled
   }

   public y2.g h(Executor var1) {
      return q0.i(var1, this.h.a(), this.g());
   }
}
