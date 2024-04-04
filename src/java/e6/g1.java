package e6;

public final class g1 {
   public static final g1 a = new g1();
   private static final ThreadLocal b = new ThreadLocal();

   private g1() {
   }

   public final i0 a() {
      ThreadLocal var3 = b;
      i0 var2 = (i0)var3.get();
      i0 var1 = var2;
      if (var2 == null) {
         var1 = l0.a();
         var3.set(var1);
      }

      return var1;
   }

   public final void b() {
      b.set((Object)null);
   }

   public final void c(i0 var1) {
      b.set(var1);
   }
}
