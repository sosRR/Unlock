package e2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class g extends e2.c implements com.google.android.gms.common.api.a.f {
   private final d F;
   private final Set G;
   private final Account H;

   @Deprecated
   protected g(Context var1, Looper var2, int var3, d var4, com.google.android.gms.common.api.c.a var5, com.google.android.gms.common.api.c.b var6) {
      this(var1, var2, var3, var4, (d2.c)var5, (d2.h)var6);
   }

   protected g(Context var1, Looper var2, int var3, d var4, d2.c var5, d2.h var6) {
      this(var1, var2, e2.h.b(var1), b2.e.m(), var3, var4, (d2.c)e2.n.i(var5), (d2.h)e2.n.i(var6));
   }

   protected g(Context var1, Looper var2, h var3, b2.e var4, int var5, d var6, d2.c var7, d2.h var8) {
      d0 var9;
      if (var7 == null) {
         var9 = null;
      } else {
         var9 = new d0(var7);
      }

      e0 var10;
      if (var8 == null) {
         var10 = null;
      } else {
         var10 = new e0(var8);
      }

      super(var1, var2, var3, var4, var5, var9, var10, var6.h());
      this.F = var6;
      this.H = var6.a();
      this.G = this.k0(var6.c());
   }

   private final Set k0(Set var1) {
      Set var3 = this.j0(var1);
      Iterator var2 = var3.iterator();

      do {
         if (!var2.hasNext()) {
            return var3;
         }
      } while(var1.contains((Scope)var2.next()));

      throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
   }

   protected final Set C() {
      return this.G;
   }

   public Set b() {
      Set var1;
      if (this.n()) {
         var1 = this.G;
      } else {
         var1 = Collections.emptySet();
      }

      return var1;
   }

   protected Set j0(Set var1) {
      return var1;
   }

   public final Account u() {
      return this.H;
   }

   protected final Executor w() {
      return null;
   }
}
