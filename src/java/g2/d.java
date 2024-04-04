package g2;

import android.content.Context;
import e2.r;
import e2.t;
import e2.u;
import y2.g;

public final class d extends com.google.android.gms.common.api.b implements t {
   private static final com.google.android.gms.common.api.a.g k;
   private static final com.google.android.gms.common.api.a.a l;
   private static final com.google.android.gms.common.api.a m;
   public static final int n = 0;

   static {
      com.google.android.gms.common.api.a.g var0 = new com.google.android.gms.common.api.a.g();
      k = var0;
      c var1 = new c();
      l = var1;
      m = new com.google.android.gms.common.api.a("ClientTelemetry.API", var1, var0);
   }

   public d(Context var1, u var2) {
      super(var1, m, var2, com.google.android.gms.common.api.b.a.c);
   }

   public final g a(r var1) {
      com.google.android.gms.common.api.internal.c.a var2 = com.google.android.gms.common.api.internal.c.a();
      var2.d(new b2.d[]{o2.d.a});
      var2.c(false);
      var2.b(new b(var1));
      return this.c(var2.a());
   }
}
