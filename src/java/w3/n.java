package w3;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class n extends a implements l4.a {
   private static final t4.b g = new k();
   private final Map a;
   private final Map b;
   private final Map c;
   private final List d;
   private final s e;
   private final AtomicReference f;

   private n(Executor var1, Iterable var2, Collection var3) {
      this.a = new HashMap();
      this.b = new HashMap();
      this.c = new HashMap();
      this.f = new AtomicReference();
      s var4 = new s(var1);
      this.e = var4;
      ArrayList var5 = new ArrayList();
      var5.add(w3.d.p(var4, s.class, q4.d.class, q4.c.class));
      var5.add(w3.d.p(this, l4.a.class));
      Iterator var7 = var3.iterator();

      while(var7.hasNext()) {
         d var6 = (d)var7.next();
         if (var6 != null) {
            var5.add(var6);
         }
      }

      this.d = m(var2);
      this.j(var5);
   }

   // $FF: synthetic method
   n(Executor var1, Iterable var2, Collection var3, n$a var4) {
      this(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Object f(n var0, d var1) {
      return var0.n(var1);
   }

   // $FF: synthetic method
   public static void g(u var0, t4.b var1) {
      p(var0, var1);
   }

   // $FF: synthetic method
   public static void h(y var0, t4.b var1) {
      o(var0, var1);
   }

   public static b i(Executor var0) {
      return new b(var0);
   }

   private void j(List param1) {
      // $FF: Couldn't be decompiled
   }

   private void k(Map var1, boolean var2) {
      Iterator var5 = var1.entrySet().iterator();

      while(true) {
         d var3;
         t4.b var6;
         do {
            if (!var5.hasNext()) {
               this.e.d();
               return;
            }

            Map.Entry var4 = (Map.Entry)var5.next();
            var3 = (d)var4.getKey();
            var6 = (t4.b)var4.getValue();
         } while(!var3.k() && (!var3.l() || !var2));

         var6.get();
      }
   }

   private static List m(Iterable var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(var2.next());
      }

      return var1;
   }

   // $FF: synthetic method
   private Object n(d var1) {
      return var1.f().a(new a0(var1, this));
   }

   // $FF: synthetic method
   private static void o(y var0, t4.b var1) {
      var0.j(var1);
   }

   // $FF: synthetic method
   private static void p(u var0, t4.b var1) {
      var0.a(var1);
   }

   private void q() {
      Boolean var1 = (Boolean)this.f.get();
      if (var1 != null) {
         this.k(this.a, var1);
      }

   }

   private void r() {
      Iterator var3 = this.a.keySet().iterator();

      label34:
      while(var3.hasNext()) {
         d var1 = (d)var3.next();
         Iterator var4 = var1.e().iterator();

         while(true) {
            while(true) {
               if (!var4.hasNext()) {
                  continue label34;
               }

               q var2 = (q)var4.next();
               if (var2.g() && !this.c.containsKey(var2.c())) {
                  this.c.put(var2.c(), u.b(Collections.emptySet()));
               } else if (!this.b.containsKey(var2.c())) {
                  if (var2.f()) {
                     throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{var1, var2.c()}));
                  }

                  if (!var2.g()) {
                     this.b.put(var2.c(), y.e());
                  }
               }
            }
         }
      }

   }

   private List s(List var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.iterator();

      while(true) {
         d var4;
         do {
            if (!var3.hasNext()) {
               return var2;
            }

            var4 = (d)var3.next();
         } while(!var4.m());

         t4.b var6 = (t4.b)this.a.get(var4);
         Iterator var7 = var4.g().iterator();

         while(var7.hasNext()) {
            Class var5 = (Class)var7.next();
            if (!this.b.containsKey(var5)) {
               this.b.put(var5, var6);
            } else {
               var2.add(new l((y)((t4.b)this.b.get(var5)), var6));
            }
         }
      }
   }

   private List t() {
      ArrayList var1 = new ArrayList();
      HashMap var2 = new HashMap();
      Iterator var3 = this.a.entrySet().iterator();

      while(true) {
         Map.Entry var4;
         d var5;
         do {
            if (!var3.hasNext()) {
               Iterator var7 = var2.entrySet().iterator();

               while(true) {
                  while(var7.hasNext()) {
                     var4 = (Map.Entry)var7.next();
                     if (!this.c.containsKey(var4.getKey())) {
                        this.c.put((Class)var4.getKey(), u.b((Collection)var4.getValue()));
                     } else {
                        u var8 = (u)this.c.get(var4.getKey());
                        Iterator var10 = ((Set)var4.getValue()).iterator();

                        while(var10.hasNext()) {
                           var1.add(new m(var8, (t4.b)var10.next()));
                        }
                     }
                  }

                  return var1;
               }
            }

            var4 = (Map.Entry)var3.next();
            var5 = (d)var4.getKey();
         } while(var5.m());

         t4.b var9 = (t4.b)var4.getValue();

         Class var11;
         for(Iterator var6 = var5.g().iterator(); var6.hasNext(); ((Set)var2.get(var11)).add(var9)) {
            var11 = (Class)var6.next();
            if (!var2.containsKey(var11)) {
               var2.put(var11, new HashSet());
            }
         }
      }
   }

   public t4.b c(Class var1) {
      synchronized(this){}

      t4.b var5;
      try {
         z.c(var1, "Null interface requested.");
         var5 = (t4.b)this.b.get(var1);
      } finally {
         ;
      }

      return var5;
   }

   public t4.b d(Class var1) {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var10001;
         u var9;
         try {
            var9 = (u)this.c.get(var1);
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label78;
         }

         if (var9 != null) {
            return var9;
         }

         t4.b var11;
         try {
            var11 = g;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label78;
         }

         return var11;
      }

      Throwable var10 = var10000;
      throw var10;
   }

   public t4.a e(Class var1) {
      t4.b var2 = this.c(var1);
      if (var2 == null) {
         return y.e();
      } else {
         return var2 instanceof y ? (y)var2 : y.i(var2);
      }
   }

   public void l(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public static final class b {
      private final Executor a;
      private final List b = new ArrayList();
      private final List c = new ArrayList();

      b(Executor var1) {
         this.a = var1;
      }

      // $FF: synthetic method
      public static i a(i var0) {
         return f(var0);
      }

      // $FF: synthetic method
      private static i f(i var0) {
         return var0;
      }

      public b b(d var1) {
         this.c.add(var1);
         return this;
      }

      public b c(i var1) {
         this.b.add(new o(var1));
         return this;
      }

      public b d(Collection var1) {
         this.b.addAll(var1);
         return this;
      }

      public n e() {
         return new n(this.a, this.b, this.c, (n$a)null);
      }
   }
}
