package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x0.k;

public class f extends c {
   private static final String i = k.f("StorageNotLowTracker");

   public f(Context var1, h1.a var2) {
      super(var1, var2);
   }

   public IntentFilter g() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("android.intent.action.DEVICE_STORAGE_OK");
      var1.addAction("android.intent.action.DEVICE_STORAGE_LOW");
      return var1;
   }

   public void h(Context var1, Intent var2) {
      if (var2.getAction() != null) {
         k.c().a(i, String.format("Received %s", new Object[]{var2.getAction()}));
         String var3 = var2.getAction();
         var3.hashCode();
         if (!var3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (var3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
               this.d(Boolean.TRUE);
            }
         } else {
            this.d(Boolean.FALSE);
         }

      }
   }

   public Boolean i() {
      Intent var1 = super.b.registerReceiver((BroadcastReceiver)null, this.g());
      if (var1 != null && var1.getAction() != null) {
         String var2 = var1.getAction();
         var2.hashCode();
         if (!var2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return !var2.equals("android.intent.action.DEVICE_STORAGE_OK") ? null : Boolean.TRUE;
         } else {
            return Boolean.FALSE;
         }
      } else {
         return Boolean.TRUE;
      }
   }
}
