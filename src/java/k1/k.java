package k1;

import java.util.concurrent.Executor;

public final class k implements n1.b {
   public static k a() {
      return null.a();
   }

   public static Executor b() {
      return (Executor)n1.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
   }

   public Executor c() {
      return b();
   }
}
