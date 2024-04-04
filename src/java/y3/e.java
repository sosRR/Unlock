package y3;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

public class e {
   private final Context a;
   private b b;

   public e(Context var1) {
      this.a = var1;
      this.b = null;
   }

   private boolean c(String var1) {
      if (this.a.getAssets() == null) {
         return false;
      } else {
         boolean var10001;
         InputStream var4;
         try {
            var4 = this.a.getAssets().open(var1);
         } catch (IOException var3) {
            var10001 = false;
            return false;
         }

         if (var4 == null) {
            return true;
         } else {
            try {
               var4.close();
               return true;
            } catch (IOException var2) {
               var10001 = false;
               return false;
            }
         }
      }
   }

   private b f() {
      if (this.b == null) {
         this.b = new b(this);
      }

      return this.b;
   }

   public String d() {
      return this.f().a;
   }

   public String e() {
      return this.f().b;
   }

   private class b {
      private final String a;
      private final String b;
      final e c;

      private b(e var1) {
         this.c = var1;
         int var2 = b4.g.q(var1.a, "com.google.firebase.crashlytics.unity_version", "string");
         if (var2 != 0) {
            this.a = "Unity";
            String var4 = var1.a.getResources().getString(var2);
            this.b = var4;
            f var3 = f.f();
            StringBuilder var5 = new StringBuilder();
            var5.append("Unity Editor version is: ");
            var5.append(var4);
            var3.i(var5.toString());
         } else if (var1.c("flutter_assets/NOTICES.Z")) {
            this.a = "Flutter";
            this.b = null;
            f.f().i("Development platform is: Flutter");
         } else {
            this.a = null;
            this.b = null;
         }
      }

      // $FF: synthetic method
      b(e var1, Object var2) {
         this(var1);
      }
   }
}
