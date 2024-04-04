package d4;

final class w extends c0 {
   private final c0.a a;
   private final c0.c b;
   private final c0.b c;

   w(c0.a var1, c0.c var2, c0.b var3) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
            if (var3 != null) {
               this.c = var3;
            } else {
               throw new NullPointerException("Null deviceData");
            }
         } else {
            throw new NullPointerException("Null osData");
         }
      } else {
         throw new NullPointerException("Null appData");
      }
   }

   public c0.a a() {
      return this.a;
   }

   public c0.b c() {
      return this.c;
   }

   public c0.c d() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c0)) {
         return false;
      } else {
         c0 var3 = (c0)var1;
         if (!this.a.equals(var3.a()) || !this.b.equals(var3.d()) || !this.c.equals(var3.c())) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("StaticSessionData{appData=");
      var1.append(this.a);
      var1.append(", osData=");
      var1.append(this.b);
      var1.append(", deviceData=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
