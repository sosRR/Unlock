package d4;

final class u extends a0.e.e {
   private final int a;
   private final String b;
   private final String c;
   private final boolean d;

   private u(int var1, String var2, String var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   // $FF: synthetic method
   u(int var1, String var2, String var3, boolean var4, u$a var5) {
      this(var1, var2, var3, var4);
   }

   public String b() {
      return this.c;
   }

   public int c() {
      return this.a;
   }

   public String d() {
      return this.b;
   }

   public boolean e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.e)) {
         return false;
      } else {
         a0.e.e var3 = (a0.e.e)var1;
         if (this.a != var3.c() || !this.b.equals(var3.d()) || !this.c.equals(var3.b()) || this.d != var3.e()) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      int var2 = this.a;
      int var4 = this.b.hashCode();
      int var3 = this.c.hashCode();
      short var1;
      if (this.d) {
         var1 = 1231;
      } else {
         var1 = 1237;
      }

      return (((var2 ^ 1000003) * 1000003 ^ var4) * 1000003 ^ var3) * 1000003 ^ var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OperatingSystem{platform=");
      var1.append(this.a);
      var1.append(", version=");
      var1.append(this.b);
      var1.append(", buildVersion=");
      var1.append(this.c);
      var1.append(", jailbroken=");
      var1.append(this.d);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.e.a {
      private Integer a;
      private String b;
      private String c;
      private Boolean d;

      public a0.e.e a() {
         Integer var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" platform");
            var1 = var3.toString();
         }

         String var4 = var1;
         StringBuilder var5;
         if (this.b == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" version");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.c == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" buildVersion");
            var1 = var3.toString();
         }

         var4 = var1;
         if (this.d == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" jailbroken");
            var4 = var5.toString();
         }

         if (var4.isEmpty()) {
            return new u(this.a, this.b, this.c, this.d, (u$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var4);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.e.a b(String var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null buildVersion");
         }
      }

      public a0.e.e.a c(boolean var1) {
         this.d = var1;
         return this;
      }

      public a0.e.e.a d(int var1) {
         this.a = var1;
         return this;
      }

      public a0.e.e.a e(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null version");
         }
      }
   }
}
