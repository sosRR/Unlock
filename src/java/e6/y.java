package e6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class y extends j0 implements Runnable {
   private static volatile Thread _thread;
   private static volatile int debugStatus;
   public static final y s;
   private static final long t;

   static {
      y var0 = new y();
      s = var0;
      i0.V(var0, false, 1, (Object)null);
      TimeUnit var1 = TimeUnit.MILLISECONDS;

      Long var3;
      try {
         var3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
      } catch (SecurityException var2) {
         var3 = 1000L;
      }

      t = var1.toNanos(var3);
   }

   private y() {
   }

   private final void q0() {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.t0();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         if (!var1) {
            return;
         }

         try {
            debugStatus = 3;
            this.l0();
            this.notifyAll();
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         return;
      }

      Throwable var2 = var10000;
      throw var2;
   }

   private final Thread r0() {
      synchronized(this){}

      Throwable var10000;
      label75: {
         boolean var10001;
         Thread var2;
         try {
            var2 = _thread;
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label75;
         }

         Thread var1 = var2;
         if (var2 != null) {
            return var1;
         }

         label66:
         try {
            var1 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = var1;
            var1.setDaemon(true);
            var1.start();
            return var1;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label66;
         }
      }

      Throwable var10 = var10000;
      throw var10;
   }

   private final boolean s0() {
      boolean var1;
      if (debugStatus == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private final boolean t0() {
      int var1 = debugStatus;
      boolean var2;
      if (var1 != 2 && var1 != 3) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   private final boolean u0() {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var1;
         boolean var10001;
         try {
            var1 = this.t0();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         if (var1) {
            return false;
         }

         try {
            debugStatus = 1;
            this.notifyAll();
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         return true;
      }

      Throwable var2 = var10000;
      throw var2;
   }

   private final void v0() {
      throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
   }

   protected Thread Z() {
      Thread var2 = _thread;
      Thread var1 = var2;
      if (var2 == null) {
         var1 = this.r0();
      }

      return var1;
   }

   protected void a0(long var1, j0.a var3) {
      this.v0();
   }

   public void f0(Runnable var1) {
      if (this.s0()) {
         this.v0();
      }

      super.f0(var1);
   }

   public void run() {
      g1.a.c(this);
      e6.c.a();

      Throwable var10000;
      label679: {
         boolean var9;
         boolean var10001;
         try {
            var9 = this.u0();
         } catch (Throwable var66) {
            var10000 = var66;
            var10001 = false;
            break label679;
         }

         if (!var9) {
            _thread = null;
            this.q0();
            e6.c.a();
            if (!this.i0()) {
               this.Z();
            }

            return;
         }

         long var3 = Long.MAX_VALUE;

         while(true) {
            long var5;
            try {
               Thread.interrupted();
               var5 = this.j0();
            } catch (Throwable var65) {
               var10000 = var65;
               var10001 = false;
               break;
            }

            long var1;
            if (var5 == Long.MAX_VALUE) {
               long var7;
               try {
                  e6.c.a();
                  var7 = System.nanoTime();
               } catch (Throwable var64) {
                  var10000 = var64;
                  var10001 = false;
                  break;
               }

               var1 = var3;
               if (var3 == Long.MAX_VALUE) {
                  try {
                     var1 = t;
                  } catch (Throwable var63) {
                     var10000 = var63;
                     var10001 = false;
                     break;
                  }

                  var1 += var7;
               }

               var3 = var1 - var7;
               if (var3 <= 0L) {
                  _thread = null;
                  this.q0();
                  e6.c.a();
                  if (!this.i0()) {
                     this.Z();
                  }

                  return;
               }

               try {
                  var5 = a6.d.d(var5, var3);
               } catch (Throwable var62) {
                  var10000 = var62;
                  var10001 = false;
                  break;
               }
            } else {
               var1 = Long.MAX_VALUE;
            }

            var3 = var1;
            if (var5 > 0L) {
               try {
                  var9 = this.t0();
               } catch (Throwable var61) {
                  var10000 = var61;
                  var10001 = false;
                  break;
               }

               if (var9) {
                  _thread = null;
                  this.q0();
                  e6.c.a();
                  if (!this.i0()) {
                     this.Z();
                  }

                  return;
               }

               try {
                  e6.c.a();
                  LockSupport.parkNanos(this, var5);
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break;
               }

               var3 = var1;
            }
         }
      }

      Throwable var10 = var10000;
      _thread = null;
      this.q0();
      e6.c.a();
      if (!this.i0()) {
         this.Z();
      }

      throw var10;
   }

   public void shutdown() {
      debugStatus = 4;
      super.shutdown();
   }
}
