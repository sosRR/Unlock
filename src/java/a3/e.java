package a3;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class e extends Property {
   public static final Property b = new e();
   private final WeakHashMap a = new WeakHashMap();

   private e() {
      super(Integer.class, "drawableAlphaCompat");
   }

   public Integer a(Drawable var1) {
      return var1.getAlpha();
   }

   public void b(Drawable var1, Integer var2) {
      var1.setAlpha(var2);
   }
}
