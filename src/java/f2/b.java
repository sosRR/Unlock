package f2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class b {
   public static int a(Parcel var0) {
      return r(var0, 20293);
   }

   public static void b(Parcel var0, int var1) {
      s(var0, var1);
   }

   public static void c(Parcel var0, int var1, boolean var2) {
      t(var0, var1, 4);
      var0.writeInt(var2);
   }

   public static void d(Parcel var0, int var1, Boolean var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         t(var0, var1, 4);
         var0.writeInt(var2);
      }
   }

   public static void e(Parcel var0, int var1, Bundle var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var0.writeBundle(var2);
         s(var0, var1);
      }
   }

   public static void f(Parcel var0, int var1, Double var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         t(var0, var1, 8);
         var0.writeDouble(var2);
      }
   }

   public static void g(Parcel var0, int var1, Float var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         t(var0, var1, 4);
         var0.writeFloat(var2);
      }
   }

   public static void h(Parcel var0, int var1, IBinder var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var0.writeStrongBinder(var2);
         s(var0, var1);
      }
   }

   public static void i(Parcel var0, int var1, int var2) {
      t(var0, var1, 4);
      var0.writeInt(var2);
   }

   public static void j(Parcel var0, int var1, int[] var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var0.writeIntArray(var2);
         s(var0, var1);
      }
   }

   public static void k(Parcel var0, int var1, long var2) {
      t(var0, var1, 8);
      var0.writeLong(var2);
   }

   public static void l(Parcel var0, int var1, Long var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         t(var0, var1, 8);
         var0.writeLong(var2);
      }
   }

   public static void m(Parcel var0, int var1, Parcelable var2, int var3, boolean var4) {
      if (var2 == null) {
         if (var4) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var2.writeToParcel(var0, var3);
         s(var0, var1);
      }
   }

   public static void n(Parcel var0, int var1, String var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var0.writeString(var2);
         s(var0, var1);
      }
   }

   public static void o(Parcel var0, int var1, List var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         var1 = r(var0, var1);
         var0.writeStringList(var2);
         s(var0, var1);
      }
   }

   public static void p(Parcel var0, int var1, Parcelable[] var2, int var3, boolean var4) {
      if (var2 == null) {
         if (var4) {
            t(var0, var1, 0);
         }

      } else {
         int var5 = r(var0, var1);
         int var6 = var2.length;
         var0.writeInt(var6);

         for(var1 = 0; var1 < var6; ++var1) {
            Parcelable var7 = var2[var1];
            if (var7 == null) {
               var0.writeInt(0);
            } else {
               u(var0, var7, var3);
            }
         }

         s(var0, var5);
      }
   }

   public static void q(Parcel var0, int var1, List var2, boolean var3) {
      if (var2 == null) {
         if (var3) {
            t(var0, var1, 0);
         }

      } else {
         int var4 = r(var0, var1);
         int var5 = var2.size();
         var0.writeInt(var5);

         for(var1 = 0; var1 < var5; ++var1) {
            Parcelable var6 = (Parcelable)var2.get(var1);
            if (var6 == null) {
               var0.writeInt(0);
            } else {
               u(var0, var6, 0);
            }
         }

         s(var0, var4);
      }
   }

   private static int r(Parcel var0, int var1) {
      var0.writeInt(var1 | -65536);
      var0.writeInt(0);
      return var0.dataPosition();
   }

   private static void s(Parcel var0, int var1) {
      int var2 = var0.dataPosition();
      var0.setDataPosition(var1 - 4);
      var0.writeInt(var2 - var1);
      var0.setDataPosition(var2);
   }

   private static void t(Parcel var0, int var1, int var2) {
      var0.writeInt(var1 | var2 << 16);
   }

   private static void u(Parcel var0, Parcelable var1, int var2) {
      int var3 = var0.dataPosition();
      var0.writeInt(1);
      int var4 = var0.dataPosition();
      var1.writeToParcel(var0, var2);
      var2 = var0.dataPosition();
      var0.setDataPosition(var3);
      var0.writeInt(var2 - var4);
      var0.setDataPosition(var2);
   }
}
