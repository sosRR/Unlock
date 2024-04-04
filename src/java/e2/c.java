package e2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class c {
   public static final String[] D = new String[]{"service_esmobile", "service_googleme"};
   private static final b2.d[] E = new b2.d[0];
   private boolean A;
   private volatile a1 B;
   protected AtomicInteger C;
   private int a;
   private long b;
   private long c;
   private int d;
   private long e;
   private volatile String f;
   l1 g;
   private final Context h;
   private final Looper i;
   private final h j;
   private final b2.f k;
   final Handler l;
   private final Object m;
   private final Object n;
   @GuardedBy("mServiceBrokerLock")
   private k o;
   protected e2.c.c p;
   @GuardedBy("mLock")
   private IInterface q;
   private final ArrayList r;
   @GuardedBy("mLock")
   private x0 s;
   @GuardedBy("mLock")
   private int t;
   private final e2.c.a u;
   private final e2.c.b v;
   private final int w;
   private final String x;
   private volatile String y;
   private b2.b z;

   protected c(Context var1, Looper var2, int var3, e2.c.a var4, e2.c.b var5, String var6) {
      h var7 = e2.h.b(var1);
      b2.f var8 = b2.f.f();
      e2.n.i(var4);
      e2.n.i(var5);
      this(var1, var2, var7, var8, var3, var4, var5, var6);
   }

   protected c(Context var1, Looper var2, h var3, b2.f var4, int var5, e2.c.a var6, e2.c.b var7, String var8) {
      this.f = null;
      this.m = new Object();
      this.n = new Object();
      this.r = new ArrayList();
      this.t = 1;
      this.z = null;
      this.A = false;
      this.B = null;
      this.C = new AtomicInteger(0);
      e2.n.j(var1, "Context must not be null");
      this.h = var1;
      e2.n.j(var2, "Looper must not be null");
      this.i = var2;
      e2.n.j(var3, "Supervisor must not be null");
      this.j = var3;
      e2.n.j(var4, "API availability must not be null");
      this.k = var4;
      this.l = new u0(this, var2);
      this.w = var5;
      this.u = var6;
      this.v = var7;
      this.x = var8;
   }

   private final void i0(int var1, IInterface var2) {
      boolean var5 = false;
      boolean var3;
      if (var1 != 4) {
         var3 = false;
      } else {
         var3 = true;
      }

      boolean var4;
      if (var2 == null) {
         var4 = false;
      } else {
         var4 = true;
      }

      if (var3 == var4) {
         var5 = true;
      }

      e2.n.a(var5);
      Object var6 = this.m;
      synchronized(var6){}

      Throwable var10000;
      boolean var10001;
      label2318: {
         try {
            this.t = var1;
            this.q = var2;
         } catch (Throwable var253) {
            var10000 = var253;
            var10001 = false;
            break label2318;
         }

         String var256;
         IllegalStateException var262;
         label2325: {
            String var7;
            x0 var254;
            if (var1 == 1) {
               try {
                  var254 = this.s;
               } catch (Throwable var244) {
                  var10000 = var244;
                  var10001 = false;
                  break label2318;
               }

               if (var254 != null) {
                  try {
                     h var266 = this.j;
                     var7 = this.g.c();
                     e2.n.i(var7);
                     var266.e(var7, this.g.b(), this.g.a(), var254, this.X(), this.g.d());
                     this.s = null;
                  } catch (Throwable var243) {
                     var10000 = var243;
                     var10001 = false;
                     break label2318;
                  }
               }
            } else if (var1 != 2 && var1 != 3) {
               if (var1 == 4) {
                  try {
                     e2.n.i(var2);
                     this.K(var2);
                  } catch (Throwable var249) {
                     var10000 = var249;
                     var10001 = false;
                     break label2318;
                  }
               }
            } else {
               try {
                  var254 = this.s;
               } catch (Throwable var248) {
                  var10000 = var248;
                  var10001 = false;
                  break label2318;
               }

               int var257;
               String var263;
               if (var254 != null) {
                  l1 var8;
                  try {
                     var8 = this.g;
                  } catch (Throwable var247) {
                     var10000 = var247;
                     var10001 = false;
                     break label2318;
                  }

                  if (var8 != null) {
                     try {
                        var7 = var8.c();
                        var263 = var8.b();
                        var257 = String.valueOf(var7).length();
                        var1 = String.valueOf(var263).length();
                        StringBuilder var9 = new StringBuilder(var257 + 70 + var1);
                        var9.append("Calling connect() while still connected, missing disconnect() for ");
                        var9.append(var7);
                        var9.append(" on ");
                        var9.append(var263);
                        Log.e("GmsClient", var9.toString());
                        h var260 = this.j;
                        var263 = this.g.c();
                        e2.n.i(var263);
                        var260.e(var263, this.g.b(), this.g.a(), var254, this.X(), this.g.d());
                        this.C.incrementAndGet();
                     } catch (Throwable var246) {
                        var10000 = var246;
                        var10001 = false;
                        break label2318;
                     }
                  }
               }

               x0 var261;
               l1 var255;
               label2327: {
                  try {
                     var261 = new x0(this, this.C.get());
                     this.s = var261;
                     if (this.t == 3 && this.B() != null) {
                        var255 = new l1(this.y().getPackageName(), this.B(), true, e2.h.a(), false);
                        break label2327;
                     }
                  } catch (Throwable var252) {
                     var10000 = var252;
                     var10001 = false;
                     break label2318;
                  }

                  try {
                     var255 = new l1(this.G(), this.F(), false, e2.h.a(), this.I());
                  } catch (Throwable var245) {
                     var10000 = var245;
                     var10001 = false;
                     break label2318;
                  }
               }

               label2290: {
                  try {
                     this.g = var255;
                     if (!var255.d() || this.g() >= 17895000) {
                        break label2290;
                     }

                     var262 = new IllegalStateException;
                     var256 = String.valueOf(this.g.c());
                     if (var256.length() != 0) {
                        var256 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(var256);
                        break label2325;
                     }
                  } catch (Throwable var251) {
                     var10000 = var251;
                     var10001 = false;
                     break label2318;
                  }

                  try {
                     var256 = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                     break label2325;
                  } catch (Throwable var242) {
                     var10000 = var242;
                     var10001 = false;
                     break label2318;
                  }
               }

               try {
                  h var11 = this.j;
                  var263 = this.g.c();
                  e2.n.i(var263);
                  String var10 = this.g.b();
                  var1 = this.g.a();
                  String var12 = this.X();
                  var5 = this.g.d();
                  Executor var265 = this.w();
                  e1 var258 = new e1(var263, var10, var1, var5);
                  if (!var11.f(var258, var261, var12, var265)) {
                     var263 = this.g.c();
                     var256 = this.g.b();
                     var257 = String.valueOf(var263).length();
                     var1 = String.valueOf(var256).length();
                     StringBuilder var264 = new StringBuilder(var257 + 34 + var1);
                     var264.append("unable to connect to service: ");
                     var264.append(var263);
                     var264.append(" on ");
                     var264.append(var256);
                     Log.w("GmsClient", var264.toString());
                     this.e0(16, (Bundle)null, this.C.get());
                  }
               } catch (Throwable var250) {
                  var10000 = var250;
                  var10001 = false;
                  break label2318;
               }
            }

            try {
               return;
            } catch (Throwable var241) {
               var10000 = var241;
               var10001 = false;
               break label2318;
            }
         }

         label2250:
         try {
            var262.<init>(var256);
            throw var262;
         } catch (Throwable var240) {
            var10000 = var240;
            var10001 = false;
            break label2250;
         }
      }

      while(true) {
         Throwable var259 = var10000;

         try {
            throw var259;
         } catch (Throwable var239) {
            var10000 = var239;
            var10001 = false;
            continue;
         }
      }
   }

   protected Bundle A() {
      return new Bundle();
   }

   protected String B() {
      return null;
   }

   protected Set C() {
      return Collections.emptySet();
   }

   public final IInterface D() {
      Object var1 = this.m;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (this.t != 5) {
               this.r();
               IInterface var17 = this.q;
               e2.n.j(var17, "Client is connected but service is null");
               return var17;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label116:
         try {
            DeadObjectException var16 = new DeadObjectException();
            throw var16;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label116;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   protected abstract String E();

   protected abstract String F();

   protected String G() {
      return "com.google.android.gms";
   }

   public e2.e H() {
      a1 var1 = this.B;
      return var1 == null ? null : var1.p;
   }

   protected boolean I() {
      return this.g() >= 211700000;
   }

   public boolean J() {
      return this.B != null;
   }

   protected void K(IInterface var1) {
      this.c = System.currentTimeMillis();
   }

   protected void L(b2.b var1) {
      this.d = var1.u();
      this.e = System.currentTimeMillis();
   }

   protected void M(int var1) {
      this.a = var1;
      this.b = System.currentTimeMillis();
   }

   protected void N(int var1, IBinder var2, Bundle var3, int var4) {
      Handler var5 = this.l;
      var5.sendMessage(var5.obtainMessage(1, var4, -1, new y0(this, var1, var2, var3)));
   }

   public boolean O() {
      return false;
   }

   public void P(String var1) {
      this.y = var1;
   }

   public void Q(int var1) {
      Handler var2 = this.l;
      var2.sendMessage(var2.obtainMessage(6, this.C.get(), var1));
   }

   protected void R(e2.c.c var1, int var2, PendingIntent var3) {
      e2.n.j(var1, "Connection progress callbacks cannot be null.");
      this.p = var1;
      Handler var4 = this.l;
      var4.sendMessage(var4.obtainMessage(3, this.C.get(), var2, var3));
   }

   public boolean S() {
      return false;
   }

   protected final String X() {
      String var2 = this.x;
      String var1 = var2;
      if (var2 == null) {
         var1 = this.h.getClass().getName();
      }

      return var1;
   }

   public boolean a() {
      Object var2 = this.m;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label134: {
         boolean var1;
         label133: {
            label132: {
               try {
                  if (this.t == 4) {
                     break label132;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label134;
               }

               var1 = false;
               break label133;
            }

            var1 = true;
         }

         label126:
         try {
            return var1;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label126;
         }
      }

      while(true) {
         Throwable var3 = var10000;

         try {
            throw var3;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   public void d(String var1) {
      this.f = var1;
      this.m();
   }

   public void e(i param1, Set param2) {
      // $FF: Couldn't be decompiled
   }

   protected final void e0(int var1, Bundle var2, int var3) {
      Handler var4 = this.l;
      var4.sendMessage(var4.obtainMessage(7, var3, -1, new z0(this, var1, (Bundle)null)));
   }

   public boolean f() {
      return true;
   }

   public int g() {
      return b2.f.a;
   }

   public void h(e2.c.c var1) {
      e2.n.j(var1, "Connection progress callbacks cannot be null.");
      this.p = var1;
      this.i0(2, (IInterface)null);
   }

   public boolean i() {
      Object var5 = this.m;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label150: {
         int var1;
         try {
            var1 = this.t;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label150;
         }

         boolean var3 = true;
         boolean var2 = var3;
         if (var1 != 2) {
            if (var1 == 3) {
               var2 = var3;
            } else {
               var2 = false;
            }
         }

         label141:
         try {
            return var2;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label141;
         }
      }

      while(true) {
         Throwable var4 = var10000;

         try {
            throw var4;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            continue;
         }
      }
   }

   public final b2.d[] j() {
      a1 var1 = this.B;
      return var1 == null ? null : var1.n;
   }

   public String k() {
      if (this.a()) {
         l1 var1 = this.g;
         if (var1 != null) {
            return var1.b();
         }
      }

      throw new RuntimeException("Failed to connect when checking package");
   }

   public String l() {
      return this.f;
   }

   public void m() {
      // $FF: Couldn't be decompiled
   }

   public boolean n() {
      return false;
   }

   public void p(e2.c.e var1) {
      var1.a();
   }

   public void q() {
      int var1 = this.k.h(this.h, this.g());
      if (var1 != 0) {
         this.i0(1, (IInterface)null);
         this.R(new e2.c.c(this) {
            final e2.c a;

            public {
               this.a = var1;
            }

            public final void c(b2.b var1) {
               if (var1.y()) {
                  e2.c var2 = this.a;
                  var2.e((i)null, var2.C());
               } else {
                  if (this.a.v != null) {
                     this.a.v.f(var1);
                  }

               }
            }
         }, var1, (PendingIntent)null);
      } else {
         this.h(new e2.c.c(this) {
            final e2.c a;

            public {
               this.a = var1;
            }

            public final void c(b2.b var1) {
               if (var1.y()) {
                  e2.c var2 = this.a;
                  var2.e((i)null, var2.C());
               } else {
                  if (this.a.v != null) {
                     this.a.v.f(var1);
                  }

               }
            }
         });
      }
   }

   protected final void r() {
      if (!this.a()) {
         throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
      }
   }

   protected abstract IInterface s(IBinder var1);

   protected boolean t() {
      return false;
   }

   public Account u() {
      return null;
   }

   public b2.d[] v() {
      return E;
   }

   protected Executor w() {
      return null;
   }

   public Bundle x() {
      return null;
   }

   public final Context y() {
      return this.h;
   }

   public int z() {
      return this.w;
   }

   public interface a {
      void h(int var1);

      void m(Bundle var1);
   }

   public interface b {
      void f(b2.b var1);
   }

   public interface c {
      void c(b2.b var1);
   }

   public interface e {
      void a();
   }
}
