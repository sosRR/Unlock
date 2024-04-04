package j1;

import java.util.List;

final class d extends j {
   private final List a;

   d(List var1) {
      if (var1 != null) {
         this.a = var1;
      } else {
         throw new NullPointerException("Null logRequests");
      }
   }

   public List c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof j) {
         j var2 = (j)var1;
         return this.a.equals(var2.c());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ 1000003;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("BatchedLogRequest{logRequests=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
