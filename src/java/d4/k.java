package d4;

final class k extends a0.e.d {
   private final long a;
   private final String b;
   private final a0.e.d.a c;
   private final a0.e.d.c d;
   private final a0.e.d.d e;

   private k(long var1, String var3, a0.e.d.a var4, a0.e.d.c var5, a0.e.d.d var6) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   // $FF: synthetic method
   k(long var1, String var3, a0.e.d.a var4, a0.e.d.c var5, a0.e.d.d var6, k$a var7) {
      this(var1, var3, var4, var5, var6);
   }

   public a0.e.d.a b() {
      return this.c;
   }

   public a0.e.d.c c() {
      return this.d;
   }

   public a0.e.d.d d() {
      return this.e;
   }

   public long e() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d)) {
         return false;
      } else {
         a0.e.d var4 = (a0.e.d)var1;
         if (this.a == var4.e() && this.b.equals(var4.f()) && this.c.equals(var4.b()) && this.d.equals(var4.c())) {
            a0.e.d.d var3 = this.e;
            if (var3 == null) {
               if (var4.d() == null) {
                  return var2;
               }
            } else if (var3.equals(var4.d())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public String f() {
      return this.b;
   }

   public a0.e.d.b g() {
      return new b(this, (k$a)null);
   }

   public int hashCode() {
      long var6 = this.a;
      int var3 = (int)(var6 ^ var6 >>> 32);
      int var4 = this.b.hashCode();
      int var5 = this.c.hashCode();
      int var2 = this.d.hashCode();
      a0.e.d.d var8 = this.e;
      int var1;
      if (var8 == null) {
         var1 = 0;
      } else {
         var1 = var8.hashCode();
      }

      return ((((var3 ^ 1000003) * 1000003 ^ var4) * 1000003 ^ var5) * 1000003 ^ var2) * 1000003 ^ var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Event{timestamp=");
      var1.append(this.a);
      var1.append(", type=");
      var1.append(this.b);
      var1.append(", app=");
      var1.append(this.c);
      var1.append(", device=");
      var1.append(this.d);
      var1.append(", log=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.b {
      private Long a;
      private String b;
      private a0.e.d.a c;
      private a0.e.d.c d;
      private a0.e.d.d e;

      b() {
      }

      private b(a0.e.d var1) {
         this.a = var1.e();
         this.b = var1.f();
         this.c = var1.b();
         this.d = var1.c();
         this.e = var1.d();
      }

      // $FF: synthetic method
      b(a0.e.d var1, k$a var2) {
         this(var1);
      }

      public a0.e.d a() {
         Long var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" timestamp");
            var2 = var3.toString();
         }

         String var4 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" type");
            var4 = var3.toString();
         }

         var2 = var4;
         StringBuilder var5;
         if (this.c == null) {
            var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" app");
            var2 = var5.toString();
         }

         var4 = var2;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" device");
            var4 = var3.toString();
         }

         if (var4.isEmpty()) {
            return new k(this.a, this.b, this.c, this.d, this.e, (k$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var4);
            throw new IllegalStateException(var5.toString());
         }
      }

      public a0.e.d.b b(a0.e.d.a var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null app");
         }
      }

      public a0.e.d.b c(a0.e.d.c var1) {
         if (var1 != null) {
            this.d = var1;
            return this;
         } else {
            throw new NullPointerException("Null device");
         }
      }

      public a0.e.d.b d(a0.e.d.d var1) {
         this.e = var1;
         return this;
      }

      public a0.e.d.b e(long var1) {
         this.a = var1;
         return this;
      }

      public a0.e.d.b f(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null type");
         }
      }
   }
}
