package d5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.j;
import com.tmobile.rsuapp.RebootReceiver;
import com.tmobile.rsuapp.services.SimLockService;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import x0.p;
import x0.v;

public class d {
   private static final String a = "d";

   // $FF: synthetic method
   static String a() {
      return a;
   }

   // $FF: synthetic method
   static void b(Context var0) {
      h(var0);
   }

   private static void c(Context var0) {
      h6.a.b(a).a("cancelAlarm");
      v.f(var0).b("key-notification-work");
   }

   private static int d(Context var0) {
      long var2 = e.g(var0);
      Calendar var4 = Calendar.getInstance();
      var4.setTimeInMillis(var2);
      Calendar var5 = Calendar.getInstance();
      int var1 = -1;

      while(var5.before(var4) && var1 <= 7) {
         ++var1;
         var5.add(5, 1);
      }

      h6.a.b var7 = h6.a.b(a);
      StringBuilder var6 = new StringBuilder();
      var6.append("expirationTime: ");
      var6.append(var2);
      var6.append(" daysLeft: ");
      var6.append(var1);
      var7.a(var6.toString());
      return var1;
   }

   public static void e(Context var0) {
      String var5 = a;
      h6.a.b(var5).a("onScheduleNotifications");
      if (e.s(var0) && !e.q(var0)) {
         long var1 = System.currentTimeMillis();
         long var3 = e.g(var0);
         Calendar var7 = Calendar.getInstance();
         Date var6 = var7.getTime();
         var7.set(11, 12);
         var7.set(12, 0);
         var7.set(13, 0);
         var7.set(14, 0);
         h6.a.b var8 = h6.a.b(var5);
         StringBuilder var9 = new StringBuilder();
         var9.append(" scheduleNotifications: now: ");
         var9.append(var6.toString());
         var9.append(" expirationReminderTime: ");
         var9.append(var7.getTime().toString());
         var9.append(" expirationTime: ");
         var9.append((new Date(var3)).toString());
         var8.a(var9.toString());
         var8 = h6.a.b(var5);
         var9 = new StringBuilder();
         var9.append("Time left: ");
         var9.append((var3 - var1) / 1000L);
         var9.append(" seconds");
         var8.a(var9.toString());
         if (var6.toInstant().isAfter(var7.toInstant())) {
            var7.add(5, 1);
         }

         Duration var12 = Duration.ofMillis(var7.toInstant().toEpochMilli() - var6.toInstant().toEpochMilli());
         h6.a.b(var5).a("Notification will display in %s", var12.toString());
         androidx.work.b var10 = (new androidx.work.b.a()).f("key-action", "com.tmobile.rsuapp.SHOW_EXPIRE_REMINDER_NOTIFICATION").a();
         p var11 = (p)((p.a)((p.a)(new p.a(SimLockService.class, Duration.ofDays(1L))).g(var12)).h(var10)).b();
         v.f(var0).e("key-notification-work", x0.d.m, var11);
         e.J(var0, true);
      } else {
         h6.a.b(var5).a("isUnlockedTemporary: %s", e.s(var0));
         h6.a.b(var5).a("isUnlockTempReminderShowed: %s", e.q(var0));
      }
   }

   public static void f(Context var0) {
      h6.a.b(a).a("onShowExpireReminderNotification");
      if (e.s(var0)) {
         SimLockService.B(var0, "com.tmobile.rsuapp.CHECK_LOCK_STATUS", (Uri)null, (androidx.work.b)null, new d$a(var0));
      }
   }

   public static void g(Context var0) {
      h6.a.b(a).a("onShowRestartNowNotification");
      NotificationManager var1 = (NotificationManager)var0.getSystemService("notification");
      PendingIntent var2 = PendingIntent.getActivity(var0, 0, new Intent(var0, SimLockService.class), 335544320);
      PendingIntent var4 = PendingIntent.getBroadcast(var0, 0, new Intent("com.tmobile.rsuapp.REBOOT_DEVICE", (Uri)null, var0, RebootReceiver.class), 335544320);
      j.e var3 = new j.e(var0, "channel_app");
      var3.x((new j.c()).h(var0.getString(2131820760))).l(var0.getString(2131820761)).k(var0.getString(2131820760)).v(2131230897).j(var2).g(false);
      var3.b((new j.a.a(2131230899, var0.getString(2131820596), var4)).a());
      Notification var5 = var3.c();
      var5.flags = 2;
      var1.notify(2, var5);
   }

   private static void h(Context var0) {
      int var1 = d(var0);
      if (var1 >= 0 && var1 < 7) {
         String var2;
         if (var1 == 0) {
            var2 = var0.getString(2131820762);
            c(var0);
         } else {
            var2 = var0.getResources().getQuantityString(2131689473, var1, new Object[]{var1});
         }

         ((NotificationManager)var0.getSystemService("notification")).notify(1, (new j.e(var0, "channel_app")).x((new j.c()).h(var2)).l(var0.getString(2131820588)).k(var2).v(2131230897).g(true).c());
      }

   }
}
