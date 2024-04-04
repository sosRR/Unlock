package d5;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessaging;
import g5.h;
import java.util.Map;

public class b {
   private static final String d = "b";
   private final d a;
   private final c b;
   private final Context c;

   public b(Context var1) {
      h6.a.b(d).a("FirebaseManager");
      this.c = var1;
      com.google.firebase.d.p(var1);
      c var2 = new c(var1);
      this.b = var2;
      d var3 = new d(this, (b$a)null);
      this.a = var3;
      var2.g("com.tmobile.rsuapp.GET_IMEI", (Uri)null, var3);
   }

   public void e(Map var1) {
      String var2 = d;
      h6.a.b(var2).a("onMessageReceived");
      h6.a.b var3 = h6.a.b(var2);
      StringBuilder var4 = new StringBuilder();
      var4.append("Received data -> ");
      var4.append(this.b.c(var1));
      var3.a(var4.toString());
      this.b.f(var1);
      this.b.b(this.a);
   }

   public void f(String var1) {
      h6.a.b(d).a("onNewToken");
      this.i(var1);
   }

   public void g(String var1, Exception var2) {
      h6.a.b(d).a("onSendError");
   }

   public void h() {
      h6.a.b(d).a("registerToken()");
      FirebaseMessaging.l().o().c(new b$c(this)).e(new b$b(this));
   }

   public void i(String var1) {
      String var2 = d;
      h6.a.b(var2).a("registerToken(token)");
      if (e.i(this.c)) {
         h6.a.b(var2).a("Aborting registerToken due to simultaneous registration.");
      } else {
         e.t(this.c, true);
         Uri.Builder var3 = new Uri.Builder();
         com.google.firebase.installations.c.n().getId().c(new b$a(this, var1, var3));
      }
   }

   private class d implements h {
      final b a;

      private d(b var1) {
         this.a = var1;
      }

      // $FF: synthetic method
      d(b var1, b$a var2) {
         this(var1);
      }

      public void a(int var1, androidx.work.b var2) {
         String var3 = var2.j("key-action");
         String var4 = var2.j("key-result-string");
         if ("com.tmobile.rsuapp.GET_IMEI".equals(var3)) {
            if (var1 == 0 && var4 != null) {
               h6.a.b(d5.b.d).a("Successfully retrieved IMEI");
               this.a.b.h(var4, this.a.a);
            } else {
               h6.a.b(d5.b.d).k("Could not retrieve IMEI");
            }
         } else if ("com.tmobile.rsuapp.UPDATE_TOKEN".equals(var3)) {
            e.t(this.a.c, false);
            if (var1 == 0) {
               h6.a.b(d5.b.d).a("Successfully updated token");
               this.a.b.e();
            } else {
               h6.a.b(d5.b.d).k("Failed to update token");
            }
         }

      }
   }
}
