package b2;

import android.os.Parcel;
import android.os.Parcelable;

public class d extends f2.a {
   public static final Parcelable.Creator CREATOR = new n();
   private final String m;
   @Deprecated
   private final int n;
   private final long o;

   public d(String var1, int var2, long var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public d(String var1, long var2) {
      this.m = var1;
      this.o = var2;
      this.n = -1;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof d) {
         d var2 = (d)var1;
         if ((this.u() != null && this.u().equals(var2.u()) || this.u() == null && var2.u() == null) && this.v() == var2.v()) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return e2.m.b(this.u(), this.v());
   }

   public final String toString() {
      e2.m.a var1 = e2.m.c(this);
      var1.a("name", this.u());
      var1.a("version", this.v());
      return var1.toString();
   }

   public String u() {
      return this.m;
   }

   public long v() {
      long var3 = this.o;
      long var1 = var3;
      if (var3 == -1L) {
         var1 = (long)this.n;
      }

      return var1;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.n(var1, 1, this.u(), false);
      f2.b.i(var1, 2, this.n);
      f2.b.k(var1, 3, this.v());
      f2.b.b(var1, var2);
   }
}
