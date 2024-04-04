package f1;

public class d {
   public String a;
   public Long b;

   public d(String var1, long var2) {
      this.a = var1;
      this.b = var2;
   }

   public d(String var1, boolean var2) {
      long var3;
      if (var2) {
         var3 = 1L;
      } else {
         var3 = 0L;
      }

      this(var1, var3);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof d)) {
         return false;
      } else {
         d var3 = (d)var1;
         if (!this.a.equals(var3.a)) {
            return false;
         } else {
            Long var4 = this.b;
            Long var5 = var3.b;
            if (var4 != null) {
               var2 = var4.equals(var5);
            } else if (var5 != null) {
               var2 = false;
            }

            return var2;
         }
      }
   }

   public int hashCode() {
      int var2 = this.a.hashCode();
      Long var3 = this.b;
      int var1;
      if (var3 != null) {
         var1 = var3.hashCode();
      } else {
         var1 = 0;
      }

      return var2 * 31 + var1;
   }
}
