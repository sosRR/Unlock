package d4;

final class i extends a0.e.a.b {
   private final String a;

   public String a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof a0.e.a.b) {
         a0.e.a.b var2 = (a0.e.a.b)var1;
         return this.a.equals(var2.a());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ 1000003;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Organization{clsId=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
