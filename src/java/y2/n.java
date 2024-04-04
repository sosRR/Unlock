package y2;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

final class n implements m {
   private final Object a = new Object();
   private final int b;
   private final g0 c;
   @GuardedBy("mLock")
   private int d;
   @GuardedBy("mLock")
   private int e;
   @GuardedBy("mLock")
   private int f;
   @GuardedBy("mLock")
   private Exception g;
   @GuardedBy("mLock")
   private boolean h;

   public n(int var1, g0 var2) {
      this.b = var1;
      this.c = var2;
   }

   @GuardedBy("mLock")
   private final void c() {
      if (this.d + this.e + this.f == this.b) {
         if (this.g != null) {
            g0 var3 = this.c;
            int var2 = this.e;
            int var1 = this.b;
            StringBuilder var4 = new StringBuilder(54);
            var4.append(var2);
            var4.append(" out of ");
            var4.append(var1);
            var4.append(" underlying tasks failed");
            var3.r(new ExecutionException(var4.toString(), this.g));
            return;
         }

         if (this.h) {
            this.c.t();
            return;
         }

         this.c.s((Object)null);
      }

   }

   public final void a() {
      // $FF: Couldn't be decompiled
   }

   public final void b(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d(Exception param1) {
      // $FF: Couldn't be decompiled
   }
}
