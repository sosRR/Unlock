package c1;

import f1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class c implements b1.a {
   private final List a = new ArrayList();
   private Object b;
   private d1.d c;
   private a d;

   c(d1.d var1) {
      this.c = var1;
   }

   private void h(a var1, Object var2) {
      if (!this.a.isEmpty() && var1 != null) {
         if (var2 != null && !this.c(var2)) {
            var1.a(this.a);
         } else {
            var1.b(this.a);
         }
      }

   }

   public void a(Object var1) {
      this.b = var1;
      this.h(this.d, var1);
   }

   abstract boolean b(p var1);

   abstract boolean c(Object var1);

   public boolean d(String var1) {
      Object var3 = this.b;
      boolean var2;
      if (var3 != null && this.c(var3) && this.a.contains(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void e(Iterable var1) {
      this.a.clear();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         p var3 = (p)var2.next();
         if (this.b(var3)) {
            this.a.add(var3.a);
         }
      }

      if (this.a.isEmpty()) {
         this.c.c(this);
      } else {
         this.c.a(this);
      }

      this.h(this.d, this.b);
   }

   public void f() {
      if (!this.a.isEmpty()) {
         this.a.clear();
         this.c.c(this);
      }

   }

   public void g(a var1) {
      if (this.d != var1) {
         this.d = var1;
         this.h(var1, this.b);
      }

   }

   public interface a {
      void a(List var1);

      void b(List var1);
   }
}
