package g5;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class i {
   private static final String c = "i";
   private boolean a = true;
   private JSONObject b;

   public i(JSONObject var1) {
      h6.a.b(c).a("UnlockInfo");
      this.b = var1;
   }

   public boolean a() {
      h6.a.b(c).a("getEligibility");

      try {
         if (this.b.isNull("unlock_eligible")) {
            return false;
         } else {
            boolean var1 = this.b.getBoolean("unlock_eligible");
            return var1;
         }
      } catch (JSONException var3) {
         return false;
      }
   }

   public Set b() {
      HashSet var3 = new HashSet();
      int var1 = 0;

      while(true) {
         try {
            if (this.b.getJSONArray("display_eligibility_reasons").isNull(var1)) {
               break;
            }

            var3.add(this.b.getJSONArray("display_eligibility_reasons").getString(var1));
         } catch (JSONException var4) {
            break;
         }

         ++var1;
      }

      return var3;
   }
}
