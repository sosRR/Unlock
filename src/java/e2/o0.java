package e2;

import android.os.IBinder;
import android.os.Parcel;

public final class o0 extends q2.a implements q0 {
   o0(IBinder var1) {
      super(var1, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
   }

   public final b2.b0 P(b2.y var1) {
      Parcel var2 = this.h();
      q2.c.c(var2, var1);
      Parcel var3 = this.f(6, var2);
      b2.b0 var4 = (b2.b0)q2.c.a(var3, b2.b0.CREATOR);
      var3.recycle();
      return var4;
   }

   public final boolean g() {
      Parcel var2 = this.f(7, this.h());
      boolean var1 = q2.c.e(var2);
      var2.recycle();
      return var1;
   }

   public final boolean y(b2.d0 var1, l2.a var2) {
      Parcel var4 = this.h();
      q2.c.c(var4, var1);
      q2.c.d(var4, var2);
      Parcel var5 = this.f(5, var4);
      boolean var3 = q2.c.e(var5);
      var5.recycle();
      return var3;
   }
}
