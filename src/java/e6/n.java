package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class n {
   private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(n.class, "_handled");
   private volatile int _handled;
   public final Throwable a;

   public n(Throwable var1, boolean var2) {
      this.a = var1;
      this._handled = var2;
   }

   // $FF: synthetic method
   public n(Throwable var1, boolean var2, int var3, x5.e var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      this(var1, var2);
   }

   public final boolean a() {
      return (boolean)this._handled;
   }

   public final boolean b() {
      return b.compareAndSet(this, 0, 1);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(x.a(this));
      var1.append('[');
      var1.append(this.a);
      var1.append(']');
      return var1.toString();
   }
}
