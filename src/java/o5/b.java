package o5;

import w5.l;

public abstract class b implements f.c {
   private final l m;
   private final f.c n;

   public b(f.c var1, l var2) {
      x5.g.e(var1, "baseKey");
      x5.g.e(var2, "safeCast");
      super();
      this.m = var2;
      f.c var3 = var1;
      if (var1 instanceof b) {
         var3 = ((b)var1).n;
      }

      this.n = var3;
   }

   public final boolean a(f.c var1) {
      x5.g.e(var1, "key");
      boolean var2;
      if (var1 != this && this.n != var1) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public final <undefinedtype> b(Object var1) {
      x5.g.e(var1, "element");
      return (<undefinedtype>)this.m.c(var1);
   }
}
