package q3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;

public class l {
   private final m[] a = new m[4];
   private final Matrix[] b = new Matrix[4];
   private final Matrix[] c = new Matrix[4];
   private final PointF d = new PointF();
   private final Path e = new Path();
   private final Path f = new Path();
   private final m g = new m();
   private final float[] h = new float[2];
   private final float[] i = new float[2];
   private final Path j = new Path();
   private final Path k = new Path();
   private boolean l = true;

   public l() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.a[var1] = new m();
         this.b[var1] = new Matrix();
         this.c[var1] = new Matrix();
      }

   }

   private float a(int var1) {
      return (float)((var1 + 1) * 90);
   }

   private void b(c var1, int var2) {
      this.h[0] = this.a[var2].k();
      this.h[1] = this.a[var2].l();
      this.b[var2].mapPoints(this.h);
      if (var2 == 0) {
         Path var3 = var1.b;
         float[] var4 = this.h;
         var3.moveTo(var4[0], var4[1]);
      } else {
         Path var7 = var1.b;
         float[] var6 = this.h;
         var7.lineTo(var6[0], var6[1]);
      }

      this.a[var2].d(this.b[var2], var1.b);
      b var5 = var1.d;
      if (var5 != null) {
         var5.a(this.a[var2], this.b[var2], var2);
      }

   }

   private void c(c var1, int var2) {
      int var5 = (var2 + 1) % 4;
      this.h[0] = this.a[var2].i();
      this.h[1] = this.a[var2].j();
      this.b[var2].mapPoints(this.h);
      this.i[0] = this.a[var5].k();
      this.i[1] = this.a[var5].l();
      this.b[var5].mapPoints(this.i);
      float[] var7 = this.h;
      float var3 = var7[0];
      float[] var6 = this.i;
      float var4 = Math.max((float)Math.hypot((double)(var3 - var6[0]), (double)(var7[1] - var6[1])) - 0.001F, 0.0F);
      var3 = this.i(var1.c, var2);
      this.g.n(0.0F, 0.0F);
      f var9 = this.j(var2, var1.a);
      var9.d(var4, var3, var1.e, this.g);
      this.j.reset();
      this.g.d(this.c[var2], this.j);
      if (!this.l || !var9.a() && !this.l(this.j, var2) && !this.l(this.j, var5)) {
         this.g.d(this.c[var2], var1.b);
      } else {
         Path var10 = this.j;
         var10.op(var10, this.f, Op.DIFFERENCE);
         this.h[0] = this.g.k();
         this.h[1] = this.g.l();
         this.c[var2].mapPoints(this.h);
         var10 = this.e;
         var7 = this.h;
         var10.moveTo(var7[0], var7[1]);
         this.g.d(this.c[var2], this.e);
      }

      b var8 = var1.d;
      if (var8 != null) {
         var8.b(this.g, this.c[var2], var2);
      }

   }

   private void f(int var1, RectF var2, PointF var3) {
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               var3.set(var2.right, var2.top);
            } else {
               var3.set(var2.left, var2.top);
            }
         } else {
            var3.set(var2.left, var2.bottom);
         }
      } else {
         var3.set(var2.right, var2.bottom);
      }

   }

   private q3.c g(int var1, k var2) {
      if (var1 != 1) {
         if (var1 != 2) {
            return var1 != 3 ? var2.t() : var2.r();
         } else {
            return var2.j();
         }
      } else {
         return var2.l();
      }
   }

   private d h(int var1, k var2) {
      if (var1 != 1) {
         if (var1 != 2) {
            return var1 != 3 ? var2.s() : var2.q();
         } else {
            return var2.i();
         }
      } else {
         return var2.k();
      }
   }

   private float i(RectF var1, int var2) {
      float[] var3 = this.h;
      m var4 = this.a[var2];
      var3[0] = var4.c;
      var3[1] = var4.d;
      this.b[var2].mapPoints(var3);
      return var2 != 1 && var2 != 3 ? Math.abs(var1.centerY() - this.h[1]) : Math.abs(var1.centerX() - this.h[0]);
   }

   private f j(int var1, k var2) {
      if (var1 != 1) {
         if (var1 != 2) {
            return var1 != 3 ? var2.o() : var2.p();
         } else {
            return var2.n();
         }
      } else {
         return var2.h();
      }
   }

   public static l k() {
      return l.a.a;
   }

   private boolean l(Path var1, int var2) {
      this.k.reset();
      this.a[var2].d(this.b[var2], this.k);
      RectF var5 = new RectF();
      boolean var4 = true;
      var1.computeBounds(var5, true);
      this.k.computeBounds(var5, true);
      var1.op(this.k, Op.INTERSECT);
      var1.computeBounds(var5, true);
      boolean var3 = var4;
      if (var5.isEmpty()) {
         if (var5.width() > 1.0F && var5.height() > 1.0F) {
            var3 = var4;
         } else {
            var3 = false;
         }
      }

      return var3;
   }

   private void m(c var1, int var2) {
      q3.c var4 = this.g(var2, var1.a);
      this.h(var2, var1.a).b(this.a[var2], 90.0F, var1.e, var1.c, var4);
      float var3 = this.a(var2);
      this.b[var2].reset();
      this.f(var2, var1.c, this.d);
      Matrix var5 = this.b[var2];
      PointF var6 = this.d;
      var5.setTranslate(var6.x, var6.y);
      this.b[var2].preRotate(var3);
   }

   private void n(int var1) {
      this.h[0] = this.a[var1].i();
      this.h[1] = this.a[var1].j();
      this.b[var1].mapPoints(this.h);
      float var2 = this.a(var1);
      this.c[var1].reset();
      Matrix var3 = this.c[var1];
      float[] var4 = this.h;
      var3.setTranslate(var4[0], var4[1]);
      this.c[var1].preRotate(var2);
   }

   public void d(k var1, float var2, RectF var3, Path var4) {
      this.e(var1, var2, var3, (b)null, var4);
   }

   public void e(k var1, float var2, RectF var3, b var4, Path var5) {
      var5.rewind();
      this.e.rewind();
      this.f.rewind();
      this.f.addRect(var3, Direction.CW);
      c var9 = new c(var1, var2, var3, var4, var5);
      byte var8 = 0;
      int var6 = 0;

      while(true) {
         int var7 = var8;
         if (var6 >= 4) {
            while(var7 < 4) {
               this.b(var9, var7);
               this.c(var9, var7);
               ++var7;
            }

            var5.close();
            this.e.close();
            if (!this.e.isEmpty()) {
               var5.op(this.e, Op.UNION);
            }

            return;
         }

         this.m(var9, var6);
         this.n(var6);
         ++var6;
      }
   }

   private static class a {
      static final l a = new l();
   }

   public interface b {
      void a(m var1, Matrix var2, int var3);

      void b(m var1, Matrix var2, int var3);
   }

   static final class c {
      public final k a;
      public final Path b;
      public final RectF c;
      public final b d;
      public final float e;

      c(k var1, float var2, RectF var3, b var4, Path var5) {
         this.d = var4;
         this.a = var1;
         this.e = var2;
         this.c = var3;
         this.b = var5;
      }
   }
}
