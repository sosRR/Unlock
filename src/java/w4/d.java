package w4;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class d {
   public static d a = a().a();

   public static a a() {
      return (new w4.a.b()).h(0L).g(c.a.m).c(0L);
   }

   public abstract String b();

   public abstract long c();

   public abstract String d();

   public abstract String e();

   public abstract String f();

   public abstract c.a g();

   public abstract long h();

   public boolean i() {
      boolean var1;
      if (this.g() == c.a.q) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean j() {
      boolean var1;
      if (this.g() != c.a.n && this.g() != c.a.m) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean k() {
      boolean var1;
      if (this.g() == c.a.p) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean l() {
      boolean var1;
      if (this.g() == c.a.o) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean m() {
      boolean var1;
      if (this.g() == c.a.m) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public abstract a n();

   public d o(String var1, long var2, long var4) {
      return this.n().b(var1).c(var2).h(var4).a();
   }

   public d p() {
      return this.n().b((String)null).a();
   }

   public d q(String var1) {
      return this.n().e(var1).g(c.a.q).a();
   }

   public d r() {
      return this.n().g(c.a.n).a();
   }

   public d s(String var1, String var2, long var3, String var5, long var6) {
      return this.n().d(var1).g(c.a.p).b(var5).f(var2).c(var6).h(var3).a();
   }

   public d t(String var1) {
      return this.n().d(var1).g(c.a.o).a();
   }

   @Builder
   public abstract static class a {
      public abstract d a();

      public abstract a b(String var1);

      public abstract a c(long var1);

      public abstract a d(String var1);

      public abstract a e(String var1);

      public abstract a f(String var1);

      public abstract a g(c.a var1);

      public abstract a h(long var1);
   }
}
