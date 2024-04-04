package k1;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class i {
   public static a a() {
      return (new b.b()).f(new HashMap());
   }

   public final String b(String var1) {
      String var2 = (String)this.c().get(var1);
      var1 = var2;
      if (var2 == null) {
         var1 = "";
      }

      return var1;
   }

   protected abstract Map c();

   public abstract Integer d();

   public abstract h e();

   public abstract long f();

   public final int g(String var1) {
      var1 = (String)this.c().get(var1);
      int var2;
      if (var1 == null) {
         var2 = 0;
      } else {
         var2 = Integer.valueOf(var1);
      }

      return var2;
   }

   public final long h(String var1) {
      var1 = (String)this.c().get(var1);
      long var2;
      if (var1 == null) {
         var2 = 0L;
      } else {
         var2 = Long.valueOf(var1);
      }

      return var2;
   }

   public final Map i() {
      return Collections.unmodifiableMap(this.c());
   }

   public abstract String j();

   public abstract long k();

   public a l() {
      return (new b.b()).j(this.j()).g(this.d()).h(this.e()).i(this.f()).k(this.k()).f(new HashMap(this.c()));
   }

   @Builder
   public abstract static class a {
      public final a a(String var1, int var2) {
         this.e().put(var1, String.valueOf(var2));
         return this;
      }

      public final a b(String var1, long var2) {
         this.e().put(var1, String.valueOf(var2));
         return this;
      }

      public final a c(String var1, String var2) {
         this.e().put(var1, var2);
         return this;
      }

      public abstract i d();

      protected abstract Map e();

      protected abstract a f(Map var1);

      public abstract a g(Integer var1);

      public abstract a h(h var1);

      public abstract a i(long var1);

      public abstract a j(String var1);

      public abstract a k(long var1);
   }
}
