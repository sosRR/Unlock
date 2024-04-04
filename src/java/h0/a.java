package h0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class a extends BroadcastReceiver {
   private static final SparseArray a = new SparseArray();
   private static int b = 1;

   public static boolean b(Intent var0) {
      int var1 = var0.getIntExtra("androidx.contentpager.content.wakelockid", 0);
      if (var1 == 0) {
         return false;
      } else {
         SparseArray var24 = a;
         synchronized(var24){}

         Throwable var10000;
         boolean var10001;
         label182: {
            PowerManager.WakeLock var2;
            try {
               var2 = (PowerManager.WakeLock)var24.get(var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label182;
            }

            if (var2 != null) {
               label176:
               try {
                  var2.release();
                  var24.remove(var1);
                  return true;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label176;
               }
            } else {
               label178:
               try {
                  StringBuilder var26 = new StringBuilder();
                  var26.append("No active wake lock id #");
                  var26.append(var1);
                  Log.w("WakefulBroadcastReceiv.", var26.toString());
                  return true;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label178;
               }
            }
         }

         while(true) {
            Throwable var25 = var10000;

            try {
               throw var25;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public static ComponentName c(Context var0, Intent var1) {
      SparseArray var4 = a;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label426: {
         int var2;
         try {
            var2 = b;
         } catch (Throwable var62) {
            var10000 = var62;
            var10001 = false;
            break label426;
         }

         int var3 = var2 + 1;

         try {
            b = var3;
         } catch (Throwable var61) {
            var10000 = var61;
            var10001 = false;
            break label426;
         }

         if (var3 <= 0) {
            try {
               b = 1;
            } catch (Throwable var60) {
               var10000 = var60;
               var10001 = false;
               break label426;
            }
         }

         ComponentName var66;
         try {
            var1.putExtra("androidx.contentpager.content.wakelockid", var2);
            var66 = var0.startService(var1);
         } catch (Throwable var59) {
            var10000 = var59;
            var10001 = false;
            break label426;
         }

         if (var66 == null) {
            label405:
            try {
               return null;
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label405;
            }
         } else {
            label407:
            try {
               PowerManager var64 = (PowerManager)var0.getSystemService("power");
               StringBuilder var5 = new StringBuilder();
               var5.append("androidx.core:wake:");
               var5.append(var66.flattenToShortString());
               PowerManager.WakeLock var65 = var64.newWakeLock(1, var5.toString());
               var65.setReferenceCounted(false);
               var65.acquire(60000L);
               var4.put(var2, var65);
               return var66;
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label407;
            }
         }
      }

      while(true) {
         Throwable var63 = var10000;

         try {
            throw var63;
         } catch (Throwable var56) {
            var10000 = var56;
            var10001 = false;
            continue;
         }
      }
   }
}
