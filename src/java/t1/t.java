package t1;

import android.database.Cursor;
import java.util.List;

// $FF: synthetic class
public final class t implements m0.b {
   public final m0 a;
   public final List b;
   public final k1.o c;

   // $FF: synthetic method
   public t(m0 var1, List var2, k1.o var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Object apply(Object var1) {
      return m0.V(this.a, this.b, this.c, (Cursor)var1);
   }
}
