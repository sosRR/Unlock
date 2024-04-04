package s;

public abstract class p implements d {
   public int a;
   r.e b;
   m c;
   protected r.e.b d;
   g e = new g(this);
   public int f = 0;
   boolean g = false;
   public f h = new f(this);
   public f i = new f(this);
   protected b j;

   public p(r.e var1) {
      this.j = p.b.m;
      this.b = var1;
   }

   private void l(int var1, int var2) {
      int var4 = this.a;
      if (var4 != 0) {
         if (var4 != 1) {
            float var3;
            Object var5;
            if (var4 != 2) {
               if (var4 == 3) {
                  r.e var6 = this.b;
                  var5 = var6.e;
                  r.e.b var8 = ((p)var5).d;
                  r.e.b var7 = r.e.b.o;
                  if (var8 == var7 && ((p)var5).a == 3) {
                     n var11 = var6.f;
                     if (var11.d == var7 && var11.a == 3) {
                        return;
                     }
                  }

                  if (var1 == 0) {
                     var5 = var6.f;
                  }

                  if (((p)var5).e.j) {
                     var3 = var6.t();
                     if (var1 == 1) {
                        var1 = (int)((float)((p)var5).e.g / var3 + 0.5F);
                     } else {
                        var1 = (int)(var3 * (float)((p)var5).e.g + 0.5F);
                     }

                     this.e.d(var1);
                  }
               }
            } else {
               r.e var9 = this.b.I();
               if (var9 != null) {
                  if (var1 == 0) {
                     var5 = var9.e;
                  } else {
                     var5 = var9.f;
                  }

                  g var10 = ((p)var5).e;
                  if (var10.j) {
                     var9 = this.b;
                     if (var1 == 0) {
                        var3 = var9.B;
                     } else {
                        var3 = var9.E;
                     }

                     var2 = (int)((float)var10.g * var3 + 0.5F);
                     this.e.d(this.g(var2, var1));
                  }
               }
            }
         } else {
            var1 = this.g(this.e.m, var1);
            this.e.d(Math.min(var1, var2));
         }
      } else {
         this.e.d(this.g(var2, var1));
      }

   }

   public void a(d var1) {
   }

   protected final void b(f var1, f var2, int var3) {
      var1.l.add(var2);
      var1.f = var3;
      var2.k.add(var1);
   }

   protected final void c(f var1, f var2, int var3, g var4) {
      var1.l.add(var2);
      var1.l.add(this.e);
      var1.h = var3;
      var1.i = var4;
      var2.k.add(var1);
      var4.k.add(var1);
   }

   abstract void d();

   abstract void e();

   abstract void f();

   protected final int g(int var1, int var2) {
      int var3;
      r.e var4;
      if (var2 == 0) {
         var4 = this.b;
         var3 = var4.A;
         var2 = Math.max(var4.z, var1);
         if (var3 > 0) {
            var2 = Math.min(var3, var1);
         }

         var3 = var1;
         if (var2 == var1) {
            return var3;
         }
      } else {
         var4 = this.b;
         var3 = var4.D;
         var2 = Math.max(var4.C, var1);
         if (var3 > 0) {
            var2 = Math.min(var3, var1);
         }

         var3 = var1;
         if (var2 == var1) {
            return var3;
         }
      }

      var3 = var2;
      return var3;
   }

   protected final f h(r.d var1) {
      r.d var4 = var1.f;
      f var5 = null;
      if (var4 == null) {
         return null;
      } else {
         r.e var3 = var4.d;
         r.d.b var6 = var4.e;
         int var2 = p$a.a[var6.ordinal()];
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  if (var2 != 4) {
                     if (var2 == 5) {
                        var5 = var3.f.i;
                     }
                  } else {
                     var5 = var3.f.k;
                  }
               } else {
                  var5 = var3.f.h;
               }
            } else {
               var5 = var3.e.i;
            }
         } else {
            var5 = var3.e.h;
         }

         return var5;
      }
   }

   protected final f i(r.d var1, int var2) {
      r.d var4 = var1.f;
      Object var3 = null;
      if (var4 == null) {
         return null;
      } else {
         r.e var5 = var4.d;
         Object var6;
         if (var2 == 0) {
            var6 = var5.e;
         } else {
            var6 = var5.f;
         }

         f var7;
         label40: {
            r.d.b var8 = var4.e;
            var2 = p$a.a[var8.ordinal()];
            if (var2 != 1) {
               if (var2 == 2) {
                  break label40;
               }

               if (var2 != 3) {
                  if (var2 != 5) {
                     var7 = (f)var3;
                     return var7;
                  }
                  break label40;
               }
            }

            var7 = ((p)var6).h;
            return var7;
         }

         var7 = ((p)var6).i;
         return var7;
      }
   }

   public long j() {
      g var1 = this.e;
      return var1.j ? (long)var1.g : 0L;
   }

   public boolean k() {
      return this.g;
   }

   abstract boolean m();

   protected void n(d var1, r.d var2, r.d var3, int var4) {
      f var9 = this.h(var2);
      f var10 = this.h(var3);
      if (var9.j && var10.j) {
         int var7 = var9.g + var2.e();
         int var6 = var10.g - var3.e();
         int var8 = var6 - var7;
         if (!this.e.j && this.d == r.e.b.o) {
            this.l(var4, var8);
         }

         g var11 = this.e;
         if (!var11.j) {
            return;
         }

         if (var11.g == var8) {
            this.h.d(var7);
            this.i.d(var6);
            return;
         }

         r.e var12 = this.b;
         float var5;
         if (var4 == 0) {
            var5 = var12.w();
         } else {
            var5 = var12.P();
         }

         var4 = var7;
         if (var9 == var10) {
            var4 = var9.g;
            var6 = var10.g;
            var5 = 0.5F;
         }

         var7 = this.e.g;
         this.h.d((int)((float)var4 + 0.5F + (float)(var6 - var4 - var7) * var5));
         this.i.d(this.h.g + this.e.g);
      }

   }

   protected void o(d var1) {
   }

   protected void p(d var1) {
   }

   static enum b {
      m,
      n,
      o,
      p;

      private static final b[] q;

      static {
         b var1 = new b("NONE", 0);
         m = var1;
         b var3 = new b("START", 1);
         n = var3;
         b var0 = new b("END", 2);
         o = var0;
         b var2 = new b("CENTER", 3);
         p = var2;
         q = new b[]{var1, var3, var0, var2};
      }
   }
}
