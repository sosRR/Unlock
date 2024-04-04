package d4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class b0 implements List, RandomAccess {
   private final List m;

   private b0(List var1) {
      this.m = Collections.unmodifiableList(var1);
   }

   public static b0 d(List var0) {
      return new b0(var0);
   }

   public static b0 g(Object... var0) {
      return new b0(Arrays.asList(var0));
   }

   public void add(int var1, Object var2) {
      this.m.add(var1, var2);
   }

   public boolean add(Object var1) {
      return this.m.add(var1);
   }

   public boolean addAll(int var1, Collection var2) {
      return this.m.addAll(var1, var2);
   }

   public boolean addAll(Collection var1) {
      return this.m.addAll(var1);
   }

   public void clear() {
      this.m.clear();
   }

   public boolean contains(Object var1) {
      return this.m.contains(var1);
   }

   public boolean containsAll(Collection var1) {
      return this.m.containsAll(var1);
   }

   public boolean equals(Object var1) {
      return this.m.equals(var1);
   }

   public Object get(int var1) {
      return this.m.get(var1);
   }

   public int hashCode() {
      return this.m.hashCode();
   }

   public int indexOf(Object var1) {
      return this.m.indexOf(var1);
   }

   public boolean isEmpty() {
      return this.m.isEmpty();
   }

   public Iterator iterator() {
      return this.m.iterator();
   }

   public int lastIndexOf(Object var1) {
      return this.m.lastIndexOf(var1);
   }

   public ListIterator listIterator() {
      return this.m.listIterator();
   }

   public ListIterator listIterator(int var1) {
      return this.m.listIterator(var1);
   }

   public Object remove(int var1) {
      return this.m.remove(var1);
   }

   public boolean remove(Object var1) {
      return this.m.remove(var1);
   }

   public boolean removeAll(Collection var1) {
      return this.m.removeAll(var1);
   }

   public boolean retainAll(Collection var1) {
      return this.m.retainAll(var1);
   }

   public Object set(int var1, Object var2) {
      return this.m.set(var1, var2);
   }

   public int size() {
      return this.m.size();
   }

   public List subList(int var1, int var2) {
      return this.m.subList(var1, var2);
   }

   public Object[] toArray() {
      return this.m.toArray();
   }

   public Object[] toArray(Object[] var1) {
      return this.m.toArray(var1);
   }
}
