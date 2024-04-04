package e6;

public final class i1 extends kotlinx.coroutines.internal.v {
   private ThreadLocal p;

   protected void j0(Object var1) {
      m5.i var3 = (m5.i)this.p.get();
      m5.o var2 = null;
      if (var3 != null) {
         kotlinx.coroutines.internal.a0.a((o5.f)var3.a(), var3.b());
         this.p.set((Object)null);
      }

      Object var5 = q.a(var1, super.o);
      o5.d var6 = super.o;
      o5.f var4 = var6.c();
      Object var10 = kotlinx.coroutines.internal.a0.c(var4, (Object)null);
      i1 var9 = var2;
      if (var10 != kotlinx.coroutines.internal.a0.a) {
         var9 = r.c(var6, var4, var10);
      }

      try {
         super.o.d(var5);
         var2 = m5.o.a;
      } finally {
         if (var9 == null || var9.m0()) {
            kotlinx.coroutines.internal.a0.a(var4, var10);
         }

      }

   }

   public final boolean m0() {
      if (this.p.get() == null) {
         return false;
      } else {
         this.p.set((Object)null);
         return true;
      }
   }

   public final void n0(o5.f var1, Object var2) {
      this.p.set(m5.m.a(var1, var2));
   }
}
