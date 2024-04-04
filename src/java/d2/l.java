package d2;

import android.os.Handler;
import java.util.concurrent.Executor;

// $FF: synthetic class
public final class l implements Executor {
   public final Handler m;

   // $FF: synthetic method
   public l(Handler var1) {
      this.m = var1;
   }

   public final void execute(Runnable var1) {
      this.m.post(var1);
   }
}
