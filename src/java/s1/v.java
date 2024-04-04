package s1;

import java.util.Iterator;
import java.util.concurrent.Executor;

public class v {
   private final Executor a;
   private final t1.d b;
   private final x c;
   private final u1.a d;

   v(Executor var1, t1.d var2, x var3, u1.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   // $FF: synthetic method
   public static Object a(v var0) {
      return var0.d();
   }

   // $FF: synthetic method
   public static void b(v var0) {
      var0.e();
   }

   // $FF: synthetic method
   private Object d() {
      Iterator var1 = this.b.w().iterator();

      while(var1.hasNext()) {
         k1.o var2 = (k1.o)var1.next();
         this.c.a(var2, 1);
      }

      return null;
   }

   // $FF: synthetic method
   private void e() {
      this.d.k(new u(this));
   }

   public void c() {
      this.a.execute(new t(this));
   }
}
