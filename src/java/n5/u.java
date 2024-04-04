package n5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class u implements Set, Serializable {
   public static final u m = new u();

   private u() {
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
      if (var1 instanceof Set && ((Set)var1).isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int g() {
      return 0;
   }

   public int hashCode() {
      return 0;
   }

   public boolean isEmpty() {
      return true;
   }

   public Iterator iterator() {
      return r.m;
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
