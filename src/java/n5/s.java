package n5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class s implements List, Serializable, RandomAccess {
   public static final s m = new s();

   private s() {
   }

   public boolean addAll(int var1, Collection var2) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean containsAll(Collection var1) {
      x5.g.e(var1, "elements");
      return var1.isEmpty();
   }

   public boolean d(Void var1) {
      x5.g.e(var1, "element");
      return false;
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof List && ((List)var1).isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public Void g(int var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("Empty list doesn't contain element at index ");
      var2.append(var1);
      var2.append('.');
      throw new IndexOutOfBoundsException(var2.toString());
   }

   public int h() {
      return 0;
   }

   public int hashCode() {
      return 1;
   }

   public int i(Void var1) {
      x5.g.e(var1, "element");
      return -1;
   }

   public boolean isEmpty() {
      return true;
   }

   public Iterator iterator() {
      return r.m;
   }

   public int k(Void var1) {
      x5.g.e(var1, "element");
      return -1;
   }

   public ListIterator listIterator() {
      return r.m;
   }

   public ListIterator listIterator(int var1) {
      if (var1 == 0) {
         return r.m;
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("Index: ");
         var2.append(var1);
         throw new IndexOutOfBoundsException(var2.toString());
      }
   }

   public boolean remove(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public List subList(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return this;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("fromIndex: ");
         var3.append(var1);
         var3.append(", toIndex: ");
         var3.append(var2);
         throw new IndexOutOfBoundsException(var3.toString());
      }
   }

   public Object[] toArray() {
      return x5.d.a(this);
   }

   public Object[] toArray(Object[] var1) {
      x5.g.e(var1, "array");
      return x5.d.b(this, var1);
   }

   public String toString() {
      return "[]";
   }
}
