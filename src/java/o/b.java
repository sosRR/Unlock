package o;

import java.util.ArrayList;

public class b implements d.a {
   i a = null;
   float b = 0.0F;
   boolean c = false;
   ArrayList d = new ArrayList();
   public a e;
   boolean f = false;

   public b() {
   }

   public b(c var1) {
      this.e = new a(this, var1);
   }

   private boolean u(i var1, d var2) {
      int var3 = var1.y;
      boolean var4 = true;
      if (var3 > 1) {
         var4 = false;
      }

      return var4;
   }

   private i w(boolean[] var1, i var2) {
      int var7 = this.e.d();
      i var9 = null;
      int var6 = 0;

      float var4;
      for(float var3 = 0.0F; var6 < var7; var3 = var4) {
         float var5 = this.e.a(var6);
         i var8 = var9;
         var4 = var3;
         if (var5 < 0.0F) {
            label35: {
               i var10 = this.e.h(var6);
               if (var1 != null) {
                  var8 = var9;
                  var4 = var3;
                  if (var1[var10.o]) {
                     break label35;
                  }
               }

               var8 = var9;
               var4 = var3;
               if (var10 != var2) {
                  label36: {
                     i.a var11 = var10.v;
                     if (var11 != i.a.o) {
                        var8 = var9;
                        var4 = var3;
                        if (var11 != i.a.p) {
                           break label36;
                        }
                     }

                     var8 = var9;
                     var4 = var3;
                     if (var5 < var3) {
                        var4 = var5;
                        var8 = var10;
                     }
                  }
               }
            }
         }

         ++var6;
         var9 = var8;
      }

      return var9;
   }

   public void A(d var1, i var2, boolean var3) {
      if (var2 != null && var2.s) {
         float var4 = this.e.g(var2);
         this.b += var2.r * var4;
         this.e.j(var2, var3);
         if (var3) {
            var2.g(this);
         }

         if (o.d.t && this.e.d() == 0) {
            this.f = true;
            var1.a = true;
         }
      }

   }

   public void B(d var1, b var2, boolean var3) {
      float var4 = this.e.f(var2, var3);
      this.b += var2.b * var4;
      if (var3) {
         var2.a.g(this);
      }

      if (o.d.t && this.a != null && this.e.d() == 0) {
         this.f = true;
         var1.a = true;
      }

   }

   public void C(d var1, i var2, boolean var3) {
      if (var2 != null && var2.z) {
         float var4 = this.e.g(var2);
         this.b += var2.B * var4;
         this.e.j(var2, var3);
         if (var3) {
            var2.g(this);
         }

         this.e.b(var1.n.d[var2.A], var4, var3);
         if (o.d.t && this.e.d() == 0) {
            this.f = true;
            var1.a = true;
         }
      }

   }

   public void D(d var1) {
      if (var1.g.length != 0) {
         boolean var2 = false;

         while(true) {
            while(!var2) {
               int var4 = this.e.d();

               int var3;
               i var5;
               for(var3 = 0; var3 < var4; ++var3) {
                  var5 = this.e.h(var3);
                  if (var5.p != -1 || var5.s || var5.z) {
                     this.d.add(var5);
                  }
               }

               var4 = this.d.size();
               if (var4 > 0) {
                  for(var3 = 0; var3 < var4; ++var3) {
                     var5 = (i)this.d.get(var3);
                     if (var5.s) {
                        this.A(var1, var5, true);
                     } else if (var5.z) {
                        this.C(var1, var5, true);
                     } else {
                        this.B(var1, var1.g[var5.p], true);
                     }
                  }

                  this.d.clear();
               } else {
                  var2 = true;
               }
            }

            if (o.d.t && this.a != null && this.e.d() == 0) {
               this.f = true;
               var1.a = true;
            }

            return;
         }
      }
   }

   public void a(i var1) {
      int var3 = var1.q;
      float var2 = 1.0F;
      if (var3 != 1) {
         if (var3 == 2) {
            var2 = 1000.0F;
         } else if (var3 == 3) {
            var2 = 1000000.0F;
         } else if (var3 == 4) {
            var2 = 1.0E9F;
         } else if (var3 == 5) {
            var2 = 1.0E12F;
         }
      }

      this.e.c(var1, var2);
   }

