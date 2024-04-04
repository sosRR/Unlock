package r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.o;

public class d {
   private HashSet a = null;
   private int b;
   private boolean c;
   public final e d;
   public final b e;
   public d f;
   public int g = 0;
   int h = Integer.MIN_VALUE;
   o.i i;

   public d(e var1, b var2) {
      this.d = var1;
      this.e = var2;
   }

   public boolean a(d var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         this.p();
         return true;
      } else if (!var4 && !this.o(var1)) {
         return false;
      } else {
         this.f = var1;
         if (var1.a == null) {
            var1.a = new HashSet();
         }

         HashSet var5 = this.f.a;
         if (var5 != null) {
            var5.add(this);
         }

         this.g = var2;
         this.h = var3;
         return true;
      }
   }

   public void b(int var1, ArrayList var2, o var3) {
      HashSet var4 = this.a;
      if (var4 != null) {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            s.i.a(((d)var5.next()).d, var1, var2, var3);
         }
      }

   }

   public HashSet c() {
      return this.a;
   }

   public int d() {
      return !this.c ? 0 : this.b;
   }

   public int e() {
      if (this.d.T() == 8) {
         return 0;
      } else {
         if (this.h != Integer.MIN_VALUE) {
            d var1 = this.f;
            if (var1 != null && var1.d.T() == 8) {
               return this.h;
            }
         }

         return this.g;
      }
   }

   public final d f() {
      switch (null.a[this.e.ordinal()]) {
         case 1:
         case 6:
         case 7:
         case 8:
         case 9:
            return null;
         case 2:
            return this.d.Q;
         case 3:
            return this.d.O;
         case 4:
            return this.d.R;
         case 5:
            return this.d.P;
         default:
            throw new AssertionError(this.e.name());
      }
   }

   public e g() {
      return this.d;
   }

   public o.i h() {
      return this.i;
   }

   public d i() {
      return this.f;
   }

   public b j() {
      return this.e;
   }

   public boolean k() {
      HashSet var1 = this.a;
      if (var1 == null) {
         return false;
      } else {
         Iterator var2 = var1.iterator();

         do {
            if (!var2.hasNext()) {
               return false;
            }
         } while(!((d)var2.next()).f().n());

         return true;
      }
   }

   public boolean l() {
      HashSet var2 = this.a;
      boolean var1 = false;
      if (var2 == null) {
         return false;
      } else {
         if (var2.size() > 0) {
            var1 = true;
         }

         return var1;
      }
   }

   public boolean m() {
      return this.c;
   }

   public boolean n() {
      boolean var1;
      if (this.f != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean o(d var1) {
      boolean var4 = false;
      boolean var3 = false;
      boolean var5 = false;
      if (var1 == null) {
         return false;
      } else {
         b var6 = var1.j();
         b var7 = this.e;
         if (var6 == var7) {
            return var7 != d.b.r || var1.g().X() && this.g().X();
         } else {
            boolean var2;
            switch (null.a[var7.ordinal()]) {
               case 1:
                  var2 = var3;
                  if (var6 != d.b.r) {
                     var2 = var3;
                     if (var6 != d.b.t) {
                        var2 = var3;
                        if (var6 != d.b.u) {
                           var2 = true;
                        }
                     }
                  }

                  return var2;
               case 2:
               case 3:
                  if (var6 != d.b.n && var6 != d.b.p) {
                     var2 = false;
                  } else {
                     var2 = true;
                  }

                  var3 = var2;
                  if (var1.g() instanceof g) {
                     label84: {
                        if (!var2) {
                           var2 = var4;
                           if (var6 != d.b.t) {
                              break label84;
                           }
                        }

                        var2 = true;
                     }

                     var3 = var2;
                  }

                  return var3;
               case 4:
               case 5:
                  if (var6 != d.b.o && var6 != d.b.q) {
                     var2 = false;
                  } else {
                     var2 = true;
                  }

                  var3 = var2;
                  if (var1.g() instanceof g) {
                     label68: {
                        if (!var2) {
                           var2 = var5;
                           if (var6 != d.b.u) {
                              break label68;
                           }
                        }

                        var2 = true;
                     }

                     var3 = var2;
                  }

                  return var3;
               case 6:
                  if (var6 != d.b.n && var6 != d.b.p) {
                     return true;
                  }

                  return false;
               case 7:
               case 8:
               case 9:
                  return false;
               default:
                  throw new AssertionError(this.e.name());
            }
         }
      }
   }

   public void p() {
      d var1 = this.f;
      if (var1 != null) {
         HashSet var2 = var1.a;
         if (var2 != null) {
            var2.remove(this);
            if (this.f.a.size() == 0) {
               this.f.a = null;
            }
         }
      }

      this.a = null;
      this.f = null;
      this.g = 0;
      this.h = Integer.MIN_VALUE;
      this.c = false;
      this.b = 0;
   }

   public void q() {
      this.c = false;
      this.b = 0;
   }

   public void r(o.c var1) {
      o.i var2 = this.i;
      if (var2 == null) {
         this.i = new o.i(o.i.a.m, (String)null);
      } else {
         var2.h();
      }

   }

   public void s(int var1) {
      this.b = var1;
      this.c = true;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.d.r());
      var1.append(":");
      var1.append(this.e.toString());
      return var1.toString();
   }

   public static enum b {
      m,
      n,
      o,
      p,
      q,
      r,
      s,
      t,
      u;

      private static final b[] v;

      static {
         b var0 = new b("NONE", 0);
         m = var0;
         b var7 = new b("LEFT", 1);
         n = var7;
         b var8 = new b("TOP", 2);
         o = var8;
         b var5 = new b("RIGHT", 3);
         p = var5;
         b var6 = new b("BOTTOM", 4);
         q = var6;
         b var2 = new b("BASELINE", 5);
         r = var2;
         b var4 = new b("CENTER", 6);
         s = var4;
         b var1 = new b("CENTER_X", 7);
         t = var1;
         b var3 = new b("CENTER_Y", 8);
         u = var3;
         v = new b[]{var0, var7, var8, var5, var6, var2, var4, var1, var3};
      }
   }
}
