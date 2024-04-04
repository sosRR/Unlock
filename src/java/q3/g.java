package q3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

public class g extends Drawable implements n {
   private static final String J = "g";
   private static final Paint K;
   private final Paint A;
   private final p3.a B;
   private final l.b C;
   private final l D;
   private PorterDuffColorFilter E;
   private PorterDuffColorFilter F;
   private int G;
   private final RectF H;
   private boolean I;
   private c m;
   private final m.g[] n;
   private final m.g[] o;
   private final BitSet p;
   private boolean q;
   private final Matrix r;
   private final Path s;
   private final Path t;
   private final RectF u;
   private final RectF v;
   private final Region w;
   private final Region x;
   private k y;
   private final Paint z;

   static {
      Paint var0 = new Paint(1);
      K = var0;
      var0.setColor(-1);
      var0.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
   }

   public g() {
      this(new k());
   }

   public g(Context var1, AttributeSet var2, int var3, int var4) {
      this(k.e(var1, var2, var3, var4).m());
   }

   private g(c var1) {
      this.n = new m.g[4];
      this.o = new m.g[4];
      this.p = new BitSet(8);
      this.r = new Matrix();
      this.s = new Path();
      this.t = new Path();
      this.u = new RectF();
      this.v = new RectF();
      this.w = new Region();
      this.x = new Region();
      Paint var4 = new Paint(1);
      this.z = var4;
      Paint var3 = new Paint(1);
      this.A = var3;
      this.B = new p3.a();
      l var2;
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
         var2 = l.k();
      } else {
         var2 = new l();
      }

