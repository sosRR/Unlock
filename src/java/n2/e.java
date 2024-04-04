package n2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements f {
   public static f f(IBinder var0) {
      if (var0 == null) {
         return null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
         return (f)(var1 instanceof f ? (f)var1 : new d(var0));
      }
   }
}
