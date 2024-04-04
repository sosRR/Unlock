package c5;

import android.content.Context;
import w3.q;

public class h {
   // $FF: synthetic method
   public static f a(String var0, a var1, w3.e var2) {
      return d(var0, var1, var2);
   }

   public static w3.d b(String var0, String var1) {
      return w3.d.i(f.a(var0, var1), f.class);
   }

   public static w3.d c(String var0, a var1) {
      return w3.d.j(f.class).b(q.j(Context.class)).f(new g(var0, var1)).d();
   }

   // $FF: synthetic method
   private static f d(String var0, a var1, w3.e var2) {
      return f.a(var0, var1.a((Context)var2.a(Context.class)));
   }

   public interface a {
      String a(Object var1);
   }
}
