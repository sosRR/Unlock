package d4;

final class s extends a0.e.d.c {
   private final Double a;
   private final int b;
   private final boolean c;
   private final int d;
   private final long e;
   private final long f;

   private s(Double var1, int var2, boolean var3, int var4, long var5, long var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var7;
   }

   // $FF: synthetic method
   s(Double var1, int var2, boolean var3, int var4, long var5, long var7, s$a var9) {
      this(var1, var2, var3, var4, var5, var7);
   }

   public Double b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public long d() {
      return this.f;
   }

   public int e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.c)) {
         return false;
      } else {
         label31: {
            a0.e.d.c var4 = (a0.e.d.c)var1;
            Double var3 = this.a;
            if (var3 == null) {
               if (var4.b() != null) {
                  break label31;
               }
            } else if (!var3.equals(var4.b())) {
               break label31;
            }

            if (this.b == var4.c() && this.c == var4.g() && this.d == var4.e() && this.e == var4.f() && this.f == var4.d()) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public long f() {
      return this.e;
   }

   public boolean g() {
      return this.c;
   }

   public int hashCode() {
      Double var8 = this.a;
      int var1;
      if (var8 == null) {
         var1 = 0;
      } else {
         var1 = var8.hashCode();
      }

      int var3 = this.b;
      short var2;
      if (this.c) {
         var2 = 1231;
      } else {
         var2 = 1237;
      }

      int var5 = this.d;
      long var6 = this.e;
      int var4 = (int)(var6 ^ var6 >>> 32);
      var6 = this.f;
      return (((((var1 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var2) * 1000003 ^ var5) * 1000003 ^ var4) * 1000003 ^ (int)(var6 ^ var6 >>> 32);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Device{batteryLevel=");
      var1.append(this.a);
      var1.append(", batteryVelocity=");
      var1.append(this.b);
      var1.append(", proximityOn=");
      var1.append(this.c);
      var1.append(", orientation=");
      var1.append(this.d);
      var1.append(", ramUsed=");
      var1.append(this.e);
      var1.append(", diskUsed=");
      var1.append(this.f);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.c.a {
      private Double a;
      private Integer b;
      private Boolean c;
      private Integer d;
      private Long e;
      private Long f;

      public a0.e.d.c a() {
         Integer var2 = this.b;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" batteryVelocity");
            var1 = var3.toString();
         }

         String var4 = var1;
         StringBuilder var5;
         if (this.c == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" proximityOn");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" orientation");
            var1 = var3.toString();
         }

         var4 = var1;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" ramUsed");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.f == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" diskUsed");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new s(this.a, this.b, this.c, this.d, this.e, this.f, (s$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      public a0.e.d.c.a b(Double var1) {
         this.a = var1;
         return this;
      }

      public a0.e.d.c.a c(int var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.c.a d(long var1) {
         this.f = var1;
         return this;
      }

      public a0.e.d.c.a e(int var1) {
         this.d = var1;
         return this;
      }

      public a0.e.d.c.a f(boolean var1) {
         this.c = var1;
         return this;
      }

      public a0.e.d.c.a g(long var1) {
         this.e = var1;
         return this;
      }
   }
}
