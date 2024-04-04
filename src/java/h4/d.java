package h4;

import b4.a0;
import b4.o;
import i1.f;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y2.h;

final class d {
   private final double a;
   private final double b;
   private final long c;
   private final int d;
   private final BlockingQueue e;
   private final ThreadPoolExecutor f;
   private final f g;
   private final a0 h;
   private int i;
   private long j;

   d(double var1, double var3, long var5, f var7, a0 var8) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.g = var7;
      this.h = var8;
      int var9 = (int)var1;
      this.d = var9;
      ArrayBlockingQueue var10 = new ArrayBlockingQueue(var9);
      this.e = var10;
      this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, var10);
      this.i = 0;
      this.j = 0L;
   }

   d(f var1, i4.d var2, a0 var3) {
      this(var2.f, var2.g, (long)var2.h * 1000L, var1, var3);
   }

   // $FF: synthetic method
   public static void a(h var0, o var1, Exception var2) {
      k(var0, var1, var2);
   }

   private double f() {
      return Math.min(3600000.0, 60000.0 / this.a * Math.pow(this.b, (double)this.g()));
   }

   private int g() {
      if (this.j == 0L) {
         this.j = this.l();
      }

      int var1 = (int)((this.l() - this.j) / this.c);
      if (this.j()) {
         var1 = Math.min(100, this.i + var1);
      } else {
         var1 = Math.max(0, this.i - var1);
      }

      if (this.i != var1) {
         this.i = var1;
         this.j = this.l();
      }

      return var1;
   }

   private boolean i() {
      boolean var1;
      if (this.e.size() < this.d) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean j() {
      boolean var1;
      if (this.e.size() == this.d) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   private static void k(h var0, o var1, Exception var2) {
      if (var2 != null) {
         var0.d(var2);
      } else {
         var0.e(var1);
      }
   }

   private long l() {
      return System.currentTimeMillis();
   }

   private void m(o var1, h var2) {
      y3.f var3 = y3.f.f();
      StringBuilder var4 = new StringBuilder();
      var4.append("Sending report through Google DataTransport: ");
      var4.append(var1.d());
      var3.b(var4.toString());
      this.g.b(i1.c.e(var1.b()), new c(var2, var1));
   }

   private static void n(double var0) {
      long var2 = (long)var0;

      try {
         Thread.sleep(var2);
      } catch (InterruptedException var5) {
      }

   }

   h h(o var1, boolean var2) {
      BlockingQueue var3 = this.e;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label267: {
         h var4;
         try {
            var4 = new h();
         } catch (Throwable var36) {
            var10000 = var36;
            var10001 = false;
            break label267;
         }

         if (!var2) {
            label252:
            try {
               this.m(var1, var4);
               return var4;
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break label252;
            }
         } else {
            label268: {
               y3.f var5;
               StringBuilder var6;
               try {
                  this.h.b();
                  if (this.i()) {
                     var5 = y3.f.f();
                     var6 = new StringBuilder();
                     var6.append("Enqueueing report: ");
                     var6.append(var1.d());
                     var5.b(var6.toString());
                     var5 = y3.f.f();
                     var6 = new StringBuilder();
                     var6.append("Queue size: ");
                     var6.append(this.e.size());
                     var5.b(var6.toString());
                     ThreadPoolExecutor var41 = this.f;
                     b var39 = new b(this, var1, var4);
                     var41.execute(var39);
                     y3.f var42 = y3.f.f();
                     StringBuilder var40 = new StringBuilder();
                     var40.append("Closing task for report: ");
                     var40.append(var1.d());
                     var42.b(var40.toString());
                     var4.e(var1);
                     return var4;
                  }
               } catch (Throwable var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label268;
               }

               label250:
               try {
                  this.g();
                  var5 = y3.f.f();
                  var6 = new StringBuilder();
                  var6.append("Dropping report due to queue being full: ");
                  var6.append(var1.d());
                  var5.b(var6.toString());
                  this.h.a();
                  var4.e(var1);
                  return var4;
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label250;
               }
            }
         }
      }

      while(true) {
         Throwable var38 = var10000;

         try {
            throw var38;
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            continue;
         }
      }
   }

   private final class b implements Runnable {
      private final o m;
      private final h n;
      final d o;

      private b(d var1, o var2, h var3) {
         this.o = var1;
         this.m = var2;
         this.n = var3;
      }

      // $FF: synthetic method
      b(d var1, o var2, h var3, Object var4) {
         this(var1, var2, var3);
      }

      public void run() {
         this.o.m(this.m, this.n);
         this.o.h.c();
         double var1 = this.o.f();
         y3.f var3 = y3.f.f();
         StringBuilder var4 = new StringBuilder();
         var4.append("Delay for: ");
         var4.append(String.format(Locale.US, "%.2f", new Object[]{var1 / 1000.0}));
         var4.append(" s for report: ");
         var4.append(this.m.d());
         var3.b(var4.toString());
         h4.d.n(var1);
      }
   }
}
