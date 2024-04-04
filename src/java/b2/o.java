package b2;

import java.util.concurrent.Callable;

// $FF: synthetic class
public final class o implements Callable {
   public final boolean a;
   public final String b;
   public final t c;

   // $FF: synthetic method
   public o(boolean var1, String var2, t var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Object call() {
      return x.c(this.a, this.b, this.c);
   }
}
