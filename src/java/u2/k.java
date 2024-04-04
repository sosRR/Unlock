package u2;

import com.google.android.gms.internal.measurement.gf;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.x4;
import java.util.concurrent.Callable;

// $FF: synthetic class
public final class k implements Callable {
   public final x4 a;
   public final String b;

   // $FF: synthetic method
   public k(x4 var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Object call() {
      return new gf("internal.appMetadata", new r4(this.a, this.b));
   }
}
