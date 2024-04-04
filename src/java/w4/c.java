package w4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
   private File a;
   private final com.google.firebase.d b;

   public c(com.google.firebase.d var1) {
      this.b = var1;
   }

   private File a() {
      if (this.a == null) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (this.a == null) {
                  File var2 = this.b.j().getFilesDir();
                  StringBuilder var3 = new StringBuilder();
                  var3.append("PersistedInstallation.");
                  var3.append(this.b.n());
                  var3.append(".json");
                  File var1 = new File(var2, var3.toString());
                  this.a = var1;
               }
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return this.a;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var17 = var10000;

            try {
               throw var17;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               continue;
            }
         }
      } else {
         return this.a;
      }
   }

   private JSONObject c() {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var4 = new byte[16384];

      FileInputStream var2;
      boolean var10001;
      try {
         var2 = new FileInputStream(this.a());
      } catch (JSONException | IOException var41) {
         var10001 = false;
         return new JSONObject();
      }

      Throwable var10000;
      while(true) {
         int var1;
         try {
            var1 = var2.read(var4, 0, 16384);
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            break;
         }

         if (var1 < 0) {
            JSONObject var47;
            try {
               var47 = new JSONObject(var3.toString());
            } catch (Throwable var42) {
               var10000 = var42;
               var10001 = false;
               break;
            }

            try {
               var2.close();
               return var47;
            } catch (JSONException | IOException var40) {
               var10001 = false;
               return new JSONObject();
            }
         } else {
            try {
               var3.write(var4, 0, var1);
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var46 = var10000;

      try {
         var2.close();
      } catch (Throwable var39) {
         Throwable var45 = var39;

         label264:
         try {
            var46.addSuppressed(var45);
            break label264;
         } catch (JSONException | IOException var38) {
            var10001 = false;
            return new JSONObject();
         }
      }

      try {
         throw var46;
      } catch (JSONException | IOException var37) {
         var10001 = false;
         return new JSONObject();
      }
   }

   public d b(d var1) {
      try {
         JSONObject var4 = new JSONObject();
         var4.put("Fid", var1.d());
         var4.put("Status", var1.g().ordinal());
         var4.put("AuthToken", var1.b());
         var4.put("RefreshToken", var1.f());
         var4.put("TokenCreationEpochInSecs", var1.h());
         var4.put("ExpiresInSecs", var1.c());
         var4.put("FisError", var1.e());
         File var2 = File.createTempFile("PersistedInstallation", "tmp", this.b.j().getFilesDir());
         FileOutputStream var3 = new FileOutputStream(var2);
         var3.write(var4.toString().getBytes("UTF-8"));
         var3.close();
         if (!var2.renameTo(this.a())) {
            IOException var6 = new IOException("unable to rename the tmpfile to PersistedInstallation");
            throw var6;
         }
      } catch (IOException | JSONException var5) {
      }

      return var1;
   }

   public d d() {
      JSONObject var9 = this.c();
      String var6 = var9.optString("Fid", (String)null);
      int var1 = var9.optInt("Status", c.a.m.ordinal());
      String var7 = var9.optString("AuthToken", (String)null);
      String var8 = var9.optString("RefreshToken", (String)null);
      long var2 = var9.optLong("TokenCreationEpochInSecs", 0L);
      long var4 = var9.optLong("ExpiresInSecs", 0L);
      String var10 = var9.optString("FisError", (String)null);
      return d.a().d(var6).g(c.a.values()[var1]).b(var7).f(var8).h(var2).c(var4).e(var10).a();
   }

   public static enum a {
      m,
      n,
      o,
      p,
      q;

      private static final a[] r;

      static {
         a var4 = new a("ATTEMPT_MIGRATION", 0);
         m = var4;
         a var0 = new a("NOT_GENERATED", 1);
         n = var0;
         a var1 = new a("UNREGISTERED", 2);
         o = var1;
         a var3 = new a("REGISTERED", 3);
         p = var3;
         a var2 = new a("REGISTER_ERROR", 4);
         q = var2;
         r = new a[]{var4, var0, var1, var3, var2};
      }
   }
}
