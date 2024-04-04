package w4;

final class a extends d {
   private final String b;
   private final c.a c;
   private final String d;
   private final String e;
   private final long f;
   private final long g;
   private final String h;

   private a(String var1, c.a var2, String var3, String var4, long var5, long var7, String var9) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var7;
      this.h = var9;
   }

   // $FF: synthetic method
   a(String var1, c.a var2, String var3, String var4, long var5, long var7, String var9, a$a var10) {
      this(var1, var2, var3, var4, var5, var7, var9);
   }

   public String b() {
      return this.d;
   }

   public long c() {
      return this.f;
   }

   public String d() {
      return this.b;
   }

   public String e() {
      return this.h;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof d)) {
         return false;
      } else {
         label52: {
            d var4 = (d)var1;
            String var3 = this.b;
            if (var3 == null) {
               if (var4.d() != null) {
                  break label52;
               }
            } else if (!var3.equals(var4.d())) {
               break label52;
            }

            if (this.c.equals(var4.g())) {
               label59: {
                  var3 = this.d;
                  if (var3 == null) {
                     if (var4.b() != null) {
                        break label59;
                     }
                  } else if (!var3.equals(var4.b())) {
                     break label59;
                  }

                  var3 = this.e;
                  if (var3 == null) {
                     if (var4.f() != null) {
                        break label59;
                     }
                  } else if (!var3.equals(var4.f())) {
                     break label59;
                  }

                  if (this.f == var4.c() && this.g == var4.h()) {
                     var3 = this.h;
                     if (var3 == null) {
                        if (var4.e() == null) {
                           return var2;
                        }
                     } else if (var3.equals(var4.e())) {
                        return var2;
                     }
                  }
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

   public c.a g() {
      return this.c;
   }

   public long h() {
      return this.g;
   }

   public int hashCode() {
      String var10 = this.b;
      int var4 = 0;
      int var1;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = var10.hashCode();
      }

      int var5 = this.c.hashCode();
      var10 = this.d;
      int var2;
      if (var10 == null) {
         var2 = 0;
      } else {
         var2 = var10.hashCode();
      }

      var10 = this.e;
      int var3;
      if (var10 == null) {
         var3 = 0;
      } else {
         var3 = var10.hashCode();
      }

      long var8 = this.f;
      int var6 = (int)(var8 ^ var8 >>> 32);
      var8 = this.g;
      int var7 = (int)(var8 ^ var8 >>> 32);
      var10 = this.h;
      if (var10 != null) {
         var4 = var10.hashCode();
      }

      return ((((((var1 ^ 1000003) * 1000003 ^ var5) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var6) * 1000003 ^ var7) * 1000003 ^ var4;
   }

   public d.a n() {
      return new w4.a.b(this, (a$a)null);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PersistedInstallationEntry{firebaseInstallationId=");
      var1.append(this.b);
      var1.append(", registrationStatus=");
      var1.append(this.c);
      var1.append(", authToken=");
      var1.append(this.d);
      var1.append(", refreshToken=");
      var1.append(this.e);
      var1.append(", expiresInSecs=");
      var1.append(this.f);
      var1.append(", tokenCreationEpochInSecs=");
      var1.append(this.g);
      var1.append(", fisError=");
      var1.append(this.h);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends d.a {
      private String a;
      private c.a b;
      private String c;
      private String d;
      private Long e;
      private Long f;
      private String g;

      b() {
      }

      private b(d var1) {
         this.a = var1.d();
         this.b = var1.g();
         this.c = var1.b();
         this.d = var1.f();
         this.e = var1.c();
         this.f = var1.h();
         this.g = var1.e();
      }

      // $FF: synthetic method
      b(d var1, a$a var2) {
         this(var1);
      }

      public d a() {
         c.a var2 = this.b;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" registrationStatus");
            var1 = var3.toString();
         }

         String var4 = var1;
         StringBuilder var5;
         if (this.e == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" expiresInSecs");
            var4 = var5.toString();
         }

         var1 = var4;
         if (this.f == null) {
            var3 = new StringBuilder();
            var3.append(var4);
            var3.append(" tokenCreationEpochInSecs");
            var1 = var3.toString();
         }

         if (var1.isEmpty()) {
            return new w4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (a$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      public d.a b(String var1) {
         this.c = var1;
         return this;
      }

      public d.a c(long var1) {
         this.e = var1;
         return this;
      }

      public d.a d(String var1) {
         this.a = var1;
         return this;
      }

      public d.a e(String var1) {
         this.g = var1;
         return this;
      }

      public d.a f(String var1) {
         this.d = var1;
         return this;
      }

      public d.a g(c.a var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null registrationStatus");
         }
      }

      public d.a h(long var1) {
         this.f = var1;
         return this;
      }
   }
}
