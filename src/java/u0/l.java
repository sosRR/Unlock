package u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class l implements Cloneable {
   private static final int[] R = new int[]{2, 1, 3, 4};
   private static final g S = new l$a();
   private static ThreadLocal T = new ThreadLocal();
   private ArrayList A = null;
   private s B = new s();
   private s C = new s();
   p D = null;
   private int[] E;
   private ArrayList F;
   private ArrayList G;
   boolean H;
   ArrayList I;
   private int J;
   private boolean K;
   private boolean L;
   private ArrayList M;
   private ArrayList N;
   private e O;
   private n.a P;
   private g Q;
   private String m = this.getClass().getName();
   private long n = -1L;
   long o = -1L;
   private TimeInterpolator p = null;
   ArrayList q = new ArrayList();
   ArrayList r = new ArrayList();
   private ArrayList s = null;
   private ArrayList t = null;
   private ArrayList u = null;
   private ArrayList v = null;
   private ArrayList w = null;
   private ArrayList x = null;
   private ArrayList y = null;
   private ArrayList z = null;

   public l() {
      this.E = R;
      this.H = false;
      this.I = new ArrayList();
      this.J = 0;
      this.K = false;
      this.L = false;
      this.M = null;
      this.N = new ArrayList();
      this.Q = S;
   }

   private static n.a B() {
      n.a var1 = (n.a)T.get();
      n.a var0 = var1;
      if (var1 == null) {
         var0 = new n.a();
         T.set(var0);
      }

      return var0;
   }

   private static boolean L(r var0, r var1, String var2) {
      Object var4 = var0.a.get(var2);
      Object var5 = var1.a.get(var2);
      boolean var3;
      if (var4 == null && var5 == null) {
         var3 = false;
      } else if (var4 != null && var5 != null) {
         var3 = var4.equals(var5) ^ true;
      } else {
         var3 = true;
      }

      return var3;
   }

   private void M(n.a var1, n.a var2, SparseArray var3, SparseArray var4) {
      int var6 = var3.size();

      for(int var5 = 0; var5 < var6; ++var5) {
         View var10 = (View)var3.valueAt(var5);
         if (var10 != null && this.K(var10)) {
            View var9 = (View)var4.get(var3.keyAt(var5));
            if (var9 != null && this.K(var9)) {
               r var8 = (r)var1.get(var10);
               r var7 = (r)var2.get(var9);
               if (var8 != null && var7 != null) {
                  this.F.add(var8);
                  this.G.add(var7);
                  var1.remove(var10);
                  var2.remove(var9);
               }
            }
         }
      }

   }

   private void N(n.a var1, n.a var2) {
      for(int var3 = var1.size() - 1; var3 >= 0; --var3) {
         View var4 = (View)var1.i(var3);
         if (var4 != null && this.K(var4)) {
            r var6 = (r)var2.remove(var4);
            if (var6 != null && this.K(var6.b)) {
               r var5 = (r)var1.k(var3);
               this.F.add(var5);
               this.G.add(var6);
            }
         }
      }

   }

   private void O(n.a var1, n.a var2, n.d var3, n.d var4) {
      int var6 = var3.o();

      for(int var5 = 0; var5 < var6; ++var5) {
         View var7 = (View)var3.p(var5);
         if (var7 != null && this.K(var7)) {
            View var10 = (View)var4.h(var3.k(var5));
            if (var10 != null && this.K(var10)) {
               r var9 = (r)var1.get(var7);
               r var8 = (r)var2.get(var10);
               if (var9 != null && var8 != null) {
                  this.F.add(var9);
                  this.G.add(var8);
                  var1.remove(var7);
                  var2.remove(var10);
               }
            }
         }
      }

   }

   private void P(n.a var1, n.a var2, n.a var3, n.a var4) {
      int var6 = var3.size();

      for(int var5 = 0; var5 < var6; ++var5) {
         View var9 = (View)var3.m(var5);
         if (var9 != null && this.K(var9)) {
            View var8 = (View)var4.get(var3.i(var5));
            if (var8 != null && this.K(var8)) {
               r var7 = (r)var1.get(var9);
               r var10 = (r)var2.get(var8);
               if (var7 != null && var10 != null) {
                  this.F.add(var7);
                  this.G.add(var10);
                  var1.remove(var9);
                  var2.remove(var8);
               }
            }
         }
      }

   }

   private void Q(s var1, s var2) {
      n.a var6 = new n.a(var1.a);
      n.a var5 = new n.a(var2.a);
      int var3 = 0;

      while(true) {
         int[] var7 = this.E;
         if (var3 >= var7.length) {
            this.e(var6, var5);
            return;
         }

         int var4 = var7[var3];
         if (var4 != 1) {
            if (var4 != 2) {
               if (var4 != 3) {
                  if (var4 == 4) {
                     this.O(var6, var5, var1.c, var2.c);
                  }
               } else {
                  this.M(var6, var5, var1.b, var2.b);
               }
            } else {
               this.P(var6, var5, var1.d, var2.d);
            }
         } else {
            this.N(var6, var5);
         }

         ++var3;
      }
   }

   private void W(Animator var1, n.a var2) {
      if (var1 != null) {
         var1.addListener(new AnimatorListenerAdapter(this, var2) {
            final n.a a;
            final l b;

            {
               this.b = var1;
               this.a = var2;
            }

            public void onAnimationEnd(Animator var1) {
               this.a.remove(var1);
               this.b.I.remove(var1);
            }

            public void onAnimationStart(Animator var1) {
               this.b.I.add(var1);
            }
         });
         this.i(var1);
      }

   }

   private void e(n.a var1, n.a var2) {
      byte var5 = 0;
      int var3 = 0;

      while(true) {
         int var4 = var5;
         if (var3 >= var1.size()) {
            for(; var4 < var2.size(); ++var4) {
               r var7 = (r)var2.m(var4);
               if (this.K(var7.b)) {
                  this.G.add(var7);
                  this.F.add((Object)null);
               }
            }

            return;
         }

         r var6 = (r)var1.m(var3);
         if (this.K(var6.b)) {
            this.F.add(var6);
            this.G.add((Object)null);
         }

         ++var3;
      }
   }

   private static void h(s var0, View var1, r var2) {
      var0.a.put(var1, var2);
      int var3 = var1.getId();
      if (var3 >= 0) {
         if (var0.b.indexOfKey(var3) >= 0) {
            var0.b.put(var3, (Object)null);
         } else {
            var0.b.put(var3, var1);
         }
      }

      String var6 = androidx.core.view.d0.J(var1);
      if (var6 != null) {
         if (var0.d.containsKey(var6)) {
            var0.d.put(var6, (Object)null);
         } else {
            var0.d.put(var6, var1);
         }
      }

      if (var1.getParent() instanceof ListView) {
         ListView var7 = (ListView)var1.getParent();
         if (var7.getAdapter().hasStableIds()) {
            long var4 = var7.getItemIdAtPosition(var7.getPositionForView(var1));
            if (var0.c.j(var4) >= 0) {
               var1 = (View)var0.c.h(var4);
               if (var1 != null) {
                  androidx.core.view.d0.x0(var1, false);
                  var0.c.l(var4, (Object)null);
               }
            } else {
               androidx.core.view.d0.x0(var1, true);
               var0.c.l(var4, var1);
            }
         }
      }

   }

   private void l(View var1, boolean var2) {
      if (var1 != null) {
         int var6 = var1.getId();
         ArrayList var7 = this.u;
         if (var7 == null || !var7.contains(var6)) {
            var7 = this.v;
            if (var7 == null || !var7.contains(var1)) {
               var7 = this.w;
               byte var4 = 0;
               int var3;
               int var5;
               if (var7 != null) {
                  var5 = var7.size();

                  for(var3 = 0; var3 < var5; ++var3) {
                     if (((Class)this.w.get(var3)).isInstance(var1)) {
                        return;
                     }
                  }
               }

               if (var1.getParent() instanceof ViewGroup) {
                  r var9 = new r(var1);
                  if (var2) {
                     this.n(var9);
                  } else {
                     this.k(var9);
                  }

                  var9.c.add(this);
                  this.m(var9);
                  if (var2) {
                     h(this.B, var1, var9);
                  } else {
                     h(this.C, var1, var9);
                  }
               }

               if (var1 instanceof ViewGroup) {
                  var7 = this.y;
                  if (var7 != null && var7.contains(var6)) {
                     return;
                  }

                  var7 = this.z;
                  if (var7 != null && var7.contains(var1)) {
                     return;
                  }

                  var7 = this.A;
                  if (var7 != null) {
                     var5 = var7.size();

                     for(var3 = 0; var3 < var5; ++var3) {
                        if (((Class)this.A.get(var3)).isInstance(var1)) {
                           return;
                        }
                     }
                  }

                  ViewGroup var8 = (ViewGroup)var1;

                  for(var3 = var4; var3 < var8.getChildCount(); ++var3) {
                     this.l(var8.getChildAt(var3), var2);
                  }
               }

            }
         }
      }
   }

   public o A() {
      return null;
   }

   public long C() {
      return this.n;
   }

   public List D() {
      return this.q;
   }

   public List E() {
      return this.s;
   }

   public List F() {
      return this.t;
   }

   public List G() {
      return this.r;
   }

   public String[] H() {
      return null;
   }

   public r I(View var1, boolean var2) {
      p var3 = this.D;
      if (var3 != null) {
         return var3.I(var1, var2);
      } else {
         s var4;
         if (var2) {
            var4 = this.B;
         } else {
            var4 = this.C;
         }

         return (r)var4.a.get(var1);
      }
   }

   public boolean J(r var1, r var2) {
      boolean var6 = false;
      boolean var5 = var6;
      if (var1 != null) {
         var5 = var6;
         if (var2 != null) {
            String[] var7 = this.H();
            if (var7 != null) {
               int var4 = var7.length;
               int var3 = 0;

               while(true) {
                  var5 = var6;
                  if (var3 >= var4) {
                     return var5;
                  }

                  if (L(var1, var2, var7[var3])) {
                     break;
                  }

                  ++var3;
               }
            } else {
               Iterator var8 = var1.a.keySet().iterator();

               do {
                  var5 = var6;
                  if (!var8.hasNext()) {
                     return var5;
                  }
               } while(!L(var1, var2, (String)var8.next()));
            }

            var5 = true;
         }
      }

      return var5;
   }

   boolean K(View var1) {
      int var3 = var1.getId();
      ArrayList var5 = this.u;
      if (var5 != null && var5.contains(var3)) {
         return false;
      } else {
         var5 = this.v;
         if (var5 != null && var5.contains(var1)) {
            return false;
         } else {
            var5 = this.w;
            int var2;
            if (var5 != null) {
               int var4 = var5.size();

               for(var2 = 0; var2 < var4; ++var2) {
                  if (((Class)this.w.get(var2)).isInstance(var1)) {
                     return false;
                  }
               }
            }

            if (this.x != null && androidx.core.view.d0.J(var1) != null && this.x.contains(androidx.core.view.d0.J(var1))) {
               return false;
            } else {
               if (this.q.size() == 0 && this.r.size() == 0) {
                  var5 = this.t;
                  if (var5 == null || var5.isEmpty()) {
                     var5 = this.s;
                     if (var5 == null || var5.isEmpty()) {
                        return true;
                     }
                  }
               }

               if (!this.q.contains(var3) && !this.r.contains(var1)) {
                  var5 = this.s;
                  if (var5 != null && var5.contains(androidx.core.view.d0.J(var1))) {
                     return true;
                  } else {
                     if (this.t != null) {
                        for(var2 = 0; var2 < this.t.size(); ++var2) {
                           if (((Class)this.t.get(var2)).isInstance(var1)) {
                              return true;
                           }
                        }
                     }

                     return false;
                  }
               } else {
                  return true;
               }
            }
         }
      }
   }

   public void R(View var1) {
      if (!this.L) {
         int var2;
         for(var2 = this.I.size() - 1; var2 >= 0; --var2) {
            a.b((Animator)this.I.get(var2));
         }

         ArrayList var4 = this.M;
         if (var4 != null && var4.size() > 0) {
            var4 = (ArrayList)this.M.clone();
            int var3 = var4.size();

            for(var2 = 0; var2 < var3; ++var2) {
               ((f)var4.get(var2)).a(this);
            }
         }

         this.K = true;
      }

   }

   void S(ViewGroup var1) {
      this.F = new ArrayList();
      this.G = new ArrayList();
      this.Q(this.B, this.C);
      n.a var9 = B();
      int var2 = var9.size();
      o0 var10 = u0.z.d(var1);
      --var2;

      for(; var2 >= 0; --var2) {
         Animator var6 = (Animator)var9.i(var2);
         if (var6 != null) {
            d var7 = (d)var9.get(var6);
            if (var7 != null && var7.a != null && var10.equals(var7.d)) {
               r var8 = var7.c;
               View var12 = var7.a;
               r var11 = this.I(var12, true);
               r var5 = this.x(var12, true);
               r var4 = var5;
               if (var11 == null) {
                  var4 = var5;
                  if (var5 == null) {
                     var4 = (r)this.C.a.get(var12);
                  }
               }

               boolean var3;
               if ((var11 != null || var4 != null) && var7.e.J(var8, var4)) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               if (var3) {
                  if (!var6.isRunning() && !var6.isStarted()) {
                     var9.remove(var6);
                  } else {
                     var6.cancel();
                  }
               }
            }
         }
      }

      this.s(var1, this.B, this.C, this.F, this.G);
      this.X();
   }

   public l T(f var1) {
      ArrayList var2 = this.M;
      if (var2 == null) {
         return this;
      } else {
         var2.remove(var1);
         if (this.M.size() == 0) {
            this.M = null;
         }

         return this;
      }
   }

   public l U(View var1) {
      this.r.remove(var1);
      return this;
   }

   public void V(View var1) {
      if (this.K) {
         if (!this.L) {
            int var2;
            for(var2 = this.I.size() - 1; var2 >= 0; --var2) {
               a.c((Animator)this.I.get(var2));
            }

            ArrayList var4 = this.M;
            if (var4 != null && var4.size() > 0) {
               var4 = (ArrayList)this.M.clone();
               int var3 = var4.size();

               for(var2 = 0; var2 < var3; ++var2) {
                  ((f)var4.get(var2)).b(this);
               }
            }
         }

         this.K = false;
      }

   }

   protected void X() {
      this.e0();
      n.a var1 = B();
      Iterator var2 = this.N.iterator();

      while(var2.hasNext()) {
         Animator var3 = (Animator)var2.next();
         if (var1.containsKey(var3)) {
            this.e0();
            this.W(var3, var1);
         }
      }

      this.N.clear();
      this.t();
   }

   public l Y(long var1) {
      this.o = var1;
      return this;
   }

   public void Z(e var1) {
      this.O = var1;
   }

   public l a(f var1) {
      if (this.M == null) {
         this.M = new ArrayList();
      }

      this.M.add(var1);
      return this;
   }

   public l a0(TimeInterpolator var1) {
      this.p = var1;
      return this;
   }

   public void b0(g var1) {
      if (var1 == null) {
         this.Q = S;
      } else {
         this.Q = var1;
      }

   }

   public void c0(o var1) {
   }

   public l d(View var1) {
      this.r.add(var1);
      return this;
   }

   public l d0(long var1) {
      this.n = var1;
      return this;
   }

   protected void e0() {
      if (this.J == 0) {
         ArrayList var3 = this.M;
         if (var3 != null && var3.size() > 0) {
            var3 = (ArrayList)this.M.clone();
            int var2 = var3.size();

            for(int var1 = 0; var1 < var2; ++var1) {
               ((f)var3.get(var1)).d(this);
            }
         }

         this.L = false;
      }

      ++this.J;
   }

   String f0(String var1) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1);
      var4.append(this.getClass().getSimpleName());
      var4.append("@");
      var4.append(Integer.toHexString(this.hashCode()));
      var4.append(": ");
      var1 = var4.toString();
      String var6 = var1;
      if (this.o != -1L) {
         var4 = new StringBuilder();
         var4.append(var1);
         var4.append("dur(");
         var4.append(this.o);
         var4.append(") ");
         var6 = var4.toString();
      }

      var1 = var6;
      StringBuilder var5;
      if (this.n != -1L) {
         var5 = new StringBuilder();
         var5.append(var6);
         var5.append("dly(");
         var5.append(this.n);
         var5.append(") ");
         var1 = var5.toString();
      }

      var6 = var1;
      if (this.p != null) {
         var4 = new StringBuilder();
         var4.append(var1);
         var4.append("interp(");
         var4.append(this.p);
         var4.append(") ");
         var6 = var4.toString();
      }

      if (this.q.size() <= 0) {
         var1 = var6;
         if (this.r.size() <= 0) {
            return var1;
         }
      }

      var5 = new StringBuilder();
      var5.append(var6);
      var5.append("tgts(");
      var6 = var5.toString();
      int var2 = this.q.size();
      byte var3 = 0;
      var1 = var6;
      if (var2 > 0) {
         var2 = 0;

         while(true) {
            var1 = var6;
            if (var2 >= this.q.size()) {
               break;
            }

            var1 = var6;
            if (var2 > 0) {
               var5 = new StringBuilder();
               var5.append(var6);
               var5.append(", ");
               var1 = var5.toString();
            }

            var4 = new StringBuilder();
            var4.append(var1);
            var4.append(this.q.get(var2));
            var6 = var4.toString();
            ++var2;
         }
      }

      var6 = var1;
      if (this.r.size() > 0) {
         var2 = var3;

         while(true) {
            var6 = var1;
            if (var2 >= this.r.size()) {
               break;
            }

            var6 = var1;
            if (var2 > 0) {
               var4 = new StringBuilder();
               var4.append(var1);
               var4.append(", ");
               var6 = var4.toString();
            }

            var5 = new StringBuilder();
            var5.append(var6);
            var5.append(this.r.get(var2));
            var1 = var5.toString();
            ++var2;
         }
      }

      var5 = new StringBuilder();
      var5.append(var6);
      var5.append(")");
      var1 = var5.toString();
      return var1;
   }

   protected void i(Animator var1) {
      if (var1 == null) {
         this.t();
      } else {
         if (this.u() >= 0L) {
            var1.setDuration(this.u());
         }

         if (this.C() >= 0L) {
            var1.setStartDelay(this.C() + var1.getStartDelay());
         }

         if (this.w() != null) {
            var1.setInterpolator(this.w());
         }

         var1.addListener(new AnimatorListenerAdapter(this) {
            final l a;

            {
               this.a = var1;
            }

            public void onAnimationEnd(Animator var1) {
               this.a.t();
               var1.removeListener(this);
            }
         });
         var1.start();
      }

   }

   protected void j() {
      int var1;
      for(var1 = this.I.size() - 1; var1 >= 0; --var1) {
         ((Animator)this.I.get(var1)).cancel();
      }

      ArrayList var3 = this.M;
      if (var3 != null && var3.size() > 0) {
         var3 = (ArrayList)this.M.clone();
         int var2 = var3.size();

         for(var1 = 0; var1 < var2; ++var1) {
            ((f)var3.get(var1)).e(this);
         }
      }

   }

   public abstract void k(r var1);

   void m(r var1) {
   }

   public abstract void n(r var1);

   void o(ViewGroup var1, boolean var2) {
      int var3;
      byte var5;
      View var13;
      label98: {
         this.p(var2);
         var3 = this.q.size();
         var5 = 0;
         if (var3 > 0 || this.r.size() > 0) {
            ArrayList var7 = this.s;
            if (var7 == null || var7.isEmpty()) {
               var7 = this.t;
               if (var7 == null || var7.isEmpty()) {
                  for(var3 = 0; var3 < this.q.size(); ++var3) {
                     View var8 = var1.findViewById((Integer)this.q.get(var3));
                     if (var8 != null) {
                        r var12 = new r(var8);
                        if (var2) {
                           this.n(var12);
                        } else {
                           this.k(var12);
                        }

                        var12.c.add(this);
                        this.m(var12);
                        if (var2) {
                           h(this.B, var8, var12);
                        } else {
                           h(this.C, var8, var12);
                        }
                     }
                  }

                  var3 = 0;

                  while(true) {
                     if (var3 >= this.r.size()) {
                        break label98;
                     }

                     var13 = (View)this.r.get(var3);
                     r var9 = new r(var13);
                     if (var2) {
                        this.n(var9);
                     } else {
                        this.k(var9);
                     }

                     var9.c.add(this);
                     this.m(var9);
                     if (var2) {
                        h(this.B, var13, var9);
                     } else {
                        h(this.C, var13, var9);
                     }

                     ++var3;
                  }
               }
            }
         }

         this.l(var1, var2);
      }

      if (!var2) {
         n.a var10 = this.P;
         if (var10 != null) {
            int var6 = var10.size();
            ArrayList var11 = new ArrayList(var6);
            int var4 = 0;

            while(true) {
               var3 = var5;
               if (var4 >= var6) {
                  for(; var3 < var6; ++var3) {
                     var13 = (View)var11.get(var3);
                     if (var13 != null) {
                        String var15 = (String)this.P.m(var3);
                        this.B.d.put(var15, var13);
                     }
                  }
                  break;
               }

               String var14 = (String)this.P.i(var4);
               var11.add(this.B.d.remove(var14));
               ++var4;
            }
         }
      }

   }

   void p(boolean var1) {
      if (var1) {
         this.B.a.clear();
         this.B.b.clear();
         this.B.c.a();
      } else {
         this.C.a.clear();
         this.C.b.clear();
         this.C.c.a();
      }

   }

   public l q() {
      try {
         l var1 = (l)super.clone();
         ArrayList var2 = new ArrayList();
         var1.N = var2;
         s var4 = new s();
         var1.B = var4;
         var4 = new s();
         var1.C = var4;
         var1.F = null;
         var1.G = null;
         return var1;
      } catch (CloneNotSupportedException var3) {
         return null;
      }
   }

   public Animator r(ViewGroup var1, r var2, r var3) {
      return null;
   }

   protected void s(ViewGroup var1, s var2, s var3, ArrayList var4, ArrayList var5) {
      n.a var15 = B();
      SparseIntArray var14 = new SparseIntArray();
      int var7 = var4.size();

      int var6;
      for(var6 = 0; var6 < var7; ++var6) {
         r var11 = (r)var4.get(var6);
         r var19 = (r)var5.get(var6);
         r var10 = var11;
         if (var11 != null) {
            var10 = var11;
            if (!var11.c.contains(this)) {
               var10 = null;
            }
         }

         var11 = var19;
         if (var19 != null) {
            var11 = var19;
            if (!var19.c.contains(this)) {
               var11 = null;
            }
         }

         if (var10 != null || var11 != null) {
            boolean var8;
            if (var10 != null && var11 != null && !this.J(var10, var11)) {
               var8 = false;
            } else {
               var8 = true;
            }

            if (var8) {
               Animator var20 = this.r(var1, var10, var11);
               if (var20 != null) {
                  View var28;
                  if (var11 != null) {
                     View var12 = var11.b;
                     String[] var26 = this.H();
                     if (var26 != null && var26.length > 0) {
                        r var13 = new r(var12);
                        r var16 = (r)var3.a.get(var12);
                        Animator var23 = var20;
                        int var22;
                        if (var16 != null) {
                           var22 = 0;

                           while(true) {
                              var23 = var20;
                              if (var22 >= var26.length) {
                                 break;
                              }

                              Map var25 = var13.a;
                              String var17 = var26[var22];
                              var25.put(var17, var16.a.get(var17));
                              ++var22;
                           }
                        }

                        int var9 = var15.size();
                        var22 = 0;

                        while(true) {
                           if (var22 >= var9) {
                              var20 = var23;
                              var10 = var13;
                              break;
                           }

                           d var21 = (d)var15.get((Animator)var15.i(var22));
                           if (var21.c != null && var21.a == var12 && var21.b.equals(this.y()) && var21.c.equals(var13)) {
                              var20 = null;
                              var10 = var13;
                              break;
                           }

                           ++var22;
                        }
                     } else {
                        var10 = null;
                     }

                     var28 = var12;
                     var11 = var10;
                  } else {
                     var28 = var10.b;
                     var11 = null;
                  }

                  if (var20 != null) {
                     var15.put(var20, new d(var28, this.y(), this, u0.z.d(var1), var11));
                     this.N.add(var20);
                  }
               }
            }
         }
      }

      if (var14.size() != 0) {
         for(var6 = 0; var6 < var14.size(); ++var6) {
            var7 = var14.keyAt(var6);
            Animator var18 = (Animator)this.N.get(var7);
            var18.setStartDelay((long)var14.valueAt(var6) - Long.MAX_VALUE + var18.getStartDelay());
         }
      }

   }

   protected void t() {
      int var1 = this.J - 1;
      this.J = var1;
      if (var1 == 0) {
         ArrayList var3 = this.M;
         if (var3 != null && var3.size() > 0) {
            var3 = (ArrayList)this.M.clone();
            int var2 = var3.size();

            for(var1 = 0; var1 < var2; ++var1) {
               ((f)var3.get(var1)).c(this);
            }
         }

         View var4;
         for(var1 = 0; var1 < this.B.c.o(); ++var1) {
            var4 = (View)this.B.c.p(var1);
            if (var4 != null) {
               androidx.core.view.d0.x0(var4, false);
            }
         }

         for(var1 = 0; var1 < this.C.c.o(); ++var1) {
            var4 = (View)this.C.c.p(var1);
            if (var4 != null) {
               androidx.core.view.d0.x0(var4, false);
            }
         }

         this.L = true;
      }

   }

   public String toString() {
      return this.f0("");
   }

   public long u() {
      return this.o;
   }

   public e v() {
      return this.O;
   }

   public TimeInterpolator w() {
      return this.p;
   }

   r x(View var1, boolean var2) {
      p var5 = this.D;
      if (var5 != null) {
         return var5.x(var1, var2);
      } else {
         ArrayList var10;
         if (var2) {
            var10 = this.F;
         } else {
            var10 = this.G;
         }

         Object var6 = null;
         if (var10 == null) {
            return null;
         } else {
            int var4 = var10.size();
            int var3 = 0;

            while(true) {
               if (var3 >= var4) {
                  var3 = -1;
                  break;
               }

               r var7 = (r)var10.get(var3);
               if (var7 == null) {
                  return null;
               }

               if (var7.b == var1) {
                  break;
               }

               ++var3;
            }

            r var8 = (r)var6;
            if (var3 >= 0) {
               ArrayList var9;
               if (var2) {
                  var9 = this.G;
               } else {
                  var9 = this.F;
               }

               var8 = (r)var9.get(var3);
            }

            return var8;
         }
      }
   }

   public String y() {
      return this.m;
   }

   public g z() {
      return this.Q;
   }

   private static class d {
      View a;
      String b;
      r c;
      o0 d;
      l e;

      d(View var1, String var2, l var3, o0 var4, r var5) {
         this.a = var1;
         this.b = var2;
         this.c = var5;
         this.d = var4;
         this.e = var3;
      }
   }

   public abstract static class e {
   }

   public interface f {
      void a(l var1);

      void b(l var1);

      void c(l var1);

      void d(l var1);

      void e(l var1);
   }
}
