package u0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class q {
   private static final boolean a = true;
   private static final boolean b = true;
   private static final boolean c = true;

   static View a(ViewGroup var0, View var1, View var2) {
      Matrix var7 = new Matrix();
      var7.setTranslate((float)(-var2.getScrollX()), (float)(-var2.getScrollY()));
      z.i(var1, var7);
      z.j(var0, var7);
      RectF var8 = new RectF(0.0F, 0.0F, (float)var1.getWidth(), (float)var1.getHeight());
      var7.mapRect(var8);
      int var5 = Math.round(var8.left);
      int var3 = Math.round(var8.top);
      int var4 = Math.round(var8.right);
      int var6 = Math.round(var8.bottom);
      ImageView var10 = new ImageView(var1.getContext());
      var10.setScaleType(ScaleType.CENTER_CROP);
      Bitmap var9 = b(var1, var7, var8, var0);
      if (var9 != null) {
         var10.setImageBitmap(var9);
      }

      var10.measure(MeasureSpec.makeMeasureSpec(var4 - var5, 1073741824), MeasureSpec.makeMeasureSpec(var6 - var3, 1073741824));
      var10.layout(var5, var3, var4, var6);
      return var10;
   }

   private static Bitmap b(View var0, Matrix var1, RectF var2, ViewGroup var3) {
      boolean var5;
      boolean var9;
      if (a) {
         var5 = var0.isAttachedToWindow() ^ true;
         if (var3 == null) {
            var9 = false;
         } else {
            var9 = var3.isAttachedToWindow();
         }
      } else {
         var5 = false;
         var9 = false;
      }

      boolean var10 = b;
      Object var13 = null;
      int var6;
      ViewGroup var12;
      if (var10 && var5) {
         if (!var9) {
            return null;
         }

         var12 = (ViewGroup)var0.getParent();
         var6 = var12.indexOfChild(var0);
         var3.getOverlay().add(var0);
      } else {
         var6 = 0;
         var12 = null;
      }

      int var8 = Math.round(var2.width());
      int var7 = Math.round(var2.height());
      Bitmap var11 = (Bitmap)var13;
      if (var8 > 0) {
         var11 = (Bitmap)var13;
         if (var7 > 0) {
            float var4 = Math.min(1.0F, 1048576.0F / (float)(var8 * var7));
            var8 = Math.round((float)var8 * var4);
            var7 = Math.round((float)var7 * var4);
            var1.postTranslate(-var2.left, -var2.top);
            var1.postScale(var4, var4);
            Canvas var14;
            if (c) {
               Picture var15 = new Picture();
               var14 = var15.beginRecording(var8, var7);
               var14.concat(var1);
               var0.draw(var14);
               var15.endRecording();
               var11 = Bitmap.createBitmap(var15);
            } else {
               var11 = Bitmap.createBitmap(var8, var7, Config.ARGB_8888);
               var14 = new Canvas(var11);
               var14.concat(var1);
               var0.draw(var14);
            }
         }
      }

      if (var10 && var5) {
         var3.getOverlay().remove(var0);
         var12.addView(var0, var6);
      }

      return var11;
   }

   static Animator c(Animator var0, Animator var1) {
      if (var0 == null) {
         return var1;
      } else if (var1 == null) {
         return var0;
      } else {
         AnimatorSet var2 = new AnimatorSet();
         var2.playTogether(new Animator[]{var0, var1});
         return var2;
      }
   }
}
