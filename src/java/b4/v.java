package b4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class v implements w {
   private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
   private static final String h = Pattern.quote("/");
   private final x a;
   private final Context b;
   private final String c;
   private final u4.d d;
   private final r e;
   private String f;

   public v(Context var1, String var2, u4.d var3, r var4) {
      if (var1 != null) {
         if (var2 != null) {
            this.b = var1;
            this.c = var2;
            this.d = var3;
            this.e = var4;
            this.a = new x();
         } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
         }
      } else {
         throw new IllegalArgumentException("appContext must not be null");
      }
   }

   private String b(String var1, SharedPreferences var2) {
      synchronized(this){}

      String var3;
      try {
         var3 = e(UUID.randomUUID().toString());
         y3.f var4 = y3.f.f();
         StringBuilder var5 = new StringBuilder();
         var5.append("Created new Crashlytics installation ID: ");
         var5.append(var3);
         var5.append(" for FID: ");
         var5.append(var1);
         var4.i(var5.toString());
         var2.edit().putString("crashlytics.installation.id", var3).putString("firebase.installation.id", var1).apply();
      } finally {
         ;
      }

      return var3;
   }

   static String c() {
      StringBuilder var0 = new StringBuilder();
      var0.append("SYN_");
      var0.append(UUID.randomUUID().toString());
      return var0.toString();
   }

   private String d() {
      y2.g var1 = this.d.getId();

      String var3;
      try {
         var3 = (String)q0.d(var1);
      } catch (Exception var2) {
         y3.f.f().l("Failed to retrieve Firebase Installations ID.", var2);
         var3 = null;
      }

      return var3;
   }

   private static String e(String var0) {
      if (var0 == null) {
         var0 = null;
      } else {
         var0 = g.matcher(var0).replaceAll("").toLowerCase(Locale.US);
      }

      return var0;
   }

   static boolean k(String var0) {
      boolean var1;
      if (var0 != null && var0.startsWith("SYN_")) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private String l(SharedPreferences var1) {
      return var1.getString("crashlytics.installation.id", (String)null);
   }

   private String m(String var1) {
      return var1.replaceAll(h, "");
   }

   public String a() {
      synchronized(this){}

      Throwable var10000;
      label914: {
         String var1;
         boolean var10001;
         try {
            var1 = this.f;
         } catch (Throwable var96) {
            var10000 = var96;
            var10001 = false;
            break label914;
         }

         if (var1 != null) {
            return var1;
         }

         StringBuilder var98;
         SharedPreferences var4;
         label918: {
            String var2;
            String var101;
            label917: {
               try {
                  y3.f.f().i("Determining Crashlytics installation ID...");
                  var4 = b4.g.r(this.b);
                  var2 = var4.getString("firebase.installation.id", (String)null);
                  y3.f var97 = y3.f.f();
                  StringBuilder var3 = new StringBuilder();
                  var3.append("Cached Firebase Installation ID: ");
                  var3.append(var2);
                  var97.i(var3.toString());
                  if (this.e.d()) {
                     var101 = this.d();
                     y3.f var5 = y3.f.f();
                     var98 = new StringBuilder();
                     var98.append("Fetched Firebase Installation ID: ");
                     var98.append(var101);
                     var5.i(var98.toString());
                     break label917;
                  }
               } catch (Throwable var95) {
                  var10000 = var95;
                  var10001 = false;
                  break label914;
               }

               try {
                  if (k(var2)) {
                     this.f = this.l(var4);
                     break label918;
                  }
               } catch (Throwable var93) {
                  var10000 = var93;
                  var10001 = false;
                  break label914;
               }

               try {
                  this.f = this.b(c(), var4);
                  break label918;
               } catch (Throwable var90) {
                  var10000 = var90;
                  var10001 = false;
                  break label914;
               }
            }

            var1 = var101;
            if (var101 == null) {
               if (var2 == null) {
                  try {
                     var1 = c();
                  } catch (Throwable var92) {
                     var10000 = var92;
                     var10001 = false;
                     break label914;
                  }
               } else {
                  var1 = var2;
               }
            }

            try {
               if (var1.equals(var2)) {
                  this.f = this.l(var4);
                  break label918;
               }
            } catch (Throwable var94) {
               var10000 = var94;
               var10001 = false;
               break label914;
            }

            try {
               this.f = this.b(var1, var4);
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label914;
            }
         }

         try {
            if (this.f == null) {
               y3.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
               this.f = this.b(c(), var4);
            }
         } catch (Throwable var89) {
            var10000 = var89;
            var10001 = false;
            break label914;
         }

         label869:
         try {
            y3.f var99 = y3.f.f();
            var98 = new StringBuilder();
            var98.append("Crashlytics installation ID: ");
            var98.append(this.f);
            var99.i(var98.toString());
            var1 = this.f;
            return var1;
         } catch (Throwable var88) {
            var10000 = var88;
            var10001 = false;
            break label869;
         }
      }

      Throwable var100 = var10000;
      throw var100;
   }

   public String f() {
      return this.c;
   }

   public String g() {
      return this.a.a(this.b);
   }

   public String h() {
      return String.format(Locale.US, "%s/%s", new Object[]{this.m(Build.MANUFACTURER), this.m(Build.MODEL)});
   }

   public String i() {
      return this.m(VERSION.INCREMENTAL);
   }

   public String j() {
      return this.m(VERSION.RELEASE);
   }
}
