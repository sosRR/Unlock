package b;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
   private final Set a = new CopyOnWriteArraySet();
   private volatile Context b;

   public void a(b var1) {
      if (this.b != null) {
         var1.a(this.b);
      }

      this.a.add(var1);
   }

   public void b() {
      this.b = null;
   }

   public void c(Context var1) {
      this.b = var1;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ((b)var2.next()).a(var1);
      }

   }
}
