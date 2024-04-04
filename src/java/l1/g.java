package l1;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
   public static g a() {
      return new b(g.a.o, -1L);
   }

   public static g d() {
      return new b(g.a.p, -1L);
   }

   public static g e(long var0) {
      return new b(g.a.m, var0);
   }

   public static g f() {
      return new b(g.a.n, -1L);
   }

   public abstract long b();

   public abstract a c();

   public static enum a {
      m,
      n,
      o,
      p;

      private static final a[] q;

      static {
         a var1 = new a("OK", 0);
         m = var1;
         a var2 = new a("TRANSIENT_ERROR", 1);
         n = var2;
         a var3 = new a("FATAL_ERROR", 2);
         o = var3;
         a var0 = new a("INVALID_PAYLOAD", 3);
         p = var0;
         q = new a[]{var1, var2, var3, var0};
      }
   }
}
