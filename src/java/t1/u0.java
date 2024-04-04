package t1;

import android.content.Context;

public final class u0 implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;

   public u0(l5.a var1, l5.a var2, l5.a var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static u0 a(l5.a var0, l5.a var1, l5.a var2) {
      return new u0(var0, var1, var2);
   }

   public static t0 c(Context var0, String var1, int var2) {
      return new t0(var0, var1, var2);
   }

   public t0 b() {
      return c((Context)this.a.get(), (String)this.b.get(), (Integer)this.c.get());
   }
}
