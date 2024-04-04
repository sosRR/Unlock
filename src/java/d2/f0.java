package d2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class f0 implements Runnable {
   final LifecycleCallback m;
   final String n;
   final g0 o;

   f0(g0 var1, LifecycleCallback var2, String var3) {
      this.o = var1;
      this.m = var2;
      this.n = var3;
   }

   public final void run() {
      g0 var1 = this.o;
      if (g0.P1(var1) > 0) {
         LifecycleCallback var2 = this.m;
         Bundle var3;
         if (g0.Q1(var1) != null) {
            var3 = g0.Q1(var1).getBundle(this.n);
         } else {
            var3 = null;
         }

         var2.f(var3);
      }

      if (g0.P1(this.o) >= 2) {
         this.m.j();
      }

      if (g0.P1(this.o) >= 3) {
         this.m.h();
      }

      if (g0.P1(this.o) >= 4) {
         this.m.k();
      }

      if (g0.P1(this.o) >= 5) {
         this.m.g();
      }

   }
}
