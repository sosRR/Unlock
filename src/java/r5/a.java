package r5;

import java.lang.reflect.Method;
import x5.g;

public class a {
   public void a(Throwable var1, Throwable var2) {
      g.e(var1, "cause");
      g.e(var2, "exception");
      Method var3 = r5.a.a.b;
      if (var3 != null) {
         var3.invoke(var1, new Object[]{var2});
      }

   }

   public y5.c b() {
      return new y5.b();
   }

   private static final class a {
      public static final r5.a a = new r5.a();
      public static final Method b;
      public static final Method c;

      static {
         Method[] var6 = Throwable.class.getMethods();
         g.d(var6, "throwableMethods");
         int var3 = var6.length;
         byte var2 = 0;
         int var0 = 0;

         Method var4;
         Object var5;
         while(true) {
            var5 = null;
            if (var0 >= var3) {
               var4 = null;
               break;
            }

            boolean var1;
            label35: {
               var4 = var6[var0];
               if (g.a(var4.getName(), "addSuppressed")) {
                  Class[] var7 = var4.getParameterTypes();
                  g.d(var7, "it.parameterTypes");
                  if (g.a(n5.a.g(var7), Throwable.class)) {
                     var1 = true;
                     break label35;
                  }
               }

               var1 = false;
            }

            if (var1) {
               break;
            }

            ++var0;
         }

         b = var4;
         int var8 = var6.length;
         var0 = var2;

         while(true) {
            var4 = (Method)var5;
            if (var0 >= var8) {
               break;
            }

            var4 = var6[var0];
            if (g.a(var4.getName(), "getSuppressed")) {
               break;
            }

            ++var0;
         }

         c = var4;
      }
   }
}
