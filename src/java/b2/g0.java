package b2;

import java.util.concurrent.Callable;

final class g0 extends h0 {
   private final Callable e;

   // $FF: synthetic method
   g0(Callable var1, f0 var2) {
      super(false, (String)null, (Throwable)null);
      this.e = var1;
   }

   final String a() {
      try {
         String var1 = (String)this.e.call();
         return var1;
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }
}
