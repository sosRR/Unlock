package e6;

final class h0 implements p0 {
   private final boolean m;

   public h0(boolean var1) {
      this.m = var1;
   }

   public boolean a() {
      return this.m;
   }

   public b1 b() {
      return null;
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("Empty{");
      String var1;
      if (this.a()) {
         var1 = "Active";
      } else {
         var1 = "New";
      }

      var2.append(var1);
      var2.append('}');
      return var2.toString();
   }
}
