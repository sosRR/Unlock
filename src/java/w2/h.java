package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class h extends f2.a implements c2.d {
   public static final Parcelable.Creator CREATOR = new i();
   private final List m;
   private final String n;

   public h(List var1, String var2) {
      this.m = var1;
      this.n = var2;
   }

   public final Status n() {
      return this.n != null ? Status.r : Status.v;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.o(var1, 1, this.m, false);
      f2.b.n(var1, 2, this.n, false);
      f2.b.b(var1, var2);
   }
}
