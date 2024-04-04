package l1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class f {
   public static a a() {
      return new l1.a.b();
   }

   public abstract Iterable b();

   public abstract byte[] c();

   @Builder
   public abstract static class a {
      public abstract f a();

      public abstract a b(Iterable var1);

      public abstract a c(byte[] var1);
   }
}
