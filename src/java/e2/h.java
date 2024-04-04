package e2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

public abstract class h {
   private static int a;
   private static final Object b = new Object();
   private static i1 c;
   static HandlerThread d;
   private static boolean e;

   public static int a() {
      return a;
   }

   public static h b(Context var0) {
      Object var1 = b;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label300: {
         label307: {
            i1 var2;
            Context var3;
            Looper var35;
            label297: {
               try {
                  if (c != null) {
                     break label307;
                  }

                  var2 = new i1;
                  var3 = var0.getApplicationContext();
                  if (e) {
                     var35 = c().getLooper();
                     break label297;
                  }
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label300;
               }

               try {
                  var35 = var0.getMainLooper();
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label300;
               }
            }

            try {
               var2.<init>(var3, var35);
               c = var2;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label300;
            }
         }

         label284:
         try {
            return c;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label284;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   public static HandlerThread c() {
      Object var0 = b;
      synchronized(var0){}

      Throwable var10000;
      boolean var10001;
      label164: {
         HandlerThread var1;
         try {
            var1 = d;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label164;
         }

         if (var1 != null) {
            label158:
            try {
               return var1;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label158;
            }
         } else {
            label160:
            try {
               var1 = new HandlerThread("GoogleApiHandler", 9);
               d = var1;
               var1.start();
               var1 = d;
               return var1;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label160;
            }
         }
      }

      while(true) {
         Throwable var23 = var10000;

         try {
            throw var23;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   protected abstract void d(e1 var1, ServiceConnection var2, String var3);

   public final void e(String var1, String var2, int var3, ServiceConnection var4, String var5, boolean var6) {
      this.d(new e1(var1, var2, var3, var6), var4, var5);
   }

   protected abstract boolean f(e1 var1, ServiceConnection var2, String var3, Executor var4);
}
