package c5;

import java.util.Iterator;
import java.util.Set;
import w3.q;

public class c implements i {
   private final String a;
   private final d b;

   c(Set var1, d var2) {
      this.a = e(var1);
      this.b = var2;
   }

   // $FF: synthetic method
   public static i b(w3.e var0) {
      return d(var0);
   }

   public static w3.d c() {
      return w3.d.c(i.class).b(q.l(f.class)).f(new b()).d();
   }

   // $FF: synthetic method
   private static i d(w3.e var0) {
      return new c(var0.b(f.class), d.a());
   }

   private static String e(Set var0) {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         f var3 = (f)var2.next();
         var1.append(var3.b());
         var1.append('/');
         var1.append(var3.c());
         if (var2.hasNext()) {
            var1.append(' ');
         }
      }

      return var1.toString();
   }

   public String a() {
      if (this.b.b().isEmpty()) {
         return this.a;
      } else {
         StringBuilder var1 = new StringBuilder();
         var1.append(this.a);
         var1.append(' ');
         var1.append(e(this.b.b()));
         return var1.toString();
      }
   }
}
