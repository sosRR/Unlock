package b0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.d0;
import java.util.Arrays;

public class c {
   private static final Interpolator x = new Interpolator() {
      public float getInterpolation(float var1) {
         --var1;
         return var1 * var1 * var1 * var1 * var1 + 1.0F;
      }
   };
   private int a;
   private int b;
   private int c = -1;
   private float[] d;
   private float[] e;
   private float[] f;
   private float[] g;
   private int[] h;
   private int[] i;
   private int[] j;
   private int k;
   private VelocityTracker l;
   private float m;
   private float n;
   private int o;
   private final int p;
   private int q;
   private OverScroller r;
   private final b0.c.c s;
   private View t;
   private boolean u;
   private final ViewGroup v;
   private final Runnable w = new Runnable(this) {
      final b0.c m;

      {
         this.m = var1;
      }

      public void run() {
         this.m.K(0);
      }
   };

   private c(Context var1, ViewGroup var2, b0.c.c var3) {
      if (var2 != null) {
         if (var3 != null) {
            this.v = var2;
            this.s = var3;
            ViewConfiguration var5 = ViewConfiguration.get(var1);
            int var4 = (int)(var1.getResources().getDisplayMetrics().density * 20.0F + 0.5F);
            this.p = var4;
            this.o = var4;
            this.b = var5.getScaledTouchSlop();
            this.m = (float)var5.getScaledMaximumFlingVelocity();
            this.n = (float)var5.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(var1, x);
         } else {
            throw new IllegalArgumentException("Callback may not be null");
         }
      } else {
         throw new IllegalArgumentException("Parent view may not be null");
      }
   }

