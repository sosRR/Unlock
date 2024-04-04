package e6;

final class m {
   public final Object a;
   public final e b;
   public final w5.l c;
   public final Object d;
   public final Throwable e;

   public m(Object var1, e var2, w5.l var3, Object var4, Throwable var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   public m(Object var1, e var2, w5.l var3, Object var4, Throwable var5, int var6, x5.e var7) {
      if ((var6 & 2) != 0) {
         var2 = null;
      }

      if ((var6 & 4) != 0) {
         var3 = null;
      }

      if ((var6 & 8) != 0) {
         var4 = null;
      }

      if ((var6 & 16) != 0) {
         var5 = null;
      }

      this(var1, var2, var3, var4, var5);
   }

   // $FF: synthetic method
   public static m b(m var0, Object var1, e var2, w5.l var3, Object var4, Throwable var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var1 = var0.a;
      }

      if ((var6 & 2) != 0) {
         var2 = var0.b;
      }

      if ((var6 & 4) != 0) {
         var3 = var0.c;
      }

      if ((var6 & 8) != 0) {
         var4 = var0.d;
      }

      if ((var6 & 16) != 0) {
         var5 = var0.e;
      }

      return var0.a(var1, var2, var3, var4, var5);
   }

   public final m a(Object var1, e var2, w5.l var3, Object var4, Throwable var5) {
      return new m(var1, var2, var3, var4, var5);
   }

   public final boolean c() {
      boolean var1;
      if (this.e != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final void d(h var1, Throwable var2) {
      e var3 = this.b;
      if (var3 != null) {
         var1.k(var3, var2);
      }

      w5.l var4 = this.c;
      if (var4 != null) {
         var1.l(var4, var2);
      }

   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof m)) {
         return false;
      } else {
         m var2 = (m)var1;
         if (!x5.g.a(this.a, var2.a)) {
            return false;
         } else if (!x5.g.a(this.b, var2.b)) {
            return false;
         } else if (!x5.g.a(this.c, var2.c)) {
            return false;
         } else if (!x5.g.a(this.d, var2.d)) {
            return false;
         } else {
            return x5.g.a(this.e, var2.e);
         }
      }
   }

   public int hashCode() {
      Object var6 = this.a;
      int var5 = 0;
      int var1;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.hashCode();
      }

      e var7 = this.b;
      int var2;
      if (var7 == null) {
         var2 = 0;
      } else {
         var2 = var7.hashCode();
      }

      w5.l var8 = this.c;
      int var3;
      if (var8 == null) {
         var3 = 0;
      } else {
         var3 = var8.hashCode();
      }

      var6 = this.d;
      int var4;
      if (var6 == null) {
         var4 = 0;
      } else {
         var4 = var6.hashCode();
      }

      Throwable var9 = this.e;
      if (var9 != null) {
         var5 = var9.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CompletedContinuation(result=");
      var1.append(this.a);
      var1.append(", cancelHandler=");
      var1.append(this.b);
      var1.append(", onCancellation=");
      var1.append(this.c);
      var1.append(", idempotentResume=");
      var1.append(this.d);
      var1.append(", cancelCause=");
      var1.append(this.e);
      var1.append(')');
      return var1.toString();
   }
}
