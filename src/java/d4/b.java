package d4;

final class b extends a0 {
   private final String b;
   private final String c;
   private final int d;
   private final String e;
   private final String f;
   private final String g;
   private final a0.e h;
   private final a0.d i;

   private b(String var1, String var2, int var3, String var4, String var5, String var6, a0.e var7, a0.d var8) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.h = var7;
      this.i = var8;
   }

   // $FF: synthetic method
   b(String var1, String var2, int var3, String var4, String var5, String var6, a0.e var7, a0.d var8, b$a var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public String c() {
      return this.f;
   }

   public String d() {
      return this.g;
   }

   public String e() {
      return this.c;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0)) {
         return false;
      } else {
         a0 var4 = (a0)var1;
         if (this.b.equals(var4.i()) && this.c.equals(var4.e()) && this.d == var4.h() && this.e.equals(var4.f()) && this.f.equals(var4.c()) && this.g.equals(var4.d())) {
            label34: {
               a0.e var3 = this.h;
               if (var3 == null) {
                  if (var4.j() != null) {
                     break label34;
                  }
               } else if (!var3.equals(var4.j())) {
                  break label34;
               }

               a0.d var5 = this.i;
               if (var5 == null) {
                  if (var4.g() == null) {
                     return var2;
                  }
               } else if (var5.equals(var4.g())) {
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

   public a0.d g() {
      return this.i;
   }

   public int h() {
      return this.d;
   }

   public int hashCode() {
      int var3 = this.b.hashCode();
      int var6 = this.c.hashCode();
      int var4 = this.d;
      int var5 = this.e.hashCode();
      int var7 = this.f.hashCode();
      int var8 = this.g.hashCode();
      a0.e var9 = this.h;
      int var2 = 0;
      int var1;
      if (var9 == null) {
         var1 = 0;
      } else {
         var1 = var9.hashCode();
      }

      a0.d var10 = this.i;
      if (var10 != null) {
         var2 = var10.hashCode();
      }

      return (((((((var3 ^ 1000003) * 1000003 ^ var6) * 1000003 ^ var4) * 1000003 ^ var5) * 1000003 ^ var7) * 1000003 ^ var8) * 1000003 ^ var1) * 1000003 ^ var2;
   }

   public String i() {
      return this.b;
   }

   public a0.e j() {
      return this.h;
   }

   protected a0.b k() {
      return new d4.b.b(this, (b$a)null);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CrashlyticsReport{sdkVersion=");
      var1.append(this.b);
      var1.append(", gmpAppId=");
      var1.append(this.c);
      var1.append(", platform=");
      var1.append(this.d);
      var1.append(", installationUuid=");
      var1.append(this.e);
      var1.append(", buildVersion=");
      var1.append(this.f);
      var1.append(", displayVersion=");
      var1.append(this.g);
      var1.append(", session=");
      var1.append(this.h);
      var1.append(", ndkPayload=");
      var1.append(this.i);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.b {
      private String a;
      private String b;
      private Integer c;
      private String d;
      private String e;
      private String f;
      private a0.e g;
      private a0.d h;

      b() {
      }

      private b(a0 var1) {
         this.a = var1.i();
         this.b = var1.e();
         this.c = var1.h();
         this.d = var1.f();
         this.e = var1.c();
         this.f = var1.d();
         this.g = var1.j();
         this.h = var1.g();
      }

      // $FF: synthetic method
      b(a0 var1, b$a var2) {
         this(var1);
      }

      public a0 a() {
         String var1 = this.a;
         String var2 = "";
         StringBuilder var3;
         if (var1 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" sdkVersion");
            var2 = var3.toString();
         }

         var1 = var2;
         if (this.b == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" gmpAppId");
            var1 = var3.toString();
         }

         var2 = var1;
         StringBuilder var4;
         if (this.c == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" platform");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.d == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" installationUuid");
            var1 = var3.toString();
         }

         var2 = var1;
         if (this.e == null) {
            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(" buildVersion");
            var2 = var4.toString();
         }

         var1 = var2;
         if (this.f == null) {
            var3 = new StringBuilder();
            var3.append(var2);
            var3.append(" displayVersion");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new d4.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b$a)null);
         } else {
            var4 = new StringBuilder();
            var4.append("Missing required properties:");
            var4.append(var1);
            throw new IllegalStateException(var4.toString());
         }
      }

      public a0.b b(String var1) {
         if (var1 != null) {
            this.e = var1;
            return this;
         } else {
            throw new NullPointerException("Null buildVersion");
         }
      }

      public a0.b c(String var1) {
         if (var1 != null) {
            this.f = var1;
            return this;
         } else {
            throw new NullPointerException("Null displayVersion");
         }
      }

      public a0.b d(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null gmpAppId");
         }
      }

      public a0.b e(String var1) {
         if (var1 != null) {
            this.d = var1;
            return this;
         } else {
            throw new NullPointerException("Null installationUuid");
         }
      }

      public a0.b f(a0.d var1) {
         this.h = var1;
         return this;
      }

      public a0.b g(int var1) {
         this.c = var1;
         return this;
      }

      public a0.b h(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null sdkVersion");
         }
      }

      public a0.b i(a0.e var1) {
         this.g = var1;
         return this;
      }
   }
}
