package d4;

final class d extends a0.c {
   private final String a;
   private final String b;

   private d(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   d(String var1, String var2, d$a var3) {
      this(var1, var2);
   }

   public String b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.c)) {
         return false;
      } else {
         a0.c var3 = (a0.c)var1;
         if (!this.a.equals(var3.b()) || !this.b.equals(var3.c())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CustomAttribute{key=");
      var1.append(this.a);
      var1.append(", value=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.c.a {
      private String a;
      private String b;

      public a0.c a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" key");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.b == null) {
            StringBuilder var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" value");
            var2 = var4.toString();
         }

         if (var2.isEmpty()) {
            return new d(this.a, this.b, (d$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.c.a b(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null key");
         }
      }

      public a0.c.a c(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null value");
         }
      }
   }
}
