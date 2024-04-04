package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a extends g implements Map {
   f t;

   public a() {
   }

   public a(int var1) {
      super(var1);
   }

   public a(g var1) {
      super(var1);
   }

   private f n() {
      if (this.t == null) {
         this.t = new f(this) {
            final a d;

            {
               this.d = var1;
            }

            protected void a() {
               this.d.clear();
            }

            protected Object b(int var1, int var2) {
               return this.d.n[(var1 << 1) + var2];
            }

            protected Map c() {
               return this.d;
            }

            protected int d() {
               return this.d.o;
            }

            protected int e(Object var1) {
               return this.d.f(var1);
            }

            protected int f(Object var1) {
               return this.d.h(var1);
            }

            protected void g(Object var1, Object var2) {
               this.d.put(var1, var2);
            }

            protected void h(int var1) {
               this.d.k(var1);
            }

            protected Object i(int var1, Object var2) {
               return this.d.l(var1, var2);
            }
         };
      }

      return this.t;
   }

   public Set entrySet() {
      return this.n().l();
   }

   public Set keySet() {
      return this.n().m();
   }

   public boolean o(Collection var1) {
      return f.p(this, var1);
   }

   public void putAll(Map var1) {
      this.c(super.o + var1.size());
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         this.put(var3.getKey(), var3.getValue());
      }

   }

   public Collection values() {
      return this.n().n();
   }
}
