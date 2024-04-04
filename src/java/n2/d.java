package n2;

import android.os.IBinder;
import android.os.Parcel;

public final class d extends a implements f {
   d(IBinder var1) {
      super(var1, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
   }

   public final boolean H(boolean var1) {
      Parcel var2 = this.f();
      c.a(var2, true);
      var2 = this.h(2, var2);
      var1 = c.b(var2);
      var2.recycle();
      return var1;
   }

   public final String c() {
      Parcel var1 = this.h(1, this.f());
      String var2 = var1.readString();
      var1.recycle();
      return var2;
   }
}
