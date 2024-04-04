package n3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.l1;

public class c {
   public static ColorStateList a(Context var0, TypedArray var1, int var2) {
      if (var1.hasValue(var2)) {
         int var3 = var1.getResourceId(var2, 0);
         if (var3 != 0) {
            ColorStateList var4 = f.a.a(var0, var3);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return var1.getColorStateList(var2);
   }

   public static ColorStateList b(Context var0, l1 var1, int var2) {
      if (var1.s(var2)) {
         int var3 = var1.n(var2, 0);
         if (var3 != 0) {
            ColorStateList var4 = f.a.a(var0, var3);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return var1.c(var2);
   }

   public static int c(Context var0, TypedArray var1, int var2, int var3) {
      TypedValue var4 = new TypedValue();
      if (var1.getValue(var2, var4) && var4.type == 2) {
         TypedArray var5 = var0.getTheme().obtainStyledAttributes(new int[]{var4.data});
         var2 = var5.getDimensionPixelSize(0, var3);
         var5.recycle();
         return var2;
      } else {
         return var1.getDimensionPixelSize(var2, var3);
      }
   }

   public static Drawable d(Context var0, TypedArray var1, int var2) {
      if (var1.hasValue(var2)) {
         int var3 = var1.getResourceId(var2, 0);
         if (var3 != 0) {
            Drawable var4 = f.a.b(var0, var3);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return var1.getDrawable(var2);
   }

   static int e(TypedArray var0, int var1, int var2) {
      return var0.hasValue(var1) ? var1 : var2;
   }

   public static d f(Context var0, TypedArray var1, int var2) {
      if (var1.hasValue(var2)) {
         var2 = var1.getResourceId(var2, 0);
         if (var2 != 0) {
            return new d(var0, var2);
         }
      }

      return null;
   }

   public static boolean g(Context var0) {
      boolean var1;
      if (var0.getResources().getConfiguration().fontScale >= 1.3F) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static boolean h(Context var0) {
      boolean var1;
      if (var0.getResources().getConfiguration().fontScale >= 2.0F) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
