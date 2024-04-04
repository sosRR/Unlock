package c6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class h extends g {
   public static final Collection c(b var0, Collection var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "destination");
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(var2.next());
      }

      return var1;
   }

   public static List d(b var0) {
      x5.g.e(var0, "<this>");
      return n5.g.d(e(var0));
   }

   public static final List e(b var0) {
      x5.g.e(var0, "<this>");
      return (List)c(var0, new ArrayList());
   }
}
