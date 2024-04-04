package c4;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

class d {
   private static final Charset b = Charset.forName("UTF-8");
   private final g4.f a;

   public d(g4.f var1) {
      this.a = var1;
   }

   private static Map d(String var0) {
      JSONObject var3 = new JSONObject(var0);
      HashMap var4 = new HashMap();
      Iterator var1 = var3.keys();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         var4.put(var2, i(var3, var2));
      }

      return var4;
   }

   private String e(String var1) {
      return i(new JSONObject(var1), "userId");
   }

   private static void h(File var0) {
      if (var0.exists() && var0.delete()) {
         y3.f var1 = y3.f.f();
         StringBuilder var2 = new StringBuilder();
         var2.append("Deleted corrupt file: ");
         var2.append(var0.getAbsolutePath());
         var1.g(var2.toString());
      }

   }

   private static String i(JSONObject var0, String var1) {
      boolean var2 = var0.isNull(var1);
      String var3 = null;
      if (!var2) {
         var3 = var0.optString(var1, (String)null);
      }

      return var3;
   }

   public File a(String var1) {
      return this.a.o(var1, "internal-keys");
   }

   public File b(String var1) {
      return this.a.o(var1, "keys");
   }

   public File c(String var1) {
      return this.a.o(var1, "user-data");
   }

   Map f(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public String g(String param1) {
      // $FF: Couldn't be decompiled
   }
}
