package u0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class e extends androidx.fragment.app.x {
   private static boolean C(l var0) {
      boolean var1;
      if (androidx.fragment.app.x.l(var0.D()) && androidx.fragment.app.x.l(var0.E()) && androidx.fragment.app.x.l(var0.F())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void A(Object var1, ArrayList var2, ArrayList var3) {
      p var4 = (p)var1;
      if (var4 != null) {
         var4.G().clear();
         var4.G().addAll(var3);
         this.q(var4, var2, var3);
      }

   }

   public Object B(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         p var2 = new p();
         var2.i0((l)var1);
         return var2;
      }
   }

   public void a(Object var1, View var2) {
      if (var1 != null) {
         ((l)var1).d(var2);
      }

   }

   public void b(Object var1, ArrayList var2) {
      l var7 = (l)var1;
      if (var7 != null) {
         boolean var6 = var7 instanceof p;
         int var4 = 0;
         int var3 = 0;
         if (var6) {
            p var8 = (p)var7;

            for(var4 = var8.l0(); var3 < var4; ++var3) {
               this.b(var8.k0(var3), var2);
            }
         } else if (!C(var7) && androidx.fragment.app.x.l(var7.G())) {
            int var5 = var2.size();

            for(var3 = var4; var3 < var5; ++var3) {
               var7.d((View)var2.get(var3));
            }
         }

      }
   }

   public void c(ViewGroup var1, Object var2) {
      n.a(var1, (l)var2);
   }

   public boolean e(Object var1) {
      return var1 instanceof l;
   }

   public Object g(Object var1) {
      l var2;
      if (var1 != null) {
         var2 = ((l)var1).q();
      } else {
         var2 = null;
      }

      return var2;
   }

   public Object m(Object var1, Object var2, Object var3) {
      var1 = (l)var1;
      l var4 = (l)var2;
      l var6 = (l)var3;
      if (var1 != null && var4 != null) {
         var1 = (new p()).i0((l)var1).i0(var4).q0(1);
      } else if (var1 == null) {
         if (var4 != null) {
            var1 = var4;
         } else {
            var1 = null;
         }
      }

      if (var6 != null) {
         p var5 = new p();
         if (var1 != null) {
            var5.i0((l)var1);
         }

         var5.i0(var6);
         return var5;
      } else {
         return var1;
      }
   }

   public Object n(Object var1, Object var2, Object var3) {
      p var4 = new p();
      if (var1 != null) {
         var4.i0((l)var1);
      }

      if (var2 != null) {
         var4.i0((l)var2);
      }

      if (var3 != null) {
         var4.i0((l)var3);
      }

      return var4;
   }

   public void p(Object var1, View var2) {
      if (var1 != null) {
         ((l)var1).U(var2);
      }

   }

   public void q(Object var1, ArrayList var2, ArrayList var3) {
      l var7 = (l)var1;
      boolean var6 = var7 instanceof p;
      int var5 = 0;
      int var4 = 0;
      if (var6) {
         p var8 = (p)var7;

         for(var5 = var8.l0(); var4 < var5; ++var4) {
            this.q(var8.k0(var4), var2, var3);
         }
      } else if (!C(var7)) {
         List var9 = var7.G();
         if (var9.size() == var2.size() && var9.containsAll(var2)) {
            if (var3 == null) {
               var4 = 0;
            } else {
               var4 = var3.size();
            }

            while(var5 < var4) {
               var7.d((View)var3.get(var5));
               ++var5;
            }

            for(var4 = var2.size() - 1; var4 >= 0; --var4) {
               var7.U((View)var2.get(var4));
            }
         }
      }

   }

   public void r(Object var1, View var2, ArrayList var3) {
      ((l)var1).a(new l.f(this, var2, var3) {
         final View a;
         final ArrayList b;
         final e c;

         {
            this.c = var1;
            this.a = var2;
            this.b = var3;
         }

         public void a(l var1) {
         }

         public void b(l var1) {
         }

         public void c(l var1) {
            var1.T(this);
            this.a.setVisibility(8);
            int var3 = this.b.size();

            for(int var2 = 0; var2 < var3; ++var2) {
               ((View)this.b.get(var2)).setVisibility(0);
            }

         }

         public void d(l var1) {
            var1.T(this);
            var1.a(this);
         }

         public void e(l var1) {
         }
      });
   }

   public void t(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5, Object var6, ArrayList var7) {
      ((l)var1).a(new m(this, var2, var3, var4, var5, var6, var7) {
         final Object a;
         final ArrayList b;
         final Object c;
         final ArrayList d;
         final Object e;
         final ArrayList f;
         final e g;

         {
            this.g = var1;
            this.a = var2;
            this.b = var3;
            this.c = var4;
            this.d = var5;
            this.e = var6;
            this.f = var7;
         }

         public void c(l var1) {
            var1.T(this);
         }

         public void d(l var1) {
            Object var2 = this.a;
            if (var2 != null) {
               this.g.q(var2, this.b, (ArrayList)null);
            }

            var2 = this.c;
            if (var2 != null) {
               this.g.q(var2, this.d, (ArrayList)null);
            }

            var2 = this.e;
            if (var2 != null) {
               this.g.q(var2, this.f, (ArrayList)null);
            }

         }
      });
   }

   public void u(Object var1, Rect var2) {
      if (var1 != null) {
         ((l)var1).Z(new l.e(this, var2) {
            final Rect a;
            final e b;

            {
               this.b = var1;
               this.a = var2;
            }
         });
      }

   }

   public void v(Object var1, View var2) {
      if (var2 != null) {
         l var4 = (l)var1;
         Rect var3 = new Rect();
         this.k(var2, var3);
         var4.Z(new l.e(this, var3) {
            final Rect a;
            final e b;

            {
               this.b = var1;
               this.a = var2;
            }
         });
      }

   }

   public void w(Fragment var1, Object var2, androidx.core.os.e var3, Runnable var4) {
      l var5 = (l)var2;
      var3.c(new androidx.core.os.e.b(this, var5) {
         final l a;
         final e b;

         {
            this.b = var1;
            this.a = var2;
         }

         public void onCancel() {
            this.a.j();
         }
      });
      var5.a(new l.f(this, var4) {
         final Runnable a;
         final e b;

         {
            this.b = var1;
            this.a = var2;
         }

         public void a(l var1) {
         }

         public void b(l var1) {
         }

         public void c(l var1) {
            this.a.run();
         }

         public void d(l var1) {
         }

         public void e(l var1) {
         }
      });
   }

   public void z(Object var1, View var2, ArrayList var3) {
      p var7 = (p)var1;
      List var6 = var7.G();
      var6.clear();
      int var5 = var3.size();

      for(int var4 = 0; var4 < var5; ++var4) {
         androidx.fragment.app.x.d(var6, (View)var3.get(var4));
      }

      var6.add(var2);
      var3.add(var2);
      this.b(var7, var3);
   }
}
