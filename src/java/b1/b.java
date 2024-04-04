package b1;

public class b {
   private boolean a;
   private boolean b;
   private boolean c;
   private boolean d;

   public b(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof b)) {
         return false;
      } else {
         b var3 = (b)var1;
         if (this.a != var3.a || this.b != var3.b || this.c != var3.c || this.d != var3.d) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      int var1 = this.a;
      int var2 = var1;
      if (this.b) {
         var2 = var1 + 16;
      }

      var1 = var2;
      if (this.c) {
         var1 = var2 + 256;
      }

      var2 = var1;
      if (this.d) {
         var2 = var1 + 4096;
      }

      return var2;
   }

   public String toString() {
      return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{this.a, this.b, this.c, this.d});
   }
}
