package e6;

public final class q {
   public static final Object a(Object var0, o5.d var1) {
      if (var0 instanceof n) {
         m5.j.a var2 = m5.j.m;
         var0 = m5.j.a(m5.k.a(((n)var0).a));
      } else {
         var0 = m5.j.a(var0);
      }

      return var0;
   }

   public static final Object b(Object var0, g var1) {
      Throwable var2 = m5.j.b(var0);
      if (var2 != null) {
         var0 = new n(var2, false, 2, (x5.e)null);
      }

      return var0;
   }

   public static final Object c(Object var0, w5.l var1) {
      Throwable var2 = m5.j.b(var0);
      Object var3;
      if (var2 == null) {
         var3 = var0;
         if (var1 != null) {
            var3 = new o(var0, var1);
         }
      } else {
         var3 = new n(var2, false, 2, (x5.e)null);
      }

      return var3;
   }

   // $FF: synthetic method
   public static Object d(Object var0, w5.l var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = null;
      }

      return c(var0, var1);
   }
}
