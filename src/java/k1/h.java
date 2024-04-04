package k1;

import java.util.Arrays;

public final class h {
   private final i1.b a;
   private final byte[] b;

   public h(i1.b var1, byte[] var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.a = var1;
            this.b = var2;
         } else {
            throw new NullPointerException("bytes is null");
         }
      } else {
         throw new NullPointerException("encoding is null");
      }
   }

   public byte[] a() {
      return this.b;
   }

   public i1.b b() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof h)) {
         return false;
      } else {
         h var2 = (h)var1;
         return !this.a.equals(var2.a) ? false : Arrays.equals(this.b, var2.b);
      }
   }

   public int hashCode() {
      return (this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode(this.b);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("EncodedPayload{encoding=");
      var1.append(this.a);
      var1.append(", bytes=[...]}");
      return var1.toString();
   }
}
