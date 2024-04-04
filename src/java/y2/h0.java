package y2;

import java.util.concurrent.Callable;

final class h0 implements Runnable {
   final g0 m;
   final Callable n;

   h0(g0 var1, Callable var2) {
      this.m = var1;
      this.n = var2;
   }

   public final void run() {
      Exception var1;
      try {
         try {
            this.m.s(this.n.call());
            return;
         } catch (Exception var4) {
            var1 = var4;
         }
      } catch (Throwable var5) {
         this.m.r(new RuntimeException(var5));
         return;
      }

      this.m.r(var1);
   }
}
