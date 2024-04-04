package e2;

import android.os.Parcel;
import android.os.Parcelable;

public class e extends f2.a {
   public static final Parcelable.Creator CREATOR = new c1();
   private final p m;
   private final boolean n;
   private final boolean o;
   private final int[] p;
   private final int q;
   private final int[] r;

   public e(p var1, boolean var2, boolean var3, int[] var4, int var5, int[] var6) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var5;
      this.r = var6;
   }

   public int u() {
      return this.q;
   }

   public int[] v() {
      return this.p;
   }

   public int[] w() {
      return this.r;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.m(var1, 1, this.m, var2, false);
      f2.b.c(var1, 2, this.x());
      f2.b.c(var1, 3, this.y());
      f2.b.j(var1, 4, this.v(), false);
      f2.b.i(var1, 5, this.u());
      f2.b.j(var1, 6, this.w(), false);
      f2.b.b(var1, var3);
   }

   public boolean x() {
      return this.n;
   }

   public boolean y() {
      return this.o;
   }

   public final p z() {
      return this.m;
   }
}
