package s1;

import java.util.concurrent.Executor;

public final class w implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;
   private final l5.a d;

   public w(l5.a var1, l5.a var2, l5.a var3, l5.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public static w a(l5.a var0, l5.a var1, l5.a var2, l5.a var3) {
      return new w(var0, var1, var2, var3);
   }

   public static v c(Executor var0, t1.d var1, x var2, u1.a var3) {
      return new v(var0, var1, var2, var3);
   }

   public v b() {
      return c((Executor)this.a.get(), (t1.d)this.b.get(), (x)this.c.get(), (u1.a)this.d.get());
   }
}
