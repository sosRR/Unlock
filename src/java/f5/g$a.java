package f5;

import android.view.View;
import com.tmobile.rsuapp.services.SimLockService;

class g$a implements View.OnClickListener {
   final g m;

   g$a(g var1) {
      this.m = var1;
   }

   public void onClick(View var1) {
      SimLockService.A(this.m.u1(), "com.tmobile.rsuapp.REBOOT_DEVICE");
      this.m.u1().finishAndRemoveTask();
   }
}
