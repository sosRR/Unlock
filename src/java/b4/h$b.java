package b4;

import java.util.concurrent.Callable;

class h$b implements y2.a {
   final Callable a;
   final h b;

   h$b(h var1, Callable var2) {
      this.b = var1;
      this.a = var2;
   }

   public Object a(y2.g var1) {
      return this.a.call();
   }
}
