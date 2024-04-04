package f5;

import android.view.View;
import com.tmobile.rsuapp.services.SimLockService;

class g$b implements View.OnClickListener {
   final g m;

   g$b(g var1) {
      this.m = var1;
   }

   public void onClick(View var1) {
      SimLockService.A(this.m.u1(), "com.tmobile.rsuapp.SHOW_RESTART_REMINDER_NOTIFICATION");
      this.m.u1().finishAndRemoveTask();
   }
}
