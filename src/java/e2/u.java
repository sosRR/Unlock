package e2;

import android.os.Bundle;

public class u implements com.google.android.gms.common.api.a.d {
   public static final u b = c().a();
   private final String a;

   // $FF: synthetic method
   u(String var1, x var2) {
      this.a = var1;
   }

   public static a c() {
      return new a((w)null);
   }

   public final Bundle d() {
      Bundle var1 = new Bundle();
      String var2 = this.a;
      if (var2 != null) {
         var1.putString("api", var2);
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof u)) {
         return false;
      } else {
         u var2 = (u)var1;
         return m.a(this.a, var2.a);
      }
   }

   public final int hashCode() {
      return m.b(this.a);
   }

   public static class a {
      private String a;

      // $FF: synthetic method
      a(w var1) {
      }

      public u a() {
         return new u(this.a, (x)null);
      }
   }
}
