package q3;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {
   private final float a;

   public a(float var1) {
      this.a = var1;
   }

   public float a(RectF var1) {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof a)) {
         return false;
      } else {
         a var3 = (a)var1;
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
