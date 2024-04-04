package a1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f1.g;
import f1.p;
import f1.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x0.k;
import x0.o;
import x0.u;
import y0.e;
import y0.i;

public class c implements e {
   private static final String q = k.f("SystemJobScheduler");
   private final Context m;
   private final JobScheduler n;
   private final i o;
   private final b p;

   public c(Context var1, i var2) {
      this(var1, var2, (JobScheduler)var1.getSystemService("jobscheduler"), new b(var1));
   }

   public c(Context var1, i var2, JobScheduler var3, b var4) {
      this.m = var1;
      this.o = var2;
      this.n = var3;
      this.p = var4;
   }

   public static void a(Context var0) {
      JobScheduler var1 = (JobScheduler)var0.getSystemService("jobscheduler");
      if (var1 != null) {
         List var2 = g(var0, var1);
         if (var2 != null && !var2.isEmpty()) {
            Iterator var3 = var2.iterator();

            while(var3.hasNext()) {
               c(var1, ((JobInfo)var3.next()).getId());
            }
         }
      }

   }

   private static void c(JobScheduler var0, int var1) {
      try {
         var0.cancel(var1);
      } catch (Throwable var3) {
         k.c().b(q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{var1}), var3);
         return;
      }

   }

   private static List d(Context var0, JobScheduler var1, String var2) {
      List var5 = g(var0, var1);
      if (var5 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList(2);
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            JobInfo var3 = (JobInfo)var6.next();
            if (var2.equals(h(var3))) {
               var4.add(var3.getId());
            }
         }

         return var4;
      }
   }

   private static List g(Context var0, JobScheduler var1) {
      List var7;
      label47:
      try {
         var7 = var1.getAllPendingJobs();
      } catch (Throwable var5) {
         k.c().b(q, "getAllPendingJobs() is not reliable on this device.", var5);
         var7 = null;
         break label47;
      }

      if (var7 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var7.size());
         ComponentName var6 = new ComponentName(var0, SystemJobService.class);
         Iterator var8 = var7.iterator();

         while(var8.hasNext()) {
            JobInfo var3 = (JobInfo)var8.next();
            if (var6.equals(var3.getService())) {
               var2.add(var3);
            }
         }

         return var2;
      }
   }

   private static String h(JobInfo var0) {
      PersistableBundle var2 = var0.getExtras();
      if (var2 != null) {
         try {
            if (var2.containsKey("EXTRA_WORK_SPEC_ID")) {
               String var3 = var2.getString("EXTRA_WORK_SPEC_ID");
               return var3;
            }
         } catch (NullPointerException var1) {
         }
      }

      return null;
   }

   public static boolean i(Context var0, i var1) {
      JobScheduler var5 = (JobScheduler)var0.getSystemService("jobscheduler");
      List var7 = g(var0, var5);
      List var22 = var1.s().A().b();
      boolean var4 = false;
      int var2;
      if (var7 != null) {
         var2 = var7.size();
      } else {
         var2 = 0;
      }

      HashSet var6 = new HashSet(var2);
      if (var7 != null && !var7.isEmpty()) {
         Iterator var28 = var7.iterator();

         while(var28.hasNext()) {
            JobInfo var8 = (JobInfo)var28.next();
            String var9 = h(var8);
            if (!TextUtils.isEmpty(var9)) {
               var6.add(var9);
            } else {
               c(var5, var8.getId());
            }
         }
      }

      Iterator var26 = var22.iterator();

      boolean var3;
      while(true) {
         var3 = var4;
         if (!var26.hasNext()) {
            break;
         }

         if (!var6.contains((String)var26.next())) {
            k.c().a(q, "Reconciling jobs");
            var3 = true;
            break;
         }
      }

      if (var3) {
         WorkDatabase var25 = var1.s();
         var25.c();

         label277: {
            Throwable var10000;
            label276: {
               boolean var10001;
               Iterator var23;
               q var27;
               try {
                  var27 = var25.D();
                  var23 = var22.iterator();
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label276;
               }

               while(true) {
                  try {
                     if (var23.hasNext()) {
                        var27.e((String)var23.next(), -1L);
                        continue;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break;
                  }

                  try {
                     var25.t();
                     break label277;
                  } catch (Throwable var19) {
                     var10000 = var19;
                     var10001 = false;
                     break;
                  }
               }
            }

            Throwable var24 = var10000;
            var25.g();
            throw var24;
         }

         var25.g();
      }

      return var3;
   }

   public void b(String var1) {
      List var3 = d(this.m, this.n, var1);
      if (var3 != null && !var3.isEmpty()) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            int var2 = (Integer)var4.next();
            c(this.n, var2);
         }

         this.o.s().A().d(var1);
      }

   }

   public boolean e() {
      return true;
   }

   public void f(p... var1) {
      WorkDatabase var5 = this.o.s();
      g1.e var6 = new g1.e(var5);
      int var4 = var1.length;

      for(int var2 = 0; var2 < var4; ++var2) {
         p var7 = var1[var2];
         var5.c();

         label625: {
            Throwable var10000;
            label633: {
               p var8;
               boolean var10001;
               try {
                  var8 = var5.D().l(var7.a);
               } catch (Throwable var81) {
                  var10000 = var81;
                  var10001 = false;
                  break label633;
               }

               StringBuilder var9;
               String var10;
               k var85;
               if (var8 == null) {
                  label599:
                  try {
                     var85 = k.c();
                     var10 = q;
                     var9 = new StringBuilder();
                     var9.append("Skipping scheduling ");
                     var9.append(var7.a);
                     var9.append(" because it's no longer in the DB");
                     var85.h(var10, var9.toString());
                     var5.t();
                  } catch (Throwable var75) {
                     var10000 = var75;
                     var10001 = false;
                     break label599;
                  }
               } else {
                  label634: {
                     try {
                        if (var8.b != u.a.m) {
                           var85 = k.c();
                           var10 = q;
                           var9 = new StringBuilder();
                           var9.append("Skipping scheduling ");
                           var9.append(var7.a);
                           var9.append(" because it is no longer enqueued");
                           var85.h(var10, var9.toString());
                           var5.t();
                           break label625;
                        }
                     } catch (Throwable var82) {
                        var10000 = var82;
                        var10001 = false;
                        break label634;
                     }

                     g var84;
                     try {
                        var84 = var5.A().c(var7.a);
                     } catch (Throwable var80) {
                        var10000 = var80;
                        var10001 = false;
                        break label634;
                     }

                     int var3;
                     if (var84 != null) {
                        try {
                           var3 = var84.b;
                        } catch (Throwable var79) {
                           var10000 = var79;
                           var10001 = false;
                           break label634;
                        }
                     } else {
                        try {
                           var3 = var6.d(this.o.m().i(), this.o.m().g());
                        } catch (Throwable var78) {
                           var10000 = var78;
                           var10001 = false;
                           break label634;
                        }
                     }

                     if (var84 == null) {
                        try {
                           var84 = new g(var7.a, var3);
                           this.o.s().A().a(var84);
                        } catch (Throwable var77) {
                           var10000 = var77;
                           var10001 = false;
                           break label634;
                        }
                     }

                     label601:
                     try {
                        this.j(var7, var3);
                        var5.t();
                     } catch (Throwable var76) {
                        var10000 = var76;
                        var10001 = false;
                        break label601;
                     }
                  }
               }
               break label625;
            }

            Throwable var83 = var10000;
            var5.g();
            throw var83;
         }

         var5.g();
      }

   }

   public void j(p var1, int var2) {
      JobInfo var4 = this.p.a(var1, var2);
      k var5 = k.c();
      String var3 = q;
      var5.a(var3, String.format("Scheduling work ID %s Job ID %s", new Object[]{var1.a, var2}));

      IllegalStateException var10;
      try {
         try {
            if (this.n.schedule(var4) == 0) {
               k.c().h(var3, String.format("Unable to schedule work ID %s", new Object[]{var1.a}));
               if (var1.q && var1.r == x0.o.m) {
                  var1.q = false;
                  String var12 = String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{var1.a});
                  k.c().a(var3, var12);
                  this.j(var1, var2);
                  return;
               }
            }

            return;
         } catch (IllegalStateException var8) {
            var10 = var8;
         }
      } catch (Throwable var9) {
         k.c().b(q, String.format("Unable to schedule %s", new Object[]{var1}), var9);
         return;
      }

      List var11 = g(this.m, this.n);
      if (var11 != null) {
         var2 = var11.size();
      } else {
         var2 = 0;
      }

      var3 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{var2, this.o.s().D().s().size(), this.o.m().h()});
      k.c().b(q, var3);
      throw new IllegalStateException(var3, var10);
   }
}
