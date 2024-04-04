package c5;

import javax.annotation.Nonnull;

final class a extends f {
   private final String a;
   private final String b;

   a(String var1, String var2) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
         } else {
            throw new NullPointerException("Null version");
         }
      } else {
         throw new NullPointerException("Null libraryName");
      }
   }

   @Nonnull
   public String b() {
      return this.a;
   }

   @Nonnull
   public String c() {
      return this.b;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof f)) {
         return false;
      } else {
         f var3 = (f)var1;
         if (!this.a.equals(var3.b()) || !this.b.equals(var3.c())) {
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
      var1.append("LibraryVersion{libraryName=");
      var1.append(this.a);
      var1.append(", version=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }
}
