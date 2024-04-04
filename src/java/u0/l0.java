package u0;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

class l0 {
   private static Field a;
   private static boolean b;

   public void a(View var1) {
      throw null;
   }

   public float b(View var1) {
      throw null;
   }

   public void c(View var1) {
      throw null;
   }

   public void d(View var1, int var2, int var3, int var4, int var5) {
      throw null;
   }

   public void e(View var1, float var2) {
      throw null;
   }

   public void f(View var1, int var2) {
      Field var4;
      if (!b) {
         try {
            var4 = View.class.getDeclaredField("mViewFlags");
            a = var4;
            var4.setAccessible(true);
         } catch (NoSuchFieldException var6) {
         }

         b = true;
      }

      var4 = a;
      if (var4 != null) {
         try {
            int var3 = var4.getInt(var1);
            a.setInt(var1, var2 | var3 & -13);
         } catch (IllegalAccessException var5) {
         }
      }

   }

   public void g(View var1, Matrix var2) {
      throw null;
   }

   public void h(View var1, Matrix var2) {
      throw null;
   }
}
