package f3;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import n3.b;

public class a {
   public static int a(int var0, int var1) {
      return androidx.core.graphics.a.j(var0, Color.alpha(var0) * var1 / 255);
   }

   public static int b(Context var0, int var1, int var2) {
      TypedValue var3 = b.a(var0, var1);
      return var3 != null ? var3.data : var2;
   }

   public static int c(Context var0, int var1, String var2) {
      return b.d(var0, var1, var2);
   }

   public static int d(View var0, int var1) {
      return b.e(var0, var1);
   }

   public static int e(View var0, int var1, int var2) {
      return b(var0.getContext(), var1, var2);
   }

   public static boolean f(int var0) {
      boolean var1;
      if (var0 != 0 && androidx.core.graphics.a.c(var0) > 0.5) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static int g(int var0, int var1) {
      return androidx.core.graphics.a.f(var1, var0);
   }

   public static int h(int var0, int var1, float var2) {
      return g(var0, androidx.core.graphics.a.j(var1, Math.round((float)Color.alpha(var1) * var2)));
   }

   public static int i(View var0, int var1, int var2, float var3) {
      return h(d(var0, var1), d(var0, var2), var3);
   }
}
