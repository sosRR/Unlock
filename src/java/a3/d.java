package a3;

import android.util.Property;
import android.view.ViewGroup;

public class d extends Property {
   public static final Property a = new d("childrenAlpha");

   private d(String var1) {
      super(Float.class, var1);
   }

   public Float a(ViewGroup var1) {
      Float var2 = (Float)var1.getTag(z2.f.A);
      return var2 != null ? var2 : 1.0F;
   }

   public void b(ViewGroup var1, Float var2) {
      float var3 = var2;
      var1.setTag(z2.f.A, var3);
      int var5 = var1.getChildCount();

      for(int var4 = 0; var4 < var5; ++var4) {
         var1.getChildAt(var4).setAlpha(var3);
      }

   }
}
