package r;

public class a extends i {
   private int N0 = 0;
   private boolean O0 = true;
   private int P0 = 0;
   boolean Q0 = false;

   public void g(o.d var1, boolean var2) {
      d[] var7 = super.W;
      var7[0] = super.O;
      var7[2] = super.P;
      var7[1] = super.Q;
      var7[3] = super.R;
      int var3 = 0;

      while(true) {
         var7 = super.W;
         d var14;
         if (var3 >= var7.length) {
            var3 = this.N0;
            if (var3 >= 0 && var3 < 4) {
               var14 = var7[var3];
               if (!this.Q0) {
                  this.q1();
               }

               if (this.Q0) {
                  this.Q0 = false;
                  var3 = this.N0;
                  if (var3 != 0 && var3 != 1) {
                     if (var3 == 2 || var3 == 3) {
                        var1.f(super.P.i, super.g0);
                        var1.f(super.R.i, super.g0);
                     }
                  } else {
                     var1.f(super.O.i, super.f0);
                     var1.f(super.Q.i, super.f0);
                  }

                  return;
               }

               var3 = 0;

               int var4;
               label180: {
                  while(true) {
                     if (var3 >= super.M0) {
                        var2 = false;
                        break label180;
                     }

                     e var8 = super.L0[var3];
                     if (this.O0 || var8.h()) {
                        var4 = this.N0;
                        if ((var4 == 0 || var4 == 1) && var8.y() == e.b.o && var8.O.f != null && var8.Q.f != null) {
                           break;
                        }

                        var4 = this.N0;
                        if ((var4 == 2 || var4 == 3) && var8.R() == e.b.o && var8.P.f != null && var8.R.f != null) {
                           break;
                        }
                     }

                     ++var3;
                  }

                  var2 = true;
               }

               boolean var11;
               if (!super.O.k() && !super.Q.k()) {
                  var11 = false;
               } else {
                  var11 = true;
               }

               boolean var12;
               if (!super.P.k() && !super.R.k()) {
                  var12 = false;
               } else {
                  var12 = true;
               }

               int var5;
               label142: {
                  if (!var2) {
                     var5 = this.N0;
                     if (var5 == 0 && var11 || var5 == 2 && var12 || var5 == 1 && var11 || var5 == 3 && var12) {
                        var11 = true;
                        break label142;
                     }
                  }

                  var11 = false;
               }

               byte var13;
               if (!var11) {
                  var13 = 4;
               } else {
                  var13 = 5;
               }

               for(var4 = 0; var4 < super.M0; ++var4) {
                  e var9 = super.L0[var4];
                  if (this.O0 || var9.h()) {
                     o.i var15 = var1.q(var9.W[this.N0]);
                     d[] var16 = var9.W;
                     int var6 = this.N0;
                     d var17 = var16[var6];
                     var17.i = var15;
                     d var10 = var17.f;
                     if (var10 != null && var10.d == this) {
                        var5 = var17.g + 0;
                     } else {
                        var5 = 0;
                     }

                     if (var6 != 0 && var6 != 2) {
                        var1.g(var14.i, var15, this.P0 + var5, var2);
                     } else {
                        var1.i(var14.i, var15, this.P0 - var5, var2);
                     }

                     var1.e(var14.i, var15, this.P0 + var5, var13);
                  }
               }

               var3 = this.N0;
               if (var3 == 0) {
                  var1.e(super.Q.i, super.O.i, 0, 8);
                  var1.e(super.O.i, super.a0.Q.i, 0, 4);
                  var1.e(super.O.i, super.a0.O.i, 0, 0);
               } else if (var3 == 1) {
                  var1.e(super.O.i, super.Q.i, 0, 8);
                  var1.e(super.O.i, super.a0.O.i, 0, 4);
                  var1.e(super.O.i, super.a0.Q.i, 0, 0);
               } else if (var3 == 2) {
                  var1.e(super.R.i, super.P.i, 0, 8);
                  var1.e(super.P.i, super.a0.R.i, 0, 4);
                  var1.e(super.P.i, super.a0.P.i, 0, 0);
               } else if (var3 == 3) {
                  var1.e(super.P.i, super.R.i, 0, 8);
                  var1.e(super.P.i, super.a0.P.i, 0, 4);
                  var1.e(super.P.i, super.a0.R.i, 0, 0);
               }
            }

            return;
         }

         var14 = var7[var3];
         var14.i = var1.q(var14);
         ++var3;
      }
   }

