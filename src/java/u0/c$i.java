package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

class c$i extends AnimatorListenerAdapter {
   private boolean a;
   final View b;
   final Rect c;
   final int d;
   final int e;
   final int f;
   final int g;
   final c h;

   c$i(c var1, View var2, Rect var3, int var4, int var5, int var6, int var7) {
      this.h = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   public void onAnimationCancel(Animator var1) {
      this.a = true;
   }

   public void onAnimationEnd(Animator var1) {
      if (!this.a) {
         androidx.core.view.d0.v0(this.b, this.c);
         z.f(this.b, this.d, this.e, this.f, this.g);
      }

   }
}
