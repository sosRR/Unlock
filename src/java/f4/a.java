package f4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import y3.f;

public class a {
   private final String a;
   private final Map b;
   private final Map c;

   public a(String var1, Map var2) {
      this.a = var1;
      this.b = var2;
      this.c = new HashMap();
   }

   private String a(Map var1) {
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.entrySet().iterator();
      Map.Entry var5 = (Map.Entry)var3.next();
      StringBuilder var4 = new StringBuilder();
      var4.append((String)var5.getKey());
      var4.append("=");
      String var6;
      if (var5.getValue() != null) {
         var6 = (String)var5.getValue();
      } else {
         var6 = "";
      }

      var4.append(var6);
      var2.append(var4.toString());

      while(var3.hasNext()) {
         var5 = (Map.Entry)var3.next();
         var4 = new StringBuilder();
         var4.append("&");
         var4.append((String)var5.getKey());
         var4.append("=");
         if (var5.getValue() != null) {
            var6 = (String)var5.getValue();
         } else {
            var6 = "";
         }

         var4.append(var6);
         var2.append(var4.toString());
      }

      return var2.toString();
   }

   private String b(String var1, Map var2) {
      String var3 = this.a(var2);
      if (var3.isEmpty()) {
         return var1;
      } else {
         StringBuilder var4;
         if (var1.contains("?")) {
            String var5 = var3;
            if (!var1.endsWith("&")) {
               var4 = new StringBuilder();
               var4.append("&");
               var4.append(var3);
               var5 = var4.toString();
            }

            StringBuilder var6 = new StringBuilder();
            var6.append(var1);
            var6.append(var5);
            return var6.toString();
         } else {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append("?");
            var4.append(var3);
            return var4.toString();
         }
      }
   }

   private String e(InputStream var1) {
      BufferedReader var4 = new BufferedReader(new InputStreamReader(var1, "UTF-8"));
      char[] var3 = new char[8192];
      StringBuilder var5 = new StringBuilder();

      while(true) {
         int var2 = var4.read(var3);
         if (var2 == -1) {
            return var5.toString();
         }

         var5.append(var3, 0, var2);
      }
   }

   public c c() {
      Object var3 = null;
      String var2 = null;

      HttpsURLConnection var38;
      try {
         String var4 = this.b(this.a, this.b);
         f var6 = f.f();
         StringBuilder var5 = new StringBuilder();
         var5.append("GET Request URL: ");
         var5.append(var4);
         var6.i(var5.toString());
         URL var39 = new URL(var4);
         var38 = (HttpsURLConnection)var39.openConnection();
      } finally {
         ;
      }

      int var1;
      InputStream var41;
      label370: {
         Throwable var10000;
         label371: {
            Iterator var42;
            boolean var10001;
            try {
               var38.setReadTimeout(10000);
               var38.setConnectTimeout(10000);
               var38.setRequestMethod("GET");
               var42 = this.c.entrySet().iterator();
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break label371;
            }

            while(true) {
               try {
                  if (!var42.hasNext()) {
                     break;
                  }

                  Map.Entry var40 = (Map.Entry)var42.next();
                  var38.addRequestProperty((String)var40.getKey(), (String)var40.getValue());
               } catch (Throwable var36) {
                  var10000 = var36;
                  var10001 = false;
                  break label371;
               }
            }

            label354:
            try {
               var38.connect();
               var1 = var38.getResponseCode();
               var41 = var38.getInputStream();
               break label370;
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label354;
            }
         }

         Throwable var37 = var10000;
         if (var3 != null) {
            ((InputStream)var3).close();
         }

         if (var38 != null) {
            var38.disconnect();
         }

         throw var37;
      }

      if (var41 != null) {
         try {
            var2 = this.e(var41);
         } finally {
            ;
         }
      }

      if (var41 != null) {
         var41.close();
      }

      var38.disconnect();
      return new c(var1, var2);
   }

   public a d(String var1, String var2) {
      this.c.put(var1, var2);
      return this;
   }
}