   public boolean h() {
      return true;
   }

   public boolean l0() {
      return this.Q0;
   }

   public boolean m0() {
      return this.Q0;
   }

   public boolean q1() {
      int var5 = 0;
      boolean var1 = true;
      int var2 = 0;

      while(true) {
         int var3 = super.M0;
         e var7;
         if (var2 >= var3) {
            if (var1 && var3 > 0) {
               int var8 = 0;

               for(boolean var11 = false; var5 < super.M0; ++var5) {
                  var7 = super.L0[var5];
                  if (this.O0 || var7.h()) {
                     var3 = var8;
                     boolean var9 = var11;
                     if (!var11) {
                        var2 = this.N0;
                        if (var2 == 0) {
                           var8 = var7.m(d.b.n).d();
                        } else if (var2 == 1) {
                           var8 = var7.m(d.b.p).d();
                        } else if (var2 == 2) {
                           var8 = var7.m(d.b.o).d();
                        } else if (var2 == 3) {
                           var8 = var7.m(d.b.q).d();
                        }

                        var9 = true;
                        var3 = var8;
                     }

                     int var6 = this.N0;
                     if (var6 == 0) {
                        var8 = Math.min(var3, var7.m(d.b.n).d());
                        var11 = var9;
                     } else if (var6 == 1) {
                        var8 = Math.max(var3, var7.m(d.b.p).d());
                        var11 = var9;
                     } else if (var6 == 2) {
                        var8 = Math.min(var3, var7.m(d.b.o).d());
                        var11 = var9;
                     } else {
                        var8 = var3;
                        var11 = var9;
                        if (var6 == 3) {
                           var8 = Math.max(var3, var7.m(d.b.q).d());
                           var11 = var9;
                        }
                     }
                  }
               }

               var2 = var8 + this.P0;
               var8 = this.N0;
               if (var8 != 0 && var8 != 1) {
                  this.F0(var2, var2);
               } else {
                  this.C0(var2, var2);
               }

               this.Q0 = true;
               return true;
            }

            return false;
         }

         var7 = super.L0[var2];
         boolean var10;
         if (!this.O0 && !var7.h()) {
            var10 = var1;
         } else {
            label111: {
               var3 = this.N0;
               if (var3 != 0 && var3 != 1 || var7.l0()) {
                  int var4 = this.N0;
                  if (var4 != 2) {
                     var10 = var1;
                     if (var4 != 3) {
                        break label111;
                     }
                  }

                  var10 = var1;
                  if (var7.m0()) {
                     break label111;
                  }
               }

               var10 = false;
            }
         }

         ++var2;
         var1 = var10;
      }
   }

   public boolean r1() {
      return this.O0;
   }

   public int s1() {
      return this.N0;
   }

   public int t1() {
      return this.P0;
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append("[Barrier] ");
      var2.append(this.r());
      var2.append(" {");
      String var5 = var2.toString();

      StringBuilder var6;
      for(int var1 = 0; var1 < super.M0; ++var1) {
         e var4 = super.L0[var1];
         String var3 = var5;
         if (var1 > 0) {
            var6 = new StringBuilder();
            var6.append(var5);
            var6.append(", ");
            var3 = var6.toString();
         }

         var2 = new StringBuilder();
         var2.append(var3);
         var2.append(var4.r());
         var5 = var2.toString();
      }

      var6 = new StringBuilder();
      var6.append(var5);
      var6.append("}");
      return var6.toString();
   }

   public int u1() {
      int var1 = this.N0;
      if (var1 != 0 && var1 != 1) {
         return var1 != 2 && var1 != 3 ? -1 : 1;
      } else {
         return 0;
      }
   }

   protected void v1() {
      for(int var1 = 0; var1 < super.M0; ++var1) {
         e var3 = super.L0[var1];
         if (this.O0 || var3.h()) {
            int var2 = this.N0;
            if (var2 != 0 && var2 != 1) {
               if (var2 == 2 || var2 == 3) {
                  var3.P0(1, true);
               }
            } else {
               var3.P0(0, true);
            }
         }
      }

   }

   public void w1(boolean var1) {
      this.O0 = var1;
   }

   public void x1(int var1) {
      this.N0 = var1;
   }

   public void y1(int var1) {
      this.P0 = var1;
   }
}
