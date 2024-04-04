package b4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class j$d$a implements Callable {
   final Boolean a;
   final j$d b;

   j$d$a(j$d var1, Boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public y2.g a() {
      if (!this.a) {
         y3.f.f().i("Deleting cached crash reports...");
         j.d(this.b.b.K());
         j.h(this.b.b).t();
         this.b.b.q.e((Object)null);
         return y2.j.e((Object)null);
      } else {
         y3.f.f().b("Sending cached crash reports...");
         boolean var1 = this.a;
         j.l(this.b.b).c(var1);
         Executor var2 = j.m(this.b.b).c();
         return this.b.a.p(var2, new j$d$a$a(this, var2));
      }
   }
}
