package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class e extends Drawable {
   private float a;
   private final Paint b;
   private final RectF c;
   private final Rect d;
   private float e;
   private boolean f;
   private boolean g;
   private ColorStateList h;
   private PorterDuffColorFilter i;
   private ColorStateList j;
   private PorterDuff.Mode k;

   private PorterDuffColorFilter a(ColorStateList var1, PorterDuff.Mode var2) {
      return var1 != null && var2 != null ? new PorterDuffColorFilter(var1.getColorForState(this.getState(), 0), var2) : null;
   }

   private void e(ColorStateList var1) {
      ColorStateList var2 = var1;
      if (var1 == null) {
         var2 = ColorStateList.valueOf(0);
      }

      this.h = var2;
      this.b.setColor(var2.getColorForState(this.getState(), this.h.getDefaultColor()));
   }

   private void i(Rect var1) {
      Rect var4 = var1;
      if (var1 == null) {
         var4 = this.getBounds();
      }

      this.c.set((float)var4.left, (float)var4.top, (float)var4.right, (float)var4.bottom);
      this.d.set(var4);
      if (this.f) {
         float var2 = m.f.b(this.e, this.a, this.g);
         float var3 = m.f.a(this.e, this.a, this.g);
         this.d.inset((int)Math.ceil((double)var3), (int)Math.ceil((double)var2));
         this.c.set(this.d);
      }

   }

   public ColorStateList b() {
      return this.h;
   }

   float c() {
      return this.e;
   }

   public float d() {
      return this.a;
   }

   public void draw(Canvas var1) {
      Paint var4 = this.b;
      boolean var3;
      if (this.i != null && var4.getColorFilter() == null) {
         var4.setColorFilter(this.i);
         var3 = true;
      } else {
         var3 = false;
      }

      RectF var5 = this.c;
      float var2 = this.a;
      var1.drawRoundRect(var5, var2, var2, var4);
      if (var3) {
         var4.setColorFilter((ColorFilter)null);
      }

   }

   public void f(ColorStateList var1) {
      this.e(var1);
      this.invalidateSelf();
   }

   void g(float var1, boolean var2, boolean var3) {
      if (var1 != this.e || this.f != var2 || this.g != var3) {
         this.e = var1;
         this.f = var2;
         this.g = var3;
         this.i((Rect)null);
         this.invalidateSelf();
      }
   }

   public int getOpacity() {
      return -3;
   }

   public void getOutline(Outline var1) {
      var1.setRoundRect(this.d, this.a);
   }

   void h(float var1) {
      if (var1 != this.a) {
         this.a = var1;
         this.i((Rect)null);
         this.invalidateSelf();
      }
   }

   public boolean isStateful() {
      ColorStateList var2 = this.j;
      boolean var1;
      if (var2 == null || !var2.isStateful()) {
         var2 = this.h;
         if ((var2 == null || !var2.isStateful()) && !super.isStateful()) {
            var1 = false;
            return var1;
         }
      }

      var1 = true;
      return var1;
   }

   protected void onBoundsChange(Rect var1) {
      super.onBoundsChange(var1);
      this.i(var1);
   }

   protected boolean onStateChange(int[] var1) {
      ColorStateList var4 = this.h;
      int var2 = var4.getColorForState(var1, var4.getDefaultColor());
      boolean var3;
      if (var2 != this.b.getColor()) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         this.b.setColor(var2);
      }

      var4 = this.j;
      if (var4 != null) {
         PorterDuff.Mode var5 = this.k;
         if (var5 != null) {
            this.i = this.a(var4, var5);
            return true;
         }
      }

      return var3;
   }

   public void setAlpha(int var1) {
      this.b.setAlpha(var1);
   }

   public void setColorFilter(ColorFilter var1) {
      this.b.setColorFilter(var1);
   }

   public void setTintList(ColorStateList var1) {
      this.j = var1;
      this.i = this.a(var1, this.k);
      this.invalidateSelf();
   }

   public void setTintMode(PorterDuff.Mode var1) {
      this.k = var1;
      this.i = this.a(this.j, var1);
      this.invalidateSelf();
   }
}
