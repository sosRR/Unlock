package d2;

import android.os.IBinder;

// $FF: synthetic class
public final class s implements Runnable {
   public final g m;
   public final IBinder n;

   // $FF: synthetic method
   public s(g var1, IBinder var2) {
      this.m = var1;
      this.n = var2;
   }

   public final void run() {
      this.m.q(this.n);
   }
}
