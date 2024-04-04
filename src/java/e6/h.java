package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;

public class h extends d0 implements g, q5.d {
   private static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decision");
   private static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");
   private volatile int _decision;
   private volatile Object _state;
   private final o5.d p;
   private final o5.f q;
   private g0 r;

   private final Void j(Object var1) {
      throw new IllegalStateException(x5.g.j("Already resumed, but proposed with update ", var1).toString());
   }

   private final void n() {
      if (!this.r()) {
         this.m();
      }

   }

   private final void o(int var1) {
      if (!this.w()) {
         e0.a(this, var1);
      }
   }

   private final String q() {
      Object var1 = this.p();
      String var2;
      if (var1 instanceof d1) {
         var2 = "Active";
      } else if (var1 instanceof i) {
         var2 = "Cancelled";
      } else {
         var2 = "Completed";
      }

      return var2;
   }

   private final boolean r() {
      boolean var1;
      if (e0.c(super.o) && ((kotlinx.coroutines.internal.d)this.p).l()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private final void t(Object var1, int var2, w5.l var3) {
      while(true) {
         Object var4 = this._state;
         if (var4 instanceof d1) {
            Object var5 = this.v((d1)var4, var1, var2, var3, (Object)null);
            if (!androidx.work.impl.utils.futures.b.a(t, this, var4, var5)) {
               continue;
            }

            this.n();
            this.o(var2);
            return;
         }

         if (var4 instanceof i) {
            i var6 = (i)var4;
            if (var6.c()) {
               if (var3 != null) {
                  this.l(var3, var6.a);
               }

               return;
            }
         }

         this.j(var1);
         throw new KotlinNothingValueException();
      }
   }

   // $FF: synthetic method
   static void u(h var0, Object var1, int var2, w5.l var3, int var4, Object var5) {
      if (var5 == null) {
         if ((var4 & 4) != 0) {
            var3 = null;
         }

         var0.t(var1, var2, var3);
      } else {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
      }
   }

   private final Object v(d1 var1, Object var2, int var3, w5.l var4, Object var5) {
      Object var6;
      if (var2 instanceof n) {
         var6 = var2;
      } else if (!e0.b(var3) && var5 == null) {
         var6 = var2;
      } else {
         if (var4 == null && !(var1 instanceof e)) {
            var6 = var2;
            if (var5 == null) {
               return var6;
            }
         }

         e var7;
         if (var1 instanceof e) {
            var7 = (e)var1;
         } else {
            var7 = null;
         }

         var6 = new m(var2, var7, var4, var5, (Throwable)null, 16, (x5.e)null);
      }

      return var6;
   }

   private final boolean w() {
      do {
         int var1 = this._decision;
         if (var1 != 0) {
            if (var1 == 1) {
               return false;
            }

            throw new IllegalStateException("Already resumed".toString());
         }
      } while(!s.compareAndSet(this, 0, 2));

      return true;
   }

   public void a(Object var1, Throwable var2) {
      while(true) {
         var1 = this._state;
         if (!(var1 instanceof d1)) {
            if (var1 instanceof n) {
               return;
            }

            if (var1 instanceof m) {
               m var3 = (m)var1;
               if (var3.c() ^ true) {
                  m var4 = m.b(var3, (Object)null, (e)null, (w5.l)null, (Object)null, var2, 15, (Object)null);
                  if (!androidx.work.impl.utils.futures.b.a(t, this, var1, var4)) {
                     continue;
                  }

                  var3.d(this, var2);
                  return;
               }

               throw new IllegalStateException("Must be called at most once".toString());
            }

            if (!androidx.work.impl.utils.futures.b.a(t, this, var1, new m(var1, (e)null, (w5.l)null, (Object)null, var2, 14, (x5.e)null))) {
               continue;
            }

            return;
         }

         throw new IllegalStateException("Not completed".toString());
      }
   }

   public q5.d b() {
      o5.d var1 = this.p;
      q5.d var2;
      if (var1 instanceof q5.d) {
         var2 = (q5.d)var1;
      } else {
         var2 = null;
      }

      return var2;
   }

   public o5.f c() {
      return this.q;
   }

   public void d(Object var1) {
      u(this, e6.q.b(var1, this), super.o, (w5.l)null, 4, (Object)null);
   }

   public final o5.d e() {
      return this.p;
   }

   public Throwable f(Object var1) {
      Throwable var2 = super.f(var1);
      if (var2 == null) {
         var2 = null;
      } else {
         this.e();
      }

      return var2;
   }

   public Object g(Object var1) {
      Object var2 = var1;
      if (var1 instanceof m) {
         var2 = ((m)var1).a;
      }

      return var2;
   }

   public Object i() {
      return this.p();
   }

   public final void k(e var1, Throwable var2) {
      try {
         var1.a(var2);
      } catch (Throwable var4) {
         v.a(this.c(), new CompletionHandlerException(x5.g.j("Exception in invokeOnCancellation handler for ", this), var4));
         return;
      }

   }

   public final void l(w5.l var1, Throwable var2) {
      try {
         var1.c(var2);
      } catch (Throwable var4) {
         v.a(this.c(), new CompletionHandlerException(x5.g.j("Exception in resume onCancellation handler for ", this), var4));
         return;
      }

   }

   public final void m() {
      g0 var1 = this.r;
      if (var1 != null) {
         var1.d();
         this.r = c1.m;
      }
   }

   public final Object p() {
      return this._state;
   }

   protected String s() {
      return "CancellableContinuation";
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.s());
      var1.append('(');
      var1.append(x.c(this.p));
      var1.append("){");
      var1.append(this.q());
      var1.append("}@");
      var1.append(x.b(this));
      return var1.toString();
   }
}
