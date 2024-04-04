package u0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

class c$b extends Property {
   private Rect a = new Rect();

   c$b(Class var1, String var2) {
      super(var1, var2);
   }

   public PointF a(Drawable var1) {
      var1.copyBounds(this.a);
      Rect var2 = this.a;
      return new PointF((float)var2.left, (float)var2.top);
   }

   public void b(Drawable var1, PointF var2) {
      var1.copyBounds(this.a);
      this.a.offsetTo(Math.round(var2.x), Math.round(var2.y));
      var1.setBounds(this.a);
   }
}
