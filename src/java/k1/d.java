package k1;

import java.util.Arrays;

final class d extends o {
   private final String a;
   private final byte[] b;
   private final i1.d c;

   private d(String var1, byte[] var2, i1.d var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   // $FF: synthetic method
   d(String var1, byte[] var2, i1.d var3, d$a var4) {
      this(var1, var2, var3);
   }

   public String b() {
      return this.a;
   }

   public byte[] c() {
      return this.b;
   }

   public i1.d d() {
      return this.c;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof o)) {
         return false;
      } else {
         o var3 = (o)var1;
         if (this.a.equals(var3.b())) {
            byte[] var4 = this.b;
            byte[] var5;
            if (var3 instanceof d) {
               var5 = ((d)var3).b;
            } else {
               var5 = var3.c();
            }

            if (Arrays.equals(var4, var5) && this.c.equals(var3.d())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      return ((this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
   }

   static final class b extends o.a {
      private String a;
      private byte[] b;
      private i1.d c;

      public o a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" backendName");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.c == null) {
            StringBuilder var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" priority");
            var2 = var4.toString();
         }

         if (var2.isEmpty()) {
            return new d(this.a, this.b, this.c, (d$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public o.a b(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null backendName");
         }
      }

      public o.a c(byte[] var1) {
         this.b = var1;
         return this;
      }

      public o.a d(i1.d var1) {
         if (var1 != null) {
            this.c = var1;
            return this;
         } else {
            throw new NullPointerException("Null priority");
         }
      }
   }
}
