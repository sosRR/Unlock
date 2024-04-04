package i3;

import android.content.Context;
import android.graphics.Color;
import n3.b;

public class a {
   private static final int f = (int)Math.round(5.1000000000000005);
   private final boolean a;
   private final int b;
   private final int c;
   private final int d;
   private final float e;

   public a(Context var1) {
      this(n3.b.b(var1, z2.b.p, false), f3.a.b(var1, z2.b.o, 0), f3.a.b(var1, z2.b.n, 0), f3.a.b(var1, z2.b.l, 0), var1.getResources().getDisplayMetrics().density);
   }

   public a(boolean var1, int var2, int var3, int var4, float var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   private boolean e(int var1) {
      boolean var2;
      if (androidx.core.graphics.a.j(var1, 255) == this.d) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public float a(float var1) {
      float var2 = this.e;
      return !(var2 <= 0.0F) && !(var1 <= 0.0F) ? Math.min(((float)Math.log1p((double)(var1 / var2)) * 4.5F + 2.0F) / 100.0F, 1.0F) : 0.0F;
   }

   public int b(int var1, float var2) {
      var2 = this.a(var2);
      int var4 = Color.alpha(var1);
      int var3 = f3.a.h(androidx.core.graphics.a.j(var1, 255), this.b, var2);
      var1 = var3;
      if (var2 > 0.0F) {
         int var5 = this.c;
         var1 = var3;
         if (var5 != 0) {
            var1 = f3.a.g(var3, androidx.core.graphics.a.j(var5, f));
         }
      }

      return androidx.core.graphics.a.j(var1, var4);
   }

   public int c(int var1, float var2) {
      int var3 = var1;
      if (this.a) {
         var3 = var1;
         if (this.e(var1)) {
            var3 = this.b(var1, var2);
         }
      }

      return var3;
   }

   public boolean d() {
      return this.a;
   }
}
