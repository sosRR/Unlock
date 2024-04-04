package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x0.k;

public abstract class c extends d {
   private static final String h = k.f("BrdcstRcvrCnstrntTrckr");
   private final BroadcastReceiver g = new c$a(this);

   public c(Context var1, h1.a var2) {
      super(var1, var2);
   }

   public void e() {
      k.c().a(h, String.format("%s: registering receiver", new Object[]{this.getClass().getSimpleName()}));
      super.b.registerReceiver(this.g, this.g());
   }

   public void f() {
      k.c().a(h, String.format("%s: unregistering receiver", new Object[]{this.getClass().getSimpleName()}));
      super.b.unregisterReceiver(this.g);
   }

   public abstract IntentFilter g();

   public abstract void h(Context var1, Intent var2);
}
