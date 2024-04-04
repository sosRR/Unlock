package o;

import java.util.Arrays;
import java.util.HashMap;

public class d {
   public static boolean r;
   public static boolean s;
   public static boolean t;
   public static boolean u;
   public static boolean v;
   private static int w;
   public static long x;
   public static long y;
   public boolean a = false;
   int b = 0;
   private HashMap c = null;
   private a d;
   private int e = 32;
   private int f = 32;
   b[] g = null;
   public boolean h = false;
   public boolean i = false;
   private boolean[] j = new boolean[32];
   int k = 1;
   int l = 0;
   private int m = 32;
   final c n;
   private i[] o;
   private int p;
   private a q;

   public d() {
      this.o = new i[w];
      this.p = 0;
      this.g = new b[32];
      this.C();
      c var1 = new c();
      this.n = var1;
      this.d = new h(var1);
      if (v) {
         this.q = new b(this, var1) {
            final d g;

            public {
               this.g = var1;
               super.e = new j(this, var2);
            }
         };
      } else {
         this.q = new b(var1);
      }

   }

   private final int B(a var1, boolean var2) {
      int var6;
      for(var6 = 0; var6 < this.k; ++var6) {
         this.j[var6] = false;
      }

      boolean var7 = false;
      var6 = 0;

      while(true) {
         while(!var7) {
            int var10 = var6 + 1;
            if (var10 >= this.k * 2) {
               return var10;
            }

            if (var1.getKey() != null) {
               this.j[var1.getKey().o] = true;
            }

            i var11 = var1.b(this, this.j);
            if (var11 != null) {
               boolean[] var12 = this.j;
               var6 = var11.o;
               if (var12[var6]) {
                  return var10;
               }

               var12[var6] = true;
            }

            if (var11 != null) {
               float var4 = Float.MAX_VALUE;
               var6 = 0;

               int var8;
               int var9;
               b var13;
               for(var8 = -1; var6 < this.l; var8 = var9) {
                  var13 = this.g[var6];
                  float var3;
                  if (var13.a.v == i.a.m) {
                     var3 = var4;
                     var9 = var8;
                  } else if (var13.f) {
                     var3 = var4;
                     var9 = var8;
                  } else {
                     var3 = var4;
                     var9 = var8;
                     if (var13.t(var11)) {
                        float var5 = var13.e.g(var11);
                        var3 = var4;
                        var9 = var8;
                        if (var5 < 0.0F) {
                           var5 = -var13.b / var5;
                           var3 = var4;
                           var9 = var8;
                           if (var5 < var4) {
                              var9 = var6;
                              var3 = var5;
                           }
                        }
                     }
                  }

                  ++var6;
                  var4 = var3;
               }

               var6 = var10;
               if (var8 > -1) {
                  var13 = this.g[var8];
                  var13.a.p = -1;
                  var13.x(var11);
                  var11 = var13.a;
                  var11.p = var8;
                  var11.k(this, var13);
                  var6 = var10;
               }
            } else {
               var7 = true;
               var6 = var10;
            }
         }

         return var6;
      }
   }

   private void C() {
      boolean var3 = v;
      int var1 = 0;
      byte var2 = 0;
      b var4;
      if (var3) {
         for(var1 = var2; var1 < this.l; ++var1) {
            var4 = this.g[var1];
            if (var4 != null) {
               this.n.a.a(var4);
            }

            this.g[var1] = null;
         }
      } else {
         while(var1 < this.l) {
            var4 = this.g[var1];
            if (var4 != null) {
               this.n.b.a(var4);
            }

            this.g[var1] = null;
            ++var1;
         }
      }

   }

   private i a(i.a var1, String var2) {
      i var5 = (i)this.n.c.b();
      i var6;
      if (var5 == null) {
         var5 = new i(var1, var2);
         var5.j(var1, var2);
         var6 = var5;
      } else {
         var5.h();
         var5.j(var1, var2);
         var6 = var5;
      }

      int var4 = this.p;
      int var3 = w;
      if (var4 >= var3) {
         var3 *= 2;
         w = var3;
         this.o = (i[])Arrays.copyOf(this.o, var3);
      }

      i[] var7 = this.o;
      var3 = this.p++;
      var7[var3] = var6;
      return var6;
   }

