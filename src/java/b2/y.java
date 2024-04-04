package b2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class y extends f2.a {
   public static final Parcelable.Creator CREATOR = new z();
   private final String m;
   private final boolean n;
   private final boolean o;
   private final Context p;
   private final boolean q;

   y(String var1, boolean var2, boolean var3, IBinder var4, boolean var5) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = (Context)l2.b.m(l2.a.a.h(var4));
      this.q = var5;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.n(var1, 1, this.m, false);
      f2.b.c(var1, 2, this.n);
      f2.b.c(var1, 3, this.o);
      f2.b.h(var1, 4, l2.b.l0(this.p), false);
      f2.b.c(var1, 5, this.q);
      f2.b.b(var1, var2);
   }
}
