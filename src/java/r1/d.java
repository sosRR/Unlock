package r1;

import java.util.concurrent.Executor;
import s1.x;

public final class d implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;
   private final l5.a d;
   private final l5.a e;

   public d(l5.a var1, l5.a var2, l5.a var3, l5.a var4, l5.a var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public static d a(l5.a var0, l5.a var1, l5.a var2, l5.a var3, l5.a var4) {
      return new d(var0, var1, var2, var3, var4);
   }

   public static c c(Executor var0, l1.e var1, x var2, t1.d var3, u1.a var4) {
      return new c(var0, var1, var2, var3, var4);
   }

   public c b() {
      return c((Executor)this.a.get(), (l1.e)this.b.get(), (x)this.c.get(), (t1.d)this.d.get(), (u1.a)this.e.get());
   }
}
