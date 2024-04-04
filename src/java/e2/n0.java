package e2;

import android.os.IBinder;
import android.os.Parcel;

final class n0 implements k {
   private final IBinder a;

   n0(IBinder var1) {
      this.a = var1;
   }

   public final void U(j var1, f var2) {
      Parcel var4 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label339: {
         Throwable var10000;
         label343: {
            boolean var10001;
            try {
               var4.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label343;
            }

            IBinder var47;
            if (var1 != null) {
               try {
                  var47 = var1.asBinder();
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label343;
               }
            } else {
               var47 = null;
            }

            try {
               var4.writeStrongBinder(var47);
            } catch (Throwable var44) {
               var10000 = var44;
               var10001 = false;
               break label343;
            }

            if (var2 != null) {
               try {
                  var4.writeInt(1);
                  d1.a(var2, var4, 0);
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label343;
               }
            } else {
               try {
                  var4.writeInt(0);
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label343;
               }
            }

            label321:
            try {
               this.a.transact(46, var4, var3, 0);
               var3.readException();
               break label339;
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label321;
            }
         }

         Throwable var48 = var10000;
         var3.recycle();
         var4.recycle();
         throw var48;
      }

      var3.recycle();
      var4.recycle();
   }

   public final IBinder asBinder() {
      return this.a;
   }
}
