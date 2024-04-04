package e2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class i1 extends h {
   @GuardedBy("connectionStatus")
   private final HashMap f = new HashMap();
   private final Context g;
   private volatile Handler h;
   private final h1 i;
   private final h2.b j;
   private final long k;
   private final long l;

   i1(Context var1, Looper var2) {
      h1 var3 = new h1(this, (g1)null);
      this.i = var3;
      this.g = var1.getApplicationContext();
      this.h = new q2.e(var2, var3);
      this.j = h2.b.b();
      this.k = 5000L;
      this.l = 300000L;
   }

   protected final void d(e1 var1, ServiceConnection var2, String var3) {
      n.j(var2, "ServiceConnection must not be null");
      HashMap var5 = this.f;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label368: {
         f1 var6;
         try {
            var6 = (f1)this.f.get(var1);
         } catch (Throwable var49) {
            var10000 = var49;
            var10001 = false;
            break label368;
         }

         int var4;
         StringBuilder var50;
         IllegalStateException var53;
         if (var6 != null) {
            label362: {
               label361: {
                  try {
                     if (var6.h(var2)) {
                        var6.f(var2, var3);
                        if (var6.i()) {
                           Message var51 = this.h.obtainMessage(0, var1);
                           this.h.sendMessageDelayed(var51, this.k);
                        }
                        break label361;
                     }
                  } catch (Throwable var47) {
                     var10000 = var47;
                     var10001 = false;
                     break label362;
                  }

                  try {
                     var3 = var1.toString();
                     var4 = var3.length();
                     var50 = new StringBuilder(var4 + 76);
                     var50.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                     var50.append(var3);
                     var53 = new IllegalStateException(var50.toString());
                     throw var53;
                  } catch (Throwable var46) {
                     var10000 = var46;
                     var10001 = false;
                     break label362;
                  }
               }

               label352:
               try {
                  return;
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label352;
               }
            }
         } else {
            label364:
            try {
               var3 = var1.toString();
               var4 = var3.length();
               var50 = new StringBuilder(var4 + 50);
               var50.append("Nonexistent connection status for service config: ");
               var50.append(var3);
               var53 = new IllegalStateException(var50.toString());
               throw var53;
            } catch (Throwable var48) {
               var10000 = var48;
               var10001 = false;
               break label364;
            }
         }
      }

      while(true) {
         Throwable var52 = var10000;

         try {
            throw var52;
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            continue;
         }
      }
   }

   protected final boolean f(e1 var1, ServiceConnection var2, String var3, Executor var4) {
      n.j(var2, "ServiceConnection must not be null");
      HashMap var8 = this.f;
      synchronized(var8){}

      Throwable var10000;
      boolean var10001;
      label617: {
         f1 var7;
         try {
            var7 = (f1)this.f.get(var1);
         } catch (Throwable var81) {
            var10000 = var81;
            var10001 = false;
            break label617;
         }

         int var5;
         label609: {
            f1 var82;
            if (var7 == null) {
               try {
                  var7 = new f1(this, var1);
                  var7.d(var2, var2, var3);
                  var7.e(var3, var4);
                  this.f.put(var1, var7);
               } catch (Throwable var79) {
                  var10000 = var79;
                  var10001 = false;
                  break label617;
               }

               var82 = var7;
            } else {
               try {
                  this.h.removeMessages(0, var1);
                  if (var7.h(var2)) {
                     break label609;
                  }

                  var7.d(var2, var2, var3);
                  var5 = var7.a();
               } catch (Throwable var80) {
                  var10000 = var80;
                  var10001 = false;
                  break label617;
               }

               if (var5 != 1) {
                  if (var5 != 2) {
                     var82 = var7;
                  } else {
                     try {
                        var7.e(var3, var4);
                     } catch (Throwable var78) {
                        var10000 = var78;
                        var10001 = false;
                        break label617;
                     }

                     var82 = var7;
                  }
               } else {
                  try {
                     var2.onServiceConnected(var7.b(), var7.c());
                  } catch (Throwable var77) {
                     var10000 = var77;
                     var10001 = false;
                     break label617;
                  }

                  var82 = var7;
               }
            }

            try {
               boolean var6 = var82.j();
               return var6;
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label617;
            }
         }

         label593:
         try {
            String var85 = var1.toString();
            var5 = var85.length();
            StringBuilder var86 = new StringBuilder(var5 + 81);
            var86.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
            var86.append(var85);
            IllegalStateException var83 = new IllegalStateException(var86.toString());
            throw var83;
         } catch (Throwable var76) {
            var10000 = var76;
            var10001 = false;
            break label593;
         }
      }

      while(true) {
         Throwable var84 = var10000;

         try {
            throw var84;
         } catch (Throwable var74) {
            var10000 = var74;
            var10001 = false;
            continue;
         }
      }
   }
}
