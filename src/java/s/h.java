package s;

import java.util.ArrayList;
import java.util.Iterator;

public class h {
   private static b.a a = new b.a();
   private static int b = 0;
   private static int c = 0;

   private static boolean a(int var0, r.e var1) {
      r.e.b var7 = var1.y();
      r.e.b var6 = var1.R();
      r.f var5;
      if (var1.I() != null) {
         var5 = (r.f)var1.I();
      } else {
         var5 = null;
      }

      r.e.b var8;
      if (var5 != null) {
         var5.y();
         var8 = r.e.b.m;
      }

      r.e.b var10;
      if (var5 != null) {
         var5.R();
         var10 = r.e.b.m;
      }

      boolean var4;
      boolean var9;
      label116: {
         var10 = r.e.b.m;
         var4 = false;
         if (var7 != var10 && !var1.l0() && var7 != r.e.b.n) {
            var8 = r.e.b.o;
            if ((var7 != var8 || var1.w != 0 || var1.d0 != 0.0F || !var1.Y(0)) && (var7 != var8 || var1.w != 1 || !var1.b0(0, var1.U()))) {
               var9 = false;
               break label116;
            }
         }

         var9 = true;
      }

      boolean var2;
      label117: {
         if (var6 != var10 && !var1.m0() && var6 != r.e.b.n) {
            var10 = r.e.b.o;
            if ((var6 != var10 || var1.x != 0 || var1.d0 != 0.0F || !var1.Y(1)) && (var6 != var10 || var1.x != 1 || !var1.b0(1, var1.v()))) {
               var2 = false;
               break label117;
            }
         }

         var2 = true;
      }

      if (!(var1.d0 > 0.0F) || !var9 && !var2) {
         boolean var3 = var4;
         if (var9) {
            var3 = var4;
            if (var2) {
               var3 = true;
            }
         }

         return var3;
      } else {
         return true;
      }
   }

