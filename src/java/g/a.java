package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements Drawable.Callback {
   private Drawable m;

   public a(Drawable var1) {
      this.a(var1);
   }

   public void a(Drawable var1) {
      Drawable var2 = this.m;
      if (var2 != null) {
         var2.setCallback((Drawable.Callback)null);
      }

      this.m = var1;
      if (var1 != null) {
         var1.setCallback(this);
      }

   }

   public void draw(Canvas var1) {
      this.m.draw(var1);
   }

   public int getChangingConfigurations() {
      return this.m.getChangingConfigurations();
   }

   public Drawable getCurrent() {
      return this.m.getCurrent();
   }

   public int getIntrinsicHeight() {
      return this.m.getIntrinsicHeight();
   }

   public int getIntrinsicWidth() {
      return this.m.getIntrinsicWidth();
   }

   public int getMinimumHeight() {
      return this.m.getMinimumHeight();
   }

   public int getMinimumWidth() {
      return this.m.getMinimumWidth();
   }

   public int getOpacity() {
      return this.m.getOpacity();
   }

   public boolean getPadding(Rect var1) {
      return this.m.getPadding(var1);
   }

   public int[] getState() {
      return this.m.getState();
   }

   public Region getTransparentRegion() {
      return this.m.getTransparentRegion();
   }

   public void invalidateDrawable(Drawable var1) {
      this.invalidateSelf();
   }

   public boolean isAutoMirrored() {
      return androidx.core.graphics.drawable.a.c(this.m);
   }

   public boolean isStateful() {
      return this.m.isStateful();
   }

   public void jumpToCurrentState() {
      this.m.jumpToCurrentState();
   }

   protected void onBoundsChange(Rect var1) {
      this.m.setBounds(var1);
   }

   protected boolean onLevelChange(int var1) {
      return this.m.setLevel(var1);
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      this.scheduleSelf(var2, var3);
   }

   public void setAlpha(int var1) {
      this.m.setAlpha(var1);
   }

   public void setAutoMirrored(boolean var1) {
      androidx.core.graphics.drawable.a.d(this.m, var1);
   }

   public void setChangingConfigurations(int var1) {
      this.m.setChangingConfigurations(var1);
   }

   public void setColorFilter(ColorFilter var1) {
      this.m.setColorFilter(var1);
   }

   public void setDither(boolean var1) {
      this.m.setDither(var1);
   }

   public void setFilterBitmap(boolean var1) {
      this.m.setFilterBitmap(var1);
   }

   public void setHotspot(float var1, float var2) {
      androidx.core.graphics.drawable.a.e(this.m, var1, var2);
   }

   public void setHotspotBounds(int var1, int var2, int var3, int var4) {
      androidx.core.graphics.drawable.a.f(this.m, var1, var2, var3, var4);
   }

   public boolean setState(int[] var1) {
      return this.m.setState(var1);
   }

   public void setTint(int var1) {
      androidx.core.graphics.drawable.a.h(this.m, var1);
   }

   public void setTintList(ColorStateList var1) {
      androidx.core.graphics.drawable.a.i(this.m, var1);
   }

   public void setTintMode(PorterDuff.Mode var1) {
      androidx.core.graphics.drawable.a.j(this.m, var1);
   }

   public boolean setVisible(boolean var1, boolean var2) {
      if (!super.setVisible(var1, var2) && !this.m.setVisible(var1, var2)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      this.unscheduleSelf(var2);
   }
}
