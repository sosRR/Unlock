package j1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class l {
   private static a a() {
      return new f.b();
   }

   public static a i(String var0) {
      return a().g(var0);
   }

   public static a j(byte[] var0) {
      return a().f(var0);
   }

   public abstract Integer b();

   public abstract long c();

   public abstract long d();

   public abstract o e();

   public abstract byte[] f();

   public abstract String g();

   public abstract long h();

   @Builder
   public abstract static class a {
      public abstract l a();

      public abstract a b(Integer var1);

      public abstract a c(long var1);

      public abstract a d(long var1);

      public abstract a e(o var1);

      abstract a f(byte[] var1);

      abstract a g(String var1);

      public abstract a h(long var1);
   }
}
