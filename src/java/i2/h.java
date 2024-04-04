package i2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class h {
   private static Boolean a;
   private static Boolean b;
   private static Boolean c;
   private static Boolean d;

   public static boolean a(Context var0) {
      PackageManager var4 = var0.getPackageManager();
      if (d == null) {
         boolean var3 = k.h();
         boolean var2 = false;
         boolean var1 = var2;
         if (var3) {
            var1 = var2;
            if (var4.hasSystemFeature("android.hardware.type.automotive")) {
               var1 = true;
            }
         }

         d = var1;
      }

      return d;
   }

   public static boolean b() {
      int var0 = b2.h.a;
      return "user".equals(Build.TYPE);
   }

   @TargetApi(20)
   public static boolean c(Context var0) {
      PackageManager var4 = var0.getPackageManager();
      if (a == null) {
         boolean var3 = k.e();
         boolean var2 = false;
         boolean var1 = var2;
         if (var3) {
            var1 = var2;
            if (var4.hasSystemFeature("android.hardware.type.watch")) {
               var1 = true;
            }
         }

         a = var1;
      }

      return a;
   }

   @TargetApi(26)
   public static boolean d(Context var0) {
      boolean var3 = c(var0);
      boolean var2 = false;
      boolean var1 = var2;
      if (var3) {
         if (k.g()) {
            var1 = var2;
            if (e(var0)) {
               if (!k.h()) {
                  return true;
               }

               var1 = var2;
            }
         } else {
            var1 = true;
         }
      }

      return var1;
   }

   @TargetApi(21)
   public static boolean e(Context var0) {
      if (b == null) {
         boolean var3 = k.f();
         boolean var2 = false;
         boolean var1 = var2;
         if (var3) {
            var1 = var2;
            if (var0.getPackageManager().hasSystemFeature("cn.google")) {
               var1 = true;
            }
         }

         b = var1;
      }

      return b;
   }

   public static boolean f(Context var0) {
      if (c == null) {
         boolean var3 = var0.getPackageManager().hasSystemFeature("android.hardware.type.iot");
         boolean var2 = true;
         boolean var1 = var2;
         if (!var3) {
            if (var0.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
               var1 = var2;
            } else {
               var1 = false;
            }
         }

         c = var1;
      }

      return c;
   }
}
