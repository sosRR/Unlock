package f1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class p$a implements l.a {
   public List a(List var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var1.size());
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            var2.add(((p.c)var3.next()).a());
         }

         return var2;
      }
   }
}
