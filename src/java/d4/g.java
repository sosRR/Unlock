package d4;

final class g extends a0.e {
   private final String a;
   private final String b;
   private final long c;
   private final Long d;
   private final boolean e;
   private final a0.e.a f;
   private final a0.e.f g;
   private final a0.e.e h;
   private final a0.e.c i;
   private final b0 j;
   private final int k;

   private g(String var1, String var2, long var3, Long var5, boolean var6, a0.e.a var7, a0.e.f var8, a0.e.e var9, a0.e.c var10, b0 var11, int var12) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
      this.e = var6;
      this.f = var7;
      this.g = var8;
      this.h = var9;
      this.i = var10;
      this.j = var11;
      this.k = var12;
   }

   // $FF: synthetic method
   g(String var1, String var2, long var3, Long var5, boolean var6, a0.e.a var7, a0.e.f var8, a0.e.e var9, a0.e.c var10, b0 var11, int var12, g$a var13) {
      this(var1, var2, var3, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public a0.e.a b() {
      return this.f;
   }

   public a0.e.c c() {
      return this.i;
   }

   public Long d() {
      return this.d;
   }

   public b0 e() {
      return this.j;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a0.e)) {
         return false;
      } else {
         a0.e var4 = (a0.e)var1;
         if (this.a.equals(var4.f()) && this.b.equals(var4.h()) && this.c == var4.k()) {
            label66: {
               Long var3 = this.d;
               if (var3 == null) {
                  if (var4.d() != null) {
                     break label66;
                  }
               } else if (!var3.equals(var4.d())) {
                  break label66;
               }

               if (this.e == var4.m() && this.f.equals(var4.b())) {
                  label76: {
                     a0.e.f var5 = this.g;
                     if (var5 == null) {
                        if (var4.l() != null) {
                           break label76;
                        }
                     } else if (!var5.equals(var4.l())) {
                        break label76;
                     }

                     a0.e.e var6 = this.h;
                     if (var6 == null) {
                        if (var4.j() != null) {
                           break label76;
                        }
                     } else if (!var6.equals(var4.j())) {
                        break label76;
                     }

                     a0.e.c var7 = this.i;
                     if (var7 == null) {
                        if (var4.c() != null) {
                           break label76;
                        }
                     } else if (!var7.equals(var4.c())) {
                        break label76;
                     }

                     b0 var8 = this.j;
                     if (var8 == null) {
                        if (var4.e() != null) {
                           break label76;
                        }
                     } else if (!var8.equals(var4.e())) {
                        break label76;
                     }

                     if (this.k == var4.g()) {
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
      return this.a;
   }

   public int g() {
      return this.k;
   }

   public String h() {
      return this.b;
   }

   public int hashCode() {
      int var9 = this.a.hashCode();
      int var8 = this.b.hashCode();
      long var11 = this.c;
      int var7 = (int)(var11 ^ var11 >>> 32);
      Long var13 = this.d;
      int var6 = 0;
      int var1;
      if (var13 == null) {
         var1 = 0;
      } else {
         var1 = var13.hashCode();
      }

      short var2;
      if (this.e) {
         var2 = 1231;
      } else {
         var2 = 1237;
      }

      int var10 = this.f.hashCode();
      a0.e.f var14 = this.g;
      int var3;
      if (var14 == null) {
         var3 = 0;
      } else {
         var3 = var14.hashCode();
      }

      a0.e.e var15 = this.h;
      int var4;
      if (var15 == null) {
         var4 = 0;
      } else {
         var4 = var15.hashCode();
      }

      a0.e.c var16 = this.i;
      int var5;
      if (var16 == null) {
         var5 = 0;
      } else {
         var5 = var16.hashCode();
      }

      b0 var17 = this.j;
      if (var17 != null) {
         var6 = var17.hashCode();
      }

      return ((((((((((var9 ^ 1000003) * 1000003 ^ var8) * 1000003 ^ var7) * 1000003 ^ var1) * 1000003 ^ var2) * 1000003 ^ var10) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5) * 1000003 ^ var6) * 1000003 ^ this.k;
   }

   public a0.e.e j() {
      return this.h;
   }

   public long k() {
      return this.c;
   }

   public a0.e.f l() {
      return this.g;
   }

   public boolean m() {
      return this.e;
   }

   public a0.e.b n() {
      return new b(this, (g$a)null);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("Session{generator=");
      var1.append(this.a);
      var1.append(", identifier=");
      var1.append(this.b);
      var1.append(", startedAt=");
      var1.append(this.c);
      var1.append(", endedAt=");
      var1.append(this.d);
      var1.append(", crashed=");
      var1.append(this.e);
      var1.append(", app=");
      var1.append(this.f);
      var1.append(", user=");
      var1.append(this.g);
      var1.append(", os=");
      var1.append(this.h);
      var1.append(", device=");
      var1.append(this.i);
      var1.append(", events=");
      var1.append(this.j);
      var1.append(", generatorType=");
      var1.append(this.k);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends a0.e.b {
      private String a;
      private String b;
      private Long c;
      private Long d;
      private Boolean e;
      private a0.e.a f;
      private a0.e.f g;
      private a0.e.e h;
      private a0.e.c i;
      private b0 j;
      private Integer k;

      b() {
      }

      private b(a0.e var1) {
         this.a = var1.f();
         this.b = var1.h();
         this.c = var1.k();
         this.d = var1.d();
         this.e = var1.m();
         this.f = var1.b();
         this.g = var1.l();
         this.h = var1.j();
         this.i = var1.c();
         this.j = var1.e();
         this.k = var1.g();
      }

      // $FF: synthetic method
      b(a0.e var1, g$a var2) {
         this(var1);
      }

      public a0.e a() {
         String var2 = this.a;
         String var1 = "";
         StringBuilder var4;
         if (var2 == null) {
            var4 = new StringBuilder();
            var4.append("");
            var4.append(" generator");
            var1 = var4.toString();
         }

         var2 = var1;
         StringBuilder var5;
         if (this.b == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" identifier");
            var2 = var5.toString();
         }

         String var3 = var2;
         if (this.c == null) {
            var4 = new StringBuilder();
            var4.append(var2);
            var4.append(" startedAt");
            var3 = var4.toString();
         }

         var1 = var3;
         if (this.e == null) {
            var4 = new StringBuilder();
            var4.append(var3);
            var4.append(" crashed");
            var1 = var4.toString();
         }

         var2 = var1;
         if (this.f == null) {
            var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" app");
            var2 = var5.toString();
         }

         var1 = var2;
         if (this.k == null) {
            var4 = new StringBuilder();
            var4.append(var2);
            var4.append(" generatorType");
            var1 = var4.toString();
         }

         if (var1.isEmpty()) {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (g$a)null);
         } else {
            var5 = new StringBuilder();
            var5.append("Missing required properties:");
            var5.append(var1);
            throw new IllegalStateException(var5.toString());
         }
      }

      public a0.e.b b(a0.e.a var1) {
         if (var1 != null) {
            this.f = var1;
            return this;
         } else {
            throw new NullPointerException("Null app");
         }
      }

      public a0.e.b c(boolean var1) {
         this.e = var1;
         return this;
      }

      public a0.e.b d(a0.e.c var1) {
         this.i = var1;
         return this;
      }

      public a0.e.b e(Long var1) {
         this.d = var1;
         return this;
      }

      public a0.e.b f(b0 var1) {
         this.j = var1;
         return this;
      }

      public a0.e.b g(String var1) {
         if (var1 != null) {
            this.a = var1;
            return this;
         } else {
            throw new NullPointerException("Null generator");
         }
      }

      public a0.e.b h(int var1) {
         this.k = var1;
         return this;
      }

      public a0.e.b i(String var1) {
         if (var1 != null) {
            this.b = var1;
            return this;
         } else {
            throw new NullPointerException("Null identifier");
         }
      }

      public a0.e.b k(a0.e.e var1) {
         this.h = var1;
         return this;
      }

      public a0.e.b l(long var1) {
         this.c = var1;
         return this;
      }

      public a0.e.b m(a0.e.f var1) {
         this.g = var1;
         return this;
      }
   }
}
