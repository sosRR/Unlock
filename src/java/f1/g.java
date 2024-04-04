package f1;

public class g {
   public final String a;
   public final int b;

   public g(String var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof g)) {
         return false;
      } else {
         g var2 = (g)var1;
         return this.b != var2.b ? false : this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return this.a.hashCode() * 31 + this.b;
   }
}
