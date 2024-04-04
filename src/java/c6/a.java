package c6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements b {
   private final AtomicReference a;

   public a(b var1) {
      x5.g.e(var1, "sequence");
      super();
      this.a = new AtomicReference(var1);
   }

   public Iterator iterator() {
      b var1 = (b)this.a.getAndSet((Object)null);
      if (var1 != null) {
         return var1.iterator();
      } else {
         throw new IllegalStateException("This sequence can be consumed only once.");
      }
   }
}
