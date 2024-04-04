package g3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {
   private final Dialog m;
   private final int n;
   private final int o;
   private final int p;

   public a(Dialog var1, Rect var2) {
      this.m = var1;
      this.n = var2.left;
      this.o = var2.top;
      this.p = ViewConfiguration.get(var1.getContext()).getScaledWindowTouchSlop();
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      View var7 = var1.findViewById(16908290);
      int var5 = this.n + var7.getLeft();
      int var6 = var7.getWidth();
      int var4 = this.o + var7.getTop();
      int var3 = var7.getHeight();
      if ((new RectF((float)var5, (float)var4, (float)(var6 + var5), (float)(var3 + var4))).contains(var2.getX(), var2.getY())) {
         return false;
      } else {
         MotionEvent var8 = MotionEvent.obtain(var2);
         if (var2.getAction() == 1) {
            var8.setAction(4);
         }

         var1.performClick();
         return this.m.onTouchEvent(var8);
      }
   }
}
