package p0;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import x5.g;

public final class d {
   public static final a d = new a((x5.e)null);
   private final e a;
   private final c b;
   private boolean c;

   private d(e var1) {
      this.a = var1;
      this.b = new c();
   }

   // $FF: synthetic method
   public d(e var1, x5.e var2) {
      this(var1);
   }

   public static final d a(e var0) {
      return d.a(var0);
   }

   public final c b() {
      return this.b;
   }

   public final void c() {
      h var2 = this.a.a();
      g.d(var2, "owner.lifecycle");
      boolean var1;
      if (var2.b() == androidx.lifecycle.h.c.n) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         var2.a(new Recreator(this.a));
         this.b.e(var2);
         this.c = true;
      } else {
         throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
      }
   }

   public final void d(Bundle var1) {
      if (!this.c) {
         this.c();
      }

      h var2 = this.a.a();
      g.d(var2, "owner.lifecycle");
      if (var2.b().d(androidx.lifecycle.h.c.p) ^ true) {
         this.b.f(var1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("performRestore cannot be called when owner is ");
         var3.append(var2.b());
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public final void e(Bundle var1) {
      g.e(var1, "outBundle");
      this.b.g(var1);
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }

      public final d a(e var1) {
         g.e(var1, "owner");
         return new d(var1, (x5.e)null);
      }
   }
}
