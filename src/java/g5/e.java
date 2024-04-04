package g5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

public class e {
   public static void a(Context var0, b var1) {
      ConnectivityManager var2 = (ConnectivityManager)var0.getSystemService("connectivity");
      if (var2.getNetworkCapabilities(var2.getActiveNetwork()) == null) {
         var1.a(false);
      }

      var2.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback(var1, var2) {
         final b a;
         final ConnectivityManager b;

         {
            this.a = var1;
            this.b = var2;
         }

         public void onAvailable(Network var1) {
            this.a.a(true);
            this.b.unregisterNetworkCallback(this);
         }

         public void onLost(Network var1) {
            this.a.a(false);
            this.b.unregisterNetworkCallback(this);
         }
      });
   }

   public interface b {
      void a(boolean var1);
   }
}
