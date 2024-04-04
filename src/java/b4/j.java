package b4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class j {
   static final FilenameFilter s = new i();
   private final Context a;
   private final r b;
   private final m c;
   private final c4.g d;
   private final h e;
   private final v f;
   private final g4.f g;
   private final a h;
   private final c4.c i;
   private final y3.a j;
   private final z3.a k;
   private final l0 l;
   private p m;
   private i4.i n = null;
   final y2.h o = new y2.h();
   final y2.h p = new y2.h();
   final y2.h q = new y2.h();
   final AtomicBoolean r = new AtomicBoolean(false);

   j(Context var1, h var2, v var3, r var4, g4.f var5, m var6, a var7, c4.g var8, c4.c var9, l0 var10, y3.a var11, z3.a var12) {
      this.a = var1;
      this.e = var2;
      this.f = var3;
      this.b = var4;
      this.g = var5;
      this.c = var6;
      this.h = var7;
      this.d = var8;
      this.i = var9;
      this.j = var11;
      this.k = var12;
      this.l = var10;
   }

   private static boolean A() {
      try {
         Class.forName("com.google.firebase.crash.FirebaseCrash");
         return true;
      } catch (ClassNotFoundException var1) {
         return false;
      }
   }

   private Context B() {
      return this.a;
   }

   private String C() {
      SortedSet var1 = this.l.n();
      String var2;
      if (!var1.isEmpty()) {
         var2 = (String)var1.first();
      } else {
         var2 = null;
      }

      return var2;
   }

   private static long D() {
      return F(System.currentTimeMillis());
   }

   static List E(y3.g var0, String var1, g4.f var2, byte[] var3) {
      File var4 = var2.o(var1, "user-data");
      File var5 = var2.o(var1, "keys");
      ArrayList var6 = new ArrayList();
      var6.add(new e("logs_file", "logs", var3));
      var6.add(new u("crash_meta_file", "metadata", var0.f()));
      var6.add(new u("session_meta_file", "session", var0.e()));
      var6.add(new u("app_meta_file", "app", var0.a()));
      var6.add(new u("device_meta_file", "device", var0.c()));
      var6.add(new u("os_meta_file", "os", var0.b()));
      var6.add(new u("minidump_file", "minidump", var0.d()));
      var6.add(new u("user_meta_file", "user", var4));
      var6.add(new u("keys_file", "keys", var5));
      return var6;
   }

   private static long F(long var0) {
      return var0 / 1000L;
   }

   // $FF: synthetic method
   private static boolean J(File var0, String var1) {
      return var1.startsWith(".ae");
   }

   private y2.g L(long var1) {
      if (A()) {
         y3.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
         return y2.j.e((Object)null);
      } else {
         y3.f.f().b("Logging app exception event to Firebase Analytics");
         return y2.j.c(new ScheduledThreadPoolExecutor(1), new Callable(this, var1) {
            final long a;
            final j b;

            {
               this.b = var1;
               this.a = var2;
            }

            public Void a() {
               Bundle var1 = new Bundle();
               var1.putInt("fatal", 1);
               var1.putLong("timestamp", this.a);
               this.b.k.a("_ae", var1);
               return null;
            }
         });
      }
   }

   private y2.g M() {
      ArrayList var3 = new ArrayList();

      File var2;
      for(Iterator var1 = this.K().iterator(); var1.hasNext(); var2.delete()) {
         var2 = (File)var1.next();

         try {
            var3.add(this.L(Long.parseLong(var2.getName().substring(3))));
         } catch (NumberFormatException var6) {
            y3.f var4 = y3.f.f();
            StringBuilder var5 = new StringBuilder();
            var5.append("Could not parse app exception timestamp from file ");
            var5.append(var2.getName());
            var4.k(var5.toString());
         }
      }

      return y2.j.f(var3);
   }

   private y2.g P() {
      if (this.b.d()) {
         y3.f.f().b("Automatic data collection is enabled. Allowing upload.");
         this.o.e(Boolean.FALSE);
         return y2.j.e(Boolean.TRUE);
      } else {
         y3.f.f().b("Automatic data collection is disabled.");
         y3.f.f().i("Notifying that unsent reports are available.");
         this.o.e(Boolean.TRUE);
         y2.g var1 = this.b.g().q(new j$c(this));
         y3.f.f().b("Waiting for send/deleteUnsentReports to be called.");
         return q0.j(var1, this.p.a());
      }
   }

   private void Q(String var1) {
      int var2 = VERSION.SDK_INT;
      if (var2 >= 30) {
         List var3 = g1.c.a((ActivityManager)this.a.getSystemService("activity"), (String)null, 0, 0);
         if (var3.size() != 0) {
            c4.c var4 = new c4.c(this.g, var1);
            c4.g var5 = c4.g.c(var1, this.g, this.e);
            this.l.s(var1, var3, var4, var5);
         } else {
            y3.f var9 = y3.f.f();
            StringBuilder var7 = new StringBuilder();
            var7.append("No ApplicationExitInfo available. Session: ");
            var7.append(var1);
            var9.i(var7.toString());
         }
      } else {
         y3.f var8 = y3.f.f();
         StringBuilder var6 = new StringBuilder();
         var6.append("ANR feature enabled, but device is API ");
         var6.append(var2);
         var8.i(var6.toString());
      }

   }

   // $FF: synthetic method
   public static boolean a(File var0, String var1) {
      return J(var0, var1);
   }

   // $FF: synthetic method
   static void d(List var0) {
      r(var0);
   }

   // $FF: synthetic method
   static y2.g n(j var0) {
      return var0.M();
   }

   private static d4.c0.a o(v var0, a var1) {
      return d4.c0.a.b(var0.f(), var1.e, var1.f, var0.a(), b4.s.d(var1.c).e(), var1.g);
   }

   private static d4.c0.b p(Context var0) {
      StatFs var5 = new StatFs(Environment.getDataDirectory().getPath());
      long var1 = (long)var5.getBlockCount();
      long var3 = (long)var5.getBlockSize();
      return d4.c0.b.c(b4.g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), b4.g.s(), var1 * var3, b4.g.x(var0), b4.g.m(var0), Build.MANUFACTURER, Build.PRODUCT);
   }

   private static d4.c0.c q(Context var0) {
      return d4.c0.c.a(VERSION.RELEASE, VERSION.CODENAME, b4.g.y(var0));
   }

   private static void r(List var0) {
      Iterator var1 = var0.iterator();

      while(var1.hasNext()) {
         ((File)var1.next()).delete();
      }

   }

   private void u(boolean var1, i4.i var2) {
      ArrayList var4 = new ArrayList(this.l.n());
      if (var4.size() <= var1) {
         y3.f.f().i("No open sessions to be closed.");
      } else {
         String var3 = (String)var4.get(var1);
         if (var2.b().b.b) {
            this.Q(var3);
         } else {
            y3.f.f().i("ANR feature disabled.");
         }

         if (this.j.d(var3)) {
            this.y(var3);
         }

         String var5;
         if (var1 != 0) {
            var5 = (String)var4.get(0);
         } else {
            var5 = null;
         }

         this.l.i(D(), var5);
      }
   }

   private void v(String var1) {
      long var2 = D();
      y3.f var4 = y3.f.f();
      StringBuilder var5 = new StringBuilder();
      var5.append("Opening a new session with ID ");
      var5.append(var1);
      var4.b(var5.toString());
      String var7 = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{b4.l.i()});
      d4.c0.a var8 = o(this.f, this.h);
      d4.c0.c var9 = q(this.B());
      d4.c0.b var6 = p(this.B());
      this.j.a(var1, var7, var2, d4.c0.b(var8, var9, var6));
      this.i.e(var1);
      this.l.o(var1, var2);
   }

   private void w(long var1) {
      try {
         g4.f var3 = this.g;
         StringBuilder var4 = new StringBuilder();
         var4.append(".ae");
         var4.append(var1);
         if (!var3.e(var4.toString()).createNewFile()) {
            IOException var6 = new IOException("Create new file failed.");
            throw var6;
         }
      } catch (IOException var5) {
         y3.f.f().l("Could not create app exception marker file.", var5);
      }

   }

   private void y(String var1) {
      y3.f var4 = y3.f.f();
      StringBuilder var5 = new StringBuilder();
      var5.append("Finalizing native report for session ");
      var5.append(var1);
      var4.i(var5.toString());
      y3.g var7 = this.j.b(var1);
      File var10 = var7.d();
      if (var10 != null && var10.exists()) {
         long var2 = var10.lastModified();
         c4.c var6 = new c4.c(this.g, var1);
         var10 = this.g.i(var1);
         if (!var10.isDirectory()) {
            y3.f.f().k("Couldn't create directory to store native session files, aborting.");
         } else {
            this.w(var2);
            List var9 = E(var7, var1, this.g, var6.b());
            z.b(var10, var9);
            y3.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
            this.l.h(var1, var9);
            var6.a();
         }
      } else {
         y3.f var11 = y3.f.f();
         StringBuilder var8 = new StringBuilder();
         var8.append("No minidump data found for session ");
         var8.append(var1);
         var11.k(var8.toString());
      }
   }

   void G(i4.i var1, Thread var2, Throwable var3) {
      this.H(var1, var2, var3, false);
   }

   void H(i4.i var1, Thread var2, Throwable var3, boolean var4) {
      synchronized(this){}

      try {
         y3.f var7 = y3.f.f();
         StringBuilder var8 = new StringBuilder();
         var8.append("Handling uncaught exception \"");
         var8.append(var3);
         var8.append("\" from thread ");
         var8.append(var2.getName());
         var7.b(var8.toString());
         long var5 = System.currentTimeMillis();
         h var17 = this.e;
         Callable var18 = new Callable(this, var5, var3, var2, var1, var4) {
            final long a;
            final Throwable b;
            final Thread c;
            final i4.i d;
            final boolean e;
            final j f;

            {
               this.f = var1;
               this.a = var2;
               this.b = var4;
               this.c = var5;
               this.d = var6;
               this.e = var7;
            }

            public y2.g a() {
               long var1 = b4.j.F(this.a);
               String var3 = this.f.C();
               if (var3 == null) {
                  y3.f.f().d("Tried to write a fatal exception while no session was open.");
                  return y2.j.e((Object)null);
               } else {
                  this.f.c.a();
                  this.f.l.r(this.b, this.c, var3, var1);
                  this.f.w(this.a);
                  this.f.t(this.d);
                  this.f.v((new f(this.f.f)).toString());
                  if (!this.f.b.d()) {
                     return y2.j.e((Object)null);
                  } else {
                     Executor var4 = this.f.e.c();
                     return this.d.a().p(var4, new j$b$a(this, var4, var3));
                  }
               }
            }
         };
         y2.g var16 = var17.h(var18);

         try {
            q0.d(var16);
         } catch (TimeoutException var13) {
            y3.f.f().d("Cannot send reports. Timed out while fetching settings.");
         } catch (Exception var14) {
            y3.f.f().e("Error handling uncaught exception", var14);
         }
      } finally {
         ;
      }

   }

   boolean I() {
      p var2 = this.m;
      boolean var1;
      if (var2 != null && var2.a()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   List K() {
      return this.g.f(s);
   }

   void N(String var1) {
      this.e.g(new Callable(this, var1) {
         final String a;
         final j b;

         {
            this.b = var1;
            this.a = var2;
         }

         public Void a() {
            this.b.v(this.a);
            return null;
         }
      });
   }

   y2.g O(y2.g var1) {
      if (!this.l.l()) {
         y3.f.f().i("No crash reports are available to be sent.");
         this.o.e(Boolean.FALSE);
         return y2.j.e((Object)null);
      } else {
         y3.f.f().i("Crash reports are available to be sent.");
         return this.P().q(new j$d(this, var1));
      }
   }

   void R(long var1, String var3) {
      this.e.g(new Callable(this, var1, var3) {
         final long a;
         final String b;
         final j c;

         {
            this.c = var1;
            this.a = var2;
            this.b = var4;
         }

         public Void a() {
            if (!this.c.I()) {
               this.c.i.g(this.a, this.b);
            }

            return null;
         }
      });
   }

   boolean s() {
      boolean var2 = this.c.c();
      boolean var1 = true;
      if (var2) {
         y3.f.f().i("Found previous crash marker.");
         this.c.d();
         return true;
      } else {
         String var3 = this.C();
         if (var3 == null || !this.j.d(var3)) {
            var1 = false;
         }

         return var1;
      }
   }

   void t(i4.i var1) {
      this.u(false, var1);
   }

   void x(String var1, Thread.UncaughtExceptionHandler var2, i4.i var3) {
      this.n = var3;
      this.N(var1);
      p var4 = new p(new j$a(this), var3, var2, this.j);
      this.m = var4;
      Thread.setDefaultUncaughtExceptionHandler(var4);
   }

   boolean z(i4.i var1) {
      this.e.b();
      if (this.I()) {
         y3.f.f().k("Skipping session finalization because a crash has already occurred.");
         return false;
      } else {
         y3.f.f().i("Finalizing previously open sessions.");

         try {
            this.u(true, var1);
         } catch (Exception var2) {
            y3.f.f().e("Unable to finalize previously open sessions.", var2);
            return false;
         }

         y3.f.f().i("Closed all previously open sessions.");
         return true;
      }
   }
}
