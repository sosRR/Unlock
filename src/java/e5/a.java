package e5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import i5.m;
import j5.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {
   private static final String c = "a";
   private static final TimeUnit d;
   private ServiceConnection a = null;
   private k5.a b = null;

   static {
      d = TimeUnit.MILLISECONDS;
   }

   public a(Context var1) {
      if (j5.a.b("com.tmobile.rsusrv", var1)) {
         this.d(var1);
      } else {
         throw m.a(-1, 2, -1, "ERR_MSG_SLE_NOT_REACHABLE");
      }
   }

   private void c(Context var1, ServiceConnection var2) {
      h6.a.b(c).a("bindToAppRemoteService");
      var1.bindService(j5.d.a(), var2, 1);
   }

   private void d(Context var1) {
      h6.a.b(c).a("connectToAppRemoteService");
      CountDownLatch var3 = new CountDownLatch(1);
      ServiceConnection var2 = new ServiceConnection(this, var3) {
         final CountDownLatch a;
         final a b;

         {
            this.b = var1;
            this.a = var2;
         }

         public void onServiceConnected(ComponentName var1, IBinder var2) {
            h6.a.b(e5.a.c).a("onServiceConnected");
            this.b.b = null.f(var2);
            this.a.countDown();
         }

         public void onServiceDisconnected(ComponentName var1) {
            h6.a.b(e5.a.c).a("onServiceDisconnected");
         }
      };
      this.c(var1, var2);

      try {
         if (var3.await(10000L, d)) {
            this.a = var2;
         } else {
            var1.unbindService(var2);
            throw m.a(-1, 2, -1, "ERR_MSG_SLE_NOT_REACHABLE");
         }
      } catch (InterruptedException var4) {
         var1.unbindService(var2);
         throw m.a(-1, 2, -1, "ERR_MSG_INTERNAL_FAILURE");
      }
   }

   public void e(Context var1) {
      h6.a.b(c).a("disconnect");
      ServiceConnection var2 = this.a;
      if (var2 != null) {
         var1.unbindService(var2);
         this.a = null;
         this.b = null;
      }

   }

   public k5.a f() {
      return this.b;
   }
}
