package s1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class r {
   private final Context a;
   private final l1.e b;
   private final t1.d c;
   private final x d;
   private final Executor e;
   private final u1.a f;
   private final v1.a g;
   private final v1.a h;
   private final t1.c i;

   public r(Context var1, l1.e var2, t1.d var3, x var4, Executor var5, u1.a var6, v1.a var7, v1.a var8, t1.c var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   // $FF: synthetic method
   public static void a(r var0, k1.o var1, int var2, Runnable var3) {
      var0.t(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Boolean b(r var0, k1.o var1) {
      return var0.l(var1);
   }

   // $FF: synthetic method
   public static Object c(r var0, Map var1) {
      return var0.q(var1);
   }

   // $FF: synthetic method
   public static Iterable d(r var0, k1.o var1) {
      return var0.m(var1);
   }

   // $FF: synthetic method
   public static Object e(r var0, Iterable var1, k1.o var2, long var3) {
      return var0.n(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Object f(r var0, k1.o var1, long var2) {
      return var0.r(var1, var2);
   }

   // $FF: synthetic method
   public static Object g(r var0, Iterable var1) {
      return var0.o(var1);
   }

   // $FF: synthetic method
   public static Object h(r var0, k1.o var1, int var2) {
      return var0.s(var1, var2);
   }

   // $FF: synthetic method
   public static Object i(r var0) {
      return var0.p();
   }

   // $FF: synthetic method
   private Boolean l(k1.o var1) {
      return this.c.A(var1);
   }

   // $FF: synthetic method
   private Iterable m(k1.o var1) {
      return this.c.r(var1);
   }

   // $FF: synthetic method
   private Object n(Iterable var1, k1.o var2, long var3) {
      this.c.G(var1);
      this.c.M(var2, this.g.a() + var3);
      return null;
   }

   // $FF: synthetic method
   private Object o(Iterable var1) {
      this.c.e(var1);
      return null;
   }

   // $FF: synthetic method
   private Object p() {
      this.i.g();
      return null;
   }

   // $FF: synthetic method
   private Object q(Map var1) {
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         this.i.f((long)(Integer)var3.getValue(), o1.c.b.s, (String)var3.getKey());
      }

      return null;
   }

   // $FF: synthetic method
   private Object r(k1.o var1, long var2) {
      this.c.M(var1, this.g.a() + var2);
      return null;
   }

   // $FF: synthetic method
   private Object s(k1.o var1, int var2) {
      this.d.a(var1, var2 + 1);
      return null;
   }

   // $FF: synthetic method
   private void t(k1.o var1, int var2, Runnable var3) {
      try {
         u1.a var5 = this.f;
         t1.d var6 = this.c;
         Objects.requireNonNull(var6);
         i var4 = new i(var6);
         var5.k(var4);
         if (!this.k()) {
            var5 = this.f;
            j var11 = new j(this, var1, var2);
            var5.k(var11);
         } else {
            this.u(var1, var2);
         }
      } catch (SynchronizationException var9) {
         this.d.a(var1, var2 + 1);
      } finally {
         var3.run();
      }

   }

   public k1.i j(l1.m var1) {
      u1.a var3 = this.f;
      t1.c var2 = this.i;
      Objects.requireNonNull(var2);
      o1.a var4 = (o1.a)var3.k(new h(var2));
      return var1.b(k1.i.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new k1.h(i1.b.b("proto"), var4.f())).d());
   }

   boolean k() {
      NetworkInfo var2 = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
      boolean var1;
      if (var2 != null && var2.isConnected()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   l1.g u(k1.o var1, int var2) {
      l1.m var9 = this.b.a(var1.b());
      long var3 = 0L;
      l1.g var8 = l1.g.e(0L);

      while(true) {
         while((Boolean)this.f.k(new k(this, var1))) {
            Iterable var10 = (Iterable)this.f.k(new l(this, var1));
            if (!var10.iterator().hasNext()) {
               return var8;
            }

            l1.g var12;
            if (var9 == null) {
               p1.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", var1);
               var12 = l1.g.a();
            } else {
               ArrayList var7 = new ArrayList();
               Iterator var13 = var10.iterator();

               while(var13.hasNext()) {
                  var7.add(((t1.k)var13.next()).b());
               }

               if (var1.e()) {
                  var7.add(this.j(var9));
               }

               var12 = var9.a(l1.f.a().b(var7).c(var1.c()).a());
            }

            if (var12.c() == l1.g.a.n) {
               this.f.k(new m(this, var10, var1, var3));
               this.d.b(var1, var2 + 1, true);
               return var12;
            }

            this.f.k(new n(this, var10));
            if (var12.c() == l1.g.a.m) {
               long var5 = Math.max(var3, var12.b());
               var3 = var5;
               var8 = var12;
               if (var1.e()) {
                  this.f.k(new o(this));
                  var3 = var5;
                  var8 = var12;
               }
            } else {
               var8 = var12;
               if (var12.c() == l1.g.a.p) {
                  HashMap var14 = new HashMap();
                  Iterator var11 = var10.iterator();

                  while(var11.hasNext()) {
                     String var15 = ((t1.k)var11.next()).b().j();
                     if (!var14.containsKey(var15)) {
                        var14.put(var15, 1);
                     } else {
                        var14.put(var15, (Integer)var14.get(var15) + 1);
                     }
                  }

                  this.f.k(new p(this, var14));
                  var8 = var12;
               }
            }
         }

         this.f.k(new q(this, var1, var3));
         return var8;
      }
   }

   public void v(k1.o var1, int var2, Runnable var3) {
      this.e.execute(new g(this, var1, var2, var3));
   }
}
