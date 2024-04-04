package b2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e2.o1;
import javax.annotation.Nullable;

public final class d0 extends f2.a {
   public static final Parcelable.Creator CREATOR = new e0();
   private final String m;
   @Nullable
   private final t n;
   private final boolean o;
   private final boolean p;

   d0(String var1, @Nullable IBinder var2, boolean var3, boolean var4) {
      this.m = var1;
      Object var5 = null;
      u var7;
      if (var2 == null) {
         var7 = (u)var5;
      } else {
         label25: {
            l2.a var8;
            try {
               var8 = o1.h(var2).d();
            } catch (RemoteException var6) {
               Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", var6);
               var7 = (u)var5;
               break label25;
            }

            byte[] var9;
            if (var8 == null) {
               var9 = null;
            } else {
               var9 = (byte[])l2.b.m(var8);
            }

            if (var9 != null) {
               var7 = new u(var9);
            } else {
               Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
               var7 = (u)var5;
            }
         }
      }

      this.n = var7;
      this.o = var3;
      this.p = var4;
   }

   d0(String var1, @Nullable t var2, boolean var3, boolean var4) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      var2 = f2.b.a(var1);
      f2.b.n(var1, 1, this.m, false);
      t var4 = this.n;
      t var3 = var4;
      if (var4 == null) {
         Log.w("GoogleCertificatesQuery", "certificate binder is null");
         var3 = null;
      }

      f2.b.h(var1, 2, var3, false);
      f2.b.c(var1, 3, this.o);
      f2.b.c(var1, 4, this.p);
      f2.b.b(var1, var2);
   }
}
