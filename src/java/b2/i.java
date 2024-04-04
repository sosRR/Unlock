package b2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.Nullable;

public class i {
   @Nullable
   private static i c;
   private final Context a;
   private volatile String b;

   public i(Context var1) {
      this.a = var1.getApplicationContext();
   }

   public static i a(Context var0) {
      e2.n.i(var0);
      Class var2 = i.class;
      synchronized(i.class){}

      Throwable var10000;
      boolean var10001;
      label131: {
         try {
            if (c == null) {
               x.d(var0);
               i var1 = new i(var0);
               c = var1;
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label131;
         }

         label128:
         try {
            return c;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label128;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   @Nullable
   static final t d(PackageInfo var0, t... var1) {
      Signature[] var3 = var0.signatures;
      if (var3 == null) {
         return null;
      } else if (var3.length != 1) {
         Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
         return null;
      } else {
         Signature[] var4 = var0.signatures;
         int var2 = 0;

         for(u var5 = new u(var4[0].toByteArray()); var2 < var1.length; ++var2) {
            if (var1[var2].equals(var5)) {
               return var1[var2];
            }
         }

         return null;
      }
   }

   public static final boolean e(PackageInfo var0, boolean var1) {
      if (var0 != null && var0.signatures != null) {
         t var2;
         if (var1) {
            var2 = d(var0, w.a);
         } else {
            var2 = d(var0, w.a[0]);
         }

         if (var2 != null) {
            return true;
         }
      }

      return false;
   }

   @SuppressLint({"PackageManagerGetSignatures"})
   private final h0 f(String var1, boolean var2, boolean var3) {
      if (var1 == null) {
         return h0.c("null pkg");
      } else if (var1.equals(this.b)) {
         return h0.b();
      } else {
         h0 var4;
         if (x.e()) {
            var4 = x.b(var1, h.d(this.a), false, false);
         } else {
            PackageInfo var6;
            try {
               var6 = this.a.getPackageManager().getPackageInfo(var1, 64);
            } catch (PackageManager.NameNotFoundException var8) {
               if (var1.length() != 0) {
                  var1 = "no pkg ".concat(var1);
               } else {
                  var1 = new String("no pkg ");
               }

               return h0.d(var1, var8);
            }

            var2 = h.d(this.a);
            if (var6 == null) {
               var4 = h0.c("null pkg");
            } else {
               Signature[] var9 = var6.signatures;
               if (var9 != null && var9.length == 1) {
                  u var5 = new u(var6.signatures[0].toByteArray());
                  String var7 = var6.packageName;
                  var4 = x.a(var7, var5, var2, false);
                  if (var4.a) {
                     ApplicationInfo var10 = var6.applicationInfo;
                     if (var10 != null && (var10.flags & 2) != 0 && x.a(var7, var5, false, true).a) {
                        var4 = h0.c("debuggable release cert app rejected");
                     }
                  }
               } else {
                  var4 = h0.c("single cert required");
               }
            }
         }

         if (var4.a) {
            this.b = var1;
         }

         return var4;
      }
   }

   public boolean b(PackageInfo var1) {
      if (var1 == null) {
         return false;
      } else if (e(var1, false)) {
         return true;
      } else {
         if (e(var1, true)) {
            if (h.d(this.a)) {
               return true;
            }

            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
         }

         return false;
      }
   }

   public boolean c(int var1) {
      h0 var3;
      label25: {
         String[] var4 = this.a.getPackageManager().getPackagesForUid(var1);
         if (var4 != null) {
            int var2 = var4.length;
            if (var2 != 0) {
               var3 = null;

               for(var1 = 0; var1 < var2; ++var1) {
                  var3 = this.f(var4[var1], false, false);
                  if (var3.a) {
                     break label25;
                  }
               }

               e2.n.i(var3);
               break label25;
            }
         }

         var3 = h0.c("no pkgs");
      }

      var3.e();
      return var3.a;
   }
}
