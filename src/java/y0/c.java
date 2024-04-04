package y0;

import androidx.lifecycle.u;
import x0.n;

public class c implements n {
   private final u c = new u();
   private final androidx.work.impl.utils.futures.d d = androidx.work.impl.utils.futures.d.t();

   public c() {
      this.a(n.b);
   }

   public void a(n.b var1) {
      this.c.j(var1);
      if (var1 instanceof n.c) {
         this.d.p((n.c)var1);
      } else if (var1 instanceof n.a) {
         n.a var2 = (n.a)var1;
         this.d.q(var2.a());
      }

   }
}
