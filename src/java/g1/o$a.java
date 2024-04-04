package g1;

import android.content.Context;
import android.content.Intent;
import java.util.UUID;
import x0.u;

class o$a implements Runnable {
   final androidx.work.impl.utils.futures.d m;
   final UUID n;
   final x0.f o;
   final Context p;
   final o q;

   o$a(o var1, androidx.work.impl.utils.futures.d var2, UUID var3, x0.f var4, Context var5) {
      this.q = var1;
      this.m = var2;
      this.n = var3;
      this.o = var4;
      this.p = var5;
   }

   public void run() {
      Throwable var10000;
      label203: {
         boolean var10001;
         label202: {
            label206: {
               u.a var1;
               String var2;
               try {
                  if (this.m.isCancelled()) {
                     break label206;
                  }

                  var2 = this.n.toString();
                  var1 = this.q.c.j(var2);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label203;
               }

               if (var1 == null) {
                  break label202;
               }

               try {
                  if (var1.d()) {
                     break label202;
                  }

                  this.q.b.c(var2, this.o);
                  Intent var23 = androidx.work.impl.foreground.a.b(this.p, var2, this.o);
                  this.p.startService(var23);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label203;
               }
            }

            try {
               this.m.p((Object)null);
               return;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label203;
            }
         }

         label185:
         try {
            IllegalStateException var24 = new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            throw var24;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label185;
         }
      }

      Throwable var25 = var10000;
      this.m.q(var25);
   }
}
