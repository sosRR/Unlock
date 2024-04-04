package e6;

public final class r {
   public static final String a(o5.f var0) {
      return null;
   }

   public static final i1 b(q5.d var0) {
      q5.d var1;
      do {
         if (var0 instanceof c0) {
            return null;
         }

         var1 = var0.b();
         if (var1 == null) {
            return null;
         }

         var0 = var1;
      } while(!(var1 instanceof i1));

      return (i1)var1;
   }

   public static final i1 c(o5.d var0, o5.f var1, Object var2) {
      if (!(var0 instanceof q5.d)) {
         return null;
      } else {
         boolean var3;
         if (var1.get(j1.m) != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (!var3) {
            return null;
         } else {
            i1 var4 = b((q5.d)var0);
            if (var4 != null) {
               var4.n0(var1, var2);
            }

            return var4;
         }
      }
   }
}
