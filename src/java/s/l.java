package s;

public class l extends p {
   private static int[] k = new int[2];

   public l(r.e var1) {
      super(var1);
      super.h.e = null.p;
      super.i.e = null.q;
      super.f = 0;
   }

   private void q(int[] var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      var2 = var3 - var2;
      var3 = var5 - var4;
      if (var7 != -1) {
         if (var7 != 0) {
            if (var7 == 1) {
               var3 = (int)((float)var2 * var6 + 0.5F);
               var1[0] = var2;
               var1[1] = var3;
            }
         } else {
            var1[0] = (int)((float)var3 * var6 + 0.5F);
            var1[1] = var3;
         }
      } else {
         var4 = (int)((float)var3 * var6 + 0.5F);
         var5 = (int)((float)var2 / var6 + 0.5F);
         if (var4 <= var2) {
            var1[0] = var4;
            var1[1] = var3;
         } else if (var5 <= var3) {
            var1[0] = var2;
            var1[1] = var5;
         }
      }

   }

   public void a(d var1) {
      int var4 = l$a.a[super.j.ordinal()];
      if (var4 != 1) {
         if (var4 != 2) {
            if (var4 == 3) {
               r.e var13 = super.b;
               this.n(var1, var13.O, var13.Q, 0);
               return;
            }
         } else {
            this.o(var1);
         }
      } else {
         this.p(var1);
      }

      float var2;
      r.e var16;
      f var18;
      int var20;
      int var21;
      f var24;
      if (!super.e.j && super.d == r.e.b.o) {
         r.e var14 = super.b;
         var4 = var14.w;
         if (var4 != 2) {
            if (var4 == 3) {
               var4 = var14.x;
               if (var4 != 0 && var4 != 3) {
                  label195: {
                     label194: {
                        var4 = var14.u();
                        float var3;
                        if (var4 != -1) {
                           if (var4 == 0) {
                              var16 = super.b;
                              var2 = (float)var16.f.e.g / var16.t();
                              break label194;
                           }

                           if (var4 != 1) {
                              var4 = 0;
                              break label195;
                           }

                           var16 = super.b;
                           var3 = (float)var16.f.e.g;
                           var2 = var16.t();
                        } else {
                           var16 = super.b;
                           var3 = (float)var16.f.e.g;
                           var2 = var16.t();
                        }

                        var2 = var3 * var2;
                     }

                     var4 = (int)(var2 + 0.5F);
                  }

                  super.e.d(var4);
               } else {
                  n var23 = var14.f;
                  var18 = var23.h;
                  var24 = var23.i;
                  boolean var19;
                  if (var14.O.f != null) {
                     var19 = true;
                  } else {
                     var19 = false;
                  }

                  boolean var5;
                  if (var14.P.f != null) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  boolean var6;
                  if (var14.Q.f != null) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }

                  boolean var7;
                  if (var14.R.f != null) {
                     var7 = true;
                  } else {
                     var7 = false;
                  }

                  int var8 = var14.u();
                  if (var19 && var5 && var6 && var7) {
                     var2 = super.b.t();
                     int var9;
                     int var10;
                     int var11;
                     int var12;
                     int var22;
                     f var25;
                     if (var18.j && var24.j) {
                        var25 = super.h;
                        if (var25.c && super.i.c) {
                           var9 = ((f)var25.l.get(0)).g;
                           var11 = super.h.f;
                           var12 = ((f)super.i.l.get(0)).g;
                           var10 = super.i.f;
                           var21 = var18.g;
                           var22 = var18.f;
                           var4 = var24.g;
                           var20 = var24.f;
                           this.q(k, var9 + var11, var12 - var10, var21 + var22, var4 - var20, var2, var8);
                           super.e.d(k[0]);
                           super.b.f.e.d(k[1]);
                        }

                        return;
                     }

                     var25 = super.h;
                     if (var25.j) {
                        f var15 = super.i;
                        if (var15.j) {
                           if (!var18.c || !var24.c) {
                              return;
                           }

                           var9 = var25.g;
                           var11 = var25.f;
                           var10 = var15.g;
                           var4 = var15.f;
                           var12 = ((f)var18.l.get(0)).g;
                           var21 = var18.f;
                           var22 = ((f)var24.l.get(0)).g;
                           var20 = var24.f;
                           this.q(k, var9 + var11, var10 - var4, var12 + var21, var22 - var20, var2, var8);
                           super.e.d(k[0]);
                           super.b.f.e.d(k[1]);
                        }
                     }

                     var25 = super.h;
                     if (!var25.c || !super.i.c || !var18.c || !var24.c) {
                        return;
                     }

                     var21 = ((f)var25.l.get(0)).g;
                     var11 = super.h.f;
                     var20 = ((f)super.i.l.get(0)).g;
                     var12 = super.i.f;
                     var4 = ((f)var18.l.get(0)).g;
                     var9 = var18.f;
                     var22 = ((f)var24.l.get(0)).g;
                     var10 = var24.f;
                     this.q(k, var21 + var11, var20 - var12, var4 + var9, var22 - var10, var2, var8);
                     super.e.d(k[0]);
                     super.b.f.e.d(k[1]);
                  } else if (var19 && var6) {
                     if (!super.h.c || !super.i.c) {
                        return;
                     }

                     var2 = super.b.t();
                     var4 = ((f)super.h.l.get(0)).g + super.h.f;
                     var20 = ((f)super.i.l.get(0)).g - super.i.f;
                     if (var8 != -1 && var8 != 0) {
                        if (var8 == 1) {
                           var4 = this.g(var20 - var4, 0);
                           var21 = (int)((float)var4 / var2 + 0.5F);
                           var20 = this.g(var21, 1);
                           if (var21 != var20) {
                              var4 = (int)((float)var20 * var2 + 0.5F);
                           }

                           super.e.d(var4);
                           super.b.f.e.d(var20);
                        }
                     } else {
                        var4 = this.g(var20 - var4, 0);
                        var21 = (int)((float)var4 * var2 + 0.5F);
                        var20 = this.g(var21, 1);
                        if (var21 != var20) {
                           var4 = (int)((float)var20 / var2 + 0.5F);
                        }

                        super.e.d(var4);
                        super.b.f.e.d(var20);
                     }
                  } else if (var5 && var7) {
                     label267: {
                        if (!var18.c || !var24.c) {
                           return;
                        }

                        var2 = super.b.t();
                        var4 = ((f)var18.l.get(0)).g + var18.f;
                        var20 = ((f)var24.l.get(0)).g - var24.f;
                        if (var8 != -1) {
                           if (var8 == 0) {
                              var4 = this.g(var20 - var4, 1);
                              var21 = (int)((float)var4 * var2 + 0.5F);
                              var20 = this.g(var21, 0);
                              if (var21 != var20) {
                                 var4 = (int)((float)var20 / var2 + 0.5F);
                              }

                              super.e.d(var20);
                              super.b.f.e.d(var4);
                              break label267;
                           }

                           if (var8 != 1) {
                              break label267;
                           }
                        }

                        var4 = this.g(var20 - var4, 1);
                        var21 = (int)((float)var4 / var2 + 0.5F);
                        var20 = this.g(var21, 0);
                        if (var21 != var20) {
                           var4 = (int)((float)var20 * var2 + 0.5F);
                        }

                        super.e.d(var20);
                        super.b.f.e.d(var4);
                     }
                  }
               }
            }
         } else {
            var16 = var14.I();
            if (var16 != null) {
               g var17 = var16.e.e;
               if (var17.j) {
                  var2 = super.b.B;
                  var4 = (int)((float)var17.g * var2 + 0.5F);
                  super.e.d(var4);
               }
            }
         }
      }

