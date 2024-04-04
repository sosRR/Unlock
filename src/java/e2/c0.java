package e2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public abstract class c0 implements DialogInterface.OnClickListener {
   public static c0 b(Activity var0, Intent var1, int var2) {
      return new a0(var1, var0, var2);
   }

   public static c0 c(d2.e var0, Intent var1, int var2) {
      return new b0(var1, var0, 2);
   }

   protected abstract void a();

   public final void onClick(DialogInterface var1, int var2) {
      label140: {
         Throwable var10000;
         label142: {
            boolean var10001;
            ActivityNotFoundException var4;
            try {
               try {
                  this.a();
                  break label140;
               } catch (ActivityNotFoundException var19) {
                  var4 = var19;
               }
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label142;
            }

            String var3 = "Failed to start resolution intent.";

            label132: {
               try {
                  if (!Build.FINGERPRINT.contains("generic")) {
                     break label132;
                  }
               } catch (Throwable var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label142;
               }

               var3 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }

            try {
               Log.e("DialogRedirect", var3, var4);
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label142;
            }

            var1.dismiss();
            return;
         }

         Throwable var21 = var10000;
         var1.dismiss();
         throw var21;
      }

      var1.dismiss();
   }
}
