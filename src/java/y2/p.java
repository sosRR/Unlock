package y2;

import java.util.concurrent.Executor;

final class p implements c0 {
   private final Executor a;
   private final a b;
   private final g0 c;

   public p(Executor var1, a var2, g0 var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void c(g var1) {
      this.a.execute(new o(this, var1));
   }
}
