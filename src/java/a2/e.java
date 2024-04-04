package a2;

import android.os.Looper;
import android.os.Message;

final class e extends p2.f {
   final c a;

   e(c var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      c.d(this.a, var1);
   }
}