   private boolean D(int var1) {
      if (!this.C(var1)) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Ignoring pointerId=");
         var2.append(var1);
         var2.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
         Log.e("ViewDragHelper", var2.toString());
         return false;
      } else {
         return true;
      }
   }

   private void G() {
      this.l.computeCurrentVelocity(1000, this.m);
      this.p(this.g(this.l.getXVelocity(this.c), this.n, this.m), this.g(this.l.getYVelocity(this.c), this.n, this.m));
   }

   private void H(float var1, float var2, int var3) {
      int var5 = this.c(var1, var2, var3, 1);
      int var4 = var5;
      if (this.c(var2, var1, var3, 4)) {
         var4 = var5 | 4;
      }

      var5 = var4;
      if (this.c(var1, var2, var3, 2)) {
         var5 = var4 | 2;
      }

      var4 = var5;
      if (this.c(var2, var1, var3, 8)) {
         var4 = var5 | 8;
      }

      if (var4 != 0) {
         int[] var6 = this.i;
         var6[var3] |= var4;
         this.s.f(var4, var3);
      }

   }

   private void I(float var1, float var2, int var3) {
      this.s(var3);
      float[] var4 = this.d;
      this.f[var3] = var1;
      var4[var3] = var1;
      var4 = this.e;
      this.g[var3] = var2;
      var4[var3] = var2;
      this.h[var3] = this.y((int)var1, (int)var2);
      this.k |= 1 << var3;
   }

   private void J(MotionEvent var1) {
      int var5 = var1.getPointerCount();

      for(int var4 = 0; var4 < var5; ++var4) {
         int var6 = var1.getPointerId(var4);
         if (this.D(var6)) {
            float var3 = var1.getX(var4);
            float var2 = var1.getY(var4);
            this.f[var6] = var3;
            this.g[var6] = var2;
         }
      }

   }

   private boolean c(float var1, float var2, int var3, int var4) {
      var1 = Math.abs(var1);
      var2 = Math.abs(var2);
      int var5 = this.h[var3];
      boolean var7 = false;
      boolean var6 = var7;
      if ((var5 & var4) == var4) {
         var6 = var7;
         if ((this.q & var4) != 0) {
            var6 = var7;
            if ((this.j[var3] & var4) != var4) {
               var6 = var7;
               if ((this.i[var3] & var4) != var4) {
                  var5 = this.b;
                  if (var1 <= (float)var5 && var2 <= (float)var5) {
                     var6 = var7;
                  } else {
                     if (var1 < var2 * 0.5F && this.s.g(var4)) {
                        int[] var8 = this.j;
                        var8[var3] |= var4;
                        return false;
                     }

                     var6 = var7;
                     if ((this.i[var3] & var4) == 0) {
                        var6 = var7;
                        if (var1 > (float)this.b) {
                           var6 = true;
                        }
                     }
                  }
               }
            }
         }
      }

      return var6;
   }

   private boolean f(View var1, float var2, float var3) {
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      if (var1 == null) {
         return false;
      } else {
         boolean var4;
         if (this.s.d(var1) > 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         boolean var5;
         if (this.s.e(var1) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var4 && var5) {
            int var9 = this.b;
            var6 = var8;
            if (var2 * var2 + var3 * var3 > (float)(var9 * var9)) {
               var6 = true;
            }

            return var6;
         } else if (var4) {
            if (Math.abs(var2) > (float)this.b) {
               var6 = true;
            }

            return var6;
         } else {
            var6 = var7;
            if (var5) {
               var6 = var7;
               if (Math.abs(var3) > (float)this.b) {
                  var6 = true;
               }
            }

            return var6;
         }
      }
   }

   private float g(float var1, float var2, float var3) {
      float var4 = Math.abs(var1);
      if (var4 < var2) {
         return 0.0F;
      } else if (var4 > var3) {
         if (!(var1 > 0.0F)) {
            var3 = -var3;
         }

         return var3;
      } else {
         return var1;
      }
   }

   private int h(int var1, int var2, int var3) {
      int var4 = Math.abs(var1);
      if (var4 < var2) {
         return 0;
      } else if (var4 > var3) {
         if (var1 <= 0) {
            var3 = -var3;
         }

         return var3;
      } else {
         return var1;
      }
   }

   private void i() {
      float[] var1 = this.d;
      if (var1 != null) {
         Arrays.fill(var1, 0.0F);
         Arrays.fill(this.e, 0.0F);
         Arrays.fill(this.f, 0.0F);
         Arrays.fill(this.g, 0.0F);
         Arrays.fill(this.h, 0);
         Arrays.fill(this.i, 0);
         Arrays.fill(this.j, 0);
         this.k = 0;
      }
   }

   private void j(int var1) {
      if (this.d != null && this.C(var1)) {
         this.d[var1] = 0.0F;
         this.e[var1] = 0.0F;
         this.f[var1] = 0.0F;
         this.g[var1] = 0.0F;
         this.h[var1] = 0;
         this.i[var1] = 0;
         this.j[var1] = 0;
         this.k &= ~(1 << var1);
      }

   }

   private int k(int var1, int var2, int var3) {
      if (var1 == 0) {
         return 0;
      } else {
         int var6 = this.v.getWidth();
         int var7 = var6 / 2;
         float var5 = Math.min(1.0F, (float)Math.abs(var1) / (float)var6);
         float var4 = (float)var7;
         var5 = this.q(var5);
         var2 = Math.abs(var2);
         if (var2 > 0) {
            var1 = Math.round(Math.abs((var4 + var5 * var4) / (float)var2) * 1000.0F) * 4;
         } else {
            var1 = (int)(((float)Math.abs(var1) / (float)var3 + 1.0F) * 256.0F);
         }

         return Math.min(var1, 600);
      }
   }

   private int l(View var1, int var2, int var3, int var4, int var5) {
      var4 = this.h(var4, (int)this.n, (int)this.m);
      var5 = this.h(var5, (int)this.n, (int)this.m);
      int var12 = Math.abs(var2);
      int var13 = Math.abs(var3);
      int var10 = Math.abs(var4);
      int var11 = Math.abs(var5);
      int var14 = var10 + var11;
      int var9 = var12 + var13;
      float var6;
      float var7;
      if (var4 != 0) {
         var6 = (float)var10;
         var7 = (float)var14;
      } else {
         var6 = (float)var12;
         var7 = (float)var9;
      }

      float var8 = var6 / var7;
      if (var5 != 0) {
         var6 = (float)var11;
         var7 = (float)var14;
      } else {
         var6 = (float)var13;
         var7 = (float)var9;
      }

      var6 /= var7;
      var2 = this.k(var2, var4, this.s.d(var1));
      var3 = this.k(var3, var5, this.s.e(var1));
      return (int)((float)var2 * var8 + (float)var3 * var6);
   }

   public static b0.c n(ViewGroup var0, float var1, b0.c.c var2) {
      b0.c var3 = o(var0, var2);
      var3.b = (int)((float)var3.b * (1.0F / var1));
      return var3;
   }

   public static b0.c o(ViewGroup var0, b0.c.c var1) {
      return new b0.c(var0.getContext(), var0, var1);
   }

   private void p(float var1, float var2) {
      this.u = true;
      this.s.l(this.t, var1, var2);
      this.u = false;
      if (this.a == 1) {
         this.K(0);
      }

   }

   private float q(float var1) {
      return (float)Math.sin((double)((var1 - 0.5F) * 0.47123894F));
   }

   private void r(int var1, int var2, int var3, int var4) {
      int var6 = this.t.getLeft();
      int var7 = this.t.getTop();
      int var5 = var1;
      if (var3 != 0) {
         var5 = this.s.a(this.t, var1, var3);
         d0.Y(this.t, var5 - var6);
      }

      var1 = var2;
      if (var4 != 0) {
         var1 = this.s.b(this.t, var2, var4);
         d0.Z(this.t, var1 - var7);
      }

      if (var3 != 0 || var4 != 0) {
         this.s.k(this.t, var5, var1, var5 - var6, var1 - var7);
      }

   }

   private void s(int var1) {
      float[] var9 = this.d;
      if (var9 == null || var9.length <= var1) {
         ++var1;
         float[] var6 = new float[var1];
         float[] var8 = new float[var1];
         float[] var3 = new float[var1];
         float[] var7 = new float[var1];
         int[] var2 = new int[var1];
         int[] var5 = new int[var1];
         int[] var4 = new int[var1];
         if (var9 != null) {
            System.arraycopy(var9, 0, var6, 0, var9.length);
            var9 = this.e;
            System.arraycopy(var9, 0, var8, 0, var9.length);
            var9 = this.f;
            System.arraycopy(var9, 0, var3, 0, var9.length);
            var9 = this.g;
            System.arraycopy(var9, 0, var7, 0, var9.length);
            int[] var10 = this.h;
            System.arraycopy(var10, 0, var2, 0, var10.length);
            var10 = this.i;
            System.arraycopy(var10, 0, var5, 0, var10.length);
            var10 = this.j;
            System.arraycopy(var10, 0, var4, 0, var10.length);
         }

         this.d = var6;
         this.e = var8;
         this.f = var3;
         this.g = var7;
         this.h = var2;
         this.i = var5;
         this.j = var4;
      }

   }

   private boolean u(int var1, int var2, int var3, int var4) {
      int var5 = this.t.getLeft();
      int var6 = this.t.getTop();
      var1 -= var5;
      var2 -= var6;
      if (var1 == 0 && var2 == 0) {
         this.r.abortAnimation();
         this.K(0);
         return false;
      } else {
         var3 = this.l(this.t, var1, var2, var3, var4);
         this.r.startScroll(var5, var6, var1, var2, var3);
         this.K(2);
         return true;
      }
   }

   private int y(int var1, int var2) {
      int var4;
      if (var1 < this.v.getLeft() + this.o) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      int var3 = var4;
      if (var2 < this.v.getTop() + this.o) {
         var3 = var4 | 4;
      }

      var4 = var3;
      if (var1 > this.v.getRight() - this.o) {
         var4 = var3 | 2;
      }

      var1 = var4;
      if (var2 > this.v.getBottom() - this.o) {
         var1 = var4 | 8;
      }

      return var1;
   }

   public int A() {
      return this.a;
   }

   public boolean B(int var1, int var2) {
      return this.E(this.t, var1, var2);
   }

   public boolean C(int var1) {
      int var2 = this.k;
      boolean var3 = true;
      if ((1 << var1 & var2) == 0) {
         var3 = false;
      }

      return var3;
   }

   public boolean E(View var1, int var2, int var3) {
      boolean var5 = false;
      if (var1 == null) {
         return false;
      } else {
         boolean var4 = var5;
         if (var2 >= var1.getLeft()) {
            var4 = var5;
            if (var2 < var1.getRight()) {
               var4 = var5;
               if (var3 >= var1.getTop()) {
                  var4 = var5;
                  if (var3 < var1.getBottom()) {
                     var4 = true;
                  }
               }
            }
         }

         return var4;
      }
   }

   public void F(MotionEvent var1) {
      int var9 = var1.getActionMasked();
      int var8 = var1.getActionIndex();
      if (var9 == 0) {
         this.a();
      }

      if (this.l == null) {
         this.l = VelocityTracker.obtain();
      }

      this.l.addMovement(var1);
      int var7 = 0;
      int var6 = 0;
      float var2;
      float var3;
      if (var9 != 0) {
         if (var9 != 1) {
            View var10;
            if (var9 != 2) {
               if (var9 != 3) {
                  if (var9 != 5) {
                     if (var9 == 6) {
                        var7 = var1.getPointerId(var8);
                        if (this.a == 1 && var7 == this.c) {
                           var8 = var1.getPointerCount();

                           while(true) {
                              if (var6 >= var8) {
                                 var6 = -1;
                                 break;
                              }

                              var9 = var1.getPointerId(var6);
                              if (var9 != this.c) {
                                 var2 = var1.getX(var6);
                                 var3 = var1.getY(var6);
                                 var10 = this.t((int)var2, (int)var3);
                                 View var11 = this.t;
                                 if (var10 == var11 && this.R(var11, var9)) {
                                    var6 = this.c;
                                    break;
                                 }
                              }

                              ++var6;
                           }

                           if (var6 == -1) {
                              this.G();
                           }
                        }

                        this.j(var7);
                     }
                  } else {
                     var6 = var1.getPointerId(var8);
                     var2 = var1.getX(var8);
                     var3 = var1.getY(var8);
                     this.I(var2, var3, var6);
                     if (this.a == 0) {
                        this.R(this.t((int)var2, (int)var3), var6);
                        var8 = this.h[var6];
                        var7 = this.q;
                        if ((var8 & var7) != 0) {
                           this.s.h(var8 & var7, var6);
                        }
                     } else if (this.B((int)var2, (int)var3)) {
                        this.R(this.t, var6);
                     }
                  }
               } else {
                  if (this.a == 1) {
                     this.p(0.0F, 0.0F);
                  }

                  this.a();
               }
            } else if (this.a == 1) {
               if (this.D(this.c)) {
                  var6 = var1.findPointerIndex(this.c);
                  var2 = var1.getX(var6);
                  var3 = var1.getY(var6);
                  float[] var13 = this.f;
                  var7 = this.c;
                  var6 = (int)(var2 - var13[var7]);
                  var7 = (int)(var3 - this.g[var7]);
                  this.r(this.t.getLeft() + var6, this.t.getTop() + var7, var6, var7);
                  this.J(var1);
               }
            } else {
               var8 = var1.getPointerCount();

               for(var6 = var7; var6 < var8; ++var6) {
                  var7 = var1.getPointerId(var6);
                  if (this.D(var7)) {
                     float var4 = var1.getX(var6);
                     var3 = var1.getY(var6);
                     var2 = var4 - this.d[var7];
                     float var5 = var3 - this.e[var7];
                     this.H(var2, var5, var7);
                     if (this.a == 1) {
                        break;
                     }

                     var10 = this.t((int)var4, (int)var3);
                     if (this.f(var10, var2, var5) && this.R(var10, var7)) {
                        break;
                     }
                  }
               }

               this.J(var1);
            }
         } else {
            if (this.a == 1) {
               this.G();
            }

            this.a();
         }
      } else {
         var2 = var1.getX();
         var3 = var1.getY();
         var8 = var1.getPointerId(0);
         View var12 = this.t((int)var2, (int)var3);
         this.I(var2, var3, var8);
         this.R(var12, var8);
         var7 = this.h[var8];
         var6 = this.q;
         if ((var7 & var6) != 0) {
            this.s.h(var7 & var6, var8);
         }
      }

   }

   void K(int var1) {
      this.v.removeCallbacks(this.w);
      if (this.a != var1) {
         this.a = var1;
         this.s.j(var1);
         if (this.a == 0) {
            this.t = null;
         }
      }

   }

   public void L(int var1) {
      this.o = var1;
   }

   public void M(int var1) {
      this.q = var1;
   }

   public void N(float var1) {
      this.n = var1;
   }

   public boolean O(int var1, int var2) {
      if (this.u) {
         return this.u(var1, var2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
      } else {
         throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      }
   }

   public boolean P(MotionEvent var1) {
      int var6 = var1.getActionMasked();
      int var7 = var1.getActionIndex();
      if (var6 == 0) {
         this.a();
      }

      if (this.l == null) {
         this.l = VelocityTracker.obtain();
      }

      this.l.addMovement(var1);
      float var2;
      float var3;
      int var8;
      View var18;
      if (var6 != 0) {
         label108: {
            if (var6 != 1) {
               if (var6 == 2) {
                  if (this.d != null && this.e != null) {
                     var8 = var1.getPointerCount();

                     for(var6 = 0; var6 < var8; ++var6) {
                        int var9 = var1.getPointerId(var6);
                        if (this.D(var9)) {
                           float var5 = var1.getX(var6);
                           var2 = var1.getY(var6);
                           float var4 = var5 - this.d[var9];
                           var3 = var2 - this.e[var9];
                           View var17 = this.t((int)var5, (int)var2);
                           boolean var19;
                           if (var17 != null && this.f(var17, var4, var3)) {
                              var19 = true;
                           } else {
                              var19 = false;
                           }

                           if (var19) {
                              int var10 = var17.getLeft();
                              int var11 = (int)var4;
                              int var12 = this.s.a(var17, var10 + var11, var11);
                              var11 = var17.getTop();
                              int var13 = (int)var3;
                              int var15 = this.s.b(var17, var11 + var13, var13);
                              int var14 = this.s.d(var17);
                              var13 = this.s.e(var17);
                              if ((var14 == 0 || var14 > 0 && var12 == var10) && (var13 == 0 || var13 > 0 && var15 == var11)) {
                                 break;
                              }
                           }

                           this.H(var4, var3, var9);
                           if (this.a == 1 || var19 && this.R(var17, var9)) {
                              break;
                           }
                        }
                     }

                     this.J(var1);
                  }
                  break label108;
               }

               if (var6 != 3) {
                  if (var6 != 5) {
                     if (var6 == 6) {
                        this.j(var1.getPointerId(var7));
                     }
                  } else {
                     var6 = var1.getPointerId(var7);
                     var3 = var1.getX(var7);
                     var2 = var1.getY(var7);
                     this.I(var3, var2, var6);
                     var7 = this.a;
                     if (var7 == 0) {
                        var8 = this.h[var6];
                        var7 = this.q;
                        if ((var8 & var7) != 0) {
                           this.s.h(var8 & var7, var6);
                        }
                     } else if (var7 == 2) {
                        var18 = this.t((int)var3, (int)var2);
                        if (var18 == this.t) {
                           this.R(var18, var6);
                        }
                     }
                  }
                  break label108;
               }
            }

            this.a();
         }
      } else {
         var3 = var1.getX();
         var2 = var1.getY();
         var6 = var1.getPointerId(0);
         this.I(var3, var2, var6);
         var18 = this.t((int)var3, (int)var2);
         if (var18 == this.t && this.a == 2) {
            this.R(var18, var6);
         }

         var7 = this.h[var6];
         var8 = this.q;
         if ((var7 & var8) != 0) {
            this.s.h(var7 & var8, var6);
         }
      }

      boolean var16 = false;
      if (this.a == 1) {
         var16 = true;
      }

      return var16;
   }

   public boolean Q(View var1, int var2, int var3) {
      this.t = var1;
      this.c = -1;
      boolean var4 = this.u(var2, var3, 0, 0);
      if (!var4 && this.a == 0 && this.t != null) {
         this.t = null;
      }

      return var4;
   }

   boolean R(View var1, int var2) {
      if (var1 == this.t && this.c == var2) {
         return true;
      } else if (var1 != null && this.s.m(var1, var2)) {
         this.c = var2;
         this.b(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void a() {
      this.c = -1;
      this.i();
      VelocityTracker var1 = this.l;
      if (var1 != null) {
         var1.recycle();
         this.l = null;
      }

   }

   public void b(View var1, int var2) {
      if (var1.getParent() == this.v) {
         this.t = var1;
         this.c = var2;
         this.s.i(var1, var2);
         this.K(1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
         var3.append(this.v);
         var3.append(")");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public boolean d(int var1) {
      int var3 = this.d.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         if (this.e(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public boolean e(int var1, int var2) {
      boolean var9 = this.C(var2);
      boolean var8 = false;
      boolean var7 = false;
      boolean var6 = false;
      if (!var9) {
         return false;
      } else {
         boolean var5;
         if ((var1 & 1) == 1) {
            var5 = true;
         } else {
            var5 = false;
         }

         boolean var10;
         if ((var1 & 2) == 2) {
            var10 = true;
         } else {
            var10 = false;
         }

         float var3 = this.f[var2] - this.d[var2];
         float var4 = this.g[var2] - this.e[var2];
         if (var5 && var10) {
            var1 = this.b;
            if (var3 * var3 + var4 * var4 > (float)(var1 * var1)) {
               var6 = true;
            }

            return var6;
         } else if (var5) {
            var6 = var8;
            if (Math.abs(var3) > (float)this.b) {
               var6 = true;
            }

            return var6;
         } else {
            var6 = var7;
            if (var10) {
               var6 = var7;
               if (Math.abs(var4) > (float)this.b) {
                  var6 = true;
               }
            }

            return var6;
         }
      }
   }

   public boolean m(boolean var1) {
      int var2 = this.a;
      boolean var7 = false;
      if (var2 == 2) {
         boolean var8 = this.r.computeScrollOffset();
         int var3 = this.r.getCurrX();
         var2 = this.r.getCurrY();
         int var4 = var3 - this.t.getLeft();
         int var5 = var2 - this.t.getTop();
         if (var4 != 0) {
            d0.Y(this.t, var4);
         }

         if (var5 != 0) {
            d0.Z(this.t, var5);
         }

         if (var4 != 0 || var5 != 0) {
            this.s.k(this.t, var3, var2, var4, var5);
         }

         boolean var6 = var8;
         if (var8) {
            var6 = var8;
            if (var3 == this.r.getFinalX()) {
               var6 = var8;
               if (var2 == this.r.getFinalY()) {
                  this.r.abortAnimation();
                  var6 = false;
               }
            }
         }

         if (!var6) {
            if (var1) {
               this.v.post(this.w);
            } else {
               this.K(0);
            }
         }
      }

      var1 = var7;
      if (this.a == 2) {
         var1 = true;
      }

      return var1;
   }

   public View t(int var1, int var2) {
      for(int var3 = this.v.getChildCount() - 1; var3 >= 0; --var3) {
         View var4 = this.v.getChildAt(this.s.c(var3));
         if (var1 >= var4.getLeft() && var1 < var4.getRight() && var2 >= var4.getTop() && var2 < var4.getBottom()) {
            return var4;
         }
      }

      return null;
   }

   public View v() {
      return this.t;
   }

   public int w() {
      return this.p;
   }

   public int x() {
      return this.o;
   }

   public int z() {
      return this.b;
   }

   public abstract static class c {
      public abstract int a(View var1, int var2, int var3);

      public abstract int b(View var1, int var2, int var3);

      public int c(int var1) {
         return var1;
      }

      public int d(View var1) {
         return 0;
      }

      public int e(View var1) {
         return 0;
      }

      public void f(int var1, int var2) {
      }

      public boolean g(int var1) {
         return false;
      }

      public void h(int var1, int var2) {
      }

      public void i(View var1, int var2) {
      }

      public abstract void j(int var1);

      public abstract void k(View var1, int var2, int var3, int var4, int var5);

      public abstract void l(View var1, float var2, float var3);

      public abstract boolean m(View var1, int var2);
   }
}
