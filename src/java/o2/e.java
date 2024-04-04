package o2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class e {
   public static final int a;

   static {
      int var1 = VERSION.SDK_INT;
      int var0 = 33554432;
      if (var1 < 31) {
         label18: {
            if (var1 >= 30) {
               String var2 = VERSION.CODENAME;
               if (var2.length() == 1 && var2.charAt(0) >= 'S' && var2.charAt(0) <= 'Z') {
                  break label18;
               }
            }

            var0 = 0;
         }
      }

      a = var0;
   }

   public static PendingIntent a(Context var0, int var1, Intent var2, int var3) {
      return PendingIntent.getActivity(var0, var1, var2, var3);
   }
}
