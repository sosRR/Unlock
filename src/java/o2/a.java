package o2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
   private final IBinder a;
   private final String b;

   protected a(IBinder var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final IBinder asBinder() {
      return this.a;
   }

   protected final Parcel f() {
      Parcel var1 = Parcel.obtain();
      var1.writeInterfaceToken(this.b);
      return var1;
   }

   protected final void h(int var1, Parcel var2) {
      Parcel var3 = Parcel.obtain();

      try {
         this.a.transact(var1, var2, var3, 0);
         var3.readException();
      } finally {
         var2.recycle();
         var3.recycle();
      }

   }

   protected final void m(int var1, Parcel var2) {
      try {
         this.a.transact(1, var2, (Parcel)null, 1);
      } finally {
         var2.recycle();
      }

   }
}
