package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class m0 extends l {
   private static final String[] V = new String[]{"android:visibility:visibility", "android:visibility:parent"};
   private int U = 3;

   private void g0(r var1) {
      int var2 = var1.b.getVisibility();
      var1.a.put("android:visibility:visibility", var2);
      var1.a.put("android:visibility:parent", var1.b.getParent());
      int[] var3 = new int[2];
      var1.b.getLocationOnScreen(var3);
      var1.a.put("android:visibility:screenLocation", var3);
   }

   private c h0(r var1, r var2) {
      c var5 = new c();
      var5.a = false;
      var5.b = false;
      if (var1 != null && var1.a.containsKey("android:visibility:visibility")) {
         var5.c = (Integer)var1.a.get("android:visibility:visibility");
         var5.e = (ViewGroup)var1.a.get("android:visibility:parent");
      } else {
         var5.c = -1;
         var5.e = null;
      }

      if (var2 != null && var2.a.containsKey("android:visibility:visibility")) {
         var5.d = (Integer)var2.a.get("android:visibility:visibility");
         var5.f = (ViewGroup)var2.a.get("android:visibility:parent");
      } else {
         var5.d = -1;
         var5.f = null;
      }

      if (var1 != null && var2 != null) {
         int var4 = var5.c;
         int var3 = var5.d;
         if (var4 == var3 && var5.e == var5.f) {
            return var5;
         }

         if (var4 != var3) {
            if (var4 == 0) {
               var5.b = false;
               var5.a = true;
            } else if (var3 == 0) {
               var5.b = true;
               var5.a = true;
            }
         } else if (var5.f == null) {
            var5.b = false;
            var5.a = true;
         } else if (var5.e == null) {
            var5.b = true;
            var5.a = true;
         }
      } else if (var1 == null && var5.d == 0) {
         var5.b = true;
         var5.a = true;
      } else if (var2 == null && var5.c == 0) {
         var5.b = false;
         var5.a = true;
      }

      return var5;
   }

   public String[] H() {
      return V;
   }

   public boolean J(r var1, r var2) {
      boolean var4 = false;
      if (var1 == null && var2 == null) {
         return false;
      } else if (var1 != null && var2 != null && var2.a.containsKey("android:visibility:visibility") != var1.a.containsKey("android:visibility:visibility")) {
         return false;
      } else {
         c var5 = this.h0(var1, var2);
         boolean var3 = var4;
         if (var5.a) {
            if (var5.c != 0) {
               var3 = var4;
               if (var5.d != 0) {
                  return var3;
               }
            }

            var3 = true;
         }

         return var3;
      }
   }

   public abstract Animator i0(ViewGroup var1, View var2, r var3, r var4);

   public Animator j0(ViewGroup var1, r var2, int var3, r var4, int var5) {
      if ((this.U & 1) == 1 && var4 != null) {
         if (var2 == null) {
            View var6 = (View)var4.b.getParent();
            if (this.h0(this.x(var6, false), this.I(var6, false)).a) {
               return null;
            }
         }

         return this.i0(var1, var4.b, var2, var4);
      } else {
         return null;
      }
   }

   public void k(r var1) {
      this.g0(var1);
   }

   public abstract Animator k0(ViewGroup var1, View var2, r var3, r var4);

   public Animator l0(ViewGroup var1, r var2, int var3, r var4, int var5) {
      if ((this.U & 2) != 2) {
         return null;
      } else if (var2 == null) {
         return null;
      } else {
         View var11 = var2.b;
         View var9;
         if (var4 != null) {
            var9 = var4.b;
         } else {
            var9 = null;
         }

         int var6 = i.a;
         View var8 = (View)var11.getTag(var6);
         boolean var16;
         if (var8 != null) {
            var9 = null;
            var16 = true;
         } else {
            label102: {
               label100: {
                  if (var9 != null && var9.getParent() != null) {
                     if (var5 == 4 || var11 == var9) {
                        var8 = var9;
                        var16 = false;
                        var9 = null;
                        break label100;
                     }
                  } else if (var9 != null) {
                     var8 = null;
                     var16 = false;
                     break label100;
                  }

                  var9 = null;
                  var8 = null;
                  var16 = true;
               }

               label73: {
                  View var10 = var9;
                  if (var16) {
                     if (var11.getParent() == null) {
                        break label73;
                     }

                     var10 = var9;
                     if (var11.getParent() instanceof View) {
                        View var12 = (View)var11.getParent();
                        if (!this.h0(this.I(var12, true), this.x(var12, true)).a) {
                           var10 = u0.q.a(var1, var11, var12);
                        } else {
                           var3 = var12.getId();
                           var10 = var9;
                           if (var12.getParent() == null) {
                              var10 = var9;
                              if (var3 != -1) {
                                 var10 = var9;
                                 if (var1.findViewById(var3) != null) {
                                    var10 = var9;
                                    if (super.H) {
                                       break label73;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var16 = false;
                  var9 = var8;
                  var8 = var10;
                  break label102;
               }

               var9 = var8;
               var16 = false;
               var8 = var11;
            }
         }

         if (var8 != null) {
            if (!var16) {
               int[] var17 = (int[])var2.a.get("android:visibility:screenLocation");
               int var7 = var17[0];
               var5 = var17[1];
               var17 = new int[2];
               var1.getLocationOnScreen(var17);
               var8.offsetLeftAndRight(var7 - var17[0] - var8.getLeft());
               var8.offsetTopAndBottom(var5 - var17[1] - var8.getTop());
               u0.w.a(var1).a(var8);
            }

            Animator var15 = this.k0(var1, var8, var2, var4);
            if (!var16) {
               if (var15 == null) {
                  u0.w.a(var1).c(var8);
               } else {
                  var11.setTag(var6, var8);
                  this.a(new m(this, var1, var8, var11) {
                     final ViewGroup a;
                     final View b;
                     final View c;
                     final m0 d;

                     {
                        this.d = var1;
                        this.a = var2;
                        this.b = var3;
                        this.c = var4;
                     }

                     public void a(l var1) {
                        u0.w.a(this.a).c(this.b);
                     }

                     public void b(l var1) {
                        if (this.b.getParent() == null) {
                           u0.w.a(this.a).a(this.b);
                        } else {
                           this.d.j();
                        }

                     }

                     public void c(l var1) {
                        this.c.setTag(i.a, (Object)null);
                        u0.w.a(this.a).c(this.b);
                        var1.T(this);
                     }
                  });
               }
            }

            return var15;
         } else if (var9 != null) {
            var3 = var9.getVisibility();
            u0.z.h(var9, 0);
            Animator var13 = this.k0(var1, var9, var2, var4);
            if (var13 != null) {
               b var14 = new b(var9, var5, true);
               var13.addListener(var14);
               a.a(var13, var14);
               this.a(var14);
            } else {
               u0.z.h(var9, var3);
            }

            return var13;
         } else {
            return null;
         }
      }
   }

   public void m0(int var1) {
      if ((var1 & -4) == 0) {
         this.U = var1;
      } else {
         throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
      }
   }

   public void n(r var1) {
      this.g0(var1);
   }

   public Animator r(ViewGroup var1, r var2, r var3) {
      c var4 = this.h0(var2, var3);
      if (var4.a && (var4.e != null || var4.f != null)) {
         return var4.b ? this.j0(var1, var2, var4.c, var3, var4.d) : this.l0(var1, var2, var4.c, var3, var4.d);
      } else {
         return null;
      }
   }

   private static class b extends AnimatorListenerAdapter implements l.f {
      private final View a;
      private final int b;
      private final ViewGroup c;
      private final boolean d;
      private boolean e;
      boolean f = false;

      b(View var1, int var2, boolean var3) {
         this.a = var1;
         this.b = var2;
         this.c = (ViewGroup)var1.getParent();
         this.d = var3;
         this.g(true);
      }

      private void f() {
         if (!this.f) {
            u0.z.h(this.a, this.b);
            ViewGroup var1 = this.c;
            if (var1 != null) {
               var1.invalidate();
            }
         }

         this.g(false);
      }

      private void g(boolean var1) {
         if (this.d && this.e != var1) {
            ViewGroup var2 = this.c;
            if (var2 != null) {
               this.e = var1;
               u0.w.c(var2, var1);
            }
         }

      }

      public void a(l var1) {
         this.g(false);
      }

      public void b(l var1) {
         this.g(true);
      }

      public void c(l var1) {
         this.f();
         var1.T(this);
      }

      public void d(l var1) {
      }

      public void e(l var1) {
      }

      public void onAnimationCancel(Animator var1) {
         this.f = true;
      }

      public void onAnimationEnd(Animator var1) {
         this.f();
      }

      public void onAnimationPause(Animator var1) {
         if (!this.f) {
            u0.z.h(this.a, this.b);
         }

      }

      public void onAnimationRepeat(Animator var1) {
      }

      public void onAnimationResume(Animator var1) {
         if (!this.f) {
            u0.z.h(this.a, 0);
         }

      }

      public void onAnimationStart(Animator var1) {
      }
   }

   private static class c {
      boolean a;
      boolean b;
      int c;
      int d;
      ViewGroup e;
      ViewGroup f;

      c() {
      }
   }
}
