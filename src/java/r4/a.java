package r4;

import java.util.List;

final class a extends m {
   private final String a;
   private final List b;

   a(String var1, List var2) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
         } else {
            throw new NullPointerException("Null usedDates");
         }
      } else {
         throw new NullPointerException("Null userAgent");
      }
   }

   public List b() {
      return this.b;
   }

   public String c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof m)) {
         return false;
      } else {
         m var3 = (m)var1;
         if (!this.a.equals(var3.c()) || !this.b.equals(var3.b())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("HeartBeatResult{userAgent=");
      var1.append(this.a);
      var1.append(", usedDates=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }
}
