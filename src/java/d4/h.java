package d4;

final class h extends a0.e.a {
   private final String a;
   private final String b;
   private final String c;
   private final a0.e.a.b d;
   private final String e;
   private final String f;
   private final String g;

   private h(String var1, String var2, String var3, a0.e.a.b var4, String var5, String var6, String var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   // $FF: synthetic method
   h(String var1, String var2, String var3, a0.e.a.b var4, String var5, String var6, String var7, h$a var8) {
      this(var1, var2, var3, var4, var5, var6, var7);
   }

   public String b() {
      return this.f;
   }

   public String c() {
      return this.g;
   }

   public String d() {
      return this.c;
   }

   public String e() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e.a)) {
         return false;
      } else {
         a0.e.a var4 = (a0.e.a)var1;
         if (this.a.equals(var4.e()) && this.b.equals(var4.h())) {
            label66: {
               String var3 = this.c;
               if (var3 == null) {
                  if (var4.d() != null) {
                     break label66;
                  }
               } else if (!var3.equals(var4.d())) {
                  break label66;
               }

               a0.e.a.b var5 = this.d;
               if (var5 == null) {
                  if (var4.g() != null) {
                     break label66;
                  }
               } else if (!var5.equals(var4.g())) {
                  break label66;
               }

               var3 = this.e;
               if (var3 == null) {
                  if (var4.f() != null) {
                     break label66;
                  }
               } else if (!var3.equals(var4.f())) {
                  break label66;
               }

               var3 = this.f;
               if (var3 == null) {
                  if (var4.b() != null) {
                     break label66;
                  }
               } else if (!var3.equals(var4.b())) {
                  break label66;
               }

               var3 = this.g;
               if (var3 == null) {
                  if (var4.c() == null) {
                     return var2;
                  }
               } else if (var3.equals(var4.c())) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public String f() {
      return this.e;
   }

   public a0.e.a.b g() {
      return this.d;
   }

   public String h() {
      return this.b;
   }

   public int hashCode() {
      int var7 = this.a.hashCode();
      int var6 = this.b.hashCode();
      String var8 = this.c;
      int var5 = 0;
      int var1;
      if (var8 == null) {
         var1 = 0;
      } else {
         var1 = var8.hashCode();
      }

      a0.e.a.b var9 = this.d;
      int var2;
      if (var9 == null) {
         var2 = 0;
      } else {
         var2 = var9.hashCode();
      }

      var8 = this.e;
      int var3;
      if (var8 == null) {
         var3 = 0;
      } else {
         var3 = var8.hashCode();
      }

      var8 = this.f;
      int var4;
      if (var8 == null) {
         var4 = 0;
      } else {
         var4 = var8.hashCode();
      }

      var8 = this.g;
      if (var8 != null) {
         var5 = var8.hashCode();
      }

      return ((((((var7 ^ 1000003) * 1000003 ^ var6) * 1000003 ^ var1) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Application{identifier=");
      var1.append(this.a);
      var1.append(", version=");
      var1.append(this.b);
      var1.append(", displayVersion=");
      var1.append(this.c);
      var1.append(", organization=");
      var1.append(this.d);
      var1.append(", installationUuid=");
      var1.append(this.e);
      var1.append(", developmentPlatform=");
      var1.append(this.f);
      var1.append(", developmentPlatformVersion=");
      var1.append(this.g);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.a.a {
      private String a;
      private String b;
      private String c;
      private a0.e.a.b d;
      private String e;
      private String f;
      private String g;

      public a0.e.a a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" identifier");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.b == null) {
            StringBuilder var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" version");
            var2 = var4.toString();
         }

         if (var2.isEmpty()) {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (h$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var2);
            throw new IllegalStateException(var3.toString());
         }
      }

      public a0.e.a.a b(String var1) {
         this.f = var1;
         return this;
      }

      public a0.e.a.a c(String var1) {
         this.g = var1;
         return this;
      }

      public a0.e.a.a d(String var1) {
         this.c = var1;
         return this;
      }

      public a0.e.a.a e(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null identifier");
         }
      }

      public a0.e.a.a f(String var1) {
         this.e = var1;
         return this;
      }

      public a0.e.a.a g(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null version");
         }
      }
   }
}
