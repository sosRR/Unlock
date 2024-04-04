package w2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.j0;

public final class l extends f2.a {
   public static final Parcelable.Creator CREATOR = new m();
   final int m;
   private final b2.b n;
   private final j0 o;

   l(int var1, b2.b var2, j0 var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public final b2.b u() {
      return this.n;
   }

   public final j0 v() {
      return this.o;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.m(var1, 2, this.n, var2, false);
      f2.b.m(var1, 3, this.o, var2, false);
      f2.b.b(var1, var3);
   }
}
