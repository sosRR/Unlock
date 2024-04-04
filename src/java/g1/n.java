package g1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;

public class n implements Runnable {
   static final String s = x0.k.f("WorkForegroundRunnable");
   final androidx.work.impl.utils.futures.d m = androidx.work.impl.utils.futures.d.t();
   final Context n;
   final f1.p o;
   final ListenableWorker p;
   final x0.g q;
   final h1.a r;

   @SuppressLint({"LambdaLast"})
   public n(Context var1, f1.p var2, ListenableWorker var3, x0.g var4, h1.a var5) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      this.r = var5;
   }

   public u3.a a() {
      return this.m;
   }

   @SuppressLint({"UnsafeExperimentalUsageError"})
   public void run() {
      if (this.o.q && !androidx.core.os.a.c()) {
         androidx.work.impl.utils.futures.d var1 = androidx.work.impl.utils.futures.d.t();
         this.r.a().execute(new Runnable(this, var1) {
            final androidx.work.impl.utils.futures.d m;
            final n n;

            {
               this.n = var1;
               this.m = var2;
            }

            public void run() {
               this.m.r(this.n.p.e());
            }
         });
         var1.d(new Runnable(this, var1) {
            final androidx.work.impl.utils.futures.d m;
            final n n;

            {
               this.n = var1;
               this.m = var2;
            }

            public void run() {
               Throwable var10000;
               label95: {
                  boolean var10001;
                  x0.f var2;
                  try {
                     var2 = (x0.f)this.m.get();
                  } catch (Throwable var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label95;
                  }

                  if (var2 != null) {
                     label91:
                     try {
                        x0.k.c().a(g1.n.s, String.format("Updating notification for %s", new Object[]{this.n.o.c}));
                        this.n.p.m(true);
                        n var1 = this.n;
                        var1.m.r(var1.q.a(var1.n, var1.p.f(), var2));
                        return;
                     } catch (Throwable var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label91;
                     }
                  } else {
                     label88:
                     try {
                        String var16 = String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{this.n.o.c});
                        IllegalStateException var17 = new IllegalStateException(var16);
                        throw var17;
                     } catch (Throwable var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label88;
                     }
                  }
               }

               Throwable var15 = var10000;
               this.n.m.q(var15);
            }
         }, this.r.a());
      } else {
         this.m.p((Object)null);
      }
   }
}
