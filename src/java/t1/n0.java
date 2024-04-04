package t1;

public final class n0 implements n1.b {
   private final l5.a a;
   private final l5.a b;
   private final l5.a c;
   private final l5.a d;
   private final l5.a e;

   public n0(l5.a var1, l5.a var2, l5.a var3, l5.a var4, l5.a var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public static n0 a(l5.a var0, l5.a var1, l5.a var2, l5.a var3, l5.a var4) {
      return new n0(var0, var1, var2, var3, var4);
   }

   public static m0 c(v1.a var0, v1.a var1, Object var2, Object var3, m1.a var4) {
      return new m0(var0, var1, (e)var2, (t0)var3, var4);
   }

   public m0 b() {
      return c((v1.a)this.a.get(), (v1.a)this.b.get(), this.c.get(), this.d.get(), n1.a.a(this.e));
   }
}
