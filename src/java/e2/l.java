package e2;

import android.os.Parcel;
import android.os.Parcelable;

public class l extends f2.a {
   public static final Parcelable.Creator CREATOR = new g0();
   private final int m;
   private final int n;
   private final int o;
   private final long p;
   private final long q;
   private final String r;
   private final String s;
   private final int t;
   private final int u;

   public l(int var1, int var2, int var3, long var4, long var6, String var8, String var9, int var10, int var11) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var6;
      this.r = var8;
      this.s = var9;
      this.t = var10;
      this.u = var11;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.i(var1, 2, this.n);
      f2.b.i(var1, 3, this.o);
      f2.b.k(var1, 4, this.p);
      f2.b.k(var1, 5, this.q);
      f2.b.n(var1, 6, this.r, false);
      f2.b.n(var1, 7, this.s, false);
      f2.b.i(var1, 8, this.t);
      f2.b.i(var1, 9, this.u);
      f2.b.b(var1, var2);
   }
}
