package e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

public class y0 implements t0, l, e1 {
   private static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_state");
   private volatile Object _parentHandle;
   private volatile Object _state;

   private final k A(p0 var1) {
      boolean var2 = var1 instanceof k;
      Object var4 = null;
      k var3;
      if (var2) {
         var3 = (k)var1;
      } else {
         var3 = null;
      }

      k var6;
      if (var3 == null) {
         b1 var5 = var1.b();
         if (var5 == null) {
            var6 = (k)var4;
         } else {
            var6 = this.R(var5);
         }
      } else {
         var6 = var3;
      }

      return var6;
   }

   private final Throwable B(Object var1) {
      boolean var2 = var1 instanceof n;
      Object var3 = null;
      n var4;
      if (var2) {
         var4 = (n)var1;
      } else {
         var4 = null;
      }

      Throwable var5;
      if (var4 == null) {
         var5 = (Throwable)var3;
      } else {
         var5 = var4.a;
      }

      return var5;
   }

   private final Throwable C(b var1, List var2) {
      boolean var4 = var2.isEmpty();
      Object var5 = null;
      if (var4) {
         return var1.g() ? new JobCancellationException(e(this), (Throwable)null, this) : null;
      } else {
         Iterator var6 = var2.iterator();

         Object var8;
         do {
            if (!var6.hasNext()) {
               var8 = null;
               break;
            }

            var8 = var6.next();
         } while(!((Throwable)var8 instanceof CancellationException ^ true));

         Throwable var9 = (Throwable)var8;
         if (var9 != null) {
            return var9;
         } else {
            Throwable var11 = (Throwable)var2.get(0);
            if (var11 instanceof TimeoutCancellationException) {
               Iterator var10 = var2.iterator();

               boolean var3;
               do {
                  var8 = var5;
                  if (!var10.hasNext()) {
                     break;
                  }

                  var8 = var10.next();
                  Throwable var7 = (Throwable)var8;
                  if (var7 != var11 && var7 instanceof TimeoutCancellationException) {
                     var3 = true;
                  } else {
                     var3 = false;
                  }
               } while(!var3);

               var9 = (Throwable)var8;
               if (var9 != null) {
                  return var9;
               }
            }

            return var11;
         }
      }
   }

   private final b1 G(p0 var1) {
      b1 var3 = var1.b();
      b1 var2 = var3;
      if (var3 == null) {
         if (var1 instanceof h0) {
            var2 = new b1();
         } else {
            if (!(var1 instanceof x0)) {
               throw new IllegalStateException(x5.g.j("State should have list: ", var1).toString());
            }

            this.X((x0)var1);
            var2 = null;
         }
      }

      return var2;
   }

   private final Object N(Object var1) {
      Object var5 = null;
      Throwable var3 = null;

      while(true) {
         Object var6 = this.I();
         Throwable var4;
         if (var6 instanceof b) {
            synchronized(var6){}

            Throwable var40;
            Throwable var10000;
            label554: {
               boolean var10001;
               label538: {
                  kotlinx.coroutines.internal.w var39;
                  try {
                     if (!((b)var6).i()) {
                        break label538;
                     }

                     var39 = z0.e();
                  } catch (Throwable var38) {
                     var10000 = var38;
                     var10001 = false;
                     break label554;
                  }

                  return var39;
               }

               boolean var2;
               try {
                  var2 = ((b)var6).g();
               } catch (Throwable var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label554;
               }

               if (var1 != null || !var2) {
                  var4 = var3;
                  if (var3 == null) {
                     try {
                        var4 = this.v(var1);
                     } catch (Throwable var36) {
                        var10000 = var36;
                        var10001 = false;
                        break label554;
                     }
                  }

                  try {
                     ((b)var6).c(var4);
                  } catch (Throwable var35) {
                     var10000 = var35;
                     var10001 = false;
                     break label554;
                  }
               }

               try {
                  var3 = ((b)var6).f();
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break label554;
               }

               var40 = (Throwable)var5;
               if (var2 ^ true) {
                  var40 = var3;
               }

               if (var40 != null) {
                  this.S(((b)var6).b(), var40);
               }

               return z0.a();
            }

            var40 = var10000;
            throw var40;
         }

         if (!(var6 instanceof p0)) {
            return z0.e();
         }

         var4 = var3;
         if (var3 == null) {
            var4 = this.v(var1);
         }

         p0 var7 = (p0)var6;
         if (var7.a()) {
            var3 = var4;
            if (this.f0(var7, var4)) {
               return z0.a();
            }
         } else {
            Object var41 = this.g0(var6, new n(var4, false, 2, (x5.e)null));
            if (var41 == z0.a()) {
               throw new IllegalStateException(x5.g.j("Cannot happen in ", var6).toString());
            }

            if (var41 != z0.b()) {
               return var41;
            }

            var3 = var4;
         }
      }
   }

