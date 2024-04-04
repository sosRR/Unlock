package b4;

import android.content.Context;

class x {
   private String a;

   private static String b(Context var0) {
      String var1 = var0.getPackageManager().getInstallerPackageName(var0.getPackageName());
      String var2 = var1;
      if (var1 == null) {
         var2 = "";
      }

      return var2;
   }

   String a(Context var1) {
      synchronized(this){}
      boolean var4 = false;

      String var6;
      try {
         var4 = true;
         if (this.a == null) {
            this.a = b(var1);
         }

         if (!"".equals(this.a)) {
            var6 = this.a;
            var4 = false;
            return var6;
         }

         var4 = false;
      } finally {
         if (var4) {
            ;
         }
      }

      var6 = null;
      return var6;
   }
}
