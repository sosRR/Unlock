package f5;

import android.net.Uri;
import androidx.preference.Preference;
import com.tmobile.rsuapp.MainActivity;
import com.tmobile.rsuapp.services.SimLockService;

class d$a implements Preference.d {
   final d a;

   d$a(d var1) {
      this.a = var1;
   }

   public boolean a(Preference var1) {
      h6.a.b(d.g2()).a("onPreferenceClick");
      SimLockService.B(this.a.u1(), "com.tmobile.rsuapp.TEMPORARY_UNLOCK", (Uri)null, (androidx.work.b)null, d.h2(this.a));
      ((MainActivity)this.a.w1()).g0("Activating your temporary unlock.");
      return true;
   }
}
