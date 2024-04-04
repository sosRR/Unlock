package y2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class j {
   public static Object a(g var0) {
      e2.n.g();
      e2.n.j(var0, "Task must not be null");
      if (var0.n()) {
         return h(var0);
      } else {
         l var1 = new l((k)null);
         i(var0, var1);
         var1.c();
         return h(var0);
      }
   }

   public static Object b(g var0, long var1, TimeUnit var3) {
      e2.n.g();
      e2.n.j(var0, "Task must not be null");
      e2.n.j(var3, "TimeUnit must not be null");
      if (var0.n()) {
         return h(var0);
      } else {
         l var4 = new l((k)null);
         i(var0, var4);
         if (var4.e(var1, var3)) {
            return h(var0);
         } else {
            throw new TimeoutException("Timed out waiting for Task");
         }
      }
   }

   @Deprecated
   public static g c(Executor var0, Callable var1) {
      e2.n.j(var0, "Executor must not be null");
      e2.n.j(var1, "Callback must not be null");
      g0 var2 = new g0();
      var0.execute(new h0(var2, var1));
      return var2;
   }

   public static g d(Exception var0) {
      g0 var1 = new g0();
      var1.r(var0);
      return var1;
   }

   public static g e(Object var0) {
      g0 var1 = new g0();
      var1.s(var0);
      return var1;
   }

   public static g f(Collection var0) {
      if (var0 != null && !var0.isEmpty()) {
         Iterator var1 = var0.iterator();

         while(var1.hasNext()) {
            if ((g)var1.next() == null) {
               throw new NullPointerException("null tasks are not accepted");
            }
         }

         g0 var2 = new g0();
         n var4 = new n(var0.size(), var2);
         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            i((g)var3.next(), var4);
         }

         return var2;
      } else {
         return e((Object)null);
      }
   }

   public static g g(g... var0) {
      return var0 != null && var0.length != 0 ? f(Arrays.asList(var0)) : e((Object)null);
   }

   private static Object h(g var0) {
      if (var0.o()) {
         return var0.k();
      } else if (var0.m()) {
         throw new CancellationException("Task is already canceled");
      } else {
         throw new ExecutionException(var0.j());
      }
   }

   private static void i(g var0, m var1) {
      Executor var2 = i.b;
      var0.f(var2, var1);
      var0.d(var2, var1);
      var0.a(var2, var1);
   }
}