   private static void b(int var0, r.e var1, b.b var2, boolean var3) {
      if (!var1.e0()) {
         ++b;
         int var4;
         if (!(var1 instanceof r.f) && var1.k0()) {
            var4 = var0 + 1;
            if (a(var4, var1)) {
               r.f.O1(var4, var1, var2, new b.a(), b.a.k);
            }
         }

         r.d var10 = var1.m(r.d.b.n);
         r.d var9 = var1.m(r.d.b.p);
         int var7 = var10.d();
         int var5 = var9.d();
         int var6;
         boolean var8;
         r.d var11;
         r.d var13;
         boolean var15;
         r.e.b var21;
         if (var10.c() != null && var10.m()) {
            Iterator var17 = var10.c().iterator();

            label221:
            while(true) {
               r.e var12;
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              if (!var17.hasNext()) {
                                 break label221;
                              }

                              var11 = (r.d)var17.next();
                              var12 = var11.d;
                              var6 = var0 + 1;
                              var8 = a(var6, var12);
                              if (var12.k0() && var8) {
                                 r.f.O1(var6, var12, var2, new b.a(), b.a.k);
                              }

                              label184: {
                                 label232: {
                                    if (var11 == var12.O) {
                                       var13 = var12.Q.f;
                                       if (var13 != null && var13.m()) {
                                          break label232;
                                       }
                                    }

                                    if (var11 == var12.Q) {
                                       var13 = var12.O.f;
                                       if (var13 != null && var13.m()) {
                                          break label232;
                                       }
                                    }

                                    var15 = false;
                                    break label184;
                                 }

                                 var15 = true;
                              }

                              r.e.b var14 = var12.y();
                              var21 = r.e.b.o;
                              if (var14 == var21 && !var8) {
                                 break;
                              }

                              if (!var12.k0()) {
                                 var13 = var12.O;
                                 if (var11 == var13 && var12.Q.f == null) {
                                    var4 = var13.e() + var7;
                                    var12.C0(var4, var12.U() + var4);
                                    b(var6, var12, var2, var3);
                                 } else {
                                    r.d var22 = var12.Q;
                                    if (var11 == var22 && var13.f == null) {
                                       var4 = var7 - var22.e();
                                       var12.C0(var4 - var12.U(), var4);
                                       b(var6, var12, var2, var3);
                                    } else if (var15 && !var12.g0()) {
                                       d(var6, var2, var12, var3);
                                    }
                                 }
                              }
                           }
                        } while(var12.y() != var21);
                     } while(var12.A < 0);
                  } while(var12.z < 0);
               } while(var12.T() != 8 && (var12.w != 0 || var12.t() != 0.0F));

               if (!var12.g0() && !var12.j0() && var15 && !var12.g0()) {
                  e(var6, var1, var2, var12, var3);
               }
            }
         }

         if (!(var1 instanceof r.g)) {
            if (var9.c() != null && var9.m()) {
               Iterator var16 = var9.c().iterator();

               label164:
               while(true) {
                  r.e var18;
                  do {
                     do {
                        r.e.b var20;
                        do {
                           do {
                              while(true) {
                                 if (!var16.hasNext()) {
                                    break label164;
                                 }

                                 var11 = (r.d)var16.next();
                                 var18 = var11.d;
                                 var6 = var0 + 1;
                                 var8 = a(var6, var18);
                                 if (var18.k0() && var8) {
                                    r.f.O1(var6, var18, var2, new b.a(), b.a.k);
                                 }

                                 r.d var19;
                                 label127: {
                                    label235: {
                                       if (var11 == var18.O) {
                                          var19 = var18.Q.f;
                                          if (var19 != null && var19.m()) {
                                             break label235;
                                          }
                                       }

                                       if (var11 == var18.Q) {
                                          var19 = var18.O.f;
                                          if (var19 != null && var19.m()) {
                                             break label235;
                                          }
                                       }

                                       var15 = false;
                                       break label127;
                                    }

                                    var15 = true;
                                 }

                                 var21 = var18.y();
                                 var20 = r.e.b.o;
                                 if (var21 == var20 && !var8) {
                                    break;
                                 }

                                 if (!var18.k0()) {
                                    var13 = var18.O;
                                    if (var11 == var13 && var18.Q.f == null) {
                                       var4 = var13.e() + var5;
                                       var18.C0(var4, var18.U() + var4);
                                       b(var6, var18, var2, var3);
                                    } else {
                                       var19 = var18.Q;
                                       if (var11 == var19 && var13.f == null) {
                                          var4 = var5 - var19.e();
                                          var18.C0(var4 - var18.U(), var4);
                                          b(var6, var18, var2, var3);
                                       } else if (var15 && !var18.g0()) {
                                          d(var6, var2, var18, var3);
                                       }
                                    }
                                 }
                              }
                           } while(var18.y() != var20);
                        } while(var18.A < 0);
                     } while(var18.z < 0);
                  } while(var18.T() != 8 && (var18.w != 0 || var18.t() != 0.0F));

                  if (!var18.g0() && !var18.j0() && var15 && !var18.g0()) {
                     e(var6, var1, var2, var18, var3);
                  }
               }
            }

            var1.o0();
         }
      }
   }

   private static void c(int var0, r.a var1, b.b var2, int var3, boolean var4) {
      if (var1.q1()) {
         if (var3 == 0) {
            b(var0 + 1, var1, var2, var4);
         } else {
            i(var0 + 1, var1, var2);
         }
      }

   }

   private static void d(int var0, b.b var1, r.e var2, boolean var3) {
      float var4 = var2.w();
      int var5 = var2.O.f.d();
      int var6 = var2.Q.f.d();
      int var8 = var2.O.e();
      int var7 = var2.Q.e();
      if (var5 == var6) {
         var4 = 0.5F;
      } else {
         var5 += var8;
         var6 -= var7;
      }

      var8 = var2.U();
      var7 = var6 - var5 - var8;
      if (var5 > var6) {
         var7 = var5 - var6 - var8;
      }

      if (var7 > 0) {
         var4 = var4 * (float)var7 + 0.5F;
      } else {
         var4 *= (float)var7;
      }

      int var9 = (int)var4 + var5;
      var7 = var9 + var8;
      if (var5 > var6) {
         var7 = var9 - var8;
      }

      var2.C0(var9, var7);
      b(var0 + 1, var2, var1, var3);
   }

   private static void e(int var0, r.e var1, b.b var2, r.e var3, boolean var4) {
      float var5 = var3.w();
      int var8 = var3.O.f.d() + var3.O.e();
      int var9 = var3.Q.f.d() - var3.Q.e();
      if (var9 >= var8) {
         int var7 = var3.U();
         int var6 = var7;
         if (var3.T() != 8) {
            int var10 = var3.w;
            if (var10 == 2) {
               if (var1 instanceof r.f) {
                  var6 = var1.U();
               } else {
                  var6 = var1.I().U();
               }

               var6 = (int)(var3.w() * 0.5F * (float)var6);
            } else {
               var6 = var7;
               if (var10 == 0) {
                  var6 = var9 - var8;
               }
            }

            var7 = Math.max(var3.z, var6);
            var10 = var3.A;
            var6 = var7;
            if (var10 > 0) {
               var6 = Math.min(var10, var7);
            }
         }

         var7 = var8 + (int)(var5 * (float)(var9 - var8 - var6) + 0.5F);
         var3.C0(var7, var6 + var7);
         b(var0 + 1, var3, var2, var4);
      }

   }

   private static void f(int var0, b.b var1, r.e var2) {
      float var3 = var2.P();
      int var4 = var2.P.f.d();
      int var5 = var2.R.f.d();
      int var7 = var2.P.e();
      int var6 = var2.R.e();
      if (var4 == var5) {
         var3 = 0.5F;
      } else {
         var4 += var7;
         var5 -= var6;
      }

      int var8 = var2.v();
      var6 = var5 - var4 - var8;
      if (var4 > var5) {
         var6 = var4 - var5 - var8;
      }

      if (var6 > 0) {
         var3 = var3 * (float)var6 + 0.5F;
      } else {
         var3 *= (float)var6;
      }

      int var9 = (int)var3;
      var6 = var4 + var9;
      var7 = var6 + var8;
      if (var4 > var5) {
         var6 = var4 - var9;
         var7 = var6 - var8;
      }

      var2.F0(var6, var7);
      i(var0 + 1, var2, var1);
   }

   private static void g(int var0, r.e var1, b.b var2, r.e var3) {
      float var4 = var3.P();
      int var8 = var3.P.f.d() + var3.P.e();
      int var7 = var3.R.f.d() - var3.R.e();
      if (var7 >= var8) {
         int var6 = var3.v();
         int var5 = var6;
         if (var3.T() != 8) {
            int var9 = var3.x;
            if (var9 == 2) {
               if (var1 instanceof r.f) {
                  var5 = var1.v();
               } else {
                  var5 = var1.I().v();
               }

               var5 = (int)(var4 * 0.5F * (float)var5);
            } else {
               var5 = var6;
               if (var9 == 0) {
                  var5 = var7 - var8;
               }
            }

            var6 = Math.max(var3.C, var5);
            var9 = var3.D;
            var5 = var6;
            if (var9 > 0) {
               var5 = Math.min(var9, var6);
            }
         }

         var6 = var8 + (int)(var4 * (float)(var7 - var8 - var5) + 0.5F);
         var3.F0(var6, var5 + var6);
         i(var0 + 1, var3, var2);
      }

   }

   public static void h(r.f var0, b.b var1) {
      r.e.b var11 = var0.y();
      r.e.b var10 = var0.R();
      b = 0;
      c = 0;
      var0.s0();
      ArrayList var9 = var0.o1();
      int var7 = var9.size();

      int var2;
      for(var2 = 0; var2 < var7; ++var2) {
         ((r.e)var9.get(var2)).s0();
      }

      boolean var8 = var0.L1();
      if (var11 == r.e.b.m) {
         var0.C0(0, var0.U());
      } else {
         var0.D0(0);
      }

      int var4 = 0;
      boolean var3 = false;

      boolean var5;
      boolean var6;
      boolean var14;
      r.e var19;
      r.g var20;
      for(var14 = var3; var4 < var7; var14 = var6) {
         var19 = (r.e)var9.get(var4);
         if (var19 instanceof r.g) {
            var20 = (r.g)var19;
            var5 = var3;
            var6 = var14;
            if (var20.p1() == 1) {
               if (var20.q1() != -1) {
                  var20.t1(var20.q1());
               } else if (var20.r1() != -1 && var0.l0()) {
                  var20.t1(var0.U() - var20.r1());
               } else if (var0.l0()) {
                  var20.t1((int)(var20.s1() * (float)var0.U() + 0.5F));
               }

               var5 = true;
               var6 = var14;
            }
         } else {
            var5 = var3;
            var6 = var14;
            if (var19 instanceof r.a) {
               var5 = var3;
               var6 = var14;
               if (((r.a)var19).u1() == 0) {
                  var6 = true;
                  var5 = var3;
               }
            }
         }

         ++var4;
         var3 = var5;
      }

      int var15;
      if (var3) {
         for(var15 = 0; var15 < var7; ++var15) {
            var19 = (r.e)var9.get(var15);
            if (var19 instanceof r.g) {
               var20 = (r.g)var19;
               if (var20.p1() == 1) {
                  b(0, var20, var1, var8);
               }
            }
         }
      }

      b(0, var0, var1, var8);
      if (var14) {
         for(var2 = 0; var2 < var7; ++var2) {
            var19 = (r.e)var9.get(var2);
            if (var19 instanceof r.a) {
               r.a var21 = (r.a)var19;
               if (var21.u1() == 0) {
                  c(0, var21, var1, 0, var8);
               }
            }
         }
      }

      if (var10 == r.e.b.m) {
         var0.F0(0, var0.v());
      } else {
         var0.E0(0);
      }

      var15 = 0;
      boolean var16 = false;

      r.e var17;
      r.g var18;
      for(var14 = var16; var15 < var7; var14 = var5) {
         var17 = (r.e)var9.get(var15);
         if (var17 instanceof r.g) {
            var18 = (r.g)var17;
            var6 = var16;
            var5 = var14;
            if (var18.p1() == 0) {
               if (var18.q1() != -1) {
                  var18.t1(var18.q1());
               } else if (var18.r1() != -1 && var0.m0()) {
                  var18.t1(var0.v() - var18.r1());
               } else if (var0.m0()) {
                  var18.t1((int)(var18.s1() * (float)var0.v() + 0.5F));
               }

               var6 = true;
               var5 = var14;
            }
         } else {
            var6 = var16;
            var5 = var14;
            if (var17 instanceof r.a) {
               var6 = var16;
               var5 = var14;
               if (((r.a)var17).u1() == 1) {
                  var5 = true;
                  var6 = var16;
               }
            }
         }

         ++var15;
         var16 = var6;
      }

      if (var16) {
         for(var15 = 0; var15 < var7; ++var15) {
            var17 = (r.e)var9.get(var15);
            if (var17 instanceof r.g) {
               var18 = (r.g)var17;
               if (var18.p1() == 0) {
                  i(1, var18, var1);
               }
            }
         }
      }

      i(0, var0, var1);
      r.e var12;
      if (var14) {
         for(var2 = 0; var2 < var7; ++var2) {
            var12 = (r.e)var9.get(var2);
            if (var12 instanceof r.a) {
               r.a var13 = (r.a)var12;
               if (var13.u1() == 1) {
                  c(0, var13, var1, 1, var8);
               }
            }
         }
      }

      for(var2 = 0; var2 < var7; ++var2) {
         var12 = (r.e)var9.get(var2);
         if (var12.k0() && a(0, var12)) {
            r.f.O1(0, var12, var1, a, b.a.k);
            if (var12 instanceof r.g) {
               if (((r.g)var12).p1() == 0) {
                  i(0, var12, var1);
               } else {
                  b(0, var12, var1, var8);
               }
            } else {
               b(0, var12, var1, var8);
               i(0, var12, var1);
            }
         }
      }

   }

   private static void i(int var0, r.e var1, b.b var2) {
      if (!var1.n0()) {
         ++c;
         int var3;
         if (!(var1 instanceof r.f) && var1.k0()) {
            var3 = var0 + 1;
            if (a(var3, var1)) {
               r.f.O1(var3, var1, var2, new b.a(), b.a.k);
            }
         }

         r.d var9 = var1.m(r.d.b.o);
         r.d var8 = var1.m(r.d.b.q);
         int var5 = var9.d();
         int var4 = var8.d();
         boolean var7;
         r.d var12;
         boolean var14;
         r.e.b var22;
         if (var9.c() != null && var9.m()) {
            Iterator var11 = var9.c().iterator();

            label253:
            while(true) {
               int var6;
               r.e var16;
               do {
                  do {
                     r.e.b var13;
                     do {
                        do {
                           while(true) {
                              if (!var11.hasNext()) {
                                 break label253;
                              }

                              r.d var10 = (r.d)var11.next();
                              var16 = var10.d;
                              var6 = var0 + 1;
                              var7 = a(var6, var16);
                              if (var16.k0() && var7) {
                                 r.f.O1(var6, var16, var2, new b.a(), b.a.k);
                              }

                              label216: {
                                 label264: {
                                    if (var10 == var16.P) {
                                       var12 = var16.R.f;
                                       if (var12 != null && var12.m()) {
                                          break label264;
                                       }
                                    }

                                    if (var10 == var16.R) {
                                       var12 = var16.P.f;
                                       if (var12 != null && var12.m()) {
                                          break label264;
                                       }
                                    }

                                    var14 = false;
                                    break label216;
                                 }

                                 var14 = true;
                              }

                              var22 = var16.R();
                              var13 = r.e.b.o;
                              if (var22 == var13 && !var7) {
                                 break;
                              }

                              if (!var16.k0()) {
                                 r.d var23 = var16.P;
                                 if (var10 == var23 && var16.R.f == null) {
                                    var3 = var23.e() + var5;
                                    var16.F0(var3, var16.v() + var3);
                                    i(var6, var16, var2);
                                 } else {
                                    var12 = var16.R;
                                    if (var10 == var12 && var23.f == null) {
                                       var3 = var5 - var12.e();
                                       var16.F0(var3 - var16.v(), var3);
                                       i(var6, var16, var2);
                                    } else if (var14 && !var16.i0()) {
                                       f(var6, var2, var16);
                                    }
                                 }
                              }
                           }
                        } while(var16.R() != var13);
                     } while(var16.D < 0);
                  } while(var16.C < 0);
               } while(var16.T() != 8 && (var16.x != 0 || var16.t() != 0.0F));

               if (!var16.i0() && !var16.j0() && var14 && !var16.i0()) {
                  g(var6, var1, var2, var16);
               }
            }
         }

         if (!(var1 instanceof r.g)) {
            if (var8.c() != null && var8.m()) {
               Iterator var17 = var8.c().iterator();

               label196:
               while(true) {
                  r.e var18;
                  do {
                     do {
                        do {
                           do {
                              while(true) {
                                 if (!var17.hasNext()) {
                                    break label196;
                                 }

                                 var8 = (r.d)var17.next();
                                 var18 = var8.d;
                                 var5 = var0 + 1;
                                 var7 = a(var5, var18);
                                 if (var18.k0() && var7) {
                                    r.f.O1(var5, var18, var2, new b.a(), b.a.k);
                                 }

                                 r.d var20;
                                 label159: {
                                    label267: {
                                       if (var8 == var18.P) {
                                          var20 = var18.R.f;
                                          if (var20 != null && var20.m()) {
                                             break label267;
                                          }
                                       }

                                       if (var8 == var18.R) {
                                          var20 = var18.P.f;
                                          if (var20 != null && var20.m()) {
                                             break label267;
                                          }
                                       }

                                       var14 = false;
                                       break label159;
                                    }

                                    var14 = true;
                                 }

                                 r.e.b var21 = var18.R();
                                 var22 = r.e.b.o;
                                 if (var21 == var22 && !var7) {
                                    break;
                                 }

                                 if (!var18.k0()) {
                                    var20 = var18.P;
                                    if (var8 == var20 && var18.R.f == null) {
                                       var3 = var20.e() + var4;
                                       var18.F0(var3, var18.v() + var3);
                                       i(var5, var18, var2);
                                    } else {
                                       var12 = var18.R;
                                       if (var8 == var12 && var20.f == null) {
                                          var3 = var4 - var12.e();
                                          var18.F0(var3 - var18.v(), var3);
                                          i(var5, var18, var2);
                                       } else if (var14 && !var18.i0()) {
                                          f(var5, var2, var18);
                                       }
                                    }
                                 }
                              }
                           } while(var18.R() != var22);
                        } while(var18.D < 0);
                     } while(var18.C < 0);
                  } while(var18.T() != 8 && (var18.x != 0 || var18.t() != 0.0F));

                  if (!var18.i0() && !var18.j0() && var14 && !var18.i0()) {
                     g(var5, var1, var2, var18);
                  }
               }
            }

            var8 = var1.m(r.d.b.r);
            if (var8.c() != null && var8.m()) {
               var4 = var8.d();
               Iterator var19 = var8.c().iterator();

               label140:
               while(true) {
                  r.e var15;
                  do {
                     if (!var19.hasNext()) {
                        break label140;
                     }

                     var9 = (r.d)var19.next();
                     var15 = var9.d;
                     var3 = var0 + 1;
                     var7 = a(var3, var15);
                     if (var15.k0() && var7) {
                        r.f.O1(var3, var15, var2, new b.a(), b.a.k);
                     }
                  } while(var15.R() == r.e.b.o && !var7);

                  if (!var15.k0() && var9 == var15.S) {
                     var15.B0(var9.e() + var4);
                     i(var3, var15, var2);
                  }
               }
            }

            var1.p0();
         }
      }
   }
}
