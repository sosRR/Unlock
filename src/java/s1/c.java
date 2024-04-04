package s1;

import java.util.Set;

final class c extends f.b {
   private final long a;
   private final long b;
   private final Set c;

   private c(long var1, long var3, Set var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   // $FF: synthetic method
   c(long var1, long var3, Set var5, c$a var6) {
      this(var1, var3, var5);
   }

   long b() {
      return this.a;
   }

   Set c() {
      return this.c;
   }

   long d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof f.b)) {
         return false;
      } else {
         f.b var3 = (f.b)var1;
         if (this.a != var3.b() || this.b != var3.d() || !this.c.equals(var3.c())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      long var2 = this.a;
      int var1 = (int)(var2 ^ var2 >>> 32);
      var2 = this.b;
      return ((var1 ^ 1000003) * 1000003 ^ (int)(var2 >>> 32 ^ var2)) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ConfigValue{delta=");
      var1.append(this.a);
      var1.append(", maxAllowedDelay=");
      var1.append(this.b);
      var1.append(", flags=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends f.a {
      private Long a;
      private Long b;
      private Set c;

      public f.b a() {
         Long var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" delta");
            var2 = var3.toString();
         }

         String var4 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" maxAllowedDelay");
            var4 = var3.toString();
         }

         var2 = var4;
         if (this.c == null) {
            StringBuilder var5 = new StringBuilder();
            var5.append(var4);
            var5.append(" flags");
            var2 = var5.toString();
         }

         if (var2.isEmpty()) {
            return new c(this.a, this.b, this.c, (c$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public f.a b(long var1) {
         this.a = var1;
         return this;
      }

      public f.a c(Set var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null flags");
         }
      }

      public f.a d(long var1) {
         this.b = var1;
         return this;
      }
   }
}
