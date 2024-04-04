package d4;

final class t extends a0.e.d.d {
   private final String a;

   private t(String var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   t(String var1, t$a var2) {
      this(var1);
   }

   public String b() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof a0.e.d.d) {
         a0.e.d.d var2 = (a0.e.d.d)var1;
         return this.a.equals(var2.b());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ 1000003;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Log{content=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.d.a {
      private String a;

      public a0.e.d.d a() {
         String var2 = this.a;
         String var1 = "";
         if (var2 == null) {
            StringBuilder var3 = new StringBuilder();
            var3.append("");
            var3.append(" content");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new t(this.a, (t$a)null);
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.e.d.d.a b(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null content");
         }
      }
   }
}
