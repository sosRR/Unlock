package a0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() {
      public a a(Parcel var1) {
         return this.b(var1, (ClassLoader)null);
      }

      public a b(Parcel var1, ClassLoader var2) {
         if (var1.readParcelable(var2) == null) {
            return a.n;
         } else {
            throw new IllegalStateException("superState must be null");
         }
      }

      public a[] c(int var1) {
         return new a[var1];
      }
   };
   public static final a n = new a$a();
   private final Parcelable m;

   private a() {
      this.m = null;
   }

   // $FF: synthetic method
   a(a$a var1) {
      this();
   }

   protected a(Parcel var1, ClassLoader var2) {
      Object var3 = var1.readParcelable(var2);
      if (var3 == null) {
         var3 = n;
      }

      this.m = (Parcelable)var3;
   }

   protected a(Parcelable var1) {
      if (var1 != null) {
         if (var1 == n) {
            var1 = null;
         }

         this.m = var1;
      } else {
         throw new IllegalArgumentException("superState must not be null");
      }
   }

   public final Parcelable a() {
      return this.m;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.m, var2);
   }
}
