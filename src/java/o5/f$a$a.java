package o5;

import w5.p;
import x5.h;

final class f$a$a extends h implements p {
   public static final f$a$a n = new f$a$a();

   f$a$a() {
      super(2);
   }

   public final f d(f var1, Object var2) {
      x5.g.e(var1, "acc");
      x5.g.e(var2, "element");
      f var4 = var1.minusKey(((<undefinedtype>)var2).getKey());
      g var6 = g.m;
      if (var4 != var6) {
         e.b var5 = e.l;
         e var3 = (e)var4.get(var5);
         c var7;
         if (var3 == null) {
            var7 = new c(var4, (<undefinedtype>)var2);
         } else {
            var4 = var4.minusKey(var5);
            if (var4 == var6) {
               var2 = new c((f)var2, var3);
               return (f)var2;
            }

            var7 = new c(new c(var4, (<undefinedtype>)var2), var3);
         }

         var2 = var7;
      }

      return (f)var2;
   }
}
