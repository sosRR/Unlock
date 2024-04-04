package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x0.k;

public class b extends c {
   private static final String i = k.f("BatteryNotLowTracker");

   public b(Context var1, h1.a var2) {
      super(var1, var2);
   }

   public IntentFilter g() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("android.intent.action.BATTERY_OKAY");
      var1.addAction("android.intent.action.BATTERY_LOW");
      return var1;
   }

   public void h(Context var1, Intent var2) {
      if (var2.getAction() != null) {
         k.c().a(i, String.format("Received %s", new Object[]{var2.getAction()}));
         String var3 = var2.getAction();
         var3.hashCode();
         if (!var3.equals("android.intent.action.BATTERY_OKAY")) {
            if (var3.equals("android.intent.action.BATTERY_LOW")) {
               this.d(Boolean.FALSE);
            }
         } else {
            this.d(Boolean.TRUE);
         }

      }
   }

   public Boolean i() {
      IntentFilter var6 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
      Intent var7 = super.b.registerReceiver((BroadcastReceiver)null, var6);
      boolean var5 = false;
      if (var7 == null) {
         k.c().b(i, "getInitialState - null intent received");
         return null;
      } else {
         int var3 = var7.getIntExtra("status", -1);
         int var4 = var7.getIntExtra("level", -1);
         int var2 = var7.getIntExtra("scale", -1);
         float var1 = (float)var4 / (float)var2;
         if (var3 == 1 || var1 > 0.15F) {
            var5 = true;
         }

         return var5;
      }
   }
}
