package g1;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f1.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.u;
import x0.w;

public class b implements Runnable {
   private static final String o = x0.k.f("EnqueueRunnable");
   private final y0.g m;
   private final y0.c n;

   public b(y0.g var1) {
      this.m = var1;
      this.n = new y0.c();
   }

   private static boolean b(y0.g var0) {
      Set var2 = y0.g.l(var0);
      boolean var1 = c(var0.g(), var0.f(), (String[])var2.toArray(new String[0]), var0.d(), var0.b());
      var0.k();
      return var1;
   }

   private static boolean c(y0.i var0, List var1, String[] var2, String var3, x0.e var4) {
      long var17 = System.currentTimeMillis();
      WorkDatabase var20 = var0.s();
      boolean var16 = true;
      boolean var8;
      if (var2 != null && var2.length > 0) {
         var8 = true;
      } else {
         var8 = false;
      }

      boolean var5;
      boolean var6;
      boolean var7;
      boolean var9;
      boolean var10;
      boolean var11;
      u.a var41;
      if (var8) {
         int var13 = var2.length;
         var11 = true;
         int var12 = 0;
         var10 = false;
         var9 = var10;

         while(true) {
            var6 = var11;
            var5 = var10;
            var7 = var9;
            if (var12 >= var13) {
               break;
            }

            String var19 = var2[var12];
            f1.p var21 = var20.D().l(var19);
            if (var21 == null) {
               x0.k.c().b(o, String.format("Prerequisite %s doesn't exist; not enqueuing", new Object[]{var19}));
               return false;
            }

            var41 = var21.b;
            if (var41 == u.a.o) {
               var5 = true;
            } else {
               var5 = false;
            }

            var11 &= var5;
            if (var41 == u.a.p) {
               var5 = true;
            } else {
               var5 = var9;
               if (var41 == u.a.r) {
                  var10 = true;
                  var5 = var9;
               }
            }

            ++var12;
            var9 = var5;
         }
      } else {
         var6 = true;
         var5 = false;
         var7 = false;
      }

      boolean var14 = TextUtils.isEmpty(var3) ^ true;
      boolean var40;
      if (var14 && !var8) {
         var40 = true;
      } else {
         var40 = false;
      }

      boolean var15;
      String[] var28;
      boolean var39;
      label176: {
         String[] var42 = var2;
         var9 = var8;
         var10 = var6;
         var11 = var5;
         var39 = var7;
         if (var40) {
            List var44 = var20.D().g(var3);
            var42 = var2;
            var9 = var8;
            var10 = var6;
            var11 = var5;
            var39 = var7;
            if (!var44.isEmpty()) {
               Iterator var34;
               if (var4 != x0.e.o && var4 != x0.e.p) {
                  if (var4 == x0.e.n) {
                     var34 = var44.iterator();

                     while(var34.hasNext()) {
                        var41 = ((f1.p.b)var34.next()).b;
                        if (var41 == u.a.m || var41 == u.a.n) {
                           return false;
                        }
                     }
                  }

                  a.d(var3, var0, false).run();
                  f1.q var35 = var20.D();
                  Iterator var46 = var44.iterator();

                  while(true) {
                     var28 = var2;
                     var15 = var16;
                     var9 = var8;
                     var10 = var6;
                     var11 = var5;
                     var39 = var7;
                     if (!var46.hasNext()) {
                        break label176;
                     }

                     var35.a(((f1.p.b)var46.next()).a);
                  }
               }

               f1.b var24 = var20.v();
               ArrayList var43 = new ArrayList();

               for(Iterator var45 = var44.iterator(); var45.hasNext(); var7 = var8) {
                  f1.p.b var22 = (f1.p.b)var45.next();
                  var10 = var6;
                  var9 = var5;
                  var8 = var7;
                  if (!var24.b(var22.a)) {
                     u.a var23 = var22.b;
                     if (var23 == u.a.o) {
                        var9 = true;
                     } else {
                        var9 = false;
                     }

                     if (var23 == u.a.p) {
                        var8 = true;
                     } else {
                        var8 = var7;
                        if (var23 == u.a.r) {
                           var5 = true;
                           var8 = var7;
                        }
                     }

                     var43.add(var22.a);
                     var10 = var9 & var6;
                     var9 = var5;
                  }

                  var6 = var10;
                  var5 = var9;
               }

               var11 = var5;
               var39 = var7;
               Object var25 = var43;
               if (var4 == x0.e.p) {
                  label207: {
                     if (!var5) {
                        var11 = var5;
                        var39 = var7;
                        var25 = var43;
                        if (!var7) {
                           break label207;
                        }
                     }

                     f1.q var27 = var20.D();
                     var34 = var27.g(var3).iterator();

                     while(var34.hasNext()) {
                        var27.a(((f1.p.b)var34.next()).a);
                     }

                     var25 = Collections.emptyList();
                     var11 = false;
                     var39 = false;
                  }
               }

               var42 = (String[])((List)var25).toArray(var2);
               if (var42.length > 0) {
                  var9 = true;
                  var10 = var6;
               } else {
                  var9 = false;
                  var10 = var6;
               }
            }
         }

         var15 = false;
         var28 = var42;
      }

      Iterator var30;
      for(Iterator var26 = var1.iterator(); var26.hasNext(); var26 = var30) {
         w var47 = (w)var26.next();
         f1.p var29 = var47.d();
         if (var9 && !var10) {
            if (var39) {
               var29.b = u.a.p;
            } else if (var11) {
               var29.b = u.a.r;
            } else {
               var29.b = u.a.q;
            }
         } else if (!var29.d()) {
            var29.n = var17;
         } else {
            var29.n = 0L;
         }

         if (var29.b == u.a.m) {
            var15 = true;
         }

         var20.D().n(var29);
         String[] var36 = var28;
         var30 = var26;
         if (var9) {
            int var37 = var28.length;
            int var38 = 0;

            while(true) {
               var36 = var28;
               var30 = var26;
               if (var38 >= var37) {
                  break;
               }

               String var31 = var28[var38];
               f1.a var33 = new f1.a(var47.b(), var31);
               var20.v().c(var33);
               ++var38;
            }
         }

         var26 = var47.c().iterator();

         while(var26.hasNext()) {
            String var32 = (String)var26.next();
            var20.E().a(new s(var32, var47.b()));
         }

         if (var14) {
            var20.B().a(new f1.j(var3, var47.b()));
         }

         var28 = var36;
      }

      return var15;
   }

   private static boolean e(y0.g var0) {
      List var2 = var0.e();
      boolean var1 = false;
      if (var2 != null) {
         Iterator var4 = var2.iterator();
         var1 = false;

         while(var4.hasNext()) {
            y0.g var3 = (y0.g)var4.next();
            if (!var3.j()) {
               var1 |= e(var3);
            } else {
               x0.k.c().h(o, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", var3.c())}));
            }
         }
      }

      return b(var0) | var1;
   }

   public boolean a() {
      WorkDatabase var2 = this.m.g().s();
      var2.c();

      boolean var1;
      try {
         var1 = e(this.m);
         var2.t();
      } finally {
         var2.g();
      }

      return var1;
   }

   public x0.n d() {
      return this.n;
   }

   public void f() {
      y0.i var1 = this.m.g();
      y0.f.b(var1.m(), var1.s(), var1.r());
   }

   public void run() {
      try {
         if (this.m.h()) {
            IllegalStateException var1 = new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.m}));
            throw var1;
         }

         if (this.a()) {
            g.a(this.m.g().l(), RescheduleReceiver.class, true);
            this.f();
         }

         this.n.a(x0.n.a);
      } catch (Throwable var3) {
         this.n.a(new x0.n.a(var3));
         return;
      }

   }
}
