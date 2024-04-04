package l3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.e;
import n3.b;

public class a {
   private static float a(String[] var0, int var1) {
      float var2 = Float.parseFloat(var0[var1]);
      if (!(var2 < 0.0F) && !(var2 > 1.0F)) {
         return var2;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Motion easing control point value must be between 0 and 1; instead got: ");
         var3.append(var2);
         throw new IllegalArgumentException(var3.toString());
      }
   }

   private static String b(String var0, String var1) {
      return var0.substring(var1.length() + 1, var0.length() - 1);
   }

   private static boolean c(String var0, String var1) {
      StringBuilder var3 = new StringBuilder();
      var3.append(var1);
      var3.append("(");
      boolean var2;
      if (var0.startsWith(var3.toString()) && var0.endsWith(")")) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static int d(Context var0, int var1, int var2) {
      return b.c(var0, var1, var2);
   }

   public static TimeInterpolator e(Context var0, int var1, TimeInterpolator var2) {
      TypedValue var3 = new TypedValue();
      if (var0.getTheme().resolveAttribute(var1, var3, true)) {
         if (var3.type == 3) {
            String var6 = String.valueOf(var3.string);
            if (c(var6, "cubic-bezier")) {
               String[] var5 = b(var6, "cubic-bezier").split(",");
               if (var5.length == 4) {
                  return androidx.core.view.animation.a.a(a(var5, 0), a(var5, 1), a(var5, 2), a(var5, 3));
               } else {
                  StringBuilder var7 = new StringBuilder();
                  var7.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                  var7.append(var5.length);
                  throw new IllegalArgumentException(var7.toString());
               }
            } else if (c(var6, "path")) {
               return androidx.core.view.animation.a.b(e.d(b(var6, "path")));
            } else {
               StringBuilder var4 = new StringBuilder();
               var4.append("Invalid motion easing type: ");
               var4.append(var6);
               throw new IllegalArgumentException(var4.toString());
            }
         } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
         }
      } else {
         return var2;
      }
   }
}
