package y2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class l implements m {
   private final CountDownLatch a = new CountDownLatch(1);

   // $FF: synthetic method
   l(k var1) {
   }

   public final void a() {
      this.a.countDown();
   }

   public final void b(Object var1) {
      this.a.countDown();
   }

   public final void c() {
      this.a.await();
   }

   public final void d(Exception var1) {
      this.a.countDown();
   }

   public final boolean e(long var1, TimeUnit var3) {
      return this.a.await(var1, var3);
   }
}
