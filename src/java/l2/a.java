package l2;

import android.os.IBinder;
import android.os.IInterface;

public interface a extends IInterface {
   public abstract static class a extends q2.b implements a {
      public a() {
         super("com.google.android.gms.dynamic.IObjectWrapper");
      }

      public static a h(IBinder var0) {
         if (var0 == null) {
            return null;
         } else {
            IInterface var1 = var0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (a)(var1 instanceof a ? (a)var1 : new c(var0));
         }
      }
   }
}
