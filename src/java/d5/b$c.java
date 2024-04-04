package d5;

import java.util.Objects;

class b$c implements y2.c {
   final b a;

   b$c(b var1) {
      this.a = var1;
   }

   public void a(y2.g var1) {
      if (!var1.o()) {
         h6.a.b(b.a()).m(var1.j(), "getToken failed");
      } else {
         b var2 = this.a;
         String var3 = (String)var1.k();
         Objects.requireNonNull(var3);
         var2.i(var3);
      }
   }
}
