package f5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.preference.Preference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class c extends androidx.preference.i {
   private final String w0 = c.class.getSimpleName();
   private final Handler x0 = new Handler(Looper.getMainLooper());

   // $FF: synthetic method
   static String g2(c var0) {
      return var0.w0;
   }

   // $FF: synthetic method
   static Handler h2(c var0) {
      return var0.x0;
   }

   public void W1(Bundle var1, String var2) {
      h6.a.b(this.w0).a("onCreatePreferences");
      this.e2(2132017152, var2);
      Calendar var5 = Calendar.getInstance();
      var5.setTimeInMillis(d5.e.g(this.w1()));
      Preference var3 = this.e("status_temporary_unlocked");
      Preference var6 = this.e("full_unlock_eligible");
      Preference var4 = this.e("full_unlock_activate");
      var3.w0(this.Z(2131820634, new Object[]{(new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format(var5.getTime())}));
      if (d5.e.m(this.w1())) {
         var4.A0(true);
         var6.A0(false);
         var4.t0(new c$a(this));
      } else {
         var6.A0(true);
         var4.A0(false);
         var6.t0(new c$b(this));
      }

   }
}
