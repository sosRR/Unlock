package s;

import java.util.ArrayList;
import java.util.Iterator;

public class c extends p {
   ArrayList k = new ArrayList();
   private int l;

   public c(r.e var1, int var2) {
      super(var1);
      super.f = var2;
      this.q();
   }

   private void q() {
      r.e var3 = super.b;

      r.e var2;
      r.e var4;
      for(var2 = var3.J(super.f); var2 != null; var2 = var4) {
         var4 = var2.J(super.f);
         var3 = var2;
      }

      super.b = var3;
      this.k.add(var3.L(super.f));

      for(var2 = var3.H(super.f); var2 != null; var2 = var2.H(super.f)) {
         this.k.add(var2.L(super.f));
      }

      Iterator var6 = this.k.iterator();

      int var1;
      while(var6.hasNext()) {
         p var7 = (p)var6.next();
         var1 = super.f;
         if (var1 == 0) {
            var7.b.c = this;
         } else if (var1 == 1) {
            var7.b.d = this;
         }
      }

      boolean var5;
      if (super.f == 0 && ((r.f)super.b.I()).L1()) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5 && this.k.size() > 1) {
         ArrayList var8 = this.k;
         super.b = ((p)var8.get(var8.size() - 1)).b;
      }

      if (super.f == 0) {
         var1 = super.b.x();
      } else {
         var1 = super.b.Q();
      }

