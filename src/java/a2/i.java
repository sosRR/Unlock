package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// $FF: synthetic class
public final class i implements Runnable {
   public final b m;
   public final Intent n;
   public final Context o;
   public final boolean p;
   public final BroadcastReceiver.PendingResult q;

   // $FF: synthetic method
   public i(b var1, Intent var2, Context var3, boolean var4, BroadcastReceiver.PendingResult var5) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var5;
   }

   public final void run() {
      this.m.d(this.n, this.o, this.p, this.q);
   }
}
