package w3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d {
   private final Set a;
   private final Set b;
   private final int c;
   private final int d;
   private final h e;
   private final Set f;

   private d(Set var1, Set var2, int var3, int var4, h var5, Set var6) {
      this.a = Collections.unmodifiableSet(var1);
      this.b = Collections.unmodifiableSet(var2);
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = Collections.unmodifiableSet(var6);
   }

   // $FF: synthetic method
   d(Set var1, Set var2, int var3, int var4, h var5, Set var6, Object var7) {
      this(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   public static Object a(Object var0, e var1) {
      return n(var0, var1);
   }

   // $FF: synthetic method
   public static Object b(Object var0, e var1) {
      return o(var0, var1);
   }

   public static b c(Class var0) {
      return new b(var0, new Class[0]);
   }

   @SafeVarargs
   public static b d(Class var0, Class... var1) {
      return new b(var0, var1);
   }

   public static d i(Object var0, Class var1) {
      return j(var1).f(new w3.b(var0)).d();
   }

   public static b j(Class var0) {
      return c(var0).g();
   }

   // $FF: synthetic method
   private static Object n(Object var0, e var1) {
      return var0;
   }

   // $FF: synthetic method
   private static Object o(Object var0, e var1) {
      return var0;
   }

   @SafeVarargs
   public static d p(Object var0, Class var1, Class... var2) {
      return d(var1, var2).f(new c(var0)).d();
   }

   public Set e() {
      return this.b;
   }

   public h f() {
      return this.e;
   }

   public Set g() {
      return this.a;
   }

   public Set h() {
      return this.f;
   }

   public boolean k() {
      int var1 = this.c;
      boolean var2 = true;
      if (var1 != 1) {
         var2 = false;
      }

      return var2;
   }

   public boolean l() {
      boolean var1;
      if (this.c == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean m() {
      boolean var1;
      if (this.d == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("Component<");
      var1.append(Arrays.toString(this.a.toArray()));
      var1.append(">{");
      var1.append(this.c);
      var1.append(", type=");
      var1.append(this.d);
      var1.append(", deps=");
      var1.append(Arrays.toString(this.b.toArray()));
      var1.append("}");
      return var1.toString();
   }

   public static class b {
      private final Set a;
      private final Set b;
      private int c;
      private int d;
      private h e;
      private Set f;

      @SafeVarargs
      private b(Class var1, Class... var2) {
         HashSet var5 = new HashSet();
         this.a = var5;
         this.b = new HashSet();
         int var3 = 0;
         this.c = 0;
         this.d = 0;
         this.f = new HashSet();
         z.c(var1, "Null interface");
         var5.add(var1);

         for(int var4 = var2.length; var3 < var4; ++var3) {
            z.c(var2[var3], "Null interface");
         }

         Collections.addAll(this.a, var2);
      }

      // $FF: synthetic method
      b(Class var1, Class[] var2, Object var3) {
         this(var1, var2);
      }

      private b g() {
         this.d = 1;
         return this;
      }

      private b h(int var1) {
         boolean var2;
         if (this.c == 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         z.d(var2, "Instantiation type has already been set.");
         this.c = var1;
         return this;
      }

      private void i(Class var1) {
         z.a(this.a.contains(var1) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
      }

      public b b(q var1) {
         z.c(var1, "Null dependency");
         this.i(var1.c());
         this.b.add(var1);
         return this;
      }

      public b c() {
         return this.h(1);
      }

      public d d() {
         boolean var1;
         if (this.e != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         z.d(var1, "Missing required property: factory.");
         return new d(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f);
      }

      public b e() {
         return this.h(2);
      }

      public b f(h var1) {
         this.e = (h)z.c(var1, "Null factory");
         return this;
      }
   }
}
