package f5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class f extends Fragment {
   private static final String n0 = "f";

   public void v0(Bundle var1) {
      super.v0(var1);
      h6.a.b(n0).a("onCreate");
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      h6.a.b(n0).a("onCreateView");
      View var4 = var1.inflate(2131492911, var2, false);
      ((Button)var4.findViewById(2131296457)).setOnClickListener(new f$a(this));
      Bundle var5 = this.w();
      if (var5 != null) {
         String var6 = var5.getString("key-error-string-arg");
         if (var6 != null && !var6.isEmpty()) {
            ((TextView)var4.findViewById(2131296456)).setText(var6);
         }
      }

      return var4;
   }
}
