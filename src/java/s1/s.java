package s1;

import android.content.Context;
import java.util.concurrent.Executor;

public final class s implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;
   private final l5.a d;
   private final l5.a e;
   private final l5.a f;
   private final l5.a g;
   private final l5.a h;
   private final l5.a i;

   public s(l5.a var1, l5.a var2, l5.a var3, l5.a var4, l5.a var5, l5.a var6, l5.a var7, l5.a var8, l5.a var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   public static s a(l5.a var0, l5.a var1, l5.a var2, l5.a var3, l5.a var4, l5.a var5, l5.a var6, l5.a var7, l5.a var8) {
      return new s(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static r c(Context var0, l1.e var1, t1.d var2, x var3, Executor var4, u1.a var5, v1.a var6, v1.a var7, t1.c var8) {
      return new r(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public r b() {
      return c((Context)this.a.get(), (l1.e)this.b.get(), (t1.d)this.c.get(), (x)this.d.get(), (Executor)this.e.get(), (u1.a)this.f.get(), (v1.a)this.g.get(), (v1.a)this.h.get(), (t1.c)this.i.get());
   }
}
