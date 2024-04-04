package s1;

import java.util.Map;

final class b extends f {
   private final v1.a a;
   private final Map b;

   b(v1.a var1, Map var2) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
         } else {
            throw new NullPointerException("Null values");
         }
      } else {
         throw new NullPointerException("Null clock");
      }
   }

   v1.a e() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof f)) {
         return false;
      } else {
         f var3 = (f)var1;
         if (!this.a.equals(var3.e()) || !this.b.equals(var3.h())) {
            var2 = false;
         }

         return var2;
      }
   }

   Map h() {
      return this.b;
   }

   public int hashCode() {
      return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SchedulerConfig{clock=");
      var1.append(this.a);
      var1.append(", values=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }
}
