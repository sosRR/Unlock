package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {
   private r.f a;
   private boolean b = true;
   private boolean c = true;
   private r.f d;
   private ArrayList e = new ArrayList();
   private ArrayList f = new ArrayList();
   private b.b g = null;
   private b.a h = new b.a();
   ArrayList i = new ArrayList();

   public e(r.f var1) {
      this.a = var1;
      this.d = var1;
   }

   private void a(f var1, int var2, int var3, f var4, ArrayList var5, m var6) {
      p var7 = var1.d;
      if (var7.c == null) {
         r.f var9 = this.a;
         if (var7 != var9.e && var7 != var9.f) {
            m var10 = var6;
            if (var6 == null) {
               var10 = new m(var7, var3);
               var5.add(var10);
            }

            var7.c = var10;
            var10.a(var7);
            Iterator var8 = var7.h.k.iterator();

            d var11;
            while(var8.hasNext()) {
               var11 = (d)var8.next();
               if (var11 instanceof f) {
                  this.a((f)var11, var2, 0, var4, var5, var10);
               }
            }

            var8 = var7.i.k.iterator();

            while(var8.hasNext()) {
               var11 = (d)var8.next();
               if (var11 instanceof f) {
                  this.a((f)var11, var2, 1, var4, var5, var10);
               }
            }

            if (var2 == 1 && var7 instanceof n) {
               var8 = ((n)var7).k.k.iterator();

               while(var8.hasNext()) {
                  var11 = (d)var8.next();
                  if (var11 instanceof f) {
                     this.a((f)var11, var2, 2, var4, var5, var10);
                  }
               }
            }

            f var12;
            for(var8 = var7.h.l.iterator(); var8.hasNext(); this.a(var12, var2, 0, var4, var5, var10)) {
               var12 = (f)var8.next();
               if (var12 == var4) {
                  var10.b = true;
               }
            }

            Iterator var13;
            f var14;
            for(var13 = var7.i.l.iterator(); var13.hasNext(); this.a(var14, var2, 1, var4, var5, var10)) {
               var14 = (f)var13.next();
               if (var14 == var4) {
                  var10.b = true;
               }
            }

            if (var2 == 1 && var7 instanceof n) {
               var13 = ((n)var7).k.l.iterator();

               while(var13.hasNext()) {
                  this.a((f)var13.next(), var2, 2, var4, var5, var10);
               }
            }
         }
      }

   }

   private boolean b(r.f var1) {
      Iterator var11 = var1.L0.iterator();

      while(true) {
         while(var11.hasNext()) {
            r.e var12 = (r.e)var11.next();
            r.e.b[] var9 = var12.Z;
            r.e.b var8 = var9[0];
            r.e.b var10 = var9[1];
            if (var12.T() == 8) {
               var12.a = true;
            } else {
               if (var12.B < 1.0F && var8 == r.e.b.o) {
                  var12.w = 2;
               }

               if (var12.E < 1.0F && var10 == r.e.b.o) {
                  var12.x = 2;
               }

               r.e.b var16;
               if (var12.t() > 0.0F) {
                  var16 = r.e.b.o;
                  if (var8 == var16 && (var10 == r.e.b.n || var10 == r.e.b.m)) {
                     var12.w = 3;
                  } else if (var10 != var16 || var8 != r.e.b.n && var8 != r.e.b.m) {
                     if (var8 == var16 && var10 == var16) {
                        if (var12.w == 0) {
                           var12.w = 3;
                        }

                        if (var12.x == 0) {
                           var12.x = 3;
                        }
                     }
                  } else {
                     var12.x = 3;
                  }
               }

               r.e.b var13 = r.e.b.o;
               var16 = var8;
               if (var8 == var13) {
                  var16 = var8;
                  if (var12.w == 1) {
                     label199: {
                        if (var12.O.f != null) {
                           var16 = var8;
                           if (var12.Q.f != null) {
                              break label199;
                           }
                        }

                        var16 = r.e.b.n;
                     }
                  }
               }

               var8 = var10;
               if (var10 == var13) {
                  var8 = var10;
                  if (var12.x == 1) {
                     label192: {
                        if (var12.P.f != null) {
                           var8 = var10;
                           if (var12.R.f != null) {
                              break label192;
                           }
                        }

                        var8 = r.e.b.n;
                     }
                  }
               }

               l var17 = var12.e;
               var17.d = var16;
               int var4 = var12.w;
               var17.a = var4;
               n var18 = var12.f;
               var18.d = var8;
               int var5 = var12.x;
               var18.a = var5;
               var10 = r.e.b.p;
               if (var16 != var10 && var16 != r.e.b.m && var16 != r.e.b.n || var8 != var10 && var8 != r.e.b.m && var8 != r.e.b.n) {
                  r.e.b var14;
                  r.e.b var21;
                  if (var16 == var13) {
                     var14 = r.e.b.n;
                     if (var8 == var14 || var8 == r.e.b.m) {
                        if (var4 == 3) {
                           if (var8 == var14) {
                              this.l(var12, var14, 0, var14, 0);
                           }

                           var4 = var12.v();
                           var5 = (int)((float)var4 * var12.d0 + 0.5F);
                           var8 = r.e.b.m;
                           this.l(var12, var8, var5, var8, var4);
                           var12.e.e.d(var12.U());
                           var12.f.e.d(var12.v());
                           var12.a = true;
                           continue;
                        }

                        if (var4 == 1) {
                           this.l(var12, var14, 0, var8, 0);
                           var12.e.e.m = var12.U();
                           continue;
                        }

                        if (var4 == 2) {
                           var14 = var1.Z[0];
                           var21 = r.e.b.m;
                           if (var14 == var21 || var14 == var10) {
                              this.l(var12, var21, (int)(var12.B * (float)var1.U() + 0.5F), var8, var12.v());
                              var12.e.e.d(var12.U());
                              var12.f.e.d(var12.v());
                              var12.a = true;
                              continue;
                           }
                        } else {
                           r.d[] var15 = var12.W;
                           if (var15[0].f == null || var15[1].f == null) {
                              this.l(var12, var14, 0, var8, 0);
                              var12.e.e.d(var12.U());
                              var12.f.e.d(var12.v());
                              var12.a = true;
                              continue;
                           }
                        }
                     }
                  }

                  float var2;
                  float var3;
                  if (var8 == var13) {
                     var14 = r.e.b.n;
                     if (var16 == var14 || var16 == r.e.b.m) {
                        if (var5 == 3) {
                           if (var16 == var14) {
                              this.l(var12, var14, 0, var14, 0);
                           }

                           var4 = var12.U();
                           var3 = var12.d0;
                           var2 = var3;
                           if (var12.u() == -1) {
                              var2 = 1.0F / var3;
                           }

                           var5 = (int)((float)var4 * var2 + 0.5F);
                           var8 = r.e.b.m;
                           this.l(var12, var8, var4, var8, var5);
                           var12.e.e.d(var12.U());
                           var12.f.e.d(var12.v());
                           var12.a = true;
                           continue;
                        }

                        if (var5 == 1) {
                           this.l(var12, var16, 0, var14, 0);
                           var12.f.e.m = var12.v();
                           continue;
                        }

                        if (var5 == 2) {
                           var14 = var1.Z[1];
                           var21 = r.e.b.m;
                           if (var14 == var21 || var14 == var10) {
                              var2 = var12.E;
                              this.l(var12, var16, var12.U(), var21, (int)(var2 * (float)var1.v() + 0.5F));
                              var12.e.e.d(var12.U());
                              var12.f.e.d(var12.v());
                              var12.a = true;
                              continue;
                           }
                        } else {
                           r.d[] var20 = var12.W;
                           if (var20[2].f == null || var20[3].f == null) {
                              this.l(var12, var14, 0, var8, 0);
                              var12.e.e.d(var12.U());
                              var12.f.e.d(var12.v());
                              var12.a = true;
                              continue;
                           }
                        }
                     }
                  }

                  if (var16 == var13 && var8 == var13) {
                     if (var4 != 1 && var5 != 1) {
                        if (var5 == 2 && var4 == 2) {
                           r.e.b[] var19 = var1.Z;
                           var10 = var19[0];
                           var16 = r.e.b.m;
                           if (var10 == var16 && var19[1] == var16) {
                              var3 = var12.B;
                              var2 = var12.E;
                              this.l(var12, var16, (int)(var3 * (float)var1.U() + 0.5F), var16, (int)(var2 * (float)var1.v() + 0.5F));
                              var12.e.e.d(var12.U());
                              var12.f.e.d(var12.v());
                              var12.a = true;
                           }
                        }
                     } else {
                        var8 = r.e.b.n;
                        this.l(var12, var8, 0, var8, 0);
                        var12.e.e.m = var12.U();
                        var12.f.e.m = var12.v();
                     }
                  }
               } else {
                  var4 = var12.U();
                  int var6;
                  if (var16 == var10) {
                     var5 = var1.U();
                     var4 = var12.O.g;
                     var6 = var12.Q.g;
                     var16 = r.e.b.m;
                     var4 = var5 - var4 - var6;
                  }

                  var5 = var12.v();
                  if (var8 == var10) {
                     var5 = var1.v();
                     var6 = var12.P.g;
                     int var7 = var12.R.g;
                     var8 = r.e.b.m;
                     var5 = var5 - var6 - var7;
                  }

                  this.l(var12, var16, var4, var8, var5);
                  var12.e.e.d(var12.U());
                  var12.f.e.d(var12.v());
                  var12.a = true;
               }
            }
         }

         return false;
      }
   }

   private int e(r.f var1, int var2) {
      int var4 = this.i.size();
      long var5 = 0L;

      for(int var3 = 0; var3 < var4; ++var3) {
         var5 = Math.max(var5, ((m)this.i.get(var3)).b(var1, var2));
      }

      return (int)var5;
   }

   private void i(p var1, int var2, ArrayList var3) {
      Iterator var4 = var1.h.k.iterator();

      while(var4.hasNext()) {
         d var5 = (d)var4.next();
         if (var5 instanceof f) {
            this.a((f)var5, var2, 0, var1.i, var3, (m)null);
         } else if (var5 instanceof p) {
            this.a(((p)var5).h, var2, 0, var1.i, var3, (m)null);
         }
      }

      Iterator var8 = var1.i.k.iterator();

      d var7;
      while(var8.hasNext()) {
         var7 = (d)var8.next();
         if (var7 instanceof f) {
            this.a((f)var7, var2, 1, var1.h, var3, (m)null);
         } else if (var7 instanceof p) {
            this.a(((p)var7).i, var2, 1, var1.h, var3, (m)null);
         }
      }

      if (var2 == 1) {
         Iterator var6 = ((n)var1).k.k.iterator();

         while(var6.hasNext()) {
            var7 = (d)var6.next();
            if (var7 instanceof f) {
               this.a((f)var7, var2, 2, (f)null, var3, (m)null);
            }
         }
      }

   }

   private void l(r.e var1, r.e.b var2, int var3, r.e.b var4, int var5) {
      b.a var6 = this.h;
      var6.a = var2;
      var6.b = var4;
      var6.c = var3;
      var6.d = var5;
      this.g.b(var1, var6);
      var1.h1(this.h.e);
      var1.I0(this.h.f);
      var1.H0(this.h.h);
      var1.x0(this.h.g);
   }

   public void c() {
      this.d(this.e);
      this.i.clear();
      m.h = 0;
      this.i(this.a.e, 0, this.i);
      this.i(this.a.f, 1, this.i);
      this.b = false;
   }

   public void d(ArrayList var1) {
      var1.clear();
      this.d.e.f();
      this.d.f.f();
      var1.add(this.d.e);
      var1.add(this.d.f);
      Iterator var4 = this.d.L0.iterator();
      HashSet var2 = null;

      while(var4.hasNext()) {
         r.e var5 = (r.e)var4.next();
         if (var5 instanceof r.g) {
            var1.add(new j(var5));
         } else {
            HashSet var3;
            if (var5.g0()) {
               if (var5.c == null) {
                  var5.c = new c(var5, 0);
               }

               var3 = var2;
               if (var2 == null) {
                  var3 = new HashSet();
               }

               var3.add(var5.c);
               var2 = var3;
            } else {
               var1.add(var5.e);
            }

            if (var5.i0()) {
               if (var5.d == null) {
                  var5.d = new c(var5, 1);
               }

               var3 = var2;
               if (var2 == null) {
                  var3 = new HashSet();
               }

               var3.add(var5.d);
            } else {
               var1.add(var5.f);
               var3 = var2;
            }

            var2 = var3;
            if (var5 instanceof r.i) {
               var1.add(new k(var5));
               var2 = var3;
            }
         }
      }

      if (var2 != null) {
         var1.addAll(var2);
      }

      Iterator var7 = var1.iterator();

      while(var7.hasNext()) {
         ((p)var7.next()).f();
      }

      Iterator var6 = var1.iterator();

      while(var6.hasNext()) {
         p var8 = (p)var6.next();
         if (var8.b != this.d) {
            var8.d();
         }
      }

   }

   public boolean f(boolean var1) {
      boolean var6 = true;
      boolean var3 = var1 & true;
      if (this.b || this.c) {
         Iterator var8 = this.a.L0.iterator();

         while(var8.hasNext()) {
            r.e var7 = (r.e)var8.next();
            var7.l();
            var7.a = false;
            var7.e.r();
            var7.f.q();
         }

         this.a.l();
         r.f var13 = this.a;
         var13.a = false;
         var13.e.r();
         this.a.f.q();
         this.c = false;
      }

      if (this.b(this.d)) {
         return false;
      } else {
         this.a.j1(0);
         this.a.k1(0);
         r.e.b var14 = this.a.s(0);
         r.e.b var15 = this.a.s(1);
         if (this.b) {
            this.c();
         }

         int var5 = this.a.V();
         int var4 = this.a.W();
         this.a.e.h.d(var5);
         this.a.f.h.d(var4);
         this.m();
         r.e.b var9 = r.e.b.n;
         boolean var2;
         Iterator var16;
         if (var14 == var9 || var15 == var9) {
            var2 = var3;
            if (var3) {
               var16 = this.e.iterator();

               while(true) {
                  var2 = var3;
                  if (!var16.hasNext()) {
                     break;
                  }

                  if (!((p)var16.next()).m()) {
                     var2 = false;
                     break;
                  }
               }
            }

            r.f var17;
            if (var2 && var14 == r.e.b.n) {
               this.a.M0(r.e.b.m);
               var17 = this.a;
               var17.h1(this.e(var17, 0));
               var17 = this.a;
               var17.e.e.d(var17.U());
            }

            if (var2 && var15 == r.e.b.n) {
               this.a.d1(r.e.b.m);
               var17 = this.a;
               var17.I0(this.e(var17, 1));
               var17 = this.a;
               var17.f.e.d(var17.v());
            }
         }

         r.f var11 = this.a;
         r.e.b var10 = var11.Z[0];
         var9 = r.e.b.m;
         if (var10 != var9 && var10 != r.e.b.p) {
            var2 = false;
         } else {
            int var12 = var11.U() + var5;
            this.a.e.i.d(var12);
            this.a.e.e.d(var12 - var5);
            this.m();
            var11 = this.a;
            var10 = var11.Z[1];
            if (var10 == var9 || var10 == r.e.b.p) {
               var12 = var11.v() + var4;
               this.a.f.i.d(var12);
               this.a.f.e.d(var12 - var4);
            }

            this.m();
            var2 = true;
         }

         var16 = this.e.iterator();

         while(true) {
            p var18;
            do {
               if (!var16.hasNext()) {
                  var16 = this.e.iterator();

                  while(true) {
                     var1 = var6;
                     if (!var16.hasNext()) {
                        break;
                     }

                     var18 = (p)var16.next();
                     if ((var2 || var18.b != this.a) && (!var18.h.j || !var18.i.j && !(var18 instanceof j) || !var18.e.j && !(var18 instanceof c) && !(var18 instanceof j))) {
                        var1 = false;
                        break;
                     }
                  }

                  this.a.M0(var14);
                  this.a.d1(var15);
                  return var1;
               }

               var18 = (p)var16.next();
            } while(var18.b == this.a && !var18.g);

            var18.e();
         }
      }
   }

   public boolean g(boolean var1) {
      if (this.b) {
         Iterator var2 = this.a.L0.iterator();

         while(var2.hasNext()) {
            r.e var3 = (r.e)var2.next();
            var3.l();
            var3.a = false;
            l var4 = var3.e;
            var4.e.j = false;
            var4.g = false;
            var4.r();
            n var8 = var3.f;
            var8.e.j = false;
            var8.g = false;
            var8.q();
         }

         this.a.l();
         r.f var5 = this.a;
         var5.a = false;
         l var6 = var5.e;
         var6.e.j = false;
         var6.g = false;
         var6.r();
         n var7 = this.a.f;
         var7.e.j = false;
         var7.g = false;
         var7.q();
         this.c();
      }

      if (this.b(this.d)) {
         return false;
      } else {
         this.a.j1(0);
         this.a.k1(0);
         this.a.e.h.d(0);
         this.a.f.h.d(0);
         return true;
      }
   }

   public boolean h(boolean var1, int var2) {
      boolean var7 = true;
      boolean var4 = var1 & true;
      r.e.b var8 = this.a.s(0);
      r.e.b var9 = this.a.s(1);
      int var5 = this.a.V();
      int var6 = this.a.W();
      boolean var3;
      r.e.b var10;
      if (var4) {
         var10 = r.e.b.n;
         if (var8 == var10 || var9 == var10) {
            Iterator var11 = this.e.iterator();

            while(true) {
               var3 = var4;
               if (!var11.hasNext()) {
                  break;
               }

               p var13 = (p)var11.next();
               if (var13.f == var2 && !var13.m()) {
                  var3 = false;
                  break;
               }
            }

            r.f var14;
            if (var2 == 0) {
               if (var3 && var8 == r.e.b.n) {
                  this.a.M0(r.e.b.m);
                  var14 = this.a;
                  var14.h1(this.e(var14, 0));
                  var14 = this.a;
                  var14.e.e.d(var14.U());
               }
            } else if (var3 && var9 == r.e.b.n) {
               this.a.d1(r.e.b.m);
               var14 = this.a;
               var14.I0(this.e(var14, 1));
               var14 = this.a;
               var14.f.e.d(var14.v());
            }
         }
      }

      label98: {
         label97: {
            int var12;
            r.f var15;
            if (var2 == 0) {
               var15 = this.a;
               var10 = var15.Z[0];
               if (var10 != r.e.b.m && var10 != r.e.b.p) {
                  break label97;
               }

               var12 = var15.U() + var5;
               this.a.e.i.d(var12);
               this.a.e.e.d(var12 - var5);
            } else {
               var15 = this.a;
               var10 = var15.Z[1];
               if (var10 != r.e.b.m && var10 != r.e.b.p) {
                  break label97;
               }

               var12 = var15.v() + var6;
               this.a.f.i.d(var12);
               this.a.f.e.d(var12 - var6);
            }

            var3 = true;
            break label98;
         }

         var3 = false;
      }

      this.m();
      Iterator var17 = this.e.iterator();

      while(true) {
         p var16;
         do {
            do {
               if (!var17.hasNext()) {
                  var17 = this.e.iterator();

                  while(true) {
                     var1 = var7;
                     if (!var17.hasNext()) {
                        break;
                     }

                     var16 = (p)var17.next();
                     if (var16.f == var2 && (var3 || var16.b != this.a) && (!var16.h.j || !var16.i.j || !(var16 instanceof c) && !var16.e.j)) {
                        var1 = false;
                        break;
                     }
                  }

                  this.a.M0(var8);
                  this.a.d1(var9);
                  return var1;
               }

               var16 = (p)var17.next();
            } while(var16.f != var2);
         } while(var16.b == this.a && !var16.g);

         var16.e();
      }
   }

   public void j() {
      this.b = true;
   }

   public void k() {
      this.c = true;
   }

   public void m() {
      Iterator var7 = this.a.L0.iterator();

      while(true) {
         r.e var8;
         do {
            if (!var7.hasNext()) {
               return;
            }

            var8 = (r.e)var7.next();
         } while(var8.a);

         r.e.b[] var9 = var8.Z;
         boolean var3 = false;
         r.e.b var11 = var9[0];
         r.e.b var12 = var9[1];
         int var1 = var8.w;
         int var4 = var8.x;
         r.e.b var13 = r.e.b.n;
         boolean var14;
         if (var11 == var13 || var11 == r.e.b.o && var1 == 1) {
            var14 = true;
         } else {
            var14 = false;
         }

         boolean var2;
         label61: {
            if (var12 != var13) {
               var2 = var3;
               if (var12 != r.e.b.o) {
                  break label61;
               }

               var2 = var3;
               if (var4 != 1) {
                  break label61;
               }
            }

            var2 = true;
         }

         g var10 = var8.e.e;
         boolean var5 = var10.j;
         g var15 = var8.f.e;
         boolean var6 = var15.j;
         if (var5 && var6) {
            var11 = r.e.b.m;
            this.l(var8, var11, var10.g, var11, var15.g);
            var8.a = true;
         } else if (var5 && var2) {
            this.l(var8, r.e.b.m, var10.g, var13, var15.g);
            if (var12 == r.e.b.o) {
               var8.f.e.m = var8.v();
            } else {
               var8.f.e.d(var8.v());
               var8.a = true;
            }
         } else if (var6 && var14) {
            this.l(var8, var13, var10.g, r.e.b.m, var15.g);
            if (var11 == r.e.b.o) {
               var8.e.e.m = var8.U();
            } else {
               var8.e.e.d(var8.U());
               var8.a = true;
            }
         }

         if (var8.a) {
            var15 = var8.f.l;
            if (var15 != null) {
               var15.d(var8.n());
            }
         }
      }
   }

   public void n(b.b var1) {
      this.g = var1;
   }
}
