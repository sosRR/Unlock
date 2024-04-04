package f5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.tmobile.rsuapp.MainActivity;
import java.util.Iterator;
import java.util.List;

public class d extends androidx.preference.i {
   private static final String x0 = "d";
   private d w0;

   // $FF: synthetic method
   static d h2(d var0) {
      return var0.w0;
   }

   public void W1(Bundle var1, String var2) {
      h6.a.b(x0).a("onCreatePreferences");
      this.e2(2132017153, var2);
      this.w0 = new d(this, this.w1());
   }

   public void v0(Bundle var1) {
      h6.a.b(x0).a("onCreate");
      super.v0(var1);
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      Preference var9 = this.e("status_locked");
      Preference var6 = this.e("reasons");
      Preference var7 = this.e("unlock_policy");
      Preference var11 = this.e("temp_unlock_eligible");
      Preference var12 = this.e("temp_unlock_activate");
      Preference var10 = this.e("temp_unlock_requirements");
      Preference var8 = this.e("full_unlock");
      var6.A0(false);
      var11.A0(false);
      var12.A0(false);
      var10.A0(false);
      var8.A0(false);
      String var4 = d5.e.d(this.w1());
      var4.hashCode();
      String var5;
      if (!var4.equals("ASSURANCE")) {
         if (!var4.equals("METROPCS")) {
            var4 = this.Y(2131820642);
            var5 = this.Y(2131820643);
         } else {
            var4 = this.Y(2131820629);
            var5 = this.Y(2131820630);
         }
      } else {
         var4 = this.Y(2131820623);
         var5 = this.Y(2131820624);
      }

      if ("TMOBILE".equals(d5.e.d(this.w1()))) {
         var11.A0(true);
         if (d5.e.p(this.w1())) {
            var11.v0(2131820638);
            var12.t0(new d$a(this));
            var12.A0(true);
         } else {
            var11.v0(2131820639);
            List var16 = d5.e.f(this.w1());
            if (var16 != null && var16.size() > 0) {
               var10.t0(new d$b(this, var16));
               var10.A0(true);
            }
         }
      }

      if (d5.e.m(this.w1())) {
         var8.A0(true);
         var8.t0(new d$c(this));
      }

      var9.w0(this.Z(2131820632, new Object[]{var4}));
      var7.q0((new Intent("android.intent.action.VIEW")).setData(Uri.parse(var5)));
      if (d5.e.c(this.w1()) != null) {
         var6.A0(true);
         StringBuilder var13 = new StringBuilder();
         var13.append(this.Y(2131820625));
         var13.append("\n");
         StringBuilder var15 = new StringBuilder(var13.toString());
         Iterator var14 = d5.e.c(this.w1()).iterator();

         while(var14.hasNext()) {
            var4 = (String)var14.next();
            var15.append("\n❌  ");
            var15.append(var4);
         }

         var6.w0(var15.toString());
      }

      return super.z0(var1, var2, var3);
   }

   private class d implements g5.h {
      private Context a;
      final d b;

      d(d var1, Context var2) {
         this.b = var1;
         this.a = var2;
      }

      public void a(int var1, androidx.work.b var2) {
         h6.a.b(d.x0).a("onReceiveResult");
         String var3 = var2.j("key-action");
         String var7 = var2.j("key-result-string");
         Context var4 = this.b.y();
         if (var4 == null) {
            h6.a.b(d.x0).b("Result receiver lacking context");
         } else {
            MainActivity var9 = (MainActivity)var4;
            if (var1 == 0) {
               if ("com.tmobile.rsuapp.TEMPORARY_UNLOCK".equals(var3)) {
                  h6.a.b(d.x0).a("Successfully Partially Unlocked device");
                  var9.f0();
               } else if ("com.tmobile.rsuapp.PERMANENT_UNLOCK".equals(var3)) {
                  h6.a.b(d.x0).a("Successfully Fully Unlocked device.");
                  var9.b0(g.class);
               }
            } else if (!var9.Z()) {
               var9.b0(e.class);
            } else if ("com.tmobile.rsuapp.PERMANENT_UNLOCK".equals(var3) && d5.e.c(this.b.w1()).size() > 0) {
               new g5.g(this.b.w1(), 2131820625, d5.e.c(this.b.w1()), 2131820644);
            } else {
               h6.a.b var6 = h6.a.b(d.x0);
               StringBuilder var5 = new StringBuilder();
               var5.append("Action ");
               var5.append(var3);
               var5.append(" returned error ");
               var5.append(var1);
               var6.a(var5.toString());
               Bundle var8 = new Bundle();
               var8.putString("key-error-string-arg", var7);
               var9.c0(f.class, var8);
            }

            var9.Y();
         }
      }
   }
}
