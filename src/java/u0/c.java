package u0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class c extends l {
   private static final String[] X = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
   private static final Property Y = new c$b(PointF.class, "boundsOrigin");
   private static final Property Z = new c$c(PointF.class, "topLeft");
   private static final Property a0 = new c$d(PointF.class, "bottomRight");
   private static final Property b0 = new c$e(PointF.class, "bottomRight");
   private static final Property c0 = new c$f(PointF.class, "topLeft");
   private static final Property d0 = new c$g(PointF.class, "position");
   private static j e0 = new j();
   private int[] U = new int[2];
   private boolean V = false;
   private boolean W = false;

   private void g0(r var1) {
      View var2 = var1.b;
      if (androidx.core.view.d0.S(var2) || var2.getWidth() != 0 || var2.getHeight() != 0) {
         var1.a.put("android:changeBounds:bounds", new Rect(var2.getLeft(), var2.getTop(), var2.getRight(), var2.getBottom()));
         var1.a.put("android:changeBounds:parent", var1.b.getParent());
         if (this.W) {
            var1.b.getLocationInWindow(this.U);
            var1.a.put("android:changeBounds:windowX", this.U[0]);
            var1.a.put("android:changeBounds:windowY", this.U[1]);
         }

         if (this.V) {
            var1.a.put("android:changeBounds:clip", androidx.core.view.d0.t(var2));
         }
      }

   }

   private boolean h0(View var1, View var2) {
      boolean var5 = this.W;
      boolean var4 = true;
      boolean var3 = var4;
      if (var5) {
         r var6 = this.x(var1, true);
         if (var6 == null) {
            if (var1 == var2) {
               var3 = var4;
               return var3;
            }
         } else if (var2 == var6.b) {
            var3 = var4;
            return var3;
         }

         var3 = false;
      }

      return var3;
   }

   public String[] H() {
      return X;
   }

   public void k(r var1) {
      this.g0(var1);
   }

   public void n(r var1) {
      this.g0(var1);
   }

   public Animator r(ViewGroup var1, r var2, r var3) {
      if (var2 != null && var3 != null) {
         Map var20 = var2.a;
         Map var21 = var3.a;
         ViewGroup var38 = (ViewGroup)var20.get("android:changeBounds:parent");
         ViewGroup var22 = (ViewGroup)var21.get("android:changeBounds:parent");
         if (var38 != null && var22 != null) {
            View var41 = var3.b;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            ObjectAnimator var32;
            if (this.h0(var38, var22)) {
               Rect var23 = (Rect)var2.a.get("android:changeBounds:bounds");
               Rect var40 = (Rect)var3.a.get("android:changeBounds:bounds");
               var9 = var23.left;
               int var14 = var40.left;
               int var15 = var23.top;
               int var13 = var40.top;
               int var12 = var23.right;
               int var18 = var40.right;
               int var19 = var23.bottom;
               int var11 = var40.bottom;
               int var16 = var12 - var9;
               int var17 = var19 - var15;
               var8 = var18 - var14;
               var10 = var11 - var13;
               Rect var28 = (Rect)var2.a.get("android:changeBounds:clip");
               var40 = (Rect)var3.a.get("android:changeBounds:clip");
               if (var16 != 0 && var17 != 0 || var8 != 0 && var10 != 0) {
                  label146: {
                     byte var37;
                     if (var9 == var14 && var15 == var13) {
                        var37 = 0;
                     } else {
                        var37 = 1;
                     }

                     if (var12 == var18) {
                        var6 = var37;
                        if (var19 == var11) {
                           break label146;
                        }
                     }

                     var6 = var37 + 1;
                  }
               } else {
                  var6 = 0;
               }

               label149: {
                  if (var28 == null || var28.equals(var40)) {
                     var7 = var6;
                     if (var28 != null) {
                        break label149;
                     }

                     var7 = var6;
                     if (var40 == null) {
                        break label149;
                     }
                  }

                  var7 = var6 + 1;
               }

               if (var7 > 0) {
                  Path var24;
                  Object var26;
                  if (!this.V) {
                     u0.z.f(var41, var9, var15, var12, var19);
                     if (var7 == 2) {
                        if (var16 == var8 && var17 == var10) {
                           var24 = this.z().a((float)var9, (float)var15, (float)var14, (float)var13);
                           var26 = u0.f.a(var41, d0, var24);
                        } else {
                           k var30 = new k(var41);
                           var24 = this.z().a((float)var9, (float)var15, (float)var14, (float)var13);
                           var32 = u0.f.a(var30, Z, var24);
                           var24 = this.z().a((float)var12, (float)var19, (float)var18, (float)var11);
                           ObjectAnimator var42 = u0.f.a(var30, a0, var24);
                           var26 = new AnimatorSet();
                           ((AnimatorSet)var26).playTogether(new Animator[]{var32, var42});
                           ((Animator)var26).addListener(new c$h(this, var30));
                        }
                     } else if (var9 == var14 && var15 == var13) {
                        var24 = this.z().a((float)var12, (float)var19, (float)var18, (float)var11);
                        var26 = u0.f.a(var41, b0, var24);
                     } else {
                        var24 = this.z().a((float)var9, (float)var15, (float)var14, (float)var13);
                        var26 = u0.f.a(var41, c0, var24);
                     }
                  } else {
                     u0.z.f(var41, var9, var15, Math.max(var16, var8) + var9, Math.max(var17, var10) + var15);
                     ObjectAnimator var35;
                     if (var9 == var14 && var15 == var13) {
                        var35 = null;
                     } else {
                        var24 = this.z().a((float)var9, (float)var15, (float)var14, (float)var13);
                        var35 = u0.f.a(var41, d0, var24);
                     }

                     if (var28 == null) {
                        var28 = new Rect(0, 0, var16, var17);
                     }

                     Rect var34;
                     if (var40 == null) {
                        var34 = new Rect(0, 0, var8, var10);
                     } else {
                        var34 = var40;
                     }

                     ObjectAnimator var33;
                     if (!var28.equals(var34)) {
                        androidx.core.view.d0.v0(var41, var28);
                        var33 = ObjectAnimator.ofObject(var41, "clipBounds", e0, new Object[]{var28, var34});
                        var33.addListener(new c$i(this, var41, var40, var14, var13, var18, var11));
                     } else {
                        var33 = null;
                     }

                     var26 = u0.q.c(var35, var33);
                  }

                  if (var41.getParent() instanceof ViewGroup) {
                     ViewGroup var36 = (ViewGroup)var41.getParent();
                     u0.w.c(var36, true);
                     this.a(new m(this, var36) {
                        boolean a;
                        final ViewGroup b;
                        final c c;

                        {
                           this.c = var1;
                           this.b = var2;
                           this.a = false;
                        }

                        public void a(l var1) {
                           u0.w.c(this.b, false);
                        }

                        public void b(l var1) {
                           u0.w.c(this.b, true);
                        }

                        public void c(l var1) {
                           if (!this.a) {
                              u0.w.c(this.b, false);
                           }

                           var1.T(this);
                        }

                        public void e(l var1) {
                           u0.w.c(this.b, false);
                           this.a = true;
                        }
                     });
                  }

                  return (Animator)var26;
               }
            } else {
               var10 = (Integer)var2.a.get("android:changeBounds:windowX");
               var7 = (Integer)var2.a.get("android:changeBounds:windowY");
               var9 = (Integer)var3.a.get("android:changeBounds:windowX");
               var6 = (Integer)var3.a.get("android:changeBounds:windowY");
               if (var10 != var9 || var7 != var6) {
                  var1.getLocationInWindow(this.U);
                  Bitmap var25 = Bitmap.createBitmap(var41.getWidth(), var41.getHeight(), Config.ARGB_8888);
                  var41.draw(new Canvas(var25));
                  BitmapDrawable var27 = new BitmapDrawable(var25);
                  float var4 = u0.z.c(var41);
                  u0.z.g(var41, 0.0F);
                  u0.z.b(var1).b(var27);
                  g var29 = this.z();
                  int[] var39 = this.U;
                  var8 = var39[0];
                  float var5 = (float)(var10 - var8);
                  var10 = var39[1];
                  Path var31 = var29.a(var5, (float)(var7 - var10), (float)(var9 - var8), (float)(var6 - var10));
                  var32 = ObjectAnimator.ofPropertyValuesHolder(var27, new PropertyValuesHolder[]{h.a(Y, var31)});
                  var32.addListener(new c$a(this, var1, var27, var41, var4));
                  return var32;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static class k {
      private int a;
      private int b;
      private int c;
      private int d;
      private View e;
      private int f;
      private int g;

      k(View var1) {
         this.e = var1;
      }

      private void b() {
         u0.z.f(this.e, this.a, this.b, this.c, this.d);
         this.f = 0;
         this.g = 0;
      }

      void a(PointF var1) {
         this.c = Math.round(var1.x);
         this.d = Math.round(var1.y);
         int var2 = this.g + 1;
         this.g = var2;
         if (this.f == var2) {
            this.b();
         }

      }

      void c(PointF var1) {
         this.a = Math.round(var1.x);
         this.b = Math.round(var1.y);
         int var2 = this.f + 1;
         this.f = var2;
         if (var2 == this.g) {
            this.b();
         }

      }
   }
}
