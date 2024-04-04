package f5;

import androidx.preference.Preference;
import java.util.List;

class d$b implements Preference.d {
   final List a;
   final d b;

   d$b(d var1, List var2) {
      this.b = var1;
      this.a = var2;
   }

   public boolean a(Preference var1) {
      h6.a.b(d.g2()).a("onPreferenceClick");
      new g5.g(this.b.w1(), 2131820635, this.a, 2131820636);
      return true;
   }
}
