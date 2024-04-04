package d4;

final class z extends c0.c {
   private final String a;
   private final String b;
   private final boolean c;

   z(String var1, String var2, boolean var3) {
      if (var1 != null) {
         this.a = var1;
         if (var2 != null) {
            this.b = var2;
            this.c = var3;
         } else {
            throw new NullPointerException("Null osCodeName");
         }
      } else {
         throw new NullPointerException("Null osRelease");
      }
   }

   public boolean b() {
      return this.c;
   }

   public String c() {
      return this.b;
   }

   public String d() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c0.c)) {
         return false;
      } else {
         c0.c var3 = (c0.c)var1;
         if (!this.a.equals(var3.d()) || !this.b.equals(var3.c()) || this.c != var3.b()) {
            var2 = false;
         }

         return var2;
      }
   }

   public int hashCode() {
      int var3 = this.a.hashCode();
      int var2 = this.b.hashCode();
      short var1;
      if (this.c) {
         var1 = 1231;
      } else {
         var1 = 1237;
      }

      return ((var3 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("OsData{osRelease=");
      var1.append(this.a);
      var1.append(", osCodeName=");
      var1.append(this.b);
      var1.append(", isRooted=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }
}
