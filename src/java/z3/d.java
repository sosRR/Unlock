package z3;

import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, a4.b {
   private a4.a a;

   private static String b(String var0, Bundle var1) {
      JSONObject var5 = new JSONObject();
      JSONObject var4 = new JSONObject();
      Iterator var3 = var1.keySet().iterator();

      while(var3.hasNext()) {
         String var2 = (String)var3.next();
         var4.put(var2, var1.get(var2));
      }

      var5.put("name", var0);
      var5.put("parameters", var4);
      return var5.toString();
   }

   public void a(a4.a var1) {
      this.a = var1;
      y3.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
   }

   public void l(String var1, Bundle var2) {
      a4.a var3 = this.a;
      if (var3 != null) {
         try {
            StringBuilder var4 = new StringBuilder();
            var4.append("$A$:");
            var4.append(b(var1, var2));
            var3.a(var4.toString());
         } catch (JSONException var5) {
            y3.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
         }
      }

   }
}
