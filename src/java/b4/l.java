package b4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class l {
   private final Context a;
   private final com.google.firebase.d b;
   private final r c;
   private final a0 d;
   private final long e;
   private m f;
   private m g;
   private boolean h;
   private j i;
   private final v j;
   private final g4.f k;
   public final a4.b l;
   private final z3.a m;
   private final ExecutorService n;
   private final h o;
   private final y3.a p;

   public l(com.google.firebase.d var1, v var2, y3.a var3, r var4, a4.b var5, z3.a var6, g4.f var7, ExecutorService var8) {
      this.b = var1;
      this.c = var4;
      this.a = var1.j();
      this.j = var2;
      this.p = var3;
      this.l = var5;
      this.m = var6;
      this.n = var8;
      this.k = var7;
      this.o = new h(var8);
      this.e = System.currentTimeMillis();
      this.d = new a0();
   }

   // $FF: synthetic method
   static m b(l var0) {
      return var0.f;
   }

   private void d() {
      y2.g var1 = this.o.g(new Callable(this) {
         final l a;

         {
            this.a = var1;
         }

         public Boolean a() {
            return this.a.i.s();
         }
      });

      Boolean var3;
      try {
         var3 = (Boolean)q0.d(var1);
      } catch (Exception var2) {
         this.h = false;
         return;
      }

      this.h = Boolean.TRUE.equals(var3);
   }

   private y2.g f(i4.i var1) {
      this.m();

      y2.g var8;
      try {
         a4.b var3 = this.l;
         k var2 = new k(this);
         var3.a(var2);
         if (var1.b().b.a) {
            if (!this.i.z(var1)) {
               y3.f.f().k("Previous sessions could not be finalized.");
            }

            var8 = this.i.O(var1.a());
            return var8;
         }

         y3.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
         RuntimeException var9 = new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
         var8 = y2.j.d(var9);
         return var8;
      } catch (Exception var6) {
         y3.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", var6);
         var8 = y2.j.d(var6);
      } finally {
         this.l();
      }

      return var8;
   }

   private void h(i4.i var1) {
      Runnable var5 = new Runnable(this, var1) {
         final i4.i m;
         final l n;

         {
            this.n = var1;
            this.m = var2;
         }

         public void run() {
            this.n.f(this.m);
         }
      };
      Future var6 = this.n.submit(var5);
      y3.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");

      try {
         var6.get(4L, TimeUnit.SECONDS);
      } catch (InterruptedException var2) {
         y3.f.f().e("Crashlytics was interrupted during initialization.", var2);
      } catch (ExecutionException var3) {
         y3.f.f().e("Crashlytics encountered a problem during initialization.", var3);
      } catch (TimeoutException var4) {
         y3.f.f().e("Crashlytics timed out during initialization.", var4);
      }

   }

   public static String i() {
      return "18.2.11";
   }

   static boolean j(String var0, boolean var1) {
      if (!var1) {
         y3.f.f().i("Configured not to require a build ID.");
         return true;
      } else if (!TextUtils.isEmpty(var0)) {
         return true;
      } else {
         Log.e("FirebaseCrashlytics", ".");
         Log.e("FirebaseCrashlytics", ".     |  | ");
         Log.e("FirebaseCrashlytics", ".     |  |");
         Log.e("FirebaseCrashlytics", ".     |  |");
         Log.e("FirebaseCrashlytics", ".   \\ |  | /");
         Log.e("FirebaseCrashlytics", ".    \\    /");
         Log.e("FirebaseCrashlytics", ".     \\  /");
         Log.e("FirebaseCrashlytics", ".      \\/");
         Log.e("FirebaseCrashlytics", ".");
         Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
         Log.e("FirebaseCrashlytics", ".");
         Log.e("FirebaseCrashlytics", ".      /\\");
         Log.e("FirebaseCrashlytics", ".     /  \\");
         Log.e("FirebaseCrashlytics", ".    /    \\");
         Log.e("FirebaseCrashlytics", ".   / |  | \\");
         Log.e("FirebaseCrashlytics", ".     |  |");
         Log.e("FirebaseCrashlytics", ".     |  |");
         Log.e("FirebaseCrashlytics", ".     |  |");
         Log.e("FirebaseCrashlytics", ".");
         return false;
      }
   }

   boolean e() {
      return this.f.c();
   }

   public y2.g g(i4.i var1) {
      return q0.e(this.n, new Callable(this, var1) {
         final i4.i a;
         final l b;

         {
            this.b = var1;
            this.a = var2;
         }

         public y2.g a() {
            return this.b.f(this.a);
         }
      });
   }

   public void k(String var1) {
      long var4 = System.currentTimeMillis();
      long var2 = this.e;
      this.i.R(var4 - var2, var1);
   }

   void l() {
      this.o.g(new Callable(this) {
         final l a;

         {
            this.a = var1;
         }

         public Boolean a() {
            // $FF: Couldn't be decompiled
         }
      });
   }

   void m() {
      this.o.b();
      this.f.a();
      y3.f.f().i("Initialization marker file was created.");
   }

   public boolean n(a var1, i4.i var2) {
      boolean var3 = b4.g.k(this.a, "com.crashlytics.RequireBuildId", true);
      if (j(var1.b, var3)) {
         String var4 = (new f(this.j)).toString();

         label28: {
            Exception var10000;
            label34: {
               boolean var10001;
               try {
                  m var5 = new m("crash_marker", this.k);
                  this.g = var5;
                  var5 = new m("initialization_marker", this.k);
                  this.f = var5;
                  c4.g var6 = new c4.g(var4, this.k, this.o);
                  c4.c var12 = new c4.c(this.k);
                  j4.c var7 = new j4.c(10);
                  j4.a var8 = new j4.a(1024, new j4.d[]{var7});
                  l0 var13 = l0.g(this.a, this.j, this.k, var1, var12, var6, var8, var2, this.d);
                  j var14 = new j(this.a, this.o, this.j, this.c, this.k, this.g, var1, var6, var12, var13, this.p, this.m);
                  this.i = var14;
                  var3 = this.e();
                  this.d();
                  this.i.x(var4, Thread.getDefaultUncaughtExceptionHandler(), var2);
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label34;
               }

               if (!var3) {
                  break label28;
               }

               try {
                  if (b4.g.c(this.a)) {
                     y3.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                     this.h(var2);
                     return false;
                  }
                  break label28;
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
               }
            }

            Exception var11 = var10000;
            y3.f.f().e("Crashlytics was not started due to an exception during initialization", var11);
            this.i = null;
            return false;
         }

         y3.f.f().b("Successfully configured exception handler.");
         return true;
      } else {
         throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
      }
   }
}
