package y2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class f0 implements Executor {
   private final Handler m = new s2.a(Looper.getMainLooper());

   public f0() {
   }

   public final void execute(Runnable var1) {
      this.m.post(var1);
   }
}
