package y0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f1.p;
import f1.q;
import java.util.Iterator;
import java.util.List;
import x0.k;

public class f {
   private static final String a = k.f("Schedulers");

   static e a(Context var0, i var1) {
      a1.c var2 = new a1.c(var0, var1);
      g1.g.a(var0, SystemJobService.class, true);
      k.c().a(a, "Created SystemJobScheduler and enabled SystemJobService");
      return var2;
   }

   public static void b(androidx.work.a var0, WorkDatabase var1, List var2) {
      if (var2 != null && var2.size() != 0) {
         q var5 = var1.D();
         var1.c();

         List var7;
         List var28;
         label389: {
            Throwable var10000;
            label396: {
               boolean var10001;
               try {
                  var7 = var5.k(var0.h());
                  var28 = var5.t(200);
               } catch (Throwable var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label396;
               }

               if (var7 != null) {
                  label383: {
                     long var3;
                     Iterator var6;
                     try {
                        if (var7.size() <= 0) {
                           break label383;
                        }

                        var3 = System.currentTimeMillis();
                        var6 = var7.iterator();
                     } catch (Throwable var26) {
                        var10000 = var26;
                        var10001 = false;
                        break label396;
                     }

                     while(true) {
                        try {
                           if (!var6.hasNext()) {
                              break;
                           }

                           var5.e(((p)var6.next()).a, var3);
                        } catch (Throwable var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label396;
                        }
                     }
                  }
               }

               label372:
               try {
                  var1.t();
                  break label389;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label372;
               }
            }

            Throwable var29 = var10000;
            var1.g();
            throw var29;
         }

         var1.g();
         if (var7 != null && var7.size() > 0) {
            p[] var31 = (p[])var7.toArray(new p[var7.size()]);
            Iterator var34 = var2.iterator();

            while(var34.hasNext()) {
               e var35 = (e)var34.next();
               if (var35.e()) {
                  var35.f(var31);
               }
            }
         }

         if (var28 != null && var28.size() > 0) {
            p[] var30 = (p[])var28.toArray(new p[var28.size()]);
            Iterator var33 = var2.iterator();

            while(var33.hasNext()) {
               e var32 = (e)var33.next();
               if (!var32.e()) {
                  var32.f(var30);
               }
            }
         }

      }
   }
}
