package f5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;

public class h extends Fragment {
   private static final String n0 = "h";

   public void v0(Bundle var1) {
      h6.a.b(n0).a("onCreate");
      super.v0(var1);
   }

   public View z0(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      h6.a.b(n0).a("onCreateView");
      View var4 = var1.inflate(2131492915, var2, false);
      WebView var5 = (WebView)var4.findViewById(2131296608);
      var5.loadUrl("file:///android_asset/NOTICE.txt");
      var5.getSettings().setLoadWithOverviewMode(true);
      var5.getSettings().setUseWideViewPort(true);
      var5.getSettings().setBuiltInZoomControls(true);
      var5.getSettings().setDisplayZoomControls(false);
      return var4;
   }
}
