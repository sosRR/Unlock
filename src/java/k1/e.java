package k1;

import android.content.Context;
import s1.w;
import t1.n0;
import t1.u0;

final class e extends u {
   private l5.a m;
   private l5.a n;
   private l5.a o;
   private l5.a p;
   private l5.a q;
   private l5.a r;
   private l5.a s;
   private l5.a t;
   private l5.a u;
   private l5.a v;
   private l5.a w;
   private l5.a x;
   private l5.a y;

   private e(Context var1) {
      this.k(var1);
   }

   // $FF: synthetic method
   e(Context var1, e$a var2) {
      this(var1);
   }

   public static u.a g() {
      return new b((e$a)null);
   }

   private void k(Context var1) {
      this.m = n1.a.b(k.a());
      n1.b var5 = n1.c.a(var1);
      this.n = var5;
      l1.j var6 = l1.j.a(var5, v1.c.a(), v1.d.a());
      this.o = var6;
      this.p = n1.a.b(l1.l.a(this.n, var6));
      this.q = u0.a(this.n, t1.g.a(), t1.i.a());
      this.r = t1.h.a(this.n);
      this.s = n1.a.b(n0.a(v1.c.a(), v1.d.a(), t1.j.a(), this.q, this.r));
      r1.g var7 = r1.g.b(v1.c.a());
      this.t = var7;
      r1.i var4 = r1.i.a(this.n, this.s, var7, v1.d.a());
      this.u = var4;
      l5.a var8 = this.m;
      l5.a var3 = this.p;
      l5.a var2 = this.s;
      this.v = r1.d.a(var8, var3, var4, var2, var2);
      var8 = this.n;
      var2 = this.p;
      var3 = this.s;
      this.w = s1.s.a(var8, var2, var3, this.u, this.m, var3, v1.c.a(), v1.d.a(), this.s);
      var8 = this.m;
      var2 = this.s;
      this.x = s1.w.a(var8, var2, this.u, var2);
      this.y = n1.a.b(k1.v.a(v1.c.a(), v1.d.a(), this.v, this.w, this.x));
   }

   t1.d a() {
      return (t1.d)this.s.get();
   }

   t f() {
      return (t)this.y.get();
   }

   private static final class b implements u.a {
      private Context a;

      private b() {
      }

      // $FF: synthetic method
      b(e$a var1) {
         this();
      }

      public b b(Context var1) {
         this.a = (Context)n1.d.b(var1);
         return this;
      }

      public u build() {
         n1.d.a(this.a, Context.class);
         return new e(this.a, (e$a)null);
      }
   }
}
