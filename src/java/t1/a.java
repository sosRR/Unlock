package t1;

final class a extends e {
   private final long b;
   private final int c;
   private final int d;
   private final long e;
   private final int f;

   private a(long var1, int var3, int var4, long var5, int var7) {
      this.b = var1;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var7;
   }

   // $FF: synthetic method
   a(long var1, int var3, int var4, long var5, int var7, a$a var8) {
      this(var1, var3, var4, var5, var7);
   }

   int b() {
      return this.d;
   }

   long c() {
      return this.e;
   }

   int d() {
      return this.c;
   }

   int e() {
      return this.f;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof e)) {
         return false;
      } else {
         e var3 = (e)var1;
         if (this.b != var3.f() || this.c != var3.d() || this.d != var3.b() || this.e != var3.c() || this.f != var3.e()) {
            var2 = false;
         }

         return var2;
      }
   }

   long f() {
      return this.b;
   }

   public int hashCode() {
      long var4 = this.b;
      int var1 = (int)(var4 ^ var4 >>> 32);
      int var3 = this.c;
      int var2 = this.d;
      var4 = this.e;
      return ((((var1 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var2) * 1000003 ^ (int)(var4 >>> 32 ^ var4)) * 1000003 ^ this.f;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("EventStoreConfig{maxStorageSizeInBytes=");
      var1.append(this.b);
      var1.append(", loadBatchSize=");
      var1.append(this.c);
      var1.append(", criticalSectionEnterTimeoutMs=");
      var1.append(this.d);
      var1.append(", eventCleanUpAge=");
      var1.append(this.e);
      var1.append(", maxBlobByteSizePerRow=");
      var1.append(this.f);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends e.a {
      private Long a;
      private Integer b;
      private Integer c;
      private Long d;
      private Integer e;

      e a() {
         Long var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" maxStorageSizeInBytes");
            var2 = var3.toString();
         }

         String var4 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" loadBatchSize");
            var4 = var3.toString();
         }

         var2 = var4;
         StringBuilder var5;
         if (this.c == null) {
            var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" criticalSectionEnterTimeoutMs");
            var2 = var5.toString();
         }

         var4 = var2;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" eventCleanUpAge");
            var4 = var3.toString();
         }

         var2 = var4;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" maxBlobByteSizePerRow");
            var2 = var5.toString();
         }

         if (var2.isEmpty()) {
            return new t1.a(this.a, this.b, this.c, this.d, this.e, (a$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      e.a b(int var1) {
         this.c = var1;
         return this;
      }

      e.a c(long var1) {
         this.d = var1;
         return this;
      }

      e.a d(int var1) {
         this.b = var1;
         return this;
      }

      e.a e(int var1) {
         this.e = var1;
         return this;
      }

      e.a f(long var1) {
         this.a = var1;
         return this;
      }
   }
}
