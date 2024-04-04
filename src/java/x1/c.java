package x1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class c extends Thread {
   private final WeakReference m;
   private final long n;
   final CountDownLatch o;
   boolean p;

   public c(a var1, long var2) {
      this.m = new WeakReference(var1);
      this.n = var2;
      this.o = new CountDownLatch(1);
      this.p = false;
      this.start();
   }

   private final void a() {
      a var1 = (a)this.m.get();
      if (var1 != null) {
         var1.c();
         this.p = true;
      }

   }

   public final void run() {
      try {
         if (!this.o.await(this.n, TimeUnit.MILLISECONDS)) {
            this.a();
         }

      } catch (InterruptedException var2) {
         this.a();
      }
   }
}
