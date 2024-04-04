package f1;

import java.util.List;
import java.util.UUID;

public final class p {
   private static final String s = x0.k.f("WorkSpec");
   public static final l.a t = new p$a();
   public String a;
   public x0.u.a b;
   public String c;
   public String d;
   public androidx.work.b e;
   public androidx.work.b f;
   public long g;
   public long h;
   public long i;
   public x0.b j;
   public int k;
   public x0.a l;
   public long m;
   public long n;
   public long o;
   public long p;
   public boolean q;
   public x0.o r;

   public p(p var1) {
      this.b = x0.u.a.m;
      androidx.work.b var2 = androidx.work.b.c;
      this.e = var2;
      this.f = var2;
      this.j = x0.b.i;
      this.l = x0.a.m;
      this.m = 30000L;
      this.p = -1L;
      this.r = x0.o.m;
      this.a = var1.a;
      this.c = var1.c;
      this.b = var1.b;
      this.d = var1.d;
      this.e = new androidx.work.b(var1.e);
      this.f = new androidx.work.b(var1.f);
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = new x0.b(var1.j);
      this.k = var1.k;
      this.l = var1.l;
      this.m = var1.m;
      this.n = var1.n;
      this.o = var1.o;
      this.p = var1.p;
      this.q = var1.q;
      this.r = var1.r;
   }

   public p(String var1, String var2) {
      this.b = x0.u.a.m;
      androidx.work.b var3 = androidx.work.b.c;
      this.e = var3;
      this.f = var3;
      this.j = x0.b.i;
      this.l = x0.a.m;
      this.m = 30000L;
      this.p = -1L;
      this.r = x0.o.m;
      this.a = var1;
      this.c = var2;
   }

   public long a() {
      boolean var13 = this.c();
      boolean var2 = false;
      boolean var1 = false;
      long var3;
      if (var13) {
         if (this.l == x0.a.n) {
            var1 = true;
         }

         if (var1) {
            var3 = this.m * (long)this.k;
         } else {
            var3 = (long)Math.scalb((float)this.m, this.k - 1);
         }

         return this.n + Math.min(18000000L, var3);
      } else {
         var13 = this.d();
         long var5 = 0L;
         if (var13) {
            var3 = System.currentTimeMillis();
            long var7 = this.n;
            if (var7 == 0L) {
               var3 += this.g;
            } else {
               var3 = var7;
            }

            long var11 = this.i;
            long var9 = this.h;
            var1 = var2;
            if (var11 != var9) {
               var1 = true;
            }

            if (var1) {
               if (var7 == 0L) {
                  var5 = var11 * -1L;
               }

               return var3 + var9 + var5;
            } else {
               if (var7 != 0L) {
                  var5 = var9;
               }

               return var3 + var5;
            }
         } else {
            var5 = this.n;
            var3 = var5;
            if (var5 == 0L) {
               var3 = System.currentTimeMillis();
            }

            return var3 + this.g;
         }
      }
   }

   public boolean b() {
      return x0.b.i.equals(this.j) ^ true;
   }

   public boolean c() {
      boolean var1;
      if (this.b == x0.u.a.m && this.k > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean d() {
      boolean var1;
      if (this.h != 0L) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void e(long var1) {
      long var3 = var1;
      if (var1 < 900000L) {
         x0.k.c().h(s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}));
         var3 = 900000L;
      }

      this.f(var3, var3);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (var1 != null && p.class == var1.getClass()) {
         p var4 = (p)var1;
         if (this.g != var4.g) {
            return false;
         } else if (this.h != var4.h) {
            return false;
         } else if (this.i != var4.i) {
            return false;
         } else if (this.k != var4.k) {
            return false;
         } else if (this.m != var4.m) {
            return false;
         } else if (this.n != var4.n) {
            return false;
         } else if (this.o != var4.o) {
            return false;
         } else if (this.p != var4.p) {
            return false;
         } else if (this.q != var4.q) {
            return false;
         } else if (!this.a.equals(var4.a)) {
            return false;
         } else if (this.b != var4.b) {
            return false;
         } else if (!this.c.equals(var4.c)) {
            return false;
         } else {
            String var3 = this.d;
            if (var3 != null) {
               if (!var3.equals(var4.d)) {
                  return false;
               }
            } else if (var4.d != null) {
               return false;
            }

            if (!this.e.equals(var4.e)) {
               return false;
            } else if (!this.f.equals(var4.f)) {
               return false;
            } else if (!this.j.equals(var4.j)) {
               return false;
            } else if (this.l != var4.l) {
               return false;
            } else {
               if (this.r != var4.r) {
                  var2 = false;
               }

               return var2;
            }
         }
      } else {
         return false;
      }
   }

   public void f(long var1, long var3) {
      long var5 = var1;
      if (var1 < 900000L) {
         x0.k.c().h(s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}));
         var5 = 900000L;
      }

