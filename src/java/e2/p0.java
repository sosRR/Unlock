package e2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class p0 extends q2.b implements q0 {
   public static q0 h(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
         return (q0)(var1 instanceof q0 ? (q0)var1 : new o0(var0));
      }
   }
}
