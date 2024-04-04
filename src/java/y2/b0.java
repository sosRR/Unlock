package y2;

import java.util.concurrent.Executor;

final class b0 implements e, d, b, c0 {
   private final Executor a;
   private final f b;
   private final g0 c;

   public b0(Executor var1, f var2, g0 var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void a() {
      this.c.t();
   }

   public final void b(Object var1) {
      this.c.s(var1);
   }

   public final void c(g var1) {
      this.a.execute(new a0(this, var1));
   }

   public final void d(Exception var1) {
      this.c.r(var1);
   }
}
