package j1;

final class e extends k {
   private final k.b a;
   private final j1.a b;

   private e(k.b var1, j1.a var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   e(k.b var1, j1.a var2, e$a var3) {
      this(var1, var2);
   }

   public j1.a b() {
      return this.b;
   }

   public k.b c() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof k)) {
         return false;
      } else {
         label28: {
            k var4 = (k)var1;
            k.b var3 = this.a;
            if (var3 == null) {
               if (var4.c() != null) {
                  break label28;
               }
            } else if (!var3.equals(var4.c())) {
               break label28;
            }

            j1.a var5 = this.b;
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
      k.b var3 = this.a;
      int var2 = 0;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      j1.a var4 = this.b;
      if (var4 != null) {
         var2 = var4.hashCode();
      }

      return (var1 ^ 1000003) * 1000003 ^ var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ClientInfo{clientType=");
      var1.append(this.a);
      var1.append(", androidClientInfo=");
      var1.append(this.b);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends k.a {
      private k.b a;
      private j1.a b;

      public k a() {
         return new e(this.a, this.b, (e$a)null);
      }

      public k.a b(j1.a var1) {
         this.b = var1;
         return this;
      }

      public k.a c(k.b var1) {
         this.a = var1;
         return this;
      }
   }
}
