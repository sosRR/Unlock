package s3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import z2.b;

public class a {
   private static final int[] a;
   private static final int[] b;

   static {
      a = new int[]{16842752, z2.b.I};
      b = new int[]{z2.b.v};
   }

   private static int a(Context var0, AttributeSet var1) {
      TypedArray var4 = var0.obtainStyledAttributes(var1, a);
      int var2 = var4.getResourceId(0, 0);
      int var3 = var4.getResourceId(1, 0);
      var4.recycle();
      if (var2 == 0) {
         var2 = var3;
      }

      return var2;
   }

   private static int b(Context var0, AttributeSet var1, int var2, int var3) {
      TypedArray var4 = var0.obtainStyledAttributes(var1, b, var2, var3);
      var2 = var4.getResourceId(0, 0);
      var4.recycle();
      return var2;
   }

   public static Context c(Context var0, AttributeSet var1, int var2, int var3) {
      var3 = b(var0, var1, var2, var3);
      boolean var5;
      if (var0 instanceof d && ((d)var0).c() == var3) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var3 != 0 && !var5) {
         d var4 = new d(var0, var3);
         var2 = a(var0, var1);
         if (var2 != 0) {
            var4.getTheme().applyStyle(var2, true);
         }

         return var4;
      } else {
         return var0;
      }
   }
}