      var18 = super.h;
      if (var18.c) {
         var24 = super.i;
         if (var24.c) {
            if (var18.j && var24.j && super.e.j) {
               return;
            }

            if (!super.e.j && super.d == r.e.b.o) {
               var16 = super.b;
               if (var16.w == 0 && !var16.g0()) {
                  var24 = (f)super.h.l.get(0);
                  var18 = (f)super.i.l.get(0);
                  var4 = var24.g;
                  var24 = super.h;
                  var4 += var24.f;
                  var20 = var18.g + super.i.f;
                  var24.d(var4);
                  super.i.d(var20);
                  super.e.d(var20 - var4);
                  return;
               }
            }

            if (!super.e.j && super.d == r.e.b.o && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
               var24 = (f)super.h.l.get(0);
               var18 = (f)super.i.l.get(0);
               var20 = var24.g;
               var4 = super.h.f;
               var4 = Math.min(var18.g + super.i.f - (var20 + var4), super.e.m);
               var16 = super.b;
               var21 = var16.A;
               var20 = Math.max(var16.z, var4);
               var4 = var20;
               if (var21 > 0) {
                  var4 = Math.min(var21, var20);
               }

               super.e.d(var4);
            }

            if (!super.e.j) {
               return;
            }

            var18 = (f)super.h.l.get(0);
            var24 = (f)super.i.l.get(0);
            var20 = var18.g + super.h.f;
            var4 = var24.g + super.i.f;
            var2 = super.b.w();
            if (var18 == var24) {
               var20 = var18.g;
               var4 = var24.g;
               var2 = 0.5F;
            }

            var21 = super.e.g;
            super.h.d((int)((float)var20 + 0.5F + (float)(var4 - var20 - var21) * var2));
            super.i.d(super.h.g + super.e.g);
         }
      }

   }

   void d() {
      r.e var4 = super.b;
      if (var4.a) {
         super.e.d(var4.U());
      }

      int var1;
      r.e.b var5;
      r.e.b var8;
      r.e var9;
      if (!super.e.j) {
         var5 = super.b.y();
         super.d = var5;
         if (var5 != r.e.b.o) {
            var8 = r.e.b.p;
            if (var5 == var8) {
               var9 = super.b.I();
               if (var9 != null && (var9.y() == r.e.b.m || var9.y() == var8)) {
                  var1 = var9.U();
                  int var3 = super.b.O.e();
                  int var2 = super.b.Q.e();
                  this.b(super.h, var9.e.h, super.b.O.e());
                  this.b(super.i, var9.e.i, -super.b.Q.e());
                  super.e.d(var1 - var3 - var2);
                  return;
               }
            }

            if (super.d == r.e.b.m) {
               super.e.d(super.b.U());
            }
         }
      } else {
         var5 = super.d;
         var8 = r.e.b.p;
         if (var5 == var8) {
            var9 = super.b.I();
            if (var9 != null && (var9.y() == r.e.b.m || var9.y() == var8)) {
               this.b(super.h, var9.e.h, super.b.O.e());
               this.b(super.i, var9.e.i, -super.b.Q.e());
               return;
            }
         }
      }

      g var12 = super.e;
      r.d var13;
      r.d var15;
      f var18;
      if (var12.j) {
         var4 = super.b;
         if (var4.a) {
            r.d[] var16 = var4.W;
            var13 = var16[0];
            var15 = var13.f;
            if (var15 != null && var16[1].f != null) {
               if (var4.g0()) {
                  super.h.f = super.b.W[0].e();
                  super.i.f = -super.b.W[1].e();
               } else {
                  var18 = this.h(super.b.W[0]);
                  if (var18 != null) {
                     this.b(super.h, var18, super.b.W[0].e());
                  }

                  var18 = this.h(super.b.W[1]);
                  if (var18 != null) {
                     this.b(super.i, var18, -super.b.W[1].e());
                  }

                  super.h.b = true;
                  super.i.b = true;
               }

               return;
            } else if (var15 != null) {
               var18 = this.h(var13);
               if (var18 != null) {
                  this.b(super.h, var18, super.b.W[0].e());
                  this.b(super.i, super.h, super.e.g);
                  return;
               }

               return;
            } else {
               var15 = var16[1];
               if (var15.f != null) {
                  var18 = this.h(var15);
                  if (var18 != null) {
                     this.b(super.i, var18, -super.b.W[1].e());
                     this.b(super.h, super.i, -super.e.g);
                     return;
                  }
               } else if (!(var4 instanceof r.h) && var4.I() != null && super.b.m(r.d.b.s).f == null) {
                  var18 = super.b.I().e.h;
                  this.b(super.h, var18, super.b.V());
                  this.b(super.i, super.h, super.e.g);
                  return;
               }

               return;
            }
         }
      }

      if (super.d == r.e.b.o) {
         r.e var6 = super.b;
         var1 = var6.w;
         g var11;
         if (var1 != 2) {
            if (var1 == 3) {
               if (var6.x == 3) {
                  super.h.a = this;
                  super.i.a = this;
                  n var10 = var6.f;
                  var10.h.a = this;
                  var10.i.a = this;
                  var12.a = this;
                  if (var6.i0()) {
                     super.e.l.add(super.b.f.e);
                     super.b.f.e.k.add(super.e);
                     var10 = super.b.f;
                     var10.e.a = this;
                     super.e.l.add(var10.h);
                     super.e.l.add(super.b.f.i);
                     super.b.f.h.k.add(super.e);
                     super.b.f.i.k.add(super.e);
                  } else if (super.b.g0()) {
                     super.b.f.e.l.add(super.e);
                     super.e.k.add(super.b.f.e);
                  } else {
                     super.b.f.e.l.add(super.e);
                  }
               } else {
                  var11 = var6.f.e;
                  var12.l.add(var11);
                  var11.k.add(super.e);
                  super.b.f.h.k.add(super.e);
                  super.b.f.i.k.add(super.e);
                  var11 = super.e;
                  var11.b = true;
                  var11.k.add(super.h);
                  super.e.k.add(super.i);
                  super.h.l.add(super.e);
                  super.i.l.add(super.e);
               }
            }
         } else {
            var4 = var6.I();
            if (var4 != null) {
               var11 = var4.f.e;
               super.e.l.add(var11);
               var11.k.add(super.e);
               var11 = super.e;
               var11.b = true;
               var11.k.add(super.h);
               super.e.k.add(super.i);
            }
         }
      }

      var4 = super.b;
      r.d[] var14 = var4.W;
      var13 = var14[0];
      r.d var7 = var13.f;
      if (var7 != null && var14[1].f != null) {
         if (var4.g0()) {
            super.h.f = super.b.W[0].e();
            super.i.f = -super.b.W[1].e();
         } else {
            f var17 = this.h(super.b.W[0]);
            var18 = this.h(super.b.W[1]);
            if (var17 != null) {
               var17.b(this);
            }

            if (var18 != null) {
               var18.b(this);
            }

            super.j = p.b.p;
         }
      } else if (var7 != null) {
         var18 = this.h(var13);
         if (var18 != null) {
            this.b(super.h, var18, super.b.W[0].e());
            this.c(super.i, super.h, 1, super.e);
         }
      } else {
         var15 = var14[1];
         if (var15.f != null) {
            var18 = this.h(var15);
            if (var18 != null) {
               this.b(super.i, var18, -super.b.W[1].e());
               this.c(super.h, super.i, -1, super.e);
            }
         } else if (!(var4 instanceof r.h) && var4.I() != null) {
            var18 = super.b.I().e.h;
            this.b(super.h, var18, super.b.V());
            this.c(super.i, super.h, 1, super.e);
         }
      }

   }

   public void e() {
      f var1 = super.h;
      if (var1.j) {
         super.b.j1(var1.g);
      }

   }

   void f() {
      super.c = null;
      super.h.c();
      super.i.c();
      super.e.c();
      super.g = false;
   }

   boolean m() {
      if (super.d == r.e.b.o) {
         return super.b.w == 0;
      } else {
         return true;
      }
   }

   void r() {
      super.g = false;
      super.h.c();
      super.h.j = false;
      super.i.c();
      super.i.j = false;
      super.e.j = false;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("HorizontalRun ");
      var1.append(super.b.r());
      return var1.toString();
   }
}
