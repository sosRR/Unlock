package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import x0.k;

public class e extends d {
   static final String j = k.f("NetworkStateTracker");
   private final ConnectivityManager g;
   private <undefinedtype> h;
   private <undefinedtype> i;

   public e(Context var1, h1.a var2) {
      super(var1, var2);
      this.g = (ConnectivityManager)super.b.getSystemService("connectivity");
      if (j()) {
         this.h = new ConnectivityManager.NetworkCallback(this) {
            final e a;

            {
               this.a = var1;
            }

            public void onCapabilitiesChanged(Network var1, NetworkCapabilities var2) {
               k.c().a(d1.e.j, String.format("Network capabilities changed: %s", new Object[]{var2}));
               e var3 = this.a;
               var3.d(var3.g());
            }

            public void onLost(Network var1) {
               k.c().a(d1.e.j, "Network connection lost");
               e var2 = this.a;
               var2.d(var2.g());
            }
         };
      } else {
         this.i = new BroadcastReceiver(this) {
            final e a;

            {
               this.a = var1;
            }

            public void onReceive(Context var1, Intent var2) {
               if (var2 != null && var2.getAction() != null && var2.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                  k.c().a(d1.e.j, "Network broadcast received");
                  e var3 = this.a;
                  var3.d(var3.g());
               }

            }
         };
      }

   }

   private static boolean j() {
      return true;
   }

   public void e() {
      if (j()) {
         Object var1;
         try {
            k.c().a(j, "Registering network callback");
            this.g.registerDefaultNetworkCallback(this.h);
            return;
         } catch (IllegalArgumentException var2) {
            var1 = var2;
         } catch (SecurityException var3) {
            var1 = var3;
         }

         k.c().b(j, "Received exception while registering network callback", (Throwable)var1);
      } else {
         k.c().a(j, "Registering broadcast receiver");
         super.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      }

   }

   public void f() {
      if (j()) {
         Object var1;
         try {
            k.c().a(j, "Unregistering network callback");
            this.g.unregisterNetworkCallback(this.h);
            return;
         } catch (IllegalArgumentException var2) {
            var1 = var2;
         } catch (SecurityException var3) {
            var1 = var3;
         }

         k.c().b(j, "Received exception while unregistering network callback", (Throwable)var1);
      } else {
         k.c().a(j, "Unregistering broadcast receiver");
         super.b.unregisterReceiver(this.i);
      }

   }

   b1.b g() {
      NetworkInfo var5 = this.g.getActiveNetworkInfo();
      boolean var2 = true;
      boolean var1;
      if (var5 != null && var5.isConnected()) {
         var1 = true;
      } else {
         var1 = false;
      }

      boolean var4 = this.i();
      boolean var3 = androidx.core.net.a.a(this.g);
      if (var5 == null || var5.isRoaming()) {
         var2 = false;
      }

      return new b1.b(var1, var4, var3, var2);
   }

   public b1.b h() {
      return this.g();
   }

   boolean i() {
      boolean var1 = true;

      label29: {
         SecurityException var10000;
         label34: {
            boolean var10001;
            NetworkCapabilities var6;
            try {
               Network var3 = this.g.getActiveNetwork();
               var6 = this.g.getNetworkCapabilities(var3);
            } catch (SecurityException var5) {
               var10000 = var5;
               var10001 = false;
               break label34;
            }

            if (var6 == null) {
               break label29;
            }

            boolean var2;
            try {
               var2 = var6.hasCapability(16);
            } catch (SecurityException var4) {
               var10000 = var4;
               var10001 = false;
               break label34;
            }

            if (var2) {
               return var1;
            }
            break label29;
         }

         SecurityException var7 = var10000;
         k.c().b(j, "Unable to validate active network", var7);
         return false;
      }

      var1 = false;
      return var1;
   }
}
