package u2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

public final class w {
   public static String a(String var0, String[] var1, String[] var2) {
      e2.n.i(var1);
      e2.n.i(var2);
      int var4 = Math.min(var1.length, var2.length);

      for(int var3 = 0; var3 < var4; ++var3) {
         String var5 = var1[var3];
         if (var0 == null && var5 == null || var0 != null && var0.equals(var5)) {
            return var2[var3];
         }
      }

      return null;
   }

   public static String b(Context var0, String var1, String var2) {
      e2.n.i(var0);
      Resources var3 = var0.getResources();
      if (TextUtils.isEmpty(var2)) {
         var2 = m.a(var0);
      }

      return m.b("google_app_id", var3, var2);
   }
}
