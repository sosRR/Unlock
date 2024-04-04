package b0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.d0;
import androidx.core.view.accessibility.k;
import androidx.core.view.accessibility.l;
import androidx.core.view.accessibility.m;
import java.util.ArrayList;
import java.util.List;
import n.h;

public abstract class a extends androidx.core.view.a {
   private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   private static final b.a o = new b.a() {
      public void b(k var1, Rect var2) {
         var1.j(var2);
      }
   };
   private static final b.b p = new b.b() {
      public k c(h var1, int var2) {
         return (k)var1.o(var2);
      }

      public int d(h var1) {
         return var1.n();
      }
   };
   private final Rect d = new Rect();
   private final Rect e = new Rect();
   private final Rect f = new Rect();
   private final int[] g = new int[2];
   private final AccessibilityManager h;
   private final View i;
   private c j;
   int k = Integer.MIN_VALUE;
   int l = Integer.MIN_VALUE;
   private int m = Integer.MIN_VALUE;

   public a(View var1) {
      if (var1 != null) {
         this.i = var1;
         this.h = (AccessibilityManager)var1.getContext().getSystemService("accessibility");
         var1.setFocusable(true);
         if (d0.y(var1) == 0) {
            d0.y0(var1, 1);
         }

      } else {
         throw new IllegalArgumentException("View may not be null");
      }
   }

   private static Rect D(View var0, int var1, Rect var2) {
      int var4 = var0.getWidth();
      int var3 = var0.getHeight();
      if (var1 != 17) {
         if (var1 != 33) {
            if (var1 != 66) {
               if (var1 != 130) {
                  throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
               }

               var2.set(0, -1, var4, -1);
            } else {
               var2.set(-1, 0, -1, var3);
            }
         } else {
            var2.set(0, var3, var4, var3);
         }
      } else {
         var2.set(var4, 0, var4, var3);
      }

      return var2;
   }

   private boolean E(Rect var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 != null) {
         if (var1.isEmpty()) {
            var2 = var3;
         } else {
            if (this.i.getWindowVisibility() != 0) {
               return false;
            }

            ViewParent var4 = this.i.getParent();

            while(true) {
               if (!(var4 instanceof View)) {
                  var2 = var3;
                  if (var4 != null) {
                     var2 = true;
                  }
                  break;
               }

               View var5 = (View)var4;
               if (var5.getAlpha() <= 0.0F || var5.getVisibility() != 0) {
                  return false;
               }

               var4 = var5.getParent();
            }
         }
      }

