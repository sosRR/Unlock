package d4;

final class o extends a0.e.d.a.b.c {
   private final String a;
   private final String b;
   private final b0 c;
   private final a0.e.d.a.b.c d;
   private final int e;

   private o(String var1, String var2, b0 var3, a0.e.d.a.b.c var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   o(String var1, String var2, b0 var3, a0.e.d.a.b.c var4, int var5, o$a var6) {
      this(var1, var2, var3, var4, var5);
   }

   public a0.e.d.a.b.c b() {
      return this.d;
   }

   public b0 c() {
      return this.c;
   }

   public int d() {
      return this.e;
   }

   public String e() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b.c)) {
         return false;
      } else {
         a0.e.d.a.b.c var4 = (a0.e.d.a.b.c)var1;
         if (this.a.equals(var4.f())) {
            label35: {
               String var3 = this.b;
               if (var3 == null) {
                  if (var4.e() != null) {
                     break label35;
                  }
               } else if (!var3.equals(var4.e())) {
                  break label35;
               }

               if (this.c.equals(var4.c())) {
                  label29: {
                     a0.e.d.a.b.c var5 = this.d;
                     if (var5 == null) {
                        if (var4.b() != null) {
                           break label29;
                        }
                     } else if (!var5.equals(var4.b())) {
                        break label29;
                     }

                     if (this.e == var4.d()) {
                        return var2;
                     }
                  }
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public String f() {
      return this.a;
   }

   public int hashCode() {
      int var3 = this.a.hashCode();
      String var5 = this.b;
      int var2 = 0;
      int var1;
      if (var5 == null) {
         var1 = 0;
      } else {
         var1 = var5.hashCode();
      }

      int var4 = this.c.hashCode();
      a0.e.d.a.b.c var6 = this.d;
      if (var6 != null) {
         var2 = var6.hashCode();
      }

      return ((((var3 ^ 1000003) * 1000003 ^ var1) * 1000003 ^ var4) * 1000003 ^ var2) * 1000003 ^ this.e;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Exception{type=");
      var1.append(this.a);
      var1.append(", reason=");
      var1.append(this.b);
      var1.append(", frames=");
      var1.append(this.c);
      var1.append(", causedBy=");
      var1.append(this.d);
      var1.append(", overflowCount=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.c.a {
      private String a;
      private String b;
      private b0 c;
      private a0.e.d.a.b.c d;
      private Integer e;

      public a0.e.d.a.b.c a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" type");
            var1 = var3.toString();
         }

         var2 = var1;
         StringBuilder var4;
         if (this.c == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" frames");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.e == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" overflowCount");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new o(this.a, this.b, this.c, this.d, this.e, (o$a)null);
         } else {
            var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.e.d.a.b.c.a b(a0.e.d.a.b.c var1) {
         this.d = var1;
         return this;
      }

      public a0.e.d.a.b.c.a c(b0 var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null frames");
         }
      }

      public a0.e.d.a.b.c.a d(int var1) {
         this.e = var1;
         return this;
      }

      public a0.e.d.a.b.c.a e(String var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.a.b.c.a f(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null type");
         }
      }
   }
}
