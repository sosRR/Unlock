package s;

import java.util.Iterator;

class g extends f {
   public int m;

   public g(p var1) {
      super(var1);
      if (var1 instanceof l) {
         super.e = null.n;
      } else {
         super.e = null.o;
      }

   }

   public void d(int var1) {
      if (!super.j) {
         super.j = true;
         super.g = var1;
         Iterator var2 = super.k.iterator();

         while(var2.hasNext()) {
            d var3 = (d)var2.next();
            var3.a(var3);
         }

      }
   }
}
