package b4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class h {
   private final Executor a;
   private y2.g b = y2.j.e((Object)null);
   private final Object c = new Object();
   private final ThreadLocal d = new ThreadLocal();

   public h(Executor var1) {
      this.a = var1;
      var1.execute(new Runnable(this) {
         final h m;

         {
            this.m = var1;
         }

         public void run() {
            this.m.d.set(Boolean.TRUE);
         }
      });
   }

   private y2.g d(y2.g var1) {
      return var1.g(this.a, new h$c(this));
   }

   private boolean e() {
      return Boolean.TRUE.equals(this.d.get());
   }

   private y2.a f(Callable var1) {
      return new h$b(this, var1);
   }

   public void b() {
      if (!this.e()) {
         throw new IllegalStateException("Not running on background worker thread as intended.");
      }
   }

   public Executor c() {
      return this.a;
   }

   public y2.g g(Callable param1) {
      // $FF: Couldn't be decompiled
   }

   public y2.g h(Callable param1) {
      // $FF: Couldn't be decompiled
   }
}
