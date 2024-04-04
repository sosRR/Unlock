package c3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.d;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;
import n3.c;
import z2.b;
import z2.j;
import z2.k;

public class a extends g {
   private static final int t;
   private static final int[][] u;
   private ColorStateList q;
   private boolean r;
   private boolean s;

   static {
      t = j.m;
      u = new int[][]{{16842910, 16842912}, {16842910, -16842912}, {-16842910, 16842912}, {-16842910, -16842912}};
   }

   public a(Context var1, AttributeSet var2) {
      this(var1, var2, b.d);
   }

   public a(Context var1, AttributeSet var2, int var3) {
      int var4 = t;
      super(s3.a.c(var1, var2, var3, var4), var2, var3);
      var1 = this.getContext();
      TypedArray var5 = m.h(var1, var2, k.c3, var3, var4, new int[0]);
      var3 = k.d3;
      if (var5.hasValue(var3)) {
         d.c(this, c.a(var1, var5, var3));
      }

      this.r = var5.getBoolean(k.f3, false);
      this.s = var5.getBoolean(k.e3, true);
      var5.recycle();
   }

   private ColorStateList getMaterialThemeColorsTintList() {
      if (this.q == null) {
         int[][] var4 = u;
         int[] var5 = new int[var4.length];
         int var2 = f3.a.d(this, b.g);
         int var3 = f3.a.d(this, b.l);
         int var1 = f3.a.d(this, b.i);
         var5[0] = f3.a.h(var3, var2, 1.0F);
         var5[1] = f3.a.h(var3, var1, 0.54F);
         var5[2] = f3.a.h(var3, var1, 0.38F);
         var5[3] = f3.a.h(var3, var1, 0.38F);
         this.q = new ColorStateList(var4, var5);
      }

      return this.q;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.r && d.b(this) == null) {
         this.setUseMaterialThemeColors(true);
      }

   }

   protected void onDraw(Canvas var1) {
      if (this.s && TextUtils.isEmpty(this.getText())) {
         Drawable var4 = d.a(this);
         if (var4 != null) {
            int var2;
            if (o.e(this)) {
               var2 = -1;
            } else {
               var2 = 1;
            }

            var2 = (this.getWidth() - var4.getIntrinsicWidth()) / 2 * var2;
            int var3 = var1.save();
            var1.translate((float)var2, 0.0F);
            super.onDraw(var1);
            var1.restoreToCount(var3);
            if (this.getBackground() != null) {
               Rect var5 = var4.getBounds();
               androidx.core.graphics.drawable.a.f(this.getBackground(), var5.left + var2, var5.top, var5.right + var2, var5.bottom);
            }

            return;
         }
      }

      super.onDraw(var1);
   }

   public void setCenterIfNoTextEnabled(boolean var1) {
      this.s = var1;
   }

   public void setUseMaterialThemeColors(boolean var1) {
      this.r = var1;
      if (var1) {
         d.c(this, this.getMaterialThemeColorsTintList());
      } else {
         d.c(this, (ColorStateList)null);
      }

   }
}
