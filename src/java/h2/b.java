package h2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import e2.j1;
import e2.n;
import i2.k;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import k2.c;

public class b {
   private static final Object b = new Object();
   @Nullable
   private static volatile b c;
   public ConcurrentHashMap a = new ConcurrentHashMap();

   private b() {
   }

   public static b b() {
      if (c == null) {
         label150: {
            Object var0 = b;
            synchronized(var0){}

            Throwable var10000;
            boolean var10001;
            label144: {
               try {
                  if (c == null) {
                     b var1 = new b();
                     c = var1;
                  }
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label144;
               }

               label141:
               try {
                  break label150;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label141;
               }
            }

            while(true) {
               Throwable var16 = var10000;

               try {
                  throw var16;
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      b var15 = c;
      n.i(var15);
      return var15;
   }

   private static void e(Context var0, ServiceConnection var1) {
      try {
         var0.unbindService(var1);
      } catch (IllegalStateException | NoSuchElementException | IllegalArgumentException var2) {
      }

   }

   private final boolean f(Context var1, String var2, Intent var3, ServiceConnection var4, int var5, boolean var6, @Nullable Executor var7) {
      ComponentName var9 = var3.getComponent();
      if (var9 != null) {
         label80: {
            String var15 = var9.getPackageName();
            "com.google.android.gms".equals(var15);

            int var8;
            try {
               var8 = k2.c.a(var1).c(var15, 0).flags;
            } catch (PackageManager.NameNotFoundException var14) {
               break label80;
            }

            if ((var8 & 2097152) != 0) {
               Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
               return false;
            }
         }
      }

      if (g(var4)) {
         ServiceConnection var16 = (ServiceConnection)this.a.putIfAbsent(var4, var4);
         if (var16 != null && var4 != var16) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{var4, var2, var3.getAction()}));
         }

         boolean var12 = false;

         try {
            var12 = true;
            var6 = h(var1, var3, var4, var5, var7);
            var12 = false;
         } finally {
            if (var12) {
               this.a.remove(var4, var4);
            }
         }

         if (!var6) {
            this.a.remove(var4, var4);
            return false;
         }
      } else {
         var6 = h(var1, var3, var4, var5, var7);
      }

      return var6;
   }

   private static boolean g(ServiceConnection var0) {
      return !(var0 instanceof j1);
   }

   private static final boolean h(Context var0, Intent var1, ServiceConnection var2, int var3, @Nullable Executor var4) {
      return k.j() && var4 != null ? h2.a.a(var0, var1, var3, var4, var2) : var0.bindService(var1, var2, var3);
   }

   public boolean a(Context var1, Intent var2, ServiceConnection var3, int var4) {
      return this.f(var1, var1.getClass().getName(), var2, var3, var4, true, (Executor)null);
   }

   public void c(Context var1, ServiceConnection var2) {
      if (g(var2) && this.a.containsKey(var2)) {
         try {
            e(var1, (ServiceConnection)this.a.get(var2));
         } finally {
            this.a.remove(var2);
         }

      } else {
         e(var1, var2);
      }
   }

   public final boolean d(Context var1, String var2, Intent var3, ServiceConnection var4, int var5, @Nullable Executor var6) {
      return this.f(var1, var2, var3, var4, var5, true, var6);
   }
}
