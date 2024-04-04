package u0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

class h {
   static PropertyValuesHolder a(Property var0, Path var1) {
      return PropertyValuesHolder.ofObject(var0, (TypeConverter)null, var1);
   }
}
