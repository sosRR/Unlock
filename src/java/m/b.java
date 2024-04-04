package m;

import android.content.res.ColorStateList;

class b implements d {
   private e n(c var1) {
      return (e)var1.e();
   }

   public float a(c var1) {
      return this.n(var1).c();
   }

   public void b(c var1, float var2) {
      this.n(var1).h(var2);
   }

   public ColorStateList c(c var1) {
      return this.n(var1).b();
   }

   public float d(c var1) {
      return var1.b().getElevation();
   }

   public void e(c var1, ColorStateList var2) {
      this.n(var1).f(var2);
   }

   public void f(c var1) {
      this.h(var1, this.a(var1));
   }

   public void g() {
   }

   public void h(c var1, float var2) {
      this.n(var1).g(var2, var1.d(), var1.c());
      this.o(var1);
   }

   public float i(c var1) {
      return this.n(var1).d();
   }

   public float j(c var1) {
      return this.i(var1) * 2.0F;
   }

   public float k(c var1) {
      return this.i(var1) * 2.0F;
   }

   public void l(c var1, float var2) {
      var1.b().setElevation(var2);
   }

   public void m(c var1) {
      this.h(var1, this.a(var1));
   }

   public void o(c var1) {
      if (!var1.d()) {
         var1.a(0, 0, 0, 0);
      } else {
         float var3 = this.a(var1);
         float var2 = this.i(var1);
         int var4 = (int)Math.ceil((double)f.a(var3, var2, var1.c()));
         int var5 = (int)Math.ceil((double)f.b(var3, var2, var1.c()));
         var1.a(var4, var5, var4, var5);
      }
   }
}
