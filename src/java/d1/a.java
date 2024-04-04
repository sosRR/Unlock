package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x0.k;

public class a extends c {
   private static final String i = k.f("BatteryChrgTracker");

   public a(Context var1, h1.a var2) {
      super(var1, var2);
   }

   private boolean j(Intent var1) {
      int var2 = var1.getIntExtra("status", -1);
      boolean var3;
      if (var2 != 2 && var2 != 5) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public IntentFilter g() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("android.os.action.CHARGING");
      var1.addAction("android.os.action.DISCHARGING");
      return var1;
   }

   public void h(Context var1, Intent var2) {
      if (var6 != null) {
         byte var3;
         label39: {
            k var4 = k.c();
            String var5 = i;
            var3 = 1;
            var4.a(var5, String.format("Received %s", new Object[]{var6}));
            switch (var6) {
               case "android.intent.action.ACTION_POWER_DISCONNECTED":
                  var3 = 0;
                  break label39;
               case "android.os.action.DISCHARGING":
               case "android.os.action.CHARGING":
                  var3 = 2;
                  break label39;
               case "android.intent.action.ACTION_POWER_CONNECTED":
                  var3 = 3;
                  break label39;
            }

            var3 = -1;
         }

         switch (var3) {
            case 0:
               this.d(Boolean.FALSE);
               break;
            case 1:
               this.d(Boolean.FALSE);
               break;
            case 2:
               this.d(Boolean.TRUE);
               break;
            case 3:
               this.d(Boolean.TRUE);
         }

      }
   }

   public Boolean i() {
      IntentFilter var1 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
      Intent var2 = super.b.registerReceiver((BroadcastReceiver)null, var1);
      if (var2 == null) {
         k.c().b(i, "getInitialState - null intent received");
         return null;
      } else {
         return this.j(var2);
      }
   }
}
