package com.tmobile.rsuapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tmobile.rsuapp.services.SimLockService;

public class RebootReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("onReceive: ");
      var3.append(var2.getAction());
      if ("com.tmobile.rsuapp.REBOOT_DEVICE".equals(var2.getAction())) {
         SimLockService.A(var1, "com.tmobile.rsuapp.REBOOT_DEVICE");
      }

   }
}