   public i b(d var1, boolean[] var2) {
      return this.w(var2, (i)null);
   }

   public void c(d.a var1) {
      if (var1 instanceof b) {
         b var5 = (b)var1;
         this.a = null;
         this.e.clear();

         for(int var3 = 0; var3 < var5.e.d(); ++var3) {
            i var4 = var5.e.h(var3);
            float var2 = var5.e.a(var3);
            this.e.b(var4, var2, true);
         }
      }

   }

   public void clear() {
      this.e.clear();
      this.a = null;
      this.b = 0.0F;
   }

   public b d(d var1, int var2) {
      this.e.c(var1.o(var2, "ep"), 1.0F);
      this.e.c(var1.o(var2, "em"), -1.0F);
      return this;
   }

   b e(i var1, int var2) {
      this.e.c(var1, (float)var2);
      return this;
   }

   boolean f(d var1) {
      i var3 = this.g(var1);
      boolean var2;
      if (var3 == null) {
         var2 = true;
      } else {
         this.x(var3);
         var2 = false;
      }

      if (this.e.d() == 0) {
         this.f = true;
      }

      return var2;
   }

   i g(d var1) {
      int var8 = this.e.d();
      i var17 = null;
      float var6 = 0.0F;
      float var5 = 0.0F;
      int var7 = 0;
      boolean var12 = false;
      boolean var11 = var12;

      float var4;
      i var16;
      for(var16 = null; var7 < var8; var5 = var4) {
         float var2 = this.e.a(var7);
         i var13 = this.e.h(var7);
         float var3;
         boolean var9;
         boolean var10;
         i var14;
         i var15;
         if (var13.v == i.a.m) {
            label40: {
               if (var17 == null) {
                  var9 = this.u(var13, var1);
               } else {
                  if (!(var6 > var2)) {
                     var14 = var17;
                     var15 = var16;
                     var9 = var12;
                     var10 = var11;
                     var3 = var6;
                     var4 = var5;
                     if (!var12) {
                        var14 = var17;
                        var15 = var16;
                        var9 = var12;
                        var10 = var11;
                        var3 = var6;
                        var4 = var5;
                        if (this.u(var13, var1)) {
                           var9 = true;
                           var14 = var13;
                           var15 = var16;
                           var10 = var11;
                           var3 = var2;
                           var4 = var5;
                        }
                     }
                     break label40;
                  }

                  var9 = this.u(var13, var1);
               }

               var14 = var13;
               var15 = var16;
               var10 = var11;
               var3 = var2;
               var4 = var5;
            }
         } else {
            var14 = var17;
            var15 = var16;
            var9 = var12;
            var10 = var11;
            var3 = var6;
            var4 = var5;
            if (var17 == null) {
               var14 = var17;
               var15 = var16;
               var9 = var12;
               var10 = var11;
               var3 = var6;
               var4 = var5;
               if (var2 < 0.0F) {
                  label59: {
                     if (var16 == null) {
                        var9 = this.u(var13, var1);
                     } else {
                        if (!(var5 > var2)) {
                           var14 = var17;
                           var15 = var16;
                           var9 = var12;
                           var10 = var11;
                           var3 = var6;
                           var4 = var5;
                           if (!var11) {
                              var14 = var17;
                              var15 = var16;
                              var9 = var12;
                              var10 = var11;
                              var3 = var6;
                              var4 = var5;
                              if (this.u(var13, var1)) {
                                 var10 = true;
                                 var4 = var2;
                                 var3 = var6;
                                 var9 = var12;
                                 var15 = var13;
                                 var14 = var17;
                              }
                           }
                           break label59;
                        }

                        var9 = this.u(var13, var1);
                     }

                     var10 = var9;
                     var14 = var17;
                     var15 = var13;
                     var9 = var12;
                     var3 = var6;
                     var4 = var2;
                  }
               }
            }
         }

         ++var7;
         var17 = var14;
         var16 = var15;
         var12 = var9;
         var11 = var10;
         var6 = var3;
      }

      if (var17 != null) {
         return var17;
      } else {
         return var16;
      }
   }

   public i getKey() {
      return this.a;
   }

