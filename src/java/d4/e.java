package d4;

final class e extends a0.d {
   private final b0 a;
   private final String b;

   private e(b0 var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   e(b0 var1, String var2, e$a var3) {
      this(var1, var2);
   }

   public b0 b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.d)) {
         return false;
      } else {
         a0.d var4 = (a0.d)var1;
         if (this.a.equals(var4.b())) {
            String var3 = this.b;
            if (var3 == null) {
               if (var4.c() == null) {
                  return var2;
               }
            } else if (var3.equals(var4.c())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      int var2 = this.a.hashCode();
      String var3 = this.b;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      return (var2 ^ 1000003) * 1000003 ^ var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("FilesPayload{files=");
      var1.append(this.a);
      var1.append(", orgId=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.d.a {
      private b0 a;
      private String b;

      public a0.d a() {
         b0 var2 = this.a;
         String var1 = "";
         if (var2 == null) {
            StringBuilder var3 = new StringBuilder();
            var3.append("");
            var3.append(" files");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new e(this.a, this.b, (e$a)null);
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.d.a b(b0 var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null files");
         }
      }

      public a0.d.a c(String var1) {
         this.b = var1;
         return this;
      }
   }
}
