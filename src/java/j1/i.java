package j1;

final class i extends o {
   private final o.c a;
   private final o.b b;

   private i(o.c var1, o.b var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   i(o.c var1, o.b var2, i$a var3) {
      this(var1, var2);
   }

   public o.b b() {
      return this.b;
   }

   public o.c c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof o)) {
         return false;
      } else {
         label28: {
            o var4 = (o)var1;
            o.c var3 = this.a;
            if (var3 == null) {
               if (var4.c() != null) {
                  break label28;
               }
            } else if (!var3.equals(var4.c())) {
               break label28;
            }

            o.b var5 = this.b;
            if (var5 == null) {
               if (var4.b() == null) {
                  return var2;
               }
            } else if (var5.equals(var4.b())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public int hashCode() {
      o.c var3 = this.a;
      int var2 = 0;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      o.b var4 = this.b;
      if (var4 != null) {
         var2 = var4.hashCode();
      }

      return (var1 ^ 1000003) * 1000003 ^ var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("NetworkConnectionInfo{networkType=");
      var1.append(this.a);
      var1.append(", mobileSubtype=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends o.a {
      private o.c a;
      private o.b b;

      public o a() {
         return new i(this.a, this.b, (i$a)null);
      }

      public o.a b(o.b var1) {
         this.b = var1;
         return this;
      }

      public o.a c(o.c var1) {
         this.a = var1;
         return this;
      }
   }
}