   private final void l(b var1) {
      int var2;
      b[] var6;
      if (t && var1.f) {
         var1.a.i(this, var1.b);
      } else {
         var6 = this.g;
         var2 = this.l;
         var6[var2] = var1;
         i var8 = var1.a;
         var8.p = var2;
         this.l = var2 + 1;
         var8.k(this, var1);
      }

      if (t && this.a) {
         int var3;
         for(var2 = 0; var2 < this.l; var2 = var3 + 1) {
            if (this.g[var2] == null) {
               System.out.println("WTF");
            }

            var1 = this.g[var2];
            var3 = var2;
            if (var1 != null) {
               var3 = var2;
               if (var1.f) {
                  var1.a.i(this, var1.b);
                  if (v) {
                     this.n.a.a(var1);
                  } else {
                     this.n.b.a(var1);
                  }

                  this.g[var2] = null;
                  var3 = var2 + 1;
                  int var4 = var3;

                  while(true) {
                     int var5 = this.l;
                     if (var3 >= var5) {
                        if (var4 < var5) {
                           this.g[var4] = null;
                        }

                        this.l = var5 - 1;
                        var3 = var2 - 1;
                        break;
                     }

                     var6 = this.g;
                     var4 = var3 - 1;
                     var1 = var6[var3];
                     var6[var4] = var1;
                     i var7 = var1.a;
                     if (var7.p == var3) {
                        var7.p = var4;
                     }

                     var4 = var3++;
                  }
               }
            }
         }

         this.a = false;
      }

   }

   private void n() {
      for(int var1 = 0; var1 < this.l; ++var1) {
         b var2 = this.g[var1];
         var2.a.r = var2.b;
      }

   }

   public static b s(d var0, i var1, i var2, float var3) {
      return var0.r().j(var1, var2, var3);
   }

