package f5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class e extends Fragment {
   private static final String n0 = "e";

   public void v0(Bundle var1) {
      super.v0(var1);
      h6.a.b(n0).a("onCreate");
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      h6.a.b(n0).a("onCreateView");
      View var4 = var1.inflate(2131492910, var2, false);
      ((Button)var4.findViewById(2131296455)).setOnClickListener(new e$a(this));
      return var4;
   }
}
