package m;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class a extends FrameLayout {
   private static final int[] r = new int[]{16842801};
   private static final d s;
   private boolean m;
   private boolean n;
   int o;
   int p;
   final Rect q;

   static {
      b var0 = new b();
      s = var0;
      var0.g();
   }

   public ColorStateList getCardBackgroundColor() {
      return s.c((c)null);
   }

   public float getCardElevation() {
      return s.d((c)null);
   }

   public int getContentPaddingBottom() {
      return this.q.bottom;
   }

   public int getContentPaddingLeft() {
      return this.q.left;
   }

   public int getContentPaddingRight() {
      return this.q.right;
   }

   public int getContentPaddingTop() {
      return this.q.top;
   }

   public float getMaxCardElevation() {
      return s.a((c)null);
   }

   public boolean getPreventCornerOverlap() {
      return this.n;
   }

   public float getRadius() {
      return s.i((c)null);
   }

   public boolean getUseCompatPadding() {
      return this.m;
   }

   protected void onMeasure(int var1, int var2) {
      d var4 = s;
      if (!(var4 instanceof b)) {
         int var3 = MeasureSpec.getMode(var1);
         if (var3 == Integer.MIN_VALUE || var3 == 1073741824) {
            var1 = MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil((double)var4.j((c)null)), MeasureSpec.getSize(var1)), var3);
         }

         var3 = MeasureSpec.getMode(var2);
         if (var3 == Integer.MIN_VALUE || var3 == 1073741824) {
            var2 = MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil((double)var4.k((c)null)), MeasureSpec.getSize(var2)), var3);
         }

         super.onMeasure(var1, var2);
      } else {
         super.onMeasure(var1, var2);
      }

   }

   public void setCardBackgroundColor(int var1) {
      s.e((c)null, ColorStateList.valueOf(var1));
   }

   public void setCardBackgroundColor(ColorStateList var1) {
      s.e((c)null, var1);
   }

   public void setCardElevation(float var1) {
      s.l((c)null, var1);
   }

   public void setMaxCardElevation(float var1) {
      s.h((c)null, var1);
   }

   public void setMinimumHeight(int var1) {
      this.p = var1;
      super.setMinimumHeight(var1);
   }

   public void setMinimumWidth(int var1) {
      this.o = var1;
      super.setMinimumWidth(var1);
   }

   public void setPadding(int var1, int var2, int var3, int var4) {
   }

   public void setPaddingRelative(int var1, int var2, int var3, int var4) {
   }

   public void setPreventCornerOverlap(boolean var1) {
      if (var1 != this.n) {
         this.n = var1;
         s.f((c)null);
      }

   }

   public void setRadius(float var1) {
      s.b((c)null, var1);
   }

   public void setUseCompatPadding(boolean var1) {
      if (this.m != var1) {
         this.m = var1;
         s.m((c)null);
      }

   }
}
