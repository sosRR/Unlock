package b4;

import java.util.concurrent.Executor;

class j$d$a$a implements y2.f {
   final Executor a;
   final j$d$a b;

   j$d$a$a(j$d$a var1, Executor var2) {
      this.b = var1;
      this.a = var2;
   }

   public y2.g b(i4.d var1) {
      if (var1 == null) {
         y3.f.f().k("Received null app settings at app startup. Cannot send cached reports");
         return y2.j.e((Object)null);
      } else {
         j.n(this.b.b.b);
         j.h(this.b.b.b).u(this.a);
         this.b.b.b.q.e((Object)null);
         return y2.j.e((Object)null);
      }
   }
}
