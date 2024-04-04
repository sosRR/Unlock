package e2;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public class a extends i.a {
   public static Account m(i var0) {
      Account var3 = null;
      Object var4 = null;
      if (var0 != null) {
         long var1 = Binder.clearCallingIdentity();
         boolean var7 = false;

         Account var10;
         label46: {
            try {
               var7 = true;
               var10 = var0.b();
               var7 = false;
               break label46;
            } catch (RemoteException var8) {
               Log.w("AccountAccessor", "Remote account accessor probably died");
               var7 = false;
            } finally {
               if (var7) {
                  Binder.restoreCallingIdentity(var1);
               }
            }

            var10 = (Account)var4;
         }

         Binder.restoreCallingIdentity(var1);
         var3 = var10;
      }

      return var3;
   }
}
