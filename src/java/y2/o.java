package y2;

import com.google.android.gms.tasks.RuntimeExecutionException;

final class o implements Runnable {
   final g m;
   final p n;

   o(p var1, g var2) {
      this.n = var1;
      this.m = var2;
   }

   public final void run() {
      if (this.m.m()) {
         p.b(this.n).t();
      } else {
         Object var1;
         try {
            var1 = p.a(this.n).a(this.m);
         } catch (RuntimeExecutionException var2) {
            if (var2.getCause() instanceof Exception) {
               p.b(this.n).r((Exception)var2.getCause());
               return;
            }

            p.b(this.n).r(var2);
            return;
         } catch (Exception var3) {
            p.b(this.n).r(var3);
            return;
         }

         p.b(this.n).s(var1);
      }
   }
}
