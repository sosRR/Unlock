package d4;

final class r extends a0.e.d.a.b.e.b {
   private final long a;
   private final String b;
   private final String c;
   private final long d;
   private final int e;

   private r(long var1, String var3, String var4, long var5, int var7) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var7;
   }

   // $FF: synthetic method
   r(long var1, String var3, String var4, long var5, int var7, r$a var8) {
      this(var1, var3, var4, var5, var7);
   }

   public String b() {
      return this.c;
   }

   public int c() {
      return this.e;
   }

   public long d() {
      return this.d;
   }

   public long e() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b.e.b)) {
         return false;
      } else {
         a0.e.d.a.b.e.b var3 = (a0.e.d.a.b.e.b)var1;
         if (this.a == var3.e() && this.b.equals(var3.f())) {
            label27: {
               String var4 = this.c;
               if (var4 == null) {
                  if (var3.b() != null) {
                     break label27;
                  }
               } else if (!var4.equals(var3.b())) {
                  break label27;
               }

               if (this.d == var3.d() && this.e == var3.c()) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public String f() {
      return this.b;
   }

   public int hashCode() {
      long var4 = this.a;
      int var3 = (int)(var4 ^ var4 >>> 32);
      int var2 = this.b.hashCode();
      String var6 = this.c;
      int var1;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.hashCode();
      }

      var4 = this.d;
      return ((((var3 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ var1) * 1000003 ^ (int)(var4 >>> 32 ^ var4)) * 1000003 ^ this.e;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Frame{pc=");
      var1.append(this.a);
      var1.append(", symbol=");
      var1.append(this.b);
      var1.append(", file=");
      var1.append(this.c);
      var1.append(", offset=");
      var1.append(this.d);
      var1.append(", importance=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.e.b.a {
      private Long a;
      private String b;
      private String c;
      private Long d;
      private Integer e;

      public a0.e.d.a.b.e.b a() {
         Long var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" pc");
            var1 = var3.toString();
         }

         String var4 = var1;
         StringBuilder var5;
         if (this.b == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" symbol");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" offset");
            var1 = var3.toString();
         }

         var4 = var1;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" importance");
            var4 = var5.toString();
         }

         if (var4.isEmpty()) {
            return new r(this.a, this.b, this.c, this.d, this.e, (r$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var4);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.d.a.b.e.b.a b(String var1) {
         this.c = var1;
         return this;
      }

      public a0.e.d.a.b.e.b.a c(int var1) {
         this.e = var1;
         return this;
      }

      public a0.e.d.a.b.e.b.a d(long var1) {
         this.d = var1;
         return this;
      }

      public a0.e.d.a.b.e.b.a e(long var1) {
         this.a = var1;
         return this;
      }

      public a0.e.d.a.b.e.b.a f(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null symbol");
         }
      }
   }
}
