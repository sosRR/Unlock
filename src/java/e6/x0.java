package e6;

public abstract class x0 extends p implements g0, p0 {
   public y0 p;

   public boolean a() {
      return true;
   }

   public b1 b() {
      return null;
   }

   public void d() {
      this.t().Y(this);
   }

   public final y0 t() {
      y0 var1 = this.p;
      if (var1 != null) {
         return var1;
      } else {
         x5.g.o("job");
         return null;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(x.a(this));
      var1.append('@');
      var1.append(x.b(this));
      var1.append("[job@");
      var1.append(x.b(this.t()));
      var1.append(']');
      return var1.toString();
   }

   public final void u(y0 var1) {
      this.p = var1;
   }
}