   private final x0 P(w5.l var1, boolean var2) {
      x0 var4 = null;
      Object var3 = null;
      if (var2) {
         u0 var6 = (u0)var3;
         if (var1 instanceof u0) {
            var6 = (u0)var1;
         }

         var3 = var6;
         if (var6 == null) {
            var3 = new r0(var1);
         }
      } else {
         x0 var5;
         if (var1 instanceof x0) {
            var5 = (x0)var1;
         } else {
            var5 = null;
         }

         if (var5 != null) {
            var4 = var5;
         }

         var3 = var4;
         if (var4 == null) {
            var3 = new s0(var1);
         }
      }

      ((x0)var3).u(this);
      return (x0)var3;
   }

   private final k R(kotlinx.coroutines.internal.l var1) {
      while(true) {
         kotlinx.coroutines.internal.l var2 = var1;
         if (!var1.n()) {
            while(true) {
               while(true) {
                  var1 = var2.l();
                  if (var1.n()) {
                     var2 = var1;
                  } else {
                     if (var1 instanceof k) {
                        return (k)var1;
                     }

                     var2 = var1;
                     if (var1 instanceof b1) {
                        return null;
                     }
                  }
               }
            }
         }

         var1 = var1.m();
      }
   }

   private final void S(b1 var1, Throwable var2) {
      this.U(var2);
      kotlinx.coroutines.internal.l var4 = (kotlinx.coroutines.internal.l)var1.k();

      CompletionHandlerException var3;
      CompletionHandlerException var5;
      for(var3 = null; !x5.g.a(var4, var1); var3 = var5) {
         var5 = var3;
         if (var4 instanceof u0) {
            label78: {
               x0 var8 = (x0)var4;

               try {
                  var8.s(var2);
               } catch (Throwable var10) {
                  CompletionHandlerException var6;
                  if (var3 == null) {
                     var6 = null;
                  } else {
                     m5.a.a(var3, var10);
                     var6 = var3;
                  }

                  var5 = var3;
                  if (var6 == null) {
                     StringBuilder var11 = new StringBuilder();
                     var11.append("Exception in completion handler ");
                     var11.append(var8);
                     var11.append(" for ");
                     var11.append(this);
                     var5 = new CompletionHandlerException(var11.toString(), var10);
                  }
                  break label78;
               }

               var5 = var3;
            }
         }

         var4 = var4.l();
      }

      if (var3 != null) {
         this.K(var3);
      }

      this.q(var2);
   }

