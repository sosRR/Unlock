package s;

public class n extends p {
   public f k;
   g l;

   public n(r.e var1) {
      super(var1);
      f var2 = new f(this);
      this.k = var2;
      this.l = null;
      super.h.e = null.r;
      super.i.e = null.s;
      var2.e = null.t;
      super.f = 1;
   }

   public void a(d var1) {
      int var4 = n$a.a[super.j.ordinal()];
      if (var4 != 1) {
         if (var4 != 2) {
            if (var4 == 3) {
               r.e var7 = super.b;
               this.n(var1, var7.P, var7.R, 1);
               return;
            }
         } else {
            this.o(var1);
         }
      } else {
         this.p(var1);
      }

      g var8 = super.e;
      float var2;
      r.e var9;
      if (var8.c && !var8.j && super.d == r.e.b.o) {
         var9 = super.b;
         var4 = var9.x;
         if (var4 != 2) {
            if (var4 == 3 && var9.e.e.j) {
               label97: {
                  label96: {
                     var4 = var9.u();
                     float var3;
                     if (var4 != -1) {
                        if (var4 == 0) {
                           var9 = super.b;
                           var2 = (float)var9.e.e.g * var9.t();
                           break label96;
                        }

                        if (var4 != 1) {
                           var4 = 0;
                           break label97;
                        }

                        var9 = super.b;
                        var2 = (float)var9.e.e.g;
                        var3 = var9.t();
                     } else {
                        var9 = super.b;
                        var2 = (float)var9.e.e.g;
                        var3 = var9.t();
                     }

                     var2 /= var3;
                  }

                  var4 = (int)(var2 + 0.5F);
               }

               super.e.d(var4);
            }
         } else {
            var9 = var9.I();
            if (var9 != null) {
               var8 = var9.f.e;
               if (var8.j) {
                  var2 = super.b.E;
                  var4 = (int)((float)var8.g * var2 + 0.5F);
                  super.e.d(var4);
               }
            }
         }
      }

      f var10 = super.h;
      if (var10.c) {
         f var11 = super.i;
         if (var11.c) {
            if (var10.j && var11.j && super.e.j) {
               return;
            }

            int var5;
            if (!super.e.j && super.d == r.e.b.o) {
               var9 = super.b;
               if (var9.w == 0 && !var9.i0()) {
                  var11 = (f)super.h.l.get(0);
                  var10 = (f)super.i.l.get(0);
                  var4 = var11.g;
                  var11 = super.h;
                  var5 = var4 + var11.f;
                  var4 = var10.g + super.i.f;
                  var11.d(var5);
                  super.i.d(var4);
                  super.e.d(var4 - var5);
                  return;
               }
            }

            if (!super.e.j && super.d == r.e.b.o && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
               var11 = (f)super.h.l.get(0);
               var10 = (f)super.i.l.get(0);
               var4 = var11.g;
               var5 = super.h.f;
               var5 = var10.g + super.i.f - (var4 + var5);
               var8 = super.e;
               var4 = var8.m;
               if (var5 < var4) {
                  var8.d(var5);
               } else {
                  var8.d(var4);
               }
            }

            if (!super.e.j) {
               return;
            }

            if (super.h.l.size() > 0 && super.i.l.size() > 0) {
               var11 = (f)super.h.l.get(0);
               var10 = (f)super.i.l.get(0);
               var5 = var11.g + super.h.f;
               var4 = var10.g + super.i.f;
               var2 = super.b.P();
               if (var11 == var10) {
                  var5 = var11.g;
                  var4 = var10.g;
                  var2 = 0.5F;
               }

               int var6 = super.e.g;
               super.h.d((int)((float)var5 + 0.5F + (float)(var4 - var5 - var6) * var2));
               super.i.d(super.h.g + super.e.g);
            }
         }
      }

   }

