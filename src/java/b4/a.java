package b4;

import android.content.Context;
import android.content.pm.PackageInfo;

public class a {
   public final String a;
   public final String b;
   public final String c;
   public final String d;
   public final String e;
   public final String f;
   public final y3.e g;

   public a(String var1, String var2, String var3, String var4, String var5, String var6, y3.e var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   public static a a(Context var0, v var1, String var2, String var3, y3.e var4) {
      String var5 = var0.getPackageName();
      String var6 = var1.g();
      PackageInfo var8 = var0.getPackageManager().getPackageInfo(var5, 0);
      String var7 = Integer.toString(var8.versionCode);
      String var10 = var8.versionName;
      String var9 = var10;
      if (var10 == null) {
         var9 = "0.0";
      }

      return new a(var2, var3, var6, var5, var7, var9, var4);
   }
}
