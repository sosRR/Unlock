package b4;

import java.util.concurrent.Executor;

class j$b$a implements y2.f {
   final Executor a;
   final String b;
   final <undefinedtype> c;

   j$b$a(Object var1, Executor var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public y2.g b(i4.d var1) {
      Object var2 = null;
      if (var1 == null) {
         y3.f.f().k("Received null app settings, cannot send reports at crash time.");
         return y2.j.e((Object)null);
      } else {
         y2.g var3 = j.n(this.c.f);
         l0 var5 = j.h(this.c.f);
         Executor var4 = this.a;
         String var6 = (String)var2;
         if (this.c.e) {
            var6 = this.b;
         }

         return y2.j.g(var3, var5.v(var4, var6));
      }
   }
}
