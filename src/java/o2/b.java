package o2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {
   protected b(String var1) {
      this.attachInterface(this, var1);
   }

   public final IBinder asBinder() {
      return this;
   }

   protected boolean l0(int var1, Parcel var2, Parcel var3, int var4) {
      throw null;
   }

   public final boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      if (var1 > 16777215) {
         if (super.onTransact(var1, var2, var3, var4)) {
            return true;
         }
      } else {
         var2.enforceInterface(this.getInterfaceDescriptor());
      }

      return this.l0(var1, var2, var3, var4);
   }
}
