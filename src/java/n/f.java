package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f {
   b a;
   c b;
   e c;

   public static boolean j(Map var0, Collection var1) {
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(var0.containsKey(var2.next()));

      return false;
   }

   public static boolean k(Set var0, Object var1) {
      boolean var2 = true;
      if (var0 == var1) {
         return true;
      } else if (var1 instanceof Set) {
         Set var5 = (Set)var1;

         label27: {
            boolean var3;
            try {
               if (var0.size() != var5.size()) {
                  break label27;
               }

               var3 = var0.containsAll(var5);
            } catch (ClassCastException | NullPointerException var4) {
               return false;
            }

            if (var3) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      } else {
         return false;
      }
   }

   public static boolean o(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var0.remove(var4.next());
      }

      boolean var3;
      if (var2 != var0.size()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static boolean p(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         if (!var1.contains(var4.next())) {
            var4.remove();
         }
      }

      boolean var3;
      if (var2 != var0.size()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   protected abstract void a();

   protected abstract Object b(int var1, int var2);

   protected abstract Map c();

   protected abstract int d();

   protected abstract int e(Object var1);

   protected abstract int f(Object var1);

   protected abstract void g(Object var1, Object var2);

   protected abstract void h(int var1);

   protected abstract Object i(int var1, Object var2);

   public Set l() {
      if (this.a == null) {
         this.a = new b(this);
      }

      return this.a;
   }

   public Set m() {
      if (this.b == null) {
         this.b = new c(this);
      }

      return this.b;
   }

   public Collection n() {
      if (this.c == null) {
         this.c = new e(this);
      }

      return this.c;
   }

   public Object[] q(int var1) {
      int var3 = this.d();
      Object[] var4 = new Object[var3];

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = this.b(var2, var1);
      }

      return var4;
   }

   public Object[] r(Object[] var1, int var2) {
      int var4 = this.d();
      Object[] var5 = var1;
      if (var1.length < var4) {
         var5 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var4);
      }

      for(int var3 = 0; var3 < var4; ++var3) {
         var5[var3] = this.b(var3, var2);
      }

      if (var5.length > var4) {
         var5[var4] = null;
      }

      return var5;
   }

   final class a implements Iterator {
      final int m;
      int n;
      int o;
      boolean p;
      final f q;

      a(f var1, int var2) {
         this.q = var1;
         this.p = false;
         this.m = var2;
         this.n = var1.d();
      }

      public boolean hasNext() {
         boolean var1;
         if (this.o < this.n) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public Object next() {
         if (this.hasNext()) {
            Object var1 = this.q.b(this.o, this.m);
            ++this.o;
            this.p = true;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      }

      public void remove() {
         if (this.p) {
            int var1 = this.o - 1;
            this.o = var1;
            --this.n;
            this.p = false;
            this.q.h(var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   final class b implements Set {
      final f m;

      b(f var1) {
         this.m = var1;
      }

      public boolean addAll(Collection var1) {
         int var2 = this.m.d();
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            Map.Entry var5 = (Map.Entry)var4.next();
            this.m.g(var5.getKey(), var5.getValue());
         }

         boolean var3;
         if (var2 != this.m.d()) {
            var3 = true;
         } else {
            var3 = false;
         }

         return var3;
      }

      public void clear() {
         this.m.a();
      }

      public boolean contains(Object var1) {
         if (!(var1 instanceof Map.Entry)) {
            return false;
         } else {
            Map.Entry var3 = (Map.Entry)var1;
            int var2 = this.m.e(var3.getKey());
            return var2 < 0 ? false : n.c.c(this.m.b(var2, 1), var3.getValue());
         }
      }

      public boolean containsAll(Collection var1) {
         Iterator var2 = var1.iterator();

         do {
            if (!var2.hasNext()) {
               return true;
            }
         } while(this.contains(var2.next()));

         return false;
      }

      public boolean d(Map.Entry var1) {
         throw new UnsupportedOperationException();
      }

      public boolean equals(Object var1) {
         return f.k(this, var1);
      }

      public int hashCode() {
         int var1 = this.m.d() - 1;

         int var2;
         for(var2 = 0; var1 >= 0; --var1) {
            Object var6 = this.m.b(var1, 0);
            Object var5 = this.m.b(var1, 1);
            int var3;
            if (var6 == null) {
               var3 = 0;
            } else {
               var3 = var6.hashCode();
            }

            int var4;
            if (var5 == null) {
               var4 = 0;
            } else {
               var4 = var5.hashCode();
            }

            var2 += var3 ^ var4;
         }

         return var2;
      }

      public boolean isEmpty() {
         boolean var1;
         if (this.m.d() == 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public Iterator iterator() {
         return this.m.new d(this.m);
      }

      public boolean remove(Object var1) {
         throw new UnsupportedOperationException();
      }

      public boolean removeAll(Collection var1) {
         throw new UnsupportedOperationException();
      }

      public boolean retainAll(Collection var1) {
         throw new UnsupportedOperationException();
      }

      public int size() {
         return this.m.d();
      }

      public Object[] toArray() {
         throw new UnsupportedOperationException();
      }

      public Object[] toArray(Object[] var1) {
         throw new UnsupportedOperationException();
      }
   }

   final class c implements Set {
      final f m;

      c(f var1) {
         this.m = var1;
      }

      public boolean add(Object var1) {
         throw new UnsupportedOperationException();
      }

      public boolean addAll(Collection var1) {
         throw new UnsupportedOperationException();
      }

      public void clear() {
         this.m.a();
      }

      public boolean contains(Object var1) {
         boolean var2;
         if (this.m.e(var1) >= 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      public boolean containsAll(Collection var1) {
         return f.j(this.m.c(), var1);
      }

      public boolean equals(Object var1) {
         return f.k(this, var1);
      }

      public int hashCode() {
         int var2 = this.m.d() - 1;

         int var1;
         for(var1 = 0; var2 >= 0; --var2) {
            Object var4 = this.m.b(var2, 0);
            int var3;
            if (var4 == null) {
               var3 = 0;
            } else {
               var3 = var4.hashCode();
            }

            var1 += var3;
         }

         return var1;
      }

      public boolean isEmpty() {
         boolean var1;
         if (this.m.d() == 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public Iterator iterator() {
         return this.m.new a(this.m, 0);
      }

      public boolean remove(Object var1) {
         int var2 = this.m.e(var1);
         if (var2 >= 0) {
            this.m.h(var2);
            return true;
         } else {
            return false;
         }
      }

      public boolean removeAll(Collection var1) {
         return f.o(this.m.c(), var1);
      }

      public boolean retainAll(Collection var1) {
         return f.p(this.m.c(), var1);
      }

      public int size() {
         return this.m.d();
      }

      public Object[] toArray() {
         return this.m.q(0);
      }

      public Object[] toArray(Object[] var1) {
         return this.m.r(var1, 0);
      }
   }

   final class d implements Iterator, Map.Entry {
      int m;
      int n;
      boolean o;
      final f p;

      d(f var1) {
         this.p = var1;
         this.o = false;
         this.m = var1.d() - 1;
         this.n = -1;
      }

      public Map.Entry b() {
         if (this.hasNext()) {
            ++this.n;
            this.o = true;
            return this;
         } else {
            throw new NoSuchElementException();
         }
      }

      public boolean equals(Object var1) {
         if (this.o) {
            boolean var2 = var1 instanceof Map.Entry;
            boolean var3 = false;
            if (!var2) {
               return false;
            } else {
               Map.Entry var4 = (Map.Entry)var1;
               var2 = var3;
               if (n.c.c(var4.getKey(), this.p.b(this.n, 0))) {
                  var2 = var3;
                  if (n.c.c(var4.getValue(), this.p.b(this.n, 1))) {
                     var2 = true;
                  }
               }

               return var2;
            }
         } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
         }
      }

      public Object getKey() {
         if (this.o) {
            return this.p.b(this.n, 0);
         } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
         }
      }

      public Object getValue() {
         if (this.o) {
            return this.p.b(this.n, 1);
         } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
         }
      }

      public boolean hasNext() {
         boolean var1;
         if (this.n < this.m) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public int hashCode() {
         if (this.o) {
            f var3 = this.p;
            int var1 = this.n;
            int var2 = 0;
            Object var4 = var3.b(var1, 0);
            Object var5 = this.p.b(this.n, 1);
            if (var4 == null) {
               var1 = 0;
            } else {
               var1 = var4.hashCode();
            }

            if (var5 != null) {
               var2 = var5.hashCode();
            }

            return var1 ^ var2;
         } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
         }
      }

      public void remove() {
         if (this.o) {
            this.p.h(this.n);
            --this.n;
            --this.m;
            this.o = false;
         } else {
            throw new IllegalStateException();
         }
      }

      public Object setValue(Object var1) {
         if (this.o) {
            return this.p.i(this.n, var1);
         } else {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
         }
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append(this.getKey());
         var1.append("=");
         var1.append(this.getValue());
         return var1.toString();
      }
   }

   final class e implements Collection {
      final f m;

      e(f var1) {
         this.m = var1;
      }

      public boolean add(Object var1) {
         throw new UnsupportedOperationException();
      }

      public boolean addAll(Collection var1) {
         throw new UnsupportedOperationException();
      }

      public void clear() {
         this.m.a();
      }

      public boolean contains(Object var1) {
         boolean var2;
         if (this.m.f(var1) >= 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      public boolean containsAll(Collection var1) {
         Iterator var2 = var1.iterator();

         do {
            if (!var2.hasNext()) {
               return true;
            }
         } while(this.contains(var2.next()));

         return false;
      }

      public boolean isEmpty() {
         boolean var1;
         if (this.m.d() == 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public Iterator iterator() {
         return this.m.new a(this.m, 1);
      }

      public boolean remove(Object var1) {
         int var2 = this.m.f(var1);
         if (var2 >= 0) {
            this.m.h(var2);
            return true;
         } else {
            return false;
         }
      }

      public boolean removeAll(Collection var1) {
         int var3 = this.m.d();
         int var2 = 0;

         int var4;
         boolean var6;
         for(var6 = false; var2 < var3; var3 = var4) {
            var4 = var3;
            int var5 = var2;
            if (var1.contains(this.m.b(var2, 1))) {
               this.m.h(var2);
               var5 = var2 - 1;
               var4 = var3 - 1;
               var6 = true;
            }

            var2 = var5 + 1;
         }

         return var6;
      }

      public boolean retainAll(Collection var1) {
         int var3 = this.m.d();
         int var2 = 0;

         int var5;
         boolean var6;
         for(var6 = false; var2 < var3; var3 = var5) {
            var5 = var3;
            int var4 = var2;
            if (!var1.contains(this.m.b(var2, 1))) {
               this.m.h(var2);
               var4 = var2 - 1;
               var5 = var3 - 1;
               var6 = true;
            }

            var2 = var4 + 1;
         }

         return var6;
      }

      public int size() {
         return this.m.d();
      }

      public Object[] toArray() {
         return this.m.q(1);
      }

      public Object[] toArray(Object[] var1) {
         return this.m.r(var1, 1);
      }
   }
}
