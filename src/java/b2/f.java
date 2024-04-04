package b2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import e2.k1;

public class f {
   public static final int a;
   private static final f b;

   static {
      a = h.a;
      b = new f();
   }

   f() {
   }

   public static f f() {
      return b;
   }

   public int a(Context var1) {
      return h.a(var1);
   }

   public Intent b(Context var1, int var2, String var3) {
      if (var2 != 1 && var2 != 2) {
         return var2 != 3 ? null : k1.c("com.google.android.gms");
      } else if (var1 != null && i2.h.d(var1)) {
         return k1.a();
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append("gcore_");
         var4.append(a);
         var4.append("-");
         if (!TextUtils.isEmpty(var3)) {
            var4.append(var3);
         }

         var4.append("-");
         if (var1 != null) {
            var4.append(var1.getPackageName());
         }

         var4.append("-");
         if (var1 != null) {
            try {
               var4.append(k2.c.a(var1).e(var1.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException var5) {
            }
         }

         return k1.b("com.google.android.gms", var4.toString());
      }
   }

   public PendingIntent c(Context var1, int var2, int var3) {
      return this.d(var1, var2, var3, (String)null);
   }

   public PendingIntent d(Context var1, int var2, int var3, String var4) {
      Intent var5 = this.b(var1, var2, var4);
      return var5 == null ? null : q2.d.a(var1, var3, var5, q2.d.a | 134217728);
   }

   public String e(int var1) {
      return h.b(var1);
   }

   public int g(Context var1) {
      return this.h(var1, a);
   }

   public int h(Context var1, int var2) {
      var2 = h.e(var1, var2);
      return h.f(var1, var2) ? 18 : var2;
   }

   public boolean i(Context var1, String var2) {
      return h.j(var1, var2);
   }

   public boolean j(int var1) {
      return h.h(var1);
   }
}