   private int u(a var1) {
      int var5 = 0;

      b var18;
      boolean var19;
      while(true) {
         if (var5 >= this.l) {
            var19 = false;
            break;
         }

         var18 = this.g[var5];
         if (var18.a.v != i.a.m && var18.b < 0.0F) {
            var19 = true;
            break;
         }

         ++var5;
      }

      if (var19) {
         boolean var9 = false;
         var5 = 0;

         while(!var9) {
            int var15 = var5 + 1;
            float var2 = Float.MAX_VALUE;
            var5 = 0;
            int var6 = -1;
            int var8 = -1;

            int var12;
            i var17;
            for(int var7 = 0; var5 < this.l; var7 = var12) {
               var18 = this.g[var5];
               float var3;
               int var11;
               int var13;
               if (var18.a.v == i.a.m) {
                  var3 = var2;
                  var11 = var6;
                  var13 = var8;
                  var12 = var7;
               } else if (var18.f) {
                  var3 = var2;
                  var11 = var6;
                  var13 = var8;
                  var12 = var7;
               } else {
                  var3 = var2;
                  var11 = var6;
                  var13 = var8;
                  var12 = var7;
                  if (var18.b < 0.0F) {
                     float var4;
                     int var10;
                     int var14;
                     if (u) {
                        int var16 = var18.e.d();
                        var14 = 0;

                        while(true) {
                           var3 = var2;
                           var11 = var6;
                           var13 = var8;
                           var12 = var7;
                           if (var14 >= var16) {
                              break;
                           }

                           var17 = var18.e.h(var14);
                           var4 = var18.e.g(var17);
                           if (var4 <= 0.0F) {
                              var3 = var2;
                              var13 = var6;
                              var12 = var8;
                              var11 = var7;
                           } else {
                              byte var20 = 0;
                              var10 = var6;
                              var6 = var20;

                              while(true) {
                                 var3 = var2;
                                 var13 = var10;
                                 var12 = var8;
                                 var11 = var7;
                                 if (var6 >= 9) {
                                    break;
                                 }

                                 label148: {
                                    var3 = var17.t[var6] / var4;
                                    if (!(var3 < var2) || var6 != var7) {
                                       var11 = var7;
                                       if (var6 <= var7) {
                                          break label148;
                                       }
                                    }

                                    var8 = var17.o;
                                    var11 = var6;
                                    var10 = var5;
                                    var2 = var3;
                                 }

                                 ++var6;
                                 var7 = var11;
                              }
                           }

                           ++var14;
                           var2 = var3;
                           var6 = var13;
                           var8 = var12;
                           var7 = var11;
                        }
                     } else {
                        var10 = 1;

                        while(true) {
                           var3 = var2;
                           var11 = var6;
                           var13 = var8;
                           var12 = var7;
                           if (var10 >= this.k) {
                              break;
                           }

                           var17 = this.n.d[var10];
                           var4 = var18.e.g(var17);
                           if (var4 <= 0.0F) {
                              var3 = var2;
                              var14 = var6;
                              var13 = var8;
                              var12 = var7;
                           } else {
                              var11 = 0;

                              while(true) {
                                 var3 = var2;
                                 var14 = var6;
                                 var13 = var8;
                                 var12 = var7;
                                 if (var11 >= 9) {
                                    break;
                                 }

                                 label149: {
                                    var3 = var17.t[var11] / var4;
                                    if (!(var3 < var2) || var11 != var7) {
                                       var12 = var7;
                                       if (var11 <= var7) {
                                          break label149;
                                       }
                                    }

                                    var8 = var10;
                                    var6 = var5;
                                    var12 = var11;
                                    var2 = var3;
                                 }

                                 ++var11;
                                 var7 = var12;
                              }
                           }

                           ++var10;
                           var2 = var3;
                           var6 = var14;
                           var8 = var13;
                           var7 = var12;
                        }
                     }
                  }
               }

               ++var5;
               var2 = var3;
               var6 = var11;
               var8 = var13;
            }

            if (var6 != -1) {
               var18 = this.g[var6];
               var18.a.p = -1;
               var18.x(this.n.d[var8]);
               var17 = var18.a;
               var17.p = var6;
               var17.k(this, var18);
            } else {
               var9 = true;
            }

            var5 = var15;
            if (var15 > this.k / 2) {
               var9 = true;
               var5 = var15;
            }
         }
      } else {
         var5 = 0;
      }

      return var5;
   }

   public static e w() {
      return null;
   }

   private void y() {
      int var1 = this.e * 2;
      this.e = var1;
      this.g = (b[])Arrays.copyOf(this.g, var1);
      c var2 = this.n;
      var2.d = (i[])Arrays.copyOf(var2.d, this.e);
      var1 = this.e;
      this.j = new boolean[var1];
      this.f = var1;
      this.m = var1;
   }

   void A(a var1) {
      this.u(var1);
      this.B(var1, false);
      this.n();
   }

   public void D() {
      int var1 = 0;

      while(true) {
         c var3 = this.n;
         i[] var2 = var3.d;
         if (var1 >= var2.length) {
            var3.c.c(this.o, this.p);
            this.p = 0;
            Arrays.fill(this.n.d, (Object)null);
            HashMap var5 = this.c;
            if (var5 != null) {
               var5.clear();
            }

            this.b = 0;
            this.d.clear();
            this.k = 1;

            for(var1 = 0; var1 < this.l; ++var1) {
               b var6 = this.g[var1];
               if (var6 != null) {
                  var6.c = false;
               }
            }

            this.C();
            this.l = 0;
            if (v) {
               this.q = new b(this, this.n) {
                  final d g;

                  public {
                     this.g = var1;
                     super.e = new j(this, var2);
                  }
               };
            } else {
               this.q = new b(this.n);
            }

            return;
         }

         i var4 = var2[var1];
         if (var4 != null) {
            var4.h();
         }

         ++var1;
      }
   }

