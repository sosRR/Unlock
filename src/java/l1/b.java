package l1;

final class b extends g {
   private final g.a a;
   private final long b;

   b(g.a var1, long var2) {
      if (var1 != null) {
         this.a = var1;
         this.b = var2;
      } else {
         throw new NullPointerException("Null status");
      }
   }

   public long b() {
      return this.b;
   }

   public g.a c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof g)) {
         return false;
      } else {
         g var3 = (g)var1;
         if (!this.a.equals(var3.c()) || this.b != var3.b()) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      long var2 = this.b;
      return (var1 ^ 1000003) * 1000003 ^ (int)(var2 ^ var2 >>> 32);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BackendResponse{status=");
      var1.append(this.a);
      var1.append(", nextRequestWaitMillis=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }
}
