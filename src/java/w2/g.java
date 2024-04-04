package w2;

import android.os.IBinder;
import android.os.Parcel;

public final class g extends o2.a {
   g(IBinder var1) {
      super(var1, "com.google.android.gms.signin.internal.ISignInService");
   }

   public final void l0(j var1, f var2) {
      Parcel var3 = this.f();
      o2.c.b(var3, var1);
      o2.c.c(var3, var2);
      this.h(12, var3);
   }
}
