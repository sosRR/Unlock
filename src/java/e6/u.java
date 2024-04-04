package e6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class u {
   private static final List a = c6.c.d(c6.c.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));

   public static final void a(o5.f var0, Throwable var1) {
      Iterator var2 = a.iterator();

      while(var2.hasNext()) {
         t var3 = (t)var2.next();

         try {
            var3.handleException(var0, var1);
         } catch (Throwable var10) {
            Thread var4 = Thread.currentThread();
            var4.getUncaughtExceptionHandler().uncaughtException(var4, v.b(var1, var10));
            continue;
         }
      }

      Thread var11 = Thread.currentThread();

      m5.j.a var12;
      label71:
      try {
         var12 = m5.j.m;
         b0 var13 = new b0(var0);
         m5.a.a(var1, var13);
         m5.j.a(m5.o.a);
      } catch (Throwable var9) {
         var12 = m5.j.m;
         m5.j.a(m5.k.a(var9));
         break label71;
      }

      var11.getUncaughtExceptionHandler().uncaughtException(var11, var1);
   }
}
