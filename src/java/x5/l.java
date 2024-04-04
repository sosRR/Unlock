package x5;

public abstract class l extends a implements b6.e {
   public l() {
   }

   public l(Object var1, Class var2, String var3, String var4, int var5) {
      boolean var6 = true;
      if ((var5 & 1) != 1) {
         var6 = false;
      }

      super(var1, var2, var3, var4, var6);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof l)) {
         return var1 instanceof b6.e ? var1.equals(this.b()) : false;
      } else {
         l var3 = (l)var1;
         if (!this.f().equals(var3.f()) || !this.e().equals(var3.e()) || !this.g().equals(var3.g()) || !g.a(this.d(), var3.d())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return (this.f().hashCode() * 31 + this.e().hashCode()) * 31 + this.g().hashCode();
   }

   public String toString() {
      b6.a var1 = this.b();
      if (var1 != this) {
         return var1.toString();
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("property ");
         var2.append(this.e());
         var2.append(" (Kotlin reflection is not available)");
         return var2.toString();
      }
   }
}
