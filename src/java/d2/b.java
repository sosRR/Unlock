package d2;

public final class b {
   private final int a;
   private final com.google.android.gms.common.api.a b;
   private final com.google.android.gms.common.api.a.d c;
   private final String d;

   private b(com.google.android.gms.common.api.a var1, com.google.android.gms.common.api.a.d var2, String var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.a = e2.m.b(var1, var2, var3);
   }

   public static b a(com.google.android.gms.common.api.a var0, com.google.android.gms.common.api.a.d var1, String var2) {
      return new b(var0, var1, var2);
   }

   public final String b() {
      return this.b.b();
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof b)) {
         return false;
      } else {
         b var2 = (b)var1;
         return e2.m.a(this.b, var2.b) && e2.m.a(this.c, var2.c) && e2.m.a(this.d, var2.d);
      }
   }

   public final int hashCode() {
      return this.a;
   }
}
