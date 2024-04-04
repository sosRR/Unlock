package w3;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class a0 extends w3.a {
   private final Set a;
   private final Set b;
   private final Set c;
   private final Set d;
   private final Set e;
   private final Set f;
   private final e g;

   a0(d var1, e var2) {
      HashSet var3 = new HashSet();
      HashSet var5 = new HashSet();
      HashSet var9 = new HashSet();
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();
      Iterator var4 = var1.e().iterator();

      while(var4.hasNext()) {
         q var8 = (q)var4.next();
         if (var8.e()) {
            if (var8.g()) {
               var6.add(var8.c());
            } else {
               var3.add(var8.c());
            }
         } else if (var8.d()) {
            var9.add(var8.c());
         } else if (var8.g()) {
            var7.add(var8.c());
         } else {
            var5.add(var8.c());
         }
      }

      if (!var1.h().isEmpty()) {
         var3.add(q4.c.class);
      }

      this.a = Collections.unmodifiableSet(var3);
      this.b = Collections.unmodifiableSet(var5);
      this.c = Collections.unmodifiableSet(var9);
      this.d = Collections.unmodifiableSet(var6);
      this.e = Collections.unmodifiableSet(var7);
      this.f = var1.h();
      this.g = var2;
   }

   public Object a(Class var1) {
      if (this.a.contains(var1)) {
         Object var2 = this.g.a(var1);
         return !var1.equals(q4.c.class) ? var2 : new a(this.f, (q4.c)var2);
      } else {
         throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{var1}));
      }
   }

   public Set b(Class var1) {
      if (this.d.contains(var1)) {
         return this.g.b(var1);
      } else {
         throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{var1}));
      }
   }

   public t4.b c(Class var1) {
      if (this.b.contains(var1)) {
         return this.g.c(var1);
      } else {
         throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{var1}));
      }
   }

   public t4.b d(Class var1) {
      if (this.e.contains(var1)) {
         return this.g.d(var1);
      } else {
         throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{var1}));
      }
   }

   public t4.a e(Class var1) {
      if (this.c.contains(var1)) {
         return this.g.e(var1);
      } else {
         throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{var1}));
      }
   }

   private static class a implements q4.c {
      private final Set a;
      private final q4.c b;

      public a(Set var1, q4.c var2) {
         this.a = var1;
         this.b = var2;
      }
   }
}
