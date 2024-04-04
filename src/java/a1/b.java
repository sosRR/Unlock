package a1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import android.os.Build.VERSION;
import androidx.work.impl.background.systemjob.SystemJobService;
import f1.p;
import java.util.Iterator;
import x0.k;
import x0.l;

class b {
   private static final String b = k.f("SystemJobInfoConverter");
   private final ComponentName a;

   b(Context var1) {
      this.a = new ComponentName(var1.getApplicationContext(), SystemJobService.class);
   }

   private static JobInfo.TriggerContentUri b(x0.c.a var0) {
      byte var1 = var0.b();
      return new JobInfo.TriggerContentUri(var0.a(), var1);
   }

   static int c(l var0) {
      int var1 = null.a[var0.ordinal()];
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               if (var1 != 4) {
                  if (var1 != 5) {
                     k.c().a(b, String.format("API version too low. Cannot convert network type value %s", new Object[]{var0}));
                     return 1;
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   static void d(JobInfo.Builder var0, l var1) {
      if (VERSION.SDK_INT >= 30 && var1 == l.r) {
         var0.setRequiredNetwork((new NetworkRequest.Builder()).addCapability(25).build());
      } else {
         var0.setRequiredNetworkType(c(var1));
      }

   }

   JobInfo a(p var1, int var2) {
      x0.b var7 = var1.j;
      PersistableBundle var8 = new PersistableBundle();
      var8.putString("EXTRA_WORK_SPEC_ID", var1.a);
      var8.putBoolean("EXTRA_IS_PERIODIC", var1.d());
      JobInfo.Builder var9 = (new JobInfo.Builder(var2, this.a)).setRequiresCharging(var7.g()).setRequiresDeviceIdle(var7.h()).setExtras(var8);
      d(var9, var7.b());
      boolean var6 = var7.h();
      boolean var3 = false;
      if (!var6) {
         byte var10;
         if (var1.l == x0.a.n) {
            var10 = 0;
         } else {
            var10 = 1;
         }

         var9.setBackoffCriteria(var1.m, var10);
      }

      long var4 = Math.max(var1.a() - System.currentTimeMillis(), 0L);
      if (VERSION.SDK_INT <= 28) {
         var9.setMinimumLatency(var4);
      } else if (var4 > 0L) {
         var9.setMinimumLatency(var4);
      } else if (!var1.q) {
         var9.setImportantWhileForeground(true);
      }

      if (var7.e()) {
         Iterator var12 = var7.a().b().iterator();

         while(var12.hasNext()) {
            var9.addTriggerContentUri(b((x0.c.a)var12.next()));
         }

         var9.setTriggerContentUpdateDelay(var7.c());
         var9.setTriggerContentMaxDelay(var7.d());
      }

      var9.setPersisted(false);
      var9.setRequiresBatteryNotLow(var7.f());
      var9.setRequiresStorageNotLow(var7.i());
      boolean var11;
      if (var1.k > 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var4 > 0L) {
         var3 = true;
      }

      if (androidx.core.os.a.c() && var1.q && !var11 && !var3) {
         a1.a.a(var9, true);
      }

      return var9.build();
   }
}
