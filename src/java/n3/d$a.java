package n3;

import android.graphics.Typeface;

class d$a extends androidx.core.content.res.f.e {
   final f a;
   final d b;

   d$a(d var1, f var2) {
      this.b = var1;
      this.a = var2;
   }

   public void h(int var1) {
      d.c(this.b, true);
      this.a.a(var1);
   }

   public void i(Typeface var1) {
      d var2 = this.b;
      d.b(var2, Typeface.create(var1, var2.e));
      d.c(this.b, true);
      this.a.b(d.a(this.b), false);
   }
}
