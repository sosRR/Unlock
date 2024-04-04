package w3;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class p {
   static void a(List var0) {
      Set var3 = c(var0);
      Set var5 = b(var3);
      int var1 = 0;

      Iterator var4;
      while(!var5.isEmpty()) {
         b var7 = (b)var5.iterator().next();
         var5.remove(var7);
         int var2 = var1 + 1;
         var4 = var7.d().iterator();

         while(true) {
            var1 = var2;
            if (!var4.hasNext()) {
               break;
            }

            b var6 = (b)var4.next();
            var6.g(var7);
            if (var6.f()) {
               var5.add(var6);
            }
         }
      }

      if (var1 != var0.size()) {
         ArrayList var8 = new ArrayList();
         var4 = var3.iterator();

         while(var4.hasNext()) {
            b var9 = (b)var4.next();
            if (!var9.f() && !var9.e()) {
               var8.add(var9.c());
            }
         }

         throw new DependencyCycleException(var8);
      }
   }

   private static Set b(Set var0) {
      HashSet var1 = new HashSet();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         b var3 = (b)var2.next();
         if (var3.f()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private static Set c(List var0) {
      HashMap var1 = new HashMap(var0.size());
      Iterator var6 = var0.iterator();

      while(var6.hasNext()) {
         d var4 = (d)var6.next();
         b var3 = new b(var4);
         Iterator var2 = var4.g().iterator();

         while(var2.hasNext()) {
            Class var5 = (Class)var2.next();
            c var8 = new c(var5, var4.m() ^ true);
            if (!var1.containsKey(var8)) {
               var1.put(var8, new HashSet());
            }

            Set var7 = (Set)var1.get(var8);
            if (!var7.isEmpty() && !var8.b) {
               throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{var5}));
            }

            var7.add(var3);
         }
      }

      Iterator var9 = var1.values().iterator();

      while(var9.hasNext()) {
         Iterator var14 = ((Set)var9.next()).iterator();

         label66:
         while(var14.hasNext()) {
            b var12 = (b)var14.next();
            Iterator var13 = var12.c().e().iterator();

            while(true) {
               Set var16;
               do {
                  q var15;
                  do {
                     if (!var13.hasNext()) {
                        continue label66;
                     }

                     var15 = (q)var13.next();
                  } while(!var15.e());

                  var16 = (Set)var1.get(new c(var15.c(), var15.g()));
               } while(var16 == null);

               var6 = var16.iterator();

               while(var6.hasNext()) {
                  b var17 = (b)var6.next();
                  var12.a(var17);
                  var17.b(var12);
               }
            }
         }
      }

      HashSet var10 = new HashSet();
      Iterator var11 = var1.values().iterator();

      while(var11.hasNext()) {
         var10.addAll((Set)var11.next());
      }

      return var10;
   }

   private static class b {
      private final d a;
      private final Set b = new HashSet();
      private final Set c = new HashSet();

      b(d var1) {
         this.a = var1;
      }

      void a(b var1) {
         this.b.add(var1);
      }

      void b(b var1) {
         this.c.add(var1);
      }

      d c() {
         return this.a;
      }

      Set d() {
         return this.b;
      }

      boolean e() {
         return this.b.isEmpty();
      }

      boolean f() {
         return this.c.isEmpty();
      }

      void g(b var1) {
         this.c.remove(var1);
      }
   }

   private static class c {
      private final Class a;
      private final boolean b;

      private c(Class var1, boolean var2) {
         this.a = var1;
         this.b = var2;
      }

      // $FF: synthetic method
      c(Class var1, boolean var2, Object var3) {
         this(var1, var2);
      }

      public boolean equals(Object var1) {
         boolean var4 = var1 instanceof c;
         boolean var3 = false;
         boolean var2 = var3;
         if (var4) {
            c var5 = (c)var1;
            var2 = var3;
            if (var5.a.equals(this.a)) {
               var2 = var3;
               if (var5.b == this.b) {
                  var2 = true;
               }
            }
         }

         return var2;
      }

      public int hashCode() {
         return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
      }
   }
}
