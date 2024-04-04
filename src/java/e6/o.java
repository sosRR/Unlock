package e6;

public final class o {
   public final Object a;
   public final w5.l b;

   public o(Object var1, w5.l var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof o)) {
         return false;
      } else {
         o var2 = (o)var1;
         if (!x5.g.a(this.a, var2.a)) {
            return false;
         } else {
            return x5.g.a(this.b, var2.b);
         }
      }
   }

   public int hashCode() {
      Object var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return var1 * 31 + this.b.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CompletedWithCancellation(result=");
      var1.append(this.a);
      var1.append(", onCancellation=");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
