package j0;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import x5.g;

public final class b implements h0.b {
   private final f[] b;

   public b(f... var1) {
      g.e(var1, "initializers");
      super();
      this.b = var1;
   }

   public g0 b(Class var1, a var2) {
      g.e(var1, "modelClass");
      g.e(var2, "extras");
      f[] var6 = this.b;
      int var4 = var6.length;
      int var3 = 0;

      g0 var5;
      for(var5 = null; var3 < var4; ++var3) {
         f var7 = var6[var3];
         if (g.a(var7.a(), var1)) {
            Object var9 = var7.b().c(var2);
            if (var9 instanceof g0) {
               var5 = (g0)var9;
            } else {
               var5 = null;
            }
         }
      }

      if (var5 != null) {
         return var5;
      } else {
         StringBuilder var8 = new StringBuilder();
         var8.append("No initializer set for given class ");
         var8.append(var1.getName());
         throw new IllegalArgumentException(var8.toString());
      }
   }
}
