package q3;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.o;

public class h {
   static d a(int var0) {
      if (var0 != 0) {
         return (d)(var0 != 1 ? b() : new e());
      } else {
         return new j();
      }
   }

   static d b() {
      return new j();
   }

   static f c() {
      return new f();
   }

   public static void d(View var0, float var1) {
      Drawable var2 = var0.getBackground();
      if (var2 instanceof g) {
         ((g)var2).W(var1);
      }

   }

   public static void e(View var0) {
      Drawable var1 = var0.getBackground();
      if (var1 instanceof g) {
         f(var0, (g)var1);
      }

   }

   public static void f(View var0, g var1) {
      if (var1.P()) {
         var1.a0(o.d(var0));
      }

   }
}
