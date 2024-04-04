package a2;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

// $FF: synthetic class
public final class m implements y2.a {
   public static final m a = new m();

   // $FF: synthetic method
   private m() {
   }

   public final Object a(y2.g var1) {
      if (var1.o()) {
         return (Bundle)var1.k();
      } else {
         if (Log.isLoggable("Rpc", 3)) {
            String var2 = String.valueOf(var1.j());
            StringBuilder var3 = new StringBuilder(var2.length() + 22);
            var3.append("Error making request: ");
            var3.append(var2);
         }

         throw new IOException("SERVICE_NOT_AVAILABLE", var1.j());
      }
   }
}
