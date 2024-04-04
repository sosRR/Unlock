package o3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import q3.g;
import q3.k;
import q3.n;

public class a extends Drawable implements n {
   private b m;

   private a(b var1) {
      this.m = var1;
   }

   // $FF: synthetic method
   a(b var1, a$a var2) {
      this(var1);
   }

   public a(k var1) {
      this(new b(new g(var1)));
   }

   public a a() {
      this.m = new b(this.m);
      return this;
   }

   public void draw(Canvas var1) {
      b var2 = this.m;
      if (var2.b) {
         var2.a.draw(var1);
      }

   }

   public Drawable.ConstantState getConstantState() {
      return this.m;
   }

   public int getOpacity() {
      return this.m.a.getOpacity();
   }

   public boolean isStateful() {
      return true;
   }

   protected void onBoundsChange(Rect var1) {
      super.onBoundsChange(var1);
      this.m.a.setBounds(var1);
   }

   protected boolean onStateChange(int[] var1) {
      boolean var2 = super.onStateChange(var1);
      boolean var4 = this.m.a.setState(var1);
      boolean var3 = true;
      if (var4) {
         var2 = true;
      }

      var4 = b.b(var1);
      b var5 = this.m;
      if (var5.b != var4) {
         var5.b = var4;
         var2 = var3;
      }

      return var2;
   }

   public void setAlpha(int var1) {
      this.m.a.setAlpha(var1);
   }

   public void setColorFilter(ColorFilter var1) {
      this.m.a.setColorFilter(var1);
   }

   public void setShapeAppearanceModel(k var1) {
      this.m.a.setShapeAppearanceModel(var1);
   }

   public void setTint(int var1) {
      this.m.a.setTint(var1);
   }

   public void setTintList(ColorStateList var1) {
      this.m.a.setTintList(var1);
   }

   public void setTintMode(PorterDuff.Mode var1) {
      this.m.a.setTintMode(var1);
   }

   static final class b extends Drawable.ConstantState {
      g a;
      boolean b;

      public b(b var1) {
         this.a = (g)var1.a.getConstantState().newDrawable();
         this.b = var1.b;
      }

      public b(g var1) {
         this.a = var1;
         this.b = false;
      }

      public a a() {
         return new a(new b(this), (a$a)null);
      }

      public int getChangingConfigurations() {
         return 0;
      }
   }
}
