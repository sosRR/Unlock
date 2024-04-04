package q3;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {
   private final c a;
   private final float b;

   public b(float var1, c var2) {
      while(var2 instanceof b) {
         var2 = ((b)var2).a;
         var1 += ((b)var2).b;
      }

      this.a = var2;
      this.b = var1;
   }

   public float a(RectF var1) {
      return Math.max(0.0F, this.a.a(var1) + this.b);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof b)) {
         return false;
      } else {
         b var3 = (b)var1;
         if (!this.a.equals(var3.a) || this.b != var3.b) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return Arrays.hashCode(new Object[]{this.a, this.b});
   }
}
