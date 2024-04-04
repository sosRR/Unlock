package m3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import androidx.core.widget.d;
import com.google.android.material.internal.m;
import n3.c;
import z2.b;
import z2.j;
import z2.k;

public class a extends v {
   private static final int s;
   private static final int[][] t;
   private ColorStateList q;
   private boolean r;

   static {
      s = j.n;
      int[] var0 = new int[]{16842910, 16842912};
      int[] var1 = new int[]{-16842910, 16842912};
      int[] var2 = new int[]{-16842910, -16842912};
      t = new int[][]{var0, {16842910, -16842912}, var1, var2};
   }

   public a(Context var1, AttributeSet var2) {
      this(var1, var2, b.z);
   }

   public a(Context var1, AttributeSet var2, int var3) {
      int var4 = s;
      super(s3.a.c(var1, var2, var3, var4), var2, var3);
      var1 = this.getContext();
      TypedArray var5 = m.h(var1, var2, k.h3, var3, var4, new int[0]);
      var3 = k.i3;
      if (var5.hasValue(var3)) {
         d.c(this, c.a(var1, var5, var3));
      }

      this.r = var5.getBoolean(k.j3, false);
      var5.recycle();
   }

   private ColorStateList getMaterialThemeColorsTintList() {
      if (this.q == null) {
         int var2 = f3.a.d(this, b.g);
         int var1 = f3.a.d(this, b.i);
         int var3 = f3.a.d(this, b.l);
         int[][] var4 = t;
         int[] var5 = new int[var4.length];
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

   public void setUseMaterialThemeColors(boolean var1) {
      this.r = var1;
      if (var1) {
         d.c(this, this.getMaterialThemeColorsTintList());
      } else {
         d.c(this, (ColorStateList)null);
      }

   }
}
