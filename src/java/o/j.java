package o;

import java.util.Arrays;

public class j implements b.a {
   private static float n;
   private final int a = -1;
   private int b = 16;
   private int c = 16;
   int[] d = new int[16];
   int[] e = new int[16];
   int[] f = new int[16];
   float[] g = new float[16];
   int[] h = new int[16];
   int[] i = new int[16];
   int j = 0;
   int k = -1;
   private final b l;
   protected final c m;

   j(b var1, c var2) {
      this.l = var1;
      this.m = var2;
      this.clear();
   }

   private void l(i var1, int var2) {
      int var5 = var1.o % this.c;
      int[] var6 = this.d;
      int var4 = var6[var5];
      int var3 = var4;
      if (var4 == -1) {
         var6[var5] = var2;
      } else {
         while(true) {
            var6 = this.e;
            var4 = var6[var3];
            if (var4 == -1) {
               var6[var3] = var2;
               break;
            }

            var3 = var4;
         }
      }

      this.e[var2] = -1;
   }

   private void m(int var1, i var2, float var3) {
      this.f[var1] = var2.o;
      this.g[var1] = var3;
      this.h[var1] = -1;
      this.i[var1] = -1;
      var2.d(this.l);
      ++var2.y;
      ++this.j;
   }

   private int n() {
      for(int var1 = 0; var1 < this.b; ++var1) {
         if (this.f[var1] == -1) {
            return var1;
         }
      }

      return -1;
   }

   private void o() {
      int var2 = this.b * 2;
      this.f = Arrays.copyOf(this.f, var2);
      this.g = Arrays.copyOf(this.g, var2);
      this.h = Arrays.copyOf(this.h, var2);
      this.i = Arrays.copyOf(this.i, var2);
      this.e = Arrays.copyOf(this.e, var2);

      for(int var1 = this.b; var1 < var2; ++var1) {
         this.f[var1] = -1;
         this.e[var1] = -1;
      }

      this.b = var2;
   }

   private void q(int var1, i var2, float var3) {
      int var4 = this.n();
      this.m(var4, var2, var3);
      if (var1 != -1) {
         this.h[var4] = var1;
         int[] var5 = this.i;
         var5[var4] = var5[var1];
         var5[var1] = var4;
      } else {
         this.h[var4] = -1;
         if (this.j > 0) {
            this.i[var4] = this.k;
            this.k = var4;
         } else {
            this.i[var4] = -1;
         }
      }

      var1 = this.i[var4];
      if (var1 != -1) {
         this.h[var1] = var4;
      }

      this.l(var2, var4);
   }

   private void r(i var1) {
      int var4 = var1.o;
      int var5 = var4 % this.c;
      int[] var7 = this.d;
      int var3 = var7[var5];
      if (var3 != -1) {
         int var2 = var3;
         if (this.f[var3] == var4) {
            int[] var6 = this.e;
            var7[var5] = var6[var3];
            var6[var3] = -1;
         } else {
            while(true) {
               var7 = this.e;
               var3 = var7[var2];
               if (var3 == -1 || this.f[var3] == var4) {
                  if (var3 != -1 && this.f[var3] == var4) {
                     var7[var2] = var7[var3];
                     var7[var3] = -1;
                  }
                  break;
               }

               var2 = var3;
            }
         }

      }
   }

   public float a(int var1) {
      int var4 = this.j;
      int var3 = this.k;

      for(int var2 = 0; var2 < var4; ++var2) {
         if (var2 == var1) {
            return this.g[var3];
         }

         var3 = this.i[var3];
         if (var3 == -1) {
            break;
         }
      }

      return 0.0F;
   }

   public void b(i var1, float var2, boolean var3) {
      float var4 = n;
      if (!(var2 > -var4) || !(var2 < var4)) {
         int var5 = this.p(var1);
         if (var5 == -1) {
            this.c(var1, var2);
         } else {
            float[] var6 = this.g;
            var2 += var6[var5];
            var6[var5] = var2;
            var4 = n;
            if (var2 > -var4 && var2 < var4) {
               var6[var5] = 0.0F;
               this.j(var1, var3);
            }
         }

      }
   }

   public void c(i var1, float var2) {
      float var3 = n;
      if (var2 > -var3 && var2 < var3) {
         this.j(var1, true);
      } else {
         int var4 = this.j;
         int var6 = 0;
         if (var4 == 0) {
            this.m(0, var1, var2);
            this.l(var1, 0);
            this.k = 0;
         } else {
            var4 = this.p(var1);
            if (var4 != -1) {
               this.g[var4] = var2;
            } else {
               if (this.j + 1 >= this.b) {
                  this.o();
               }

               int var8 = this.j;
               var4 = this.k;
               int var5 = -1;

               while(true) {
                  int var7 = var5;
                  if (var6 < var8) {
                     var7 = this.f[var4];
                     int var9 = var1.o;
                     if (var7 == var9) {
                        this.g[var4] = var2;
                        return;
                     }

                     if (var7 < var9) {
                        var5 = var4;
                     }

                     var4 = this.i[var4];
                     if (var4 != -1) {
                        ++var6;
                        continue;
                     }

                     var7 = var5;
                  }

                  this.q(var7, var1, var2);
                  break;
               }
            }
         }

      }
   }

