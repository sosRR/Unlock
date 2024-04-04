package x4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import e2.n;
import i2.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import r4.j;

public class c {
   private static final Pattern d = Pattern.compile("[0-9]+s");
   private static final Charset e = Charset.forName("UTF-8");
   private final Context a;
   private final t4.b b;
   private final e c;

   public c(Context var1, t4.b var2) {
      this.a = var1;
      this.b = var2;
      this.c = new e();
   }

   private static String a(String var0, String var1, String var2) {
      if (TextUtils.isEmpty(var0)) {
         var0 = "";
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append(", ");
         var3.append(var0);
         var0 = var3.toString();
      }

      return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", new Object[]{var1, var2, var0});
   }

   private static JSONObject b(String var0, String var1) {
      try {
         JSONObject var2 = new JSONObject();
         var2.put("fid", var0);
         var2.put("appId", var1);
         var2.put("authVersion", "FIS_v2");
         var2.put("sdkVersion", "a:17.0.1");
         return var2;
      } catch (JSONException var3) {
         throw new IllegalStateException(var3);
      }
   }

   private static JSONObject c() {
      try {
         JSONObject var0 = new JSONObject();
         var0.put("sdkVersion", "a:17.0.1");
         JSONObject var1 = new JSONObject();
         var1.put("installation", var0);
         return var1;
      } catch (JSONException var2) {
         throw new IllegalStateException(var2);
      }
   }

   private String f() {
      PackageManager.NameNotFoundException var10000;
      StringBuilder var7;
      label25: {
         boolean var10001;
         byte[] var6;
         try {
            Context var1 = this.a;
            var6 = i2.a.a(var1, var1.getPackageName());
         } catch (PackageManager.NameNotFoundException var5) {
            var10000 = var5;
            var10001 = false;
            break label25;
         }

         if (var6 == null) {
            try {
               var7 = new StringBuilder();
               var7.append("Could not get fingerprint hash for package: ");
               var7.append(this.a.getPackageName());
               Log.e("ContentValues", var7.toString());
               return null;
            } catch (PackageManager.NameNotFoundException var3) {
               var10000 = var3;
               var10001 = false;
            }
         } else {
            try {
               String var8 = i.b(var6, false);
               return var8;
            } catch (PackageManager.NameNotFoundException var4) {
               var10000 = var4;
               var10001 = false;
            }
         }
      }

      PackageManager.NameNotFoundException var2 = var10000;
      var7 = new StringBuilder();
      var7.append("No such package: ");
      var7.append(this.a.getPackageName());
      Log.e("ContentValues", var7.toString(), var2);
      return null;
   }

   private URL g(String var1) {
      try {
         URL var3 = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", var1}));
         return var3;
      } catch (MalformedURLException var2) {
         throw new FirebaseInstallationsException(var2.getMessage(), com.google.firebase.installations.FirebaseInstallationsException.a.n);
      }
   }

   private static byte[] h(JSONObject var0) {
      return var0.toString().getBytes("UTF-8");
   }

   private static boolean i(int var0) {
      boolean var1;
      if (var0 >= 200 && var0 < 300) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static void j() {
      Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
   }

   private static void k(HttpURLConnection var0, String var1, String var2, String var3) {
      String var4 = o(var0);
      if (!TextUtils.isEmpty(var4)) {
         Log.w("Firebase-Installations", var4);
         Log.w("Firebase-Installations", a(var1, var2, var3));
      }

   }

   private HttpURLConnection l(URL var1, String var2) {
      HttpURLConnection var7;
      try {
         var7 = (HttpURLConnection)var1.openConnection();
      } catch (IOException var6) {
         throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.a.n);
      }

      var7.setConnectTimeout(10000);
      var7.setUseCaches(false);
      var7.setReadTimeout(10000);
      var7.addRequestProperty("Content-Type", "application/json");
      var7.addRequestProperty("Accept", "application/json");
      var7.addRequestProperty("Content-Encoding", "gzip");
      var7.addRequestProperty("Cache-Control", "no-cache");
      var7.addRequestProperty("X-Android-Package", this.a.getPackageName());
      j var3 = (j)this.b.get();
      if (var3 != null) {
         try {
            var7.addRequestProperty("x-firebase-client", (String)y2.j.a(var3.a()));
         } catch (ExecutionException var4) {
            Log.w("ContentValues", "Failed to get heartbeats header", var4);
         } catch (InterruptedException var5) {
            Thread.currentThread().interrupt();
            Log.w("ContentValues", "Failed to get heartbeats header", var5);
         }
      }

      var7.addRequestProperty("X-Android-Cert", this.f());
      var7.addRequestProperty("x-goog-api-key", var2);
      return var7;
   }

   static long m(String var0) {
      n.b(d.matcher(var0).matches(), "Invalid Expiration Timestamp.");
      long var1;
      if (var0 != null && var0.length() != 0) {
         var1 = Long.parseLong(var0.substring(0, var0.length() - 1));
      } else {
         var1 = 0L;
      }

      return var1;
   }

   private d n(HttpURLConnection var1) {
      InputStream var4 = var1.getInputStream();
      JsonReader var3 = new JsonReader(new InputStreamReader(var4, e));
      f.a var2 = f.a();
      d.a var6 = x4.d.a();
      var3.beginObject();

      while(true) {
         while(var3.hasNext()) {
            String var5 = var3.nextName();
            if (var5.equals("name")) {
               var6.f(var3.nextString());
            } else if (var5.equals("fid")) {
               var6.c(var3.nextString());
            } else if (var5.equals("refreshToken")) {
               var6.d(var3.nextString());
            } else if (!var5.equals("authToken")) {
               var3.skipValue();
            } else {
               var3.beginObject();

               while(var3.hasNext()) {
                  var5 = var3.nextName();
                  if (var5.equals("token")) {
                     var2.c(var3.nextString());
                  } else if (var5.equals("expiresIn")) {
                     var2.d(m(var3.nextString()));
                  } else {
                     var3.skipValue();
                  }
               }

               var6.b(var2.a());
               var3.endObject();
            }
         }

         var3.endObject();
         var3.close();
         var4.close();
         return var6.e(d.b.m).a();
      }
   }

   private static String o(HttpURLConnection param0) {
      // $FF: Couldn't be decompiled
   }

   private f p(HttpURLConnection var1) {
      InputStream var3 = var1.getInputStream();
      JsonReader var5 = new JsonReader(new InputStreamReader(var3, e));
      f.a var4 = f.a();
      var5.beginObject();

      while(var5.hasNext()) {
         String var2 = var5.nextName();
         if (var2.equals("token")) {
            var4.c(var5.nextString());
         } else if (var2.equals("expiresIn")) {
            var4.d(m(var5.nextString()));
         } else {
            var5.skipValue();
         }
      }

      var5.endObject();
      var5.close();
      var3.close();
      return var4.b(f.b.m).a();
   }

   private void q(HttpURLConnection var1, String var2, String var3) {
      s(var1, h(b(var2, var3)));
   }

   private void r(HttpURLConnection var1) {
      s(var1, h(c()));
   }

   private static void s(URLConnection var0, byte[] var1) {
      OutputStream var8 = var0.getOutputStream();
      if (var8 != null) {
         GZIPOutputStream var2 = new GZIPOutputStream(var8);

         try {
            var2.write(var1);
         } finally {
            try {
               var2.close();
               var8.close();
            } catch (IOException var6) {
            }

         }

      } else {
         throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
      }
   }

   public d d(String param1, String param2, String param3, String param4, String param5) {
      // $FF: Couldn't be decompiled
   }

   public f e(String param1, String param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }
}
