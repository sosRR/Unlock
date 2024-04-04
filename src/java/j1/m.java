package j1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.List;

@AutoValue
public abstract class m {
   public static a a() {
      return new g.b();
   }

   public abstract k b();

   public abstract List c();

   public abstract Integer d();

   public abstract String e();

   public abstract p f();

   public abstract long g();

   public abstract long h();

   @Builder
   public abstract static class a {
      public abstract m a();

      public abstract a b(k var1);

      public abstract a c(List var1);

      abstract a d(Integer var1);

      abstract a e(String var1);

      public abstract a f(p var1);

      public abstract a g(long var1);

      public abstract a h(long var1);

      public a i(int var1) {
         return this.d(var1);
      }

      public a j(String var1) {
         return this.e(var1);
      }
   }
}
