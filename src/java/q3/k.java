package q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {
   public static final q3.c m = new i(0.5F);
   d a;
   d b;
   d c;
   d d;
   q3.c e;
   q3.c f;
   q3.c g;
   q3.c h;
   f i;
   f j;
   f k;
   f l;

   public k() {
      this.a = q3.h.b();
      this.b = q3.h.b();
      this.c = q3.h.b();
      this.d = q3.h.b();
      this.e = new a(0.0F);
      this.f = new a(0.0F);
      this.g = new a(0.0F);
      this.h = new a(0.0F);
      this.i = q3.h.c();
      this.j = q3.h.c();
      this.k = q3.h.c();
      this.l = q3.h.c();
   }

   private k(b var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
   }

   // $FF: synthetic method
   k(b var1, Object var2) {
      this(var1);
   }

   public static b a() {
      return new b();
   }

   public static b b(Context var0, int var1, int var2) {
      return c(var0, var1, var2, 0);
   }

   private static b c(Context var0, int var1, int var2, int var3) {
      return d(var0, var1, var2, new a((float)var3));
   }

   private static b d(Context var0, int var1, int var2, q3.c var3) {
      Object var6 = var0;
      int var4 = var1;
      if (var2 != 0) {
         var6 = new ContextThemeWrapper(var0, var1);
         var4 = var2;
      }

      TypedArray var12 = ((Context)var6).obtainStyledAttributes(var4, z2.k.d4);

      b var13;
      try {
         int var5 = var12.getInt(z2.k.e4, 0);
         var2 = var12.getInt(z2.k.h4, var5);
         var1 = var12.getInt(z2.k.i4, var5);
         var4 = var12.getInt(z2.k.g4, var5);
         var5 = var12.getInt(z2.k.f4, var5);
         q3.c var8 = m(var12, z2.k.j4, var3);
         q3.c var7 = m(var12, z2.k.m4, var8);
         var3 = m(var12, z2.k.n4, var8);
         q3.c var14 = m(var12, z2.k.l4, var8);
         q3.c var9 = m(var12, z2.k.k4, var8);
         b var15 = new b();
         var13 = var15.y(var2, var7).C(var1, var3).u(var4, var14).q(var5, var9);
      } finally {
         var12.recycle();
      }

      return var13;
   }

   public static b e(Context var0, AttributeSet var1, int var2, int var3) {
      return f(var0, var1, var2, var3, 0);
   }

   public static b f(Context var0, AttributeSet var1, int var2, int var3, int var4) {
      return g(var0, var1, var2, var3, new a((float)var4));
   }

   public static b g(Context var0, AttributeSet var1, int var2, int var3, q3.c var4) {
      TypedArray var5 = var0.obtainStyledAttributes(var1, z2.k.k3, var2, var3);
      var2 = var5.getResourceId(z2.k.l3, 0);
      var3 = var5.getResourceId(z2.k.m3, 0);
      var5.recycle();
      return d(var0, var2, var3, var4);
   }

   private static q3.c m(TypedArray var0, int var1, q3.c var2) {
      TypedValue var3 = var0.peekValue(var1);
      if (var3 == null) {
         return var2;
      } else {
         var1 = var3.type;
         if (var1 == 5) {
            return new a((float)TypedValue.complexToDimensionPixelSize(var3.data, var0.getResources().getDisplayMetrics()));
         } else {
            return (q3.c)(var1 == 6 ? new i(var3.getFraction(1.0F, 1.0F)) : var2);
         }
      }
   }

   public f h() {
      return this.k;
   }

   public d i() {
      return this.d;
   }

   public q3.c j() {
      return this.h;
   }

   public d k() {
      return this.c;
   }

   public q3.c l() {
      return this.g;
   }

   public f n() {
      return this.l;
   }

   public f o() {
      return this.j;
   }

   public f p() {
      return this.i;
   }

   public d q() {
      return this.a;
   }

   public q3.c r() {
      return this.e;
   }

   public d s() {
      return this.b;
   }

   public q3.c t() {
      return this.f;
   }

   public boolean u(RectF var1) {
      boolean var7 = this.l.getClass().equals(f.class);
      boolean var6 = true;
      boolean var3;
      if (var7 && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class)) {
         var3 = true;
      } else {
         var3 = false;
      }

      float var2 = this.e.a(var1);
      boolean var4;
      if (this.f.a(var1) == var2 && this.h.a(var1) == var2 && this.g.a(var1) == var2) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var5;
      if (this.b instanceof j && this.a instanceof j && this.c instanceof j && this.d instanceof j) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (!var3 || !var4 || !var5) {
         var6 = false;
      }

      return var6;
   }

   public b v() {
      return new b(this);
   }

   public k w(float var1) {
      return this.v().o(var1).m();
   }

   public k x(q3.c var1) {
      return this.v().p(var1).m();
   }

   public k y(c var1) {
      return this.v().B(var1.a(this.r())).F(var1.a(this.t())).t(var1.a(this.j())).x(var1.a(this.l())).m();
   }

   public static final class b {
      private d a = q3.h.b();
      private d b = q3.h.b();
      private d c = q3.h.b();
      private d d = q3.h.b();
      private q3.c e = new a(0.0F);
      private q3.c f = new a(0.0F);
      private q3.c g = new a(0.0F);
      private q3.c h = new a(0.0F);
      private f i = q3.h.c();
      private f j = q3.h.c();
      private f k = q3.h.c();
      private f l = q3.h.c();

      public b() {
      }

      public b(k var1) {
         this.a = var1.a;
         this.b = var1.b;
         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
         this.f = var1.f;
         this.g = var1.g;
         this.h = var1.h;
         this.i = var1.i;
         this.j = var1.j;
         this.k = var1.k;
         this.l = var1.l;
      }

      private static float n(d var0) {
         if (var0 instanceof j) {
            return ((j)var0).a;
         } else {
            return var0 instanceof e ? ((e)var0).a : -1.0F;
         }
      }

      public b A(float var1) {
         this.e = new a(var1);
         return this;
      }

      public b B(q3.c var1) {
         this.e = var1;
         return this;
      }

      public b C(int var1, q3.c var2) {
         return this.D(q3.h.a(var1)).F(var2);
      }

      public b D(d var1) {
         this.b = var1;
         float var2 = n(var1);
         if (var2 != -1.0F) {
            this.E(var2);
         }

         return this;
      }

      public b E(float var1) {
         this.f = new a(var1);
         return this;
      }

      public b F(q3.c var1) {
         this.f = var1;
         return this;
      }

      public k m() {
         return new k(this);
      }

      public b o(float var1) {
         return this.A(var1).E(var1).w(var1).s(var1);
      }

      public b p(q3.c var1) {
         return this.B(var1).F(var1).x(var1).t(var1);
      }

      public b q(int var1, q3.c var2) {
         return this.r(q3.h.a(var1)).t(var2);
      }

      public b r(d var1) {
         this.d = var1;
         float var2 = n(var1);
         if (var2 != -1.0F) {
            this.s(var2);
         }

         return this;
      }

      public b s(float var1) {
         this.h = new a(var1);
         return this;
      }

      public b t(q3.c var1) {
         this.h = var1;
         return this;
      }

      public b u(int var1, q3.c var2) {
         return this.v(q3.h.a(var1)).x(var2);
      }

      public b v(d var1) {
         this.c = var1;
         float var2 = n(var1);
         if (var2 != -1.0F) {
            this.w(var2);
         }

         return this;
      }

      public b w(float var1) {
         this.g = new a(var1);
         return this;
      }

      public b x(q3.c var1) {
         this.g = var1;
         return this;
      }

      public b y(int var1, q3.c var2) {
         return this.z(q3.h.a(var1)).B(var2);
      }

      public b z(d var1) {
         this.a = var1;
         float var2 = n(var1);
         if (var2 != -1.0F) {
            this.A(var2);
         }

         return this;
      }
   }

   public interface c {
      q3.c a(q3.c var1);
   }
}
