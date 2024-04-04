package u2;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.measurement.internal.a4;
import com.google.android.gms.measurement.internal.d5;

public final class j {
   private final i a;

   public j(i var1) {
      e2.n.i(var1);
      this.a = var1;
   }

   public final void a(Context var1, Intent var2) {
      d5 var4 = d5.H(var1, (o1)null, (Long)null);
      a4 var3 = var4.d();
      if (var2 == null) {
         var3.w().a("Receiver called with null intent");
      } else {
         var4.f();
         String var5 = var2.getAction();
         var3.v().b("Local receiver got", var5);
         if ("com.google.android.gms.measurement.UPLOAD".equals(var5)) {
            var2 = (new Intent()).setClassName(var1, "com.google.android.gms.measurement.AppMeasurementService");
            var2.setAction("com.google.android.gms.measurement.UPLOAD");
            var3.v().a("Starting wakeful intent.");
            this.a.a(var1, var2);
         } else {
            if ("com.android.vending.INSTALL_REFERRER".equals(var5)) {
               var3.w().a("Install Referrer Broadcasts are deprecated");
            }

         }
      }
   }
}
