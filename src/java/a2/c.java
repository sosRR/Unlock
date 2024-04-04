package a2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

public class c {
   private static int h;
   private static PendingIntent i;
   private static final Executor j;
   private static final Pattern k;
   @GuardedBy("responseCallbacks")
   private final n.g a = new n.g();
   private final Context b;
   private final k c;
   private final ScheduledExecutorService d;
   private Messenger e;
   private Messenger f;
   private h g;

   static {
      j = q.m;
      k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
   }

   public c(Context var1) {
      this.b = var1;
      this.c = new k(var1);
      this.e = new Messenger(new e(this, Looper.getMainLooper()));
      ScheduledThreadPoolExecutor var2 = new ScheduledThreadPoolExecutor(1);
      var2.setKeepAliveTime(60L, TimeUnit.SECONDS);
      var2.allowCoreThreadTimeOut(true);
      this.d = var2;
   }

   // $FF: synthetic method
   static y2.g b(Bundle var0) {
      return j(var0) ? y2.j.e((Object)null) : y2.j.e(var0);
   }

   private final y2.g f(Bundle param1) {
      // $FF: Couldn't be decompiled
   }

   private static String g() {
      Class var2 = c.class;
      synchronized(c.class){}

      String var1;
      try {
         int var0 = h++;
         var1 = Integer.toString(var0);
      } finally {
         ;
      }

      return var1;
   }

   private static void h(Context var0, Intent var1) {
      Class var3 = c.class;
      synchronized(c.class){}

      try {
         if (i == null) {
            Intent var2 = new Intent();
            var2.setPackage("com.google.example.invalidpackage");
            i = p2.a.a(var0, 0, var2, p2.a.a);
         }

         var1.putExtra("app", i);
      } finally {
         ;
      }

   }

   private final void i(String var1, Bundle var2) {
      n.g var3 = this.a;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label349: {
         y2.h var4;
         try {
            var4 = (y2.h)this.a.remove(var1);
         } catch (Throwable var47) {
            var10000 = var47;
            var10001 = false;
            break label349;
         }

         if (var4 == null) {
            label353: {
               label341: {
                  try {
                     var1 = String.valueOf(var1);
                     if (var1.length() != 0) {
                        var1 = "Missing callback for ".concat(var1);
                        break label341;
                     }
                  } catch (Throwable var45) {
                     var10000 = var45;
                     var10001 = false;
                     break label353;
                  }

                  try {
                     var1 = new String("Missing callback for ");
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label353;
                  }
               }

               label332:
               try {
                  Log.w("Rpc", var1);
                  return;
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label332;
               }
            }
         } else {
            label345:
            try {
               var4.c(var2);
               return;
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label345;
            }
         }
      }

      while(true) {
         Throwable var48 = var10000;

         try {
            throw var48;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            continue;
         }
      }
   }

   private static boolean j(Bundle var0) {
      return var0 != null && var0.containsKey("google.messenger");
   }

   public y2.g a(Bundle var1) {
      if (this.c.a() < 12000000) {
         y2.g var2;
         if (this.c.b() != 0) {
            var2 = this.f(var1).i(j, new l(this, var1));
         } else {
            var2 = y2.j.d(new IOException("MISSING_INSTANCEID_SERVICE"));
         }

         return var2;
      } else {
         return com.google.android.gms.cloudmessaging.l.b(this.b).d(1, var1).g(j, m.a);
      }
   }

   // $FF: synthetic method
   public final y2.g c(Bundle var1, y2.g var2) {
      if (!var2.o()) {
         return var2;
      } else {
         return !j((Bundle)var2.k()) ? var2 : this.f(var1).p(j, o.a);
      }
   }

   // $FF: synthetic method
   public final void e(String param1, ScheduledFuture param2, y2.g param3) {
      // $FF: Couldn't be decompiled
   }
}
