package u0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends l {
   private ArrayList U = new ArrayList();
   private boolean V = true;
   int W;
   boolean X = false;
   private int Y = 0;

   private void j0(l var1) {
      this.U.add(var1);
      var1.D = this;
   }

   private void s0() {
      b var2 = new b(this);
      Iterator var1 = this.U.iterator();

      while(var1.hasNext()) {
         ((l)var1.next()).a(var2);
      }

      this.W = this.U.size();
   }

   public void R(View var1) {
      super.R(var1);
      int var3 = this.U.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((l)this.U.get(var2)).R(var1);
      }

   }

   public void V(View var1) {
      super.V(var1);
      int var3 = this.U.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((l)this.U.get(var2)).V(var1);
      }

   }

   protected void X() {
      if (this.U.isEmpty()) {
         this.e0();
         this.t();
      } else {
         this.s0();
         if (!this.V) {
            for(int var1 = 1; var1 < this.U.size(); ++var1) {
               ((l)this.U.get(var1 - 1)).a(new m(this, (l)this.U.get(var1)) {
                  final l a;
                  final p b;

                  {
                     this.b = var1;
                     this.a = var2;
                  }

                  public void c(l var1) {
                     this.a.X();
                     var1.T(this);
                  }
               });
            }

            l var2 = (l)this.U.get(0);
            if (var2 != null) {
               var2.X();
            }
         } else {
            Iterator var3 = this.U.iterator();

            while(var3.hasNext()) {
               ((l)var3.next()).X();
            }
         }

      }
   }

   public void Z(l.e var1) {
      super.Z(var1);
      this.Y |= 8;
      int var3 = this.U.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((l)this.U.get(var2)).Z(var1);
      }

   }

   public void b0(g var1) {
      super.b0(var1);
      this.Y |= 4;
      if (this.U != null) {
         for(int var2 = 0; var2 < this.U.size(); ++var2) {
            ((l)this.U.get(var2)).b0(var1);
         }
      }

   }

   public void c0(o var1) {
      super.c0(var1);
      this.Y |= 2;
      int var3 = this.U.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((l)this.U.get(var2)).c0(var1);
      }

   }

   String f0(String var1) {
      String var3 = super.f0(var1);

      for(int var2 = 0; var2 < this.U.size(); ++var2) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var3);
         var4.append("\n");
         l var5 = (l)this.U.get(var2);
         StringBuilder var6 = new StringBuilder();
         var6.append(var1);
         var6.append("  ");
         var4.append(var5.f0(var6.toString()));
         var3 = var4.toString();
      }

      return var3;
   }

   public p g0(l.f var1) {
      return (p)super.a(var1);
   }

   public p h0(View var1) {
      for(int var2 = 0; var2 < this.U.size(); ++var2) {
         ((l)this.U.get(var2)).d(var1);
      }

      return (p)super.d(var1);
   }

   public p i0(l var1) {
      this.j0(var1);
      long var2 = super.o;
      if (var2 >= 0L) {
         var1.Y(var2);
      }

      if ((this.Y & 1) != 0) {
         var1.a0(this.w());
      }

      if ((this.Y & 2) != 0) {
         this.A();
         var1.c0((o)null);
      }

      if ((this.Y & 4) != 0) {
         var1.b0(this.z());
      }

      if ((this.Y & 8) != 0) {
         var1.Z(this.v());
      }

      return this;
   }

   protected void j() {
      super.j();
      int var2 = this.U.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         ((l)this.U.get(var1)).j();
      }

   }

   public void k(r var1) {
      if (this.K(var1.b)) {
         Iterator var2 = this.U.iterator();

         while(var2.hasNext()) {
            l var3 = (l)var2.next();
            if (var3.K(var1.b)) {
               var3.k(var1);
               var1.c.add(var3);
            }
         }
      }

   }

   public l k0(int var1) {
      return var1 >= 0 && var1 < this.U.size() ? (l)this.U.get(var1) : null;
   }

   public int l0() {
      return this.U.size();
   }

   void m(r var1) {
      super.m(var1);
      int var3 = this.U.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((l)this.U.get(var2)).m(var1);
      }

   }

   public p m0(l.f var1) {
      return (p)super.T(var1);
   }

   public void n(r var1) {
      if (this.K(var1.b)) {
         Iterator var2 = this.U.iterator();

         while(var2.hasNext()) {
            l var3 = (l)var2.next();
            if (var3.K(var1.b)) {
               var3.n(var1);
               var1.c.add(var3);
            }
         }
      }

   }

   public p n0(View var1) {
      for(int var2 = 0; var2 < this.U.size(); ++var2) {
         ((l)this.U.get(var2)).U(var1);
      }

      return (p)super.U(var1);
   }

   public p o0(long var1) {
      super.Y(var1);
      if (super.o >= 0L) {
         ArrayList var5 = this.U;
         if (var5 != null) {
            int var4 = var5.size();

            for(int var3 = 0; var3 < var4; ++var3) {
               ((l)this.U.get(var3)).Y(var1);
            }
         }
      }

      return this;
   }

   public p p0(TimeInterpolator var1) {
      this.Y |= 1;
      ArrayList var4 = this.U;
      if (var4 != null) {
         int var3 = var4.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            ((l)this.U.get(var2)).a0(var1);
         }
      }

      return (p)super.a0(var1);
   }

   public l q() {
      p var3 = (p)super.q();
      var3.U = new ArrayList();
      int var2 = this.U.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         var3.j0(((l)this.U.get(var1)).q());
      }

      return var3;
   }

   public p q0(int var1) {
      if (var1 != 0) {
         if (var1 != 1) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Invalid parameter for TransitionSet ordering: ");
            var2.append(var1);
            throw new AndroidRuntimeException(var2.toString());
         }

         this.V = false;
      } else {
         this.V = true;
      }

      return this;
   }

   public p r0(long var1) {
      return (p)super.d0(var1);
   }

   protected void s(ViewGroup var1, s var2, s var3, ArrayList var4, ArrayList var5) {
      long var10 = this.C();
      int var7 = this.U.size();

      for(int var6 = 0; var6 < var7; ++var6) {
         l var12 = (l)this.U.get(var6);
         if (var10 > 0L && (this.V || var6 == 0)) {
            long var8 = var12.C();
            if (var8 > 0L) {
               var12.d0(var8 + var10);
            } else {
               var12.d0(var10);
            }
         }

         var12.s(var1, var2, var3, var4, var5);
      }

   }

   static class b extends m {
      p a;

      b(p var1) {
         this.a = var1;
      }

      public void c(l var1) {
         p var3 = this.a;
         int var2 = var3.W - 1;
         var3.W = var2;
         if (var2 == 0) {
            var3.X = false;
            var3.t();
         }

         var1.T(this);
      }

      public void d(l var1) {
         p var2 = this.a;
         if (!var2.X) {
            var2.e0();
            this.a.X = true;
         }

      }
   }
}
