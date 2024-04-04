package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class r0 extends u0 {
   private static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_invoked");
   private volatile int _invoked;
   private final w5.l q;

   public r0(w5.l var1) {
      this.q = var1;
      this._invoked = 0;
   }

   public void s(Throwable var1) {
      if (r.compareAndSet(this, 0, 1)) {
         this.q.c(var1);
      }

   }
}