      this.D = var2;
      this.H = new RectF();
      this.I = true;
      this.m = var1;
      var3.setStyle(Style.STROKE);
      var4.setStyle(Style.FILL);
      this.g0();
      this.f0(this.getState());
      this.C = new l.b(this) {
         final g a;

         {
            this.a = var1;
         }

         public void a(m var1, Matrix var2, int var3) {
            this.a.p.set(var3, var1.e());
            this.a.n[var3] = var1.f(var2);
         }

         public void b(m var1, Matrix var2, int var3) {
            this.a.p.set(var3 + 4, var1.e());
            this.a.o[var3] = var1.f(var2);
         }
      };
   }

   // $FF: synthetic method
   g(c var1, Object var2) {
      this(var1);
   }

   public g(k var1) {
      this(new c(var1, (i3.a)null));
   }

   private float E() {
      return this.M() ? this.A.getStrokeWidth() / 2.0F : 0.0F;
   }

   private boolean K() {
      c var4 = this.m;
      int var1 = var4.q;
      boolean var3 = true;
      boolean var2;
      if (var1 != 1 && var4.r > 0) {
         var2 = var3;
         if (var1 == 2) {
            return var2;
         }

         if (this.U()) {
            var2 = var3;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   private boolean L() {
      Paint.Style var2 = this.m.v;
      boolean var1;
      if (var2 != Style.FILL_AND_STROKE && var2 != Style.FILL) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private boolean M() {
      Paint.Style var2 = this.m.v;
      boolean var1;
      if ((var2 == Style.FILL_AND_STROKE || var2 == Style.STROKE) && this.A.getStrokeWidth() > 0.0F) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void O() {
      super.invalidateSelf();
   }

   private void R(Canvas var1) {
      if (this.K()) {
         var1.save();
         this.T(var1);
         if (!this.I) {
            this.n(var1);
            var1.restore();
         } else {
            int var4 = (int)(this.H.width() - (float)this.getBounds().width());
            int var5 = (int)(this.H.height() - (float)this.getBounds().height());
            if (var4 >= 0 && var5 >= 0) {
               Bitmap var7 = Bitmap.createBitmap((int)this.H.width() + this.m.r * 2 + var4, (int)this.H.height() + this.m.r * 2 + var5, Config.ARGB_8888);
               Canvas var6 = new Canvas(var7);
               float var2 = (float)(this.getBounds().left - this.m.r - var4);
               float var3 = (float)(this.getBounds().top - this.m.r - var5);
               var6.translate(-var2, -var3);
               this.n(var6);
               var1.drawBitmap(var7, var2, var3, (Paint)null);
               var7.recycle();
               var1.restore();
            } else {
               throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
         }
      }
   }

   private static int S(int var0, int var1) {
      return var0 * (var1 + (var1 >>> 7)) >>> 8;
   }

   private void T(Canvas var1) {
      int var2 = this.A();
      int var3 = this.B();
      var1.translate((float)var2, (float)var3);
   }

   private PorterDuffColorFilter f(Paint var1, boolean var2) {
      if (var2) {
         int var4 = var1.getColor();
         int var3 = this.l(var4);
         this.G = var3;
         if (var3 != var4) {
            return new PorterDuffColorFilter(var3, Mode.SRC_IN);
         }
      }

      return null;
   }

   private boolean f0(int[] var1) {
      int var2;
      int var3;
      boolean var4;
      boolean var5;
      label18: {
         ColorStateList var6 = this.m.d;
         var5 = true;
         if (var6 != null) {
            var2 = this.z.getColor();
            var3 = this.m.d.getColorForState(var1, var2);
            if (var2 != var3) {
               this.z.setColor(var3);
               var4 = true;
               break label18;
            }
         }

         var4 = false;
      }

      if (this.m.e != null) {
         var2 = this.A.getColor();
         var3 = this.m.e.getColorForState(var1, var2);
         if (var2 != var3) {
            this.A.setColor(var3);
            var4 = var5;
         }
      }

      return var4;
   }

   private void g(RectF var1, Path var2) {
      this.h(var1, var2);
      if (this.m.j != 1.0F) {
         this.r.reset();
         Matrix var4 = this.r;
         float var3 = this.m.j;
         var4.setScale(var3, var3, var1.width() / 2.0F, var1.height() / 2.0F);
         var2.transform(this.r);
      }

      var2.computeBounds(this.H, true);
   }

   private boolean g0() {
      PorterDuffColorFilter var4 = this.E;
      PorterDuffColorFilter var3 = this.F;
      c var6 = this.m;
      ColorStateList var5 = var6.g;
      PorterDuff.Mode var9 = var6.h;
      Paint var7 = this.z;
      boolean var2 = true;
      this.E = this.k(var5, var9, var7, true);
      c var8 = this.m;
      this.F = this.k(var8.f, var8.h, this.A, false);
      var8 = this.m;
      if (var8.u) {
         this.B.d(var8.g.getColorForState(this.getState(), 0));
      }

      boolean var1 = var2;
      if (androidx.core.util.c.a(var4, this.E)) {
         if (!androidx.core.util.c.a(var3, this.F)) {
            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   private void h0() {
      float var1 = this.J();
      this.m.r = (int)Math.ceil((double)(0.75F * var1));
      this.m.s = (int)Math.ceil((double)(var1 * 0.25F));
      this.g0();
      this.O();
   }

   private void i() {
      float var1 = -this.E();
      k var2 = this.D().y(new k.c(this, var1) {
         final float a;
         final g b;

         {
            this.b = var1;
            this.a = var2;
         }

         public c a(c var1) {
            if (!(var1 instanceof i)) {
               var1 = new b(this.a, (c)var1);
            }

            return (c)var1;
         }
      });
      this.y = var2;
      this.D.d(var2, this.m.k, this.v(), this.t);
   }

   private PorterDuffColorFilter j(ColorStateList var1, PorterDuff.Mode var2, boolean var3) {
      int var5 = var1.getColorForState(this.getState(), 0);
      int var4 = var5;
      if (var3) {
         var4 = this.l(var5);
      }

      this.G = var4;
      return new PorterDuffColorFilter(var4, var2);
   }

   private PorterDuffColorFilter k(ColorStateList var1, PorterDuff.Mode var2, Paint var3, boolean var4) {
      PorterDuffColorFilter var5;
      if (var1 != null && var2 != null) {
         var5 = this.j(var1, var2, var4);
      } else {
         var5 = this.f(var3, var4);
      }

      return var5;
   }

   public static g m(Context var0, float var1) {
      int var2 = f3.a.c(var0, z2.b.l, g.class.getSimpleName());
      g var3 = new g();
      var3.N(var0);
      var3.X(ColorStateList.valueOf(var2));
      var3.W(var1);
      return var3;
   }

   private void n(Canvas var1) {
      if (this.p.cardinality() > 0) {
         Log.w(J, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
      }

      if (this.m.s != 0) {
         var1.drawPath(this.s, this.B.c());
      }

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         this.n[var2].b(this.B, this.m.r, var1);
         this.o[var2].b(this.B, this.m.r, var1);
      }

      if (this.I) {
         int var3 = this.A();
         var2 = this.B();
         var1.translate((float)(-var3), (float)(-var2));
         var1.drawPath(this.s, K);
         var1.translate((float)var3, (float)var2);
      }

   }

   private void o(Canvas var1) {
      this.q(var1, this.z, this.s, this.m.a, this.u());
   }

   private void q(Canvas var1, Paint var2, Path var3, k var4, RectF var5) {
      if (var4.u(var5)) {
         float var6 = var4.t().a(var5) * this.m.k;
         var1.drawRoundRect(var5, var6, var6, var2);
      } else {
         var1.drawPath(var3, var2);
      }

   }

   private RectF v() {
      this.v.set(this.u());
      float var1 = this.E();
      this.v.inset(var1, var1);
      return this.v;
   }

   public int A() {
      c var1 = this.m;
      return (int)((double)var1.s * Math.sin(Math.toRadians((double)var1.t)));
   }

   public int B() {
      c var1 = this.m;
      return (int)((double)var1.s * Math.cos(Math.toRadians((double)var1.t)));
   }

   public int C() {
      return this.m.r;
   }

   public k D() {
      return this.m.a;
   }

   public ColorStateList F() {
      return this.m.g;
   }

   public float G() {
      return this.m.a.r().a(this.u());
   }

   public float H() {
      return this.m.a.t().a(this.u());
   }

   public float I() {
      return this.m.p;
   }

   public float J() {
      return this.w() + this.I();
   }

   public void N(Context var1) {
      this.m.b = new i3.a(var1);
      this.h0();
   }

   public boolean P() {
      i3.a var2 = this.m.b;
      boolean var1;
      if (var2 != null && var2.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean Q() {
      return this.m.a.u(this.u());
   }

   public boolean U() {
      int var1 = VERSION.SDK_INT;
      boolean var2;
      if (!this.Q() && !this.s.isConvex() && var1 < 29) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void V(c var1) {
      this.setShapeAppearanceModel(this.m.a.x(var1));
   }

   public void W(float var1) {
      c var2 = this.m;
      if (var2.o != var1) {
         var2.o = var1;
         this.h0();
      }

   }

   public void X(ColorStateList var1) {
      c var2 = this.m;
      if (var2.d != var1) {
         var2.d = var1;
         this.onStateChange(this.getState());
      }

   }

   public void Y(float var1) {
      c var2 = this.m;
      if (var2.k != var1) {
         var2.k = var1;
         this.q = true;
         this.invalidateSelf();
      }

   }

   public void Z(int var1, int var2, int var3, int var4) {
      c var5 = this.m;
      if (var5.i == null) {
         var5.i = new Rect();
      }

      this.m.i.set(var1, var2, var3, var4);
      this.invalidateSelf();
   }

   public void a0(float var1) {
      c var2 = this.m;
      if (var2.n != var1) {
         var2.n = var1;
         this.h0();
      }

   }

   public void b0(float var1, int var2) {
      this.e0(var1);
      this.d0(ColorStateList.valueOf(var2));
   }

   public void c0(float var1, ColorStateList var2) {
      this.e0(var1);
      this.d0(var2);
   }

   public void d0(ColorStateList var1) {
      c var2 = this.m;
      if (var2.e != var1) {
         var2.e = var1;
         this.onStateChange(this.getState());
      }

   }

   public void draw(Canvas var1) {
      this.z.setColorFilter(this.E);
      int var3 = this.z.getAlpha();
      this.z.setAlpha(S(var3, this.m.m));
      this.A.setColorFilter(this.F);
      this.A.setStrokeWidth(this.m.l);
      int var2 = this.A.getAlpha();
      this.A.setAlpha(S(var2, this.m.m));
      if (this.q) {
         this.i();
         this.g(this.u(), this.s);
         this.q = false;
      }

      this.R(var1);
      if (this.L()) {
         this.o(var1);
      }

      if (this.M()) {
         this.r(var1);
      }

      this.z.setAlpha(var3);
      this.A.setAlpha(var2);
   }

   public void e0(float var1) {
      this.m.l = var1;
      this.invalidateSelf();
   }

   public int getAlpha() {
      return this.m.m;
   }

   public Drawable.ConstantState getConstantState() {
      return this.m;
   }

   public int getOpacity() {
      return -3;
   }

   @TargetApi(21)
   public void getOutline(Outline var1) {
      if (this.m.q != 2) {
         if (this.Q()) {
            float var3 = this.G();
            float var2 = this.m.k;
            var1.setRoundRect(this.getBounds(), var3 * var2);
         } else {
            this.g(this.u(), this.s);
            if (this.s.isConvex() || VERSION.SDK_INT >= 29) {
               try {
                  var1.setConvexPath(this.s);
               } catch (IllegalArgumentException var4) {
               }
            }

         }
      }
   }

   public boolean getPadding(Rect var1) {
      Rect var2 = this.m.i;
      if (var2 != null) {
         var1.set(var2);
         return true;
      } else {
         return super.getPadding(var1);
      }
   }

   public Region getTransparentRegion() {
      Rect var1 = this.getBounds();
      this.w.set(var1);
      this.g(this.u(), this.s);
      this.x.setPath(this.s, this.w);
      this.w.op(this.x, Op.DIFFERENCE);
      return this.w;
   }

   protected final void h(RectF var1, Path var2) {
      l var4 = this.D;
      c var3 = this.m;
      var4.e(var3.a, var3.k, var1, this.C, var2);
   }

   public void invalidateSelf() {
      this.q = true;
      super.invalidateSelf();
   }

   public boolean isStateful() {
      boolean var1;
      if (!super.isStateful()) {
         ColorStateList var2 = this.m.g;
         if (var2 == null || !var2.isStateful()) {
            var2 = this.m.f;
            if (var2 == null || !var2.isStateful()) {
               var2 = this.m.e;
               if (var2 == null || !var2.isStateful()) {
                  var2 = this.m.d;
                  if (var2 == null || !var2.isStateful()) {
                     var1 = false;
                     return var1;
                  }
               }
            }
         }
      }

      var1 = true;
      return var1;
   }

   protected int l(int var1) {
      float var3 = this.J();
      float var2 = this.y();
      i3.a var5 = this.m.b;
      int var4 = var1;
      if (var5 != null) {
         var4 = var5.c(var1, var3 + var2);
      }

      return var4;
   }

   public Drawable mutate() {
      this.m = new c(this.m);
      return this;
   }

   protected void onBoundsChange(Rect var1) {
      this.q = true;
      super.onBoundsChange(var1);
   }

   protected boolean onStateChange(int[] var1) {
      boolean var2 = this.f0(var1);
      boolean var3 = this.g0();
      if (!var2 && !var3) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (var2) {
         this.invalidateSelf();
      }

      return var2;
   }

   protected void p(Canvas var1, Paint var2, Path var3, RectF var4) {
      this.q(var1, var2, var3, this.m.a, var4);
   }

   protected void r(Canvas var1) {
      this.q(var1, this.A, this.t, this.y, this.v());
   }

   public float s() {
      return this.m.a.j().a(this.u());
   }

   public void setAlpha(int var1) {
      c var2 = this.m;
      if (var2.m != var1) {
         var2.m = var1;
         this.O();
      }

   }

   public void setColorFilter(ColorFilter var1) {
      this.m.c = var1;
      this.O();
   }

   public void setShapeAppearanceModel(k var1) {
      this.m.a = var1;
      this.invalidateSelf();
   }

   public void setTint(int var1) {
      this.setTintList(ColorStateList.valueOf(var1));
   }

   public void setTintList(ColorStateList var1) {
      this.m.g = var1;
      this.g0();
      this.O();
   }

   public void setTintMode(PorterDuff.Mode var1) {
      c var2 = this.m;
      if (var2.h != var1) {
         var2.h = var1;
         this.g0();
         this.O();
      }

   }

   public float t() {
      return this.m.a.l().a(this.u());
   }

   protected RectF u() {
      this.u.set(this.getBounds());
      return this.u;
   }

   public float w() {
      return this.m.o;
   }

   public ColorStateList x() {
      return this.m.d;
   }

   public float y() {
      return this.m.n;
   }

   public int z() {
      return this.G;
   }

   static final class c extends Drawable.ConstantState {
      public k a;
      public i3.a b;
      public ColorFilter c;
      public ColorStateList d = null;
      public ColorStateList e = null;
      public ColorStateList f = null;
      public ColorStateList g = null;
      public PorterDuff.Mode h;
      public Rect i;
      public float j;
      public float k;
      public float l;
      public int m;
      public float n;
      public float o;
      public float p;
      public int q;
      public int r;
      public int s;
      public int t;
      public boolean u;
      public Paint.Style v;

      public c(c var1) {
         this.h = Mode.SRC_IN;
         this.i = null;
         this.j = 1.0F;
         this.k = 1.0F;
         this.m = 255;
         this.n = 0.0F;
         this.o = 0.0F;
         this.p = 0.0F;
         this.q = 0;
         this.r = 0;
         this.s = 0;
         this.t = 0;
         this.u = false;
         this.v = Style.FILL_AND_STROKE;
         this.a = var1.a;
         this.b = var1.b;
         this.l = var1.l;
         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
         this.h = var1.h;
         this.g = var1.g;
         this.m = var1.m;
         this.j = var1.j;
         this.s = var1.s;
         this.q = var1.q;
         this.u = var1.u;
         this.k = var1.k;
         this.n = var1.n;
         this.o = var1.o;
         this.p = var1.p;
         this.r = var1.r;
         this.t = var1.t;
         this.f = var1.f;
         this.v = var1.v;
         if (var1.i != null) {
            this.i = new Rect(var1.i);
         }

      }

      public c(k var1, i3.a var2) {
         this.h = Mode.SRC_IN;
         this.i = null;
         this.j = 1.0F;
         this.k = 1.0F;
         this.m = 255;
         this.n = 0.0F;
         this.o = 0.0F;
         this.p = 0.0F;
         this.q = 0;
         this.r = 0;
         this.s = 0;
         this.t = 0;
         this.u = false;
         this.v = Style.FILL_AND_STROKE;
         this.a = var1;
         this.b = var2;
      }

      public int getChangingConfigurations() {
         return 0;
      }

      public Drawable newDrawable() {
         g var1 = new g(this);
         var1.q = true;
         return var1;
      }
   }
}
