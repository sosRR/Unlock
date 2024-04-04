package g1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

public class o implements x0.g {
   private static final String d = x0.k.f("WMFgUpdater");
   private final h1.a a;
   final e1.a b;
   final f1.q c;

   public o(WorkDatabase var1, e1.a var2, h1.a var3) {
      this.b = var2;
      this.a = var3;
      this.c = var1.D();
   }

   public u3.a a(Context var1, UUID var2, x0.f var3) {
      androidx.work.impl.utils.futures.d var4 = androidx.work.impl.utils.futures.d.t();
      this.a.b(new o$a(this, var4, var2, var3, var1));
      return var4;
   }
}
