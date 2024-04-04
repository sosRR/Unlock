package x4;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class d {
   public static a a() {
      return new x4.a.b();
   }

   public abstract f b();

   public abstract String c();

   public abstract String d();

   public abstract b e();

   public abstract String f();

   @Builder
   public abstract static class a {
      public abstract d a();

      public abstract a b(f var1);

      public abstract a c(String var1);

      public abstract a d(String var1);

      public abstract a e(b var1);

      public abstract a f(String var1);
   }

   public static enum b {
      m,
      n;

      private static final b[] o;

      static {
         b var0 = new b("OK", 0);
         m = var0;
         b var1 = new b("BAD_CONFIG", 1);
         n = var1;
         o = new b[]{var0, var1};
      }
   }
}
