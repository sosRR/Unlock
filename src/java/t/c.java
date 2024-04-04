package t;

import android.view.View;
import p.e;

public abstract class c extends e {
   public abstract void b(View var1, float var2);

   public static class a extends c {
      public void b(View var1, float var2) {
      }

      public void c(View var1, float var2, double var3, double var5) {
         var1.setRotation(this.a(var2) + (float)Math.toDegrees(Math.atan2(var5, var3)));
      }
   }
}
