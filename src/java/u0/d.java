package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

public class d extends m0 {
   public d() {
   }

   public d(int var1) {
      this.m0(var1);
   }

   private Animator n0(View var1, float var2, float var3) {
      if (var2 == var3) {
         return null;
      } else {
         u0.z.g(var1, var2);
         ObjectAnimator var4 = ObjectAnimator.ofFloat(var1, u0.z.b, new float[]{var3});
         var4.addListener(new u0.d.b(var1));
         this.a(new m(this, var1) {
            final View a;
            final u0.d b;

            {
               this.b = var1;
               this.a = var2;
            }

            public void c(l var1) {
               u0.z.g(this.a, 1.0F);
               u0.z.a(this.a);
               var1.T(this);
            }
         });
         return var4;
      }
   }

   private static float o0(r var0, float var1) {
      float var2 = var1;
      if (var0 != null) {
         Float var3 = (Float)var0.a.get("android:fade:transitionAlpha");
         var2 = var1;
         if (var3 != null) {
            var2 = var3;
         }
      }

      return var2;
   }

   public Animator i0(ViewGroup var1, View var2, r var3, r var4) {
      float var5 = 0.0F;
      float var6 = o0(var3, 0.0F);
      if (var6 != 1.0F) {
         var5 = var6;
      }

      return this.n0(var2, var5, 1.0F);
   }

   public Animator k0(ViewGroup var1, View var2, r var3, r var4) {
      u0.z.e(var2);
      return this.n0(var2, o0(var3, 1.0F), 0.0F);
   }

   public void n(r var1) {
      super.n(var1);
      var1.a.put("android:fade:transitionAlpha", u0.z.c(var1.b));
   }

   private static class b extends AnimatorListenerAdapter {
      private final View a;
      private boolean b = false;

      b(View var1) {
         this.a = var1;
      }

      public void onAnimationEnd(Animator var1) {
         u0.z.g(this.a, 1.0F);
         if (this.b) {
            this.a.setLayerType(0, (Paint)null);
         }

      }

      public void onAnimationStart(Animator var1) {
         if (androidx.core.view.d0.O(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, (Paint)null);
         }

      }
   }
}
