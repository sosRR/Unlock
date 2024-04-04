package g1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class q {
   private static final String f = x0.k.f("WorkTimer");
   private final ThreadFactory a;
   private final ScheduledExecutorService b;
   final Map c;
   final Map d;
   final Object e;

   public q() {
      ThreadFactory var1 = new ThreadFactory(this) {
         private int a;
         final q b;

         {
            this.b = var1;
            this.a = 0;
         }

         public Thread newThread(Runnable var1) {
            Thread var2 = Executors.defaultThreadFactory().newThread(var1);
            StringBuilder var3 = new StringBuilder();
            var3.append("WorkManager-WorkTimer-thread-");
            var3.append(this.a);
            var2.setName(var3.toString());
            ++this.a;
            return var2;
         }
      };
      this.a = var1;
      this.c = new HashMap();
      this.d = new HashMap();
      this.e = new Object();
      this.b = Executors.newSingleThreadScheduledExecutor(var1);
   }

   public void a() {
      if (!this.b.isShutdown()) {
         this.b.shutdownNow();
      }

   }

   public void b(String param1, long param2, b param4) {
      // $FF: Couldn't be decompiled
   }

   public void c(String var1) {
      Object var2 = this.e;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if ((c)this.c.remove(var1) != null) {
               x0.k.c().a(f, String.format("Stopping timer for %s", new Object[]{var1}));
               this.d.remove(var1);
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public interface b {
      void b(String var1);
   }

   public static class c implements Runnable {
      private final q m;
      private final String n;

      c(q var1, String var2) {
         this.m = var1;
         this.n = var2;
      }

      public void run() {
         Object var1 = this.m.e;
         synchronized(var1){}

         Throwable var10000;
         boolean var10001;
         label263: {
            label262: {
               label261: {
                  b var2;
                  try {
                     if ((c)this.m.c.remove(this.n) == null) {
                        break label261;
                     }

                     var2 = (b)this.m.d.remove(this.n);
                  } catch (Throwable var33) {
                     var10000 = var33;
                     var10001 = false;
                     break label263;
                  }

                  if (var2 != null) {
                     try {
                        var2.b(this.n);
                     } catch (Throwable var32) {
                        var10000 = var32;
                        var10001 = false;
                        break label263;
                     }
                  }
                  break label262;
               }

               try {
                  x0.k.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.n}));
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label263;
               }
            }

            label250:
            try {
               return;
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label250;
            }
         }

         while(true) {
            Throwable var34 = var10000;

            try {
               throw var34;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
