package d4;

final class m extends a0.e.d.a.b {
   private final b0 a;
   private final a0.e.d.a.b.c b;
   private final a0.a c;
   private final a0.e.d.a.b.d d;
   private final b0 e;

   private m(b0 var1, a0.e.d.a.b.c var2, a0.a var3, a0.e.d.a.b.d var4, b0 var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   m(b0 var1, a0.e.d.a.b.c var2, a0.a var3, a0.e.d.a.b.d var4, b0 var5, m$a var6) {
      this(var1, var2, var3, var4, var5);
   }

   public a0.a b() {
      return this.c;
   }

   public b0 c() {
      return this.e;
   }

   public a0.e.d.a.b.c d() {
      return this.b;
   }

   public a0.e.d.a.b.d e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b)) {
         return false;
      } else {
         label50: {
            a0.e.d.a.b var4 = (a0.e.d.a.b)var1;
            b0 var3 = this.a;
            if (var3 == null) {
               if (var4.f() != null) {
                  break label50;
               }
            } else if (!var3.equals(var4.f())) {
               break label50;
            }

            a0.e.d.a.b.c var5 = this.b;
            if (var5 == null) {
               if (var4.d() != null) {
                  break label50;
               }
            } else if (!var5.equals(var4.d())) {
               break label50;
            }

            a0.a var6 = this.c;
            if (var6 == null) {
               if (var4.b() != null) {
                  break label50;
               }
            } else if (!var6.equals(var4.b())) {
               break label50;
            }

            if (this.d.equals(var4.e()) && this.e.equals(var4.c())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public b0 f() {
      return this.a;
   }

   public int hashCode() {
      b0 var4 = this.a;
      int var3 = 0;
      int var1;
      if (var4 == null) {
         var1 = 0;
      } else {
         var1 = var4.hashCode();
      }

      a0.e.d.a.b.c var5 = this.b;
      int var2;
      if (var5 == null) {
         var2 = 0;
      } else {
         var2 = var5.hashCode();
      }

      a0.a var6 = this.c;
      if (var6 != null) {
         var3 = var6.hashCode();
      }

      return ((((var1 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Execution{threads=");
      var1.append(this.a);
      var1.append(", exception=");
      var1.append(this.b);
      var1.append(", appExitInfo=");
      var1.append(this.c);
      var1.append(", signal=");
      var1.append(this.d);
      var1.append(", binaries=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.b {
      private b0 a;
      private a0.e.d.a.b.c b;
      private a0.a c;
      private a0.e.d.a.b.d d;
      private b0 e;

      public a0.e.d.a.b a() {
         a0.e.d.a.b.d var2 = this.d;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" signal");
            var1 = var3.toString();
         }

         String var4 = var1;
         if (this.e == null) {
            StringBuilder var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" binaries");
            var4 = var5.toString();
         }

         if (var4.isEmpty()) {
            return new m(this.a, this.b, this.c, this.d, this.e, (m$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var4);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.d.a.b.b b(a0.a var1) {
         this.c = var1;
         return this;
      }

      public a0.e.d.a.b.b c(b0 var1) {
         if (var1 != null) {
            this.e = var1;
            return this;
         } else {
            throw new NullPointerException("Null binaries");
         }
      }

      public a0.e.d.a.b.b d(a0.e.d.a.b.c var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.a.b.b e(a0.e.d.a.b.d var1) {
         if (var1 != null) {
            this.d = var1;
            return this;
         } else {
            throw new NullPointerException("Null signal");
         }
      }

      public a0.e.d.a.b.b f(b0 var1) {
         this.a = var1;
         return this;
      }
   }
}
