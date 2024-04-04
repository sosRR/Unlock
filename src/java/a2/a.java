package a2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends f2.a {
   public static final Parcelable.Creator CREATOR = new d();
   Intent m;

   public a(Intent var1) {
      this.m = var1;
   }

   public Intent u() {
      return this.m;
   }

   public void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.m(var1, 1, this.m, var2, false);
      f2.b.b(var1, var3);
   }
}
