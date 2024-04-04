package e2;

import android.os.IBinder;
import android.os.Parcel;

public final class n1 extends q2.a implements p1 {
   n1(IBinder var1) {
      super(var1, "com.google.android.gms.common.internal.ICertData");
   }

   public final int c() {
      Parcel var2 = this.f(2, this.h());
      int var1 = var2.readInt();
      var2.recycle();
      return var1;
   }

   public final l2.a d() {
      Parcel var1 = this.f(1, this.h());
      l2.a var2 = l2.a.a.h(var1.readStrongBinder());
      var1.recycle();
      return var2;
   }
}
