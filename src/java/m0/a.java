package m0;

import androidx.room.h;
import q0.f;

public abstract class a extends d {
   public a(h var1) {
      super(var1);
   }

   protected abstract void g(f var1, Object var2);

   public final void h(Object var1) {
      f var2 = this.a();

      try {
         this.g(var2, var1);
         var2.J();
      } finally {
         this.f(var2);
      }

   }
}
