package e2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class h0 extends f2.a {
   public static final Parcelable.Creator CREATOR = new i0();
   final int m;
   private final Account n;
   private final int o;
   private final GoogleSignInAccount p;

   h0(int var1, Account var2, int var3, GoogleSignInAccount var4) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
   }

   public h0(Account var1, int var2, GoogleSignInAccount var3) {
      this(2, var1, var2, var3);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.m(var1, 2, this.n, var2, false);
      f2.b.i(var1, 3, this.o);
      f2.b.m(var1, 4, this.p, var2, false);
      f2.b.b(var1, var3);
   }
}
