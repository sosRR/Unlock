package r;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class f extends l {
   s.b M0 = new s.b(this);
   public s.e N0 = new s.e(this);
   private int O0;
   protected s.b.b P0 = null;
   private boolean Q0 = false;
   protected o.d R0 = new o.d();
   int S0;
   int T0;
   int U0;
   int V0;
   public int W0 = 0;
   public int X0 = 0;
   c[] Y0 = new c[4];
   c[] Z0 = new c[4];
   public boolean a1 = false;
   public boolean b1 = false;
   public boolean c1 = false;
   public int d1 = 0;
   public int e1 = 0;
   private int f1 = 257;
   public boolean g1 = false;
   private boolean h1 = false;
   private boolean i1 = false;
   int j1 = 0;
   private WeakReference k1 = null;
   private WeakReference l1 = null;
   private WeakReference m1 = null;
   private WeakReference n1 = null;
   HashSet o1 = new HashSet();
   public s.b.a p1 = new s.b.a();

   public static boolean O1(int var0, e var1, s.b.b var2, s.b.a var3, int var4) {
      if (var2 == null) {
         return false;
      } else if (var1.T() != 8 && !(var1 instanceof g) && !(var1 instanceof a)) {
         var3.a = var1.y();
         var3.b = var1.R();
         var3.c = var1.U();
         var3.d = var1.v();
         var3.i = false;
         var3.j = var4;
         e.b var9 = var3.a;
         e.b var8 = e.b.o;
         boolean var10;
         if (var9 == var8) {
            var10 = true;
         } else {
            var10 = false;
         }

         boolean var11;
         if (var3.b == var8) {
            var11 = true;
         } else {
            var11 = false;
         }

         boolean var7;
         if (var10 && var1.d0 > 0.0F) {
            var7 = true;
         } else {
            var7 = false;
         }

         boolean var6;
         if (var11 && var1.d0 > 0.0F) {
            var6 = true;
         } else {
            var6 = false;
         }

         boolean var5 = var10;
         if (var10) {
            var5 = var10;
            if (var1.Y(0)) {
               var5 = var10;
               if (var1.w == 0) {
                  var5 = var10;
                  if (!var7) {
                     var3.a = e.b.n;
                     if (var11 && var1.x == 0) {
                        var3.a = e.b.m;
                     }

                     var5 = false;
                  }
               }
            }
         }

         var10 = var11;
         if (var11) {
            var10 = var11;
            if (var1.Y(1)) {
               var10 = var11;
               if (var1.x == 0) {
                  var10 = var11;
                  if (!var6) {
                     var3.b = e.b.n;
                     if (var5 && var1.w == 0) {
                        var3.b = e.b.m;
                     }

                     var10 = false;
                  }
               }
            }
         }

         if (var1.l0()) {
            var3.a = e.b.m;
            var5 = false;
         }

         if (var1.m0()) {
            var3.b = e.b.m;
            var10 = false;
         }

         if (var7) {
            if (var1.y[0] == 4) {
               var3.a = e.b.m;
            } else if (!var10) {
               var9 = var3.b;
               var8 = e.b.m;
               if (var9 == var8) {
                  var0 = var3.d;
               } else {
                  var3.a = e.b.n;
                  var2.b(var1, var3);
                  var0 = var3.f;
               }

               var3.a = var8;
               var3.c = (int)(var1.t() * (float)var0);
            }
         }

         if (var6) {
            if (var1.y[1] == 4) {
               var3.b = e.b.m;
            } else if (!var5) {
               var8 = var3.a;
               var9 = e.b.m;
               if (var8 == var9) {
                  var0 = var3.c;
               } else {
                  var3.b = e.b.n;
                  var2.b(var1, var3);
                  var0 = var3.e;
               }

               var3.b = var9;
               if (var1.u() == -1) {
                  var3.d = (int)((float)var0 / var1.t());
               } else {
                  var3.d = (int)(var1.t() * (float)var0);
               }
            }
         }

         var2.b(var1, var3);
         var1.h1(var3.e);
         var1.I0(var3.f);
         var1.H0(var3.h);
         var1.x0(var3.g);
         var3.j = s.b.a.k;
         return var3.i;
      } else {
         var3.e = 0;
         var3.f = 0;
         return false;
      }
   }

   private void Q1() {
      this.W0 = 0;
      this.X0 = 0;
   }

   private void u1(e var1) {
      int var2 = this.W0;
      c[] var3 = this.Z0;
      if (var2 + 1 >= var3.length) {
         this.Z0 = (c[])Arrays.copyOf(var3, var3.length * 2);
      }

      this.Z0[this.W0] = new c(var1, 0, this.L1());
      ++this.W0;
   }

   private void x1(d var1, o.i var2) {
      o.i var3 = this.R0.q(var1);
      this.R0.h(var2, var3, 0, 5);
   }

   private void y1(d var1, o.i var2) {
      o.i var3 = this.R0.q(var1);
      this.R0.h(var3, var2, 0, 5);
   }

   private void z1(e var1) {
      int var2 = this.X0;
      c[] var3 = this.Y0;
      if (var2 + 1 >= var3.length) {
         this.Y0 = (c[])Arrays.copyOf(var3, var3.length * 2);
      }

      this.Y0[this.X0] = new c(var1, 1, this.L1());
      ++this.X0;
   }

   void A1(d var1) {
      WeakReference var2 = this.m1;
      if (var2 == null || var2.get() == null || var1.d() > ((d)this.m1.get()).d()) {
         this.m1 = new WeakReference(var1);
      }

   }

   void B1(d var1) {
      WeakReference var2 = this.k1;
      if (var2 == null || var2.get() == null || var1.d() > ((d)this.k1.get()).d()) {
         this.k1 = new WeakReference(var1);
      }

   }

   public boolean C1(boolean var1) {
      return this.N0.f(var1);
   }

   public boolean D1(boolean var1) {
      return this.N0.g(var1);
   }

   public boolean E1(boolean var1, int var2) {
      return this.N0.h(var1, var2);
   }

   public s.b.b F1() {
      return this.P0;
   }

   public int G1() {
      return this.f1;
   }

   public o.d H1() {
      return this.R0;
   }

   public void I1() {
      this.N0.j();
   }

   public void J1() {
      this.N0.k();
   }

   public boolean K1() {
      return this.i1;
   }

   public boolean L1() {
      return this.Q0;
   }

   public void M(StringBuilder var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(super.o);
      var2.append(":{\n");
      var1.append(var2.toString());
      var2 = new StringBuilder();
      var2.append("  actualWidth:");
      var2.append(super.b0);
      var1.append(var2.toString());
      var1.append("\n");
      var2 = new StringBuilder();
      var2.append("  actualHeight:");
      var2.append(super.c0);
      var1.append(var2.toString());
      var1.append("\n");
      Iterator var3 = this.o1().iterator();

      while(var3.hasNext()) {
         ((e)var3.next()).M(var1);
         var1.append(",\n");
      }

      var1.append("}");
   }

   public boolean M1() {
      return this.h1;
   }

   public long N1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.S0 = var8;
      this.T0 = var9;
      return this.M0.d(this, var1, var8, var9, var2, var3, var4, var5, var6, var7);
   }

   public boolean P1(int var1) {
      boolean var2;
      if ((this.f1 & var1) == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void R1(s.b.b var1) {
      this.P0 = var1;
      this.N0.n(var1);
   }

   public void S1(int var1) {
      this.f1 = var1;
      o.d.r = this.P1(512);
   }

   public void T1(int var1) {
      this.O0 = var1;
   }

   public void U1(boolean var1) {
      this.Q0 = var1;
   }

   public boolean V1(o.d var1, boolean[] var2) {
      int var3 = 0;
      var2[2] = false;
      boolean var6 = this.P1(64);
      this.n1(var1, var6);
      int var4 = super.L0.size();

      boolean var5;
      for(var5 = false; var3 < var4; ++var3) {
         e var7 = (e)super.L0.get(var3);
         var7.n1(var1, var6);
         if (var7.a0()) {
            var5 = true;
         }
      }

      return var5;
   }

   public void W1() {
      this.M0.e(this);
   }

   public void m1(boolean var1, boolean var2) {
      super.m1(var1, var2);
      int var4 = super.L0.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         ((e)super.L0.get(var3)).m1(var1, var2);
      }

   }

   public void p1() {
      super.f0 = 0;
      super.g0 = 0;
      this.h1 = false;
      this.i1 = false;
      int var9 = super.L0.size();
      int var2 = Math.max(0, this.U());
      int var3 = Math.max(0, this.v());
      e.b[] var15 = super.Z;
      e.b var14 = var15[1];
      e.b var46 = var15[0];
      int var1;
      e.b var17;
      e.b var18;
      if (this.O0 == 0 && r.j.b(this.f1, 1)) {
         s.h.h(this, this.F1());

         for(var1 = 0; var1 < var9; ++var1) {
            e var16 = (e)super.L0.get(var1);
            if (var16.k0() && !(var16 instanceof g) && !(var16 instanceof a) && !(var16 instanceof k) && !var16.j0()) {
               var17 = var16.s(0);
               var18 = var16.s(1);
               e.b var19 = e.b.o;
               boolean var4;
               if (var17 == var19 && var16.w != 1 && var18 == var19 && var16.x != 1) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               if (!var4) {
                  s.b.a var50 = new s.b.a();
                  O1(0, var16, this.P0, var50, s.b.a.k);
               }
            }
         }
      }

      int var5;
      boolean var42;
      int var45;
      label393: {
         if (var9 > 2) {
            e.b var47 = e.b.n;
            if ((var46 == var47 || var14 == var47) && r.j.b(this.f1, 1024) && s.i.c(this, this.F1())) {
               var1 = var2;
               if (var46 == var47) {
                  if (var2 < this.U() && var2 > 0) {
                     this.h1(var2);
                     this.h1 = true;
                     var1 = var2;
                  } else {
                     var1 = this.U();
                  }
               }

               var2 = var3;
               if (var14 == var47) {
                  if (var3 < this.v() && var3 > 0) {
                     this.I0(var3);
                     this.i1 = true;
                     var2 = var3;
                  } else {
                     var2 = this.v();
                  }
               }

               var5 = var1;
               var42 = true;
               var45 = var2;
               break label393;
            }
         }

         var42 = false;
         var45 = var3;
         var5 = var2;
      }

      boolean var43;
      if (!this.P1(64) && !this.P1(128)) {
         var43 = false;
      } else {
         var43 = true;
      }

      o.d var48 = this.R0;
      var48.h = false;
      var48.i = false;
      if (this.f1 != 0 && var43) {
         var48.i = true;
      }

      ArrayList var49 = super.L0;
      var18 = this.y();
      var17 = e.b.n;
      boolean var6;
      if (var18 != var17 && this.R() != var17) {
         var6 = false;
      } else {
         var6 = true;
      }

      this.Q1();

      e var52;
      for(var2 = 0; var2 < var9; ++var2) {
         var52 = (e)super.L0.get(var2);
         if (var52 instanceof l) {
            ((l)var52).p1();
         }
      }

      boolean var13 = this.P1(64);
      var2 = 0;

      int var8;
      for(boolean var11 = true; var11; var2 = var8) {
         var8 = var2 + 1;
         boolean var10 = var11;

         label348: {
            label347: {
               Exception var10000;
               label429: {
                  boolean var10001;
                  try {
                     this.R0.D();
                  } catch (Exception var41) {
                     var10000 = var41;
                     var10001 = false;
                     break label429;
                  }

                  var10 = var11;

                  try {
                     this.Q1();
                  } catch (Exception var40) {
                     var10000 = var40;
                     var10001 = false;
                     break label429;
                  }

                  var10 = var11;

                  try {
                     this.k(this.R0);
                  } catch (Exception var39) {
                     var10000 = var39;
                     var10001 = false;
                     break label429;
                  }

                  for(var2 = 0; var2 < var9; ++var2) {
                     var10 = var11;

                     try {
                        ((e)super.L0.get(var2)).k(this.R0);
                     } catch (Exception var38) {
                        var10000 = var38;
                        var10001 = false;
                        break label429;
                     }
                  }

                  var10 = var11;

                  try {
                     var11 = this.t1(this.R0);
                  } catch (Exception var37) {
                     var10000 = var37;
                     var10001 = false;
                     break label429;
                  }

                  var10 = var11;

                  WeakReference var53;
                  try {
                     var53 = this.k1;
                  } catch (Exception var36) {
                     var10000 = var36;
                     var10001 = false;
                     break label429;
                  }

                  if (var53 != null) {
                     label431: {
                        var10 = var11;

                        try {
                           if (var53.get() == null) {
                              break label431;
                           }
                        } catch (Exception var35) {
                           var10000 = var35;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.y1((d)this.k1.get(), this.R0.q(super.P));
                        } catch (Exception var34) {
                           var10000 = var34;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.k1 = null;
                        } catch (Exception var33) {
                           var10000 = var33;
                           var10001 = false;
                           break label429;
                        }
                     }
                  }

                  var10 = var11;

                  try {
                     var53 = this.m1;
                  } catch (Exception var32) {
                     var10000 = var32;
                     var10001 = false;
                     break label429;
                  }

                  if (var53 != null) {
                     label432: {
                        var10 = var11;

                        try {
                           if (var53.get() == null) {
                              break label432;
                           }
                        } catch (Exception var31) {
                           var10000 = var31;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.x1((d)this.m1.get(), this.R0.q(super.R));
                        } catch (Exception var30) {
                           var10000 = var30;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.m1 = null;
                        } catch (Exception var29) {
                           var10000 = var29;
                           var10001 = false;
                           break label429;
                        }
                     }
                  }

                  var10 = var11;

                  try {
                     var53 = this.l1;
                  } catch (Exception var28) {
                     var10000 = var28;
                     var10001 = false;
                     break label429;
                  }

                  if (var53 != null) {
                     label433: {
                        var10 = var11;

                        try {
                           if (var53.get() == null) {
                              break label433;
                           }
                        } catch (Exception var27) {
                           var10000 = var27;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.y1((d)this.l1.get(), this.R0.q(super.O));
                        } catch (Exception var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.l1 = null;
                        } catch (Exception var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label429;
                        }
                     }
                  }

                  var10 = var11;

                  try {
                     var53 = this.n1;
                  } catch (Exception var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label429;
                  }

                  if (var53 != null) {
                     label434: {
                        var10 = var11;

                        try {
                           if (var53.get() == null) {
                              break label434;
                           }
                        } catch (Exception var23) {
                           var10000 = var23;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.x1((d)this.n1.get(), this.R0.q(super.Q));
                        } catch (Exception var22) {
                           var10000 = var22;
                           var10001 = false;
                           break label429;
                        }

                        var10 = var11;

                        try {
                           this.n1 = null;
                        } catch (Exception var21) {
                           var10000 = var21;
                           var10001 = false;
                           break label429;
                        }
                     }
                  }

                  var10 = var11;
                  if (!var11) {
                     break label348;
                  }

                  var10 = var11;

                  try {
                     this.R0.z();
                     break label347;
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                  }
               }

               Exception var54 = var10000;
               var54.printStackTrace();
               PrintStream var55 = System.out;
               StringBuilder var56 = new StringBuilder();
               var56.append("EXCEPTION : ");
               var56.append(var54);
               var55.println(var56.toString());
               break label348;
            }

            var10 = var11;
         }

         if (var10) {
            var10 = this.V1(this.R0, r.j.a);
         } else {
            this.n1(this.R0, var13);

            for(var2 = 0; var2 < var9; ++var2) {
               ((e)super.L0.get(var2)).n1(this.R0, var13);
            }

            var10 = false;
         }

         if (var6 && var8 < 8 && r.j.a[2]) {
            int var7 = 0;
            var2 = 0;

            for(var3 = 0; var7 < var9; ++var7) {
               var52 = (e)super.L0.get(var7);
               var3 = Math.max(var3, var52.f0 + var52.U());
               var2 = Math.max(var2, var52.g0 + var52.v());
            }

            var7 = Math.max(super.m0, var3);
            var3 = Math.max(super.n0, var2);
            var17 = e.b.n;
            var43 = var42;
            var11 = var10;
            if (var46 == var17) {
               var43 = var42;
               var11 = var10;
               if (this.U() < var7) {
                  this.h1(var7);
                  super.Z[0] = var17;
                  var43 = true;
                  var11 = true;
               }
            }

            var42 = var43;
            var10 = var11;
            if (var14 == var17) {
               var42 = var43;
               var10 = var11;
               if (this.v() < var3) {
                  this.I0(var3);
                  super.Z[1] = var17;
                  var42 = true;
                  var10 = true;
               }
            }
         }

         var2 = Math.max(super.m0, this.U());
         if (var2 > this.U()) {
            this.h1(var2);
            super.Z[0] = e.b.m;
            var42 = true;
            var10 = true;
         }

         var2 = Math.max(super.n0, this.v());
         if (var2 > this.v()) {
            this.I0(var2);
            super.Z[1] = e.b.m;
            var42 = true;
            var10 = true;
         }

         label224: {
            boolean var44 = var42;
            var11 = var10;
            if (!var42) {
               var17 = super.Z[0];
               var18 = e.b.n;
               var43 = var42;
               boolean var12 = var10;
               if (var17 == var18) {
                  var43 = var42;
                  var12 = var10;
                  if (var5 > 0) {
                     var43 = var42;
                     var12 = var10;
                     if (this.U() > var5) {
                        this.h1 = true;
                        super.Z[0] = e.b.m;
                        this.h1(var5);
                        var43 = true;
                        var12 = true;
                     }
                  }
               }

               var44 = var43;
               var11 = var12;
               if (super.Z[1] == var18) {
                  var44 = var43;
                  var11 = var12;
                  if (var45 > 0) {
                     var44 = var43;
                     var11 = var12;
                     if (this.v() > var45) {
                        this.i1 = true;
                        super.Z[1] = e.b.m;
                        this.I0(var45);
                        var10 = true;
                        var42 = true;
                        break label224;
                     }
                  }
               }
            }

            var42 = var44;
            var10 = var11;
         }

         if (var8 > 8) {
            var11 = false;
         } else {
            var11 = var10;
         }
      }

      super.L0 = var49;
      if (var42) {
         e.b[] var51 = super.Z;
         var51[0] = var46;
         var51[1] = var14;
      }

      this.t0(this.R0.v());
   }

   public void r0() {
      this.R0.D();
      this.S0 = 0;
      this.U0 = 0;
      this.T0 = 0;
      this.V0 = 0;
      this.g1 = false;
      super.r0();
   }

   void s1(e var1, int var2) {
      if (var2 == 0) {
         this.u1(var1);
      } else if (var2 == 1) {
         this.z1(var1);
      }

   }

   public boolean t1(o.d var1) {
      boolean var5 = this.P1(64);
      this.g(var1, var5);
      int var4 = super.L0.size();
      int var2 = 0;

      boolean var3;
      e var6;
      for(var3 = false; var2 < var4; ++var2) {
         var6 = (e)super.L0.get(var2);
         var6.P0(0, false);
         var6.P0(1, false);
         if (var6 instanceof a) {
            var3 = true;
         }
      }

      if (var3) {
         for(var2 = 0; var2 < var4; ++var2) {
            var6 = (e)super.L0.get(var2);
            if (var6 instanceof a) {
               ((a)var6).v1();
            }
         }
      }

      this.o1.clear();

      for(var2 = 0; var2 < var4; ++var2) {
         var6 = (e)super.L0.get(var2);
         if (var6.f()) {
            if (var6 instanceof k) {
               this.o1.add(var6);
            } else {
               var6.g(var1, var5);
            }
         }
      }

      while(true) {
         Iterator var11;
         do {
            if (this.o1.size() <= 0) {
               e var12;
               if (o.d.r) {
                  HashSet var13 = new HashSet();

                  for(var2 = 0; var2 < var4; ++var2) {
                     var12 = (e)super.L0.get(var2);
                     if (!var12.f()) {
                        var13.add(var12);
                     }
                  }

                  byte var10;
                  if (this.y() == e.b.n) {
                     var10 = 0;
                  } else {
                     var10 = 1;
                  }

                  this.e(this, var1, var13, var10, false);
                  var11 = var13.iterator();

                  while(var11.hasNext()) {
                     var12 = (e)var11.next();
                     r.j.a(this, var1, var12);
                     var12.g(var1, var5);
                  }
               } else {
                  for(var2 = 0; var2 < var4; ++var2) {
                     var12 = (e)super.L0.get(var2);
                     if (var12 instanceof f) {
                        e.b[] var8 = var12.Z;
                        e.b var14 = var8[0];
                        e.b var9 = var8[1];
                        e.b var15 = e.b.n;
                        if (var14 == var15) {
                           var12.M0(e.b.m);
                        }

                        if (var9 == var15) {
                           var12.d1(e.b.m);
                        }

                        var12.g(var1, var5);
                        if (var14 == var15) {
                           var12.M0(var14);
                        }

                        if (var9 == var15) {
                           var12.d1(var9);
                        }
                     } else {
                        r.j.a(this, var1, var12);
                        if (!var12.f()) {
                           var12.g(var1, var5);
                        }
                     }
                  }
               }

               if (this.W0 > 0) {
                  r.b.b(this, var1, (ArrayList)null, 0);
               }

               if (this.X0 > 0) {
                  r.b.b(this, var1, (ArrayList)null, 1);
               }

               return true;
            }

            var2 = this.o1.size();
            var11 = this.o1.iterator();

            while(var11.hasNext()) {
               k var7 = (k)((e)var11.next());
               if (var7.r1(this.o1)) {
                  var7.g(var1, var5);
                  this.o1.remove(var7);
                  break;
               }
            }
         } while(var2 != this.o1.size());

         var11 = this.o1.iterator();

         while(var11.hasNext()) {
            ((e)var11.next()).g(var1, var5);
         }

         this.o1.clear();
      }
   }

   public void v1(d var1) {
      WeakReference var2 = this.n1;
      if (var2 == null || var2.get() == null || var1.d() > ((d)this.n1.get()).d()) {
         this.n1 = new WeakReference(var1);
      }

   }

   public void w1(d var1) {
      WeakReference var2 = this.l1;
      if (var2 == null || var2.get() == null || var1.d() > ((d)this.l1.get()).d()) {
         this.l1 = new WeakReference(var1);
      }

   }
}
