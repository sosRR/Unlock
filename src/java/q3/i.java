package q3;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {
   private final float a;

   public i(float var1) {
      this.a = var1;
   }

   public float a(RectF var1) {
      return this.a * var1.height();
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof i)) {
         return false;
      } else {
         i var3 = (i)var1;
         if (this.a != var3.a) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return Arrays.hashCode(new Object[]{this.a});
   }
}
