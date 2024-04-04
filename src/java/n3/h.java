package n3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build.VERSION;

public class h {
   public static Typeface a(Context var0, Typeface var1) {
      return b(var0.getResources().getConfiguration(), var1);
   }

   public static Typeface b(Configuration var0, Typeface var1) {
      return VERSION.SDK_INT >= 31 && g.a(var0) != Integer.MAX_VALUE && g.a(var0) != 0 ? Typeface.create(var1, x.a.b(var1.getWeight() + g.a(var0), 1, 1000), var1.isItalic()) : null;
   }
}
