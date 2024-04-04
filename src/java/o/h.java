package o;

import java.util.Arrays;

public class h extends b {
   private int g = 128;
   private i[] h = new i[128];
   private i[] i = new i[128];
   private int j = 0;
   <undefinedtype> k = new Object(this, this) {
      i a;
      h b;
      final h c;

      public {
         this.c = var1;
         this.b = var2;
      }

      public boolean a(i var1, float var2) {
         boolean var7 = this.a.m;
         boolean var6 = true;
         int var5 = 0;
         float var3;
         if (var7) {
            for(var5 = 0; var5 < 9; ++var5) {
               float[] var8 = this.a.u;
               var3 = var8[var5] + var1.u[var5] * var2;
               var8[var5] = var3;
               if (Math.abs(var3) < 1.0E-4F) {
                  this.a.u[var5] = 0.0F;
               } else {
                  var6 = false;
               }
            }

            if (var6) {
               this.c.G(this.a);
            }

            return false;
         } else {
            for(; var5 < 9; ++var5) {
               var3 = var1.u[var5];
               if (var3 != 0.0F) {
                  float var4 = var3 * var2;
                  var3 = var4;
                  if (Math.abs(var4) < 1.0E-4F) {
                     var3 = 0.0F;
                  }

                  this.a.u[var5] = var3;
               } else {
                  this.a.u[var5] = 0.0F;
               }
            }

            return true;
         }
      }

      public void b(i var1) {
         this.a = var1;
      }

      public final boolean c() {
         for(int var2 = 8; var2 >= 0; --var2) {
            float var1 = this.a.u[var2];
            if (var1 > 0.0F) {
               return false;
            }

            if (var1 < 0.0F) {
               return true;
            }
         }

         return false;
      }

      public final boolean d(i var1) {
         for(int var4 = 8; var4 >= 0; --var4) {
            float var2 = var1.u[var4];
            float var3 = this.a.u[var4];
            if (var3 != var2) {
               if (var3 < var2) {
                  return true;
               }
               break;
            }
         }

         return false;
      }

      public void e() {
         Arrays.fill(this.a.u, 0.0F);
      }

      public String toString() {
         i var4 = this.a;
         String var2 = "[ ";
         String var3 = var2;
         if (var4 != null) {
            int var1 = 0;

            while(true) {
               var3 = var2;
               if (var1 >= 9) {
                  break;
               }

               StringBuilder var6 = new StringBuilder();
               var6.append(var2);
               var6.append(this.a.u[var1]);
               var6.append(" ");
               var2 = var6.toString();
               ++var1;
            }
         }

         StringBuilder var5 = new StringBuilder();
         var5.append(var3);
         var5.append("] ");
         var5.append(this.a);
         return var5.toString();
      }
   };
   c l;

   public h(c var1) {
      super(var1);
      this.l = var1;
   }

   private final void F(i var1) {
      int var2 = this.j;
      i[] var5 = this.h;
      if (var2 + 1 > var5.length) {
         var5 = (i[])Arrays.copyOf(var5, var5.length * 2);
         this.h = var5;
         this.i = (i[])Arrays.copyOf(var5, var5.length * 2);
      }

      var5 = this.h;
      var2 = this.j;
      var5[var2] = var1;
      ++var2;
      this.j = var2;
      if (var2 > 1 && var5[var2 - 1].o > var1.o) {
         byte var3 = 0;
         var2 = 0;

         while(true) {
            int var4 = this.j;
            if (var2 >= var4) {
               Arrays.sort(this.i, 0, var4, new h$a(this));

               for(var2 = var3; var2 < this.j; ++var2) {
                  this.h[var2] = this.i[var2];
               }
               break;
            }

            this.i[var2] = this.h[var2];
            ++var2;
         }
      }

      var1.m = true;
      var1.d(this);
   }

   private final void G(i var1) {
      for(int var2 = 0; var2 < this.j; ++var2) {
         if (this.h[var2] == var1) {
            while(true) {
               int var3 = this.j;
               if (var2 >= var3 - 1) {
                  this.j = var3 - 1;
                  var1.m = false;
                  return;
               }

               i[] var4 = this.h;
               var3 = var2 + 1;
               var4[var2] = var4[var3];
               var2 = var3;
            }
         }
      }

   }

   public void B(d var1, b var2, boolean var3) {
      i var9 = var2.a;
      if (var9 != null) {
         b.a var8 = var2.e;
         int var6 = var8.d();

         for(int var5 = 0; var5 < var6; ++var5) {
            i var7 = var8.h(var5);
            float var4 = var8.a(var5);
            this.k.b(var7);
            if (this.k.a(var9, var4)) {
               this.F(var7);
            }

            super.b += var2.b * var4;
         }

         this.G(var9);
      }
   }

   public void a(i var1) {
      this.k.b(var1);
      this.k.e();
      var1.u[var1.q] = 1.0F;
      this.F(var1);
   }

   public i b(d var1, boolean[] var2) {
      int var3 = 0;

      int var4;
      int var5;
      for(var5 = -1; var3 < this.j; var5 = var4) {
         i var6 = this.h[var3];
         if (var2[var6.o]) {
            var4 = var5;
         } else {
            label33: {
               this.k.b(var6);
               if (var5 == -1) {
                  var4 = var5;
                  if (!this.k.c()) {
                     break label33;
                  }
               } else {
                  var4 = var5;
                  if (!this.k.d(this.h[var5])) {
                     break label33;
                  }
               }

               var4 = var3;
            }
         }

         ++var3;
      }

      if (var5 == -1) {
         return null;
      } else {
         return this.h[var5];
      }
   }

   public void clear() {
      this.j = 0;
      super.b = 0.0F;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.j == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("");
      var2.append(" goal -> (");
      var2.append(super.b);
      var2.append(") : ");
      String var4 = var2.toString();

      for(int var1 = 0; var1 < this.j; ++var1) {
         i var3 = this.h[var1];
         this.k.b(var3);
         StringBuilder var5 = new StringBuilder();
         var5.append(var4);
         var5.append(this.k);
         var5.append(" ");
         var4 = var5.toString();
      }

      return var4;
   }
}
