package d4;

final class p extends a0.e.d.a.b.d {
   private final String a;
   private final String b;
   private final long c;

   private p(String var1, String var2, long var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   p(String var1, String var2, long var3, p$a var5) {
      this(var1, var2, var3);
   }

   public long b() {
      return this.c;
   }

   public String c() {
      return this.b;
   }

   public String d() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b.d)) {
         return false;
      } else {
         a0.e.d.a.b.d var3 = (a0.e.d.a.b.d)var1;
         if (!this.a.equals(var3.d()) || !this.b.equals(var3.c()) || this.c != var3.b()) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      int var1 = this.a.hashCode();
      int var2 = this.b.hashCode();
      long var3 = this.c;
      return ((var1 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ (int)(var3 ^ var3 >>> 32);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Signal{name=");
      var1.append(this.a);
      var1.append(", code=");
      var1.append(this.b);
      var1.append(", address=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.d.a {
      private String a;
      private String b;
      private Long c;

      public a0.e.d.a.b.d a() {
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
            var4.append(" code");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.c == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" address");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new p(this.a, this.b, this.c, (p$a)null);
         } else {
            var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.e.d.a.b.d.a b(long var1) {
         this.c = var1;
         return this;
      }

      public a0.e.d.a.b.d.a c(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null code");
         }
      }

      public a0.e.d.a.b.d.a d(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null name");
         }
      }
   }
}
