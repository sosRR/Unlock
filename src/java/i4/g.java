package i4;

import b4.q;
import org.json.JSONObject;

public class g {
   private final q a;

   g(q var1) {
      this.a = var1;
   }

   private static h a(int var0) {
      if (var0 != 3) {
         y3.f var2 = y3.f.f();
         StringBuilder var1 = new StringBuilder();
         var1.append("Could not determine SettingsJsonTransform for settings version ");
         var1.append(var0);
         var1.append(". Using default settings values.");
         var2.d(var1.toString());
         return new b();
      } else {
         return new l();
      }
   }

   public d b(JSONObject var1) {
      return a(var1.getInt("settings_version")).a(this.a, var1);
   }
}
