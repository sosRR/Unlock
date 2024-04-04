package n5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class q extends p {
   public static final Collection h(Iterable var0, Collection var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "destination");
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(var2.next());
      }

      return var1;
   }

   public static List i(Iterable var0) {
      x5.g.e(var0, "<this>");
      if (var0 instanceof Collection) {
         Collection var2 = (Collection)var0;
         int var1 = var2.size();
         List var3;
         if (var1 != 0) {
            if (var1 != 1) {
               var3 = k(var2);
            } else {
               Object var4;
               if (var0 instanceof List) {
                  var4 = ((List)var0).get(0);
               } else {
                  var4 = var0.iterator().next();
               }

               var3 = h.a(var4);
            }
         } else {
            var3 = i.b();
         }

         return var3;
      } else {
         return g.d(j(var0));
      }
   }

   public static final List j(Iterable var0) {
      x5.g.e(var0, "<this>");
      return var0 instanceof Collection ? k((Collection)var0) : (List)h(var0, new ArrayList());
   }

   public static final List k(Collection var0) {
      x5.g.e(var0, "<this>");
      return new ArrayList(var0);
   }

   public static Set l(Iterable var0) {
      x5.g.e(var0, "<this>");
      if (var0 instanceof Collection) {
         Collection var2 = (Collection)var0;
         int var1 = var2.size();
         Set var3;
         if (var1 != 0) {
            if (var1 != 1) {
               var3 = (Set)h(var0, new LinkedHashSet(w.a(var2.size())));
            } else {
               Object var4;
               if (var0 instanceof List) {
                  var4 = ((List)var0).get(0);
               } else {
                  var4 = var0.iterator().next();
               }

               var3 = c0.a(var4);
            }
         } else {
            var3 = d0.b();
         }

         return var3;
      } else {
         return d0.c((Set)h(var0, new LinkedHashSet()));
      }
   }

   public static List m(Iterable var0, Iterable var1) {
      x5.g.e(var0, "<this>");
      x5.g.e(var1, "other");
      Iterator var2 = var0.iterator();
      Iterator var3 = var1.iterator();
      ArrayList var4 = new ArrayList(Math.min(g.f(var0, 10), g.f(var1, 10)));

      while(var2.hasNext() && var3.hasNext()) {
         var4.add(m5.m.a(var2.next(), var3.next()));
      }

      return var4;
   }
}
