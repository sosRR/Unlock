package u2;

import android.content.Context;
import android.content.res.Resources;

public final class m {
   public static String a(Context var0) {
      String var1;
      String var3;
      try {
         var1 = var0.getResources().getResourcePackageName(b2.j.a);
      } catch (Resources.NotFoundException var2) {
         var3 = var0.getPackageName();
         return var3;
      }

      var3 = var1;
      return var3;
   }

   public static final String b(String var0, Resources var1, String var2) {
      int var3 = var1.getIdentifier(var0, "string", var2);
      var0 = null;
      if (var3 != 0) {
         String var5;
         try {
            var5 = var1.getString(var3);
         } catch (Resources.NotFoundException var4) {
            return var0;
         }

         var0 = var5;
      }

      return var0;
   }
}
