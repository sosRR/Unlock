package s5;

import x5.g;

public class a extends r5.a {
   public void a(Throwable var1, Throwable var2) {
      g.e(var1, "cause");
      g.e(var2, "exception");
      var1.addSuppressed(var2);
   }
}
