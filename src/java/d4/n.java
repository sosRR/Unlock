package d4;

final class n extends a0.e.d.a.b.a {
   private final long a;
   private final long b;
   private final String c;
   private final String d;

   private n(long var1, long var3, String var5, String var6) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var6;
   }

   // $FF: synthetic method
   n(long var1, long var3, String var5, String var6, n$a var7) {
      this(var1, var3, var5, var6);
   }

   public long b() {
      return this.a;
   }

   public String c() {
      return this.c;
   }

   public long d() {
      return this.b;
   }

   public String e() {
      return this.d;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.d.a.b.a)) {
         return false;
      } else {
         a0.e.d.a.b.a var4 = (a0.e.d.a.b.a)var1;
         if (this.a == var4.b() && this.b == var4.d() && this.c.equals(var4.c())) {
            String var3 = this.d;
            if (var3 == null) {
               if (var4.e() == null) {
                  return var2;
               }
            } else if (var3.equals(var4.e())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      long var5 = this.a;
      int var2 = (int)(var5 ^ var5 >>> 32);
      var5 = this.b;
      int var3 = (int)(var5 >>> 32 ^ var5);
      int var4 = this.c.hashCode();
      String var7 = this.d;
      int var1;
      if (var7 == null) {
         var1 = 0;
      } else {
         var1 = var7.hashCode();
      }

      return (((var2 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BinaryImage{baseAddress=");
      var1.append(this.a);
      var1.append(", size=");
      var1.append(this.b);
      var1.append(", name=");
      var1.append(this.c);
      var1.append(", uuid=");
      var1.append(this.d);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.d.a.b.a.a {
      private Long a;
      private Long b;
      private String c;
      private String d;

      public a0.e.d.a.b.a a() {
         Long var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" baseAddress");
            var2 = var3.toString();
         }

         String var4 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" size");
            var4 = var3.toString();
         }

         var2 = var4;
         if (this.c == null) {
            StringBuilder var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" name");
            var2 = var5.toString();
         }

         if (var2.isEmpty()) {
            return new n(this.a, this.b, this.c, this.d, (n$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.d.a.b.a.a b(long var1) {
         this.a = var1;
         return this;
      }

      public a0.e.d.a.b.a.a c(String var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null name");
         }
      }

      public a0.e.d.a.b.a.a d(long var1) {
         this.b = var1;
         return this;
      }

      public a0.e.d.a.b.a.a e(String var1) {
         this.d = var1;
         return this;
      }
   }
}
