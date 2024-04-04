package e6;

import java.util.concurrent.CancellationException;

// $FF: synthetic class
final class w0 {
   public static final void a(o5.f var0, CancellationException var1) {
      t0 var2 = (t0)var0.get(t0.k);
      if (var2 != null) {
         var2.E(var1);
      }

   }

   // $FF: synthetic method
   public static void b(o5.f var0, CancellationException var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = null;
      }

      v0.a(var0, var1);
   }
}
