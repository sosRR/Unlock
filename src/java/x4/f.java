package x4;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class f {
   public static a a() {
      return (new x4.b.b()).d(0L);
   }

   public abstract b b();

   public abstract String c();

   public abstract long d();

   @Builder
   public abstract static class a {
      public abstract f a();

      public abstract a b(b var1);

      public abstract a c(String var1);

      public abstract a d(long var1);
   }

   public static enum b {
      m,
      n,
      o;

      private static final b[] p;

      static {
         b var1 = new b("OK", 0);
         m = var1;
         b var0 = new b("BAD_CONFIG", 1);
         n = var0;
         b var2 = new b("AUTH_ERROR", 2);
         o = var2;
         p = new b[]{var1, var0, var2};
      }
   }
}
