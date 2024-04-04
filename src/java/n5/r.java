package n5;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class r implements ListIterator {
   public static final r m = new r();

   private r() {
   }

   public Void b() {
      throw new NoSuchElementException();
   }

   public Void c() {
      throw new NoSuchElementException();
   }

   public boolean hasNext() {
      return false;
   }

   public boolean hasPrevious() {
      return false;
   }

   public int nextIndex() {
      return 0;
   }

   public int previousIndex() {
      return -1;
   }

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
