package d4;

final class c extends a0.a {
   private final int a;
   private final String b;
   private final int c;
   private final int d;
   private final long e;
   private final long f;
   private final long g;
   private final String h;

   private c(int var1, String var2, int var3, int var4, long var5, long var7, long var9, String var11) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var7;
      this.g = var9;
      this.h = var11;
   }

   // $FF: synthetic method
   c(int var1, String var2, int var3, int var4, long var5, long var7, long var9, String var11, c$a var12) {
      this(var1, var2, var3, var4, var5, var7, var9, var11);
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.a;
   }

   public String d() {
      return this.b;
   }

   public long e() {
      return this.e;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.a)) {
         return false;
      } else {
         a0.a var4 = (a0.a)var1;
         if (this.a == var4.c() && this.b.equals(var4.d()) && this.c == var4.f() && this.d == var4.b() && this.e == var4.e() && this.f == var4.g() && this.g == var4.h()) {
            String var3 = this.h;
            if (var3 == null) {
               if (var4.i() == null) {
                  return var2;
               }
            } else if (var3.equals(var4.i())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int f() {
      return this.c;
   }

   public long g() {
      return this.f;
   }

   public long h() {
      return this.g;
   }

   public int hashCode() {
      int var4 = this.a;
      int var7 = this.b.hashCode();
      int var8 = this.c;
      int var5 = this.d;
      long var9 = this.e;
      int var6 = (int)(var9 ^ var9 >>> 32);
      var9 = this.f;
      int var2 = (int)(var9 ^ var9 >>> 32);
      var9 = this.g;
      int var3 = (int)(var9 ^ var9 >>> 32);
      String var11 = this.h;
      int var1;
      if (var11 == null) {
         var1 = 0;
      } else {
         var1 = var11.hashCode();
      }

      return (((((((var4 ^ 1000003) * 1000003 ^ var7) * 1000003 ^ var8) * 1000003 ^ var5) * 1000003 ^ var6) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var1;
   }

   public String i() {
      return this.h;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ApplicationExitInfo{pid=");
      var1.append(this.a);
      var1.append(", processName=");
      var1.append(this.b);
      var1.append(", reasonCode=");
      var1.append(this.c);
      var1.append(", importance=");
      var1.append(this.d);
      var1.append(", pss=");
      var1.append(this.e);
      var1.append(", rss=");
      var1.append(this.f);
      var1.append(", timestamp=");
      var1.append(this.g);
      var1.append(", traceFile=");
      var1.append(this.h);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.a.a {
      private Integer a;
      private String b;
      private Integer c;
      private Integer d;
      private Long e;
      private Long f;
      private Long g;
      private String h;

      public a0.a a() {
         Integer var1 = this.a;
         String var2 = "";
         StringBuilder var4;
         if (var1 == null) {
            var4 = new StringBuilder();
            var4.append("");
            var4.append(" pid");
            var2 = var4.toString();
         }

         String var5 = var2;
         if (this.b == null) {
            var4 = new StringBuilder();
            var4.append(var2);
            var4.append(" processName");
            var5 = var4.toString();
         }

         String var3 = var5;
         StringBuilder var6;
         if (this.c == null) {
            var6 = new StringBuilder();
            var6.append(var5);
            var6.append(" reasonCode");
            var3 = var6.toString();
         }

         var2 = var3;
         if (this.d == null) {
            var4 = new StringBuilder();
            var4.append(var3);
            var4.append(" importance");
            var2 = var4.toString();
         }

         var5 = var2;
         if (this.e == null) {
            var4 = new StringBuilder();
            var4.append(var2);
            var4.append(" pss");
            var5 = var4.toString();
         }

         var2 = var5;
         if (this.f == null) {
            var6 = new StringBuilder();
            var6.append(var5);
            var6.append(" rss");
            var2 = var6.toString();
         }

         var5 = var2;
         if (this.g == null) {
            var4 = new StringBuilder();
            var4.append(var2);
            var4.append(" timestamp");
            var5 = var4.toString();
         }

         if (var5.isEmpty()) {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (c$a)null);
         } else {
            var6 = new StringBuilder();
            var6.append("Missing required properties:");
            var6.append(var5);
            throw new IllegalStateException(var6.toString());
         }
      }

      public a0.a.a b(int var1) {
         this.d = var1;
         return this;
      }

      public a0.a.a c(int var1) {
         this.a = var1;
         return this;
      }

      public a0.a.a d(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null processName");
         }
      }

      public a0.a.a e(long var1) {
         this.e = var1;
         return this;
      }

      public a0.a.a f(int var1) {
         this.c = var1;
         return this;
      }

      public a0.a.a g(long var1) {
         this.f = var1;
         return this;
      }

      public a0.a.a h(long var1) {
         this.g = var1;
         return this;
      }

      public a0.a.a i(String var1) {
         this.h = var1;
         return this;
      }
   }
}
