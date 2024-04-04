package n3;

import android.graphics.Typeface;

public final class a extends f {
   private final Typeface a;
   private final <undefinedtype> b;
   private boolean c;

   public a(Object var1, Typeface var2) {
      this.a = var2;
      this.b = var1;
   }

   private void d(Typeface var1) {
      if (!this.c) {
         this.b.a(var1);
      }

   }

   public void a(int var1) {
      this.d(this.a);
   }

   public void b(Typeface var1, boolean var2) {
      this.d(var1);
   }

   public void c() {
      this.c = true;
   }
}
