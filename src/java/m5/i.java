package m5;

import java.io.Serializable;

public final class i implements Serializable {
   private final Object m;
   private final Object n;

   public i(Object var1, Object var2) {
      this.m = var1;
      this.n = var2;
   }

   public final Object a() {
      return this.m;
   }

   public final Object b() {
      return this.n;
   }

   public final Object c() {
      return this.m;
   }

   public final Object d() {
      return this.n;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof i)) {
         return false;
      } else {
         i var2 = (i)var1;
         if (!x5.g.a(this.m, var2.m)) {
            return false;
         } else {
            return x5.g.a(this.n, var2.n);
         }
      }
   }

   public int hashCode() {
      Object var3 = this.m;
      int var2 = 0;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      var3 = this.n;
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return var1 * 31 + var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      var1.append(this.m);
      var1.append(", ");
      var1.append(this.n);
      var1.append(')');
      return var1.toString();
   }
}
