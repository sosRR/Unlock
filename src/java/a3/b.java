package a3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class b {
   public static void a(AnimatorSet var0, List var1) {
      int var3 = var1.size();
      long var4 = 0L;

      for(int var2 = 0; var2 < var3; ++var2) {
         Animator var6 = (Animator)var1.get(var2);
         var4 = Math.max(var4, var6.getStartDelay() + var6.getDuration());
      }

      ValueAnimator var7 = ValueAnimator.ofInt(new int[]{0, 0});
      var7.setDuration(var4);
      var1.add(0, var7);
      var0.playTogether(var1);
   }
}
