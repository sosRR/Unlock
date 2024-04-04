package g1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

class a$a extends a {
   final y0.i n;
   final UUID o;

   a$a(y0.i var1, UUID var2) {
      this.n = var1;
      this.o = var2;
   }

   void h() {
      WorkDatabase var2 = this.n.s();
      var2.c();

      try {
         this.a(this.n, this.o.toString());
         var2.t();
      } finally {
         var2.g();
      }

      this.g(this.n);
   }
}
