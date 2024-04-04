package a2;

import android.util.Log;
import java.io.IOException;

// $FF: synthetic class
public final class p implements Runnable {
   public final y2.h m;

   // $FF: synthetic method
   public p(y2.h var1) {
      this.m = var1;
   }

   public final void run() {
      if (this.m.d(new IOException("TIMEOUT"))) {
         Log.w("Rpc", "No response");
      }

   }
}
