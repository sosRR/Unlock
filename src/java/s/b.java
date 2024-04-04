package s;

import java.util.ArrayList;

public class b {
   private final ArrayList a = new ArrayList();
   private s.b.a b = new s.b.a();
   private r.f c;

   public b(r.f var1) {
      this.c = var1;
   }

   private boolean a(s.b.b var1, r.e var2, int var3) {
      this.b.a = var2.y();
      this.b.b = var2.R();
      this.b.c = var2.U();
      this.b.d = var2.v();
      s.b.a var7 = this.b;
      var7.i = false;
      var7.j = var3;
      r.e.b var6 = var7.a;
      r.e.b var5 = r.e.b.o;
      boolean var4;
      if (var6 == var5) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var9;
      if (var7.b == var5) {
         var9 = true;
      } else {
         var9 = false;
      }

      if (var4 && var2.d0 > 0.0F) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var9 && var2.d0 > 0.0F) {
         var9 = true;
      } else {
         var9 = false;
      }

      if (var4 && var2.y[0] == 4) {
         var7.a = r.e.b.m;
      }

      if (var9 && var2.y[1] == 4) {
         var7.b = r.e.b.m;
      }

      var1.b(var2, var7);
      var2.h1(this.b.e);
      var2.I0(this.b.f);
      var2.H0(this.b.h);
      var2.x0(this.b.g);
      s.b.a var8 = this.b;
      var8.j = s.b.a.k;
      return var8.i;
   }

   private void b(r.f var1) {
      int var6 = var1.L0.size();
      boolean var7 = var1.P1(64);
      s.b.b var8 = var1.F1();

      for(int var4 = 0; var4 < var6; ++var4) {
         r.e var9 = (r.e)var1.L0.get(var4);
         if (!(var9 instanceof r.g) && !(var9 instanceof r.a) && !var9.j0()) {
            if (var7) {
               l var10 = var9.e;
               if (var10 != null) {
                  n var11 = var9.f;
                  if (var11 != null && var10.e.j && var11.e.j) {
                     continue;
                  }
               }
            }

            r.e.b var13 = var9.s(0);
            boolean var5 = true;
            r.e.b var12 = var9.s(1);
            r.e.b var14 = r.e.b.o;
            boolean var2;
            if (var13 == var14 && var9.w != 1 && var12 == var14 && var9.x != 1) {
               var2 = true;
            } else {
               var2 = false;
            }

            label81: {
               boolean var3 = var2;
               if (!var2) {
                  var3 = var2;
                  if (var1.P1(1)) {
                     var3 = var2;
                     if (!(var9 instanceof r.k)) {
                        label95: {
                           var3 = var2;
                           if (var13 == var14) {
                              var3 = var2;
                              if (var9.w == 0) {
                                 var3 = var2;
                                 if (var12 != var14) {
                                    var3 = var2;
                                    if (!var9.g0()) {
                                       var3 = true;
                                    }
                                 }
                              }
                           }

                           var2 = var3;
                           if (var12 == var14) {
                              var2 = var3;
                              if (var9.x == 0) {
                                 var2 = var3;
                                 if (var13 != var14) {
                                    var2 = var3;
                                    if (!var9.g0()) {
                                       var2 = true;
                                    }
                                 }
                              }
                           }

                           if (var13 != var14) {
                              var3 = var2;
                              if (var12 != var14) {
                                 break label95;
                              }
                           }

                           var3 = var2;
                           if (var9.d0 > 0.0F) {
                              var2 = var5;
                              break label81;
                           }
                        }
                     }
                  }
               }

               var2 = var3;
            }

            if (!var2) {
               this.a(var8, var9, s.b.a.k);
            }
         }
      }

      var8.a();
   }

   private void c(r.f var1, String var2, int var3, int var4, int var5) {
      int var7 = var1.G();
      int var6 = var1.F();
      var1.X0(0);
      var1.W0(0);
      var1.h1(var4);
      var1.I0(var5);
      var1.X0(var7);
      var1.W0(var6);
      this.c.T1(var3);
      this.c.p1();
   }

   public long d(r.f var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      s.b.b var23 = var1.F1();
      var10 = var1.L0.size();
      int var15 = var1.U();
      int var14 = var1.v();
      boolean var21 = r.j.b(var2, 128);
      boolean var27;
      if (!var21 && !r.j.b(var2, 64)) {
         var27 = false;
      } else {
         var27 = true;
      }

      boolean var28 = var27;
      r.e var24;
      r.e.b var25;
      boolean var33;
      if (var27) {
         var3 = 0;

         while(true) {
            var28 = var27;
            if (var3 >= var10) {
               break;
            }

            var24 = (r.e)var1.L0.get(var3);
            r.e.b var26 = var24.y();
            var25 = r.e.b.o;
            if (var26 == var25) {
               var28 = true;
            } else {
               var28 = false;
            }

            if (var24.R() == var25) {
               var33 = true;
            } else {
               var33 = false;
            }

            if (var28 && var33 && var24.t() > 0.0F) {
               var28 = true;
            } else {
               var28 = false;
            }

            if (var24.g0() && var28 || var24.i0() && var28 || var24 instanceof r.k || var24.g0() || var24.i0()) {
               var28 = false;
               break;
            }

            ++var3;
         }
      }

      boolean var20;
      if (var28) {
         var20 = o.d.r;
      }

      if ((var5 != 1073741824 || var7 != 1073741824) && !var21) {
         var27 = false;
      } else {
         var27 = true;
      }

      boolean var11 = var28 & var27;
      if (var11) {
         var2 = Math.min(var1.E(), var6);
         var3 = Math.min(var1.D(), var8);
         if (var5 == 1073741824 && var1.U() != var2) {
            var1.h1(var2);
            var1.I1();
         }

         if (var7 == 1073741824 && var1.v() != var3) {
            var1.I0(var3);
            var1.I1();
         }

         if (var5 == 1073741824 && var7 == 1073741824) {
            var20 = var1.C1(var21);
            var2 = 2;
         } else {
            var20 = var1.D1(var21);
            if (var5 == 1073741824) {
               var20 &= var1.E1(var21, 0);
               var2 = 1;
            } else {
               var2 = 0;
            }

            if (var7 == 1073741824) {
               var20 &= var1.E1(var21, 1);
               ++var2;
            }
         }

         var21 = var20;
         var3 = var2;
         if (var20) {
            if (var5 == 1073741824) {
               var21 = true;
            } else {
               var21 = false;
            }

            boolean var22;
            if (var7 == 1073741824) {
               var22 = true;
            } else {
               var22 = false;
            }

            var1.m1(var21, var22);
            var21 = var20;
            var3 = var2;
         }
      } else {
         var21 = false;
         var3 = 0;
      }

      if (!var21 || var3 != 2) {
         var4 = var1.G1();
         if (var10 > 0) {
            this.b(var1);
         }

         this.e(var1);
         var8 = this.a.size();
         if (var10 > 0) {
            this.c(var1, "First pass", 0, var15, var14);
         }

         if (var8 <= 0) {
            var2 = var4;
         } else {
            r.e.b var37 = var1.y();
            var25 = r.e.b.n;
            if (var37 == var25) {
               var33 = true;
            } else {
               var33 = false;
            }

            boolean var34;
            if (var1.R() == var25) {
               var34 = true;
            } else {
               var34 = false;
            }

            var3 = Math.max(var1.U(), this.c.G());
            var2 = Math.max(var1.v(), this.c.F());
            var7 = 0;

            int var12;
            int var13;
            int var16;
            boolean var29;
            boolean var30;
            for(var29 = false; var7 < var8; var29 = var30) {
               var24 = (r.e)this.a.get(var7);
               if (!(var24 instanceof r.k)) {
                  var30 = var29;
               } else {
                  var16 = var24.U();
                  var12 = var24.v();
                  var20 = this.a(var23, var24, s.b.a.l);
                  var6 = var24.U();
                  var13 = var24.v();
                  if (var6 != var16) {
                     var24.h1(var6);
                     var5 = var3;
                     if (var33) {
                        var5 = var3;
                        if (var24.K() > var3) {
                           var5 = Math.max(var3, var24.K() + var24.m(r.d.b.p).e());
                        }
                     }

                     var30 = true;
                     var3 = var5;
                  } else {
                     var30 = var20 | var29;
                  }

                  var5 = var2;
                  if (var13 != var12) {
                     var24.I0(var13);
                     var5 = var2;
                     if (var34) {
                        var5 = var2;
                        if (var24.p() > var2) {
                           var5 = Math.max(var2, var24.p() + var24.m(r.d.b.q).e());
                        }
                     }

                     var30 = true;
                  }

                  var30 |= ((r.k)var24).s1();
                  var2 = var5;
               }

               ++var7;
            }

            byte var36 = 0;
            boolean var31 = var29;
            var5 = var8;
            var30 = var11;

            for(int var35 = var36; var35 < 2; var31 = false) {
               boolean var32;
               for(var12 = 0; var12 < var5; var31 = var32) {
                  var24 = (r.e)this.a.get(var12);
                  if ((!(var24 instanceof r.h) || var24 instanceof r.k) && !(var24 instanceof r.g) && var24.T() != 8 && (!var30 || !var24.e.e.j || !var24.f.e.j) && !(var24 instanceof r.k)) {
                     int var18 = var24.U();
                     var16 = var24.v();
                     var13 = var24.n();
                     var8 = s.b.a.l;
                     if (var35 == 1) {
                        var8 = s.b.a.m;
                     }

                     var32 = this.a(var23, var24, var8) | var31;
                     int var19 = var24.U();
                     int var17 = var24.v();
                     var7 = var3;
                     if (var19 != var18) {
                        var24.h1(var19);
                        var7 = var3;
                        if (var33) {
                           var7 = var3;
                           if (var24.K() > var3) {
                              var7 = Math.max(var3, var24.K() + var24.m(r.d.b.p).e());
                           }
                        }

                        var32 = true;
                     }

                     var3 = var2;
                     if (var17 != var16) {
                        var24.I0(var17);
                        var3 = var2;
                        if (var34) {
                           var3 = var2;
                           if (var24.p() > var2) {
                              var3 = Math.max(var2, var24.p() + var24.m(r.d.b.q).e());
                           }
                        }

                        var32 = true;
                     }

                     if (var24.X() && var13 != var24.n()) {
                        var32 = true;
                        var13 = var7;
                        var2 = var3;
                     } else {
                        var2 = var3;
                        var13 = var7;
                     }
                  } else {
                     var13 = var3;
                     var32 = var31;
                  }

                  ++var12;
                  var3 = var13;
               }

               if (!var31) {
                  break;
               }

               ++var35;
               this.c(var1, "intermediate pass", var35, var15, var14);
            }

            var2 = var4;
         }

         var1.S1(var2);
      }

      return 0L;
   }

   public void e(r.f var1) {
      this.a.clear();
      int var3 = var1.L0.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         r.e var4 = (r.e)var1.L0.get(var2);
         r.e.b var6 = var4.y();
         r.e.b var5 = r.e.b.o;
         if (var6 == var5 || var4.R() == var5) {
            this.a.add(var4);
         }
      }

      var1.I1();
   }

   public static class a {
      public static int k;
      public static int l;
      public static int m;
      public r.e.b a;
      public r.e.b b;
      public int c;
      public int d;
      public int e;
      public int f;
      public int g;
      public boolean h;
      public boolean i;
      public int j;
   }

   public interface b {
      void a();

      void b(r.e var1, s.a var2);
   }
}
