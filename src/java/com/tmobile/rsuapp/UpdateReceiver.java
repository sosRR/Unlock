package com.tmobile.rsuapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d5.e;
import h6.a;
import java.time.Duration;
import java.util.Random;
import x0.b;
import x0.d;
import x0.l;
import x0.p;
import x0.v;

public class UpdateReceiver extends BroadcastReceiver {
   private static final String a = "UpdateReceiver";

   public void onReceive(Context var1, Intent var2) {
      String var4 = a;
      h6.a.b(var4).a("Update Received");
      if (!e.r(var1) && "android.intent.action.MY_PACKAGE_REPLACED".equals(var2.getAction())) {
         Duration var3 = Duration.ofMinutes((long)(new Random()).nextInt((int)Duration.ofDays(10L).toMinutes()));
         Duration var6 = Duration.ofDays(30L);
         h6.a.b(var4).a("Last check-in at %s", e.a(var1));
         a.b var8 = h6.a.b(var4);
         StringBuilder var5 = new StringBuilder();
         var5.append("Setting periodic check-in to register every ");
         var5.append(var6);
         var5.append(" , with an initial delay of ");
         var5.append(var3);
         var8.a(var5.toString());
         b var9 = (new b.a()).b(l.n).a();
         p var7 = (p)((p.a)((p.a)(new p.a(CheckInWorker.class, var6, Duration.ofDays(1L))).e(var9)).g(var3)).b();
         v.f(var1).a();
         v.f(var1).e("key-checkin-work", d.m, var7);
      }

   }
}