   private final void T(b1 var1, Throwable var2) {
      kotlinx.coroutines.internal.l var4 = (kotlinx.coroutines.internal.l)var1.k();

      CompletionHandlerException var3;
      CompletionHandlerException var5;
      for(var3 = null; !x5.g.a(var4, var1); var3 = var5) {
         var5 = var3;
         if (var4 instanceof x0) {
            label78: {
               x0 var7 = (x0)var4;

               try {
                  var7.s(var2);
               } catch (Throwable var10) {
                  CompletionHandlerException var6;
                  if (var3 == null) {
                     var6 = null;
                  } else {
                     m5.a.a(var3, var10);
                     var6 = var3;
                  }

                  var5 = var3;
                  if (var6 == null) {
                     StringBuilder var11 = new StringBuilder();
                     var11.append("Exception in completion handler ");
                     var11.append(var7);
                     var11.append(" for ");
                     var11.append(this);
                     var5 = new CompletionHandlerException(var11.toString(), var10);
                  }
                  break label78;
               }

               var5 = var3;
            }
         }

         var4 = var4.l();
      }

      if (var3 != null) {
         this.K(var3);
      }

   }

   private final void W(h0 var1) {
      Object var2 = new b1();
      if (!var1.a()) {
         var2 = new o0((b1)var2);
      }

      androidx.work.impl.utils.futures.b.a(m, this, var1, var2);
   }

   private final void X(x0 var1) {
      var1.g(new b1());
      kotlinx.coroutines.internal.l var2 = var1.l();
      androidx.work.impl.utils.futures.b.a(m, this, var1, var2);
   }

   private final String a0(Object var1) {
      boolean var2 = var1 instanceof b;
      String var3 = "Active";
      String var5;
      if (var2) {
         b var4 = (b)var1;
         if (var4.g()) {
            var5 = "Cancelling";
         } else {
            var5 = var3;
            if (var4.h()) {
               var5 = "Completing";
            }
         }
      } else if (var1 instanceof p0) {
         if (((p0)var1).a()) {
            var5 = var3;
         } else {
            var5 = "New";
         }
      } else if (var1 instanceof n) {
         var5 = "Cancelled";
      } else {
         var5 = "Completed";
      }

      return var5;
   }

   // $FF: synthetic method
   public static CancellationException c0(y0 var0, Throwable var1, String var2, int var3, Object var4) {
      if (var4 == null) {
         if ((var3 & 1) != 0) {
            var2 = null;
         }

         return var0.b0(var1, var2);
      } else {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
      }
   }

   // $FF: synthetic method
   public static final String e(y0 var0) {
      return var0.r();
   }

   private final boolean e0(p0 var1, Object var2) {
      if (!androidx.work.impl.utils.futures.b.a(m, this, var1, z0.f(var2))) {
         return false;
      } else {
         this.U((Throwable)null);
         this.V(var2);
         this.t(var1, var2);
         return true;
      }
   }

   private final boolean f0(p0 var1, Throwable var2) {
      b1 var3 = this.G(var1);
      if (var3 == null) {
         return false;
      } else {
         b var4 = new b(var3, false, var2);
         if (!androidx.work.impl.utils.futures.b.a(m, this, var1, var4)) {
            return false;
         } else {
            this.S(var3, var2);
            return true;
         }
      }
   }

   private final Object g0(Object var1, Object var2) {
      if (!(var1 instanceof p0)) {
         return z0.a();
      } else if ((var1 instanceof h0 || var1 instanceof x0) && !(var1 instanceof k) && !(var2 instanceof n)) {
         return this.e0((p0)var1, var2) ? var2 : z0.b();
      } else {
         return this.h0((p0)var1, var2);
      }
   }

