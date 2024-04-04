package e2;

import android.os.Bundle;
import android.os.Parcel;

public abstract class m0 extends q2.b implements j {
   public m0() {
      super("com.google.android.gms.common.internal.IGmsCallbacks");
   }

   protected final boolean f(int var1, Parcel var2, Parcel var3, int var4) {
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               return false;
            }

            this.O(var2.readInt(), var2.readStrongBinder(), (a1)q2.c.a(var2, a1.CREATOR));
         } else {
            this.V(var2.readInt(), (Bundle)q2.c.a(var2, Bundle.CREATOR));
         }
      } else {
         this.i0(var2.readInt(), var2.readStrongBinder(), (Bundle)q2.c.a(var2, Bundle.CREATOR));
      }

      var3.writeNoException();
      return true;
   }
}
