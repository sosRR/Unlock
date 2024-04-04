package e2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public class f extends f2.a {
   public static final Parcelable.Creator CREATOR = new d1();
   final int m;
   final int n;
   int o;
   String p;
   IBinder q;
   Scope[] r;
   Bundle s;
   Account t;
   b2.d[] u;
   b2.d[] v;
   boolean w;
   int x;
   boolean y;
   private String z;

   f(int var1, int var2, int var3, String var4, IBinder var5, Scope[] var6, Bundle var7, Account var8, b2.d[] var9, b2.d[] var10, boolean var11, int var12, boolean var13, String var14) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      if ("com.google.android.gms".equals(var4)) {
         this.p = "com.google.android.gms";
      } else {
         this.p = var4;
      }

      if (var1 < 2) {
         Account var15;
         if (var5 != null) {
            var15 = a.m(i.a.h(var5));
         } else {
            var15 = null;
         }

         this.t = var15;
      } else {
         this.q = var5;
         this.t = var8;
      }

      this.r = var6;
      this.s = var7;
      this.u = var9;
      this.v = var10;
      this.w = var11;
      this.x = var12;
      this.y = var13;
      this.z = var14;
   }

   public f(int var1, String var2) {
      this.m = 6;
      this.o = b2.f.a;
      this.n = var1;
      this.w = true;
      this.z = var2;
   }

   public final String u() {
      return this.z;
   }

   public final void writeToParcel(Parcel var1, int var2) {
      d1.a(this, var1, var2);
   }
}
