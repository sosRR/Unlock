package d2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

public final class y extends w2.d implements com.google.android.gms.common.api.c.a, com.google.android.gms.common.api.c.b {
   private static final com.google.android.gms.common.api.a.a h;
   private final Context a;
   private final Handler b;
   private final com.google.android.gms.common.api.a.a c;
   private final Set d;
   private final e2.d e;
   private v2.f f;
   private x g;

   static {
      h = v2.e.c;
   }

   public y(Context var1, Handler var2, e2.d var3) {
      com.google.android.gms.common.api.a.a var4 = h;
      super();
      this.a = var1;
      this.b = var2;
      this.e = (e2.d)e2.n.j(var3, "ClientSettings must not be null");
      this.d = var3.e();
      this.c = var4;
   }

   public final void f(b2.b var1) {
      this.g.b(var1);
   }

   public final void h(int var1) {
      this.f.m();
   }

   public final void m(Bundle var1) {
      this.f.c(this);
   }

   public final void o0(x var1) {
      v2.f var2 = this.f;
      if (var2 != null) {
         var2.m();
      }

      this.e.i(System.identityHashCode(this));
      com.google.android.gms.common.api.a.a var5 = this.c;
      Context var3 = this.a;
      Looper var4 = this.b.getLooper();
      e2.d var7 = this.e;
      this.f = var5.a(var3, var4, var7, var7.f(), this, this);
      this.g = var1;
      Set var6 = this.d;
      if (var6 != null && !var6.isEmpty()) {
         this.f.o();
      } else {
         this.b.post(new v(this));
      }
   }

   public final void p0() {
      v2.f var1 = this.f;
      if (var1 != null) {
         var1.m();
      }

   }

   public final void x(w2.l var1) {
      this.b.post(new w(this, var1));
   }
}
