package w2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.h0;

public final class j extends f2.a {
   public static final Parcelable.Creator CREATOR = new k();
   final int m;
   final h0 n;

   j(int var1, h0 var2) {
      this.m = var1;
      this.n = var2;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.m(var1, 2, this.n, var2, false);
      f2.b.b(var1, var3);
   }
}
