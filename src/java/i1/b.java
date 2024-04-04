package i1;

public final class b {
   private final String a;

   private b(String var1) {
      if (var1 != null) {
         this.a = var1;
      } else {
         throw new NullPointerException("name is null");
      }
   }

   public static b b(String var0) {
      return new b(var0);
   }

   public String a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof b) ? false : this.a.equals(((b)var1).a);
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ 1000003;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Encoding{name=\"");
      var1.append(this.a);
      var1.append("\"}");
      return var1.toString();
   }
}
