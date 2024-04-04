package l1;

import java.util.Arrays;

final class a extends f {
   private final Iterable a;
   private final byte[] b;

   private a(Iterable var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   a(Iterable var1, byte[] var2, a$a var3) {
      this(var1, var2);
   }

   public Iterable b() {
      return this.a;
   }

   public byte[] c() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof f)) {
         return false;
      } else {
         f var4 = (f)var1;
         if (this.a.equals(var4.b())) {
            byte[] var3 = this.b;
            byte[] var5;
            if (var4 instanceof l1.a) {
               var5 = ((l1.a)var4).b;
            } else {
               var5 = var4.c();
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
      var1.append("BackendRequest{events=");
      var1.append(this.a);
      var1.append(", extras=");
      var1.append(Arrays.toString(this.b));
      var1.append("}");
      return var1.toString();
   }

   static final class b extends f.a {
      private Iterable a;
      private byte[] b;

      public f a() {
         Iterable var2 = this.a;
         String var1 = "";
         if (var2 == null) {
            StringBuilder var3 = new StringBuilder();
            var3.append("");
            var3.append(" events");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new l1.a(this.a, this.b, (a$a)null);
         } else {
            StringBuilder var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public f.a b(Iterable var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null events");
         }
      }

      public f.a c(byte[] var1) {
         this.b = var1;
         return this;
      }
   }
}
