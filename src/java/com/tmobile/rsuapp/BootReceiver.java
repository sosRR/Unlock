package com.tmobile.rsuapp;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;
import d5.e;
import java.time.Duration;
import java.util.Random;
import x0.b;
import x0.d;
import x0.l;
import x0.m;
import x0.p;
import x0.v;

public class BootReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("onReceive: ");
      var3.append(var2.getAction());
      if ("android.intent.action.BOOT_COMPLETED".equals(var2.getAction())) {
         if (e.o(var1)) {
            e.E(var1, false);
            if (e.r(var1)) {
               Toast.makeText(var1, 2131820788, 1).show();
               v.f(var1).b("key-checkin-work");
               ((NotificationManager)var1.getSystemService("notification")).cancel(2);
               PackageManager var5 = var1.getPackageManager();
               if (var5 != null) {
                  var5.setApplicationEnabledSetting(var1.getPackageName(), 3, 1);
                  return;
               }
            } else if (e.s(var1)) {
               Toast.makeText(var1, 2131820789, 1).show();
            }
         }

         if (e.n(var1)) {
            e.D(var1, false);
         }

         if (!e.r(var1)) {
            Duration var8 = Duration.ofDays((long)((new Random()).nextInt(10) + 30));
            Duration var6 = Duration.ofDays(30L);
            StringBuilder var4 = new StringBuilder();
            var4.append("Last check-in at ");
            var4.append(e.a(var1));
            var4 = new StringBuilder();
            var4.append("Setting periodic check-in to register every ");
            var4.append(var6);
            var4.append(" , with an initial delay of ");
            var4.append(var8);
            b var9 = (new b.a()).b(l.n).a();
            if (e.j(var1)) {
               v.f(var1).d(((m.a)(new m.a(CheckInWorker.class)).e(var9)).b());
               e.v(var1);
            }

            p var7 = (p)((p.a)((p.a)(new p.a(CheckInWorker.class, var6, Duration.ofDays(1L))).e(var9)).g(var8)).b();
            v.f(var1).e("key-checkin-work", d.n, var7);
         }

         d5.d.e(var1.getApplicationContext());
      } else if ("android.intent.action.ACTION_SHUTDOWN".equals(var2.getAction()) && e.o(var1)) {
         e.D(var1, true);
      }

   }
}
