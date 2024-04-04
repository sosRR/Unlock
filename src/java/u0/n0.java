package u0;

import android.view.View;
import android.view.WindowId;

class n0 implements o0 {
   private final WindowId a;

   n0(View var1) {
      this.a = var1.getWindowId();
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof n0 && ((n0)var1).a.equals(this.a)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
