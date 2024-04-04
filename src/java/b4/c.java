package b4;

import android.os.Process;

public abstract class c implements Runnable {
   protected abstract void a();

   public final void run() {
      Process.setThreadPriority(10);
      this.a();
   }
}
