package e2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

public final class y0 extends l0 {
   public final IBinder g;
   final c h;

   public y0(c var1, int var2, IBinder var3, Bundle var4) {
      super(var1, var2, var4);
      this.h = var1;
      this.g = var3;
   }

   protected final void f(b2.b var1) {
      if (e2.c.V(this.h) != null) {
         e2.c.V(this.h).f(var1);
      }

      this.h.L(var1);
   }

   protected final boolean g() {
      String var3;
      try {
         IBinder var1 = this.g;
         n.i(var1);
         var3 = var1.getInterfaceDescriptor();
      } catch (RemoteException var4) {
         Log.w("GmsClient", "service probably died");
         return false;
      }

      if (!this.h.E().equals(var3)) {
         String var7 = this.h.E();
         StringBuilder var8 = new StringBuilder(String.valueOf(var7).length() + 34 + String.valueOf(var3).length());
         var8.append("service descriptor mismatch: ");
         var8.append(var7);
         var8.append(" vs. ");
         var8.append(var3);
         Log.w("GmsClient", var8.toString());
         return false;
      } else {
         IInterface var5 = this.h.s(this.g);
         if (var5 == null || !e2.c.g0(this.h, 2, 4, var5) && !e2.c.g0(this.h, 3, 4, var5)) {
            return false;
         } else {
            e2.c.Z(this.h, (b2.b)null);
            Bundle var2 = this.h.x();
            c var6 = this.h;
            if (e2.c.U(var6) != null) {
               e2.c.U(var6).m(var2);
            }

            return true;
         }
      }
   }
}
