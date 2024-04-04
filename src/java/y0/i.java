package y0;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import g1.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import x0.k;
import x0.n;
import x0.p;
import x0.r;
import x0.u;
import x0.v;

public class i extends v {
   private static final String j = x0.k.f("WorkManagerImpl");
   private static i k = null;
   private static i l = null;
   private static final Object m = new Object();
   private Context a;
   private androidx.work.a b;
   private WorkDatabase c;
   private h1.a d;
   private List e;
   private d f;
   private g1.h g;
   private boolean h;
   private BroadcastReceiver.PendingResult i;

   public i(Context var1, androidx.work.a var2, h1.a var3) {
      this(var1, var2, var3, var1.getResources().getBoolean(r.a));
   }

   public i(Context var1, androidx.work.a var2, h1.a var3, WorkDatabase var4) {
      // $FF: Couldn't be decompiled
   }

   public i(Context var1, androidx.work.a var2, h1.a var3, boolean var4) {
      this(var1, var2, var3, WorkDatabase.u(var1.getApplicationContext(), var3.c(), var4));
   }

   public static void h(Context var0, androidx.work.a var1) {
      Object var2 = m;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label473: {
         i var3;
         try {
            var3 = k;
         } catch (Throwable var61) {
            var10000 = var61;
            var10001 = false;
            break label473;
         }

         if (var3 != null) {
            label472: {
               try {
                  if (l == null) {
                     break label472;
                  }
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break label473;
               }

               try {
                  IllegalStateException var62 = new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                  throw var62;
               } catch (Throwable var56) {
                  var10000 = var56;
                  var10001 = false;
                  break label473;
               }
            }
         }

         if (var3 == null) {
            try {
               Context var65 = var0.getApplicationContext();
               if (l == null) {
                  h1.b var4 = new h1.b(var1.l());
                  i var63 = new i(var65, var1, var4);
                  l = var63;
               }
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label473;
            }

            try {
               k = l;
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label473;
            }
         }

         label446:
         try {
            return;
         } catch (Throwable var57) {
            var10000 = var57;
            var10001 = false;
            break label446;
         }
      }

      while(true) {
         Throwable var64 = var10000;

         try {
            throw var64;
         } catch (Throwable var55) {
            var10000 = var55;
            var10001 = false;
            continue;
         }
      }
   }

   @Deprecated
   public static i n() {
      Object var0 = m;
      synchronized(var0){}

      Throwable var10000;
      boolean var10001;
      label164: {
         i var1;
         try {
            var1 = k;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label164;
         }

         if (var1 != null) {
            label158:
            try {
               return var1;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label158;
            }
         } else {
            label160:
            try {
               var1 = l;
               return var1;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label160;
            }
         }
      }

      while(true) {
         Throwable var23 = var10000;

         try {
            throw var23;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   public static i o(Context var0) {
      Object var3 = m;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label287: {
         i var2;
         try {
            var2 = n();
         } catch (Throwable var34) {
            var10000 = var34;
            var10001 = false;
            break label287;
         }

         label279: {
            i var1 = var2;
            if (var2 == null) {
               try {
                  var0 = var0.getApplicationContext();
                  if (!(var0 instanceof androidx.work.a.c)) {
                     break label279;
                  }

                  h(var0, ((androidx.work.a.c)var0).a());
                  var1 = o(var0);
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label287;
               }
            }

            try {
               return var1;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label287;
            }
         }

         label269:
         try {
            IllegalStateException var36 = new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label269;
         }
      }

      while(true) {
         Throwable var35 = var10000;

         try {
            throw var35;
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            continue;
         }
      }
   }

   private void u(Context var1, androidx.work.a var2, h1.a var3, WorkDatabase var4, List var5, d var6) {
      var1 = var1.getApplicationContext();
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
      this.e = var5;
      this.f = var6;
      this.g = new g1.h(var4);
      this.h = false;
      if (!var1.isDeviceProtectedStorage()) {
         this.d.b(new ForceStopRunnable(var1, this));
      } else {
         throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
      }
   }

   public void A(String var1) {
      this.d.b(new l(this, var1, true));
   }

   public void B(String var1) {
      this.d.b(new l(this, var1, false));
   }

   public n a() {
      g1.a var1 = g1.a.b(this);
      this.d.b(var1);
      return var1.e();
   }

   public n b(String var1) {
      g1.a var2 = g1.a.d(var1, this, true);
      this.d.b(var2);
      return var2.e();
   }

   public n c(List var1) {
      if (!var1.isEmpty()) {
         return (new g(this, var1)).a();
      } else {
         throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
      }
   }

   public n e(String var1, x0.d var2, p var3) {
      return this.k(var1, var2, var3).a();
   }

   public LiveData g(UUID var1) {
      return g1.f.a(this.c.D().o(Collections.singletonList(var1.toString())), new l.a(this) {
         final i a;

         {
            this.a = var1;
         }

         public u a(List var1) {
            u var2;
            if (var1 != null && var1.size() > 0) {
               var2 = ((f1.p.c)var1.get(0)).a();
            } else {
               var2 = null;
            }

            return var2;
         }
      }, this.d);
   }

   public n i(UUID var1) {
      g1.a var2 = g1.a.c(var1, this);
      this.d.b(var2);
      return var2.e();
   }

   public List j(Context var1, androidx.work.a var2, h1.a var3) {
      return Arrays.asList(new e[]{y0.f.a(var1, this), new z0.b(var1, var2, var3, this)});
   }

   public g k(String var1, x0.d var2, p var3) {
      x0.e var4;
      if (var2 == x0.d.n) {
         var4 = x0.e.n;
      } else {
         var4 = x0.e.m;
      }

      return new g(this, var1, var4, Collections.singletonList(var3));
   }

   public Context l() {
      return this.a;
   }

   public androidx.work.a m() {
      return this.b;
   }

   public g1.h p() {
      return this.g;
   }

   public d q() {
      return this.f;
   }

   public List r() {
      return this.e;
   }

   public WorkDatabase s() {
      return this.c;
   }

   public h1.a t() {
      return this.d;
   }

   public void v() {
      Object var1 = m;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label176: {
         BroadcastReceiver.PendingResult var2;
         try {
            this.h = true;
            var2 = this.i;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label176;
         }

         if (var2 != null) {
            try {
               var2.finish();
               this.i = null;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            return;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label165;
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   public void w() {
      a1.c.a(this.l());
      this.s().D().v();
      y0.f.b(this.m(), this.s(), this.r());
   }

   public void x(BroadcastReceiver.PendingResult var1) {
      Object var2 = m;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            this.i = var1;
            if (this.h) {
               var1.finish();
               this.i = null;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public void y(String var1) {
      this.z(var1, (WorkerParameters.a)null);
   }

   public void z(String var1, WorkerParameters.a var2) {
      this.d.b(new g1.k(this, var1, var2));
   }
}
