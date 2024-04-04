package e6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class j0 extends k0 implements a0 {
   private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_queue");
   private static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_delayed");
   private volatile Object _delayed = null;
   private volatile int _isCompleted = 0;
   private volatile Object _queue = null;

   // $FF: synthetic method
   public static final boolean c0(j0 var0) {
      return var0.h0();
   }

   private final void d0() {
      while(true) {
         Object var2 = this._queue;
         if (var2 == null) {
            if (androidx.work.impl.utils.futures.b.a(q, this, (Object)null, m0.a())) {
               return;
            }
         } else {
            if (var2 instanceof kotlinx.coroutines.internal.n) {
               ((kotlinx.coroutines.internal.n)var2).d();
               return;
            }

            if (var2 == m0.a()) {
               return;
            }

            kotlinx.coroutines.internal.n var1 = new kotlinx.coroutines.internal.n(8, true);
            var1.a((Runnable)var2);
            if (androidx.work.impl.utils.futures.b.a(q, this, var2, var1)) {
               return;
            }
         }
      }
   }

   private final Runnable e0() {
      while(true) {
         Object var3 = this._queue;
         if (var3 == null) {
            return null;
         }

         if (var3 instanceof kotlinx.coroutines.internal.n) {
            kotlinx.coroutines.internal.n var1 = (kotlinx.coroutines.internal.n)var3;
            Object var2 = var1.j();
            if (var2 != kotlinx.coroutines.internal.n.h) {
               return (Runnable)var2;
            }

            androidx.work.impl.utils.futures.b.a(q, this, var3, var1.i());
         } else {
            if (var3 == m0.a()) {
               return null;
            }

            if (androidx.work.impl.utils.futures.b.a(q, this, var3, (Object)null)) {
               return (Runnable)var3;
            }
         }
      }
   }

   private final boolean g0(Runnable var1) {
      while(true) {
         Object var3 = this._queue;
         if (this.h0()) {
            return false;
         }

         if (var3 == null) {
            if (androidx.work.impl.utils.futures.b.a(q, this, (Object)null, var1)) {
               return true;
            }
         } else {
            kotlinx.coroutines.internal.n var4;
            if (var3 instanceof kotlinx.coroutines.internal.n) {
               var4 = (kotlinx.coroutines.internal.n)var3;
               int var2 = var4.a(var1);
               if (var2 == 0) {
                  return true;
               }

               if (var2 != 1) {
                  if (var2 == 2) {
                     return false;
                  }
               } else {
                  androidx.work.impl.utils.futures.b.a(q, this, var3, var4.i());
               }
            } else {
               if (var3 == m0.a()) {
                  return false;
               }

               var4 = new kotlinx.coroutines.internal.n(8, true);
               var4.a((Runnable)var3);
               var4.a(var1);
               if (androidx.work.impl.utils.futures.b.a(q, this, var3, var4)) {
                  return true;
               }
            }
         }
      }
   }

   private final boolean h0() {
      return (boolean)this._isCompleted;
   }

   private final void k0() {
      e6.c.a();
      long var1 = System.nanoTime();

      while(true) {
         b var3 = (b)this._delayed;
         a var4;
         if (var3 == null) {
            var4 = null;
         } else {
            var4 = (a)var3.i();
         }

         if (var4 == null) {
            return;
         }

         this.a0(var1, var4);
      }
   }

   private final int n0(long var1, a var3) {
      if (this.h0()) {
         return 1;
      } else {
         b var5 = (b)this._delayed;
         b var4 = var5;
         if (var5 == null) {
            androidx.work.impl.utils.futures.b.a(r, this, (Object)null, new b(var1));
            Object var6 = this._delayed;
            x5.g.b(var6);
            var4 = (b)var6;
         }

         return var3.i(var1, var4, this);
      }
   }

   private final void o0(boolean var1) {
      this._isCompleted = var1;
   }

   private final boolean p0(a var1) {
      b var3 = (b)this._delayed;
      a var4;
      if (var3 == null) {
         var4 = null;
      } else {
         var4 = (a)var3.e();
      }

      boolean var2;
      if (var4 == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final void N(o5.f var1, Runnable var2) {
      this.f0(var2);
   }

   protected long T() {
      if (super.T() == 0L) {
         return 0L;
      } else {
         Object var3 = this._queue;
         if (var3 != null) {
            if (!(var3 instanceof kotlinx.coroutines.internal.n)) {
               if (var3 == m0.a()) {
                  return Long.MAX_VALUE;
               }

               return 0L;
            }

            if (!((kotlinx.coroutines.internal.n)var3).g()) {
               return 0L;
            }
         }

         b var4 = (b)this._delayed;
         a var5;
         if (var4 == null) {
            var5 = null;
         } else {
            var5 = (a)var4.e();
         }

         if (var5 == null) {
            return Long.MAX_VALUE;
         } else {
            long var1 = var5.m;
            e6.c.a();
            return a6.d.b(var1 - System.nanoTime(), 0L);
         }
      }
   }

   public void f0(Runnable var1) {
      if (this.g0(var1)) {
         this.b0();
      } else {
         y.s.f0(var1);
      }

   }

   protected boolean i0() {
      boolean var2 = this.X();
      boolean var1 = false;
      if (!var2) {
         return false;
      } else {
         b var3 = (b)this._delayed;
         if (var3 != null && !var3.d()) {
            return false;
         } else {
            Object var4 = this._queue;
            if (var4 != null) {
               if (var4 instanceof kotlinx.coroutines.internal.n) {
                  var1 = ((kotlinx.coroutines.internal.n)var4).g();
                  return var1;
               }

               if (var4 != m0.a()) {
                  return var1;
               }
            }

            var1 = true;
            return var1;
         }
      }
   }

   public long j0() {
      if (this.Y()) {
         return 0L;
      } else {
         b var6 = (b)this._delayed;
         if (var6 != null && !var6.d()) {
            e6.c.a();
            long var2 = System.nanoTime();

            kotlinx.coroutines.internal.c0 var4;
            do {
               synchronized(var6){}

               Throwable var10000;
               label270: {
                  kotlinx.coroutines.internal.c0 var7;
                  boolean var10001;
                  try {
                     var7 = var6.b();
                  } catch (Throwable var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label270;
                  }

                  a var5 = null;
                  var4 = null;
                  if (var7 == null) {
                     var4 = var5;
                     continue;
                  }

                  boolean var1;
                  label253: {
                     try {
                        var5 = (a)var7;
                        if (var5.j(var2)) {
                           var1 = this.g0(var5);
                           break label253;
                        }
                     } catch (Throwable var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label270;
                     }

                     var1 = false;
                  }

                  if (!var1) {
                     continue;
                  }

                  label245:
                  try {
                     var4 = var6.h(0);
                     continue;
                  } catch (Throwable var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label245;
                  }
               }

               Throwable var21 = var10000;
               throw var21;
            } while((a)var4 != null);
         }

         Runnable var22 = this.e0();
         if (var22 != null) {
            var22.run();
            return 0L;
         } else {
            return this.T();
         }
      }
   }

   protected final void l0() {
      this._queue = null;
      this._delayed = null;
   }

   public final void m0(long var1, a var3) {
      int var4 = this.n0(var1, var3);
      if (var4 != 0) {
         if (var4 != 1) {
            if (var4 != 2) {
               throw new IllegalStateException("unexpected result".toString());
            }
         } else {
            this.a0(var1, var3);
         }
      } else if (this.p0(var3)) {
         this.b0();
      }

   }

   public void shutdown() {
      g1.a.b();
      this.o0(true);
      this.d0();

      while(this.j0() <= 0L) {
      }

      this.k0();
   }

   public abstract static class a implements Runnable, Comparable, g0, kotlinx.coroutines.internal.c0 {
      public long m;
      private Object n;
      private int o;

      public final void d() {
         synchronized(this){}

         Throwable var10000;
         label227: {
            Object var1;
            boolean var10001;
            kotlinx.coroutines.internal.w var2;
            try {
               var1 = this.n;
               var2 = m0.b();
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label227;
            }

            if (var1 == var2) {
               return;
            }

            b var24;
            label217: {
               try {
                  if (var1 instanceof b) {
                     var24 = (b)var1;
                     break label217;
                  }
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label227;
               }

               var24 = null;
            }

            if (var24 != null) {
               try {
                  var24.g(this);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label227;
               }
            }

            label206:
            try {
               this.n = m0.b();
               return;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label206;
            }
         }

         Throwable var25 = var10000;
         throw var25;
      }

      public void e(kotlinx.coroutines.internal.b0 var1) {
         boolean var2;
         if (this.n != m0.b()) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            this.n = var1;
         } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }
      }

      public kotlinx.coroutines.internal.b0 g() {
         Object var1 = this.n;
         kotlinx.coroutines.internal.b0 var2;
         if (var1 instanceof kotlinx.coroutines.internal.b0) {
            var2 = (kotlinx.coroutines.internal.b0)var1;
         } else {
            var2 = null;
         }

         return var2;
      }

      public int getIndex() {
         return this.o;
      }

      public int h(a var1) {
         long var4;
         int var2 = (var4 = this.m - var1.m - 0L) == 0L ? 0 : (var4 < 0L ? -1 : 1);
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else if (var2 < 0) {
            var3 = -1;
         } else {
            var3 = 0;
         }

         return var3;
      }

      public final int i(long param1, b param3, j0 param4) {
         // $FF: Couldn't be decompiled
      }

      public final boolean j(long var1) {
         boolean var3;
         if (var1 - this.m >= 0L) {
            var3 = true;
         } else {
            var3 = false;
         }

         return var3;
      }

      public void setIndex(int var1) {
         this.o = var1;
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("Delayed[nanos=");
         var1.append(this.m);
         var1.append(']');
         return var1.toString();
      }
   }

   public static final class b extends kotlinx.coroutines.internal.b0 {
      public long b;

      public b(long var1) {
         this.b = var1;
      }
   }
}
