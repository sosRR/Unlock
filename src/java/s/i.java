package s;

import java.util.ArrayList;
import java.util.Iterator;

public class i {
   public static o a(r.e var0, int var1, ArrayList var2, o var3) {
      int var4;
      if (var1 == 0) {
         var4 = var0.I0;
      } else {
         var4 = var0.J0;
      }

      byte var6 = 0;
      int var5;
      o var7;
      if (var4 != -1 && (var3 == null || var4 != var3.b)) {
         var5 = 0;

         while(true) {
            var7 = var3;
            if (var5 >= var2.size()) {
               break;
            }

            var7 = (o)var2.get(var5);
            if (var7.c() == var4) {
               if (var3 != null) {
                  var3.g(var1, var7);
                  var2.remove(var3);
               }
               break;
            }

            ++var5;
         }
      } else {
         var7 = var3;
         if (var4 != -1) {
            return var3;
         }
      }

      var3 = var7;
      if (var7 == null) {
         var3 = var7;
         if (var0 instanceof r.i) {
            var5 = ((r.i)var0).p1(var1);
            var3 = var7;
            if (var5 != -1) {
               var4 = 0;

               while(true) {
                  var3 = var7;
                  if (var4 >= var2.size()) {
                     break;
                  }

                  var3 = (o)var2.get(var4);
                  if (var3.c() == var5) {
                     break;
                  }

                  ++var4;
               }
            }
         }

         var7 = var3;
         if (var3 == null) {
            var7 = new o(var1);
         }

         var2.add(var7);
         var3 = var7;
      }

      if (var3.a(var0)) {
         if (var0 instanceof r.g) {
            r.g var8 = (r.g)var0;
            r.d var10 = var8.o1();
            byte var9 = var6;
            if (var8.p1() == 0) {
               var9 = 1;
            }

            var10.b(var9, var2, var3);
         }

         if (var1 == 0) {
            var0.I0 = var3.c();
            var0.O.b(var1, var2, var3);
            var0.Q.b(var1, var2, var3);
         } else {
            var0.J0 = var3.c();
            var0.P.b(var1, var2, var3);
            var0.S.b(var1, var2, var3);
            var0.R.b(var1, var2, var3);
         }

         var0.V.b(var1, var2, var3);
      }

      return var3;
   }

   private static o b(ArrayList var0, int var1) {
      int var3 = var0.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         o var4 = (o)var0.get(var2);
         if (var1 == var4.b) {
            return var4;
         }
      }

