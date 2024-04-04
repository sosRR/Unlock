package b4;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class t$b extends c {
   final String m;
   final ExecutorService n;
   final long o;
   final TimeUnit p;

   t$b(String var1, ExecutorService var2, long var3, TimeUnit var5) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var5;
   }

   public void a() {
      try {
         y3.f var1 = y3.f.f();
         StringBuilder var2 = new StringBuilder();
         var2.append("Executing shutdown hook for ");
         var2.append(this.m);
         var1.b(var2.toString());
         this.n.shutdown();
         if (!this.n.awaitTermination(this.o, this.p)) {
            y3.f var5 = y3.f.f();
            StringBuilder var4 = new StringBuilder();
            var4.append(this.m);
            var4.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
            var5.b(var4.toString());
            this.n.shutdownNow();
         }
      } catch (InterruptedException var3) {
         y3.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.m}));
         this.n.shutdownNow();
      }

   }
}
