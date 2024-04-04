package t;

import android.view.View;

public abstract class b extends p.d {
   public abstract void b(View var1, float var2);

   public static class a extends t.b {
      public void b(View var1, float var2) {
      }

      public void c(View var1, float var2, double var3, double var5) {
         var1.setRotation(this.a(var2) + (float)Math.toDegrees(Math.atan2(var5, var3)));
      }
   }
}
