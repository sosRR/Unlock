package u0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class t implements u {
   private final ViewGroupOverlay a;

   t(ViewGroup var1) {
      this.a = var1.getOverlay();
   }

   public void a(View var1) {
      this.a.add(var1);
   }

   public void b(Drawable var1) {
      this.a.add(var1);
   }

   public void c(View var1) {
      this.a.remove(var1);
   }

   public void d(Drawable var1) {
      this.a.remove(var1);
   }
}
