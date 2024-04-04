package e2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

public final class m1 extends q2.a implements i {
   m1(IBinder var1) {
      super(var1, "com.google.android.gms.common.internal.IAccountAccessor");
   }

   public final Account b() {
      Parcel var1 = this.f(2, this.h());
      Account var2 = (Account)q2.c.a(var1, Account.CREATOR);
      var1.recycle();
      return var2;
   }
}
