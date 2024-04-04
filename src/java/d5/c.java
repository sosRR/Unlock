package d5;

import android.content.Context;
import android.net.Uri;
import com.tmobile.rsuapp.services.SimLockService;
import com.tmobile.rsucommon.errors.RsuException;
import g5.h;
import i5.m;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class c {
   private static final String f = "c";
   private final Context a;
   private final a b;
   private String c;
   private boolean d = false;
   private final Vector e = new Vector();

   public c(Context var1) {
      this.a = var1;
      this.b = new a(var1);
   }

   private Uri a(Map var1) {
      Uri.Builder var4 = new Uri.Builder();
      Iterator var2 = var1.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var4.appendQueryParameter(var3, (String)var1.get(var3));
      }

      return var4.build();
   }

   public void b(h var1) {
      String var2 = f;
      h6.a.b(var2).a("handleMessageData");
      if (!this.d) {
         h6.a.b(var2).k("IMEI not valid, cannot validate message data");
      } else {
         Iterator var14 = this.e.iterator();

         while(var14.hasNext()) {
            Map var3 = (Map)var14.next();

            RsuException var18;
            label61: {
               h6.a.b var5;
               Exception var10000;
               label60: {
                  boolean var10001;
                  label59: {
                     label71: {
                        try {
                           if (!this.c.equals(var3.get("imei"))) {
                              break label71;
                           }

                           if ("10".equals(var3.get("message_action"))) {
                              this.b.g();
                              this.g("com.tmobile.rsuapp.ACK_MESSAGE", this.a(var3), var1);
                              break label59;
                           }
                        } catch (RsuException var12) {
                           var18 = var12;
                           var10001 = false;
                           break label61;
                        } catch (Exception var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label60;
                        }

                        try {
                           h6.a.b(f).k("No valid action in FCM message");
                           break label59;
                        } catch (RsuException var10) {
                           var18 = var10;
                           var10001 = false;
                           break label61;
                        } catch (Exception var11) {
                           var10000 = var11;
                           var10001 = false;
                           break label60;
                        }
                     }

                     try {
                        var5 = h6.a.b(f);
                        StringBuilder var17 = new StringBuilder();
                        var17.append("IMEI: ");
                        var17.append(this.c);
                        var17.append(" != provided imei: ");
                        var17.append((String)var3.get("imei"));
                        var5.a(var17.toString());
                        throw m.c("Incorrect IMEI in incoming message");
                     } catch (RsuException var8) {
                        var18 = var8;
                        var10001 = false;
                        break label61;
                     } catch (Exception var9) {
                        var10000 = var9;
                        var10001 = false;
                        break label60;
                     }
                  }

                  try {
                     this.e.remove(var3);
                     continue;
                  } catch (RsuException var6) {
                     var18 = var6;
                     var10001 = false;
                     break label61;
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                  }
               }

               Exception var4 = var10000;
               var5 = h6.a.b(f);
               StringBuilder var15 = new StringBuilder();
               var15.append("Message receipt failed: ");
               var15.append(var4.getMessage());
               var5.k(var15.toString());
               continue;
            }

            RsuException var16 = var18;
            h6.a.b(f).k(var16.getMessage());
         }

      }
   }

   public String c(Map var1) {
      Iterator var3 = var1.keySet().iterator();

      String var2;
      StringBuilder var4;
      for(var2 = "{"; var3.hasNext(); var2 = var4.toString()) {
         String var5 = (String)var3.next();
         var4 = new StringBuilder();
         var4.append(var2);
         var4.append(var5);
         var4.append(":");
         var4.append((String)var1.get(var5));
         var4.append(", ");
      }

      StringBuilder var6 = new StringBuilder();
      var6.append(var2);
      var6.append("}");
      return var6.toString();
   }

   public void d() {
      h6.a.b(f).a("onRegisterTokenSuccess");
      d5.e.u(this.a, false);
   }

   public void e() {
      h6.a.b(f).a("onRegisterTokenSuccess");
      d5.e.u(this.a, true);
   }

   public void f(Map var1) {
      this.e.add(var1);
   }

   public void g(String var1, Uri var2, h var3) {
      SimLockService.B(this.a, var1, var2, (androidx.work.b)null, var3);
   }

   public void h(String var1, h var2) {
      this.c = var1;
      if (var1 != null) {
         this.d = true;
      }

      if (!this.e.isEmpty()) {
         this.b(var2);
      }

   }
}
