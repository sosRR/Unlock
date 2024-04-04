package z0;

import f1.p;
import java.util.HashMap;
import java.util.Map;
import x0.k;
import x0.s;

public class a {
   static final String d = k.f("DelayedWorkTracker");
   final b a;
   private final s b;
   private final Map c;

   public a(b var1, s var2) {
      this.a = var1;
      this.b = var2;
      this.c = new HashMap();
   }

   public void a(p var1) {
      Runnable var6 = (Runnable)this.c.remove(var1.a);
      if (var6 != null) {
         this.b.b(var6);
      }

      var6 = new Runnable(this, var1) {
         final p m;
         final a n;

         {
            this.n = var1;
            this.m = var2;
         }

         public void run() {
            k.c().a(z0.a.d, String.format("Scheduling work %s", new Object[]{this.m.a}));
            this.n.a.f(this.m);
         }
      };
      this.c.put(var1.a, var6);
      long var4 = System.currentTimeMillis();
      long var2 = var1.a();
      this.b.a(var2 - var4, var6);
   }

   public void b(String var1) {
      Runnable var2 = (Runnable)this.c.remove(var1);
      if (var2 != null) {
         this.b.b(var2);
      }

   }
}
