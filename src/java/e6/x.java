package e6;

public final class x {
   public static final String a(Object var0) {
      return var0.getClass().getSimpleName();
   }

   public static final String b(Object var0) {
      return Integer.toHexString(System.identityHashCode(var0));
   }

   public static final String c(o5.d var0) {
      String var5;
      if (var0 instanceof kotlinx.coroutines.internal.d) {
         var5 = var0.toString();
      } else {
         Object var1;
         StringBuilder var7;
         label38:
         try {
            m5.j.a var6 = m5.j.m;
            var7 = new StringBuilder();
            var7.append(var0);
            var7.append('@');
            var7.append(b(var0));
            var1 = m5.j.a(var7.toString());
         } catch (Throwable var4) {
            m5.j.a var2 = m5.j.m;
            var1 = m5.j.a(m5.k.a(var4));
            break label38;
         }

         if (m5.j.b(var1) != null) {
            var7 = new StringBuilder();
            var7.append(var0.getClass().getName());
            var7.append('@');
            var7.append(b(var0));
            var1 = var7.toString();
         }

         var5 = (String)var1;
      }

      return var5;
   }
}
