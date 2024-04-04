package e6;

public abstract class a extends y0 implements o5.d {
   private final o5.f n;

   public final void K(Throwable var1) {
      v.a(this.n, var1);
   }

   public String Q() {
      String var2 = r.a(this.n);
      if (var2 == null) {
         return super.Q();
      } else {
         StringBuilder var1 = new StringBuilder();
         var1.append('"');
         var1.append(var2);
         var1.append("\":");
         var1.append(super.Q());
         return var1.toString();
      }
   }

   protected final void V(Object var1) {
      if (var1 instanceof n) {
         n var2 = (n)var1;
         this.k0(var2.a, var2.a());
      } else {
         this.l0(var1);
      }

   }

   public boolean a() {
      return super.a();
   }

   public final o5.f c() {
      return this.n;
   }

   public final void d(Object var1) {
      var1 = this.O(q.d(var1, (w5.l)null, 1, (Object)null));
      if (var1 != z0.b) {
         this.j0(var1);
      }
   }

   protected void j0(Object var1) {
      this.m(var1);
   }

   protected void k0(Throwable var1, boolean var2) {
   }

   protected void l0(Object var1) {
   }

   protected String r() {
      return x5.g.j(x.a(this), " was cancelled");
   }
}
