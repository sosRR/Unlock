package n5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class z extends y {
   public static Map d() {
      t var0 = t.m;
      x5.g.c(var0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
      return var0;
   }

   public static final Map e(Map var0) {
      x5.g.e(var0, "<this>");
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 == 1) {
            var0 = y.c(var0);
         }
      } else {
         var0 = w.d();
      }

      return var0;
   }

   public static final void f(Map var0, Iterable var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "pairs");
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         m5.i var2 = (m5.i)var3.next();
         var0.put(var2.a(), var2.b());
      }

   }

   public static Map g(Iterable var0) {
      x5.g.e(var0, "<this>");
      if (var0 instanceof Collection) {
         Collection var2 = (Collection)var0;
         int var1 = var2.size();
         Map var3;
         if (var1 != 0) {
            if (var1 != 1) {
               var3 = h(var0, new LinkedHashMap(w.a(var2.size())));
            } else {
               Object var4;
               if (var0 instanceof List) {
                  var4 = ((List)var0).get(0);
               } else {
                  var4 = var0.iterator().next();
               }

               var3 = y.b((m5.i)var4);
            }
         } else {
            var3 = w.d();
         }

         return var3;
      } else {
         return e(h(var0, new LinkedHashMap()));
      }
   }

   public static final Map h(Iterable var0, Map var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "destination");
      f(var1, var0);
      return var1;
   }

   public static Map i(Map var0) {
      x5.g.e(var0, "<this>");
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 != 1) {
            var0 = j(var0);
         } else {
            var0 = y.c(var0);
         }
      } else {
         var0 = w.d();
      }

      return var0;
   }

   public static final Map j(Map var0) {
      x5.g.e(var0, "<this>");
      return new LinkedHashMap(var0);
   }
}
