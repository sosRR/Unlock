package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b implements Iterable {
   c m;
   private c n;
   private WeakHashMap o = new WeakHashMap();
   private int p = 0;

   public Map.Entry d() {
      return this.m;
   }

   public Iterator descendingIterator() {
      b var1 = new b(this.n, this.m);
      this.o.put(var1, Boolean.FALSE);
      return var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof b)) {
         return false;
      } else {
         b var3 = (b)var1;
         if (this.size() != var3.size()) {
            return false;
         } else {
            Iterator var6 = this.iterator();
            Iterator var4 = var3.iterator();

            while(true) {
               if (var6.hasNext() && var4.hasNext()) {
                  Map.Entry var5 = (Map.Entry)var6.next();
                  Object var7 = var4.next();
                  if ((var5 != null || var7 == null) && (var5 == null || var5.equals(var7))) {
                     continue;
                  }

                  return false;
               }

               if (var6.hasNext() || var4.hasNext()) {
                  var2 = false;
               }

               return var2;
            }
         }
      }
   }

   protected c g(Object var1) {
      c var2;
      for(var2 = this.m; var2 != null && !var2.m.equals(var1); var2 = var2.o) {
      }

      return var2;
   }

   public d h() {
      d var1 = new d(this);
      this.o.put(var1, Boolean.FALSE);
      return var1;
   }

   public int hashCode() {
      Iterator var2 = this.iterator();

      int var1;
      for(var1 = 0; var2.hasNext(); var1 += ((Map.Entry)var2.next()).hashCode()) {
      }

      return var1;
   }

   public Map.Entry i() {
      return this.n;
   }

   public Iterator iterator() {
      a var1 = new a(this.m, this.n);
      this.o.put(var1, Boolean.FALSE);
      return var1;
   }

   protected c k(Object var1, Object var2) {
      c var3 = new c(var1, var2);
      ++this.p;
      c var4 = this.n;
      if (var4 == null) {
         this.m = var3;
         this.n = var3;
         return var3;
      } else {
         var4.o = var3;
         var3.p = var4;
         this.n = var3;
         return var3;
      }
   }

   public Object m(Object var1, Object var2) {
      c var3 = this.g(var1);
      if (var3 != null) {
         return var3.n;
      } else {
         this.k(var1, var2);
         return null;
      }
   }

   public Object n(Object var1) {
      c var4 = this.g(var1);
      if (var4 == null) {
         return null;
      } else {
         --this.p;
         if (!this.o.isEmpty()) {
            Iterator var2 = this.o.keySet().iterator();

            while(var2.hasNext()) {
               ((f)var2.next()).b(var4);
            }
         }

         c var3 = var4.p;
         if (var3 != null) {
            var3.o = var4.o;
         } else {
            this.m = var4.o;
         }

         c var5 = var4.o;
         if (var5 != null) {
            var5.p = var3;
         } else {
            this.n = var3;
         }

         var4.o = null;
         var4.p = null;
         return var4.n;
      }
   }

   public int size() {
      return this.p;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[");
      Iterator var2 = this.iterator();

      while(var2.hasNext()) {
         var1.append(((Map.Entry)var2.next()).toString());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append("]");
      return var1.toString();
   }

   static class a extends e {
      a(c var1, c var2) {
         super(var1, var2);
      }

      c c(c var1) {
         return var1.p;
      }

      c d(c var1) {
         return var1.o;
      }
   }

   private static class b extends e {
      b(c var1, c var2) {
         super(var1, var2);
      }

      c c(c var1) {
         return var1.o;
      }

      c d(c var1) {
         return var1.p;
      }
   }

   static class c implements Map.Entry {
      final Object m;
      final Object n;
      c o;
      c p;

      c(Object var1, Object var2) {
         this.m = var1;
         this.n = var2;
      }

      public boolean equals(Object var1) {
         boolean var2 = true;
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof c)) {
            return false;
         } else {
            c var3 = (c)var1;
            if (!this.m.equals(var3.m) || !this.n.equals(var3.n)) {
               var2 = false;
            }

            return var2;
         }
      }

      public Object getKey() {
         return this.m;
      }

      public Object getValue() {
         return this.n;
      }

      public int hashCode() {
         return this.m.hashCode() ^ this.n.hashCode();
      }

      public Object setValue(Object var1) {
         throw new UnsupportedOperationException("An entry modification is not supported");
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append(this.m);
         var1.append("=");
         var1.append(this.n);
         return var1.toString();
      }
   }

   private class d implements Iterator, f {
      private c m;
      private boolean n;
      final b o;

      d(b var1) {
         this.o = var1;
         this.n = true;
      }

      public void b(c var1) {
         c var3 = this.m;
         if (var1 == var3) {
            var1 = var3.p;
            this.m = var1;
            boolean var2;
            if (var1 == null) {
               var2 = true;
            } else {
               var2 = false;
            }

            this.n = var2;
         }

      }

      public Map.Entry c() {
         if (this.n) {
            this.n = false;
            this.m = this.o.m;
         } else {
            c var1 = this.m;
            if (var1 != null) {
               var1 = var1.o;
            } else {
               var1 = null;
            }

            this.m = var1;
         }

         return this.m;
      }

      public boolean hasNext() {
         boolean var3 = this.n;
         boolean var1 = true;
         boolean var2 = true;
         if (var3) {
            if (this.o.m != null) {
               var1 = var2;
            } else {
               var1 = false;
            }

            return var1;
         } else {
            c var4 = this.m;
            if (var4 == null || var4.o == null) {
               var1 = false;
            }

            return var1;
         }
      }
   }

   private abstract static class e implements Iterator, f {
      c m;
      c n;

      e(c var1, c var2) {
         this.m = var2;
         this.n = var1;
      }

      private c f() {
         c var2 = this.n;
         c var1 = this.m;
         return var2 != var1 && var1 != null ? this.d(var2) : null;
      }

      public void b(c var1) {
         if (this.m == var1 && var1 == this.n) {
            this.n = null;
            this.m = null;
         }

         c var2 = this.m;
         if (var2 == var1) {
            this.m = this.c(var2);
         }

         if (this.n == var1) {
            this.n = this.f();
         }

      }

      abstract c c(c var1);

      abstract c d(c var1);

      public Map.Entry e() {
         c var1 = this.n;
         this.n = this.f();
         return var1;
      }

      public boolean hasNext() {
         boolean var1;
         if (this.n != null) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }
   }

   interface f {
      void b(c var1);
   }
}