   public void clear() {
      int var2 = this.j;

      int var1;
      for(var1 = 0; var1 < var2; ++var1) {
         i var3 = this.h(var1);
         if (var3 != null) {
            var3.g(this.l);
         }
      }

      for(var1 = 0; var1 < this.b; ++var1) {
         this.f[var1] = -1;
         this.e[var1] = -1;
      }

      for(var1 = 0; var1 < this.c; ++var1) {
         this.d[var1] = -1;
      }

      this.j = 0;
      this.k = -1;
   }

   public int d() {
      return this.j;
   }

   public boolean e(i var1) {
      boolean var2;
      if (this.p(var1) != -1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public float f(b var1, boolean var2) {
      float var4 = this.g(var1.a);
      this.j(var1.a, var2);
      j var10 = (j)var1.e;
      int var8 = var10.d();
      int var6 = 0;

      int var7;
      for(int var5 = 0; var6 < var8; var6 = var7) {
         int var9 = var10.f[var5];
         var7 = var6;
         if (var9 != -1) {
            float var3 = var10.g[var5];
            this.b(this.m.d[var9], var3 * var4, var2);
            var7 = var6 + 1;
         }

         ++var5;
      }

      return var4;
   }

   public float g(i var1) {
      int var2 = this.p(var1);
      return var2 != -1 ? this.g[var2] : 0.0F;
   }

   public i h(int var1) {
      int var4 = this.j;
      if (var4 == 0) {
         return null;
      } else {
         int var3 = this.k;

         for(int var2 = 0; var2 < var4; ++var2) {
            if (var2 == var1 && var3 != -1) {
               return this.m.d[this.f[var3]];
            }

            var3 = this.i[var3];
            if (var3 == -1) {
               break;
            }
         }

         return null;
      }
   }

   public void i(float var1) {
      int var4 = this.j;
      int var3 = this.k;

      for(int var2 = 0; var2 < var4; ++var2) {
         float[] var5 = this.g;
         var5[var3] /= var1;
         var3 = this.i[var3];
         if (var3 == -1) {
            break;
         }
      }

   }

   public float j(i var1, boolean var2) {
      int var4 = this.p(var1);
      if (var4 == -1) {
         return 0.0F;
      } else {
         this.r(var1);
         float var3 = this.g[var4];
         if (this.k == var4) {
            this.k = this.i[var4];
         }

         this.f[var4] = -1;
         int[] var7 = this.h;
         int var5 = var7[var4];
         if (var5 != -1) {
            int[] var6 = this.i;
            var6[var5] = var6[var4];
         }

         var5 = this.i[var4];
         if (var5 != -1) {
            var7[var5] = var7[var4];
         }

         --this.j;
         --var1.y;
         if (var2) {
            var1.g(this.l);
         }

         return var3;
      }
   }

   public void k() {
      int var3 = this.j;
      int var2 = this.k;

      for(int var1 = 0; var1 < var3; ++var1) {
         float[] var4 = this.g;
         var4[var2] *= -1.0F;
         var2 = this.i[var2];
         if (var2 == -1) {
            break;
         }
      }

   }

   public int p(i var1) {
      if (this.j != 0 && var1 != null) {
         int var4 = var1.o;
         int var2 = this.c;
         int var3 = this.d[var4 % var2];
         if (var3 == -1) {
            return -1;
         }

         var2 = var3;
         if (this.f[var3] == var4) {
            return var3;
         }

         do {
            var2 = this.e[var2];
         } while(var2 != -1 && this.f[var2] != var4);

         if (var2 == -1) {
            return -1;
         }

         if (this.f[var2] == var4) {
            return var2;
         }
      }

      return -1;
   }

   public String toString() {
      StringBuilder var4 = new StringBuilder();
      var4.append(this.hashCode());
      var4.append(" { ");
      String var7 = var4.toString();
      int var2 = this.j;

      StringBuilder var8;
      for(int var1 = 0; var1 < var2; ++var1) {
         i var5 = this.h(var1);
         if (var5 != null) {
            StringBuilder var6 = new StringBuilder();
            var6.append(var7);
            var6.append(var5);
            var6.append(" = ");
            var6.append(this.a(var1));
            var6.append(" ");
            var7 = var6.toString();
            int var3 = this.p(var5);
            var8 = new StringBuilder();
            var8.append(var7);
            var8.append("[p: ");
            var7 = var8.toString();
            if (this.h[var3] != -1) {
               var8 = new StringBuilder();
               var8.append(var7);
               var8.append(this.m.d[this.f[this.h[var3]]]);
               var7 = var8.toString();
            } else {
               var8 = new StringBuilder();
               var8.append(var7);
               var8.append("none");
               var7 = var8.toString();
            }

            var8 = new StringBuilder();
            var8.append(var7);
            var8.append(", n: ");
            var7 = var8.toString();
            if (this.i[var3] != -1) {
               var8 = new StringBuilder();
               var8.append(var7);
               var8.append(this.m.d[this.f[this.i[var3]]]);
               var7 = var8.toString();
            } else {
               var8 = new StringBuilder();
               var8.append(var7);
               var8.append("none");
               var7 = var8.toString();
            }

            var8 = new StringBuilder();
            var8.append(var7);
            var8.append("]");
            var7 = var8.toString();
         }
      }

      var8 = new StringBuilder();
      var8.append(var7);
      var8.append(" }");
      return var8.toString();
   }
}
