package e2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class r extends f2.a {
   public static final Parcelable.Creator CREATOR = new v();
   private final int m;
   @Nullable
   private List n;

   public r(int var1, @Nullable List var2) {
      this.m = var1;
      this.n = var2;
   }

   public final int u() {
      return this.m;
   }

   public final List v() {
      return this.n;
   }

   public final void w(l var1) {
      if (this.n == null) {
         this.n = new ArrayList();
      }

      this.n.add(var1);
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.q(var1, 2, this.n, false);
      f2.b.b(var1, var2);
   }
}
