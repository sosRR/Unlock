package g5;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class d {
   private static final String g = "d";
   private static final String[] h = new String[]{"FULL", "PERM"};
   private static final String[] i = new String[]{"PARTIAL", "TEMP"};
   private static final String[] j = new String[]{"NULL", "UNKNOWN"};
   private boolean a = false;
   private JSONObject b;
   private JSONObject c;
   private JSONObject d;
   private JSONObject e;
   private String f = "";

   public d(String var1) {
      String var4 = g;
      h6.a.b(var4).a("EligibilityInfo");

      Exception var10000;
      label91: {
         boolean var10001;
         try {
            JSONObject var3 = new JSONObject(var1);
            this.b = var3;
            if (var3.isNull("eligibility_info_ui")) {
               this.a = true;
               h6.a.b(var4).a("Data does not contain %s", "eligibility_info_ui");
            }
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label91;
         }

         List var12;
         try {
            var12 = Arrays.asList(j);
            if (!this.b.isNull("brand") && !var12.contains(this.b.getString("brand").toUpperCase())) {
               this.f = this.b.getString("brand");
            }
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label91;
         }

         List var15;
         try {
            var15 = Arrays.asList(h);
            var12 = Arrays.asList(i);
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label91;
         }

         int var2 = 0;

         while(true) {
            label72: {
               JSONObject var17;
               try {
                  if (this.b.getJSONArray("eligibility_info_ui").isNull(var2)) {
                     break;
                  }

                  var17 = (JSONObject)this.b.getJSONArray("eligibility_info_ui").get(var2);
                  if (var15.contains(var17.getString("unlock_type").toUpperCase())) {
                     this.d = (JSONObject)this.b.getJSONArray("eligibility_info_ui").get(var2);
                     break label72;
                  }
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label91;
               }

               try {
                  if (var12.contains(var17.getString("unlock_type").toUpperCase())) {
                     this.c = (JSONObject)this.b.getJSONArray("eligibility_info_ui").get(var2);
                  }
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label91;
               }
            }

            ++var2;
         }

         try {
            if (this.d == null) {
               this.a = true;
               h6.a.b var16 = h6.a.b(g);
               StringBuilder var13 = new StringBuilder();
               var13.append("Data does not contain eligibility_info_ui for ");
               var13.append(Arrays.toString(h));
               var16.a(var13.toString());
            }
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label91;
         }

         try {
            if (!this.b.isNull("eligibility_info")) {
               this.e = this.b.getJSONArray("eligibility_info").getJSONObject(0);
            }

            return;
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      if (var14.getMessage() != null) {
         h6.a.b(g).l(var14);
      } else {
         h6.a.b(g).k("Error occurred while generating EligibilityInfo");
      }

      this.a = true;
   }

   public i a() {
      return new i(this.d);
   }

   public i b() {
      return new i(this.c);
   }

   public String c() {
      return this.f;
   }

   public boolean d() {
      return this.a;
   }

   public boolean e() {
      boolean var1;
      if (!this.a && this.d != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean f() {
      boolean var1;
      if (!this.a && this.c != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
