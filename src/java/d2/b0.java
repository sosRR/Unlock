package d2;

import java.util.concurrent.atomic.AtomicReference;

// $FF: synthetic class
public final class b0 {
   // $FF: synthetic method
   public static boolean a(AtomicReference var0, Object var1, Object var2) {
      do {
         if (var0.compareAndSet(var1, var2)) {
            return true;
         }
      } while(var0.get() == var1);

      return false;
   }
}
