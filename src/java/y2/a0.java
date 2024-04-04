package y2;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class a0 implements Runnable {
   final g m;
   final b0 n;

   a0(b0 var1, g var2) {
      this.n = var1;
      this.m = var2;
   }

   public final void run() {
      g var1;
      try {
         var1 = b0.e(this.n).a(this.m.k());
      } catch (RuntimeExecutionException var3) {
         if (var3.getCause() instanceof Exception) {
            this.n.d((Exception)var3.getCause());
            return;
         }

         this.n.d(var3);
         return;
      } catch (CancellationException var4) {
         this.n.a();
         return;
      } catch (Exception var5) {
         this.n.d(var5);
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