      var1 = var3;
      if (var3 < 300000L) {
         x0.k.c().h(s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}));
         var1 = 300000L;
      }

      var3 = var1;
      if (var1 > var5) {
         x0.k.c().h(s, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{var5}));
         var3 = var5;
      }

      this.h = var5;
      this.i = var3;
   }

   public int hashCode() {
      int var2 = this.a.hashCode();
      int var3 = this.b.hashCode();
      int var4 = this.c.hashCode();
      String var18 = this.d;
      int var1;
      if (var18 != null) {
         var1 = var18.hashCode();
      } else {
         var1 = 0;
      }

      int var9 = this.e.hashCode();
      int var8 = this.f.hashCode();
      long var16 = this.g;
      int var10 = (int)(var16 ^ var16 >>> 32);
      var16 = this.h;
      int var7 = (int)(var16 ^ var16 >>> 32);
      var16 = this.i;
      int var12 = (int)(var16 ^ var16 >>> 32);
      int var14 = this.j.hashCode();
      int var15 = this.k;
      int var5 = this.l.hashCode();
      var16 = this.m;
      int var13 = (int)(var16 ^ var16 >>> 32);
      var16 = this.n;
      int var11 = (int)(var16 ^ var16 >>> 32);
      var16 = this.o;
      int var6 = (int)(var16 ^ var16 >>> 32);
      var16 = this.p;
      return ((((((((((((((((var2 * 31 + var3) * 31 + var4) * 31 + var1) * 31 + var9) * 31 + var8) * 31 + var10) * 31 + var7) * 31 + var12) * 31 + var14) * 31 + var15) * 31 + var5) * 31 + var13) * 31 + var11) * 31 + var6) * 31 + (int)(var16 ^ var16 >>> 32)) * 31 + this.q) * 31 + this.r.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("{WorkSpec: ");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   public static class b {
      public String a;
      public x0.u.a b;

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (!(var1 instanceof b)) {
            return false;
         } else {
            b var2 = (b)var1;
            return this.b != var2.b ? false : this.a.equals(var2.a);
         }
      }

      public int hashCode() {
         return this.a.hashCode() * 31 + this.b.hashCode();
      }
   }

   public static class c {
      public String a;
      public x0.u.a b;
      public androidx.work.b c;
      public int d;
      public List e;
      public List f;

      public x0.u a() {
         List var1 = this.f;
         androidx.work.b var2;
         if (var1 != null && !var1.isEmpty()) {
            var2 = (androidx.work.b)this.f.get(0);
         } else {
            var2 = androidx.work.b.c;
         }

         return new x0.u(UUID.fromString(this.a), this.b, this.c, this.e, var2, this.d);
      }

      public boolean equals(Object var1) {
         boolean var2 = true;
         if (this == var1) {
            return true;
         } else if (!(var1 instanceof c)) {
            return false;
         } else {
            c var4 = (c)var1;
            if (this.d != var4.d) {
               return false;
            } else {
               label59: {
                  String var3 = this.a;
                  if (var3 != null) {
                     if (var3.equals(var4.a)) {
                        break label59;
                     }
                  } else if (var4.a == null) {
                     break label59;
                  }

                  return false;
               }

               if (this.b != var4.b) {
                  return false;
               } else {
                  androidx.work.b var6 = this.c;
                  if (var6 != null) {
                     if (!var6.equals(var4.c)) {
                        return false;
                     }
                  } else if (var4.c != null) {
                     return false;
                  }

                  List var7;
                  label44: {
                     var7 = this.e;
                     if (var7 != null) {
                        if (var7.equals(var4.e)) {
                           break label44;
                        }
                     } else if (var4.e == null) {
                        break label44;
                     }

                     return false;
                  }

                  var7 = this.f;
                  List var5 = var4.f;
                  if (var7 != null) {
                     var2 = var7.equals(var5);
                  } else if (var5 != null) {
                     var2 = false;
                  }

                  return var2;
               }
            }
         }
      }

      public int hashCode() {
         String var7 = this.a;
         int var5 = 0;
         int var1;
         if (var7 != null) {
            var1 = var7.hashCode();
         } else {
            var1 = 0;
         }

         x0.u.a var8 = this.b;
         int var2;
         if (var8 != null) {
            var2 = var8.hashCode();
         } else {
            var2 = 0;
         }

         androidx.work.b var9 = this.c;
         int var3;
         if (var9 != null) {
            var3 = var9.hashCode();
         } else {
            var3 = 0;
         }

         int var6 = this.d;
         List var10 = this.e;
         int var4;
         if (var10 != null) {
            var4 = var10.hashCode();
         } else {
            var4 = 0;
         }

         var10 = this.f;
         if (var10 != null) {
            var5 = var10.hashCode();
         }

         return ((((var1 * 31 + var2) * 31 + var3) * 31 + var6) * 31 + var4) * 31 + var5;
      }
   }
}
