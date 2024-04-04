package e2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class a1 extends f2.a {
   public static final Parcelable.Creator CREATOR = new b1();
   Bundle m;
   b2.d[] n;
   int o;
   e p;

   public a1() {
   }

   a1(Bundle var1, b2.d[] var2, int var3, e var4) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.e(var1, 1, this.m, false);
      f2.b.p(var1, 2, this.n, var2, false);
      f2.b.i(var1, 3, this.o);
      f2.b.m(var1, 4, this.p, var2, false);
      f2.b.b(var1, var3);
   }
}
