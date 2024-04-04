package y2;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

final class q implements Runnable {
   final g m;
   final r n;

   q(r var1, g var2) {
      this.n = var1;
      this.m = var2;
   }

   public final void run() {
      g var1;
      try {
         var1 = (g)r.e(this.n).a(this.m);
      } catch (RuntimeExecutionException var3) {
         if (var3.getCause() instanceof Exception) {
            r.f(this.n).r((Exception)var3.getCause());
            return;
         }

         r.f(this.n).r(var3);
         return;
      } catch (Exception var4) {
         r.f(this.n).r(var4);
         return;
      }

      if (var1 == null) {
         this.n.d(new NullPointerException("Continuation returned null"));
      } else {
         Executor var2 = i.b;
         var1.f(var2, this.n);
         var1.d(var2, this.n);
         var1.a(var2, this.n);
      }
   }
}
