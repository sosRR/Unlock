package e2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

public interface i extends IInterface {
   Account b();

   public abstract static class a extends q2.b implements i {
      public static i h(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return (i)(var1 instanceof i ? (i)var1 : new m1(var0));
         }
      }
   }
}
