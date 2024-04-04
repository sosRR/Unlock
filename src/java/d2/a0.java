package d2;

import com.google.android.gms.common.api.AvailabilityException;
import java.util.Set;

public final class a0 {
   private final n.a a;
   private final n.a b;
   private final y2.h c;
   private int d;
   private boolean e;

   public final Set a() {
      return this.a.keySet();
   }

   public final void b(b var1, b2.b var2, String var3) {
      this.a.put(var1, var2);
      this.b.put(var1, var3);
      --this.d;
      if (!var2.y()) {
         this.e = true;
      }

      if (this.d == 0) {
         if (this.e) {
            AvailabilityException var4 = new AvailabilityException(this.a);
            this.c.b(var4);
            return;
         }

         this.c.c(this.b);
      }

   }
}
