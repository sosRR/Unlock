package b4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class t {
   private static void a(String var0, ExecutorService var1) {
      b(var0, var1, 2L, TimeUnit.SECONDS);
   }

   private static void b(String var0, ExecutorService var1, long var2, TimeUnit var4) {
      Runtime var5 = Runtime.getRuntime();
      t$b var6 = new t$b(var0, var1, var2, var4);
      StringBuilder var7 = new StringBuilder();
      var7.append("Crashlytics Shutdown Hook for ");
      var7.append(var0);
      var5.addShutdownHook(new Thread(var6, var7.toString()));
   }

   public static ExecutorService c(String var0) {
      ExecutorService var1 = e(d(var0), new ThreadPoolExecutor.DiscardPolicy());
      a(var0, var1);
      return var1;
   }

   public static ThreadFactory d(String var0) {
      return new ThreadFactory(var0, new AtomicLong(1L)) {
         final String a;
         final AtomicLong b;

         {
            this.a = var1;
            this.b = var2;
         }

         public Thread newThread(Runnable var1) {
            Thread var2 = Executors.defaultThreadFactory().newThread(new t$a$a(this, var1));
            StringBuilder var3 = new StringBuilder();
            var3.append(this.a);
            var3.append(this.b.getAndIncrement());
            var2.setName(var3.toString());
            return var2;
         }
      };
   }

   private static ExecutorService e(ThreadFactory var0, RejectedExecutionHandler var1) {
      return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), var0, var1));
   }
}
