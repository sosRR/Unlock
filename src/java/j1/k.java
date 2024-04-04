package j1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class k {
   public static a a() {
      return new e.b();
   }

   public abstract j1.a b();

   public abstract b c();

   @Builder
   public abstract static class a {
      public abstract k a();

      public abstract a b(j1.a var1);

      public abstract a c(b var1);
   }

   public static enum b {
      n,
      o;

      private static final b[] p;
      private final int m;

      static {
         b var1 = new b("UNKNOWN", 0, 0);
         n = var1;
         b var0 = new b("ANDROID_FIREBASE", 1, 23);
         o = var0;
         p = new b[]{var1, var0};
      }

      private b(int var3) {
         this.m = var3;
      }
   }
}
