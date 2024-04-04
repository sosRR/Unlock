package l1;

import android.content.Context;

public final class j implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;

   public j(l5.a var1, l5.a var2, l5.a var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static j a(l5.a var0, l5.a var1, l5.a var2) {
      return new j(var0, var1, var2);
   }

   public static i c(Context var0, v1.a var1, v1.a var2) {
      return new i(var0, var1, var2);
   }

   public i b() {
      return c((Context)this.a.get(), (v1.a)this.b.get(), (v1.a)this.c.get());
   }
}
