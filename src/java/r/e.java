package r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.n;
import s.p;

public class e {
   public static float K0;
   public int A = 0;
   int A0;
   public float B = 1.0F;
   boolean B0;
   public int C = 0;
   boolean C0;
   public int D = 0;
   public float[] D0;
   public float E = 1.0F;
   protected e[] E0;
   int F = -1;
   protected e[] F0;
   float G = 1.0F;
   e G0;
   private int[] H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
   e H0;
   private float I = 0.0F;
   public int I0;
   private boolean J = false;
   public int J0;
   private boolean K;
   private boolean L = false;
   private int M = 0;
   private int N = 0;
   public d O;
   public d P;
   public d Q;
   public d R;
   public d S;
   d T;
   d U;
   public d V;
   public d[] W;
   protected ArrayList X;
   private boolean[] Y;
   public b[] Z;
   public boolean a = false;
   public e a0;
   public p[] b = new p[2];
   int b0;
   public s.c c;
   int c0;
   public s.c d;
   public float d0;
   public s.l e = null;
   protected int e0;
   public n f = null;
   protected int f0;
   public boolean[] g = new boolean[]{(boolean)1, (boolean)1};
   protected int g0;
   boolean h = false;
   int h0;
   private boolean i = true;
   int i0;
   private boolean j = false;
   protected int j0;
   private boolean k = true;
   protected int k0;
   private int l = -1;
   int l0;
   private int m = -1;
   protected int m0;
   public q.a n = new q.a(this);
   protected int n0;
   public String o;
   float o0;
   private boolean p = false;
   float p0;
   private boolean q = false;
   private Object q0;
   private boolean r = false;
   private int r0;
   private boolean s = false;
   private int s0;
   public int t = -1;
   private boolean t0;
   public int u = -1;
   private String u0;
   private int v = 0;
   private String v0;
   public int w = 0;
   boolean w0;
   public int x = 0;
   boolean x0;
   public int[] y = new int[2];
   boolean y0;
   public int z = 0;
   int z0;

