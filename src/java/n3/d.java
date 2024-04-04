package n3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import z2.k;

public class d {
   public final ColorStateList a;
   public final ColorStateList b;
   public final ColorStateList c;
   public final String d;
   public final int e;
   public final int f;
   public final boolean g;
   public final float h;
   public final float i;
   public final float j;
   public final boolean k;
   public final float l;
   private ColorStateList m;
   private float n;
   private final int o;
   private boolean p = false;
   private Typeface q;

   public d(Context var1, int var2) {
      TypedArray var4 = var1.obtainStyledAttributes(var2, z2.k.J4);
      this.l(var4.getDimension(z2.k.K4, 0.0F));
      this.k(n3.c.a(var1, var4, z2.k.N4));
      this.a = n3.c.a(var1, var4, z2.k.O4);
      this.b = n3.c.a(var1, var4, z2.k.P4);
      this.e = var4.getInt(z2.k.M4, 0);
      this.f = var4.getInt(z2.k.L4, 1);
      int var3 = n3.c.e(var4, z2.k.V4, z2.k.U4);
      this.o = var4.getResourceId(var3, 0);
      this.d = var4.getString(var3);
      this.g = var4.getBoolean(z2.k.W4, false);
      this.c = n3.c.a(var1, var4, z2.k.Q4);
      this.h = var4.getFloat(z2.k.R4, 0.0F);
      this.i = var4.getFloat(z2.k.S4, 0.0F);
      this.j = var4.getFloat(z2.k.T4, 0.0F);
      var4.recycle();
      TypedArray var5 = var1.obtainStyledAttributes(var2, z2.k.n3);
      var2 = z2.k.o3;
      this.k = var5.hasValue(var2);
      this.l = var5.getFloat(var2, 0.0F);
      var5.recycle();
   }

   // $FF: synthetic method
   static Typeface a(d var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static Typeface b(d var0, Typeface var1) {
      var0.q = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(d var0, boolean var1) {
      var0.p = var1;
      return var1;
   }

   private void d() {
      if (this.q == null) {
         String var2 = this.d;
         if (var2 != null) {
            this.q = Typeface.create(var2, this.e);
         }
      }

      if (this.q == null) {
         int var1 = this.f;
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  this.q = Typeface.DEFAULT;
               } else {
                  this.q = Typeface.MONOSPACE;
               }
            } else {
               this.q = Typeface.SERIF;
            }
         } else {
            this.q = Typeface.SANS_SERIF;
         }

         this.q = Typeface.create(this.q, this.e);
      }

   }

   private boolean m(Context var1) {
      boolean var4 = n3.e.a();
      boolean var3 = true;
      if (var4) {
         return true;
      } else {
         int var2 = this.o;
         Typeface var5;
         if (var2 != 0) {
            var5 = androidx.core.content.res.f.c(var1, var2);
         } else {
            var5 = null;
         }

         if (var5 == null) {
            var3 = false;
         }

         return var3;
      }
   }

   public Typeface e() {
      this.d();
      return this.q;
   }

   public Typeface f(Context var1) {
      if (this.p) {
         return this.q;
      } else {
         if (!var1.isRestricted()) {
            label33: {
               label39: {
                  boolean var10001;
                  Typeface var6;
                  try {
                     var6 = androidx.core.content.res.f.g(var1, this.o);
                     this.q = var6;
                  } catch (Resources.NotFoundException | UnsupportedOperationException var4) {
                     var10001 = false;
                     break label33;
                  } catch (Exception var5) {
                     var10001 = false;
                     break label39;
                  }

                  if (var6 == null) {
                     break label33;
                  }

                  try {
                     this.q = Typeface.create(var6, this.e);
                     break label33;
                  } catch (Resources.NotFoundException | UnsupportedOperationException var2) {
                     var10001 = false;
                     break label33;
                  } catch (Exception var3) {
                     var10001 = false;
                  }
               }

               StringBuilder var7 = new StringBuilder();
               var7.append("Error loading font ");
               var7.append(this.d);
            }
         }

         this.d();
         this.p = true;
         return this.q;
      }
   }

   public void g(Context var1, TextPaint var2, f var3) {
      this.p(var1, var2, this.e());
      this.h(var1, new d$b(this, var1, var2, var3));
   }

   public void h(Context var1, f var2) {
      if (this.m(var1)) {
         this.f(var1);
      } else {
         this.d();
      }

      int var3 = this.o;
      if (var3 == 0) {
         this.p = true;
      }

      if (this.p) {
         var2.b(this.q, true);
      } else {
         try {
            d$a var4 = new d$a(this, var2);
            androidx.core.content.res.f.i(var1, var3, var4, (Handler)null);
         } catch (Resources.NotFoundException var5) {
            this.p = true;
            var2.a(1);
         } catch (Exception var6) {
            StringBuilder var7 = new StringBuilder();
            var7.append("Error loading font ");
            var7.append(this.d);
            this.p = true;
            var2.a(-3);
         }

      }
   }

   public ColorStateList i() {
      return this.m;
   }

   public float j() {
      return this.n;
   }

   public void k(ColorStateList var1) {
      this.m = var1;
   }

   public void l(float var1) {
      this.n = var1;
   }

   public void n(Context var1, TextPaint var2, f var3) {
      this.o(var1, var2, var3);
      ColorStateList var8 = this.m;
      int var7;
      if (var8 != null) {
         var7 = var8.getColorForState(var2.drawableState, var8.getDefaultColor());
      } else {
         var7 = -16777216;
      }

      var2.setColor(var7);
      float var4 = this.j;
      float var5 = this.h;
      float var6 = this.i;
      var8 = this.c;
      if (var8 != null) {
         var7 = var8.getColorForState(var2.drawableState, var8.getDefaultColor());
      } else {
         var7 = 0;
      }

      var2.setShadowLayer(var4, var5, var6, var7);
   }

   public void o(Context var1, TextPaint var2, f var3) {
      if (this.m(var1)) {
         this.p(var1, var2, this.f(var1));
      } else {
         this.g(var1, var2, var3);
      }

   }

   public void p(Context var1, TextPaint var2, Typeface var3) {
      Typeface var7 = n3.h.a(var1, var3);
      if (var7 != null) {
         var3 = var7;
      }

      var2.setTypeface(var3);
      int var5 = this.e & ~var3.getStyle();
      boolean var6;
      if ((var5 & 1) != 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      var2.setFakeBoldText(var6);
      float var4;
      if ((var5 & 2) != 0) {
         var4 = -0.25F;
      } else {
         var4 = 0.0F;
      }

      var2.setTextSkewX(var4);
      var2.setTextSize(this.n);
      if (this.k) {
         var2.setLetterSpacing(this.l);
      }

   }
}
