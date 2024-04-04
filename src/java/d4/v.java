package d4;

final class v extends a0.e.f {
   private final String a;

   private v(String var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   v(String var1, v$a var2) {
      this(var1);
   }

   public String b() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof a0.e.f) {
         a0.e.f var2 = (a0.e.f)var1;
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
      var1.append("User{identifier=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.f.a {
      private String a;

      public a0.e.f a() {
         String var2 = this.a;
         String var1 = "";
         if (var2 == null) {
            StringBuilder var3 = new StringBuilder();
            var3.append("");
            var3.append(" identifier");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new v(this.a, (v$a)null);
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.e.f.a b(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null identifier");
         }
      }
   }
}
