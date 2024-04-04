package f5;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class a extends Fragment {
   private static final String n0 = "a";

   // $FF: synthetic method
   static String P1() {
      return n0;
   }

   public void v0(Bundle var1) {
      h6.a.b(n0).a("onCreate");
      super.v0(var1);
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      String var4 = n0;
      h6.a.b(var4).a("onCreateView");
      String var11 = d5.e.d(this.w1());
      View var5 = var1.inflate(2131492913, var2, false);
      TextView var10 = (TextView)var5.findViewById(2131296779);
      TextView var7 = (TextView)var5.findViewById(2131296270);
      TextView var9 = (TextView)var5.findViewById(2131296523);
      TextView var8 = (TextView)var5.findViewById(2131296608);
      Button var6 = (Button)var5.findViewById(2131296645);
      var10.setText(Html.fromHtml(this.Z(2131820583, new Object[]{"5.13.2", var11}), 63));
      var11.hashCode();
      if (!var11.equals("ASSURANCE")) {
         if (!var11.equals("METROPCS")) {
            h6.a.b(var4).a("About screen is TMO themed");
            var7.setText(Html.fromHtml(this.Z(2131820571, new Object[]{var11, this.Y(2131820582)}), 63));
            var9.setText(Html.fromHtml(this.Y(2131820575), 63));
         } else {
            h6.a.b(var4).a("About screen is MPCS themed");
            var7.setText(Html.fromHtml(this.Z(2131820571, new Object[]{var11, this.Y(2131820581)}), 63));
            var9.setText(Html.fromHtml(this.Y(2131820574), 63));
         }
      } else {
         h6.a.b(var4).a("About screen is ASUR themed");
         var7.setText(Html.fromHtml(this.Z(2131820571, new Object[]{var11, this.Y(2131820580)}), 63));
         var9.setText(Html.fromHtml(this.Y(2131820573), 63));
      }

      var8.setText(Html.fromHtml(this.Y(2131820576), 63));
      var7.setMovementMethod(LinkMovementMethod.getInstance());
      var9.setMovementMethod(LinkMovementMethod.getInstance());
      var6.setOnClickListener(new a$a(this));
      var8.setOnClickListener(new a$b(this));
      return var5;
   }
}
