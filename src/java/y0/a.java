package y0;

import android.os.Handler;
import android.os.Looper;
import x0.s;

public class a implements s {
   private final Handler a = androidx.core.os.g.a(Looper.getMainLooper());

   public void a(long var1, Runnable var3) {
      this.a.postDelayed(var3, var1);
   }

   public void b(Runnable var1) {
      this.a.removeCallbacks(var1);
   }
}