   b h(i var1, i var2, int var3, float var4, i var5, i var6, int var7) {
      if (var2 == var5) {
         this.e.c(var1, 1.0F);
         this.e.c(var6, 1.0F);
         this.e.c(var2, -2.0F);
         return this;
      } else {
         if (var4 == 0.5F) {
            this.e.c(var1, 1.0F);
            this.e.c(var2, -1.0F);
            this.e.c(var5, -1.0F);
            this.e.c(var6, 1.0F);
            if (var3 > 0 || var7 > 0) {
               this.b = (float)(-var3 + var7);
            }
         } else if (var4 <= 0.0F) {
            this.e.c(var1, -1.0F);
            this.e.c(var2, 1.0F);
            this.b = (float)var3;
         } else if (var4 >= 1.0F) {
            this.e.c(var6, -1.0F);
            this.e.c(var5, 1.0F);
            this.b = (float)(-var7);
         } else {
            a var9 = this.e;
            float var8 = 1.0F - var4;
            var9.c(var1, var8 * 1.0F);
            this.e.c(var2, var8 * -1.0F);
            this.e.c(var5, -1.0F * var4);
            this.e.c(var6, 1.0F * var4);
            if (var3 > 0 || var7 > 0) {
               this.b = (float)(-var3) * var8 + (float)var7 * var4;
            }
         }

         return this;
      }
   }

