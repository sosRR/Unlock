package a2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class b extends BroadcastReceiver {
   private final ExecutorService a;

   public b() {
      p2.e.a();
      j2.a var1 = new j2.a("firebase-iid-executor");
      ThreadPoolExecutor var2 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), var1);
      var2.allowCoreThreadTimeOut(true);
      this.a = Executors.unconfigurableExecutorService(var2);
   }

   private final int e(Context var1, Intent var2) {
      if (var2.getExtras() == null) {
         return 500;
      } else {
         String var4 = var2.getStringExtra("google.message_id");
         y2.g var12;
         if (TextUtils.isEmpty(var4)) {
            var12 = y2.j.e((Object)null);
         } else {
            Bundle var5 = new Bundle();
            var5.putString("google.message_id", var4);
            var12 = com.google.android.gms.cloudmessaging.l.b(var1).c(2, var5);
         }

         int var3 = this.b(var1, new a(var2));

         Object var9;
         try {
            y2.j.b(var12, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return var3;
         } catch (ExecutionException var6) {
            var9 = var6;
         } catch (InterruptedException var7) {
            var9 = var7;
         } catch (TimeoutException var8) {
            var9 = var8;
         }

         String var11 = String.valueOf(var9);
         StringBuilder var10 = new StringBuilder(var11.length() + 20);
         var10.append("Message ack failed: ");
         var10.append(var11);
         Log.w("CloudMessagingReceiver", var10.toString());
         return var3;
      }
   }

   private final int f(Context var1, Intent var2) {
      PendingIntent var3 = (PendingIntent)var2.getParcelableExtra("pending_intent");
      if (var3 != null) {
         try {
            var3.send();
         } catch (PendingIntent.CanceledException var4) {
            Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
         }
      }

      Bundle var5 = var2.getExtras();
      if (var5 != null) {
         var5.remove("pending_intent");
      } else {
         var5 = new Bundle();
      }

      if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(var2.getAction())) {
         this.c(var1, var5);
         return -1;
      } else {
         Log.e("CloudMessagingReceiver", "Unknown notification action");
         return 500;
      }
   }

   protected Executor a() {
      return this.a;
   }

   protected abstract int b(Context var1, a var2);

   protected void c(Context var1, Bundle var2) {
   }

   // $FF: synthetic method
   public final void d(Intent var1, Context var2, boolean var3, BroadcastReceiver.PendingResult var4) {
      label195: {
         Throwable var10000;
         label197: {
            boolean var10001;
            Intent var28;
            label193: {
               try {
                  Parcelable var6 = var1.getParcelableExtra("wrapped_intent");
                  if (var6 instanceof Intent) {
                     var28 = (Intent)var6;
                     break label193;
                  }
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break label197;
               }

               var28 = null;
            }

            int var5;
            if (var28 != null) {
               try {
                  var5 = this.f(var2, var28);
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label197;
               }
            } else {
               try {
                  var5 = this.e(var2, var1);
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label197;
               }
            }

            if (!var3) {
               break label195;
            }

            label180:
            try {
               var4.setResultCode(var5);
               break label195;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label180;
            }
         }

         Throwable var27 = var10000;
         var4.finish();
         throw var27;
      }

      var4.finish();
   }

   public final void onReceive(Context var1, Intent var2) {
      if (var2 != null) {
         boolean var3 = this.isOrderedBroadcast();
         BroadcastReceiver.PendingResult var4 = this.goAsync();
         this.a().execute(new i(this, var2, var1, var3, var4));
      }
   }
}
