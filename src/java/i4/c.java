package i4;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class c implements k {
   private final String a;
   private final f4.b b;
   private final y3.f c;

   public c(String var1, f4.b var2) {
      this(var1, var2, y3.f.f());
   }

   c(String var1, f4.b var2, y3.f var3) {
      if (var1 != null) {
         this.c = var3;
         this.b = var2;
         this.a = var1;
      } else {
         throw new IllegalArgumentException("url must not be null.");
      }
   }

   private f4.a b(f4.a var1, j var2) {
      this.c(var1, "X-CRASHLYTICS-GOOGLE-APP-ID", var2.a);
      this.c(var1, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
      this.c(var1, "X-CRASHLYTICS-API-CLIENT-VERSION", b4.l.i());
      this.c(var1, "Accept", "application/json");
      this.c(var1, "X-CRASHLYTICS-DEVICE-MODEL", var2.b);
      this.c(var1, "X-CRASHLYTICS-OS-BUILD-VERSION", var2.c);
      this.c(var1, "X-CRASHLYTICS-OS-DISPLAY-VERSION", var2.d);
      this.c(var1, "X-CRASHLYTICS-INSTALLATION-ID", var2.e.a());
      return var1;
   }

   private void c(f4.a var1, String var2, String var3) {
      if (var3 != null) {
         var1.d(var2, var3);
      }

   }

   private JSONObject e(String var1) {
      try {
         JSONObject var7 = new JSONObject(var1);
         return var7;
      } catch (Exception var5) {
         y3.f var3 = this.c;
         StringBuilder var2 = new StringBuilder();
         var2.append("Failed to parse settings JSON from ");
         var2.append(this.a);
         var3.l(var2.toString(), var5);
         y3.f var6 = this.c;
         StringBuilder var8 = new StringBuilder();
         var8.append("Settings response ");
         var8.append(var1);
         var6.k(var8.toString());
         return null;
      }
   }

   private Map f(j var1) {
      HashMap var2 = new HashMap();
      var2.put("build_version", var1.h);
      var2.put("display_version", var1.g);
      var2.put("source", Integer.toString(var1.i));
      String var3 = var1.f;
      if (!TextUtils.isEmpty(var3)) {
         var2.put("instance", var3);
      }

      return var2;
   }

   public JSONObject a(j var1, boolean var2) {
      if (var2) {
         JSONObject var7;
         try {
            Map var3 = this.f(var1);
            f4.a var8 = this.b(this.d(var3), var1);
            y3.f var4 = this.c;
            StringBuilder var5 = new StringBuilder();
            var5.append("Requesting settings from ");
            var5.append(this.a);
            var4.b(var5.toString());
            var4 = this.c;
            var5 = new StringBuilder();
            var5.append("Settings query params were: ");
            var5.append(var3);
            var4.i(var5.toString());
            var7 = this.g(var8.c());
         } catch (IOException var6) {
            this.c.e("Settings request failed.", var6);
            var7 = null;
         }

         return var7;
      } else {
         throw new RuntimeException("An invalid data collection token was used.");
      }
   }

   protected f4.a d(Map var1) {
      f4.a var2 = this.b.a(this.a, var1);
      StringBuilder var3 = new StringBuilder();
      var3.append("Crashlytics Android SDK/");
      var3.append(b4.l.i());
      return var2.d("User-Agent", var3.toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
   }

   JSONObject g(f4.c var1) {
      int var2 = var1.b();
      y3.f var4 = this.c;
      StringBuilder var3 = new StringBuilder();
      var3.append("Settings response code was: ");
      var3.append(var2);
      var4.i(var3.toString());
      JSONObject var5;
      if (this.h(var2)) {
         var5 = this.e(var1.a());
      } else {
         y3.f var7 = this.c;
         StringBuilder var6 = new StringBuilder();
         var6.append("Settings request failed; (status: ");
         var6.append(var2);
         var6.append(") from ");
         var6.append(this.a);
         var7.d(var6.toString());
         var5 = null;
      }

      return var5;
   }

   boolean h(int var1) {
      boolean var2;
      if (var1 != 200 && var1 != 201 && var1 != 202 && var1 != 203) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
