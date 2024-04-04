package l1;

import android.content.Context;

public final class l implements n1.b {
   private final l5.a a;
   private final l5.a b;

   public l(l5.a var1, l5.a var2) {
      this.a = var1;
      this.b = var2;
   }

   public static l a(l5.a var0, l5.a var1) {
      return new l(var0, var1);
   }

   public static k c(Context var0, Object var1) {
      return new k(var0, (i)var1);
   }

   public k b() {
      return c((Context)this.a.get(), this.b.get());
   }
}
