package j0;

import x5.g;

public final class d extends a {
   public d() {
      this((a)null, 1, (x5.e)null);
   }

   public d(a var1) {
      g.e(var1, "initialExtras");
      super();
      this.a().putAll(var1.a());
   }

   // $FF: synthetic method
   public d(a var1, int var2, x5.e var3) {
      if ((var2 & 1) != 0) {
         var1 = null.b;
      }

      this((a)var1);
   }

   public final void b(a.b var1, Object var2) {
      g.e(var1, "key");
      this.a().put(var1, var2);
   }
}
