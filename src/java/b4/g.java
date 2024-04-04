package b4;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class g {
   private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   private static long b = -1L;

   public static String A(InputStream var0) {
      Scanner var1 = (new Scanner(var0)).useDelimiter("\\A");
      String var2;
      if (var1.hasNext()) {
         var2 = var1.next();
      } else {
         var2 = "";
      }

      return var2;
   }

   public static long a(Context var0) {
      ActivityManager.MemoryInfo var1 = new ActivityManager.MemoryInfo();
      ((ActivityManager)var0.getSystemService("activity")).getMemoryInfo(var1);
      return var1.availMem;
   }

   public static long b(String var0) {
      StatFs var3 = new StatFs(var0);
      long var1 = (long)var3.getBlockSize();
      return (long)var3.getBlockCount() * var1 - var1 * (long)var3.getAvailableBlocks();
   }

   @SuppressLint({"MissingPermission"})
   public static boolean c(Context var0) {
      boolean var3 = d(var0, "android.permission.ACCESS_NETWORK_STATE");
      boolean var2 = true;
      boolean var1 = var2;
      if (var3) {
         NetworkInfo var4 = ((ConnectivityManager)var0.getSystemService("connectivity")).getActiveNetworkInfo();
         if (var4 != null && var4.isConnectedOrConnecting()) {
            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public static boolean d(Context var0, String var1) {
      boolean var2;
      if (var0.checkCallingOrSelfPermission(var1) == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static void e(Closeable var0, String var1) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var2) {
            y3.f.f().e(var1, var2);
         }
      }

   }

   public static void f(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var1) {
            throw var1;
         } catch (Exception var2) {
         }
      }

   }

   static long g(String var0, String var1, int var2) {
      return Long.parseLong(var0.split(var1)[0].trim()) * (long)var2;
   }

   public static String h(String... var0) {
      Object var4 = null;
      String var3 = (String)var4;
      if (var0 != null) {
         if (var0.length == 0) {
            var3 = (String)var4;
         } else {
            ArrayList var8 = new ArrayList();
            int var2 = var0.length;

            for(int var1 = 0; var1 < var2; ++var1) {
               String var5 = var0[var1];
               if (var5 != null) {
                  var8.add(var5.replace("-", "").toLowerCase(Locale.US));
               }
            }

            Collections.sort(var8);
            StringBuilder var6 = new StringBuilder();
            Iterator var9 = var8.iterator();

            while(var9.hasNext()) {
               var6.append((String)var9.next());
            }

            String var7 = var6.toString();
            var3 = (String)var4;
            if (var7.length() > 0) {
               var3 = z(var7);
            }
         }
      }

      return var3;
   }

   public static String i(File param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static ActivityManager.RunningAppProcessInfo j(String var0, Context var1) {
      List var4 = ((ActivityManager)var1.getSystemService("activity")).getRunningAppProcesses();
      ActivityManager.RunningAppProcessInfo var3;
      if (var4 != null) {
         Iterator var2 = var4.iterator();

         while(var2.hasNext()) {
            ActivityManager.RunningAppProcessInfo var5 = (ActivityManager.RunningAppProcessInfo)var2.next();
            if (var5.processName.equals(var0)) {
               var3 = var5;
               return var3;
            }
         }
      }

      var3 = null;
      return var3;
   }

   public static boolean k(Context var0, String var1, boolean var2) {
      if (var0 != null) {
         Resources var4 = var0.getResources();
         if (var4 != null) {
            int var3 = q(var0, var1, "bool");
            if (var3 > 0) {
               return var4.getBoolean(var3);
            }

            var3 = q(var0, var1, "string");
            if (var3 > 0) {
               return Boolean.parseBoolean(var0.getString(var3));
            }
         }
      }

      return var2;
   }

   public static int l() {
      return g.a.d().ordinal();
   }

   public static int m(Context var0) {
      int var2 = x(var0);
      int var1 = var2;
      if (y(var0)) {
         var1 = var2 | 2;
      }

      var2 = var1;
      if (w()) {
         var2 = var1 | 4;
      }

      return var2;
   }

   public static String n(Context var0) {
      int var2 = q(var0, "com.google.firebase.crashlytics.mapping_file_id", "string");
      int var1 = var2;
      if (var2 == 0) {
         var1 = q(var0, "com.crashlytics.android.build_id", "string");
      }

      String var3;
      if (var1 != 0) {
         var3 = var0.getResources().getString(var1);
      } else {
         var3 = null;
      }

      return var3;
   }

   public static boolean o(Context var0) {
      boolean var2 = x(var0);
      boolean var1 = false;
      if (var2) {
         return false;
      } else {
         if (((SensorManager)var0.getSystemService("sensor")).getDefaultSensor(8) != null) {
            var1 = true;
         }

         return var1;
      }
   }

   public static String p(Context var0) {
      int var1 = var0.getApplicationContext().getApplicationInfo().icon;
      String var2;
      if (var1 > 0) {
         label29: {
            boolean var10001;
            String var3;
            try {
               var3 = var0.getResources().getResourcePackageName(var1);
            } catch (Resources.NotFoundException var5) {
               var10001 = false;
               break label29;
            }

            var2 = var3;

            try {
               if ("android".equals(var3)) {
                  var2 = var0.getPackageName();
               }

               return var2;
            } catch (Resources.NotFoundException var4) {
               var10001 = false;
            }
         }

         var2 = var0.getPackageName();
      } else {
         var2 = var0.getPackageName();
      }

      return var2;
   }

   public static int q(Context var0, String var1, String var2) {
      return var0.getResources().getIdentifier(var1, var2, p(var0));
   }

   public static SharedPreferences r(Context var0) {
      return var0.getSharedPreferences("com.google.firebase.crashlytics", 0);
   }

   public static long s() {
      // $FF: Couldn't be decompiled
   }

   private static String t(String var0, String var1) {
      return u(var0.getBytes(), var1);
   }

   private static String u(byte[] var0, String var1) {
      MessageDigest var5;
      try {
         var5 = MessageDigest.getInstance(var1);
      } catch (NoSuchAlgorithmException var4) {
         y3.f var2 = y3.f.f();
         StringBuilder var3 = new StringBuilder();
         var3.append("Could not create hashing algorithm: ");
         var3.append(var1);
         var3.append(", returning empty string.");
         var2.e(var3.toString(), var4);
         return "";
      }

      var5.update(var0);
      return v(var5.digest());
   }

   public static String v(byte[] var0) {
      char[] var4 = new char[var0.length * 2];

      for(int var1 = 0; var1 < var0.length; ++var1) {
         int var2 = var0[var1] & 255;
         int var3 = var1 * 2;
         char[] var5 = a;
         var4[var3] = var5[var2 >>> 4];
         var4[var3 + 1] = var5[var2 & 15];
      }

      return new String(var4);
   }

   public static boolean w() {
      boolean var0;
      if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean x(Context var0) {
      String var2 = Secure.getString(var0.getContentResolver(), "android_id");
      boolean var1;
      if (!Build.PRODUCT.contains("sdk")) {
         String var3 = Build.HARDWARE;
         if (!var3.contains("goldfish") && !var3.contains("ranchu") && var2 != null) {
            var1 = false;
            return var1;
         }
      }

      var1 = true;
      return var1;
   }

   public static boolean y(Context var0) {
      boolean var1 = x(var0);
      String var2 = Build.TAGS;
      if (!var1 && var2 != null && var2.contains("test-keys")) {
         return true;
      } else if ((new File("/system/app/Superuser.apk")).exists()) {
         return true;
      } else {
         File var3 = new File("/system/xbin/su");
         return !var1 && var3.exists();
      }
   }

   public static String z(String var0) {
      return t(var0, "SHA-1");
   }

   static enum a {
      m,
      n,
      o,
      p,
      q,
      r,
      s,
      t,
      u,
      v;

      private static final Map w;
      private static final a[] x;

      static {
         a var3 = new a("X86_32", 0);
         m = var3;
         a var9 = new a("X86_64", 1);
         n = var9;
         a var7 = new a("ARM_UNKNOWN", 2);
         o = var7;
         a var6 = new a("PPC", 3);
         p = var6;
         a var4 = new a("PPC64", 4);
         q = var4;
         a var1 = new a("ARMV6", 5);
         r = var1;
         a var2 = new a("ARMV7", 6);
         s = var2;
         a var5 = new a("UNKNOWN", 7);
         t = var5;
         a var8 = new a("ARMV7S", 8);
         u = var8;
         a var0 = new a("ARM64", 9);
         v = var0;
         x = new a[]{var3, var9, var7, var6, var4, var1, var2, var5, var8, var0};
         HashMap var10 = new HashMap(4);
         w = var10;
         var10.put("armeabi-v7a", var2);
         var10.put("armeabi", var1);
         var10.put("arm64-v8a", var0);
         var10.put("x86", var3);
      }

      static a d() {
         String var0 = Build.CPU_ABI;
         if (TextUtils.isEmpty(var0)) {
            y3.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return t;
         } else {
            var0 = var0.toLowerCase(Locale.US);
            a var1 = (a)w.get(var0);
            a var2 = var1;
            if (var1 == null) {
               var2 = t;
            }

            return var2;
         }
      }
   }
}
