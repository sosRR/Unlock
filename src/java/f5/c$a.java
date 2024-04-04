package f5;

import android.net.Uri;
import androidx.preference.Preference;
import com.tmobile.rsuapp.MainActivity;
import com.tmobile.rsuapp.services.SimLockService;

class c$a implements Preference.d {
   final c a;

   c$a(c var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static void b(c$a var0, int var1, androidx.work.b var2) {
      var0.c(var1, var2);
   }

   // $FF: synthetic method
   private void c(int var1, androidx.work.b var2) {
      var2.j("key-action");
      var2.j("key-result-string");
      ((MainActivity)this.a.y()).Y();
      if (c.h2(this.a) != null) {
         if (var1 == 0) {
            ((MainActivity)this.a.y()).b0(g.class);
         } else if (!((MainActivity)this.a.w1()).Z()) {
            ((MainActivity)this.a.w1()).b0(e.class);
         } else if (var1 != 4 && var1 != 3) {
            new g5.g(this.a.w1(), 2131820625, d5.e.c(this.a.w1()), 2131820644);
         } else {
            ((MainActivity)this.a.y()).b0(f.class);
         }
      }

   }

   public boolean a(Preference var1) {
      c.g2(this.a);
      SimLockService.B(this.a.u1(), "com.tmobile.rsuapp.PERMANENT_UNLOCK", (Uri)null, (androidx.work.b)null, new b(this));
      ((MainActivity)this.a.y()).g0("Activating your permanent unlock.");
      return true;
   }
}
