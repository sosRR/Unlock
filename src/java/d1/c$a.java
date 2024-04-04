package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class c$a extends BroadcastReceiver {
   final c a;

   c$a(c var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if (var2 != null) {
         this.a.h(var1, var2);
      }

   }
}
