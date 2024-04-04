package j1;

import java.util.List;

final class g extends m {
   private final long a;
   private final long b;
   private final k c;
   private final Integer d;
   private final String e;
   private final List f;
   private final p g;

   private g(long var1, long var3, k var5, Integer var6, String var7, List var8, p var9) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var6;
      this.e = var7;
      this.f = var8;
      this.g = var9;
   }

   // $FF: synthetic method
   g(long var1, long var3, k var5, Integer var6, String var7, List var8, p var9, g$a var10) {
      this(var1, var3, var5, var6, var7, var8, var9);
   }

   public k b() {
      return this.c;
   }

   public List c() {
      return this.f;
   }

   public Integer d() {
      return this.d;
   }

   public String e() {
      return this.e;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof m)) {
         return false;
      } else {
         m var4 = (m)var1;
         if (this.a == var4.g() && this.b == var4.h()) {
            label66: {
               k var3 = this.c;
               if (var3 == null) {
                  if (var4.b() != null) {
                     break label66;
                  }
               } else if (!var3.equals(var4.b())) {
                  break label66;
               }

               Integer var5 = this.d;
               if (var5 == null) {
                  if (var4.d() != null) {
                     break label66;
                  }
               } else if (!var5.equals(var4.d())) {
                  break label66;
               }

               String var6 = this.e;
               if (var6 == null) {
                  if (var4.e() != null) {
                     break label66;
                  }
               } else if (!var6.equals(var4.e())) {
                  break label66;
               }

               List var7 = this.f;
               if (var7 == null) {
                  if (var4.c() != null) {
                     break label66;
                  }
               } else if (!var7.equals(var4.c())) {
                  break label66;
               }

               p var8 = this.g;
               if (var8 == null) {
                  if (var4.f() == null) {
                     return var2;
                  }
               } else if (var8.equals(var4.f())) {
                  return var2;
               }
            }
         }

         var2 = false;
         return var2;
      }
   }

   public p f() {
      return this.g;
   }

   public long g() {
      return this.a;
   }

   public long h() {
      return this.b;
   }

   public int hashCode() {
      long var8 = this.a;
      int var7 = (int)(var8 ^ var8 >>> 32);
      var8 = this.b;
      int var6 = (int)(var8 >>> 32 ^ var8);
      k var10 = this.c;
      int var5 = 0;
      int var1;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = var10.hashCode();
      }

      Integer var11 = this.d;
      int var2;
      if (var11 == null) {
         var2 = 0;
      } else {
         var2 = var11.hashCode();
      }

      String var12 = this.e;
      int var3;
      if (var12 == null) {
         var3 = 0;
      } else {
         var3 = var12.hashCode();
      }

      List var13 = this.f;
      int var4;
      if (var13 == null) {
         var4 = 0;
      } else {
         var4 = var13.hashCode();
      }

      p var14 = this.g;
      if (var14 != null) {
         var5 = var14.hashCode();
      }

      return ((((((var7 ^ 1000003) * 1000003 ^ var6) * 1000003 ^ var1) * 1000003 ^ var2) * 1000003 ^ var3) * 1000003 ^ var4) * 1000003 ^ var5;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("LogRequest{requestTimeMs=");
      var1.append(this.a);
      var1.append(", requestUptimeMs=");
      var1.append(this.b);
      var1.append(", clientInfo=");
      var1.append(this.c);
      var1.append(", logSource=");
      var1.append(this.d);
      var1.append(", logSourceName=");
      var1.append(this.e);
      var1.append(", logEvents=");
      var1.append(this.f);
      var1.append(", qosTier=");
      var1.append(this.g);
      var1.append("}");
      return var1.toString();
   }

   static final class b extends m.a {
      private Long a;
      private Long b;
      private k c;
      private Integer d;
      private String e;
      private List f;
      private p g;

      public m a() {
         Long var2 = this.a;
         String var1 = "";
         StringBuilder var3;
         if (var2 == null) {
            var3 = new StringBuilder();
            var3.append("");
            var3.append(" requestTimeMs");
            var1 = var3.toString();
         }

         String var4 = var1;
         if (this.b == null) {
            StringBuilder var5 = new StringBuilder();
            var5.append(var1);
            var5.append(" requestUptimeMs");
            var4 = var5.toString();
         }

         if (var4.isEmpty()) {
            return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (g$a)null);
         } else {
            var3 = new StringBuilder();
            var3.append("Missing required properties:");
            var3.append(var4);
            throw new IllegalStateException(var3.toString());
         }
      }

      public m.a b(k var1) {
         this.c = var1;
         return this;
      }

      public m.a c(List var1) {
         this.f = var1;
         return this;
      }

      m.a d(Integer var1) {
         this.d = var1;
         return this;
      }

      m.a e(String var1) {
         this.e = var1;
         return this;
      }

      public m.a f(p var1) {
         this.g = var1;
         return this;
      }

      public m.a g(long var1) {
         this.a = var1;
         return this;
      }

      public m.a h(long var1) {
         this.b = var1;
         return this;
      }
   }
}