   b i(i var1, int var2) {
      this.a = var1;
      float var3 = (float)var2;
      var1.r = var3;
      this.b = var3;
      this.f = true;
      return this;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.a == null && this.b == 0.0F && this.e.d() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   b j(i var1, i var2, float var3) {
      this.e.c(var1, -1.0F);
      this.e.c(var2, var3);
      return this;
   }

   public b k(i var1, i var2, i var3, i var4, float var5) {
      this.e.c(var1, -1.0F);
      this.e.c(var2, 1.0F);
      this.e.c(var3, var5);
      this.e.c(var4, -var5);
      return this;
   }

   public b l(float var1, float var2, float var3, i var4, i var5, i var6, i var7) {
      this.b = 0.0F;
      if (var2 != 0.0F && var1 != var3) {
         if (var1 == 0.0F) {
            this.e.c(var4, 1.0F);
            this.e.c(var5, -1.0F);
         } else if (var3 == 0.0F) {
            this.e.c(var6, 1.0F);
            this.e.c(var7, -1.0F);
         } else {
            var1 = var1 / var2 / (var3 / var2);
            this.e.c(var4, 1.0F);
            this.e.c(var5, -1.0F);
            this.e.c(var7, var1);
            this.e.c(var6, -var1);
         }
      } else {
         this.e.c(var4, 1.0F);
         this.e.c(var5, -1.0F);
         this.e.c(var7, 1.0F);
         this.e.c(var6, -1.0F);
      }

      return this;
   }

   public b m(i var1, int var2) {
      if (var2 < 0) {
         this.b = (float)(var2 * -1);
         this.e.c(var1, 1.0F);
      } else {
         this.b = (float)var2;
         this.e.c(var1, -1.0F);
      }

      return this;
   }

   public b n(i var1, i var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      if (var3 != 0) {
         var4 = var5;
         int var6 = var3;
         if (var3 < 0) {
            var6 = var3 * -1;
            var4 = true;
         }

         this.b = (float)var6;
      }

      if (!var4) {
         this.e.c(var1, -1.0F);
         this.e.c(var2, 1.0F);
      } else {
         this.e.c(var1, 1.0F);
         this.e.c(var2, -1.0F);
      }

      return this;
   }

   public b o(i var1, i var2, i var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;
      if (var4 != 0) {
         var5 = var6;
         int var7 = var4;
         if (var4 < 0) {
            var7 = var4 * -1;
            var5 = true;
         }

         this.b = (float)var7;
      }

      if (!var5) {
         this.e.c(var1, -1.0F);
         this.e.c(var2, 1.0F);
         this.e.c(var3, 1.0F);
      } else {
         this.e.c(var1, 1.0F);
         this.e.c(var2, -1.0F);
         this.e.c(var3, -1.0F);
      }

      return this;
   }

   public b p(i var1, i var2, i var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;
      if (var4 != 0) {
         var5 = var6;
         int var7 = var4;
         if (var4 < 0) {
            var7 = var4 * -1;
            var5 = true;
         }

         this.b = (float)var7;
      }

      if (!var5) {
         this.e.c(var1, -1.0F);
         this.e.c(var2, 1.0F);
         this.e.c(var3, -1.0F);
      } else {
         this.e.c(var1, 1.0F);
         this.e.c(var2, -1.0F);
         this.e.c(var3, 1.0F);
      }

      return this;
   }

   public b q(i var1, i var2, i var3, i var4, float var5) {
      this.e.c(var3, 0.5F);
      this.e.c(var4, 0.5F);
      this.e.c(var1, -0.5F);
      this.e.c(var2, -0.5F);
      this.b = -var5;
      return this;
   }

   void r() {
      float var1 = this.b;
      if (var1 < 0.0F) {
         this.b = var1 * -1.0F;
         this.e.k();
      }

   }

   boolean s() {
      i var2 = this.a;
      boolean var1;
      if (var2 == null || var2.v != i.a.m && this.b < 0.0F) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   boolean t(i var1) {
      return this.e.e(var1);
   }

   public String toString() {
      return this.z();
   }

   public i v(i var1) {
      return this.w((boolean[])null, var1);
   }

   void x(i var1) {
      i var3 = this.a;
      if (var3 != null) {
         this.e.c(var3, -1.0F);
         this.a.p = -1;
         this.a = null;
      }

      float var2 = this.e.j(var1, true) * -1.0F;
      this.a = var1;
      if (var2 != 1.0F) {
         this.b /= var2;
         this.e.i(var2);
      }
   }

   public void y() {
      this.a = null;
      this.e.clear();
      this.b = 0.0F;
      this.f = false;
   }

   String z() {
      StringBuilder var7;
      String var10;
      if (this.a == null) {
         var7 = new StringBuilder();
         var7.append("");
         var7.append("0");
         var10 = var7.toString();
      } else {
         var7 = new StringBuilder();
         var7.append("");
         var7.append(this.a);
         var10 = var7.toString();
      }

      StringBuilder var8 = new StringBuilder();
      var8.append(var10);
      var8.append(" = ");
      var10 = var8.toString();
      float var1 = this.b;
      int var4 = 0;
      boolean var3;
      if (var1 != 0.0F) {
         var8 = new StringBuilder();
         var8.append(var10);
         var8.append(this.b);
         var10 = var8.toString();
         var3 = true;
      } else {
         var3 = false;
      }

      String var12;
      for(int var5 = this.e.d(); var4 < var5; ++var4) {
         i var11 = this.e.h(var4);
         if (var11 != null) {
            float var2 = this.e.a(var4);
            float var13;
            int var6 = (var13 = var2 - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            if (var6 != 0) {
               String var9;
               label51: {
                  var9 = var11.toString();
                  if (!var3) {
                     var12 = var10;
                     var1 = var2;
                     if (!(var2 < 0.0F)) {
                        break label51;
                     }

                     var8 = new StringBuilder();
                     var8.append(var10);
                     var8.append("- ");
                     var12 = var8.toString();
                  } else {
                     if (var6 > 0) {
                        var8 = new StringBuilder();
                        var8.append(var10);
                        var8.append(" + ");
                        var12 = var8.toString();
                        var1 = var2;
                        break label51;
                     }

                     var8 = new StringBuilder();
                     var8.append(var10);
                     var8.append(" - ");
                     var12 = var8.toString();
                  }

                  var1 = var2 * -1.0F;
               }

               if (var1 == 1.0F) {
                  var7 = new StringBuilder();
                  var7.append(var12);
                  var7.append(var9);
                  var10 = var7.toString();
               } else {
                  var7 = new StringBuilder();
                  var7.append(var12);
                  var7.append(var1);
                  var7.append(" ");
                  var7.append(var9);
                  var10 = var7.toString();
               }

               var3 = true;
            }
         }
      }

      var12 = var10;
      if (!var3) {
         var8 = new StringBuilder();
         var8.append(var10);
         var8.append("0.0");
         var12 = var8.toString();
      }

      return var12;
   }

   public interface a {
      float a(int var1);

      void b(i var1, float var2, boolean var3);

      void c(i var1, float var2);

      void clear();

      int d();

      boolean e(i var1);

      float f(b var1, boolean var2);

      float g(i var1);

      i h(int var1);

      void i(float var1);

      float j(i var1, boolean var2);

      void k();
   }
}
