package c1;

import android.content.Context;
import f1.p;
import x0.k;
import x0.l;

public class f extends c {
   private static final String e = k.f("NetworkNotRoamingCtrlr");

   public f(Context var1, h1.a var2) {
      super(d1.g.c(var1, var2).d());
   }

   boolean b(p var1) {
      boolean var2;
      if (var1.j.b() == l.p) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   boolean i(b1.b var1) {
      boolean var2;
      if (var1.a() && var1.c()) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