   public void b(r.e var1, r.e var2, float var3, int var4) {
      r.d.b var18 = r.d.b.n;
      i var12 = this.q(var1.m(var18));
      r.d.b var17 = r.d.b.o;
      i var13 = this.q(var1.m(var17));
      r.d.b var16 = r.d.b.p;
      i var11 = this.q(var1.m(var16));
      r.d.b var15 = r.d.b.q;
      i var14 = this.q(var1.m(var15));
      i var19 = this.q(var2.m(var18));
      i var24 = this.q(var2.m(var17));
      i var23 = this.q(var2.m(var16));
      i var20 = this.q(var2.m(var15));
      b var22 = this.r();
      double var5 = (double)var3;
      double var9 = Math.sin(var5);
      double var7 = (double)var4;
      var22.q(var13, var14, var24, var20, (float)(var9 * var7));
      this.d(var22);
      b var21 = this.r();
      var21.q(var12, var11, var19, var23, (float)(Math.cos(var5) * var7));
      this.d(var21);
   }

   public void c(i var1, i var2, int var3, float var4, i var5, i var6, int var7, int var8) {
      b var9 = this.r();
      var9.h(var1, var2, var3, var4, var5, var6, var7);
      if (var8 != 8) {
         var9.d(this, var8);
      }

      this.d(var9);
   }

   public void d(b var1) {
      if (var1 != null) {
         int var2 = this.l;
         boolean var3 = true;
         if (var2 + 1 >= this.m || this.k + 1 >= this.f) {
            this.y();
         }

         boolean var4 = var1.f;
         boolean var6 = false;
         if (!var4) {
            var1.D(this);
            if (var1.isEmpty()) {
               return;
            }

            label46: {
               var1.r();
               if (var1.f(this)) {
                  i var5 = this.p();
                  var1.a = var5;
                  var2 = this.l;
                  this.l(var1);
                  if (this.l == var2 + 1) {
                     this.q.c(var1);
                     this.B(this.q, true);
                     var6 = var3;
                     if (var5.p == -1) {
                        if (var1.a == var5) {
                           var5 = var1.v(var5);
                           if (var5 != null) {
                              var1.x(var5);
                           }
                        }

                        if (!var1.f) {
                           var1.a.k(this, var1);
                        }

                        if (v) {
                           this.n.a.a(var1);
                        } else {
                           this.n.b.a(var1);
                        }

                        --this.l;
                        var6 = var3;
                     }
                     break label46;
                  }
               }

               var6 = false;
            }

            if (!var1.s()) {
               return;
            }
         }

         if (!var6) {
            this.l(var1);
         }

      }
   }

   public b e(i var1, i var2, int var3, int var4) {
      if (s && var4 == 8 && var2.s && var1.p == -1) {
         var1.i(this, var2.r + (float)var3);
         return null;
      } else {
         b var5 = this.r();
         var5.n(var1, var2, var3);
         if (var4 != 8) {
            var5.d(this, var4);
         }

         this.d(var5);
         return var5;
      }
   }

   public void f(i var1, int var2) {
      if (s && var1.p == -1) {
         float var3 = (float)var2;
         var1.i(this, var3);

         for(var2 = 0; var2 < this.b + 1; ++var2) {
            i var6 = this.n.d[var2];
            if (var6 != null && var6.z && var6.A == var1.o) {
               var6.i(this, var6.B + var3);
            }
         }

      } else {
         int var4 = var1.p;
         b var5;
         if (var4 != -1) {
            var5 = this.g[var4];
            if (var5.f) {
               var5.b = (float)var2;
            } else if (var5.e.d() == 0) {
               var5.f = true;
               var5.b = (float)var2;
            } else {
               var5 = this.r();
               var5.m(var1, var2);
               this.d(var5);
            }
         } else {
            var5 = this.r();
            var5.i(var1, var2);
            this.d(var5);
         }

      }
   }

   public void g(i var1, i var2, int var3, boolean var4) {
      b var6 = this.r();
      i var5 = this.t();
      var5.q = 0;
      var6.o(var1, var2, var5, var3);
      this.d(var6);
   }

   public void h(i var1, i var2, int var3, int var4) {
      b var5 = this.r();
      i var6 = this.t();
      var6.q = 0;
      var5.o(var1, var2, var6, var3);
      if (var4 != 8) {
         this.m(var5, (int)(var5.e.g(var6) * -1.0F), var4);
      }

      this.d(var5);
   }

