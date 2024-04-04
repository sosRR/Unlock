package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

class c$a extends AnimatorListenerAdapter {
   final ViewGroup a;
   final BitmapDrawable b;
   final View c;
   final float d;
   final c e;

   c$a(c var1, ViewGroup var2, BitmapDrawable var3, View var4, float var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void onAnimationEnd(Animator var1) {
      z.b(this.a).d(this.b);
      z.g(this.c, this.d);
   }
}