   private final Object h0(p0 var1, Object var2) {
      b1 var8 = this.G(var1);
      if (var8 == null) {
         return z0.b();
      } else {
         boolean var3 = var1 instanceof b;
         m5.o var6 = null;
         b var4;
         if (var3) {
            var4 = (b)var1;
         } else {
            var4 = null;
         }

         b var5 = var4;
         if (var4 == null) {
            var5 = new b(var8, false, (Throwable)null);
         }

         synchronized(var5){}

         Throwable var10000;
         label779: {
            kotlinx.coroutines.internal.w var68;
            boolean var10001;
            try {
               if (var5.h()) {
                  var68 = z0.a();
                  return var68;
               }
            } catch (Throwable var65) {
               var10000 = var65;
               var10001 = false;
               break label779;
            }

            try {
               var5.k(true);
            } catch (Throwable var64) {
               var10000 = var64;
               var10001 = false;
               break label779;
            }

            if (var5 != var1) {
               try {
                  if (!androidx.work.impl.utils.futures.b.a(m, this, var1, var5)) {
                     var68 = z0.b();
                     return var68;
                  }
               } catch (Throwable var63) {
                  var10000 = var63;
                  var10001 = false;
                  break label779;
               }
            }

            n var69;
            label751: {
               try {
                  var3 = var5.g();
                  if (var2 instanceof n) {
                     var69 = (n)var2;
                     break label751;
                  }
               } catch (Throwable var62) {
                  var10000 = var62;
                  var10001 = false;
                  break label779;
               }

               var69 = null;
            }

            if (var69 != null) {
               try {
                  var5.c(var69.a);
               } catch (Throwable var61) {
                  var10000 = var61;
                  var10001 = false;
                  break label779;
               }
            }

            Throwable var7;
            try {
               var7 = var5.f();
            } catch (Throwable var60) {
               var10000 = var60;
               var10001 = false;
               break label779;
            }

            Throwable var70 = var6;
            if (true ^ var3) {
               var70 = var7;
            }

            try {
               var6 = m5.o.a;
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label779;
            }

            if (var70 != null) {
               this.S(var8, var70);
            }

            k var67 = this.A(var1);
            if (var67 != null && this.i0(var5, var67, var2)) {
               return z0.b;
            }

            return this.w(var5, var2);
         }

         Throwable var66 = var10000;
         throw var66;
      }
   }

   private final boolean i(Object var1, b1 var2, x0 var3) {
      kotlinx.coroutines.internal.l.a var6 = new kotlinx.coroutines.internal.l.a(var3, this, var1) {
         final kotlinx.coroutines.internal.l d;
         final y0 e;
         final Object f;

         public {
            this.d = var1;
            this.e = var2;
            this.f = var3;
         }

         public Object i(kotlinx.coroutines.internal.l var1) {
            boolean var2;
            if (this.e.I() == this.f) {
               var2 = true;
            } else {
               var2 = false;
            }

            Object var3;
            if (var2) {
               var3 = null;
            } else {
               var3 = kotlinx.coroutines.internal.k.a();
            }

            return var3;
         }
      };

      boolean var5;
      while(true) {
         int var4 = var2.m().r(var3, var2, var6);
         var5 = true;
         if (var4 == 1) {
            break;
         }

         if (var4 == 2) {
            var5 = false;
            break;
         }
      }

      return var5;
   }

   private final boolean i0(b var1, k var2, Object var3) {
      k var4;
      do {
         if (null.d(var2.q, false, false, new a(this, var1, var2, var3), 1, (Object)null) != c1.m) {
            return true;
         }

         var4 = this.R(var2);
         var2 = var4;
      } while(var4 != null);

      return false;
   }

