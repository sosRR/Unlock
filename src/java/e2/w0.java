package e2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class w0 extends m0 {
   private c a;
   private final int b;

   public w0(c var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void O(int var1, IBinder var2, a1 var3) {
      c var4 = this.a;
      n.j(var4, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      n.i(var3);
      c.c0(var4, var3);
      this.i0(var1, var2, var3.m);
   }

   public final void V(int var1, Bundle var2) {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
   }

   public final void i0(int var1, IBinder var2, Bundle var3) {
      n.j(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      this.a.N(var1, var2, var3, this.b);
      this.a = null;
   }
}
