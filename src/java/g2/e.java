package g2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d2.h;
import e2.g;
import e2.u;

public final class e extends g {
   private final u I;

   public e(Context var1, Looper var2, e2.d var3, u var4, d2.c var5, h var6) {
      super(var1, var2, 270, var3, (d2.c)var5, (h)var6);
      this.I = var4;
   }

   protected final Bundle A() {
      return this.I.d();
   }

   protected final String E() {
      return "com.google.android.gms.common.internal.service.IClientTelemetryService";
   }

   protected final String F() {
      return "com.google.android.gms.common.telemetry.service.START";
   }

   protected final boolean I() {
      return true;
   }

   public final int g() {
      return 203400000;
   }

   // $FF: synthetic method
   protected final IInterface s(IBinder var1) {
      g2.a var3;
      if (var1 == null) {
         var3 = null;
      } else {
         IInterface var2 = var1.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
         if (var2 instanceof g2.a) {
            var3 = (g2.a)var2;
         } else {
            var3 = new g2.a(var1);
         }
      }

      return var3;
   }

   public final b2.d[] v() {
      return o2.d.b;
   }
}
