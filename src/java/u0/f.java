package u0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

class f {
   static ObjectAnimator a(Object var0, Property var1, Path var2) {
      return ObjectAnimator.ofObject(var0, var1, (TypeConverter)null, var2);
   }
}
