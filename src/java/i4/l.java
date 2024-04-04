package i4;

import b4.q;
import org.json.JSONObject;

class l implements h {
   private static d.a b(JSONObject var0) {
      return new d.a(var0.optBoolean("collect_reports", true), var0.optBoolean("collect_anrs", false));
   }

   private static d.b c(JSONObject var0) {
      return new d.b(var0.optInt("max_custom_exception_events", 8), 4);
   }

   private static long d(q var0, long var1, JSONObject var3) {
      if (var3.has("expires_at")) {
         var1 = var3.optLong("expires_at");
      } else {
         var1 = var0.a() + var1 * 1000L;
      }

      return var1;
   }

   public d a(q var1, JSONObject var2) {
      int var7 = var2.optInt("settings_version", 0);
      int var8 = var2.optInt("cache_duration", 3600);
      double var5 = var2.optDouble("on_demand_upload_rate_per_minute", 10.0);
      double var3 = var2.optDouble("on_demand_backoff_base", 1.2);
      int var9 = var2.optInt("on_demand_backoff_step_duration_seconds", 60);
      d.b var10;
      if (var2.has("session")) {
         var10 = c(var2.getJSONObject("session"));
      } else {
         var10 = c(new JSONObject());
      }

      d.a var11 = b(var2.getJSONObject("features"));
      return new d(d(var1, (long)var8, var2), var10, var11, var7, var8, var5, var3, var9);
   }
}
