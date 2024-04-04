package f5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class g extends Fragment {
   public void v0(Bundle var1) {
      super.v0(var1);
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2131492914, var2, false);
      Button var6 = (Button)var4.findViewById(2131296363);
      Button var5 = (Button)var4.findViewById(2131296362);
      var6.setOnClickListener(new g$a(this));
      var5.setOnClickListener(new g$b(this));
      return var4;
   }
}
