package d2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class p extends BroadcastReceiver {
   Context a;
   private final o b;

   public p(o var1) {
      this.b = var1;
   }

   public final void a(Context var1) {
      this.a = var1;
   }

   public final void b() {
      synchronized(this){}

      Throwable var10000;
      label116: {
         Context var1;
         boolean var10001;
         try {
            var1 = this.a;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label116;
         }

         if (var1 != null) {
            try {
               var1.unregisterReceiver(this);
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label116;
            }
         }

         label104:
         try {
            this.a = null;
            return;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label104;
         }
      }

      Throwable var15 = var10000;
      throw var15;
   }

   public final void onReceive(Context var1, Intent var2) {
      Uri var3 = var2.getData();
      String var4;
      if (var3 != null) {
         var4 = var3.getSchemeSpecificPart();
      } else {
         var4 = null;
      }

      if ("com.google.android.gms".equals(var4)) {
         this.b.a();
         this.b();
      }

   }
}
