package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

class h implements TransformationMethod {
   private final TransformationMethod m;

   h(TransformationMethod var1) {
      this.m = var1;
   }

   public TransformationMethod a() {
      return this.m;
   }

   public CharSequence getTransformation(CharSequence var1, View var2) {
      if (var2.isInEditMode()) {
         return var1;
      } else {
         TransformationMethod var4 = this.m;
         CharSequence var3 = var1;
         if (var4 != null) {
            var3 = var4.getTransformation(var1, var2);
         }

         var1 = var3;
         if (var3 != null) {
            if (androidx.emoji2.text.e.b().d() != 1) {
               var1 = var3;
            } else {
               var1 = androidx.emoji2.text.e.b().o(var3);
            }
         }

         return var1;
      }
   }

   public void onFocusChanged(View var1, CharSequence var2, boolean var3, int var4, Rect var5) {
      TransformationMethod var6 = this.m;
      if (var6 != null) {
         var6.onFocusChanged(var1, var2, var3, var4, var5);
      }

   }
}
