package i2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public class o {
   private static final int a = Process.myUid();
   private static final Method b;
   private static final Method c;
   private static final Method d;
   private static final Method e;
   private static final Method f;
   private static final Method g;
   private static final Method h;
   private static final Method i;

   static {
      Method var1 = null;
      Object var2 = null;

      Method var0;
      try {
         var0 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
      } catch (Exception var5) {
         var0 = null;
      }

      label99: {
         b = var0;
         if (k.c()) {
            try {
               var0 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
               break label99;
            } catch (Exception var11) {
            }
         }

         var0 = null;
      }

      c = var0;

      try {
         var0 = WorkSource.class.getMethod("size", new Class[0]);
      } catch (Exception var4) {
         var0 = null;
      }

      d = var0;

      try {
         var0 = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
      } catch (Exception var3) {
         var0 = null;
      }

      label92: {
         e = var0;
         if (k.c()) {
            try {
               var0 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
               break label92;
            } catch (Exception var10) {
            }
         }

         var0 = null;
      }

      label86: {
         f = var0;
         if (k.i()) {
            try {
               var0 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
               break label86;
            } catch (Exception var9) {
               Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", var9);
            }
         }

         var0 = null;
      }

      label80: {
         g = var0;
         if (k.i()) {
            try {
               var0 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
               break label80;
            } catch (Exception var8) {
               Log.w("WorkSourceUtil", "Missing WorkChain class", var8);
            }
         }

         var0 = null;
      }

      h = var0;
      var0 = (Method)var2;
      if (k.i()) {
         label106: {
            var0 = var1;

            boolean var10001;
            try {
               var1 = WorkSource.class.getMethod("isEmpty", new Class[0]);
            } catch (Exception var7) {
               var10001 = false;
               break label106;
            }

            var0 = var1;

            try {
               var1.setAccessible(true);
            } catch (Exception var6) {
               var10001 = false;
               break label106;
            }

            var0 = var1;
         }
      }

      i = var0;
   }

   public static void a(WorkSource var0, int var1, String var2) {
      Method var4 = c;
      if (var4 != null) {
         String var3 = var2;
         if (var2 == null) {
            var3 = "";
         }

         try {
            var4.invoke(var0, new Object[]{var1, var3});
         } catch (Exception var5) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", var5);
         }
      } else {
         Method var7 = b;
         if (var7 != null) {
            try {
               var7.invoke(var0, new Object[]{var1});
               return;
            } catch (Exception var6) {
               Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", var6);
            }
         }

      }
   }

   public static WorkSource b(Context var0, String var1) {
      if (var0 != null && var0.getPackageManager() != null && var1 != null) {
         String var4;
         ApplicationInfo var5;
         try {
            var5 = k2.c.a(var0).c(var1, 0);
         } catch (PackageManager.NameNotFoundException var3) {
            if (var1.length() != 0) {
               var4 = "Could not find package: ".concat(var1);
            } else {
               var4 = new String("Could not find package: ");
            }

            Log.e("WorkSourceUtil", var4);
            return null;
         }

         if (var5 == null) {
            if (var1.length() != 0) {
               var4 = "Could not get applicationInfo from package: ".concat(var1);
            } else {
               var4 = new String("Could not get applicationInfo from package: ");
            }

            Log.e("WorkSourceUtil", var4);
            return null;
         } else {
            int var2 = var5.uid;
            WorkSource var6 = new WorkSource();
            a(var6, var2, var1);
            return var6;
         }
      } else {
         return null;
      }
   }

   public static boolean c(Context var0) {
      if (var0 == null) {
         return false;
      } else if (var0.getPackageManager() == null) {
         return false;
      } else {
         return k2.c.a(var0).b("android.permission.UPDATE_DEVICE_STATS", var0.getPackageName()) == 0;
      }
   }
}
