package x4;

final class a extends d {
   private final String a;
   private final String b;
   private final String c;
   private final f d;
   private final d.b e;

   private a(String var1, String var2, String var3, f var4, d.b var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   a(String var1, String var2, String var3, f var4, d.b var5, a$a var6) {
      this(var1, var2, var3, var4, var5);
   }

   public f b() {
      return this.d;
   }

   public String c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public d.b e() {
      return this.e;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof d)) {
         return false;
      } else {
         label62: {
            d var4 = (d)var1;
            String var3 = this.a;
            if (var3 == null) {
               if (var4.f() != null) {
                  break label62;
               }
            } else if (!var3.equals(var4.f())) {
               break label62;
            }

            var3 = this.b;
            if (var3 == null) {
               if (var4.c() != null) {
                  break label62;
               }
            } else if (!var3.equals(var4.c())) {
               break label62;
            }

            var3 = this.c;
            if (var3 == null) {
               if (var4.d() != null) {
                  break label62;
               }
            } else if (!var3.equals(var4.d())) {
               break label62;
            }

            f var5 = this.d;
            if (var5 == null) {
               if (var4.b() != null) {
                  break label62;
               }
            } else if (!var5.equals(var4.b())) {
               break label62;
            }

            d.b var6 = this.e;
            if (var6 == null) {
               if (var4.e() == null) {
                  return var2;
               }
            } else if (var6.equals(var4.e())) {
               return var2;
            }
         }

         var2 = false;
         return var2;
      }
   }

   public String f() {
      return this.a;
   }

   public int hashCode() {
      String var6 = this.a;
      int var5 = 0;
      int var1;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.hashCode();
      }

      var6 = this.b;
      int var2;
      if (var6 == null) {
         var2 = 0;
      } else {
         var2 = var6.hashCode();
      }

      var6 = this.c;
      int var3;
      if (var6 == null) {
         var3 = 0;
      } else {
         var3 = var6.hashCode();
      }

      f var7 = this.d;
      int var4;
      if (var7 == null) {
         var4 = 0;
      } else {
         var4 = var7.hashCode();
      }

      d.b var8 = this.e;
      if (var8 != null) {
         var5 = var8.hashCode();
      }

      return ((((var1 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("InstallationResponse{uri=");
      var1.append(this.a);
      var1.append(", fid=");
      var1.append(this.b);
      var1.append(", refreshToken=");
      var1.append(this.c);
      var1.append(", authToken=");
      var1.append(this.d);
      var1.append(", responseCode=");
      var1.append(this.e);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends d.a {
      private String a;
      private String b;
      private String c;
      private f d;
      private d.b e;

      public d a() {
         return new x4.a(this.a, this.b, this.c, this.d, this.e, (a$a)null);
      }

      public d.a b(f var1) {
         this.d = var1;
         return this;
      }

      public d.a c(String var1) {
         this.b = var1;
         return this;
      }

      public d.a d(String var1) {
         this.c = var1;
         return this;
      }

      public d.a e(d.b var1) {
         this.e = var1;
         return this;
      }

      public d.a f(String var1) {
         this.a = var1;
         return this;
      }
   }
}
