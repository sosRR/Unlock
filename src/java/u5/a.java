package u5;

import java.io.Closeable;

public final class a {
   public static final void a(Closeable var0, Throwable var1) {
      if (var0 != null) {
         if (var1 == null) {
            var0.close();
         } else {
            try {
               var0.close();
            } catch (Throwable var3) {
               m5.a.a(var1, var3);
               return;
            }
         }
      }

   }
}