      return var2;
   }

   private static int F(int var0) {
      if (var0 != 19) {
         if (var0 != 21) {
            return var0 != 22 ? 130 : 66;
         } else {
            return 17;
         }
      } else {
         return 33;
      }
   }

   private boolean G(int var1, Rect var2) {
      h var7 = this.y();
      int var4 = this.l;
      int var3 = Integer.MIN_VALUE;
      k var6;
      if (var4 == Integer.MIN_VALUE) {
         var6 = null;
      } else {
         var6 = (k)var7.i(var4);
      }

      k var9;
      if (var1 != 1 && var1 != 2) {
         if (var1 != 17 && var1 != 33 && var1 != 66 && var1 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
         }

         Rect var8 = new Rect();
         var4 = this.l;
         if (var4 != Integer.MIN_VALUE) {
            this.z(var4, var8);
         } else if (var2 != null) {
            var8.set(var2);
         } else {
            D(this.i, var1, var8);
         }

         var9 = (k)b.c(var7, p, o, var6, var8, var1);
      } else {
         boolean var5;
         if (d0.A(this.i) == 1) {
            var5 = true;
         } else {
            var5 = false;
         }

         var9 = (k)b.d(var7, p, o, var6, var1, var5, false);
      }

      if (var9 == null) {
         var1 = var3;
      } else {
         var1 = var7.l(var7.k(var9));
      }

      return this.T(var1);
   }

   private boolean Q(int var1, int var2, Bundle var3) {
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 64) {
               return var2 != 128 ? this.J(var1, var2, var3) : this.n(var1);
            } else {
               return this.S(var1);
            }
         } else {
            return this.o(var1);
         }
      } else {
         return this.T(var1);
      }
   }

   private boolean R(int var1, Bundle var2) {
      return d0.d0(this.i, var1, var2);
   }

   private boolean S(int var1) {
      if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
         int var2 = this.k;
         if (var2 != var1) {
            if (var2 != Integer.MIN_VALUE) {
               this.n(var2);
            }

            this.k = var1;
            this.i.invalidate();
            this.U(var1, 32768);
            return true;
         }
      }

      return false;
   }

   private void V(int var1) {
      int var2 = this.m;
      if (var2 != var1) {
         this.m = var1;
         this.U(var1, 128);
         this.U(var2, 256);
      }
   }

   private boolean n(int var1) {
      if (this.k == var1) {
         this.k = Integer.MIN_VALUE;
         this.i.invalidate();
         this.U(var1, 65536);
         return true;
      } else {
         return false;
      }
   }

   private boolean p() {
      int var1 = this.l;
      boolean var2;
      if (var1 != Integer.MIN_VALUE && this.J(var1, 16, (Bundle)null)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private AccessibilityEvent q(int var1, int var2) {
      return var1 != -1 ? this.r(var1, var2) : this.s(var2);
   }

   private AccessibilityEvent r(int var1, int var2) {
      AccessibilityEvent var3 = AccessibilityEvent.obtain(var2);
      k var4 = this.H(var1);
      var3.getText().add(var4.r());
      var3.setContentDescription(var4.o());
      var3.setScrollable(var4.D());
      var3.setPassword(var4.C());
      var3.setEnabled(var4.y());
      var3.setChecked(var4.w());
      this.L(var1, var3);
      if (var3.getText().isEmpty() && var3.getContentDescription() == null) {
         throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
      } else {
         var3.setClassName(var4.m());
         androidx.core.view.accessibility.m.c(var3, this.i, var1);
         var3.setPackageName(this.i.getContext().getPackageName());
         return var3;
      }
   }

   private AccessibilityEvent s(int var1) {
      AccessibilityEvent var2 = AccessibilityEvent.obtain(var1);
      this.i.onInitializeAccessibilityEvent(var2);
      return var2;
   }

   private k t(int var1) {
      k var4 = androidx.core.view.accessibility.k.H();
      var4.X(true);
      var4.Z(true);
      var4.S("android.view.View");
      Rect var5 = n;
      var4.O(var5);
      var4.P(var5);
      var4.h0(this.i);
      this.N(var1, var4);
      if (var4.r() == null && var4.o() == null) {
         throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
      } else {
         var4.j(this.e);
         if (!this.e.equals(var5)) {
            int var2 = var4.i();
            if ((var2 & 64) != 0) {
               throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((var2 & 128) == 0) {
               var4.f0(this.i.getContext().getPackageName());
               var4.o0(this.i, var1);
               if (this.k == var1) {
                  var4.N(true);
                  var4.a(128);
               } else {
                  var4.N(false);
                  var4.a(64);
               }

               boolean var3;
               if (this.l == var1) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               if (var3) {
                  var4.a(2);
               } else if (var4.z()) {
                  var4.a(1);
               }

               var4.a0(var3);
               this.i.getLocationOnScreen(this.g);
               var4.k(this.d);
               if (this.d.equals(var5)) {
                  var4.j(this.d);
                  if (var4.b != -1) {
                     k var8 = androidx.core.view.accessibility.k.H();

                     for(var1 = var4.b; var1 != -1; var1 = var8.b) {
                        var8.i0(this.i, -1);
                        var8.O(n);
                        this.N(var1, var8);
                        var8.j(this.e);
                        Rect var6 = this.d;
                        Rect var7 = this.e;
                        var6.offset(var7.left, var7.top);
                     }

                     var8.L();
                  }

                  this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
               }

               if (this.i.getLocalVisibleRect(this.f)) {
                  this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                  if (this.d.intersect(this.f)) {
                     var4.P(this.d);
                     if (this.E(this.d)) {
                        var4.s0(true);
                     }
                  }
               }

               return var4;
            } else {
               throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
         } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
         }
      }
   }

   private k u() {
      k var4 = androidx.core.view.accessibility.k.I(this.i);
      d0.b0(this.i, var4);
      ArrayList var3 = new ArrayList();
      this.C(var3);
      if (var4.l() > 0 && var3.size() > 0) {
         throw new RuntimeException("Views cannot have both real and virtual children");
      } else {
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            var4.d(this.i, (Integer)var3.get(var1));
         }

         return var4;
      }
   }

   private h y() {
      ArrayList var2 = new ArrayList();
      this.C(var2);
      h var3 = new h();

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         k var4 = this.t((Integer)var2.get(var1));
         var3.m((Integer)var2.get(var1), var4);
      }

      return var3;
   }

   private void z(int var1, Rect var2) {
      this.H(var1).j(var2);
   }

   public final int A() {
      return this.l;
   }

   protected abstract int B(float var1, float var2);

   protected abstract void C(List var1);

   k H(int var1) {
      return var1 == -1 ? this.u() : this.t(var1);
   }

   public final void I(boolean var1, int var2, Rect var3) {
      int var4 = this.l;
      if (var4 != Integer.MIN_VALUE) {
         this.o(var4);
      }

      if (var1) {
         this.G(var2, var3);
      }

   }

   protected abstract boolean J(int var1, int var2, Bundle var3);

   protected void K(AccessibilityEvent var1) {
   }

   protected void L(int var1, AccessibilityEvent var2) {
   }

   protected abstract void M(k var1);

   protected abstract void N(int var1, k var2);

   protected abstract void O(int var1, boolean var2);

   boolean P(int var1, int var2, Bundle var3) {
      return var1 != -1 ? this.Q(var1, var2, var3) : this.R(var2, var3);
   }

   public final boolean T(int var1) {
      if (!this.i.isFocused() && !this.i.requestFocus()) {
         return false;
      } else {
         int var2 = this.l;
         if (var2 == var1) {
            return false;
         } else {
            if (var2 != Integer.MIN_VALUE) {
               this.o(var2);
            }

            if (var1 == Integer.MIN_VALUE) {
               return false;
            } else {
               this.l = var1;
               this.O(var1, true);
               this.U(var1, 8);
               return true;
            }
         }
      }
   }

   public final boolean U(int var1, int var2) {
      if (var1 != Integer.MIN_VALUE && this.h.isEnabled()) {
         ViewParent var4 = this.i.getParent();
         if (var4 == null) {
            return false;
         } else {
            AccessibilityEvent var3 = this.q(var1, var2);
            return var4.requestSendAccessibilityEvent(this.i, var3);
         }
      } else {
         return false;
      }
   }

   public l b(View var1) {
      if (this.j == null) {
         this.j = new c(this);
      }

      return this.j;
   }

   public void f(View var1, AccessibilityEvent var2) {
      super.f(var1, var2);
      this.K(var2);
   }

   public void g(View var1, k var2) {
      super.g(var1, var2);
      this.M(var2);
   }

   public final boolean o(int var1) {
      if (this.l != var1) {
         return false;
      } else {
         this.l = Integer.MIN_VALUE;
         this.O(var1, false);
         this.U(var1, 8);
         return true;
      }
   }

   public final boolean v(MotionEvent var1) {
      boolean var5 = this.h.isEnabled();
      boolean var4 = false;
      boolean var3 = var4;
      if (var5) {
         if (!this.h.isTouchExplorationEnabled()) {
            var3 = var4;
         } else {
            int var2 = var1.getAction();
            if (var2 != 7 && var2 != 9) {
               if (var2 != 10) {
                  return false;
               }

               if (this.m != Integer.MIN_VALUE) {
                  this.V(Integer.MIN_VALUE);
                  return true;
               }

               return false;
            }

            var2 = this.B(var1.getX(), var1.getY());
            this.V(var2);
            var3 = var4;
            if (var2 != Integer.MIN_VALUE) {
               var3 = true;
            }
         }
      }

      return var3;
   }

   public final boolean w(KeyEvent var1) {
      int var3 = var1.getAction();
      boolean var6 = false;
      int var2 = 0;
      boolean var5 = var6;
      if (var3 != 1) {
         var3 = var1.getKeyCode();
         if (var3 != 61) {
            if (var3 != 66) {
               switch (var3) {
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                     var5 = var6;
                     if (var1.hasNoModifiers()) {
                        var3 = F(var3);
                        int var4 = var1.getRepeatCount();

                        for(var5 = false; var2 < var4 + 1 && this.G(var3, (Rect)null); var5 = true) {
                           ++var2;
                        }
                     }

                     return var5;
                  case 23:
                     break;
                  default:
                     var5 = var6;
                     return var5;
               }
            }

            var5 = var6;
            if (var1.hasNoModifiers()) {
               var5 = var6;
               if (var1.getRepeatCount() == 0) {
                  this.p();
                  var5 = true;
               }
            }
         } else if (var1.hasNoModifiers()) {
            var5 = this.G(2, (Rect)null);
         } else {
            var5 = var6;
            if (var1.hasModifiers(1)) {
               var5 = this.G(1, (Rect)null);
            }
         }
      }

      return var5;
   }

   public final int x() {
      return this.k;
   }

   private class c extends l {
      final a b;

      c(a var1) {
         this.b = var1;
      }

      public k b(int var1) {
         return androidx.core.view.accessibility.k.J(this.b.H(var1));
      }

      public k d(int var1) {
         if (var1 == 2) {
            var1 = this.b.k;
         } else {
            var1 = this.b.l;
         }

         return var1 == Integer.MIN_VALUE ? null : this.b(var1);
      }

      public boolean f(int var1, int var2, Bundle var3) {
         return this.b.P(var1, var2, var3);
      }
   }
}
