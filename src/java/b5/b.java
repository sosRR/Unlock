package b5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {
   private static final a a;
   private static volatile a b;

   static {
      b var0 = new b();
      a = var0;
      b = var0;
   }

   public static a a() {
      return b;
   }

   private static class b implements a {
      private b() {
      }

      // $FF: synthetic method
      b(Object var1) {
         this();
      }

      public ExecutorService a(ThreadFactory var1, c var2) {
         return this.b(1, var1, var2);
      }

      public ExecutorService b(int var1, ThreadFactory var2, c var3) {
         ThreadPoolExecutor var4 = new ThreadPoolExecutor(var1, var1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), var2);
         var4.allowCoreThreadTimeOut(true);
         return Executors.unconfigurableExecutorService(var4);
      }
   }
}
