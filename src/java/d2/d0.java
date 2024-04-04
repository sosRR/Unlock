package d2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class d0 implements Runnable {
   final LifecycleCallback m;
   final String n;
   final e0 o;

   d0(e0 var1, LifecycleCallback var2, String var3) {
      this.o = var1;
      this.m = var2;
      this.n = var3;
   }

   public final void run() {
      e0 var1 = this.o;
      if (e0.a(var1) > 0) {
         LifecycleCallback var2 = this.m;
         Bundle var3;
         if (e0.c(var1) != null) {
            var3 = e0.c(var1).getBundle(this.n);
         } else {
            var3 = null;
         }

         var2.f(var3);
      }

      if (e0.a(this.o) >= 2) {
         this.m.j();
      }

      if (e0.a(this.o) >= 3) {
         this.m.h();
      }

      if (e0.a(this.o) >= 4) {
         this.m.k();
      }

      if (e0.a(this.o) >= 5) {
         this.m.g();
      }

   }
}