   private final void j(Throwable var1, List var2) {
      if (var2.size() > 1) {
         Set var3 = Collections.newSetFromMap(new IdentityHashMap(var2.size()));
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            Throwable var5 = (Throwable)var4.next();
            if (var5 != var1 && var5 != var1 && !(var5 instanceof CancellationException) && var3.add(var5)) {
               m5.a.a(var1, var5);
            }
         }

      }
   }

   private final Object p(Object var1) {
      Object var2;
      do {
         var2 = this.I();
         if (!(var2 instanceof p0) || var2 instanceof b && ((b)var2).h()) {
            return z0.a();
         }

         var2 = this.g0(var2, new n(this.v(var1), false, 2, (x5.e)null));
      } while(var2 == z0.b());

      return var2;
   }

   private final boolean q(Throwable var1) {
      boolean var2 = this.M();
      boolean var3 = true;
      if (var2) {
         return true;
      } else {
         boolean var4 = var1 instanceof CancellationException;
         j var5 = this.H();
         if (var5 != null && var5 != c1.m) {
            var2 = var3;
            if (!var5.f(var1)) {
               if (var4) {
                  var2 = var3;
               } else {
                  var2 = false;
               }
            }

            return var2;
         } else {
            return var4;
         }
      }
   }

   private final void t(p0 var1, Object var2) {
      j var4 = this.H();
      if (var4 != null) {
         var4.d();
         this.Z(c1.m);
      }

      boolean var3 = var2 instanceof n;
      var4 = null;
      n var8;
      if (var3) {
         var8 = (n)var2;
      } else {
         var8 = null;
      }

      Throwable var9;
      if (var8 == null) {
         var9 = var4;
      } else {
         var9 = var8.a;
      }

      if (var1 instanceof x0) {
         try {
            ((x0)var1).s(var9);
         } catch (Throwable var6) {
            StringBuilder var10 = new StringBuilder();
            var10.append("Exception in completion handler ");
            var10.append(var1);
            var10.append(" for ");
            var10.append(this);
            this.K(new CompletionHandlerException(var10.toString(), var6));
            return;
         }
      } else {
         b1 var7 = var1.b();
         if (var7 != null) {
            this.T(var7, var9);
         }
      }

   }

   private final void u(b var1, k var2, Object var3) {
      var2 = this.R(var2);
      if (var2 == null || !this.i0(var1, var2, var3)) {
         this.m(this.w(var1, var3));
      }
   }

   private final Throwable v(Object var1) {
      boolean var2;
      if (var1 == null) {
         var2 = true;
      } else {
         var2 = var1 instanceof Throwable;
      }

      if (var2) {
         Throwable var3 = (Throwable)var1;
         var1 = var3;
         if (var3 == null) {
            var1 = new JobCancellationException(e(this), (Throwable)null, this);
         }
      } else {
         if (var1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
         }

         var1 = ((e1)var1).y();
      }

      return (Throwable)var1;
   }

   private final Object w(b var1, Object var2) {
      n var5;
      if (var2 instanceof n) {
         var5 = (n)var2;
      } else {
         var5 = null;
      }

      Throwable var16;
      if (var5 == null) {
         var16 = null;
      } else {
         var16 = var5.a;
      }

      synchronized(var1){}

      boolean var4;
      Throwable var6;
      label186: {
         Throwable var10000;
         label191: {
            List var7;
            boolean var10001;
            try {
               var4 = var1.g();
               var7 = var1.j(var16);
               var6 = this.C(var1, var7);
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label191;
            }

            if (var6 == null) {
               break label186;
            }

            label181:
            try {
               this.j(var6, var7);
               break label186;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label181;
            }
         }

         Throwable var15 = var10000;
         throw var15;
      }

      boolean var3 = false;
      if (var6 != null && var6 != var16) {
         var2 = new n(var6, false, 2, (x5.e)null);
      }

      if (var6 != null) {
         if (this.q(var6) || this.J(var6)) {
            var3 = true;
         }

         if (var3) {
            if (var2 == null) {
               throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }

            ((n)var2).b();
         }
      }

      if (!var4) {
         this.U(var6);
      }

      this.V(var2);
      androidx.work.impl.utils.futures.b.a(m, this, var1, z0.f(var2));
      this.t(var1, var2);
      return var2;
   }

   public boolean D() {
      return true;
   }

   public void E(CancellationException var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = new JobCancellationException(e(this), (Throwable)null, this);
      }

      this.o((Throwable)var2);
   }

   public boolean F() {
      return false;
   }

   public final j H() {
      return (j)this._parentHandle;
   }

   public final Object I() {
      while(true) {
         Object var1 = this._state;
         if (!(var1 instanceof kotlinx.coroutines.internal.s)) {
            return var1;
         }

         ((kotlinx.coroutines.internal.s)var1).c(this);
      }
   }

   protected boolean J(Throwable var1) {
      return false;
   }

   public void K(Throwable var1) {
      throw var1;
   }

   protected boolean M() {
      return false;
   }

   public final Object O(Object var1) {
      while(true) {
         Object var2 = this.g0(this.I(), var1);
         if (var2 != z0.a()) {
            if (var2 == z0.b()) {
               continue;
            }

            return var2;
         }

         StringBuilder var3 = new StringBuilder();
         var3.append("Job ");
         var3.append(this);
         var3.append(" is already complete or completing, but is being completed with ");
         var3.append(var1);
         throw new IllegalStateException(var3.toString(), this.B(var1));
      }
   }

   public String Q() {
      return x.a(this);
   }

   protected void U(Throwable var1) {
   }

   protected void V(Object var1) {
   }

   public final void Y(x0 var1) {
      while(true) {
         Object var2 = this.I();
         if (var2 instanceof x0) {
            if (var2 != var1) {
               return;
            }

            if (!androidx.work.impl.utils.futures.b.a(m, this, var2, z0.c())) {
               continue;
            }

            return;
         }

         if (var2 instanceof p0 && ((p0)var2).b() != null) {
            var1.o();
         }

         return;
      }
   }

   public final void Z(j var1) {
      this._parentHandle = var1;
   }

   public boolean a() {
      Object var2 = this.I();
      boolean var1;
      if (var2 instanceof p0 && ((p0)var2).a()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected final CancellationException b0(Throwable var1, String var2) {
      CancellationException var3;
      if (var1 instanceof CancellationException) {
         var3 = (CancellationException)var1;
      } else {
         var3 = null;
      }

      Object var4 = var3;
      if (var3 == null) {
         String var5 = var2;
         if (var2 == null) {
            var5 = e(this);
         }

         var4 = new JobCancellationException(var5, var1, this);
      }

      return (CancellationException)var4;
   }

   public final String d0() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.Q());
      var1.append('{');
      var1.append(this.a0(this.I()));
      var1.append('}');
      return var1.toString();
   }

   public Object fold(Object var1, w5.p var2) {
      return null.b(this, var1, var2);
   }

   public <undefinedtype> get(o5.f.c var1) {
      return null.c(this, var1);
   }

   public final o5.f.c getKey() {
      return t0.k;
   }

   public final void l(e1 var1) {
      this.n(var1);
   }

   protected void m(Object var1) {
   }

   public o5.f minusKey(o5.f.c var1) {
      return null.e(this, var1);
   }

   public final boolean n(Object var1) {
      Object var4 = z0.a();
      boolean var3 = this.F();
      boolean var2 = true;
      Object var5;
      if (var3) {
         var5 = this.p(var1);
         var4 = var5;
         if (var5 == z0.b) {
            return true;
         }
      }

      var5 = var4;
      if (var4 == z0.a()) {
         var5 = this.N(var1);
      }

      if (var5 != z0.a() && var5 != z0.b) {
         if (var5 == z0.e()) {
            var2 = false;
         } else {
            this.m(var5);
         }
      }

      return var2;
   }

   public void o(Throwable var1) {
      this.n(var1);
   }

   protected String r() {
      return "Job was cancelled";
   }

   public boolean s(Throwable var1) {
      boolean var3 = var1 instanceof CancellationException;
      boolean var2 = true;
      if (var3) {
         return true;
      } else {
         if (!this.n(var1) || !this.D()) {
            var2 = false;
         }

         return var2;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.d0());
      var1.append('@');
      var1.append(x.b(this));
      return var1.toString();
   }

   public final g0 x(boolean var1, boolean var2, w5.l var3) {
      x0 var8 = this.P(var3, var1);

      while(true) {
         while(true) {
            Object var10 = this.I();
            if (var10 instanceof h0) {
               h0 var47 = (h0)var10;
               if (var47.a()) {
                  if (androidx.work.impl.utils.futures.b.a(m, this, var10, var8)) {
                     return var8;
                  }
               } else {
                  this.W(var47);
               }
            } else {
               boolean var4 = var10 instanceof p0;
               c1 var6 = null;
               Object var9 = null;
               if (!var4) {
                  if (var2) {
                     n var45;
                     if (var10 instanceof n) {
                        var45 = (n)var10;
                     } else {
                        var45 = null;
                     }

                     Throwable var46;
                     if (var45 == null) {
                        var46 = var6;
                     } else {
                        var46 = var45.a;
                     }

                     var3.c(var46);
                  }

                  return c1.m;
               }

               b1 var11 = ((p0)var10).b();
               if (var11 == null) {
                  if (var10 == null) {
                     throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                  }

                  this.X((x0)var10);
               } else {
                  var6 = c1.m;
                  Throwable var7 = (Throwable)var9;
                  Object var5 = var6;
                  if (var1) {
                     var7 = (Throwable)var9;
                     var5 = var6;
                     if (var10 instanceof b) {
                        label713: {
                           synchronized(var10){}

                           Throwable var10000;
                           label706: {
                              boolean var10001;
                              try {
                                 var7 = ((b)var10).f();
                              } catch (Throwable var42) {
                                 var10000 = var42;
                                 var10001 = false;
                                 break label706;
                              }

                              label707: {
                                 if (var7 != null) {
                                    var5 = var6;

                                    try {
                                       if (!(var3 instanceof k)) {
                                          break label707;
                                       }
                                    } catch (Throwable var41) {
                                       var10000 = var41;
                                       var10001 = false;
                                       break label706;
                                    }

                                    var5 = var6;

                                    try {
                                       if (((b)var10).h()) {
                                          break label707;
                                       }
                                    } catch (Throwable var40) {
                                       var10000 = var40;
                                       var10001 = false;
                                       break label706;
                                    }
                                 }

                                 try {
                                    var4 = this.i(var10, var11, var8);
                                 } catch (Throwable var39) {
                                    var10000 = var39;
                                    var10001 = false;
                                    break label706;
                                 }

                                 if (!var4) {
                                    continue;
                                 }

                                 if (var7 == null) {
                                    return var8;
                                 }

                                 var5 = var8;
                              }

                              label675:
                              try {
                                 m5.o var44 = m5.o.a;
                                 break label713;
                              } catch (Throwable var38) {
                                 var10000 = var38;
                                 var10001 = false;
                                 break label675;
                              }
                           }

                           Throwable var43 = var10000;
                           throw var43;
                        }
                     }
                  }

                  if (var7 != null) {
                     if (var2) {
                        var3.c(var7);
                     }

                     return (g0)var5;
                  }

                  if (this.i(var10, var11, var8)) {
                     return var8;
                  }
               }
            }
         }
      }
   }

   public CancellationException y() {
      Object var5 = this.I();
      boolean var1 = var5 instanceof b;
      CancellationException var3 = null;
      Throwable var2;
      if (var1) {
         var2 = ((b)var5).f();
      } else if (var5 instanceof n) {
         var2 = ((n)var5).a;
      } else {
         if (var5 instanceof p0) {
            throw new IllegalStateException(x5.g.j("Cannot be cancelling child in this state: ", var5).toString());
         }

         var2 = null;
      }

      if (var2 instanceof CancellationException) {
         var3 = (CancellationException)var2;
      }

      Object var4 = var3;
      if (var3 == null) {
         var4 = new JobCancellationException(x5.g.j("Parent job is ", this.a0(var5)), var2, this);
      }

      return (CancellationException)var4;
   }

   public final CancellationException z() {
      Object var3 = this.I();
      boolean var1 = var3 instanceof b;
      Object var2 = null;
      if (var1) {
         Throwable var4 = ((b)var3).f();
         if (var4 != null) {
            var2 = this.b0(var4, x5.g.j(x.a(this), " is cancelling"));
         }

         if (var2 == null) {
            throw new IllegalStateException(x5.g.j("Job is still new or active: ", this).toString());
         }
      } else {
         if (var3 instanceof p0) {
            throw new IllegalStateException(x5.g.j("Job is still new or active: ", this).toString());
         }

         if (var3 instanceof n) {
            var2 = c0(this, ((n)var3).a, (String)null, 1, (Object)null);
         } else {
            var2 = new JobCancellationException(x5.g.j(x.a(this), " has completed normally"), (Throwable)null, this);
         }
      }

      return (CancellationException)var2;
   }

   private static final class a extends x0 {
      private final y0 q;
      private final b r;
      private final k s;
      private final Object t;

      public a(y0 var1, b var2, k var3, Object var4) {
         this.q = var1;
         this.r = var2;
         this.s = var3;
         this.t = var4;
      }

      public void s(Throwable var1) {
         this.q.u(this.r, this.s, this.t);
      }
   }

   private static final class b implements p0 {
      private volatile Object _exceptionsHolder;
      private volatile int _isCompleting;
      private volatile Object _rootCause;
      private final b1 m;

      public b(b1 var1, boolean var2, Throwable var3) {
         this.m = var1;
         this._isCompleting = var2;
         this._rootCause = var3;
         this._exceptionsHolder = null;
      }

      private final ArrayList d() {
         return new ArrayList(4);
      }

      private final Object e() {
         return this._exceptionsHolder;
      }

      private final void l(Object var1) {
         this._exceptionsHolder = var1;
      }

      public boolean a() {
         boolean var1;
         if (this.f() == null) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public b1 b() {
         return this.m;
      }

      public final void c(Throwable var1) {
         Throwable var2 = this.f();
         if (var2 == null) {
            this.m(var1);
         } else if (var1 != var2) {
            Object var4 = this.e();
            if (var4 == null) {
               this.l(var1);
            } else if (var4 instanceof Throwable) {
               if (var1 == var4) {
                  return;
               }

               ArrayList var3 = this.d();
               var3.add(var4);
               var3.add(var1);
               this.l(var3);
            } else {
               if (!(var4 instanceof ArrayList)) {
                  throw new IllegalStateException(x5.g.j("State is ", var4).toString());
               }

               ((ArrayList)var4).add(var1);
            }

         }
      }

      public final Throwable f() {
         return (Throwable)this._rootCause;
      }

      public final boolean g() {
         boolean var1;
         if (this.f() != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public final boolean h() {
         return (boolean)this._isCompleting;
      }

      public final boolean i() {
         boolean var1;
         if (this.e() == z0.d()) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public final List j(Throwable var1) {
         Object var3 = this.e();
         ArrayList var2;
         if (var3 == null) {
            var2 = this.d();
         } else if (var3 instanceof Throwable) {
            var2 = this.d();
            var2.add(var3);
         } else {
            if (!(var3 instanceof ArrayList)) {
               throw new IllegalStateException(x5.g.j("State is ", var3).toString());
            }

            var2 = (ArrayList)var3;
         }

         Throwable var4 = this.f();
         if (var4 != null) {
            var2.add(0, var4);
         }

         if (var1 != null && !x5.g.a(var1, var4)) {
            var2.add(var1);
         }

         this.l(z0.d());
         return var2;
      }

      public final void k(boolean var1) {
         this._isCompleting = var1;
      }

      public final void m(Throwable var1) {
         this._rootCause = var1;
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("Finishing[cancelling=");
         var1.append(this.g());
         var1.append(", completing=");
         var1.append(this.h());
         var1.append(", rootCause=");
         var1.append(this.f());
         var1.append(", exceptions=");
         var1.append(this.e());
         var1.append(", list=");
         var1.append(this.b());
         var1.append(']');
         return var1.toString();
      }
   }
}
