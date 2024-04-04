package g1;

import androidx.work.impl.WorkDatabase;
import x0.u;

public class l implements Runnable {
   private static final String p = x0.k.f("StopWorkRunnable");
   private final y0.i m;
   private final String n;
   private final boolean o;

   public l(y0.i var1, String var2, boolean var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public void run() {
      WorkDatabase var2 = this.m.s();
      y0.d var4 = this.m.q();
      f1.q var3 = var2.D();
      var2.c();

      label203: {
         Throwable var10000;
         label202: {
            boolean var1;
            boolean var10001;
            label208: {
               try {
                  var1 = var4.h(this.n);
                  if (this.o) {
                     var1 = this.m.q().n(this.n);
                     break label208;
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label202;
               }

               if (!var1) {
                  try {
                     if (var3.j(this.n) == u.a.n) {
                        var3.h(u.a.m, this.n);
                     }
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label202;
                  }
               }

               try {
                  var1 = this.m.q().o(this.n);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label202;
               }
            }

            label189:
            try {
               x0.k.c().a(p, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.n, var1}));
               var2.t();
               break label203;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label189;
            }
         }

         Throwable var25 = var10000;
         var2.g();
         throw var25;
      }

      var2.g();
   }
}
