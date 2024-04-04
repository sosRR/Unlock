package e2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class j0 extends f2.a {
   public static final Parcelable.Creator CREATOR = new k0();
   final int m;
   final IBinder n;
   private final b2.b o;
   private final boolean p;
   private final boolean q;

   j0(int var1, IBinder var2, b2.b var3, boolean var4, boolean var5) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var5;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (this == var1) {
         return true;
      } else if (!(var1 instanceof j0)) {
         return false;
      } else {
         j0 var2 = (j0)var1;
         return this.o.equals(var2.o) && e2.m.a(this.v(), var2.v());
      }
   }

   public final b2.b u() {
      return this.o;
   }

   public final i v() {
      IBinder var1 = this.n;
      return var1 == null ? null : i.a.h(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.h(var1, 2, this.n, false);
      f2.b.m(var1, 3, this.o, var2, false);
      f2.b.c(var1, 4, this.p);
      f2.b.c(var1, 5, this.q);
      f2.b.b(var1, var3);
   }
}
