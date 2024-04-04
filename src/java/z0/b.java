package z0;

import android.content.Context;
import android.text.TextUtils;
import b1.c;
import b1.d;
import f1.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.k;
import x0.u;
import y0.e;
import y0.i;

public class b implements e, c, y0.b {
   private static final String u = k.f("GreedyScheduler");
   private final Context m;
   private final i n;
   private final d o;
   private final Set p = new HashSet();
   private a q;
   private boolean r;
   private final Object s;
   Boolean t;

   public b(Context var1, androidx.work.a var2, h1.a var3, i var4) {
      this.m = var1;
      this.n = var4;
      this.o = new d(var1, var3, this);
      this.q = new a(this, var2.k());
      this.s = new Object();
   }

   private void g() {
      androidx.work.a var1 = this.n.m();
      this.t = g1.i.b(this.m, var1);
   }

   private void h() {
      if (!this.r) {
         this.n.q().d(this);
         this.r = true;
      }

   }

   private void i(String var1) {
      Object var2 = this.s;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label210: {
         Iterator var3;
         try {
            var3 = this.p.iterator();
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label210;
         }

         try {
            while(var3.hasNext()) {
               p var4 = (p)var3.next();
               if (var4.a.equals(var1)) {
                  k.c().a(u, String.format("Stopping tracking for %s", new Object[]{var1}));
                  this.p.remove(var4);
                  this.o.d(this.p);
                  break;
               }
            }
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label210;
         }

         label200:
         try {
            return;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label200;
         }
      }

      while(true) {
         Throwable var26 = var10000;

         try {
            throw var26;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            continue;
         }
      }
   }

   public void a(String var1, boolean var2) {
      this.i(var1);
   }

   public void b(String var1) {
      if (this.t == null) {
         this.g();
      }

      if (!this.t) {
         k.c().d(u, "Ignoring schedule request in non-main process");
      } else {
         this.h();
         k.c().a(u, String.format("Cancelling work ID %s", new Object[]{var1}));
         a var2 = this.q;
         if (var2 != null) {
            var2.b(var1);
         }

         this.n.B(var1);
      }
   }

   public void c(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         String var2 = (String)var3.next();
         k.c().a(u, String.format("Constraints not met: Cancelling work ID %s", new Object[]{var2}));
         this.n.B(var2);
      }

   }

   public void d(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         k.c().a(u, String.format("Constraints met: Scheduling work ID %s", new Object[]{var3}));
         this.n.y(var3);
      }

   }

   public boolean e() {
      return false;
   }

   public void f(p... var1) {
      if (this.t == null) {
         this.g();
      }

      if (!this.t) {
         k.c().d(u, "Ignoring schedule request in a secondary process");
      } else {
         this.h();
         HashSet var8 = new HashSet();
         HashSet var9 = new HashSet();
         int var3 = var1.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            p var11 = var1[var2];
            long var6 = var11.a();
            long var4 = System.currentTimeMillis();
            if (var11.b == u.a.m) {
               if (var4 < var6) {
                  a var10 = this.q;
                  if (var10 != null) {
                     var10.a(var11);
                  }
               } else if (var11.b()) {
                  if (var11.j.h()) {
                     k.c().a(u, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{var11}));
                  } else if (var11.j.e()) {
                     k.c().a(u, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{var11}));
                  } else {
                     var8.add(var11);
                     var9.add(var11.a);
                  }
               } else {
                  k.c().a(u, String.format("Starting work for %s", new Object[]{var11.a}));
                  this.n.y(var11.a);
               }
            }
         }

         Object var25 = this.s;
         synchronized(var25){}

         Throwable var10000;
         boolean var10001;
         label259: {
            try {
               if (!var8.isEmpty()) {
                  k.c().a(u, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", var9)}));
                  this.p.addAll(var8);
                  this.o.d(this.p);
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label259;
            }

            label256:
            try {
               return;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label256;
            }
         }

         while(true) {
            Throwable var26 = var10000;

            try {
               throw var26;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
