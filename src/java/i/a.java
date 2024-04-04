package i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class a implements TransformationMethod {
   private Locale m;

   public a(Context var1) {
      this.m = var1.getResources().getConfiguration().locale;
   }

   public CharSequence getTransformation(CharSequence var1, View var2) {
      String var3;
      if (var1 != null) {
         var3 = var1.toString().toUpperCase(this.m);
      } else {
         var3 = null;
      }

      return var3;
   }

   public void onFocusChanged(View var1, CharSequence var2, boolean var3, int var4, Rect var5) {
   }
}
