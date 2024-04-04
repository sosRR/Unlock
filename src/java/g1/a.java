package g1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import x0.u;

public abstract class a implements Runnable {
   private final y0.c m = new y0.c();

   public static a b(y0.i var0) {
      return new a$c(var0);
   }

   public static a c(UUID var0, y0.i var1) {
      return new a$a(var1, var0);
   }

   public static a d(String var0, y0.i var1, boolean var2) {
      return new a$b(var1, var0, var2);
   }

   private void f(WorkDatabase var1, String var2) {
      f1.q var3 = var1.D();
      f1.b var6 = var1.v();
      LinkedList var4 = new LinkedList();
      var4.add(var2);

      for(; !var4.isEmpty(); var4.addAll(var6.d(var2))) {
         var2 = (String)var4.remove();
         u.a var5 = var3.j(var2);
         if (var5 != u.a.o && var5 != u.a.p) {
            var3.h(u.a.r, var2);
         }
      }

   }

   void a(y0.i var1, String var2) {
      this.f(var1.s(), var2);
      var1.q().l(var2);
      Iterator var3 = var1.r().iterator();

      while(var3.hasNext()) {
         ((y0.e)var3.next()).b(var2);
      }

   }

   public x0.n e() {
      return this.m;
   }

   void g(y0.i var1) {
      y0.f.b(var1.m(), var1.s(), var1.r());
   }

   abstract void h();

   public void run() {
      try {
         this.h();
         this.m.a(x0.n.a);
      } catch (Throwable var3) {
         this.m.a(new x0.n.a(var3));
         return;
      }

   }
}
