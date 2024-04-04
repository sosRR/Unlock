package q5;

public final class f {
   private static final void a(int var0, int var1) {
      if (var1 > var0) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Debug metadata version mismatch. Expected: ");
         var2.append(var0);
         var2.append(", got ");
         var2.append(var1);
         var2.append(". Please update the Kotlin standard library.");
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   private static final e b(a var0) {
      return (e)var0.getClass().getAnnotation(e.class);
   }

   private static final int c(a param0) {
      // $FF: Couldn't be decompiled
   }

   public static final StackTraceElement d(a var0) {
      x5.g.e(var0, "<this>");
      e var2 = b(var0);
      if (var2 == null) {
         return null;
      } else {
         a(1, var2.v());
         int var1 = c(var0);
         if (var1 < 0) {
            var1 = -1;
         } else {
            var1 = var2.l()[var1];
         }

         String var3 = h.a.b(var0);
         String var4;
         if (var3 == null) {
            var4 = var2.c();
         } else {
            StringBuilder var5 = new StringBuilder();
            var5.append(var3);
            var5.append('/');
            var5.append(var2.c());
            var4 = var5.toString();
         }

         return new StackTraceElement(var4, var2.m(), var2.f(), var1);
      }
   }
}
