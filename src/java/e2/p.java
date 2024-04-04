package e2;

import android.os.Parcel;
import android.os.Parcelable;

public class p extends f2.a {
   public static final Parcelable.Creator CREATOR = new t0();
   private final int m;
   private final boolean n;
   private final boolean o;
   private final int p;
   private final int q;

   public p(int var1, boolean var2, boolean var3, int var4, int var5) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var5;
   }

   public int u() {
      return this.p;
   }

   public int v() {
      return this.q;
   }

   public boolean w() {
      return this.n;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.i(var1, 1, this.y());
      f2.b.c(var1, 2, this.w());
      f2.b.c(var1, 3, this.x());
      f2.b.i(var1, 4, this.u());
      f2.b.i(var1, 5, this.v());
      f2.b.b(var1, var2);
   }

   public boolean x() {
      return this.o;
   }

   public int y() {
      return this.m;
   }
}
