package j2;

import e2.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
   private final String a;
   private final ThreadFactory b = Executors.defaultThreadFactory();

   public a(String var1) {
      n.j(var1, "Name must not be null");
      this.a = var1;
   }

   public final Thread newThread(Runnable var1) {
      Thread var2 = this.b.newThread(new b(var1, 0));
      var2.setName(this.a);
      return var2;
   }
}
