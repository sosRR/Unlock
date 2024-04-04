package u0;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

class c$f extends Property {
   c$f(Class var1, String var2) {
      super(var1, var2);
   }

   public PointF a(View var1) {
      return null;
   }

   public void b(View var1, PointF var2) {
      z.f(var1, Math.round(var2.x), Math.round(var2.y), var1.getRight(), var1.getBottom());
   }
}
