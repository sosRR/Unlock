package n5;

import java.util.Iterator;

public abstract class v implements Iterator {
   public abstract int nextInt();

   public void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
