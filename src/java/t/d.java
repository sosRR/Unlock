package t;

import android.view.View;
import p.f;

public abstract class d extends f {
   public float a(float var1, long var2, View var4, p.c var5) {
      super.a.c((double)var1, super.g);
      float[] var8 = super.g;
      var1 = var8[1];
      if (var1 == 0.0F) {
         super.h = false;
         return var8[2];
      } else if (Float.isNaN(super.j)) {
         throw null;
      } else {
         long var6 = super.i;
         super.j = (float)(((double)super.j + (double)(var2 - var6) * 1.0E-9 * (double)var1) % 1.0);
         throw null;
      }
   }

   public abstract boolean b(View var1, float var2, long var3, p.c var5);

   public static class a extends d {
      public boolean b(View var1, float var2, long var3, p.c var5) {
         return super.h;
      }

      public boolean c(View var1, p.c var2, float var3, long var4, double var6, double var8) {
         var1.setRotation(this.a(var3, var4, var1, var2) + (float)Math.toDegrees(Math.atan2(var8, var6)));
         return super.h;
      }
   }
}
