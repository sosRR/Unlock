package h3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class a {
   public static PorterDuffColorFilter a(Drawable var0, ColorStateList var1, PorterDuff.Mode var2) {
      return var1 != null && var2 != null ? new PorterDuffColorFilter(var1.getColorForState(var0.getState(), 0), var2) : null;
   }
}