   void d() {
      r.e var5 = super.b;
      if (var5.a) {
         super.e.d(var5.v());
      }

      int var1;
      r.e.b var9;
      if (!super.e.j) {
         super.d = super.b.R();
         if (super.b.X()) {
            this.l = new a(this);
         }

         var9 = super.d;
         if (var9 != r.e.b.o) {
            if (var9 == r.e.b.p) {
               var5 = super.b.I();
               if (var5 != null && var5.R() == r.e.b.m) {
                  int var3 = var5.v();
                  var1 = super.b.P.e();
                  int var2 = super.b.R.e();
                  this.b(super.h, var5.f.h, super.b.P.e());
                  this.b(super.i, var5.f.i, -super.b.R.e());
                  super.e.d(var3 - var1 - var2);
                  return;
               }
            }

            if (super.d == r.e.b.m) {
               super.e.d(super.b.v());
            }
         }
      } else if (super.d == r.e.b.p) {
         var5 = super.b.I();
         if (var5 != null && var5.R() == r.e.b.m) {
            this.b(super.h, var5.f.h, super.b.P.e());
            this.b(super.i, var5.f.i, -super.b.R.e());
            return;
         }
      }

      g var6 = super.e;
      boolean var4 = var6.j;
      r.d var7;
      r.d var8;
      r.d[] var10;
      r.d var14;
      f var16;
      if (var4) {
         var5 = super.b;
         if (var5.a) {
            var10 = var5.W;
            var7 = var10[2];
            var8 = var7.f;
            if (var8 != null && var10[3].f != null) {
               if (var5.i0()) {
                  super.h.f = super.b.W[2].e();
                  super.i.f = -super.b.W[3].e();
               } else {
                  var16 = this.h(super.b.W[2]);
                  if (var16 != null) {
                     this.b(super.h, var16, super.b.W[2].e());
                  }

                  var16 = this.h(super.b.W[3]);
                  if (var16 != null) {
                     this.b(super.i, var16, -super.b.W[3].e());
                  }

                  super.h.b = true;
                  super.i.b = true;
               }

               if (super.b.X()) {
                  this.b(this.k, super.h, super.b.n());
                  return;
               }

               return;
            } else if (var8 != null) {
               var16 = this.h(var7);
               if (var16 != null) {
                  this.b(super.h, var16, super.b.W[2].e());
                  this.b(super.i, super.h, super.e.g);
                  if (super.b.X()) {
                     this.b(this.k, super.h, super.b.n());
                  }

                  return;
               }

               return;
            } else {
               var7 = var10[3];
               if (var7.f != null) {
                  var16 = this.h(var7);
                  if (var16 != null) {
                     this.b(super.i, var16, -super.b.W[3].e());
                     this.b(super.h, super.i, -super.e.g);
                  }

                  if (super.b.X()) {
                     this.b(this.k, super.h, super.b.n());
                     return;
                  }

                  return;
               } else {
                  var14 = var10[4];
                  if (var14.f != null) {
                     var16 = this.h(var14);
                     if (var16 != null) {
                        this.b(this.k, var16, 0);
                        this.b(super.h, this.k, -super.b.n());
                        this.b(super.i, super.h, super.e.g);
                        return;
                     }
                  } else if (!(var5 instanceof r.h) && var5.I() != null && super.b.m(r.d.b.s).f == null) {
                     var16 = super.b.I().f.h;
                     this.b(super.h, var16, super.b.W());
                     this.b(super.i, super.h, super.e.g);
                     if (super.b.X()) {
                        this.b(this.k, super.h, super.b.n());
                     }

                     return;
                  }

                  return;
               }
            }
         }
      }

      if (!var4 && super.d == r.e.b.o) {
         var5 = super.b;
         var1 = var5.x;
         g var13;
         if (var1 != 2) {
            if (var1 == 3 && !var5.i0()) {
               var5 = super.b;
               if (var5.w != 3) {
                  var13 = var5.e.e;
                  super.e.l.add(var13);
                  var13.k.add(super.e);
                  var13 = super.e;
                  var13.b = true;
                  var13.k.add(super.h);
                  super.e.k.add(super.i);
               }
            }
         } else {
            var5 = var5.I();
            if (var5 != null) {
               var13 = var5.f.e;
               super.e.l.add(var13);
               var13.k.add(super.e);
               var13 = super.e;
               var13.b = true;
               var13.k.add(super.h);
               super.e.k.add(super.i);
            }
         }
      } else {
         var6.b(this);
      }

      var5 = super.b;
      var10 = var5.W;
      var8 = var10[2];
      var7 = var8.f;
      if (var7 != null && var10[3].f != null) {
         if (var5.i0()) {
            super.h.f = super.b.W[2].e();
            super.i.f = -super.b.W[3].e();
         } else {
            var16 = this.h(super.b.W[2]);
            f var15 = this.h(super.b.W[3]);
            if (var16 != null) {
               var16.b(this);
            }

            if (var15 != null) {
               var15.b(this);
            }

            super.j = p.b.p;
         }

         if (super.b.X()) {
            this.c(this.k, super.h, 1, this.l);
         }
      } else {
         r.e.b var11;
         l var12;
         if (var7 != null) {
            var16 = this.h(var8);
            if (var16 != null) {
               this.b(super.h, var16, super.b.W[2].e());
               this.c(super.i, super.h, 1, super.e);
               if (super.b.X()) {
                  this.c(this.k, super.h, 1, this.l);
               }

               var11 = super.d;
               var9 = r.e.b.o;
               if (var11 == var9 && super.b.t() > 0.0F) {
                  var12 = super.b.e;
                  if (var12.d == var9) {
                     var12.e.k.add(super.e);
                     super.e.l.add(super.b.e.e);
                     super.e.a = this;
                  }
               }
            }
         } else {
            var7 = var10[3];
            if (var7.f != null) {
               var16 = this.h(var7);
               if (var16 != null) {
                  this.b(super.i, var16, -super.b.W[3].e());
                  this.c(super.h, super.i, -1, super.e);
                  if (super.b.X()) {
                     this.c(this.k, super.h, 1, this.l);
                  }
               }
            } else {
               var14 = var10[4];
               if (var14.f != null) {
                  var16 = this.h(var14);
                  if (var16 != null) {
                     this.b(this.k, var16, 0);
                     this.c(super.h, this.k, -1, this.l);
                     this.c(super.i, super.h, 1, super.e);
                  }
               } else if (!(var5 instanceof r.h) && var5.I() != null) {
                  var16 = super.b.I().f.h;
                  this.b(super.h, var16, super.b.W());
                  this.c(super.i, super.h, 1, super.e);
                  if (super.b.X()) {
                     this.c(this.k, super.h, 1, this.l);
                  }

                  var11 = super.d;
                  var9 = r.e.b.o;
                  if (var11 == var9 && super.b.t() > 0.0F) {
                     var12 = super.b.e;
                     if (var12.d == var9) {
                        var12.e.k.add(super.e);
                        super.e.l.add(super.b.e.e);
                        super.e.a = this;
                     }
                  }
               }
            }
         }
      }

      if (super.e.l.size() == 0) {
         super.e.c = true;
      }

   }

   public void e() {
      f var1 = super.h;
      if (var1.j) {
         super.b.k1(var1.g);
      }

   }

   void f() {
      super.c = null;
      super.h.c();
      super.i.c();
      this.k.c();
      super.e.c();
      super.g = false;
   }

   boolean m() {
      if (super.d == r.e.b.o) {
         return super.b.x == 0;
      } else {
         return true;
      }
   }

   void q() {
      super.g = false;
      super.h.c();
      super.h.j = false;
      super.i.c();
      super.i.j = false;
      this.k.c();
      this.k.j = false;
      super.e.j = false;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("VerticalRun ");
      var1.append(super.b.r());
      return var1.toString();
   }
}
