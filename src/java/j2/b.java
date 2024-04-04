package j2;

import android.os.Process;

final class b implements Runnable {
   private final Runnable m;

   public b(Runnable var1, int var2) {
      this.m = var1;
   }

   public final void run() {
      Process.setThreadPriority(0);
      this.m.run();
   }
}
