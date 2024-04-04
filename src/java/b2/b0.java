package b2;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

public final class b0 extends f2.a {
   public static final Parcelable.Creator CREATOR = new c0();
   private final boolean m;
   @Nullable
   private final String n;
   private final int o;

   b0(boolean var1, String var2, int var3) {
      this.m = var1;
      this.n = var2;
      this.o = a0.a(var3) - 1;
   }

   @Nullable
   public final String u() {
      return this.n;
   }

   public final boolean v() {
      return this.m;
   }

   public final int w() {
      return a0.a(this.o);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.c(var1, 1, this.m);
      f2.b.n(var1, 2, this.n, false);
      f2.b.i(var1, 3, this.o);
      f2.b.b(var1, var2);
   }
}
