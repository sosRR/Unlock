package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends n {
   private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed");
   private volatile int _resumed;

   public final boolean c() {
      return c.compareAndSet(this, 0, 1);
   }
}
