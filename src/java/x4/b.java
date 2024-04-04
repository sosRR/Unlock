package x4;

final class b extends f {
   private final String a;
   private final long b;
   private final f.b c;

   private b(String var1, long var2, f.b var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
   }

   // $FF: synthetic method
   b(String var1, long var2, f.b var4, b$a var5) {
      this(var1, var2, var4);
   }

   public f.b b() {
      return this.c;
   }

   public String c() {
      return this.a;
   }

   public long d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof f)) {
         return false;
      } else {
         label30: {
            f var4 = (f)var1;
            String var3 = this.a;
            if (var3 == null) {
               if (var4.c() != null) {
                  break label30;
               }
            } else if (!var3.equals(var4.c())) {
               break label30;
            }

            if (this.b == var4.d()) {
               f.b var5 = this.c;
               if (var5 == null) {
                  if (var4.b() == null) {
                     return var2;
                  }
               } else if (var5.equals(var4.b())) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      String var6 = this.a;
      int var2 = 0;
      int var1;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.hashCode();
      }

      long var4 = this.b;
      int var3 = (int)(var4 ^ var4 >>> 32);
      f.b var7 = this.c;
      if (var7 != null) {
         var2 = var7.hashCode();
      }

      return ((var1 ^ 1000003) * 1000003 ^ var3) * 1000003 ^ var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TokenResult{token=");
      var1.append(this.a);
      var1.append(", tokenExpirationTimestamp=");
      var1.append(this.b);
      var1.append(", responseCode=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends f.a {
      private String a;
      private Long b;
      private f.b c;

      public f a() {
         Long var2 = this.b;
         String var1 = "";
         if (var2 == null) {
            StringBuilder var3 = new StringBuilder();
            var3.append("");
            var3.append(" tokenExpirationTimestamp");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new x4.b(this.a, this.b, this.c, (b$a)null);
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public f.a b(f.b var1) {
         this.c = var1;
         return this;
      }

      public f.a c(String var1) {
         this.a = var1;
         return this;
      }

      public f.a d(long var1) {
         this.b = var1;
         return this;
      }
   }
}
