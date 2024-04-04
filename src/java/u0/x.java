package u0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class x implements y {
   private final ViewOverlay a;

   x(View var1) {
      this.a = var1.getOverlay();
   }

   public void b(Drawable var1) {
      this.a.add(var1);
   }

   public void d(Drawable var1) {
      this.a.remove(var1);
   }
}
