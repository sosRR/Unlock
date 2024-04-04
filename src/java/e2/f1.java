package e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

final class f1 implements ServiceConnection, j1 {
   private final Map a;
   private int b;
   private boolean c;
   private IBinder d;
   private final e1 e;
   private ComponentName f;
   final i1 g;

   public f1(i1 var1, e1 var2) {
      this.g = var1;
      this.e = var2;
      this.a = new HashMap();
      this.b = 2;
   }

   public final int a() {
      return this.b;
   }

   public final ComponentName b() {
      return this.f;
   }

   public final IBinder c() {
      return this.d;
   }

   public final void d(ServiceConnection var1, ServiceConnection var2, String var3) {
      this.a.put(var1, var2);
   }

   public final void e(String var1, Executor var2) {
      this.b = 3;
      i1 var4 = this.g;
      boolean var3 = i1.j(var4).d(i1.h(var4), var1, this.e.c(i1.h(var4)), this, this.e.a(), var2);
      this.c = var3;
      if (var3) {
         Message var7 = i1.i(this.g).obtainMessage(1, this.e);
         i1.i(this.g).sendMessageDelayed(var7, i1.g(this.g));
      } else {
         this.b = 2;

         try {
            i1 var6 = this.g;
            i1.j(var6).c(i1.h(var6), this);
         } catch (IllegalArgumentException var5) {
         }

      }
   }

   public final void f(ServiceConnection var1, String var2) {
      this.a.remove(var1);
   }

   public final void g(String var1) {
      i1.i(this.g).removeMessages(1, this.e);
      i1 var2 = this.g;
      i1.j(var2).c(i1.h(var2), this);
      this.c = false;
      this.b = 2;
   }

   public final boolean h(ServiceConnection var1) {
      return this.a.containsKey(var1);
   }

   public final boolean i() {
      return this.a.isEmpty();
   }

   public final boolean j() {
      return this.c;
   }

   public final void onServiceConnected(ComponentName var1, IBinder var2) {
      HashMap var3 = i1.k(this.g);
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label198: {
         Iterator var4;
         try {
            i1.i(this.g).removeMessages(1, this.e);
            this.d = var2;
            this.f = var1;
            var4 = this.a.values().iterator();
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label198;
         }

         while(true) {
            try {
               if (var4.hasNext()) {
                  ((ServiceConnection)var4.next()).onServiceConnected(var1, var2);
                  continue;
               }
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break;
            }

            try {
               this.b = 1;
               return;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break;
            }
         }
      }

      while(true) {
         Throwable var26 = var10000;

         try {
            throw var26;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            continue;
         }
      }
   }

   public final void onServiceDisconnected(ComponentName var1) {
      HashMap var2 = i1.k(this.g);
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label198: {
         Iterator var3;
         try {
            i1.i(this.g).removeMessages(1, this.e);
            this.d = null;
            this.f = var1;
            var3 = this.a.values().iterator();
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label198;
         }

         while(true) {
            try {
               if (var3.hasNext()) {
                  ((ServiceConnection)var3.next()).onServiceDisconnected(var1);
                  continue;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break;
            }

            try {
               this.b = 2;
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break;
            }
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }
}
