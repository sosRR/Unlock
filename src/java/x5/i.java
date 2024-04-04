package x5;

public final class i implements b {
   private final Class a;
   private final String b;

   public i(Class var1, String var2) {
      g.e(var1, "jClass");
      g.e(var2, "moduleName");
      super();
      this.a = var1;
      this.b = var2;
   }

   public Class a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof i && g.a(this.a(), ((i)var1).a())) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int hashCode() {
      return this.a().hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a().toString());
      var1.append(" (Kotlin reflection is not available)");
      return var1.toString();
   }
}
