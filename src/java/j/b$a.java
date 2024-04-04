package j;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class b$a implements ThreadFactory {
   private final AtomicInteger a;
   final b b;

   b$a(b var1) {
      this.b = var1;
      this.a = new AtomicInteger(0);
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(var1);
      var2.setName(String.format("arch_disk_io_%d", new Object[]{this.a.getAndIncrement()}));
      return var2;
   }
}
