package k1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class n {
   public static a a() {
      return new c.b();
   }

   public abstract i1.b b();

   abstract i1.c c();

   public byte[] d() {
      return (byte[])this.e().apply(this.c().b());
   }

   abstract i1.e e();

   public abstract o f();

   public abstract String g();

   @Builder
   public abstract static class a {
      public abstract n a();

      abstract a b(i1.b var1);

      abstract a c(i1.c var1);

      abstract a d(i1.e var1);

      public abstract a e(o var1);

      public abstract a f(String var1);
   }
}
