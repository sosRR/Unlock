package d2;

public final class f {
   private final Object a;
   private final String b;

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof f)) {
         return false;
      } else {
         f var2 = (f)var1;
         return this.a == var2.a && this.b.equals(var2.b);
      }
   }

   public int hashCode() {
      return System.identityHashCode(this.a) * 31 + this.b.hashCode();
   }
}
