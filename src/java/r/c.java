package r;

import java.util.ArrayList;

public class c {
   protected e a;
   protected e b;
   protected e c;
   protected e d;
   protected e e;
   protected e f;
   protected e g;
   protected ArrayList h;
   protected int i;
   protected int j;
   protected float k = 0.0F;
   int l;
   int m;
   int n;
   boolean o;
   private int p;
   private boolean q;
   protected boolean r;
   protected boolean s;
   protected boolean t;
   protected boolean u;
   private boolean v;

   public c(e var1, int var2, boolean var3) {
      this.a = var1;
      this.p = var2;
      this.q = var3;
   }

   private void b() {
      int var3 = this.p * 2;
      e var7 = this.a;
      boolean var6 = true;
      this.o = true;
      e var8 = var7;

      e var9;
      for(boolean var2 = false; !var2; var8 = var9) {
         ++this.i;
         e[] var10 = var7.F0;
         int var4 = this.p;
         var9 = null;
         var10[var4] = null;
         var7.E0[var4] = null;
         e var13;
         if (var7.T() != 8) {
            ++this.l;
            e.b var11 = var7.s(this.p);
            e.b var12 = e.b.o;
            if (var11 != var12) {
               this.m += var7.C(this.p);
            }

            int var5 = this.m + var7.W[var3].e();
            this.m = var5;
            d[] var15 = var7.W;
            var4 = var3 + 1;
            this.m = var5 + var15[var4].e();
            var5 = this.n + var7.W[var3].e();
            this.n = var5;
            this.n = var5 + var7.W[var4].e();
            if (this.b == null) {
               this.b = var7;
            }

            this.d = var7;
            e.b[] var16 = var7.Z;
            var4 = this.p;
            if (var16[var4] == var12) {
               var5 = var7.y[var4];
               if (var5 == 0 || var5 == 3 || var5 == 2) {
                  ++this.j;
                  float var1 = var7.D0[var4];
                  if (var1 > 0.0F) {
                     this.k += var1;
                  }

                  if (c(var7, var4)) {
                     if (var1 < 0.0F) {
                        this.r = true;
                     } else {
                        this.s = true;
                     }

                     if (this.h == null) {
                        this.h = new ArrayList();
                     }

                     this.h.add(var7);
                  }

                  if (this.f == null) {
                     this.f = var7;
                  }

                  var13 = this.g;
                  if (var13 != null) {
                     var13.E0[this.p] = var7;
                  }

                  this.g = var7;
               }

               if (this.p == 0) {
                  if (var7.w != 0) {
                     this.o = false;
                  } else if (var7.z != 0 || var7.A != 0) {
                     this.o = false;
                  }
               } else if (var7.x != 0) {
                  this.o = false;
               } else if (var7.C != 0 || var7.D != 0) {
                  this.o = false;
               }

               if (var7.d0 != 0.0F) {
                  this.o = false;
                  this.u = true;
               }
            }
         }

         if (var8 != var7) {
            var8.F0[this.p] = var7;
         }

         d var14 = var7.W[var3 + 1].f;
         var8 = var9;
         if (var14 != null) {
            var13 = var14.d;
            d var17 = var13.W[var3].f;
            var8 = var9;
            if (var17 != null) {
               if (var17.d != var7) {
                  var8 = var9;
               } else {
                  var8 = var13;
               }
            }
         }

         if (var8 == null) {
            var8 = var7;
            var2 = true;
         }

         var9 = var7;
         var7 = var8;
      }

      var8 = this.b;
      if (var8 != null) {
         this.m -= var8.W[var3].e();
      }

      var8 = this.d;
      if (var8 != null) {
         this.m -= var8.W[var3 + 1].e();
      }

      this.c = var7;
      if (this.p == 0 && this.q) {
         this.e = var7;
      } else {
         this.e = this.a;
      }

      if (!this.s || !this.r) {
         var6 = false;
      }

      this.t = var6;
   }

   private static boolean c(e var0, int var1) {
      boolean var2;
      if (var0.T() != 8 && var0.Z[var1] == e.b.o) {
         var1 = var0.y[var1];
         if (var1 == 0 || var1 == 3) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public void a() {
      if (!this.v) {
         this.b();
      }

      this.v = true;
   }
}
