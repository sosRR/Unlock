package e6;

import java.util.concurrent.locks.LockSupport;

public abstract class k0 extends i0 {
   protected abstract Thread Z();

   protected void a0(long var1, j0.a var3) {
      y.s.m0(var1, var3);
   }

   protected final void b0() {
      Thread var1 = this.Z();
      if (Thread.currentThread() != var1) {
         e6.c.a();
         LockSupport.unpark(var1);
      }

   }
}
