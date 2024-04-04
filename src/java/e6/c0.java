package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class c0 extends kotlinx.coroutines.internal.v {
   private static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_decision");
   private volatile int _decision;

   private final boolean m0() {
      do {
         int var1 = this._decision;
         if (var1 != 0) {
            if (var1 == 1) {
               return false;
            }

            throw new IllegalStateException("Already resumed".toString());
         }
      } while(!p.compareAndSet(this, 0, 2));

      return true;
   }

   protected void j0(Object var1) {
      if (!this.m0()) {
         kotlinx.coroutines.internal.e.c(p5.b.a(super.o), q.a(var1, super.o), (w5.l)null, 2, (Object)null);
      }
   }

   protected void m(Object var1) {
      this.j0(var1);
   }
}
