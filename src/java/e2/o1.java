package e2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class o1 extends q2.b implements p1 {
   public o1() {
      super("com.google.android.gms.common.internal.ICertData");
   }

   public static p1 h(IBinder var0) {
      IInterface var1 = var0.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
      return (p1)(var1 instanceof p1 ? (p1)var1 : new n1(var0));
   }

   protected final boolean f(int var1, Parcel var2, Parcel var3, int var4) {
      if (var1 != 1) {
         if (var1 != 2) {
            return false;
         }

         var1 = this.c();
         var3.writeNoException();
         var3.writeInt(var1);
      } else {
         l2.a var5 = this.d();
         var3.writeNoException();
         q2.c.d(var3, var5);
      }

      return true;
   }
}
