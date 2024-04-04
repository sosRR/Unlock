package r;

public class g extends e {
   protected float L0 = -1.0F;
   protected int M0 = -1;
   protected int N0 = -1;
   protected boolean O0 = true;
   private d P0;
   private int Q0;
   private int R0;
   private boolean S0;

   public g() {
      this.P0 = super.P;
      int var1 = 0;
      this.Q0 = 0;
      this.R0 = 0;
      super.X.clear();
      super.X.add(this.P0);

      for(int var2 = super.W.length; var1 < var2; ++var1) {
         super.W[var1] = this.P0;
      }

   }

   public void g(o.d var1, boolean var2) {
      f var7 = (f)this.I();
      if (var7 != null) {
         d var5 = var7.m(d.b.n);
         d var6 = var7.m(d.b.p);
         e var8 = super.a0;
         boolean var4 = true;
         boolean var3;
         if (var8 != null && var8.Z[0] == e.b.n) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (this.Q0 == 0) {
            var5 = var7.m(d.b.o);
            var6 = var7.m(d.b.q);
            e var9 = super.a0;
            if (var9 != null && var9.Z[1] == e.b.n) {
               var3 = var4;
            } else {
               var3 = false;
            }
         }

         o.i var10;
         o.i var11;
         if (this.S0 && this.P0.m()) {
            var11 = var1.q(this.P0);
            var1.f(var11, this.P0.d());
            if (this.M0 != -1) {
               if (var3) {
                  var1.h(var1.q(var6), var11, 0, 5);
               }
            } else if (this.N0 != -1 && var3) {
               var10 = var1.q(var6);
               var1.h(var11, var1.q(var5), 0, 5);
               var1.h(var10, var11, 0, 5);
            }

            this.S0 = false;
         } else {
            if (this.M0 != -1) {
               var11 = var1.q(this.P0);
               var1.e(var11, var1.q(var5), this.M0, 8);
               if (var3) {
                  var1.h(var1.q(var6), var11, 0, 5);
               }
            } else if (this.N0 != -1) {
               var11 = var1.q(this.P0);
               var10 = var1.q(var6);
               var1.e(var11, var10, -this.N0, 8);
               if (var3) {
                  var1.h(var11, var1.q(var5), 0, 5);
                  var1.h(var10, var11, 0, 5);
               }
            } else if (this.L0 != -1.0F) {
               var1.d(o.d.s(var1, var1.q(this.P0), var1.q(var6), this.L0));
            }

         }
      }
   }

   public boolean h() {
      return true;
   }

   public boolean l0() {
      return this.S0;
   }

   public d m(d.b var1) {
      int var2 = g$a.a[var1.ordinal()];
      if (var2 != 1 && var2 != 2) {
         if ((var2 == 3 || var2 == 4) && this.Q0 == 0) {
            return this.P0;
         }
      } else if (this.Q0 == 1) {
         return this.P0;
      }

      return null;
   }

   public boolean m0() {
      return this.S0;
   }

   public void n1(o.d var1, boolean var2) {
      if (this.I() != null) {
         int var3 = var1.x(this.P0);
         if (this.Q0 == 1) {
            this.j1(var3);
            this.k1(0);
            this.I0(this.I().v());
            this.h1(0);
         } else {
            this.j1(0);
            this.k1(var3);
            this.h1(this.I().U());
            this.I0(0);
         }

      }
   }

   public d o1() {
      return this.P0;
   }

   public int p1() {
      return this.Q0;
   }

   public int q1() {
      return this.M0;
   }

   public int r1() {
      return this.N0;
   }

   public float s1() {
      return this.L0;
   }

   public void t1(int var1) {
      this.P0.s(var1);
      this.S0 = true;
   }

   public void u1(int var1) {
      if (var1 > -1) {
         this.L0 = -1.0F;
         this.M0 = var1;
         this.N0 = -1;
      }

   }

   public void v1(int var1) {
      if (var1 > -1) {
         this.L0 = -1.0F;
         this.M0 = -1;
         this.N0 = var1;
      }

   }

   public void w1(float var1) {
      if (var1 > -1.0F) {
         this.L0 = var1;
         this.M0 = -1;
         this.N0 = -1;
      }

   }

   public void x1(int var1) {
      if (this.Q0 != var1) {
         this.Q0 = var1;
         super.X.clear();
         if (this.Q0 == 1) {
            this.P0 = super.O;
         } else {
            this.P0 = super.P;
         }

         super.X.add(this.P0);
         int var2 = super.W.length;

         for(var1 = 0; var1 < var2; ++var1) {
            super.W[var1] = this.P0;
         }

      }
   }
}
