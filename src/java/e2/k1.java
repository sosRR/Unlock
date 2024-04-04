package e2;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class k1 {
   private static final Uri a;
   private static final Uri b;

   static {
      Uri var0 = Uri.parse("https://plus.google.com/");
      a = var0;
      b = var0.buildUpon().appendPath("circles").appendPath("find").build();
   }

   public static Intent a() {
      Intent var0 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
      var0.setPackage("com.google.android.wearable.app");
      return var0;
   }

   public static Intent b(String var0, String var1) {
      Intent var2 = new Intent("android.intent.action.VIEW");
      Uri.Builder var3 = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
      if (!TextUtils.isEmpty(var1)) {
         var3.appendQueryParameter("pcampaignid", var1);
      }

      var2.setData(var3.build());
      var2.setPackage("com.android.vending");
      var2.addFlags(524288);
      return var2;
   }

   public static Intent c(String var0) {
      Uri var2 = Uri.fromParts("package", "com.google.android.gms", (String)null);
      Intent var1 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
      var1.setData(var2);
      return var1;
   }
}
