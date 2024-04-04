package b4;

import java.util.concurrent.atomic.AtomicInteger;

public final class a0 {
   private final AtomicInteger a = new AtomicInteger();
   private final AtomicInteger b = new AtomicInteger();

   public void a() {
      this.b.getAndIncrement();
   }

   public void b() {
      this.a.getAndIncrement();
   }

   public void c() {
      this.b.set(0);
   }
}
