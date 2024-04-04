package s;

import java.util.ArrayList;

class m {
   public static int h;
   public int a = 0;
   public boolean b = false;
   p c = null;
   p d = null;
   ArrayList e = new ArrayList();
   int f;
   int g;

   public m(p var1, int var2) {
      int var3 = h;
      this.f = var3;
      h = var3 + 1;
      this.c = var1;
      this.d = var1;
      this.g = var2;
   }

   private long c(f var1, long var2) {
      p var10 = var1.d;
      if (var10 instanceof k) {
         return var2;
      } else {
         int var5 = var1.k.size();
         int var4 = 0;

         long var6;
         long var8;
         for(var6 = var2; var4 < var5; var6 = var8) {
            d var11 = (d)var1.k.get(var4);
            var8 = var6;
            if (var11 instanceof f) {
               f var12 = (f)var11;
               if (var12.d == var10) {
                  var8 = var6;
               } else {
                  var8 = Math.min(var6, this.c(var12, (long)var12.f + var2));
               }
            }

            ++var4;
         }

         var8 = var6;
         if (var1 == var10.i) {
            var8 = var10.j();
            var1 = var10.h;
            var2 -= var8;
            var8 = Math.min(Math.min(var6, this.c(var1, var2)), var2 - (long)var10.h.f);
         }

         return var8;
      }
   }

   private long d(f var1, long var2) {
      p var10 = var1.d;
      if (var10 instanceof k) {
         return var2;
      } else {
         int var5 = var1.k.size();
         int var4 = 0;

         long var6;
         long var8;
         for(var6 = var2; var4 < var5; var6 = var8) {
            d var11 = (d)var1.k.get(var4);
            var8 = var6;
            if (var11 instanceof f) {
               f var12 = (f)var11;
               if (var12.d == var10) {
                  var8 = var6;
               } else {
                  var8 = Math.max(var6, this.d(var12, (long)var12.f + var2));
               }
            }

            ++var4;
         }

         var8 = var6;
         if (var1 == var10.h) {
            var8 = var10.j();
            var1 = var10.i;
            var2 += var8;
            var8 = Math.max(Math.max(var6, this.d(var1, var2)), var2 - (long)var10.i.f);
         }

         return var8;
      }
   }

   public void a(p var1) {
      this.e.add(var1);
      this.d = var1;
   }

   public long b(r.f var1, int var2) {
      p var19 = this.c;
      boolean var16 = var19 instanceof c;
      long var10 = 0L;
      if (var16) {
         if (((c)var19).f != var2) {
            return 0L;
         }
      } else if (var2 == 0) {
         if (!(var19 instanceof l)) {
            return 0L;
         }
      } else if (!(var19 instanceof n)) {
         return 0L;
      }

      Object var18;
      if (var2 == 0) {
         var18 = var1.e;
      } else {
         var18 = var1.f;
      }

      f var23 = ((p)var18).h;
      Object var20;
      if (var2 == 0) {
         var20 = var1.e;
      } else {
         var20 = var1.f;
      }

      f var21 = ((p)var20).i;
      boolean var17 = var19.h.l.contains(var23);
      var16 = this.c.i.l.contains(var21);
      long var14 = this.c.j();
      long var6;
      long var8;
      p var22;
      if (var17 && var16) {
         var6 = this.d(this.c.h, 0L);
         long var12 = this.c(this.c.i, 0L);
         var8 = var6 - var14;
         var22 = this.c;
         int var5 = var22.i.f;
         var6 = var8;
         if (var8 >= (long)(-var5)) {
            var6 = var8 + (long)var5;
         }

         var8 = -var12;
         var5 = var22.h.f;
         var12 = var8 - var14 - (long)var5;
         var8 = var12;
         if (var12 >= (long)var5) {
            var8 = var12 - (long)var5;
         }

         float var4 = var22.b.o(var2);
         if (var4 > 0.0F) {
            var10 = (long)((float)var8 / var4 + (float)var6 / (1.0F - var4));
         }

         float var3 = (float)var10;
         var6 = (long)(var3 * var4 + 0.5F);
         var8 = (long)(var3 * (1.0F - var4) + 0.5F);
         var22 = this.c;
         var6 = (long)var22.h.f + var6 + var14 + var8;
         var2 = var22.i.f;
      } else {
         if (var17) {
            var21 = this.c.h;
            var6 = Math.max(this.d(var21, (long)var21.f), (long)this.c.h.f + var14);
            return var6;
         }

         if (var16) {
            var21 = this.c.i;
            var6 = this.c(var21, (long)var21.f);
            var8 = (long)(-this.c.i.f);
            var6 = Math.max(-var6, var8 + var14);
            return var6;
         }

         var22 = this.c;
         var6 = (long)var22.h.f + var22.j();
         var2 = this.c.i.f;
      }

      var6 -= (long)var2;
      return var6;
   }
}
