package d5;

import android.content.Context;
import g5.h;

class d$a implements h {
   private final Context a;

   d$a(Context var1) {
      this.a = var1;
   }

   public void a(int var1, androidx.work.b var2) {
      String var3 = var2.j("key-action");
      var2.j("key-result-string");
      if ("com.tmobile.rsuapp.CHECK_LOCK_STATUS".equals(var3)) {
         if (var1 == 0) {
            h6.a.b(d.a()).a("Successfully retrieved modem timer");
            d.b(this.a);
         } else {
            h6.a.b(d.a()).k("Could not retrieve modem timer");
         }
      }

   }
}
