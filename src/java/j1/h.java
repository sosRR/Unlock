package j1;

final class h extends n {
   private final long a;

   h(long var1) {
      this.a = var1;
   }

   public long c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (var1 instanceof n) {
         n var3 = (n)var1;
         if (this.a != var3.c()) {
            var2 = false;
         }

         return var2;
      } else {
         return false;
      }
   }

   public int hashCode() {
      long var1 = this.a;
      return (int)(var1 ^ var1 >>> 32) ^ 1000003;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LogResponse{nextRequestWaitMillis=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
