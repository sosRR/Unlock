package x3;

import android.os.Bundle;
import java.util.Locale;

class e implements v3.a.b {
   private z3.b a;
   private z3.b b;

   private static void b(z3.b var0, String var1, Bundle var2) {
      if (var0 != null) {
         var0.l(var1, var2);
      }
   }

   private void c(String var1, Bundle var2) {
      z3.b var3;
      if ("clx".equals(var2.getString("_o"))) {
         var3 = this.a;
      } else {
         var3 = this.b;
      }

      b(var3, var1, var2);
   }

   public void a(int var1, Bundle var2) {
      y3.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{var1, var2}));
      if (var2 != null) {
         String var4 = var2.getString("name");
         if (var4 != null) {
            Bundle var3 = var2.getBundle("params");
            var2 = var3;
            if (var3 == null) {
               var2 = new Bundle();
            }

            this.c(var4, var2);
         }

      }
   }

   public void d(z3.b var1) {
      this.b = var1;
   }

   public void e(z3.b var1) {
      this.a = var1;
   }
}
