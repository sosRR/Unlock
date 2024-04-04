package d4;

final class q extends a0.e.d.a.b.e {
   private final String a;
   private final int b;
   private final b0 c;

   private q(String var1, int var2, b0 var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   q(String var1, int var2, b0 var3, q$a var4) {
      this(var1, var2, var3);
   }

   public b0 b() {
      return this.c;
   }

   public int c() {
      return this.b;
   }

   public String d() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b.e)) {
         return false;
      } else {
         a0.e.d.a.b.e var3 = (a0.e.d.a.b.e)var1;
         if (!this.a.equals(var3.d()) || this.b != var3.c() || !this.c.equals(var3.b())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Thread{name=");
      var1.append(this.a);
      var1.append(", importance=");
      var1.append(this.b);
      var1.append(", frames=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.e.a {
      private String a;
      private Integer b;
      private b0 c;

      public a0.e.d.a.b.e a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" name");
            var1 = var3.toString();
         }

         var2 = var1;
         StringBuilder var4;
         if (this.b == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" importance");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.c == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" frames");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new q(this.a, this.b, this.c, (q$a)null);
         } else {
            var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.e.d.a.b.e.a b(b0 var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null frames");
         }
      }

      public a0.e.d.a.b.e.a c(int var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.a.b.e.a d(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null name");
         }
      }
   }
}