      this.l = var1;
   }

   private r.e r() {
      for(int var1 = 0; var1 < this.k.size(); ++var1) {
         p var2 = (p)this.k.get(var1);
         if (var2.b.T() != 8) {
            return var2.b;
         }
      }

      return null;
   }

   private r.e s() {
      for(int var1 = this.k.size() - 1; var1 >= 0; --var1) {
         p var2 = (p)this.k.get(var1);
         if (var2.b.T() != 8) {
            return var2.b;
         }
      }

      return null;
   }

   public void a(d var1) {
      if (super.h.j && super.i.j) {
         r.e var24 = super.b.I();
         boolean var21;
         if (var24 instanceof r.f) {
            var21 = ((r.f)var24).L1();
         } else {
            var21 = false;
         }

         int var20 = super.i.g - super.h.g;
         int var19 = this.k.size();
         int var5 = 0;

         int var6;
         int var14;
         while(true) {
            var6 = -1;
            if (var5 >= var19) {
               var14 = -1;
               break;
            }

            var14 = var5;
            if (((p)this.k.get(var5)).b.T() != 8) {
               break;
            }

            ++var5;
         }

         int var18 = var19 - 1;
         var5 = var18;

         int var15;
         while(true) {
            var15 = var6;
            if (var5 < 0) {
               break;
            }

            if (((p)this.k.get(var5)).b.T() != 8) {
               var15 = var5;
               break;
            }

            --var5;
         }

         int var9 = 0;

         float var2;
         float var3;
         int var7;
         int var8;
         int var10;
         int var11;
         int var12;
         g var22;
         p var25;
         while(true) {
            if (var9 >= 2) {
               var8 = 0;
               var7 = 0;
               var6 = 0;
               var2 = 0.0F;
               break;
            }

            var10 = 0;
            var7 = 0;
            var5 = 0;
            var6 = 0;

            for(var2 = 0.0F; var10 < var19; var5 = var11) {
               var25 = (p)this.k.get(var10);
               if (var25.b.T() == 8) {
                  var11 = var5;
               } else {
                  var12 = var6 + 1;
                  var6 = var7;
                  if (var10 > 0) {
                     var6 = var7;
                     if (var10 >= var14) {
                        var6 = var7 + var25.h.f;
                     }
                  }

                  var22 = var25.e;
                  var8 = var22.g;
                  boolean var27;
                  if (var25.d != r.e.b.o) {
                     var27 = true;
                  } else {
                     var27 = false;
                  }

                  if (var27) {
                     var11 = super.f;
                     if (var11 == 0 && !var25.b.e.e.j) {
                        return;
                     }

                     if (var11 == 1 && !var25.b.f.e.j) {
                        return;
                     }
                  } else {
                     label481: {
                        if (var25.a == 1 && var9 == 0) {
                           var7 = var22.m;
                           ++var5;
                        } else {
                           if (!var22.j) {
                              break label481;
                           }

                           var7 = var8;
                        }

                        boolean var29 = true;
                        var8 = var7;
                        var27 = var29;
                     }
                  }

                  if (!var27) {
                     var7 = var5 + 1;
                     float var4 = var25.b.D0[super.f];
                     var8 = var6;
                     var5 = var7;
                     var3 = var2;
                     if (var4 >= 0.0F) {
                        var3 = var2 + var4;
                        var8 = var6;
                        var5 = var7;
                     }
                  } else {
                     var8 += var6;
                     var3 = var2;
                  }

                  var7 = var8;
                  var11 = var5;
                  var6 = var12;
                  var2 = var3;
                  if (var10 < var18) {
                     var7 = var8;
                     var11 = var5;
                     var6 = var12;
                     var2 = var3;
                     if (var10 < var15) {
                        var7 = var8 + -var25.i.f;
                        var2 = var3;
                        var6 = var12;
                        var11 = var5;
                     }
                  }
               }

               ++var10;
            }

            if (var7 < var20 || var5 == 0) {
               var8 = var6;
               var6 = var5;
               break;
            }

            ++var9;
         }

         var9 = super.h.g;
         if (var21) {
            var9 = super.i.g;
         }

         var5 = var9;
         if (var7 > var20) {
            if (var21) {
               var5 = var9 + (int)((float)(var7 - var20) / 2.0F + 0.5F);
            } else {
               var5 = var9 - (int)((float)(var7 - var20) / 2.0F + 0.5F);
            }
         }

         if (var6 <= 0) {
            var9 = var6;
         } else {
            var3 = (float)(var20 - var7);
            var11 = (int)(var3 / (float)var6 + 0.5F);
            int var16 = 0;
            byte var28 = 0;
            var9 = var7;
            var7 = var28;

            for(var10 = var5; var16 < var19; ++var16) {
               p var30 = (p)this.k.get(var16);
               if (var30.b.T() != 8 && var30.d == r.e.b.o) {
                  g var26 = var30.e;
                  if (!var26.j) {
                     if (var2 > 0.0F) {
                        var5 = (int)(var30.b.D0[super.f] * var3 / var2 + 0.5F);
                     } else {
                        var5 = var11;
                     }

                     int var13;
                     r.e var23;
                     if (super.f == 0) {
                        var23 = var30.b;
                        var13 = var23.A;
                        var12 = var23.z;
                     } else {
                        var23 = var30.b;
                        var13 = var23.D;
                        var12 = var23.C;
                     }

                     int var17;
                     if (var30.a == 1) {
                        var17 = Math.min(var5, var26.m);
                     } else {
                        var17 = var5;
                     }

                     var17 = Math.max(var12, var17);
                     var12 = var17;
                     if (var13 > 0) {
                        var12 = Math.min(var13, var17);
                     }

                     var17 = var5;
                     var13 = var7;
                     if (var12 != var5) {
                        var13 = var7 + 1;
                        var17 = var12;
                     }

                     var30.e.d(var17);
                     var7 = var13;
                  }
               }
            }

            if (var7 > 0) {
               var11 = var6 - var7;
               var6 = 0;

               for(var5 = 0; var6 < var19; ++var6) {
                  var25 = (p)this.k.get(var6);
                  if (var25.b.T() != 8) {
                     var9 = var5;
                     if (var6 > 0) {
                        var9 = var5;
                        if (var6 >= var14) {
                           var9 = var5 + var25.h.f;
                        }
                     }

                     var9 += var25.e.g;
                     var5 = var9;
                     if (var6 < var18) {
                        var5 = var9;
                        if (var6 < var15) {
                           var5 = var9 + -var25.i.f;
                        }
                     }
                  }
               }

               var6 = var11;
            } else {
               var5 = var9;
            }

            if (this.l == 2 && var7 == 0) {
               this.l = 0;
               var7 = var5;
               var9 = var6;
               var5 = var10;
            } else {
               var7 = var5;
               var9 = var6;
               var5 = var10;
            }
         }

         if (var7 > var20) {
            this.l = 2;
         }

         if (var8 > 0 && var9 == 0 && var14 == var15) {
            this.l = 2;
         }

         var6 = this.l;
         if (var6 == 1) {
            if (var8 > 1) {
               var6 = (var20 - var7) / (var8 - 1);
            } else if (var8 == 1) {
               var6 = (var20 - var7) / 2;
            } else {
               var6 = 0;
            }

            var8 = var6;
            if (var9 > 0) {
               var8 = 0;
            }

            var6 = 0;

            for(var7 = var5; var6 < var19; var7 = var5) {
               if (var21) {
                  var5 = var19 - (var6 + 1);
               } else {
                  var5 = var6;
               }

               var25 = (p)this.k.get(var5);
               if (var25.b.T() == 8) {
                  var25.h.d(var7);
                  var25.i.d(var7);
                  var5 = var7;
               } else {
                  var5 = var7;
                  if (var6 > 0) {
                     if (var21) {
                        var5 = var7 - var8;
                     } else {
                        var5 = var7 + var8;
                     }
                  }

                  var7 = var5;
                  if (var6 > 0) {
                     var7 = var5;
                     if (var6 >= var14) {
                        if (var21) {
                           var7 = var5 - var25.h.f;
                        } else {
                           var7 = var5 + var25.h.f;
                        }
                     }
                  }

                  if (var21) {
                     var25.i.d(var7);
                  } else {
                     var25.h.d(var7);
                  }

                  var22 = var25.e;
                  var9 = var22.g;
                  var5 = var9;
                  if (var25.d == r.e.b.o) {
                     var5 = var9;
                     if (var25.a == 1) {
                        var5 = var22.m;
                     }
                  }

                  if (var21) {
                     var7 -= var5;
                  } else {
                     var7 += var5;
                  }

                  if (var21) {
                     var25.h.d(var7);
                  } else {
                     var25.i.d(var7);
                  }

                  var25.g = true;
                  var5 = var7;
                  if (var6 < var18) {
                     var5 = var7;
                     if (var6 < var15) {
                        if (var21) {
                           var5 = var7 - -var25.i.f;
                        } else {
                           var5 = var7 + -var25.i.f;
                        }
                     }
                  }
               }

               ++var6;
            }
         } else if (var6 == 0) {
            var8 = (var20 - var7) / (var8 + 1);
            if (var9 > 0) {
               var8 = 0;
            }

            for(var6 = 0; var6 < var19; ++var6) {
               if (var21) {
                  var7 = var19 - (var6 + 1);
               } else {
                  var7 = var6;
               }

               var25 = (p)this.k.get(var7);
               if (var25.b.T() == 8) {
                  var25.h.d(var5);
                  var25.i.d(var5);
               } else {
                  if (var21) {
                     var7 = var5 - var8;
                  } else {
                     var7 = var5 + var8;
                  }

                  var5 = var7;
                  if (var6 > 0) {
                     var5 = var7;
                     if (var6 >= var14) {
                        if (var21) {
                           var5 = var7 - var25.h.f;
                        } else {
                           var5 = var7 + var25.h.f;
                        }
                     }
                  }

                  if (var21) {
                     var25.i.d(var5);
                  } else {
                     var25.h.d(var5);
                  }

                  var22 = var25.e;
                  var9 = var22.g;
                  var7 = var9;
                  if (var25.d == r.e.b.o) {
                     var7 = var9;
                     if (var25.a == 1) {
                        var7 = Math.min(var9, var22.m);
                     }
                  }

                  if (var21) {
                     var7 = var5 - var7;
                  } else {
                     var7 += var5;
                  }

                  if (var21) {
                     var25.h.d(var7);
                  } else {
                     var25.i.d(var7);
                  }

                  var5 = var7;
                  if (var6 < var18) {
                     var5 = var7;
                     if (var6 < var15) {
                        if (var21) {
                           var5 = var7 - -var25.i.f;
                        } else {
                           var5 = var7 + -var25.i.f;
                        }
                     }
                  }
               }
            }
         } else if (var6 == 2) {
            if (super.f == 0) {
               var2 = super.b.w();
            } else {
               var2 = super.b.P();
            }

            var3 = var2;
            if (var21) {
               var3 = 1.0F - var2;
            }

            var6 = (int)((float)(var20 - var7) * var3 + 0.5F);
            if (var6 < 0 || var9 > 0) {
               var6 = 0;
            }

            if (var21) {
               var5 -= var6;
            } else {
               var5 += var6;
            }

            for(var6 = 0; var6 < var19; ++var6) {
               if (var21) {
                  var7 = var19 - (var6 + 1);
               } else {
                  var7 = var6;
               }

               var25 = (p)this.k.get(var7);
               if (var25.b.T() == 8) {
                  var25.h.d(var5);
                  var25.i.d(var5);
               } else {
                  var7 = var5;
                  if (var6 > 0) {
                     var7 = var5;
                     if (var6 >= var14) {
                        if (var21) {
                           var7 = var5 - var25.h.f;
                        } else {
                           var7 = var5 + var25.h.f;
                        }
                     }
                  }

                  if (var21) {
                     var25.i.d(var7);
                  } else {
                     var25.h.d(var7);
                  }

                  var22 = var25.e;
                  var5 = var22.g;
                  if (var25.d == r.e.b.o && var25.a == 1) {
                     var5 = var22.m;
                  }

                  if (var21) {
                     var7 -= var5;
                  } else {
                     var7 += var5;
                  }

                  if (var21) {
                     var25.h.d(var7);
                  } else {
                     var25.i.d(var7);
                  }

                  var5 = var7;
                  if (var6 < var18) {
                     var5 = var7;
                     if (var6 < var15) {
                        if (var21) {
                           var5 = var7 - -var25.i.f;
                        } else {
                           var5 = var7 + -var25.i.f;
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void d() {
      Iterator var2 = this.k.iterator();

      while(var2.hasNext()) {
         ((p)var2.next()).d();
      }

      int var1 = this.k.size();
      if (var1 >= 1) {
         r.e var3 = ((p)this.k.get(0)).b;
         r.e var5 = ((p)this.k.get(var1 - 1)).b;
         r.d var4;
         r.d var6;
         f var7;
         r.e var8;
         if (super.f == 0) {
            var4 = var3.O;
            var6 = var5.Q;
            var7 = this.i(var4, 0);
            var1 = var4.e();
            var8 = this.r();
            if (var8 != null) {
               var1 = var8.O.e();
            }

            if (var7 != null) {
               this.b(super.h, var7, var1);
            }

            var7 = this.i(var6, 0);
            var1 = var6.e();
            var5 = this.s();
            if (var5 != null) {
               var1 = var5.Q.e();
            }

            if (var7 != null) {
               this.b(super.i, var7, -var1);
            }
         } else {
            var4 = var3.P;
            var6 = var5.R;
            var7 = this.i(var4, 1);
            var1 = var4.e();
            var8 = this.r();
            if (var8 != null) {
               var1 = var8.P.e();
            }

            if (var7 != null) {
               this.b(super.h, var7, var1);
            }

            var7 = this.i(var6, 1);
            var1 = var6.e();
            var5 = this.s();
            if (var5 != null) {
               var1 = var5.R.e();
            }

            if (var7 != null) {
               this.b(super.i, var7, -var1);
            }
         }

         super.h.a = this;
         super.i.a = this;
      }
   }

   public void e() {
      for(int var1 = 0; var1 < this.k.size(); ++var1) {
         ((p)this.k.get(var1)).e();
      }

   }

   void f() {
      super.c = null;
      Iterator var1 = this.k.iterator();

      while(var1.hasNext()) {
         ((p)var1.next()).f();
      }

   }

   public long j() {
      int var2 = this.k.size();
      long var3 = 0L;

      for(int var1 = 0; var1 < var2; ++var1) {
         p var5 = (p)this.k.get(var1);
         var3 = var3 + (long)var5.h.f + var5.j() + (long)var5.i.f;
      }

      return var3;
   }

   boolean m() {
      int var2 = this.k.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         if (!((p)this.k.get(var1)).m()) {
            return false;
         }
      }

      return true;
   }

   public String toString() {
      StringBuilder var2 = new StringBuilder("ChainRun ");
      String var1;
      if (super.f == 0) {
         var1 = "horizontal : ";
      } else {
         var1 = "vertical : ";
      }

      var2.append(var1);
      Iterator var3 = this.k.iterator();

      while(var3.hasNext()) {
         p var4 = (p)var3.next();
         var2.append("<");
         var2.append(var4);
         var2.append("> ");
      }

      return var2.toString();
   }
}
