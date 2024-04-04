package u2;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.ga;
import com.google.android.gms.measurement.internal.x9;
import java.util.List;

public abstract class d extends p0 implements e {
   public d() {
      super("com.google.android.gms.measurement.internal.IMeasurementService");
   }

   protected final boolean f(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var5;
      ga var8;
      String var10;
      List var11;
      String var14;
      String var15;
      ga var17;
      com.google.android.gms.measurement.internal.v var20;
      switch (var1) {
         case 1:
            var20 = (com.google.android.gms.measurement.internal.v)q0.a(var2, com.google.android.gms.measurement.internal.v.CREATOR);
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.b0(var20, var8);
            var3.writeNoException();
            break;
         case 2:
            x9 var22 = (x9)q0.a(var2, x9.CREATOR);
            var17 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.a0(var22, var17);
            var3.writeNoException();
            break;
         case 3:
         case 8:
         default:
            return false;
         case 4:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.f0(var8);
            var3.writeNoException();
            break;
         case 5:
            var20 = (com.google.android.gms.measurement.internal.v)q0.a(var2, com.google.android.gms.measurement.internal.v.CREATOR);
            var14 = var2.readString();
            var10 = var2.readString();
            q0.c(var2);
            this.s(var20, var14, var10);
            var3.writeNoException();
            break;
         case 6:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.t(var8);
            var3.writeNoException();
            break;
         case 7:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            var5 = q0.g(var2);
            q0.c(var2);
            var11 = this.D(var8, var5);
            var3.writeNoException();
            var3.writeTypedList(var11);
            break;
         case 9:
            com.google.android.gms.measurement.internal.v var21 = (com.google.android.gms.measurement.internal.v)q0.a(var2, com.google.android.gms.measurement.internal.v.CREATOR);
            var15 = var2.readString();
            q0.c(var2);
            byte[] var13 = this.E(var21, var15);
            var3.writeNoException();
            var3.writeByteArray(var13);
            break;
         case 10:
            long var6 = var2.readLong();
            var14 = var2.readString();
            var15 = var2.readString();
            var10 = var2.readString();
            q0.c(var2);
            this.p(var6, var14, var15, var10);
            var3.writeNoException();
            break;
         case 11:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            String var12 = this.J(var8);
            var3.writeNoException();
            var3.writeString(var12);
            break;
         case 12:
            com.google.android.gms.measurement.internal.d var19 = (com.google.android.gms.measurement.internal.d)q0.a(var2, com.google.android.gms.measurement.internal.d.CREATOR);
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.W(var19, var8);
            var3.writeNoException();
            break;
         case 13:
            com.google.android.gms.measurement.internal.d var16 = (com.google.android.gms.measurement.internal.d)q0.a(var2, com.google.android.gms.measurement.internal.d.CREATOR);
            q0.c(var2);
            this.C(var16);
            var3.writeNoException();
            break;
         case 14:
            var10 = var2.readString();
            var14 = var2.readString();
            var5 = q0.g(var2);
            var17 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            var11 = this.I(var10, var14, var5, var17);
            var3.writeNoException();
            var3.writeTypedList(var11);
            break;
         case 15:
            var15 = var2.readString();
            var14 = var2.readString();
            var10 = var2.readString();
            var5 = q0.g(var2);
            q0.c(var2);
            var11 = this.A(var15, var14, var10, var5);
            var3.writeNoException();
            var3.writeTypedList(var11);
            break;
         case 16:
            var14 = var2.readString();
            var15 = var2.readString();
            ga var18 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            var11 = this.g0(var14, var15, var18);
            var3.writeNoException();
            var3.writeTypedList(var11);
            break;
         case 17:
            var14 = var2.readString();
            var10 = var2.readString();
            var15 = var2.readString();
            q0.c(var2);
            var11 = this.Q(var14, var10, var15);
            var3.writeNoException();
            var3.writeTypedList(var11);
            break;
         case 18:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.R(var8);
            var3.writeNoException();
            break;
         case 19:
            Bundle var9 = (Bundle)q0.a(var2, Bundle.CREATOR);
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.w(var9, var8);
            var3.writeNoException();
            break;
         case 20:
            var8 = (ga)q0.a(var2, ga.CREATOR);
            q0.c(var2);
            this.F(var8);
            var3.writeNoException();
      }

      return true;
   }
}
