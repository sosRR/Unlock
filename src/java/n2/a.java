package n2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
   private final IBinder a;
   private final String b;

   protected a(IBinder var1, String var2) {
      this.a = var1;
      this.b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
   }

   public final IBinder asBinder() {
      return this.a;
   }

   protected final Parcel f() {
      Parcel var1 = Parcel.obtain();
      var1.writeInterfaceToken(this.b);
      return var1;
   }

   protected final Parcel h(int var1, Parcel var2) {
      Parcel var4 = Parcel.obtain();

      try {
         this.a.transact(var1, var2, var4, 0);
         var4.readException();
      } catch (RuntimeException var7) {
         var4.recycle();
         throw var7;
      } finally {
         var2.recycle();
      }

      return var4;
   }
}
