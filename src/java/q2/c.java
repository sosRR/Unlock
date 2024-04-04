package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class c {
   private static final ClassLoader a = c.class.getClassLoader();

   private c() {
   }

   public static Parcelable a(Parcel var0, Parcelable.Creator var1) {
      return var0.readInt() == 0 ? null : (Parcelable)var1.createFromParcel(var0);
   }

   public static void b(Parcel var0, boolean var1) {
      var0.writeInt(var1);
   }

   public static void c(Parcel var0, Parcelable var1) {
      if (var1 == null) {
         var0.writeInt(0);
      } else {
         var0.writeInt(1);
         var1.writeToParcel(var0, 0);
      }
   }

   public static void d(Parcel var0, IInterface var1) {
      if (var1 == null) {
         var0.writeStrongBinder((IBinder)null);
      } else {
         var0.writeStrongBinder(var1.asBinder());
      }
   }

   public static boolean e(Parcel var0) {
      return var0.readInt() != 0;
   }
}
