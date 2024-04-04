package n5;

import java.util.Collection;
import java.util.Iterator;

class n extends m {
   public static boolean g(Collection var0, Iterable var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "elements");
      if (var1 instanceof Collection) {
         return var0.addAll((Collection)var1);
      } else {
         Iterator var3 = var1.iterator();
         boolean var2 = false;

         while(var3.hasNext()) {
            if (var0.add(var3.next())) {
               var2 = true;
            }
         }

         return var2;
      }
   }
}