      return null;
   }

   public static boolean c(r.f var0, b.b var1) {
      ArrayList var16 = var0.o1();
      int var3 = var16.size();

      int var2;
      r.e var5;
      for(var2 = 0; var2 < var3; ++var2) {
         var5 = (r.e)var16.get(var2);
         if (!d(var0.y(), var0.R(), var5.y(), var5.R())) {
            return false;
         }
      }

      var2 = 0;
      ArrayList var11 = null;
      ArrayList var21 = null;
      ArrayList var7 = null;
      ArrayList var6 = null;
      ArrayList var9 = null;

      boolean var4;
      ArrayList var8;
      ArrayList var10;
      ArrayList var15;
      r.i var28;
      for(var8 = null; var2 < var3; var8 = var15) {
         r.e var17 = (r.e)var16.get(var2);
         if (!d(var0.y(), var0.R(), var17.y(), var17.R())) {
            r.f.O1(0, var17, var1, var0.p1, b.a.k);
         }

         var4 = var17 instanceof r.g;
         ArrayList var13 = var11;
         ArrayList var12 = var7;
         if (var4) {
            r.g var14 = (r.g)var17;
            var10 = var7;
            if (var14.p1() == 0) {
               var10 = var7;
               if (var7 == null) {
                  var10 = new ArrayList();
               }

               var10.add(var14);
            }

            var13 = var11;
            var12 = var10;
            if (var14.p1() == 1) {
               var7 = var11;
               if (var11 == null) {
                  var7 = new ArrayList();
               }

               var7.add(var14);
               var12 = var10;
               var13 = var7;
            }
         }

         var7 = var21;
         var10 = var6;
         if (var17 instanceof r.i) {
            if (var17 instanceof r.a) {
               r.a var29 = (r.a)var17;
               var11 = var21;
               if (var29.u1() == 0) {
                  var11 = var21;
                  if (var21 == null) {
                     var11 = new ArrayList();
                  }

                  var11.add(var29);
               }

               var7 = var11;
               var10 = var6;
               if (var29.u1() == 1) {
                  var10 = var6;
                  if (var6 == null) {
                     var10 = new ArrayList();
                  }

                  var10.add(var29);
                  var7 = var11;
               }
            } else {
               var28 = (r.i)var17;
               var7 = var21;
               if (var21 == null) {
                  var7 = new ArrayList();
               }

               var7.add(var28);
               var10 = var6;
               if (var6 == null) {
                  var10 = new ArrayList();
               }

               var10.add(var28);
            }
         }

         ArrayList var30 = var9;
         if (var17.O.f == null) {
            var30 = var9;
            if (var17.Q.f == null) {
               var30 = var9;
               if (!var4) {
                  var30 = var9;
                  if (!(var17 instanceof r.a)) {
                     var21 = var9;
                     if (var9 == null) {
                        var21 = new ArrayList();
                     }

                     var21.add(var17);
                     var30 = var21;
                  }
               }
            }
         }

         var15 = var8;
         if (var17.P.f == null) {
            var15 = var8;
            if (var17.R.f == null) {
               var15 = var8;
               if (var17.S.f == null) {
                  var15 = var8;
                  if (!var4) {
                     var15 = var8;
                     if (!(var17 instanceof r.a)) {
                        var21 = var8;
                        if (var8 == null) {
                           var21 = new ArrayList();
                        }

                        var21.add(var17);
                        var15 = var21;
                     }
                  }
               }
            }
         }

         ++var2;
         var11 = var13;
         var21 = var7;
         var7 = var12;
         var6 = var10;
         var9 = var30;
      }

      var10 = new ArrayList();
      Iterator var18;
      if (var11 != null) {
         var18 = var11.iterator();

         while(var18.hasNext()) {
            a((r.g)var18.next(), 0, var10, (o)null);
         }
      }

      o var19;
      if (var21 != null) {
         Iterator var24 = var21.iterator();

         while(var24.hasNext()) {
            var28 = (r.i)var24.next();
            var19 = a(var28, 0, var10, (o)null);
            var28.o1(var10, 0, var19);
            var19.b(var10);
         }
      }

      r.d var20 = var0.m(r.d.b.n);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 0, var10, (o)null);
         }
      }

      var20 = var0.m(r.d.b.p);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 0, var10, (o)null);
         }
      }

      var20 = var0.m(r.d.b.s);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 0, var10, (o)null);
         }
      }

      if (var9 != null) {
         var18 = var9.iterator();

         while(var18.hasNext()) {
            a((r.e)var18.next(), 0, var10, (o)null);
         }
      }

      if (var7 != null) {
         var18 = var7.iterator();

         while(var18.hasNext()) {
            a((r.g)var18.next(), 1, var10, (o)null);
         }
      }

      o var22;
      if (var6 != null) {
         var18 = var6.iterator();

         while(var18.hasNext()) {
            r.i var25 = (r.i)var18.next();
            var22 = a(var25, 1, var10, (o)null);
            var25.o1(var10, 1, var22);
            var22.b(var10);
         }
      }

      var20 = var0.m(r.d.b.o);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 1, var10, (o)null);
         }
      }

      var20 = var0.m(r.d.b.r);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 1, var10, (o)null);
         }
      }

      var20 = var0.m(r.d.b.q);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 1, var10, (o)null);
         }
      }

      var20 = var0.m(r.d.b.s);
      if (var20.c() != null) {
         var18 = var20.c().iterator();

         while(var18.hasNext()) {
            a(((r.d)var18.next()).d, 1, var10, (o)null);
         }
      }

      if (var8 != null) {
         var18 = var8.iterator();

         while(var18.hasNext()) {
            a((r.e)var18.next(), 1, var10, (o)null);
         }
      }

      o var26;
      for(var2 = 0; var2 < var3; ++var2) {
         var5 = (r.e)var16.get(var2);
         if (var5.q0()) {
            var19 = b(var10, var5.I0);
            var26 = b(var10, var5.J0);
            if (var19 != null && var26 != null) {
               var19.g(0, var26);
               var26.i(2);
               var10.remove(var19);
            }
         }
      }

      if (var10.size() <= 1) {
         return false;
      } else {
         label216: {
            if (var0.y() == r.e.b.n) {
               Iterator var23 = var10.iterator();
               var19 = null;
               var2 = 0;

               while(var23.hasNext()) {
                  var26 = (o)var23.next();
                  if (var26.d() != 1) {
                     var26.h(false);
                     var3 = var26.f(var0.H1(), 0);
                     if (var3 > var2) {
                        var19 = var26;
                        var2 = var3;
                     }
                  }
               }

               if (var19 != null) {
                  var0.M0(r.e.b.m);
                  var0.h1(var2);
                  var19.h(true);
                  var26 = var19;
                  break label216;
               }
            }

            var26 = null;
         }

         label205: {
            if (var0.R() == r.e.b.n) {
               Iterator var27 = var10.iterator();
               var19 = null;
               var2 = 0;

               while(var27.hasNext()) {
                  var22 = (o)var27.next();
                  if (var22.d() != 0) {
                     var22.h(false);
                     var3 = var22.f(var0.H1(), 1);
                     if (var3 > var2) {
                        var19 = var22;
                        var2 = var3;
                     }
                  }
               }

               if (var19 != null) {
                  var0.d1(r.e.b.m);
                  var0.I0(var2);
                  var19.h(true);
                  break label205;
               }
            }

            var19 = null;
         }

         if (var26 == null && var19 == null) {
            var4 = false;
         } else {
            var4 = true;
         }

         return var4;
      }
   }

   public static boolean d(r.e.b var0, r.e.b var1, r.e.b var2, r.e.b var3) {
      boolean var4;
      r.e.b var7;
      label43: {
         var7 = r.e.b.m;
         if (var2 != var7) {
            r.e.b var6 = r.e.b.n;
            if (var2 != var6 && (var2 != r.e.b.p || var0 == var6)) {
               var4 = false;
               break label43;
            }
         }

         var4 = true;
      }

      boolean var5;
      if (var3 != var7) {
         var0 = r.e.b.n;
         if (var3 != var0 && (var3 != r.e.b.p || var1 == var0)) {
            var5 = false;
            return var4 || var5;
         }
      }

      var5 = true;
      return var4 || var5;
   }
}
