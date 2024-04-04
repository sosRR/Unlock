package w2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class b extends f2.a implements c2.d {
   public static final Parcelable.Creator CREATOR = new c();
   final int m;
   private int n;
   private Intent o;

   public b() {
      this(2, 0, (Intent)null);
   }

   b(int var1, int var2, Intent var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public final Status n() {
      return this.n == 0 ? Status.r : Status.v;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.i(var1, 2, this.n);
      f2.b.m(var1, 3, this.o, var2, false);
      f2.b.b(var1, var3);
   }
}
