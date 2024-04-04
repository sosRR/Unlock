package u0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;

class z {
   private static final l0 a;
   static final Property b;
   static final Property c;

   static {
      if (VERSION.SDK_INT >= 29) {
         a = new k0();
      } else {
         a = new j0();
      }

      b = new Property(Float.class, "translationAlpha") {
         public Float a(View var1) {
            return z.c(var1);
         }

         public void b(View var1, Float var2) {
            z.g(var1, var2);
         }
      };
      c = new Property(Rect.class, "clipBounds") {
         public Rect a(View var1) {
            return androidx.core.view.d0.t(var1);
         }

         public void b(View var1, Rect var2) {
            androidx.core.view.d0.v0(var1, var2);
         }
      };
   }

   static void a(View var0) {
      a.a(var0);
   }

   static y b(View var0) {
      return new x(var0);
   }

   static float c(View var0) {
      return a.b(var0);
   }

   static o0 d(View var0) {
      return new n0(var0);
   }

   static void e(View var0) {
      a.c(var0);
   }

   static void f(View var0, int var1, int var2, int var3, int var4) {
      a.d(var0, var1, var2, var3, var4);
   }

   static void g(View var0, float var1) {
      a.e(var0, var1);
   }

   static void h(View var0, int var1) {
      a.f(var0, var1);
   }

   static void i(View var0, Matrix var1) {
      a.g(var0, var1);
   }

   static void j(View var0, Matrix var1) {
      a.h(var0, var1);
   }
}
