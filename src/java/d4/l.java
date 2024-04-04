package d4;

final class l extends a0.e.d.a {
   private final a0.e.d.a.b a;
   private final b0 b;
   private final b0 c;
   private final Boolean d;
   private final int e;

   private l(a0.e.d.a.b var1, b0 var2, b0 var3, Boolean var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   l(a0.e.d.a.b var1, b0 var2, b0 var3, Boolean var4, int var5, l$a var6) {
      this(var1, var2, var3, var4, var5);
   }

   public Boolean b() {
      return this.d;
   }

   public b0 c() {
      return this.b;
   }

   public a0.e.d.a.b d() {
      return this.a;
   }

   public b0 e() {
      return this.c;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a)) {
         return false;
      } else {
         a0.e.d.a var4 = (a0.e.d.a)var1;
         if (this.a.equals(var4.d())) {
            label50: {
               b0 var3 = this.b;
               if (var3 == null) {
                  if (var4.c() != null) {
                     break label50;
                  }
               } else if (!var3.equals(var4.c())) {
                  break label50;
               }

               var3 = this.c;
               if (var3 == null) {
                  if (var4.e() != null) {
                     break label50;
                  }
               } else if (!var3.equals(var4.e())) {
                  break label50;
               }

               Boolean var5 = this.d;
               if (var5 == null) {
                  if (var4.b() != null) {
                     break label50;
                  }
               } else if (!var5.equals(var4.b())) {
                  break label50;
               }

               if (this.e == var4.f()) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int f() {
      return this.e;
   }

   public a0.e.d.a.a g() {
      return new b(this, (l$a)null);
   }

   public int hashCode() {
      int var4 = this.a.hashCode();
      b0 var5 = this.b;
      int var3 = 0;
      int var1;
      if (var5 == null) {
         var1 = 0;
      } else {
         var1 = var5.hashCode();
      }

      var5 = this.c;
      int var2;
      if (var5 == null) {
         var2 = 0;
      } else {
         var2 = var5.hashCode();
      }

      Boolean var6 = this.d;
      if (var6 != null) {
         var3 = var6.hashCode();
      }

      return ((((var4 ^ 1000003) * 1000003 ^ var1) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ this.e;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Application{execution=");
      var1.append(this.a);
      var1.append(", customAttributes=");
      var1.append(this.b);
      var1.append(", internalKeys=");
      var1.append(this.c);
      var1.append(", background=");
      var1.append(this.d);
      var1.append(", uiOrientation=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.a {
      private a0.e.d.a.b a;
      private b0 b;
      private b0 c;
      private Boolean d;
      private Integer e;

      b() {
      }

      private b(a0.e.d.a var1) {
         this.a = var1.d();
         this.b = var1.c();
         this.c = var1.e();
         this.d = var1.b();
         this.e = var1.f();
      }

      // $FF: synthetic method
      b(a0.e.d.a var1, l$a var2) {
         this(var1);
      }

      public a0.e.d.a a() {
         a0.e.d.a.b var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" execution");
            var1 = var3.toString();
         }

         String var4 = var1;
         if (this.e == null) {
            StringBuilder var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" uiOrientation");
            var4 = var5.toString();
         }

         if (var4.isEmpty()) {
            return new l(this.a, this.b, this.c, this.d, this.e, (l$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var4);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.d.a.a b(Boolean var1) {
         this.d = var1;
         return this;
      }

      public a0.e.d.a.a c(b0 var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.a.a d(a0.e.d.a.b var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null execution");
         }
      }

      public a0.e.d.a.a e(b0 var1) {
         this.c = var1;
         return this;
      }

      public a0.e.d.a.a f(int var1) {
         this.e = var1;
         return this;
      }
   }
}
