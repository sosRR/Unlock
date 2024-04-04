package g2;

import android.os.IBinder;
import android.os.Parcel;
import e2.r;

public final class a extends o2.a {
   a(IBinder var1) {
      super(var1, "com.google.android.gms.common.internal.service.IClientTelemetryService");
   }

   public final void l0(r var1) {
      Parcel var2 = this.f();
      o2.c.b(var2, var1);
      this.m(1, var2);
   }
}
