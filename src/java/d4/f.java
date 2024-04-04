package d4;

import java.util.Arrays;

final class f extends a0.d.b {
   private final String a;
   private final byte[] b;

   private f(String var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   f(String var1, byte[] var2, f$a var3) {
      this(var1, var2);
   }

   public byte[] b() {
      return this.b;
   }

   public String c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.d.b)) {
         return false;
      } else {
         a0.d.b var4 = (a0.d.b)var1;
         if (this.a.equals(var4.c())) {
            byte[] var3 = this.b;
            byte[] var5;
            if (var4 instanceof f) {
               var5 = ((f)var4).b;
            } else {
               var5 = var4.b();
            }

            if (Arrays.equals(var3, var5)) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      return (this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode(this.b);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("File{filename=");
      var1.append(this.a);
      var1.append(", contents=");
      var1.append(Arrays.toString(this.b));
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.d.b.a {
      private String a;
      private byte[] b;

      public a0.d.b a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" filename");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.b == null) {
            StringBuilder var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" contents");
            var2 = var4.toString();
         }

         if (var2.isEmpty()) {
            return new f(this.a, this.b, (f$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.d.b.a b(byte[] var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null contents");
         }
      }

      public a0.d.b.a c(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null filename");
         }
      }
   }
}
