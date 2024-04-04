package q3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {
   @Deprecated
   public float a;
   @Deprecated
   public float b;
   @Deprecated
   public float c;
   @Deprecated
   public float d;
   @Deprecated
   public float e;
   @Deprecated
   public float f;
   private final List g = new ArrayList();
   private final List h = new ArrayList();
   private boolean i;

   public m() {
      this.n(0.0F, 0.0F);
   }

   private void b(float var1) {
      if (this.g() != var1) {
         float var2 = (var1 - this.g() + 360.0F) % 360.0F;
         if (!(var2 > 180.0F)) {
            f var3 = new f(this.i(), this.j(), this.i(), this.j()) {
               private static final RectF h = new RectF();
               @Deprecated
               public float b;
               @Deprecated
               public float c;
               @Deprecated
               public float d;
               @Deprecated
               public float e;
               @Deprecated
               public float f;
               @Deprecated
               public float g;

               public {
                  this.q(var1);
                  this.u(var2);
                  this.r(var3);
                  this.p(var4);
               }

               private float j() {
                  return this.e;
               }

               private float k() {
                  return this.b;
               }

               private float l() {
                  return this.d;
               }

               private float m() {
                  return this.f;
               }

               private float n() {
                  return this.g;
               }

               private float o() {
                  return this.c;
               }

               private void p(float var1) {
                  this.e = var1;
               }

               private void q(float var1) {
                  this.b = var1;
               }

               private void r(float var1) {
                  this.d = var1;
               }

               private void s(float var1) {
                  this.f = var1;
               }

               private void t(float var1) {
                  this.g = var1;
               }

               private void u(float var1) {
                  this.c = var1;
               }

               public void a(Matrix var1, Path var2) {
                  Matrix var3 = super.a;
                  var1.invert(var3);
                  var2.transform(var3);
                  RectF var4 = h;
                  var4.set(this.k(), this.o(), this.l(), this.j());
                  var2.arcTo(var4, this.m(), this.n(), false);
                  var2.transform(var1);
               }
            };
            var3.s(this.g());
            var3.t(var2);
            this.h.add(new g(var3) {
               private final <undefinedtype> b;

               public {
                  this.b = var1;
               }

               public void a(Matrix var1, p3.a var2, int var3, Canvas var4) {
                  float var6 = this.b.m();
                  float var5 = this.b.n();
                  var2.a(var4, var1, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), var3, var6, var5);
               }
            });
            this.p(var1);
         }
      }
   }

   private void c(g var1, float var2, float var3) {
      this.b(var2);
      this.h.add(var1);
      this.p(var3);
   }

   private float g() {
      return this.e;
   }

   private float h() {
      return this.f;
   }

   private void p(float var1) {
      this.e = var1;
   }

   private void q(float var1) {
      this.f = var1;
   }

   private void r(float var1) {
      this.c = var1;
   }

   private void s(float var1) {
      this.d = var1;
   }

   private void t(float var1) {
      this.a = var1;
   }

   private void u(float var1) {
      this.b = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      f var11 = new f(var1, var2, var3, var4) {
         private static final RectF h = new RectF();
         @Deprecated
         public float b;
         @Deprecated
         public float c;
         @Deprecated
         public float d;
         @Deprecated
         public float e;
         @Deprecated
         public float f;
         @Deprecated
         public float g;

         public {
            this.q(var1);
            this.u(var2);
            this.r(var3);
            this.p(var4);
         }

         private float j() {
            return this.e;
         }

         private float k() {
            return this.b;
         }

         private float l() {
            return this.d;
         }

         private float m() {
            return this.f;
         }

         private float n() {
            return this.g;
         }

         private float o() {
            return this.c;
         }

         private void p(float var1) {
            this.e = var1;
         }

         private void q(float var1) {
            this.b = var1;
         }

         private void r(float var1) {
            this.d = var1;
         }

         private void s(float var1) {
            this.f = var1;
         }

         private void t(float var1) {
            this.g = var1;
         }

         private void u(float var1) {
            this.c = var1;
         }

         public void a(Matrix var1, Path var2) {
            Matrix var3 = super.a;
            var1.invert(var3);
            var2.transform(var3);
            RectF var4 = h;
            var4.set(this.k(), this.o(), this.l(), this.j());
            var2.arcTo(var4, this.m(), this.n(), false);
            var2.transform(var1);
         }
      };
      var11.s(var5);
      var11.t(var6);
      this.g.add(var11);
      g var12 = new g(var11) {
         private final <undefinedtype> b;

         public {
            this.b = var1;
         }

         public void a(Matrix var1, p3.a var2, int var3, Canvas var4) {
            float var6 = this.b.m();
            float var5 = this.b.n();
            var2.a(var4, var1, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), var3, var6, var5);
         }
      };
      float var9 = var5 + var6;
      boolean var10;
      if (var6 < 0.0F) {
         var10 = true;
      } else {
         var10 = false;
      }

      var6 = var5;
      if (var10) {
         var6 = (var5 + 180.0F) % 360.0F;
      }

      if (var10) {
         var5 = (180.0F + var9) % 360.0F;
      } else {
         var5 = var9;
      }

      this.c(var12, var6, var5);
      var5 = (var3 - var1) / 2.0F;
      double var7 = (double)var9;
      this.r((var1 + var3) * 0.5F + var5 * (float)Math.cos(Math.toRadians(var7)));
      this.s((var2 + var4) * 0.5F + (var4 - var2) / 2.0F * (float)Math.sin(Math.toRadians(var7)));
   }

   public void d(Matrix var1, Path var2) {
      int var4 = this.g.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         ((f)this.g.get(var3)).a(var1, var2);
      }

   }

   boolean e() {
      return this.i;
   }

   g f(Matrix var1) {
      this.b(this.h());
      var1 = new Matrix(var1);
      return new m$a(this, new ArrayList(this.h), var1);
   }

   float i() {
      return this.c;
   }

   float j() {
      return this.d;
   }

   float k() {
      return this.a;
   }

   float l() {
      return this.b;
   }

   public void m(float var1, float var2) {
      f var3 = new f() {
         private float b;
         private float c;

         public void a(Matrix var1, Path var2) {
            Matrix var3 = super.a;
            var1.invert(var3);
            var2.transform(var3);
            var2.lineTo(this.b, this.c);
            var2.transform(var1);
         }
      };
      var3.b = var1;
      var3.c = var2;
      this.g.add(var3);
      g var4 = new g(var3, this.i(), this.j()) {
         private final <undefinedtype> b;
         private final float c;
         private final float d;

         public {
            this.b = var1;
            this.c = var2;
            this.d = var3;
         }

         public void a(Matrix var1, p3.a var2, int var3, Canvas var4) {
            float var7 = this.b.c;
            float var5 = this.d;
            float var6 = this.b.b;
            float var8 = this.c;
            RectF var9 = new RectF(0.0F, 0.0F, (float)Math.hypot((double)(var7 - var5), (double)(var6 - var8)), 0.0F);
            var1 = new Matrix(var1);
            var1.preTranslate(this.c, this.d);
            var1.preRotate(this.c());
            var2.b(var4, var1, var9, var3);
         }

         float c() {
            return (float)Math.toDegrees(Math.atan((double)((this.b.c - this.d) / (this.b.b - this.c))));
         }
      };
      this.c(var4, var4.c() + 270.0F, var4.c() + 270.0F);
      this.r(var1);
      this.s(var2);
   }

   public void n(float var1, float var2) {
      this.o(var1, var2, 270.0F, 0.0F);
   }

   public void o(float var1, float var2, float var3, float var4) {
      this.t(var1);
      this.u(var2);
      this.r(var1);
      this.s(var2);
      this.p(var3);
      this.q((var3 + var4) % 360.0F);
      this.g.clear();
      this.h.clear();
      this.i = false;
   }

   public abstract static class f {
      protected final Matrix a = new Matrix();

      public abstract void a(Matrix var1, Path var2);
   }

   abstract static class g {
      static final Matrix a = new Matrix();

      public abstract void a(Matrix var1, p3.a var2, int var3, Canvas var4);

      public final void b(p3.a var1, int var2, Canvas var3) {
         this.a(a, var1, var2, var3);
      }
   }
}
