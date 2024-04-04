package q5;

import java.io.Serializable;
import m5.j;
import m5.k;

public abstract class a implements o5.d, d, Serializable {
   private final o5.d m;

   public StackTraceElement a() {
      return f.d(this);
   }

   public d b() {
      o5.d var1 = this.m;
      d var2;
      if (var1 instanceof d) {
         var2 = (d)var1;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final void d(Object var1) {
      Object var2 = this;

      do {
         g.a((o5.d)var2);
         a var3 = (a)var2;
         var2 = var3.m;
         x5.g.b(var2);

         label44:
         try {
            var1 = var3.e(var1);
            if (var1 == p5.b.b()) {
               return;
            }

            var1 = j.a(var1);
         } catch (Throwable var6) {
            j.a var4 = j.m;
            var1 = j.a(k.a(var6));
            break label44;
         }

         var3.f();
      } while(var2 instanceof a);

      ((o5.d)var2).d(var1);
   }

   protected abstract Object e(Object var1);

   protected void f() {
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("Continuation at ");
      Object var1 = this.a();
      if (var1 == null) {
         var1 = this.getClass().getName();
      }

      var2.append(var1);
      return var2.toString();
   }
}