   public void i(i var1, i var2, int var3, boolean var4) {
      b var6 = this.r();
      i var5 = this.t();
      var5.q = 0;
      var6.p(var1, var2, var5, var3);
      this.d(var6);
   }

   public void j(i var1, i var2, int var3, int var4) {
      b var5 = this.r();
      i var6 = this.t();
      var6.q = 0;
      var5.p(var1, var2, var6, var3);
      if (var4 != 8) {
         this.m(var5, (int)(var5.e.g(var6) * -1.0F), var4);
      }

      this.d(var5);
   }

   public void k(i var1, i var2, i var3, i var4, float var5, int var6) {
      b var7 = this.r();
      var7.k(var1, var2, var3, var4, var5);
      if (var6 != 8) {
         var7.d(this, var6);
      }

      this.d(var7);
   }

   void m(b var1, int var2, int var3) {
      var1.e(this.o(var3, (String)null), var2);
   }

   public i o(int var1, String var2) {
      if (this.k + 1 >= this.f) {
         this.y();
      }

      i var4 = this.a(i.a.p, var2);
      int var3 = this.b + 1;
      this.b = var3;
      ++this.k;
      var4.o = var3;
      var4.q = var1;
      this.n.d[var3] = var4;
      this.d.a(var4);
      return var4;
   }

   public i p() {
      if (this.k + 1 >= this.f) {
         this.y();
      }

      i var2 = this.a(i.a.o, (String)null);
      int var1 = this.b + 1;
      this.b = var1;
      ++this.k;
      var2.o = var1;
      this.n.d[var1] = var2;
      return var2;
   }

   public i q(Object var1) {
      i var3 = null;
      if (var1 == null) {
         return null;
      } else {
         if (this.k + 1 >= this.f) {
            this.y();
         }

         if (var1 instanceof r.d) {
            r.d var4 = (r.d)var1;
            var3 = var4.h();
            i var5 = var3;
            if (var3 == null) {
               var4.r(this.n);
               var5 = var4.h();
            }

            int var2 = var5.o;
            if (var2 != -1 && var2 <= this.b) {
               var3 = var5;
               if (this.n.d[var2] != null) {
                  return var3;
               }
            }

            if (var2 != -1) {
               var5.h();
            }

            var2 = this.b + 1;
            this.b = var2;
            ++this.k;
            var5.o = var2;
            var5.v = i.a.m;
            this.n.d[var2] = var5;
            var3 = var5;
         }

         return var3;
      }
   }

   public b r() {
      b var1;
      if (v) {
         var1 = (b)this.n.a.b();
         if (var1 == null) {
            var1 = new b(this, this.n) {
               final d g;

               public {
                  this.g = var1;
                  super.e = new j(this, var2);
               }
            };
            ++y;
         } else {
            var1.y();
         }
      } else {
         var1 = (b)this.n.b.b();
         if (var1 == null) {
            var1 = new b(this.n);
            ++x;
         } else {
            var1.y();
         }
      }

      o.i.f();
      return var1;
   }

   public i t() {
      if (this.k + 1 >= this.f) {
         this.y();
      }

      i var2 = this.a(i.a.o, (String)null);
      int var1 = this.b + 1;
      this.b = var1;
      ++this.k;
      var2.o = var1;
      this.n.d[var1] = var2;
      return var2;
   }

   public c v() {
      return this.n;
   }

   public int x(Object var1) {
      i var2 = ((r.d)var1).h();
      return var2 != null ? (int)(var2.r + 0.5F) : 0;
   }

   public void z() {
      if (this.d.isEmpty()) {
         this.n();
      } else {
         if (!this.h && !this.i) {
            this.A(this.d);
         } else {
            boolean var2 = false;
            int var1 = 0;

            boolean var3;
            while(true) {
               if (var1 >= this.l) {
                  var3 = true;
                  break;
               }

               if (!this.g[var1].f) {
                  var3 = var2;
                  break;
               }

               ++var1;
            }

            if (!var3) {
               this.A(this.d);
            } else {
               this.n();
            }
         }

      }
   }

   interface a {
      void a(i var1);

      i b(d var1, boolean[] var2);

      void c(a var1);

      void clear();

      i getKey();

      boolean isEmpty();
   }
}
