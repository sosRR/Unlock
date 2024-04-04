package r;

import java.util.ArrayList;

public class b {
   static void a(f var0, o.d var1, int var2, int var3, c var4) {
      e var22 = var4.a;
      e var26 = var4.c;
      e var17 = var4.b;
      e var24 = var4.d;
      e var19 = var4.e;
      float var5 = var4.k;
      boolean var13;
      if (var0.Z[var2] == e.b.n) {
         var13 = true;
      } else {
         var13 = false;
      }

      boolean var8;
      boolean var9;
      boolean var11;
      boolean var14;
      boolean var42;
      label484: {
         label483: {
            boolean var10;
            int var12;
            if (var2 == 0) {
               var12 = var19.z0;
               if (var12 == 0) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               if (var12 == 1) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               var10 = var8;
               var11 = var9;
               if (var12 == 2) {
                  break label483;
               }
            } else {
               var12 = var19.A0;
               if (var12 == 0) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               if (var12 == 1) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               var10 = var8;
               var11 = var9;
               if (var12 == 2) {
                  break label483;
               }
            }

            var14 = false;
            var42 = var10;
            break label484;
         }

         var14 = true;
         var42 = var8;
         var11 = var9;
      }

      var8 = false;
      e var20 = var22;

      while(true) {
         e.b var25 = null;
         d[] var21 = null;
         int var38;
         int var39;
         byte var40;
         d[] var47;
         e var48;
         if (var8) {
            d var51;
            d var52;
            if (var24 != null) {
               var47 = var26.W;
               var39 = var3 + 1;
               if (var47[var39].f != null) {
                  var51 = var24.W[var39];
                  if (var24.Z[var2] == e.b.o && var24.y[var2] == 0) {
                     var8 = true;
                  } else {
                     var8 = false;
                  }

                  label447: {
                     if (var8 && !var14) {
                        var52 = var51.f;
                        if (var52.d == var0) {
                           var1.e(var51.i, var52.i, -var51.e(), 5);
                           break label447;
                        }
                     }

                     if (var14) {
                        var52 = var51.f;
                        if (var52.d == var0) {
                           var1.e(var51.i, var52.i, -var51.e(), 4);
                        }
                     }
                  }

                  var1.j(var51.i, var26.W[var39].f.i, -var51.e(), 6);
               }
            }

            d[] var29;
            d var30;
            int var41;
            o.i var53;
            if (var13) {
               var29 = var0.W;
               var41 = var3 + 1;
               var53 = var29[var41].i;
               var30 = var26.W[var41];
               var1.h(var53, var30.i, var30.e(), 8);
            }

            ArrayList var31 = var4.h;
            d[] var54;
            o.i var55;
            o.i var60;
            o.i var62;
            if (var31 != null) {
               var39 = var31.size();
               if (var39 > 1) {
                  float var6;
                  if (var4.r && !var4.t) {
                     var6 = (float)var4.j;
                  } else {
                     var6 = var5;
                  }

                  float var7 = 0.0F;
                  var48 = null;

                  for(var41 = 0; var41 < var39; ++var41) {
                     var20 = (e)var31.get(var41);
                     var5 = var20.D0[var2];
                     if (var5 < 0.0F) {
                        if (var4.t) {
                           var54 = var20.W;
                           var1.e(var54[var3 + 1].i, var54[var3].i, 0, 4);
                           continue;
                        }

                        var5 = 1.0F;
                     }

                     if (var5 == 0.0F) {
                        var54 = var20.W;
                        var1.e(var54[var3 + 1].i, var54[var3].i, 0, 8);
                     } else {
                        if (var48 != null) {
                           var21 = var48.W;
                           var53 = var21[var3].i;
                           var38 = var3 + 1;
                           var60 = var21[var38].i;
                           d[] var27 = var20.W;
                           var55 = var27[var3].i;
                           var62 = var27[var38].i;
                           o.b var28 = var1.r();
                           var28.l(var7, var6, var5, var53, var60, var55, var62);
                           var1.d(var28);
                        }

                        var48 = var20;
                        var7 = var5;
                     }
                  }
               }
            }

            o.i var32;
            d var35;
            o.i var36;
            e var37;
            d var49;
            if (var17 == null || var17 != var24 && !var14) {
               e var33;
               int var44;
               int var46;
               o.i var57;
               if (var42 && var17 != null) {
                  var41 = var4.j;
                  if (var41 > 0 && var4.i == var41) {
                     var9 = true;
                  } else {
                     var9 = false;
                  }

                  var19 = var17;

                  for(var48 = var17; var48 != null; var48 = var33) {
                     for(var33 = var48.F0[var2]; var33 != null && var33.T() == 8; var33 = var33.F0[var2]) {
                     }

                     if (var33 != null || var48 == var24) {
                        var52 = var48.W[var3];
                        var60 = var52.i;
                        var35 = var52.f;
                        if (var35 != null) {
                           var36 = var35.i;
                        } else {
                           var36 = null;
                        }

                        if (var19 != var48) {
                           var36 = var19.W[var3 + 1].i;
                        } else if (var48 == var17) {
                           var35 = var22.W[var3].f;
                           if (var35 != null) {
                              var36 = var35.i;
                           } else {
                              var36 = null;
                           }
                        }

                        var46 = var52.e();
                        var54 = var48.W;
                        var44 = var3 + 1;
                        var38 = var54[var44].e();
                        d var58;
                        if (var33 != null) {
                           var58 = var33.W[var3];
                           var57 = var58.i;
                        } else {
                           var58 = var26.W[var44].f;
                           if (var58 != null) {
                              var57 = var58.i;
                           } else {
                              var57 = null;
                           }
                        }

                        var62 = var48.W[var44].i;
                        var41 = var38;
                        if (var58 != null) {
                           var41 = var38 + var58.e();
                        }

                        var38 = var46 + var19.W[var44].e();
                        if (var60 != null && var36 != null && var57 != null && var62 != null) {
                           if (var48 == var17) {
                              var38 = var17.W[var3].e();
                           }

                           if (var48 == var24) {
                              var41 = var24.W[var44].e();
                           }

                           byte var45;
                           if (var9) {
                              var45 = 8;
                           } else {
                              var45 = 5;
                           }

                           var1.c(var60, var36, var38, 0.5F, var57, var62, var41, var45);
                        }
                     }

                     if (var48.T() == 8) {
                        var48 = var19;
                     }

                     var19 = var48;
                  }
               } else {
                  byte var43 = 8;
                  if (var11 && var17 != null) {
                     var39 = var4.j;
                     if (var39 > 0 && var4.i == var39) {
                        var9 = true;
                     } else {
                        var9 = false;
                     }

                     var48 = var17;

                     for(var37 = var17; var37 != null; var37 = var33) {
                        for(var33 = var37.F0[var2]; var33 != null && var33.T() == var43; var33 = var33.F0[var2]) {
                        }

                        if (var37 != var17 && var37 != var24 && var33 != null) {
                           if (var33 == var24) {
                              var33 = null;
                           }

                           var49 = var37.W[var3];
                           var62 = var49.i;
                           var52 = var49.f;
                           if (var52 != null) {
                              var57 = var52.i;
                           }

                           var54 = var48.W;
                           var46 = var3 + 1;
                           o.i var63 = var54[var46].i;
                           var44 = var49.e();
                           var38 = var37.W[var46].e();
                           o.i var50;
                           if (var33 != null) {
                              var52 = var33.W[var3];
                              var55 = var52.i;
                              var49 = var52.f;
                              if (var49 != null) {
                                 var50 = var49.i;
                              } else {
                                 var50 = null;
                              }

                              var60 = var50;
                           } else {
                              var52 = var24.W[var3];
                              if (var52 != null) {
                                 var50 = var52.i;
                              } else {
                                 var50 = null;
                              }

                              var60 = var37.W[var46].i;
                              var55 = var50;
                           }

                           var41 = var38;
                           if (var52 != null) {
                              var41 = var38 + var52.e();
                           }

                           var46 = var48.W[var46].e();
                           if (var9) {
                              var40 = 8;
                           } else {
                              var40 = 4;
                           }

                           if (var62 != null && var63 != null && var55 != null && var60 != null) {
                              var1.c(var62, var63, var46 + var44, 0.5F, var55, var60, var41, var40);
                           }

                           var43 = 8;
                        }

                        if (var37.T() != var43) {
                           var48 = var37;
                        }
                     }

                     var30 = var17.W[var3];
                     var35 = var22.W[var3].f;
                     var47 = var24.W;
                     var2 = var3 + 1;
                     var49 = var47[var2];
                     var51 = var26.W[var2].f;
                     if (var35 != null) {
                        if (var17 != var24) {
                           var1.e(var30.i, var35.i, var30.e(), 5);
                        } else if (var51 != null) {
                           var1.c(var30.i, var35.i, var30.e(), 0.5F, var49.i, var51.i, var49.e(), 5);
                        }
                     }

                     if (var51 != null && var17 != var24) {
                        var1.e(var49.i, var51.i, -var49.e(), 5);
                     }
                  }
               }
            } else {
               var30 = var22.W[var3];
               d[] var34 = var26.W;
               var41 = var3 + 1;
               var51 = var34[var41];
               var30 = var30.f;
               if (var30 != null) {
                  var32 = var30.i;
               } else {
                  var32 = null;
               }

               var35 = var51.f;
               if (var35 != null) {
                  var36 = var35.i;
               } else {
                  var36 = null;
               }

               var52 = var17.W[var3];
               if (var24 != null) {
                  var51 = var24.W[var41];
               }

               if (var32 != null && var36 != null) {
                  if (var2 == 0) {
                     var5 = var19.o0;
                  } else {
                     var5 = var19.p0;
                  }

                  var2 = var52.e();
                  var41 = var51.e();
                  var1.c(var52.i, var32, var2, var5, var36, var51.i, var41, 7);
               }
            }

            if ((var42 || var11) && var17 != null && var17 != var24) {
               var21 = var17.W;
               var52 = var21[var3];
               var37 = var24;
               if (var24 == null) {
                  var37 = var17;
               }

               var29 = var37.W;
               ++var3;
               var49 = var29[var3];
               var30 = var52.f;
               if (var30 != null) {
                  var53 = var30.i;
               } else {
                  var53 = null;
               }

               var30 = var49.f;
               if (var30 != null) {
                  var32 = var30.i;
               } else {
                  var32 = null;
               }

               if (var26 != var37) {
                  d var56 = var26.W[var3].f;
                  var32 = var25;
                  if (var56 != null) {
                     var32 = var56.i;
                  }
               }

               if (var17 == var37) {
                  var49 = var21[var3];
               }

               if (var53 != null && var32 != null) {
                  var2 = var52.e();
                  var3 = var37.W[var3].e();
                  var1.c(var52.i, var53, var2, 0.5F, var32, var49.i, var3, 5);
               }
            }

            return;
         }

         d var23 = var20.W[var3];
         if (var14) {
            var39 = 1;
         } else {
            var39 = 4;
         }

         var38 = var23.e();
         var25 = var20.Z[var2];
         e.b var18 = e.b.o;
         boolean var16;
         if (var25 == var18 && var20.y[var2] == 0) {
            var16 = true;
         } else {
            var16 = false;
         }

         d var61 = var23.f;
         int var15 = var38;
         if (var61 != null) {
            var15 = var38;
            if (var20 != var22) {
               var15 = var38 + var61.e();
            }
         }

         if (var14 && var20 != var22 && var20 != var17) {
            var40 = 8;
         } else {
            var40 = (byte)var39;
         }

         var61 = var23.f;
         if (var61 != null) {
            if (var20 == var17) {
               var1.h(var23.i, var61.i, var15, 6);
            } else {
               var1.h(var23.i, var61.i, var15, 8);
            }

            var39 = var40;
            if (var16) {
               var39 = var40;
               if (!var14) {
                  var39 = 5;
               }
            }

            if (var20 == var17 && var14 && var20.f0(var2)) {
               var39 = 5;
            }

            var1.e(var23.i, var23.f.i, var15, var39);
         }

         if (var13) {
            if (var20.T() != 8 && var20.Z[var2] == var18) {
               var47 = var20.W;
               var1.h(var47[var3 + 1].i, var47[var3].i, 0, 5);
            }

            var1.h(var20.W[var3].i, var0.W[var3].i, 0, 8);
         }

         var23 = var20.W[var3 + 1].f;
         var48 = var21;
         if (var23 != null) {
            e var59 = var23.d;
            var61 = var59.W[var3].f;
            var48 = var21;
            if (var61 != null) {
               if (var61.d != var20) {
                  var48 = var21;
               } else {
                  var48 = var59;
               }
            }
         }

         if (var48 != null) {
            var20 = var48;
         } else {
            var8 = true;
         }
      }
   }

   public static void b(f var0, o.d var1, ArrayList var2, int var3) {
      int var6 = 0;
      int var4;
      byte var5;
      c[] var7;
      if (var3 == 0) {
         var4 = var0.W0;
         var7 = var0.Z0;
         var5 = 0;
      } else {
         var4 = var0.X0;
         var7 = var0.Y0;
         var5 = 2;
      }

      for(; var6 < var4; ++var6) {
         c var8 = var7[var6];
         var8.a();
         if (var2 == null || var2.contains(var8.a)) {
            a(var0, var1, var3, var5, var8);
         }
      }

   }
}
