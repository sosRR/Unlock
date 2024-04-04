package w3;

public final class q {
   private final Class a;
   private final int b;
   private final int c;

   private q(Class var1, int var2, int var3) {
      this.a = (Class)z.c(var1, "Null dependency anInterface.");
      this.b = var2;
      this.c = var3;
   }

   public static q a(Class var0) {
      return new q(var0, 0, 2);
   }

   private static String b(int var0) {
      if (var0 != 0) {
         if (var0 != 1) {
            if (var0 == 2) {
               return "deferred";
            } else {
               StringBuilder var1 = new StringBuilder();
               var1.append("Unsupported injection: ");
               var1.append(var0);
               throw new AssertionError(var1.toString());
            }
         } else {
            return "provider";
         }
      } else {
         return "direct";
      }
   }

   @Deprecated
   public static q h(Class var0) {
      return new q(var0, 0, 0);
   }

   public static q i(Class var0) {
      return new q(var0, 0, 1);
   }

   public static q j(Class var0) {
      return new q(var0, 1, 0);
   }

   public static q k(Class var0) {
      return new q(var0, 1, 1);
   }

   public static q l(Class var0) {
      return new q(var0, 2, 0);
   }

   public Class c() {
      return this.a;
   }

   public boolean d() {
      boolean var1;
      if (this.c == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean e() {
      boolean var1;
      if (this.c == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean equals(Object var1) {
      boolean var4 = var1 instanceof q;
      boolean var3 = false;
      boolean var2 = var3;
      if (var4) {
         q var5 = (q)var1;
         var2 = var3;
         if (this.a == var5.a) {
            var2 = var3;
            if (this.b == var5.b) {
               var2 = var3;
               if (this.c == var5.c) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public boolean f() {
      int var1 = this.b;
      boolean var2 = true;
      if (var1 != 1) {
         var2 = false;
      }

      return var2;
   }

   public boolean g() {
      boolean var1;
      if (this.b == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
   }

   public String toString() {
      StringBuilder var3 = new StringBuilder("Dependency{anInterface=");
      var3.append(this.a);
      var3.append(", type=");
      int var1 = this.b;
      String var2;
      if (var1 == 1) {
         var2 = "required";
      } else if (var1 == 0) {
         var2 = "optional";
      } else {
         var2 = "set";
      }

      var3.append(var2);
      var3.append(", injection=");
      var3.append(b(this.c));
      var3.append("}");
      return var3.toString();
   }
}
