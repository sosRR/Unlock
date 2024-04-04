package i2;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

@Deprecated
public final class j {
   public static void a(@Nullable Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var1) {
         }
      }

   }
}
