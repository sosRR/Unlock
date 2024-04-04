package j1;

final class c extends j1.a {
   private final Integer a;
   private final String b;
   private final String c;
   private final String d;
   private final String e;
   private final String f;
   private final String g;
   private final String h;
   private final String i;
   private final String j;
   private final String k;
   private final String l;

   private c(Integer var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
      this.k = var11;
      this.l = var12;
   }

   // $FF: synthetic method
   c(Integer var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12, c$a var13) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public String b() {
      return this.l;
   }

   public String c() {
      return this.j;
   }

   public String d() {
      return this.d;
   }

   public String e() {
      return this.h;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof j1.a)) {
         return false;
      } else {
         label125: {
            j1.a var4 = (j1.a)var1;
            Integer var3 = this.a;
            if (var3 == null) {
               if (var4.m() != null) {
                  break label125;
               }
            } else if (!var3.equals(var4.m())) {
               break label125;
            }

            String var5 = this.b;
            if (var5 == null) {
               if (var4.j() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.j())) {
               break label125;
            }

            var5 = this.c;
            if (var5 == null) {
               if (var4.f() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.f())) {
               break label125;
            }

            var5 = this.d;
            if (var5 == null) {
               if (var4.d() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.d())) {
               break label125;
            }

            var5 = this.e;
            if (var5 == null) {
               if (var4.l() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.l())) {
               break label125;
            }

            var5 = this.f;
            if (var5 == null) {
               if (var4.k() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.k())) {
               break label125;
            }

            var5 = this.g;
            if (var5 == null) {
               if (var4.h() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.h())) {
               break label125;
            }

            var5 = this.h;
            if (var5 == null) {
               if (var4.e() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.e())) {
               break label125;
            }

            var5 = this.i;
            if (var5 == null) {
               if (var4.g() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.g())) {
               break label125;
            }

            var5 = this.j;
            if (var5 == null) {
               if (var4.c() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.c())) {
               break label125;
            }

            var5 = this.k;
            if (var5 == null) {
               if (var4.i() != null) {
                  break label125;
               }
            } else if (!var5.equals(var4.i())) {
               break label125;
            }

            var5 = this.l;
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

   public String f() {
      return this.c;
   }

   public String g() {
      return this.i;
   }

   public String h() {
      return this.g;
   }

   public int hashCode() {
      Integer var13 = this.a;
      int var12 = 0;
      int var1;
      if (var13 == null) {
         var1 = 0;
      } else {
         var1 = var13.hashCode();
      }

      String var14 = this.b;
      int var2;
      if (var14 == null) {
         var2 = 0;
      } else {
         var2 = var14.hashCode();
      }

      var14 = this.c;
      int var3;
      if (var14 == null) {
         var3 = 0;
      } else {
         var3 = var14.hashCode();
      }

      var14 = this.d;
      int var4;
      if (var14 == null) {
         var4 = 0;
      } else {
         var4 = var14.hashCode();
      }

      var14 = this.e;
      int var5;
      if (var14 == null) {
         var5 = 0;
      } else {
         var5 = var14.hashCode();
      }

      var14 = this.f;
      int var6;
      if (var14 == null) {
         var6 = 0;
      } else {
         var6 = var14.hashCode();
      }

      var14 = this.g;
      int var7;
      if (var14 == null) {
         var7 = 0;
      } else {
         var7 = var14.hashCode();
      }

      var14 = this.h;
      int var8;
      if (var14 == null) {
         var8 = 0;
      } else {
         var8 = var14.hashCode();
      }

      var14 = this.i;
      int var9;
      if (var14 == null) {
         var9 = 0;
      } else {
         var9 = var14.hashCode();
      }

      var14 = this.j;
      int var10;
      if (var14 == null) {
         var10 = 0;
      } else {
         var10 = var14.hashCode();
      }

      var14 = this.k;
      int var11;
      if (var14 == null) {
         var11 = 0;
      } else {
         var11 = var14.hashCode();
      }

      var14 = this.l;
      if (var14 != null) {
         var12 = var14.hashCode();
      }

      return (((((((((((var1 ^ 1000003) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5) * 1000003 ^ var6) * 1000003 ^ var7) * 1000003 ^ var8) * 1000003 ^ var9) * 1000003 ^ var10) * 1000003 ^ var11) * 1000003 ^ var12;
   }

   public String i() {
      return this.k;
   }

   public String j() {
      return this.b;
   }

   public String k() {
      return this.f;
   }

   public String l() {
      return this.e;
   }

   public Integer m() {
      return this.a;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("AndroidClientInfo{sdkVersion=");
      var1.append(this.a);
      var1.append(", model=");
      var1.append(this.b);
      var1.append(", hardware=");
      var1.append(this.c);
      var1.append(", device=");
      var1.append(this.d);
      var1.append(", product=");
      var1.append(this.e);
      var1.append(", osBuild=");
      var1.append(this.f);
      var1.append(", manufacturer=");
      var1.append(this.g);
      var1.append(", fingerprint=");
      var1.append(this.h);
      var1.append(", locale=");
      var1.append(this.i);
      var1.append(", country=");
      var1.append(this.j);
      var1.append(", mccMnc=");
      var1.append(this.k);
      var1.append(", applicationBuild=");
      var1.append(this.l);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends j1.a.a {
      private Integer a;
      private String b;
      private String c;
      private String d;
      private String e;
      private String f;
      private String g;
      private String h;
      private String i;
      private String j;
      private String k;
      private String l;

      public j1.a a() {
         return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (c$a)null);
      }

      public j1.a.a b(String var1) {
         this.l = var1;
         return this;
      }

      public j1.a.a c(String var1) {
         this.j = var1;
         return this;
      }

      public j1.a.a d(String var1) {
         this.d = var1;
         return this;
      }

      public j1.a.a e(String var1) {
         this.h = var1;
         return this;
      }

      public j1.a.a f(String var1) {
         this.c = var1;
         return this;
      }

      public j1.a.a g(String var1) {
         this.i = var1;
         return this;
      }

      public j1.a.a h(String var1) {
         this.g = var1;
         return this;
      }

      public j1.a.a i(String var1) {
         this.k = var1;
         return this;
      }

      public j1.a.a j(String var1) {
         this.b = var1;
         return this;
      }

      public j1.a.a k(String var1) {
         this.f = var1;
         return this;
      }

      public j1.a.a l(String var1) {
         this.e = var1;
         return this;
      }

      public j1.a.a m(Integer var1) {
         this.a = var1;
         return this;
      }
   }
}
