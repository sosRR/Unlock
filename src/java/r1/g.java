package r1;

public final class g implements n1.b {
   private final l5.a a;

   public g(l5.a var1) {
      this.a = var1;
   }

   public static s1.f a(v1.a var0) {
      return (s1.f)n1.d.c(f.a(var0), "Cannot return null from a non-@Nullable @Provides method");
   }

   public static g b(l5.a var0) {
      return new g(var0);
   }

   public s1.f c() {
      return a((v1.a)this.a.get());
   }
}
