package u0;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

class c$g extends Property {
   c$g(Class var1, String var2) {
      super(var1, var2);
   }

   public PointF a(View var1) {
      return null;
   }

   public void b(View var1, PointF var2) {
      int var4 = Math.round(var2.x);
      int var3 = Math.round(var2.y);
      z.f(var1, var4, var3, var1.getWidth() + var4, var1.getHeight() + var3);
   }
}
