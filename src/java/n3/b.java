package n3;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public class b {
   public static TypedValue a(Context var0, int var1) {
      TypedValue var2 = new TypedValue();
      return var0.getTheme().resolveAttribute(var1, var2, true) ? var2 : null;
   }

   public static boolean b(Context var0, int var1, boolean var2) {
      TypedValue var4 = a(var0, var1);
      boolean var3 = var2;
      if (var4 != null) {
         var3 = var2;
         if (var4.type == 18) {
            if (var4.data != 0) {
               var3 = true;
            } else {
               var3 = false;
            }
         }
      }

      return var3;
   }

   public static int c(Context var0, int var1, int var2) {
      TypedValue var3 = a(var0, var1);
      var1 = var2;
      if (var3 != null) {
         var1 = var2;
         if (var3.type == 16) {
            var1 = var3.data;
         }
      }

      return var1;
   }

   public static int d(Context var0, int var1, String var2) {
      TypedValue var3 = a(var0, var1);
      if (var3 != null) {
         return var3.data;
      } else {
         throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{var2, var0.getResources().getResourceName(var1)}));
      }
   }

   public static int e(View var0, int var1) {
      return d(var0.getContext(), var1, var0.getClass().getCanonicalName());
   }
}
