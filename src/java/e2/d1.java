package e2;

import android.os.Parcel;
import android.os.Parcelable;

public final class d1 implements Parcelable.Creator {
   static void a(f var0, Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, var0.m);
      f2.b.i(var1, 2, var0.n);
      f2.b.i(var1, 3, var0.o);
      f2.b.n(var1, 4, var0.p, false);
      f2.b.h(var1, 5, var0.q, false);
      f2.b.p(var1, 6, var0.r, var2, false);
      f2.b.e(var1, 7, var0.s, false);
      f2.b.m(var1, 8, var0.t, var2, false);
      f2.b.p(var1, 10, var0.u, var2, false);
      f2.b.p(var1, 11, var0.v, var2, false);
      f2.b.c(var1, 12, var0.w);
      f2.b.i(var1, 13, var0.x);
      f2.b.c(var1, 14, var0.y);
      f2.b.n(var1, 15, var0.u(), false);
      f2.b.b(var1, var3);
   }

   // $FF: synthetic method
   public final Object[] newArray(int var1) {
      return new f[var1];
   }
}
