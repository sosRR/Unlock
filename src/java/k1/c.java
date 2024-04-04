package k1;

final class c extends n {
   private final o a;
   private final String b;
   private final i1.c c;
   private final i1.e d;
   private final i1.b e;

   private c(o var1, String var2, i1.c var3, i1.e var4, i1.b var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   c(o var1, String var2, i1.c var3, i1.e var4, i1.b var5, c$a var6) {
      this(var1, var2, var3, var4, var5);
   }

   public i1.b b() {
      return this.e;
   }

   i1.c c() {
      return this.c;
   }

   i1.e e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof n)) {
         return false;
      } else {
         n var3 = (n)var1;
         if (!this.a.equals(var3.f()) || !this.b.equals(var3.g()) || !this.c.equals(var3.c()) || !this.d.equals(var3.e()) || !this.e.equals(var3.b())) {
            var2 = false;
         }

         return var2;
      }
   }

   public o f() {
      return this.a;
   }

   public String g() {
      return this.b;
   }

   public int hashCode() {
      return ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SendRequest{transportContext=");
      var1.append(this.a);
      var1.append(", transportName=");
      var1.append(this.b);
      var1.append(", event=");
      var1.append(this.c);
      var1.append(", transformer=");
      var1.append(this.d);
      var1.append(", encoding=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends n.a {
      private o a;
      private String b;
      private i1.c c;
      private i1.e d;
      private i1.b e;

      public n a() {
         o var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" transportContext");
            var2 = var3.toString();
         }

         String var4 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" transportName");
            var4 = var3.toString();
         }

         var2 = var4;
         StringBuilder var5;
         if (this.c == null) {
            var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" event");
            var2 = var5.toString();
         }

         var4 = var2;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" transformer");
            var4 = var3.toString();
         }

         var2 = var4;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" encoding");
            var2 = var5.toString();
         }

         if (var2.isEmpty()) {
            return new c(this.a, this.b, this.c, this.d, this.e, (c$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      n.a b(i1.b var1) {
         if (var1 != null) {
            this.e = var1;
            return this;
         } else {
            throw new NullPointerException("Null encoding");
         }
      }

      n.a c(i1.c var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null event");
         }
      }

      n.a d(i1.e var1) {
         if (var1 != null) {
            this.d = var1;
            return this;
         } else {
            throw new NullPointerException("Null transformer");
         }
      }

      public n.a e(o var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null transportContext");
         }
      }

      public n.a f(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null transportName");
         }
      }
   }
}
