package a3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {
   private long a;
   private long b;
   private TimeInterpolator c;
   private int d;
   private int e;

   public i(long var1, long var3) {
      this.c = null;
      this.d = 0;
      this.e = 1;
      this.a = var1;
      this.b = var3;
   }

   public i(long var1, long var3, TimeInterpolator var5) {
      this.d = 0;
      this.e = 1;
      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   static i b(ValueAnimator var0) {
      i var1 = new i(var0.getStartDelay(), var0.getDuration(), f(var0));
      var1.d = var0.getRepeatCount();
      var1.e = var0.getRepeatMode();
      return var1;
   }

   private static TimeInterpolator f(ValueAnimator var0) {
      TimeInterpolator var1 = var0.getInterpolator();
      if (!(var1 instanceof AccelerateDecelerateInterpolator) && var1 != null) {
         if (var1 instanceof AccelerateInterpolator) {
            return a3.a.c;
         } else {
            TimeInterpolator var2 = var1;
            if (var1 instanceof DecelerateInterpolator) {
               var2 = a3.a.d;
            }

            return var2;
         }
      } else {
         return a3.a.b;
      }
   }

   public void a(Animator var1) {
      var1.setStartDelay(this.c());
      var1.setDuration(this.d());
      var1.setInterpolator(this.e());
      if (var1 instanceof ValueAnimator) {
         ValueAnimator var2 = (ValueAnimator)var1;
         var2.setRepeatCount(this.g());
         var2.setRepeatMode(this.h());
      }

   }

   public long c() {
      return this.a;
   }

   public long d() {
      return this.b;
   }

   public TimeInterpolator e() {
      TimeInterpolator var1 = this.c;
      if (var1 == null) {
         var1 = a3.a.b;
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof i)) {
         return false;
      } else {
         i var2 = (i)var1;
         if (this.c() != var2.c()) {
            return false;
         } else if (this.d() != var2.d()) {
            return false;
         } else if (this.g() != var2.g()) {
            return false;
         } else {
            return this.h() != var2.h() ? false : this.e().getClass().equals(var2.e().getClass());
         }
      }
   }

   public int g() {
      return this.d;
   }

   public int h() {
      return this.e;
   }

   public int hashCode() {
      return ((((int)(this.c() ^ this.c() >>> 32) * 31 + (int)(this.d() ^ this.d() >>> 32)) * 31 + this.e().getClass().hashCode()) * 31 + this.g()) * 31 + this.h();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('\n');
      var1.append(this.getClass().getName());
      var1.append('{');
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" delay: ");
      var1.append(this.c());
      var1.append(" duration: ");
      var1.append(this.d());
      var1.append(" interpolator: ");
      var1.append(this.e().getClass());
      var1.append(" repeatCount: ");
      var1.append(this.g());
      var1.append(" repeatMode: ");
      var1.append(this.h());
      var1.append("}\n");
      return var1.toString();
   }
}
