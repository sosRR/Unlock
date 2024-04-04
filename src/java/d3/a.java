package d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class a {
   public static Animator a(d var0, float var1, float var2, float var3) {
      ObjectAnimator var5 = ObjectAnimator.ofObject(var0, d.c.a, d.b.b, new d.e[]{new d.e(var1, var2, var3)});
      d.e var6 = var0.getRevealInfo();
      if (var6 != null) {
         float var4 = var6.c;
         Animator var8 = ViewAnimationUtils.createCircularReveal((View)var0, (int)var1, (int)var2, var4, var3);
         AnimatorSet var7 = new AnimatorSet();
         var7.playTogether(new Animator[]{var5, var8});
         return var7;
      } else {
         throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
      }
   }

   public static Animator.AnimatorListener b(d var0) {
      return new AnimatorListenerAdapter(var0) {
         final d a;

         {
            this.a = var1;
         }

         public void onAnimationEnd(Animator var1) {
            this.a.a();
         }

         public void onAnimationStart(Animator var1) {
            this.a.b();
         }
      };
   }
}
