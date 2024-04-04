package x0;

import java.time.Duration;

public final class p extends w {
   p(a var1) {
      super(var1.b, var1.c, var1.d);
   }

   public static final class a extends w.a {
      public a(Class var1, Duration var2) {
         super(var1);
         super.c.e(var2.toMillis());
      }

      public a(Class var1, Duration var2, Duration var3) {
         super(var1);
         super.c.f(var2.toMillis(), var3.toMillis());
      }

      p i() {
         if (super.a && super.c.j.h()) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
         } else if (!super.c.q) {
            return new p(this);
         } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
         }
      }

      a j() {
         return this;
      }
   }
}
