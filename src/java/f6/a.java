package f6;

import android.os.Handler;
import android.os.Looper;
import e6.f0;
import e6.v0;
import java.util.concurrent.CancellationException;
import o5.f;
import x5.e;
import x5.g;

public final class a extends f6.b {
   private volatile f6.a _immediate;
   private final Handler n;
   private final String o;
   private final boolean p;
   private final f6.a q;

   public a(Handler var1, String var2) {
      this(var1, var2, false);
   }

   // $FF: synthetic method
   public a(Handler var1, String var2, int var3, e var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      this(var1, var2);
   }

   private a(Handler var1, String var2, boolean var3) {
      f6.a var4 = null;
      super((e)null);
      this.n = var1;
      this.o = var2;
      this.p = var3;
      if (var3) {
         var4 = this;
      }

      this._immediate = var4;
      f6.a var5 = this._immediate;
      var4 = var5;
      if (var5 == null) {
         var4 = new f6.a(var1, var2, true);
         this._immediate = var4;
      }

      this.q = var4;
   }

   private final void S(f var1, Runnable var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("The task was rejected, the handler underlying the dispatcher '");
      var3.append(this);
      var3.append("' was closed");
      v0.a(var1, new CancellationException(var3.toString()));
      f0.a().N(var1, var2);
   }

   public void N(f var1, Runnable var2) {
      if (!this.n.post(var2)) {
         this.S(var1, var2);
      }

   }

   public boolean O(f var1) {
      boolean var2;
      if (this.p && g.a(Looper.myLooper(), this.n.getLooper())) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public f6.a T() {
      return this.q;
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof f6.a && ((f6.a)var1).n == this.n) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int hashCode() {
      return System.identityHashCode(this.n);
   }

   public String toString() {
      String var1 = this.R();
      String var2 = var1;
      if (var1 == null) {
         var2 = this.o;
         var1 = var2;
         if (var2 == null) {
            var1 = this.n.toString();
         }

         var2 = var1;
         if (this.p) {
            var2 = g.j(var1, ".immediate");
         }
      }

      return var2;
   }
}