   public e() {
      this.O = new d(this, d.b.n);
      this.P = new d(this, d.b.o);
      this.Q = new d(this, d.b.p);
      this.R = new d(this, d.b.q);
      this.S = new d(this, d.b.r);
      this.T = new d(this, d.b.t);
      this.U = new d(this, d.b.u);
      d var2 = new d(this, d.b.s);
      this.V = var2;
      this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, var2};
      this.X = new ArrayList();
      this.Y = new boolean[2];
      b var3 = e.b.m;
      this.Z = new b[]{var3, var3};
      this.a0 = null;
      this.b0 = 0;
      this.c0 = 0;
      this.d0 = 0.0F;
      this.e0 = -1;
      this.f0 = 0;
      this.g0 = 0;
      this.h0 = 0;
      this.i0 = 0;
      this.j0 = 0;
      this.k0 = 0;
      this.l0 = 0;
      float var1 = K0;
      this.o0 = var1;
      this.p0 = var1;
      this.r0 = 0;
      this.s0 = 0;
      this.t0 = false;
      this.u0 = null;
      this.v0 = null;
      this.y0 = false;
      this.z0 = 0;
      this.A0 = 0;
      this.D0 = new float[]{-1.0F, -1.0F};
      this.E0 = new e[]{null, null};
      this.F0 = new e[]{null, null};
      this.G0 = null;
      this.H0 = null;
      this.I0 = -1;
      this.J0 = -1;
      this.d();
   }

   private void N(StringBuilder var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      var1.append(var2);
      var1.append(" :  {\n");
      this.v0(var1, "      size", var3, 0);
      this.v0(var1, "      min", var4, 0);
      this.v0(var1, "      max", var5, Integer.MAX_VALUE);
      this.v0(var1, "      matchMin", var7, 0);
      this.v0(var1, "      matchDef", var8, 0);
      this.u0(var1, "      matchPercent", var9, 1.0F);
      var1.append("    },\n");
   }

   private void O(StringBuilder var1, String var2, d var3) {
      if (var3.f != null) {
         var1.append("    ");
         var1.append(var2);
         var1.append(" : [ '");
         var1.append(var3.f);
         var1.append("'");
         if (var3.h != Integer.MIN_VALUE || var3.g != 0) {
            var1.append(",");
            var1.append(var3.g);
            if (var3.h != Integer.MIN_VALUE) {
               var1.append(",");
               var1.append(var3.h);
               var1.append(",");
            }
         }

         var1.append(" ] ,\n");
      }
   }

   private void d() {
      this.X.add(this.O);
      this.X.add(this.P);
      this.X.add(this.Q);
      this.X.add(this.R);
      this.X.add(this.T);
      this.X.add(this.U);
      this.X.add(this.V);
      this.X.add(this.S);
   }

   private boolean d0(int var1) {
      var1 *= 2;
      d[] var3 = this.W;
      d var5 = var3[var1];
      d var4 = var5.f;
      boolean var2;
      if (var4 != null && var4.f != var5) {
         var2 = true;
         d var6 = var3[var1 + 1];
         var4 = var6.f;
         if (var4 != null && var4.f == var6) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   private void i(o.d var1, boolean var2, boolean var3, boolean var4, boolean var5, o.i var6, o.i var7, b var8, boolean var9, d var10, d var11, int var12, int var13, int var14, int var15, float var16, boolean var17, boolean var18, boolean var19, boolean var20, boolean var21, int var22, int var23, int var24, int var25, float var26, boolean var27) {
      o.i var39 = var1.q(var10);
      o.i var37 = var1.q(var11);
      o.i var40 = var1.q(var10.i());
      o.i var38 = var1.q(var11.i());
      o.d.w();
      byte var32 = var10.n();
      boolean var34 = var11.n();
      boolean var35 = this.V.n();
      int var28;
      if (var34) {
         var28 = var32 + 1;
      } else {
         var28 = var32;
      }

      int var31 = var28;
      if (var35) {
         var31 = var28 + 1;
      }

      int var30;
      if (var17) {
         var30 = 3;
      } else {
         var30 = var22;
      }

      var22 = null.b[var8.ordinal()];
      boolean var29;
      if (var22 != 1 && var22 != 2 && var22 != 3 && var22 == 4 && var30 != 4) {
         var29 = true;
      } else {
         var29 = false;
      }

      int var33 = this.l;
      boolean var58 = var29;
      var28 = var13;
      if (var33 != -1) {
         var58 = var29;
         var28 = var13;
         if (var2) {
            this.l = -1;
            var28 = var33;
            var58 = false;
         }
      }

      var13 = this.m;
      boolean var52;
      boolean var62;
      if (var13 != -1 && !var2) {
         this.m = -1;
         var62 = false;
         var22 = var13;
         var52 = var62;
      } else {
         var52 = var58;
         var22 = var28;
      }

      if (this.s0 == 8) {
         var22 = 0;
         var52 = false;
      }

      if (var27) {
         if (var32 == 0 && !var34 && !var35) {
            var1.f(var39, var12);
         } else if (var32 != 0 && !var34) {
            var1.e(var39, var40, var10.e(), 8);
         }
      }

      boolean var61;
      label625: {
         if (!var52) {
            if (var9) {
               var1.e(var37, var39, 0, 3);
               if (var14 > 0) {
                  var1.h(var37, var39, var14, 8);
               }

               if (var15 < Integer.MAX_VALUE) {
                  var1.j(var37, var39, var15, 8);
               }
            } else {
               var1.e(var37, var39, var22, 8);
            }

            var62 = var52;
         } else {
            if (var31 == 2 || var17 || var30 != 1 && var30 != 0) {
               if (var24 == -2) {
                  var12 = var22;
               } else {
                  var12 = var24;
               }

               if (var25 == -2) {
                  var15 = var22;
               } else {
                  var15 = var25;
               }

               var24 = var22;
               if (var22 > 0) {
                  var24 = var22;
                  if (var30 != 1) {
                     var24 = 0;
                  }
               }

               var22 = var24;
               if (var12 > 0) {
                  var1.h(var37, var39, var12, 8);
                  var22 = Math.max(var24, var12);
               }

               if (var15 > 0) {
                  if (var3 && var30 == 1) {
                     var61 = false;
                  } else {
                     var61 = true;
                  }

                  if (var61) {
                     var1.j(var37, var39, var15, 8);
                  }

                  var22 = Math.min(var22, var15);
               }

               if (var30 == 1) {
                  if (var3) {
                     var1.e(var37, var39, var22, 8);
                  } else if (var19) {
                     var1.e(var37, var39, var22, 5);
                     var1.j(var37, var39, var22, 8);
                  } else {
                     var1.e(var37, var39, var22, 5);
                     var1.j(var37, var39, var22, 8);
                  }

                  var25 = var12;
                  var12 = var15;
                  var62 = var52;
               } else if (var30 == 2) {
                  d.b var36 = var10.j();
                  d.b var47 = d.b.o;
                  o.i var48;
                  o.i var64;
                  if (var36 != var47 && var10.j() != d.b.q) {
                     var64 = var1.q(this.a0.m(d.b.n));
                     var48 = var1.q(this.a0.m(d.b.p));
                  } else {
                     var64 = var1.q(this.a0.m(var47));
                     var48 = var1.q(this.a0.m(d.b.q));
                  }

                  var1.d(var1.r().k(var37, var39, var48, var64, var26));
                  if (var3) {
                     var52 = false;
                  }

                  var25 = var12;
                  var12 = var15;
                  var62 = var52;
               } else {
                  var5 = true;
                  var62 = var52;
                  var25 = var12;
                  var12 = var15;
               }
               break label625;
            }

            var13 = Math.max(var24, var22);
            var12 = var13;
            if (var25 > 0) {
               var12 = Math.min(var25, var13);
            }

            var1.e(var37, var39, var12, 8);
            var62 = false;
         }

         var12 = var25;
         var25 = var24;
      }

      e var44;
      boolean var53;
      if (var27 && !var19) {
         byte var56;
         label514: {
            byte var55;
            label636: {
               if (var32 != 0 || var34 || var35) {
                  if (var32 != 0 && !var34) {
                     var44 = var10.f.d;
                     if (var3 && var44 instanceof a) {
                        var56 = 8;
                     } else {
                        var56 = 5;
                     }

                     var4 = var3;
                     var55 = var56;
                     break label636;
                  }

                  e var50;
                  if (var32 == 0 && var34) {
                     var1.e(var37, var38, -var11.e(), 8);
                     if (var3) {
                        label496: {
                           if (this.j && var39.s) {
                              var50 = this.a0;
                              if (var50 != null) {
                                 f var46 = (f)var50;
                                 if (var2) {
                                    var46.w1(var10);
                                 } else {
                                    var46.B1(var10);
                                 }
                                 break label496;
                              }
                           }

                           var1.h(var39, var6, 0, 5);
                        }
                     }
                  } else if (var32 != 0 && var34) {
                     e var41;
                     byte var54;
                     boolean var59;
                     e var65;
                     label628: {
                        var65 = var10.f.d;
                        var50 = var11.f.d;
                        var41 = this.I();
                        if (var62) {
                           label608: {
                              if (var30 == 0) {
                                 boolean var57;
                                 byte var60;
                                 if (var12 == 0 && var25 == 0) {
                                    if (var40.s && var38.s) {
                                       var1.e(var39, var40, var10.e(), 8);
                                       var1.e(var37, var38, -var11.e(), 8);
                                       return;
                                    }

                                    var56 = 8;
                                    var60 = 8;
                                    var57 = false;
                                    var52 = false;
                                    var58 = true;
                                 } else {
                                    var58 = false;
                                    var56 = 5;
                                    var60 = 5;
                                    var57 = true;
                                    var52 = true;
                                 }

                                 if (var65 instanceof a || var50 instanceof a) {
                                    var60 = 4;
                                 }

                                 var29 = var58;
                                 var61 = var57;
                                 var58 = var52;
                                 var54 = 6;
                                 var55 = var60;
                                 var59 = var29;
                                 break label628;
                              }

                              if (var30 == 2) {
                                 if (!(var65 instanceof a) && !(var50 instanceof a)) {
                                    var55 = 5;
                                 } else {
                                    var55 = 4;
                                 }

                                 var56 = 5;
                              } else {
                                 if (var30 != 1) {
                                    if (var30 == 3) {
                                       if (this.F == -1) {
                                          if (var20) {
                                             if (var3) {
                                                var54 = 5;
                                             } else {
                                                var54 = 4;
                                             }
                                          } else {
                                             var54 = 8;
                                          }

                                          var56 = 8;
                                          var55 = 5;
                                          var58 = true;
                                          var61 = true;
                                          var59 = true;
                                          break label628;
                                       }

                                       if (var17) {
                                          if (var23 != 2 && var23 != 1) {
                                             var53 = false;
                                          } else {
                                             var53 = true;
                                          }

                                          if (!var53) {
                                             var55 = 8;
                                             var56 = 5;
                                          } else {
                                             var55 = 5;
                                             var56 = 4;
                                          }

                                          byte var63 = var55;
                                          var29 = true;
                                          var61 = true;
                                          var59 = var61;
                                          var54 = 6;
                                          var55 = var56;
                                          var56 = var63;
                                          var58 = var29;
                                          break label628;
                                       }

                                       if (var12 > 0) {
                                          var55 = 5;
                                       } else if (var12 == 0 && var25 == 0) {
                                          if (var20) {
                                             if (var65 != var41 && var50 != var41) {
                                                var56 = 4;
                                             } else {
                                                var56 = 5;
                                             }

                                             var58 = true;
                                             var61 = true;
                                             var59 = var61;
                                             var54 = 6;
                                             var55 = 4;
                                             break label628;
                                          }

                                          var55 = 8;
                                       } else {
                                          var55 = 4;
                                       }

                                       var59 = true;
                                       var61 = true;
                                       var58 = true;
                                       var54 = 6;
                                       var56 = 5;
                                       break label628;
                                    }

                                    var58 = false;
                                    var61 = false;
                                    break label608;
                                 }

                                 var56 = 8;
                                 var55 = 4;
                              }

                              var59 = false;
                              var54 = 6;
                              var58 = true;
                              var61 = true;
                              break label628;
                           }
                        } else {
                           if (var40.s && var38.s) {
                              var1.c(var39, var40, var10.e(), var16, var38, var37, var11.e(), 8);
                              if (var3 && var5) {
                                 if (var11.f != null) {
                                    var12 = var11.e();
                                 } else {
                                    var12 = 0;
                                 }

                                 if (var38 != var7) {
                                    var1.h(var7, var37, var12, 5);
                                 }
                              }

                              return;
                           }

                           var58 = true;
                           var61 = true;
                        }

                        var56 = 5;
                        var55 = 4;
                        var54 = 6;
                        var59 = false;
                     }

                     if (var58 && var40 == var38 && var65 != var41) {
                        var58 = false;
                        var29 = false;
                     } else {
                        var29 = true;
                     }

                     if (var61) {
                        if (!var62 && !var18 && !var20 && var40 == var6 && var38 == var7) {
                           var56 = 8;
                           var54 = 8;
                           var3 = false;
                           var29 = false;
                        }

                        var1.c(var39, var40, var10.e(), var16, var38, var37, var11.e(), var54);
                     }

                     if (this.s0 == 8 && !var11.l()) {
                        return;
                     }

                     if (var58) {
                        if (var3 && var40 != var38 && !var62 && (var65 instanceof a || var50 instanceof a)) {
                           var56 = 6;
                        }

                        var1.h(var39, var40, var10.e(), var56);
                        var1.j(var37, var38, -var11.e(), var56);
                     }

                     if (var3 && var21 && !(var65 instanceof a) && !(var50 instanceof a) && var50 != var41) {
                        var56 = 6;
                        var54 = 6;
                        var29 = true;
                     } else {
                        var54 = var56;
                        var56 = var55;
                     }

                     if (var29) {
                        if (var59 && (!var20 || var4)) {
                           if (var65 != var41 && var50 != var41) {
                              var55 = var56;
                           } else {
                              var55 = 6;
                           }

                           if (var65 instanceof g || var50 instanceof g) {
                              var55 = 5;
                           }

                           if (var65 instanceof a || var50 instanceof a) {
                              var55 = 5;
                           }

                           if (var20) {
                              var55 = 5;
                           }

                           var13 = Math.max(var55, var56);
                        } else {
                           var13 = var56;
                        }

                        var12 = var13;
                        if (var3) {
                           var13 = Math.min(var54, var13);
                           var12 = var13;
                           if (var17) {
                              var12 = var13;
                              if (!var20) {
                                 label376: {
                                    if (var65 != var41) {
                                       var12 = var13;
                                       if (var50 != var41) {
                                          break label376;
                                       }
                                    }

                                    var12 = 4;
                                 }
                              }
                           }
                        }

                        var1.e(var39, var40, var10.e(), var12);
                        var1.e(var37, var38, -var11.e(), var12);
                     }

                     if (var3) {
                        if (var6 == var40) {
                           var12 = var10.e();
                        } else {
                           var12 = 0;
                        }

                        if (var40 != var6) {
                           var1.h(var39, var6, var12, 5);
                        }
                     }

                     var56 = 5;
                     var55 = var56;
                     var4 = var3;
                     if (var3) {
                        var55 = var56;
                        var4 = var3;
                        if (var62) {
                           var55 = var56;
                           var4 = var3;
                           if (var14 == 0) {
                              var55 = var56;
                              var4 = var3;
                              if (var25 == 0) {
                                 if (var62 && var30 == 3) {
                                    var1.h(var37, var39, 0, 8);
                                 } else {
                                    var1.h(var37, var39, 0, 5);
                                 }
                                 break label514;
                              }
                           }
                        }
                     }
                     break label636;
                  }
               }

               var56 = 5;
               break label514;
            }

            var56 = var55;
            var3 = var4;
         }

         var13 = 0;
         if (var3 && var5) {
            if (var11.f != null) {
               var13 = var11.e();
            }

            if (var38 != var7) {
               if (this.j && var37.s) {
                  var44 = this.a0;
                  if (var44 != null) {
                     f var42 = (f)var44;
                     if (var2) {
                        var42.v1(var11);
                     } else {
                        var42.A1(var11);
                     }

                     return;
                  }
               }

               var1.h(var7, var37, var13, var56);
            }
         }

      } else {
         if (var31 < 2 && var3 && var5) {
            var1.h(var39, var6, 0, 8);
            if (!var2 && this.S.f != null) {
               var52 = false;
            } else {
               var52 = true;
            }

            var53 = var52;
            if (!var2) {
               d var43 = this.S.f;
               var53 = var52;
               if (var43 != null) {
                  label624: {
                     var44 = var43.d;
                     if (var44.d0 != 0.0F) {
                        b[] var49 = var44.Z;
                        b var45 = var49[0];
                        b var51 = e.b.o;
                        if (var45 == var51 && var49[1] == var51) {
                           var53 = true;
                           break label624;
                        }
                     }

                     var53 = false;
                  }
               }
            }

            if (var53) {
               var1.h(var7, var37, 0, 8);
            }
         }

      }
   }

   private void u0(StringBuilder var1, String var2, float var3, float var4) {
      if (var3 != var4) {
         var1.append(var2);
         var1.append(" :   ");
         var1.append(var3);
         var1.append(",\n");
      }
   }

   private void v0(StringBuilder var1, String var2, int var3, int var4) {
      if (var3 != var4) {
         var1.append(var2);
         var1.append(" :   ");
         var1.append(var3);
         var1.append(",\n");
      }
   }

   private void w0(StringBuilder var1, String var2, float var3, int var4) {
      if (var3 != 0.0F) {
         var1.append(var2);
         var1.append(" :  [");
         var1.append(var3);
         var1.append(",");
         var1.append(var4);
         var1.append("");
         var1.append("],\n");
      }
   }

   public int A() {
      return this.M;
   }

   public void A0(String var1) {
      if (var1 != null && var1.length() != 0) {
         int var9 = var1.length();
         int var10 = var1.indexOf(44);
         int var6 = 0;
         byte var7 = 0;
         byte var8 = -1;
         int var5 = var6;
         byte var4 = var8;
         String var11;
         if (var10 > 0) {
            var5 = var6;
            var4 = var8;
            if (var10 < var9 - 1) {
               var11 = var1.substring(0, var10);
               if (var11.equalsIgnoreCase("W")) {
                  var4 = var7;
               } else if (var11.equalsIgnoreCase("H")) {
                  var4 = 1;
               } else {
                  var4 = -1;
               }

               var5 = var10 + 1;
            }
         }

         float var2;
         label89: {
            var6 = var1.indexOf(58);
            boolean var10001;
            if (var6 >= 0 && var6 < var9 - 1) {
               var11 = var1.substring(var5, var6);
               var1 = var1.substring(var6 + 1);
               if (var11.length() > 0 && var1.length() > 0) {
                  label90: {
                     float var3;
                     try {
                        var3 = Float.parseFloat(var11);
                        var2 = Float.parseFloat(var1);
                     } catch (NumberFormatException var15) {
                        var10001 = false;
                        break label90;
                     }

                     if (var3 > 0.0F && var2 > 0.0F) {
                        if (var4 == 1) {
                           try {
                              var2 = Math.abs(var2 / var3);
                              break label89;
                           } catch (NumberFormatException var14) {
                              var10001 = false;
                           }
                        } else {
                           try {
                              var2 = Math.abs(var3 / var2);
                              break label89;
                           } catch (NumberFormatException var12) {
                              var10001 = false;
                           }
                        }
                     }
                  }
               }
            } else {
               var1 = var1.substring(var5);
               if (var1.length() > 0) {
                  try {
                     var2 = Float.parseFloat(var1);
                     break label89;
                  } catch (NumberFormatException var13) {
                     var10001 = false;
                  }
               }
            }

            var2 = 0.0F;
         }

         if (var2 > 0.0F) {
            this.d0 = var2;
            this.e0 = var4;
         }

      } else {
         this.d0 = 0.0F;
      }
   }

   public int B() {
      return this.N;
   }

   public void B0(int var1) {
      if (this.J) {
         int var2 = var1 - this.l0;
         int var3 = this.c0;
         this.g0 = var2;
         this.P.s(var2);
         this.R.s(var3 + var2);
         this.S.s(var1);
         this.q = true;
      }
   }

   public int C(int var1) {
      if (var1 == 0) {
         return this.U();
      } else {
         return var1 == 1 ? this.v() : 0;
      }
   }

   public void C0(int var1, int var2) {
      if (!this.p) {
         this.O.s(var1);
         this.Q.s(var2);
         this.f0 = var1;
         this.b0 = var2 - var1;
         this.p = true;
      }
   }

   public int D() {
      return this.H[1];
   }

   public void D0(int var1) {
      this.O.s(var1);
      this.f0 = var1;
   }

   public int E() {
      return this.H[0];
   }

   public void E0(int var1) {
      this.P.s(var1);
      this.g0 = var1;
   }

   public int F() {
      return this.n0;
   }

   public void F0(int var1, int var2) {
      if (!this.q) {
         this.P.s(var1);
         this.R.s(var2);
         this.g0 = var1;
         this.c0 = var2 - var1;
         if (this.J) {
            this.S.s(var1 + this.l0);
         }

         this.q = true;
      }
   }

   public int G() {
      return this.m0;
   }

   public void G0(int var1, int var2, int var3, int var4) {
      int var5 = var3 - var1;
      var3 = var4 - var2;
      this.f0 = var1;
      this.g0 = var2;
      if (this.s0 == 8) {
         this.b0 = 0;
         this.c0 = 0;
      } else {
         b[] var6 = this.Z;
         b var8 = var6[0];
         b var7 = e.b.m;
         var1 = var5;
         if (var8 == var7) {
            var2 = this.b0;
            var1 = var5;
            if (var5 < var2) {
               var1 = var2;
            }
         }

         var2 = var3;
         if (var6[1] == var7) {
            var4 = this.c0;
            var2 = var3;
            if (var3 < var4) {
               var2 = var4;
            }
         }

         this.b0 = var1;
         this.c0 = var2;
         var3 = this.n0;
         if (var2 < var3) {
            this.c0 = var3;
         }

         var3 = this.m0;
         if (var1 < var3) {
            this.b0 = var3;
         }

         var3 = this.A;
         if (var3 > 0 && var8 == e.b.o) {
            this.b0 = Math.min(this.b0, var3);
         }

         var3 = this.D;
         if (var3 > 0 && this.Z[1] == e.b.o) {
            this.c0 = Math.min(this.c0, var3);
         }

         var3 = this.b0;
         if (var1 != var3) {
            this.l = var3;
         }

         var1 = this.c0;
         if (var2 != var1) {
            this.m = var1;
         }

      }
   }

   public e H(int var1) {
      d var2;
      d var3;
      if (var1 == 0) {
         var3 = this.Q;
         var2 = var3.f;
         if (var2 != null && var2.f == var3) {
            return var2.d;
         }
      } else if (var1 == 1) {
         var2 = this.R;
         var3 = var2.f;
         if (var3 != null && var3.f == var2) {
            return var3.d;
         }
      }

      return null;
   }

   public void H0(boolean var1) {
      this.J = var1;
   }

   public e I() {
      return this.a0;
   }

   public void I0(int var1) {
      this.c0 = var1;
      int var2 = this.n0;
      if (var1 < var2) {
         this.c0 = var2;
      }

   }

   public e J(int var1) {
      d var2;
      d var3;
      if (var1 == 0) {
         var3 = this.O;
         var2 = var3.f;
         if (var2 != null && var2.f == var3) {
            return var2.d;
         }
      } else if (var1 == 1) {
         var2 = this.P;
         var3 = var2.f;
         if (var3 != null && var3.f == var2) {
            return var3.d;
         }
      }

      return null;
   }

   public void J0(float var1) {
      this.o0 = var1;
   }

   public int K() {
      return this.V() + this.b0;
   }

   public void K0(int var1) {
      this.z0 = var1;
   }

   public p L(int var1) {
      if (var1 == 0) {
         return this.e;
      } else {
         return var1 == 1 ? this.f : null;
      }
   }

   public void L0(int var1, int var2) {
      this.f0 = var1;
      var1 = var2 - var1;
      this.b0 = var1;
      var2 = this.m0;
      if (var1 < var2) {
         this.b0 = var2;
      }

   }

   public void M(StringBuilder var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("  ");
      var2.append(this.o);
      var2.append(":{\n");
      var1.append(var2.toString());
      var2 = new StringBuilder();
      var2.append("    actualWidth:");
      var2.append(this.b0);
      var1.append(var2.toString());
      var1.append("\n");
      var2 = new StringBuilder();
      var2.append("    actualHeight:");
      var2.append(this.c0);
      var1.append(var2.toString());
      var1.append("\n");
      var2 = new StringBuilder();
      var2.append("    actualLeft:");
      var2.append(this.f0);
      var1.append(var2.toString());
      var1.append("\n");
      var2 = new StringBuilder();
      var2.append("    actualTop:");
      var2.append(this.g0);
      var1.append(var2.toString());
      var1.append("\n");
      this.O(var1, "left", this.O);
      this.O(var1, "top", this.P);
      this.O(var1, "right", this.Q);
      this.O(var1, "bottom", this.R);
      this.O(var1, "baseline", this.S);
      this.O(var1, "centerX", this.T);
      this.O(var1, "centerY", this.U);
      this.N(var1, "    width", this.b0, this.m0, this.H[0], this.l, this.z, this.w, this.B, this.D0[0]);
      this.N(var1, "    height", this.c0, this.n0, this.H[1], this.m, this.C, this.x, this.E, this.D0[1]);
      this.w0(var1, "    dimensionRatio", this.d0, this.e0);
      this.u0(var1, "    horizontalBias", this.o0, K0);
      this.u0(var1, "    verticalBias", this.p0, K0);
      this.v0(var1, "    horizontalChainStyle", this.z0, 0);
      this.v0(var1, "    verticalChainStyle", this.A0, 0);
      var1.append("  }");
   }

   public void M0(b var1) {
      this.Z[0] = var1;
   }

   public void N0(int var1, int var2, int var3, float var4) {
      this.w = var1;
      this.z = var2;
      var2 = var3;
      if (var3 == Integer.MAX_VALUE) {
         var2 = 0;
      }

      this.A = var2;
      this.B = var4;
      if (var4 > 0.0F && var4 < 1.0F && var1 == 0) {
         this.w = 2;
      }

   }

   public void O0(float var1) {
      this.D0[0] = var1;
   }

   public float P() {
      return this.p0;
   }

   protected void P0(int var1, boolean var2) {
      this.Y[var1] = var2;
   }

   public int Q() {
      return this.A0;
   }

   public void Q0(boolean var1) {
      this.K = var1;
   }

   public b R() {
      return this.Z[1];
   }

   public void R0(boolean var1) {
      this.L = var1;
   }

   public int S() {
      d var3 = this.O;
      int var1 = 0;
      if (var3 != null) {
         var1 = 0 + this.P.g;
      }

      int var2 = var1;
      if (this.Q != null) {
         var2 = var1 + this.R.g;
      }

      return var2;
   }

   public void S0(int var1, int var2) {
      this.M = var1;
      this.N = var2;
      this.V0(false);
   }

   public int T() {
      return this.s0;
   }

   public void T0(int var1) {
      this.H[1] = var1;
   }

   public int U() {
      return this.s0 == 8 ? 0 : this.b0;
   }

   public void U0(int var1) {
      this.H[0] = var1;
   }

   public int V() {
      e var1 = this.a0;
      return var1 != null && var1 instanceof f ? ((f)var1).S0 + this.f0 : this.f0;
   }

   public void V0(boolean var1) {
      this.i = var1;
   }

   public int W() {
      e var1 = this.a0;
      return var1 != null && var1 instanceof f ? ((f)var1).T0 + this.g0 : this.g0;
   }

   public void W0(int var1) {
      if (var1 < 0) {
         this.n0 = 0;
      } else {
         this.n0 = var1;
      }

   }

   public boolean X() {
      return this.J;
   }

   public void X0(int var1) {
      if (var1 < 0) {
         this.m0 = 0;
      } else {
         this.m0 = var1;
      }

   }

   public boolean Y(int var1) {
      boolean var4 = true;
      boolean var5 = true;
      byte var2;
      byte var6;
      if (var1 == 0) {
         if (this.O.f != null) {
            var6 = 1;
         } else {
            var6 = 0;
         }

         if (this.Q.f != null) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         if (var6 + var2 < 2) {
            var4 = var5;
         } else {
            var4 = false;
         }

         return var4;
      } else {
         if (this.P.f != null) {
            var6 = 1;
         } else {
            var6 = 0;
         }

         if (this.R.f != null) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         byte var3;
         if (this.S.f != null) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         if (var6 + var2 + var3 >= 2) {
            var4 = false;
         }

         return var4;
      }
   }

   public void Y0(int var1, int var2) {
      this.f0 = var1;
      this.g0 = var2;
   }

   public boolean Z() {
      int var2 = this.X.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         if (((d)this.X.get(var1)).l()) {
            return true;
         }
      }

      return false;
   }

   public void Z0(e var1) {
      this.a0 = var1;
   }

   public boolean a0() {
      boolean var1;
      if (this.l == -1 && this.m == -1) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void a1(float var1) {
      this.p0 = var1;
   }

   public boolean b0(int var1, int var2) {
      boolean var4 = true;
      boolean var3 = true;
      d var5;
      if (var1 == 0) {
         var5 = this.O.f;
         if (var5 != null && var5.m()) {
            var5 = this.Q.f;
            if (var5 != null && var5.m()) {
               if (this.Q.f.d() - this.Q.e() - (this.O.f.d() + this.O.e()) < var2) {
                  var3 = false;
               }

               return var3;
            }
         }
      } else {
         var5 = this.P.f;
         if (var5 != null && var5.m()) {
            var5 = this.R.f;
            if (var5 != null && var5.m()) {
               if (this.R.f.d() - this.R.e() - (this.P.f.d() + this.P.e()) >= var2) {
                  var3 = var4;
               } else {
                  var3 = false;
               }

               return var3;
            }
         }
      }

      return false;
   }

   public void b1(int var1) {
      this.A0 = var1;
   }

   public void c0(d.b var1, e var2, d.b var3, int var4, int var5) {
      this.m(var1).a(var2.m(var3), var4, var5, true);
   }

   public void c1(int var1, int var2) {
      this.g0 = var1;
      var2 -= var1;
      this.c0 = var2;
      var1 = this.n0;
      if (var2 < var1) {
         this.c0 = var1;
      }

   }

   public void d1(b var1) {
      this.Z[1] = var1;
   }

   public void e(f var1, o.d var2, HashSet var3, int var4, boolean var5) {
      if (var5) {
         if (!var3.contains(this)) {
            return;
         }

         r.j.a(var1, var2, this);
         var3.remove(this);
         this.g(var2, var1.P1(64));
      }

      HashSet var6;
      Iterator var7;
      if (var4 == 0) {
         var6 = this.O.c();
         if (var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               ((d)var7.next()).d.e(var1, var2, var3, var4, true);
            }
         }

         var6 = this.Q.c();
         if (var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               ((d)var7.next()).d.e(var1, var2, var3, var4, true);
            }
         }
      } else {
         var6 = this.P.c();
         if (var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               ((d)var7.next()).d.e(var1, var2, var3, var4, true);
            }
         }

         var6 = this.R.c();
         if (var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               ((d)var7.next()).d.e(var1, var2, var3, var4, true);
            }
         }

         var6 = this.S.c();
         if (var6 != null) {
            var7 = var6.iterator();

            while(var7.hasNext()) {
               ((d)var7.next()).d.e(var1, var2, var3, var4, true);
            }
         }
      }

   }

   public boolean e0() {
      return this.r;
   }

   public void e1(int var1, int var2, int var3, float var4) {
      this.x = var1;
      this.C = var2;
      var2 = var3;
      if (var3 == Integer.MAX_VALUE) {
         var2 = 0;
      }

      this.D = var2;
      this.E = var4;
      if (var4 > 0.0F && var4 < 1.0F && var1 == 0) {
         this.x = 2;
      }

   }

   boolean f() {
      boolean var1;
      if (!(this instanceof k) && !(this instanceof g)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean f0(int var1) {
      return this.Y[var1];
   }

   public void f1(float var1) {
      this.D0[1] = var1;
   }

   public void g(o.d var1, boolean var2) {
      int var4;
      boolean var12;
      boolean var13;
      e var25;
      o.i var27;
      o.i var28;
      o.i var29;
      o.i var30;
      o.i var31;
      label431: {
         var28 = var1.q(this.O);
         var30 = var1.q(this.Q);
         var27 = var1.q(this.P);
         var29 = var1.q(this.R);
         var31 = var1.q(this.S);
         var25 = this.a0;
         if (var25 != null) {
            if (var25 != null && var25.Z[0] == e.b.n) {
               var12 = true;
            } else {
               var12 = false;
            }

            if (var25 != null && var25.Z[1] == e.b.n) {
               var13 = true;
            } else {
               var13 = false;
            }

            var4 = this.v;
            if (var4 == 1) {
               var13 = false;
               break label431;
            }

            if (var4 == 2) {
               var12 = false;
               break label431;
            }

            if (var4 != 3) {
               break label431;
            }
         }

         var12 = false;
         var13 = false;
      }

      boolean[] var41;
      if (this.s0 == 8 && !this.t0 && !this.Z()) {
         var41 = this.Y;
         if (!var41[0] && !var41[1]) {
            return;
         }
      }

      boolean var14 = this.p;
      if (var14 || this.q) {
         f var42;
         if (var14) {
            var1.f(var28, this.f0);
            var1.f(var30, this.f0 + this.b0);
            if (var12) {
               var25 = this.a0;
               if (var25 != null) {
                  if (this.k) {
                     var42 = (f)var25;
                     var42.w1(this.O);
                     var42.v1(this.Q);
                  } else {
                     var1.h(var1.q(var25.Q), var30, 0, 5);
                  }
               }
            }
         }

         if (this.q) {
            var1.f(var27, this.g0);
            var1.f(var29, this.g0 + this.c0);
            if (this.S.l()) {
               var1.f(var31, this.g0 + this.l0);
            }

            if (var13) {
               var25 = this.a0;
               if (var25 != null) {
                  if (this.k) {
                     var42 = (f)var25;
                     var42.B1(this.P);
                     var42.A1(this.R);
                  } else {
                     var1.h(var1.q(var25.R), var29, 0, 5);
                  }
               }
            }
         }

         if (this.p && this.q) {
            this.p = false;
            this.q = false;
            return;
         }
      }

      var14 = o.d.r;
      s.l var26;
      s.f var45;
      if (var2) {
         var26 = this.e;
         if (var26 != null) {
            n var32 = this.f;
            if (var32 != null) {
               var45 = var26.h;
               if (var45.j && var26.i.j && var32.h.j && var32.i.j) {
                  var1.f(var28, var45.g);
                  var1.f(var30, this.e.i.g);
                  var1.f(var27, this.f.h.g);
                  var1.f(var29, this.f.i.g);
                  var1.f(var31, this.f.k.g);
                  if (this.a0 != null) {
                     if (var12 && this.g[0] && !this.g0()) {
                        var1.h(var1.q(this.a0.Q), var30, 0, 8);
                     }

                     if (var13 && this.g[1] && !this.i0()) {
                        var1.h(var1.q(this.a0.R), var29, 0, 8);
                     }
                  }

                  this.p = false;
                  this.q = false;
                  return;
               }
            }
         }
      }

      boolean var15;
      boolean var16;
      if (this.a0 != null) {
         if (this.d0(0)) {
            ((f)this.a0).s1(this, 0);
            var14 = true;
         } else {
            var14 = this.g0();
         }

         if (this.d0(1)) {
            ((f)this.a0).s1(this, 1);
            var15 = true;
         } else {
            var15 = this.i0();
         }

         if (!var14 && var12 && this.s0 != 8 && this.O.f == null && this.Q.f == null) {
            var1.h(var1.q(this.a0.Q), var30, 0, 1);
         }

         if (!var15 && var13 && this.s0 != 8 && this.P.f == null && this.R.f == null && this.S == null) {
            var1.h(var1.q(this.a0.R), var29, 0, 1);
         }

         var16 = var15;
         var15 = var14;
      } else {
         var16 = false;
         var15 = false;
      }

      int var9 = this.b0;
      var4 = this.m0;
      if (var9 >= var4) {
         var4 = var9;
      }

      int var10 = this.c0;
      int var5 = this.n0;
      if (var10 >= var5) {
         var5 = var10;
      }

      b[] var43 = this.Z;
      b var46 = var43[0];
      b var53 = e.b.o;
      if (var46 != var53) {
         var14 = true;
      } else {
         var14 = false;
      }

      b var44 = var43[1];
      boolean var17;
      if (var44 != var53) {
         var17 = true;
      } else {
         var17 = false;
      }

      float var3;
      int var6;
      int var7;
      int var8;
      label400: {
         label447: {
            int var11 = this.e0;
            this.F = var11;
            var3 = this.d0;
            this.G = var3;
            var7 = this.w;
            var8 = this.x;
            if (var3 > 0.0F && this.s0 != 8) {
               label437: {
                  var6 = var7;
                  if (var46 == var53) {
                     var6 = var7;
                     if (var7 == 0) {
                        var6 = 3;
                     }
                  }

                  var7 = var8;
                  if (var44 == var53) {
                     var7 = var8;
                     if (var8 == 0) {
                        var7 = 3;
                     }
                  }

                  label448: {
                     if (var46 == var53 && var44 == var53 && var6 == 3 && var7 == 3) {
                        this.l1(var12, var13, var14, var17);
                     } else {
                        if (var46 == var53 && var6 == 3) {
                           this.F = 0;
                           var4 = (int)(var3 * (float)var10);
                           if (var44 != var53) {
                              byte var39 = 4;
                              var6 = var7;
                              var7 = var5;
                              var14 = false;
                              var5 = var4;
                              var4 = var7;
                              var7 = var39;
                              break label400;
                           }

                           var8 = var4;
                           break label448;
                        }

                        if (var44 == var53 && var7 == 3) {
                           this.F = 1;
                           if (var11 == -1) {
                              this.G = 1.0F / var3;
                           }

                           var8 = (int)(this.G * (float)var9);
                           if (var46 == var53) {
                              var5 = var4;
                              var4 = var8;
                              break label447;
                           }

                           byte var40 = 4;
                           var5 = var8;
                           var7 = var6;
                           var6 = var40;
                           break label437;
                        }
                     }

                     var8 = var4;
                  }

                  var4 = var5;
                  var5 = var8;
                  break label447;
               }
            } else {
               var6 = var8;
            }

            var8 = var4;
            var14 = false;
            var4 = var5;
            var5 = var8;
            break label400;
         }

         var8 = var6;
         var6 = var7;
         var14 = true;
         var7 = var8;
      }

      boolean var18;
      label367: {
         int[] var48 = this.y;
         var48[0] = var7;
         var48[1] = var6;
         this.h = var14;
         if (var14) {
            var8 = this.F;
            if (var8 == 0 || var8 == -1) {
               var18 = true;
               break label367;
            }
         }

         var18 = false;
      }

      label358: {
         if (var14) {
            var8 = this.F;
            if (var8 == 1 || var8 == -1) {
               var17 = true;
               break label358;
            }
         }

         var17 = false;
      }

      var46 = this.Z[0];
      b var33 = e.b.n;
      boolean var19;
      if (var46 == var33 && this instanceof f) {
         var19 = true;
      } else {
         var19 = false;
      }

      if (var19) {
         var5 = 0;
      }

      boolean var21 = this.V.n() ^ true;
      var41 = this.Y;
      boolean var24 = var41[0];
      boolean var22 = var41[1];
      boolean var20;
      d var35;
      e var47;
      o.i var49;
      o.i var51;
      if (this.t != 2 && !this.p) {
         label440: {
            if (var2) {
               var26 = this.e;
               if (var26 != null) {
                  var45 = var26.h;
                  if (var45.j && var26.i.j) {
                     if (var2) {
                        var1.f(var28, var45.g);
                        var1.f(var30, this.e.i.g);
                        if (this.a0 != null && var12 && this.g[0] && !this.g0()) {
                           var1.h(var1.q(this.a0.Q), var30, 0, 8);
                        }
                     }
                     break label440;
                  }
               }
            }

            var25 = this.a0;
            if (var25 != null) {
               var51 = var1.q(var25.Q);
            } else {
               var51 = null;
            }

            var47 = this.a0;
            if (var47 != null) {
               var49 = var1.q(var47.O);
            } else {
               var49 = null;
            }

            boolean var23 = this.g[0];
            b[] var37 = this.Z;
            b var34 = var37[0];
            var35 = this.O;
            d var36 = this.Q;
            var9 = this.f0;
            var10 = this.m0;
            var8 = this.H[0];
            var3 = this.o0;
            if (var37[1] == var53) {
               var20 = true;
            } else {
               var20 = false;
            }

            this.i(var1, true, var12, var13, var23, var49, var51, var34, var19, var35, var36, var9, var5, var10, var8, var3, var18, var20, var15, var16, var24, var7, var6, this.z, this.A, this.B, var21);
         }
      }

      boolean var38;
      label335: {
         if (var2) {
            n var50 = this.f;
            if (var50 != null) {
               var45 = var50.h;
               if (var45.j && var50.i.j) {
                  var5 = var45.g;
                  var1.f(var27, var5);
                  var5 = this.f.i.g;
                  var1.f(var29, var5);
                  var1.f(var31, this.f.k.g);
                  var25 = this.a0;
                  if (var25 != null && !var16 && var13 && this.g[1]) {
                     var1.h(var1.q(var25.R), var29, 0, 8);
                  }

                  var38 = false;
                  break label335;
               }
            }
         }

         var38 = true;
      }

      if (this.u == 2) {
         var38 = false;
      }

      if (var38 && !this.q) {
         if (this.Z[1] == var33 && this instanceof f) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            var4 = 0;
         }

         var25 = this.a0;
         if (var25 != null) {
            var51 = var1.q(var25.R);
         } else {
            var51 = null;
         }

         var47 = this.a0;
         if (var47 != null) {
            var49 = var1.q(var47.P);
         } else {
            var49 = null;
         }

         label450: {
            if (this.l0 > 0 || this.s0 == 8) {
               d var54 = this.S;
               if (var54.f != null) {
                  var1.e(var31, var27, this.n(), 8);
                  var1.e(var31, var1.q(this.S.f), this.S.e(), 8);
                  if (var13) {
                     var1.h(var51, var1.q(this.R), 0, 5);
                  }

                  var18 = false;
                  break label450;
               }

               if (this.s0 == 8) {
                  var1.e(var31, var27, var54.e(), 8);
               } else {
                  var1.e(var31, var27, this.n(), 8);
               }
            }

            var18 = var21;
         }

         var20 = this.g[1];
         b[] var55 = this.Z;
         b var52 = var55[1];
         d var56 = this.P;
         var35 = this.R;
         var5 = this.g0;
         var8 = this.n0;
         var9 = this.H[1];
         var3 = this.p0;
         if (var55[0] == var53) {
            var19 = true;
         } else {
            var19 = false;
         }

         this.i(var1, false, var13, var12, var20, var49, var51, var52, var2, var56, var35, var5, var4, var8, var9, var3, var17, var19, var16, var15, var22, var6, var7, this.C, this.D, this.E, var18);
      }

      if (var14) {
         if (this.F == 1) {
            var1.k(var29, var27, var30, var28, this.G, 8);
         } else {
            var1.k(var30, var28, var29, var27, this.G, 8);
         }
      }

      if (this.V.n()) {
         var1.b(this, this.V.i().g(), (float)Math.toRadians((double)(this.I + 90.0F)), this.V.e());
      }

      this.p = false;
      this.q = false;
   }

   public boolean g0() {
      d var2 = this.O;
      d var1 = var2.f;
      if (var1 == null || var1.f != var2) {
         var1 = this.Q;
         var2 = var1.f;
         if (var2 == null || var2.f != var1) {
            return false;
         }
      }

      return true;
   }

   public void g1(int var1) {
      this.s0 = var1;
   }

   public boolean h() {
      boolean var1;
      if (this.s0 != 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean h0() {
      return this.K;
   }

   public void h1(int var1) {
      this.b0 = var1;
      int var2 = this.m0;
      if (var1 < var2) {
         this.b0 = var2;
      }

   }

   public boolean i0() {
      d var1 = this.P;
      d var2 = var1.f;
      if (var2 == null || var2.f != var1) {
         var2 = this.R;
         var1 = var2.f;
         if (var1 == null || var1.f != var2) {
            return false;
         }
      }

      return true;
   }

   public void i1(int var1) {
      if (var1 >= 0 && var1 <= 3) {
         this.v = var1;
      }

   }

   public void j(e var1, float var2, int var3) {
      d.b var4 = d.b.s;
      this.c0(var4, var1, var4, var3, 0);
      this.I = var2;
   }

   public boolean j0() {
      return this.L;
   }

   public void j1(int var1) {
      this.f0 = var1;
   }

   public void k(o.d var1) {
      var1.q(this.O);
      var1.q(this.P);
      var1.q(this.Q);
      var1.q(this.R);
      if (this.l0 > 0) {
         var1.q(this.S);
      }

   }

   public boolean k0() {
      boolean var1;
      if (this.i && this.s0 != 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void k1(int var1) {
      this.g0 = var1;
   }

   public void l() {
      if (this.e == null) {
         this.e = new s.l(this);
      }

      if (this.f == null) {
         this.f = new n(this);
      }

   }

   public boolean l0() {
      boolean var1;
      if (this.p || this.O.m() && this.Q.m()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void l1(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.F == -1) {
         if (var3 && !var4) {
            this.F = 0;
         } else if (!var3 && var4) {
            this.F = 1;
            if (this.e0 == -1) {
               this.G = 1.0F / this.G;
            }
         }
      }

      if (this.F == 0 && (!this.P.n() || !this.R.n())) {
         this.F = 1;
      } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
         this.F = 0;
      }

      if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
         if (this.P.n() && this.R.n()) {
            this.F = 0;
         } else if (this.O.n() && this.Q.n()) {
            this.G = 1.0F / this.G;
            this.F = 1;
         }
      }

      if (this.F == -1) {
         int var5 = this.z;
         if (var5 > 0 && this.C == 0) {
            this.F = 0;
         } else if (var5 == 0 && this.C > 0) {
            this.G = 1.0F / this.G;
            this.F = 1;
         }
      }

   }

   public d m(d.b var1) {
      switch (null.a[var1.ordinal()]) {
         case 1:
            return this.O;
         case 2:
            return this.P;
         case 3:
            return this.Q;
         case 4:
            return this.R;
         case 5:
            return this.S;
         case 6:
            return this.V;
         case 7:
            return this.T;
         case 8:
            return this.U;
         case 9:
            return null;
         default:
            throw new AssertionError(var1.name());
      }
   }

   public boolean m0() {
      boolean var1;
      if (this.q || this.P.m() && this.R.m()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void m1(boolean var1, boolean var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      boolean var8;
      boolean var9;
      label63: {
         var9 = var1 & this.e.k();
         var8 = var2 & this.f.k();
         s.l var11 = this.e;
         var3 = var11.h.g;
         n var10 = this.f;
         var4 = var10.h.g;
         var6 = var11.i.g;
         int var7 = var10.i.g;
         if (var6 - var3 >= 0 && var7 - var4 >= 0 && var3 != Integer.MIN_VALUE && var3 != Integer.MAX_VALUE && var4 != Integer.MIN_VALUE && var4 != Integer.MAX_VALUE && var6 != Integer.MIN_VALUE && var6 != Integer.MAX_VALUE && var7 != Integer.MIN_VALUE) {
            var5 = var7;
            if (var7 != Integer.MAX_VALUE) {
               break label63;
            }
         }

         byte var13 = 0;
         byte var12 = 0;
         var4 = var12;
         var5 = var12;
         var3 = var12;
         var6 = var13;
      }

      var6 -= var3;
      var5 -= var4;
      if (var9) {
         this.f0 = var3;
      }

      if (var8) {
         this.g0 = var4;
      }

      if (this.s0 == 8) {
         this.b0 = 0;
         this.c0 = 0;
      } else {
         if (var9) {
            var3 = var6;
            if (this.Z[0] == e.b.m) {
               var4 = this.b0;
               var3 = var6;
               if (var6 < var4) {
                  var3 = var4;
               }
            }

            this.b0 = var3;
            var4 = this.m0;
            if (var3 < var4) {
               this.b0 = var4;
            }
         }

         if (var8) {
            var3 = var5;
            if (this.Z[1] == e.b.m) {
               var4 = this.c0;
               var3 = var5;
               if (var5 < var4) {
                  var3 = var4;
               }
            }

            this.c0 = var3;
            var4 = this.n0;
            if (var3 < var4) {
               this.c0 = var4;
            }
         }

      }
   }

   public int n() {
      return this.l0;
   }

   public boolean n0() {
      return this.s;
   }

   public void n1(o.d var1, boolean var2) {
      int var6 = var1.x(this.O);
      int var8 = var1.x(this.P);
      int var4 = var1.x(this.Q);
      int var7 = var1.x(this.R);
      int var5 = var6;
      int var3 = var4;
      s.f var10;
      s.f var11;
      if (var2) {
         s.l var9 = this.e;
         var5 = var6;
         var3 = var4;
         if (var9 != null) {
            var10 = var9.h;
            var5 = var6;
            var3 = var4;
            if (var10.j) {
               var11 = var9.i;
               var5 = var6;
               var3 = var4;
               if (var11.j) {
                  var5 = var10.g;
                  var3 = var11.g;
               }
            }
         }
      }

      var6 = var8;
      var4 = var7;
      if (var2) {
         n var12 = this.f;
         var6 = var8;
         var4 = var7;
         if (var12 != null) {
            var10 = var12.h;
            var6 = var8;
            var4 = var7;
            if (var10.j) {
               var11 = var12.i;
               var6 = var8;
               var4 = var7;
               if (var11.j) {
                  var6 = var10.g;
                  var4 = var11.g;
               }
            }
         }
      }

      label44: {
         if (var3 - var5 >= 0 && var4 - var6 >= 0 && var5 != Integer.MIN_VALUE && var5 != Integer.MAX_VALUE && var6 != Integer.MIN_VALUE && var6 != Integer.MAX_VALUE && var3 != Integer.MIN_VALUE && var3 != Integer.MAX_VALUE && var4 != Integer.MIN_VALUE) {
            var7 = var6;
            var6 = var3;
            var3 = var4;
            if (var4 != Integer.MAX_VALUE) {
               break label44;
            }
         }

         var5 = 0;
         var3 = 0;
         var7 = 0;
         var6 = var7;
      }

      this.G0(var5, var7, var6, var3);
   }

   public float o(int var1) {
      if (var1 == 0) {
         return this.o0;
      } else {
         return var1 == 1 ? this.p0 : -1.0F;
      }
   }

   public void o0() {
      this.r = true;
   }

   public int p() {
      return this.W() + this.c0;
   }

   public void p0() {
      this.s = true;
   }

   public Object q() {
      return this.q0;
   }

   public boolean q0() {
      b[] var3 = this.Z;
      boolean var2 = false;
      b var5 = var3[0];
      b var4 = e.b.o;
      boolean var1 = var2;
      if (var5 == var4) {
         var1 = var2;
         if (var3[1] == var4) {
            var1 = true;
         }
      }

      return var1;
   }

   public String r() {
      return this.u0;
   }

   public void r0() {
      this.O.p();
      this.P.p();
      this.Q.p();
      this.R.p();
      this.S.p();
      this.T.p();
      this.U.p();
      this.V.p();
      this.a0 = null;
      this.I = 0.0F;
      this.b0 = 0;
      this.c0 = 0;
      this.d0 = 0.0F;
      this.e0 = -1;
      this.f0 = 0;
      this.g0 = 0;
      this.j0 = 0;
      this.k0 = 0;
      this.l0 = 0;
      this.m0 = 0;
      this.n0 = 0;
      float var1 = K0;
      this.o0 = var1;
      this.p0 = var1;
      b[] var3 = this.Z;
      b var2 = e.b.m;
      var3[0] = var2;
      var3[1] = var2;
      this.q0 = null;
      this.r0 = 0;
      this.s0 = 0;
      this.v0 = null;
      this.w0 = false;
      this.x0 = false;
      this.z0 = 0;
      this.A0 = 0;
      this.B0 = false;
      this.C0 = false;
      float[] var4 = this.D0;
      var4[0] = -1.0F;
      var4[1] = -1.0F;
      this.t = -1;
      this.u = -1;
      int[] var5 = this.H;
      var5[0] = Integer.MAX_VALUE;
      var5[1] = Integer.MAX_VALUE;
      this.w = 0;
      this.x = 0;
      this.B = 1.0F;
      this.E = 1.0F;
      this.A = Integer.MAX_VALUE;
      this.D = Integer.MAX_VALUE;
      this.z = 0;
      this.C = 0;
      this.h = false;
      this.F = -1;
      this.G = 1.0F;
      this.y0 = false;
      boolean[] var6 = this.g;
      var6[0] = true;
      var6[1] = true;
      this.L = false;
      var6 = this.Y;
      var6[0] = false;
      var6[1] = false;
      this.i = true;
      var5 = this.y;
      var5[0] = 0;
      var5[1] = 0;
      this.l = -1;
      this.m = -1;
   }

   public b s(int var1) {
      if (var1 == 0) {
         return this.y();
      } else {
         return var1 == 1 ? this.R() : null;
      }
   }

   public void s0() {
      int var1 = 0;
      this.p = false;
      this.q = false;
      this.r = false;
      this.s = false;

      for(int var2 = this.X.size(); var1 < var2; ++var1) {
         ((d)this.X.get(var1)).q();
      }

   }

   public float t() {
      return this.d0;
   }

   public void t0(o.c var1) {
      this.O.r(var1);
      this.P.r(var1);
      this.Q.r(var1);
      this.R.r(var1);
      this.S.r(var1);
      this.V.r(var1);
      this.T.r(var1);
      this.U.r(var1);
   }

   public String toString() {
      StringBuilder var3 = new StringBuilder();
      String var1 = this.v0;
      String var2 = "";
      StringBuilder var4;
      if (var1 != null) {
         var4 = new StringBuilder();
         var4.append("type: ");
         var4.append(this.v0);
         var4.append(" ");
         var1 = var4.toString();
      } else {
         var1 = "";
      }

      var3.append(var1);
      var1 = var2;
      if (this.u0 != null) {
         var4 = new StringBuilder();
         var4.append("id: ");
         var4.append(this.u0);
         var4.append(" ");
         var1 = var4.toString();
      }

      var3.append(var1);
      var3.append("(");
      var3.append(this.f0);
      var3.append(", ");
      var3.append(this.g0);
      var3.append(") - (");
      var3.append(this.b0);
      var3.append(" x ");
      var3.append(this.c0);
      var3.append(")");
      return var3.toString();
   }

   public int u() {
      return this.e0;
   }

   public int v() {
      return this.s0 == 8 ? 0 : this.c0;
   }

   public float w() {
      return this.o0;
   }

   public int x() {
      return this.z0;
   }

   public void x0(int var1) {
      this.l0 = var1;
      boolean var2;
      if (var1 > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.J = var2;
   }

   public b y() {
      return this.Z[0];
   }

   public void y0(Object var1) {
      this.q0 = var1;
   }

   public int z() {
      d var3 = this.O;
      int var1 = 0;
      if (var3 != null) {
         var1 = 0 + var3.g;
      }

      var3 = this.Q;
      int var2 = var1;
      if (var3 != null) {
         var2 = var1 + var3.g;
      }

      return var2;
   }

   public void z0(String var1) {
      this.u0 = var1;
   }

   public static enum b {
      m,
      n,
      o,
      p;

      private static final b[] q;

      static {
         b var1 = new b("FIXED", 0);
         m = var1;
         b var3 = new b("WRAP_CONTENT", 1);
         n = var3;
         b var0 = new b("MATCH_CONSTRAINT", 2);
         o = var0;
         b var2 = new b("MATCH_PARENT", 3);
         p = var2;
         q = new b[]{var1, var3, var0, var2};
      }
   }
}
