package d3;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {
   void a();

   void b();

   int getCircularRevealScrimColor();

   d3.d.e getRevealInfo();

   void setCircularRevealOverlayDrawable(Drawable var1);

   void setCircularRevealScrimColor(int var1);

   void setRevealInfo(d3.d.e var1);

   public static class b implements TypeEvaluator {
      public static final TypeEvaluator b = new d3.d.b();
      private final d3.d.e a = new d3.d.e();

      public d3.d.e a(float var1, d3.d.e var2, d3.d.e var3) {
         this.a.a(k3.a.c(var2.a, var3.a, var1), k3.a.c(var2.b, var3.b, var1), k3.a.c(var2.c, var3.c, var1));
         return this.a;
      }
   }

   public static class c extends Property {
      public static final Property a = new d3.d.c("circularReveal");

      private c(String var1) {
         super(d3.d.e.class, var1);
      }

      public d3.d.e a(d3.d var1) {
         return var1.getRevealInfo();
      }

      public void b(d3.d var1, d3.d.e var2) {
         var1.setRevealInfo(var2);
      }
   }

   public static class d extends Property {
      public static final Property a = new d3.d("circularRevealScrimColor");

      private d(String var1) {
         super(Integer.class, var1);
      }

      public Integer a(d3.d var1) {
         return var1.getCircularRevealScrimColor();
      }

      public void b(d3.d var1, Integer var2) {
         var1.setCircularRevealScrimColor(var2);
      }
   }

   public static class e {
      public float a;
      public float b;
      public float c;

      private e() {
      }

      public e(float var1, float var2, float var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }

      // $FF: synthetic method
      e(Object var1) {
         this();
      }

      public void a(float var1, float var2, float var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }
}
