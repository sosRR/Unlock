package o;

import java.util.Arrays;

public class a implements b.a {
   private static float l;
   int a = 0;
   private final b b;
   protected final c c;
   private int d = 8;
   private i e = null;
   private int[] f = new int[8];
   private int[] g = new int[8];
   private float[] h = new float[8];
   private int i = -1;
   private int j = -1;
   private boolean k = false;

   a(b var1, c var2) {
      this.b = var1;
      this.c = var2;
   }

   public float a(int var1) {
      int var3 = this.i;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (var2 == var1) {
            return this.h[var3];
         }

         var3 = this.g[var3];
      }

      return 0.0F;
   }

   public void b(i var1, float var2, boolean var3) {
      float var4 = l;
      if (!(var2 > -var4) || !(var2 < var4)) {
         int var6 = this.i;
         int[] var12;
         if (var6 == -1) {
            this.i = 0;
            this.h[0] = var2;
            this.f[0] = var1.o;
            this.g[0] = -1;
            ++var1.y;
            var1.d(this.b);
            ++this.a;
            if (!this.k) {
               var6 = this.j + 1;
               this.j = var6;
               var12 = this.f;
               if (var6 >= var12.length) {
                  this.k = true;
                  this.j = var12.length - 1;
               }
            }

         } else {
            int var7 = 0;

            int var8;
            int var9;
            int[] var13;
            for(var9 = -1; var6 != -1 && var7 < this.a; ++var7) {
               var8 = this.f[var6];
               int var10 = var1.o;
               if (var8 == var10) {
                  float[] var11 = this.h;
                  var4 = var11[var6] + var2;
                  float var5 = l;
                  var2 = var4;
                  if (var4 > -var5) {
                     var2 = var4;
                     if (var4 < var5) {
                        var2 = 0.0F;
                     }
                  }

                  var11[var6] = var2;
                  if (var2 == 0.0F) {
                     if (var6 == this.i) {
                        this.i = this.g[var6];
                     } else {
                        var13 = this.g;
                        var13[var9] = var13[var6];
                     }

                     if (var3) {
                        var1.g(this.b);
                     }

                     if (this.k) {
                        this.j = var6;
                     }

                     --var1.y;
                     --this.a;
                  }

                  return;
               }

               if (var8 < var10) {
                  var9 = var6;
               }

               var6 = this.g[var6];
            }

            var6 = this.j;
            if (this.k) {
               var13 = this.f;
               if (var13[var6] != -1) {
                  var6 = var13.length;
               }
            } else {
               ++var6;
            }

            var13 = this.f;
            var7 = var6;
            if (var6 >= var13.length) {
               var7 = var6;
               if (this.a < var13.length) {
                  var8 = 0;

                  while(true) {
                     var13 = this.f;
                     var7 = var6;
                     if (var8 >= var13.length) {
                        break;
                     }

                     if (var13[var8] == -1) {
                        var7 = var8;
                        break;
                     }

                     ++var8;
                  }
               }
            }

            var13 = this.f;
            var6 = var7;
            if (var7 >= var13.length) {
               var6 = var13.length;
               var7 = this.d * 2;
               this.d = var7;
               this.k = false;
               this.j = var6 - 1;
               this.h = Arrays.copyOf(this.h, var7);
               this.f = Arrays.copyOf(this.f, this.d);
               this.g = Arrays.copyOf(this.g, this.d);
            }

            this.f[var6] = var1.o;
            this.h[var6] = var2;
            if (var9 != -1) {
               var13 = this.g;
               var13[var6] = var13[var9];
               var13[var9] = var6;
            } else {
               this.g[var6] = this.i;
               this.i = var6;
            }

            ++var1.y;
            var1.d(this.b);
            ++this.a;
            if (!this.k) {
               ++this.j;
            }

            var6 = this.j;
            var12 = this.f;
            if (var6 >= var12.length) {
               this.k = true;
               this.j = var12.length - 1;
            }

         }
      }
   }

   public final void c(i var1, float var2) {
      if (var2 == 0.0F) {
         this.j(var1, true);
      } else {
         int var3 = this.i;
         int[] var9;
         if (var3 == -1) {
            this.i = 0;
            this.h[0] = var2;
            this.f[0] = var1.o;
            this.g[0] = -1;
            ++var1.y;
            var1.d(this.b);
            ++this.a;
            if (!this.k) {
               var3 = this.j + 1;
               this.j = var3;
               var9 = this.f;
               if (var3 >= var9.length) {
                  this.k = true;
                  this.j = var9.length - 1;
               }
            }

         } else {
            int var4 = 0;

            int var5;
            int var6;
            for(var6 = -1; var3 != -1 && var4 < this.a; ++var4) {
               int var7 = this.f[var3];
               var5 = var1.o;
               if (var7 == var5) {
                  this.h[var3] = var2;
                  return;
               }

               if (var7 < var5) {
                  var6 = var3;
               }

               var3 = this.g[var3];
            }

            var3 = this.j;
            int[] var8;
            if (this.k) {
               var8 = this.f;
               if (var8[var3] != -1) {
                  var3 = var8.length;
               }
            } else {
               ++var3;
            }

            var8 = this.f;
            var4 = var3;
            if (var3 >= var8.length) {
               var4 = var3;
               if (this.a < var8.length) {
                  var5 = 0;

                  while(true) {
                     var8 = this.f;
                     var4 = var3;
                     if (var5 >= var8.length) {
                        break;
                     }

                     if (var8[var5] == -1) {
                        var4 = var5;
                        break;
                     }

                     ++var5;
                  }
               }
            }

            var8 = this.f;
            var3 = var4;
            if (var4 >= var8.length) {
               var3 = var8.length;
               var4 = this.d * 2;
               this.d = var4;
               this.k = false;
               this.j = var3 - 1;
               this.h = Arrays.copyOf(this.h, var4);
               this.f = Arrays.copyOf(this.f, this.d);
               this.g = Arrays.copyOf(this.g, this.d);
            }

            this.f[var3] = var1.o;
            this.h[var3] = var2;
            if (var6 != -1) {
               var8 = this.g;
               var8[var3] = var8[var6];
               var8[var6] = var3;
            } else {
               this.g[var3] = this.i;
               this.i = var3;
            }

            ++var1.y;
            var1.d(this.b);
            var3 = this.a + 1;
            this.a = var3;
            if (!this.k) {
               ++this.j;
            }

            var9 = this.f;
            if (var3 >= var9.length) {
               this.k = true;
            }

            if (this.j >= var9.length) {
               this.k = true;
               this.j = var9.length - 1;
            }

         }
      }
   }

   public final void clear() {
      int var2 = this.i;

      for(int var1 = 0; var2 != -1 && var1 < this.a; ++var1) {
         i var3 = this.c.d[this.f[var2]];
         if (var3 != null) {
            var3.g(this.b);
         }

         var2 = this.g[var2];
      }

      this.i = -1;
      this.j = -1;
      this.k = false;
      this.a = 0;
   }

   public int d() {
      return this.a;
   }

   public boolean e(i var1) {
      int var3 = this.i;
      if (var3 == -1) {
         return false;
      } else {
         for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
            if (this.f[var3] == var1.o) {
               return true;
            }

            var3 = this.g[var3];
         }

         return false;
      }
   }

   public float f(b var1, boolean var2) {
      float var3 = this.g(var1.a);
      this.j(var1.a, var2);
      b.a var6 = var1.e;
      int var5 = var6.d();

      for(int var4 = 0; var4 < var5; ++var4) {
         i var7 = var6.h(var4);
         this.b(var7, var6.g(var7) * var3, var2);
      }

      return var3;
   }

   public final float g(i var1) {
      int var3 = this.i;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (this.f[var3] == var1.o) {
            return this.h[var3];
         }

         var3 = this.g[var3];
      }

      return 0.0F;
   }

   public i h(int var1) {
      int var3 = this.i;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         if (var2 == var1) {
            return this.c.d[this.f[var3]];
         }

         var3 = this.g[var3];
      }

      return null;
   }

   public void i(float var1) {
      int var3 = this.i;

      for(int var2 = 0; var3 != -1 && var2 < this.a; ++var2) {
         float[] var4 = this.h;
         var4[var3] /= var1;
         var3 = this.g[var3];
      }

   }

   public final float j(i var1, boolean var2) {
      if (this.e == var1) {
         this.e = null;
      }

      int var3 = this.i;
      if (var3 == -1) {
         return 0.0F;
      } else {
         int var5 = 0;

         int var6;
         for(int var4 = -1; var3 != -1 && var5 < this.a; var3 = var6) {
            if (this.f[var3] == var1.o) {
               if (var3 == this.i) {
                  this.i = this.g[var3];
               } else {
                  int[] var7 = this.g;
                  var7[var4] = var7[var3];
               }

               if (var2) {
                  var1.g(this.b);
               }

               --var1.y;
               --this.a;
               this.f[var3] = -1;
               if (this.k) {
                  this.j = var3;
               }

               return this.h[var3];
            }

            var6 = this.g[var3];
            ++var5;
            var4 = var3;
         }

         return 0.0F;
      }
   }

   public void k() {
      int var2 = this.i;

      for(int var1 = 0; var2 != -1 && var1 < this.a; ++var1) {
         float[] var3 = this.h;
         var3[var2] *= -1.0F;
         var2 = this.g[var2];
      }

   }

   public String toString() {
      int var2 = this.i;
      String var3 = "";

      for(int var1 = 0; var2 != -1 && var1 < this.a; ++var1) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var3);
         var4.append(" -> ");
         String var6 = var4.toString();
         StringBuilder var5 = new StringBuilder();
         var5.append(var6);
         var5.append(this.h[var2]);
         var5.append(" : ");
         var6 = var5.toString();
         var5 = new StringBuilder();
         var5.append(var6);
         var5.append(this.c.d[this.f[var2]]);
         var3 = var5.toString();
         var2 = this.g[var2];
      }

      return var3;
   }
}
