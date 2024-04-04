package r1;

import android.content.Context;
import s1.x;

public final class i implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;
   private final l5.a d;

   public i(l5.a var1, l5.a var2, l5.a var3, l5.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public static i a(l5.a var0, l5.a var1, l5.a var2, l5.a var3) {
      return new i(var0, var1, var2, var3);
   }

   public static x c(Context var0, t1.d var1, s1.f var2, v1.a var3) {
      return (x)n1.d.c(h.a(var0, var1, var2, var3), "Cannot return null from a non-@Nullable @Provides method");
   }

   public x b() {
      return c((Context)this.a.get(), (t1.d)this.b.get(), (s1.f)this.c.get(), (v1.a)this.d.get());
   }
}
