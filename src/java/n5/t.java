package n5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class t implements Map, Serializable {
   public static final t m = new t();

   private t() {
   }

   public boolean a(Void var1) {
      x5.g.e(var1, "value");
      return false;
   }

   public Void b(Object var1) {
      return null;
   }

   public Set c() {
      return u.m;
   }

   public void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public boolean containsKey(Object var1) {
      return false;
   }

   public Set d() {
      return u.m;
   }

   public int e() {
      return 0;
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Map && ((Map)var1).isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public Collection f() {
      return s.m;
   }

   public Void g(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public int hashCode() {
      return 0;
   }

   public boolean isEmpty() {
      return true;
   }

   public void putAll(Map var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public String toString() {
      return "{}";
   }
}
