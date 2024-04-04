package d4;

final class j extends a0.e.c {
   private final int a;
   private final String b;
   private final int c;
   private final long d;
   private final long e;
   private final boolean f;
   private final int g;
   private final String h;
   private final String i;

   private j(int var1, String var2, int var3, long var4, long var6, boolean var8, int var9, String var10, String var11) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var6;
      this.f = var8;
      this.g = var9;
      this.h = var10;
      this.i = var11;
   }

   // $FF: synthetic method
   j(int var1, String var2, int var3, long var4, long var6, boolean var8, int var9, String var10, String var11, j$a var12) {
      this(var1, var2, var3, var4, var6, var8, var9, var10, var11);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.c;
   }

   public long d() {
      return this.e;
   }

   public String e() {
      return this.h;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.c)) {
         return false;
      } else {
         a0.e.c var3 = (a0.e.c)var1;
         if (this.a != var3.b() || !this.b.equals(var3.f()) || this.c != var3.c() || this.d != var3.h() || this.e != var3.d() || this.f != var3.j() || this.g != var3.i() || !this.h.equals(var3.e()) || !this.i.equals(var3.g())) {
            var2 = false;
         }

         return var2;
      }
   }

   public String f() {
      return this.b;
   }

   public String g() {
      return this.i;
   }

   public long h() {
      return this.d;
   }

   public int hashCode() {
      int var6 = this.a;
      int var3 = this.b.hashCode();
      int var5 = this.c;
      long var7 = this.d;
      int var4 = (int)(var7 ^ var7 >>> 32);
      var7 = this.e;
      int var2 = (int)(var7 ^ var7 >>> 32);
      short var1;
      if (this.f) {
         var1 = 1231;
      } else {
         var1 = 1237;
      }

      return ((((((((var6 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var5) * 1000003 ^ var4) * 1000003 ^ var2) * 1000003 ^ var1) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
   }

   public int i() {
      return this.g;
   }

   public boolean j() {
      return this.f;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Device{arch=");
      var1.append(this.a);
      var1.append(", model=");
      var1.append(this.b);
      var1.append(", cores=");
      var1.append(this.c);
      var1.append(", ram=");
      var1.append(this.d);
      var1.append(", diskSpace=");
      var1.append(this.e);
      var1.append(", simulator=");
      var1.append(this.f);
      var1.append(", state=");
      var1.append(this.g);
      var1.append(", manufacturer=");
      var1.append(this.h);
      var1.append(", modelClass=");
      var1.append(this.i);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.c.a {
      private Integer a;
      private String b;
      private Integer c;
      private Long d;
      private Long e;
      private Boolean f;
      private Integer g;
      private String h;
      private String i;

      public a0.e.c a() {
         Integer var2 = this.a;
         String var1 = "";
         StringBuilder var4;
         if (var2 == null) {
            var4 = new StringBuilder();
            var4.append("");
            var4.append(" arch");
            var1 = var4.toString();
         }

         String var3 = var1;
         StringBuilder var5;
         if (this.b == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" model");
            var3 = var5.toString();
         }

         String var6 = var3;
         if (this.c == null) {
            var4 = new StringBuilder();
            var4.append(var3);
            var4.append(" cores");
            var6 = var4.toString();
         }

         var1 = var6;
         if (this.d == null) {
            var4 = new StringBuilder();
            var4.append(var6);
            var4.append(" ram");
            var1 = var4.toString();
         }

         var3 = var1;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" diskSpace");
            var3 = var5.toString();
         }

         var6 = var3;
         if (this.f == null) {
            var4 = new StringBuilder();
            var4.append(var3);
            var4.append(" simulator");
            var6 = var4.toString();
         }

         var1 = var6;
         if (this.g == null) {
            var4 = new StringBuilder();
            var4.append(var6);
            var4.append(" state");
            var1 = var4.toString();
         }

         var6 = var1;
         if (this.h == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" manufacturer");
            var6 = var5.toString();
         }

         var1 = var6;
         if (this.i == null) {
            var4 = new StringBuilder();
            var4.append(var6);
            var4.append(" modelClass");
            var1 = var4.toString();
         }

         if (var1.isEmpty()) {
            return new j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (j$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      public a0.e.c.a b(int var1) {
         this.a = var1;
         return this;
      }

      public a0.e.c.a c(int var1) {
         this.c = var1;
         return this;
      }

      public a0.e.c.a d(long var1) {
         this.e = var1;
         return this;
      }

      public a0.e.c.a e(String var1) {
         if (var1 != null) {
            this.h = var1;
            return this;
         } else {
            throw new NullPointerException("Null manufacturer");
         }
      }

      public a0.e.c.a f(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null model");
         }
      }

      public a0.e.c.a g(String var1) {
         if (var1 != null) {
            this.i = var1;
            return this;
         } else {
            throw new NullPointerException("Null modelClass");
         }
      }

      public a0.e.c.a h(long var1) {
         this.d = var1;
         return this;
      }

      public a0.e.c.a i(boolean var1) {
         this.f = var1;
         return this;
      }

      public a0.e.c.a j(int var1) {
         this.g = var1;
         return this;
      }
   }
}
