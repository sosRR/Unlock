package b4;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class q0 {
   private static final ExecutorService a = t.c("awaitEvenIfOnMainThread task continuation executor");

   // $FF: synthetic method
   public static Void a(y2.h var0, y2.g var1) {
      return h(var0, var1);
   }

   // $FF: synthetic method
   public static Void b(y2.h var0, y2.g var1) {
      return g(var0, var1);
   }

   // $FF: synthetic method
   public static Object c(CountDownLatch var0, y2.g var1) {
      return f(var0, var1);
   }

   public static Object d(y2.g var0) {
      CountDownLatch var1 = new CountDownLatch(1);
      var0.g(a, new n0(var1));
      var1.await(4L, TimeUnit.SECONDS);
      if (var0.o()) {
         return var0.k();
      } else if (!var0.m()) {
         if (var0.n()) {
            throw new IllegalStateException(var0.j());
         } else {
            throw new TimeoutException();
         }
      } else {
         throw new CancellationException("Task is already canceled");
      }
   }

   public static y2.g e(Executor var0, Callable var1) {
      y2.h var2 = new y2.h();
      var0.execute(new Runnable(var1, var2) {
         final Callable m;
         final y2.h n;

         {
            this.m = var1;
            this.n = var2;
         }

         public void run() {
            try {
               y2.g var2 = (y2.g)this.m.call();
               q0$a$a var1 = new q0$a$a(this);
               var2.h(var1);
            } catch (Exception var3) {
               this.n.b(var3);
            }

         }
      });
      return var2.a();
   }

   // $FF: synthetic method
   private static Object f(CountDownLatch var0, y2.g var1) {
      var0.countDown();
      return null;
   }

   // $FF: synthetic method
   private static Void g(y2.h var0, y2.g var1) {
      if (var1.o()) {
         var0.e(var1.k());
      } else {
         Exception var2 = var1.j();
         Objects.requireNonNull(var2);
         var0.d(var2);
      }

      return null;
   }

   // $FF: synthetic method
   private static Void h(y2.h var0, y2.g var1) {
      if (var1.o()) {
         var0.e(var1.k());
      } else {
         Exception var2 = var1.j();
         Objects.requireNonNull(var2);
         var0.d(var2);
      }

      return null;
   }

   public static y2.g i(Executor var0, y2.g var1, y2.g var2) {
      y2.h var3 = new y2.h();
      o0 var4 = new o0(var3);
      var1.g(var0, var4);
      var2.g(var0, var4);
      return var3.a();
   }

   public static y2.g j(y2.g var0, y2.g var1) {
      y2.h var3 = new y2.h();
      p0 var2 = new p0(var3);
      var0.h(var2);
      var1.h(var2);
      return var3.a();
   }
}
