package b4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class n {
   private static final Map e;
   static final String f;
   private final Context a;
   private final v b;
   private final a c;
   private final j4.d d;

   static {
      HashMap var0 = new HashMap();
      e = var0;
      var0.put("armeabi", 5);
      var0.put("armeabi-v7a", 6);
      var0.put("arm64-v8a", 9);
      var0.put("x86", 0);
      var0.put("x86_64", 1);
      f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.11"});
   }

   public n(Context var1, v var2, a var3, j4.d var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   private d4.a0.b a() {
      return d4.a0.b().h("18.2.11").d(this.c.a).e(this.b.a()).b(this.c.e).c(this.c.f).g(4);
   }

   private static int e() {
      String var0 = Build.CPU_ABI;
      if (TextUtils.isEmpty(var0)) {
         return 7;
      } else {
         Integer var1 = (Integer)e.get(var0.toLowerCase(Locale.US));
         return var1 == null ? 7 : var1;
      }
   }

   private d4.a0.e.d.a.b.a f() {
      return d4.a0.e.d.a.b.a.a().b(0L).d(0L).c(this.c.d).e(this.c.b).a();
   }

   private d4.b0 g() {
      return d4.b0.g(this.f());
   }

   private d4.a0.e.d.a h(int var1, d4.a0.a var2) {
      boolean var3;
      if (var2.b() != 100) {
         var3 = true;
      } else {
         var3 = false;
      }

      return d4.a0.e.d.a.a().b(var3).f(var1).d(this.m(var2)).a();
   }

   private d4.a0.e.d.a i(int var1, j4.e var2, Thread var3, int var4, int var5, boolean var6) {
      ActivityManager.RunningAppProcessInfo var8 = g.j(this.c.d, this.a);
      Boolean var9;
      if (var8 != null) {
         boolean var7;
         if (var8.importance != 100) {
            var7 = true;
         } else {
            var7 = false;
         }

         var9 = var7;
      } else {
         var9 = null;
      }

      return d4.a0.e.d.a.a().b(var9).f(var1).d(this.n(var2, var3, var4, var5, var6)).a();
   }

   private d4.a0.e.d.c j(int var1) {
      d var11 = b4.d.a(this.a);
      Float var10 = var11.b();
      Double var12;
      if (var10 != null) {
         var12 = var10.doubleValue();
      } else {
         var12 = null;
      }

      int var2 = var11.c();
      boolean var9 = g.o(this.a);
      long var3 = g.s();
      long var5 = g.a(this.a);
      long var7 = g.b(Environment.getDataDirectory().getPath());
      return d4.a0.e.d.c.a().b(var12).c(var2).f(var9).e(var1).g(var3 - var5).d(var7).a();
   }

   private d4.a0.e.d.a.b.c k(j4.e var1, int var2, int var3) {
      return this.l(var1, var2, var3, 0);
   }

   private d4.a0.e.d.a.b.c l(j4.e var1, int var2, int var3, int var4) {
      String var10 = var1.b;
      String var9 = var1.a;
      StackTraceElement[] var7 = var1.c;
      int var6 = 0;
      int var5 = 0;
      if (var7 == null) {
         var7 = new StackTraceElement[0];
      }

      j4.e var8 = var1.d;
      if (var4 >= var3) {
         var1 = var8;

         while(true) {
            var6 = var5;
            if (var1 == null) {
               break;
            }

            var1 = var1.d;
            ++var5;
         }
      }

      d4.a0.e.d.a.b.c.a var11 = d4.a0.e.d.a.b.c.a().f(var10).e(var9).c(d4.b0.d(this.p(var7, var2))).d(var6);
      if (var8 != null && var6 == 0) {
         var11.b(this.l(var8, var2, var3, var4 + 1));
      }

      return var11.a();
   }

   private d4.a0.e.d.a.b m(d4.a0.a var1) {
      return d4.a0.e.d.a.b.a().b(var1).e(this.u()).c(this.g()).a();
   }

   private d4.a0.e.d.a.b n(j4.e var1, Thread var2, int var3, int var4, boolean var5) {
      return d4.a0.e.d.a.b.a().f(this.x(var1, var2, var3, var5)).d(this.k(var1, var3, var4)).e(this.u()).c(this.g()).a();
   }

   private d4.a0.e.d.a.b.e.b o(StackTraceElement var1, d4.a0.e.d.a.b.e.b.a var2) {
      boolean var9 = var1.isNativeMethod();
      long var7 = 0L;
      long var3;
      if (var9) {
         var3 = Math.max((long)var1.getLineNumber(), 0L);
      } else {
         var3 = 0L;
      }

      StringBuilder var10 = new StringBuilder();
      var10.append(var1.getClassName());
      var10.append(".");
      var10.append(var1.getMethodName());
      String var12 = var10.toString();
      String var11 = var1.getFileName();
      long var5 = var7;
      if (!var1.isNativeMethod()) {
         var5 = var7;
         if (var1.getLineNumber() > 0) {
            var5 = (long)var1.getLineNumber();
         }
      }

      return var2.e(var3).f(var12).b(var11).d(var5).a();
   }

   private d4.b0 p(StackTraceElement[] var1, int var2) {
      ArrayList var5 = new ArrayList();
      int var4 = var1.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         var5.add(this.o(var1[var3], d4.a0.e.d.a.b.e.b.a().c(var2)));
      }

      return d4.b0.d(var5);
   }

   private d4.a0.e.a q() {
      return d4.a0.e.a.a().e(this.b.f()).g(this.c.e).d(this.c.f).f(this.b.a()).b(this.c.g.d()).c(this.c.g.e()).a();
   }

   private d4.a0.e r(String var1, long var2) {
      return d4.a0.e.a().l(var2).i(var1).g(f).b(this.q()).k(this.t()).d(this.s()).h(3).a();
   }

   private d4.a0.e.c s() {
      StatFs var11 = new StatFs(Environment.getDataDirectory().getPath());
      int var2 = e();
      int var3 = Runtime.getRuntime().availableProcessors();
      long var4 = g.s();
      long var8 = (long)var11.getBlockCount();
      long var6 = (long)var11.getBlockSize();
      boolean var10 = g.x(this.a);
      int var1 = g.m(this.a);
      String var12 = Build.MANUFACTURER;
      String var13 = Build.PRODUCT;
      return d4.a0.e.c.a().b(var2).f(Build.MODEL).c(var3).h(var4).d(var8 * var6).i(var10).j(var1).e(var12).g(var13).a();
   }

   private d4.a0.e.e t() {
      return d4.a0.e.e.a().d(3).e(VERSION.RELEASE).b(VERSION.CODENAME).c(g.y(this.a)).a();
   }

   private d4.a0.e.d.a.b.d u() {
      return d4.a0.e.d.a.b.d.a().d("0").c("0").b(0L).a();
   }

   private d4.a0.e.d.a.b.e v(Thread var1, StackTraceElement[] var2) {
      return this.w(var1, var2, 0);
   }

   private d4.a0.e.d.a.b.e w(Thread var1, StackTraceElement[] var2, int var3) {
      return d4.a0.e.d.a.b.e.a().d(var1.getName()).c(var3).b(d4.b0.d(this.p(var2, var3))).a();
   }

   private d4.b0 x(j4.e var1, Thread var2, int var3, boolean var4) {
      ArrayList var5 = new ArrayList();
      var5.add(this.w(var2, var1.c, var3));
      if (var4) {
         Iterator var8 = Thread.getAllStackTraces().entrySet().iterator();

         while(var8.hasNext()) {
            Map.Entry var7 = (Map.Entry)var8.next();
            Thread var6 = (Thread)var7.getKey();
            if (!var6.equals(var2)) {
               var5.add(this.v(var6, this.d.a((StackTraceElement[])var7.getValue())));
            }
         }
      }

      return d4.b0.d(var5);
   }

   public d4.a0.e.d b(d4.a0.a var1) {
      int var2 = this.a.getResources().getConfiguration().orientation;
      return d4.a0.e.d.a().f("anr").e(var1.h()).b(this.h(var2, var1)).c(this.j(var2)).a();
   }

   public d4.a0.e.d c(Throwable var1, Thread var2, String var3, long var4, int var6, int var7, boolean var8) {
      int var9 = this.a.getResources().getConfiguration().orientation;
      j4.e var10 = new j4.e(var1, this.d);
      return d4.a0.e.d.a().f(var3).e(var4).b(this.i(var9, var10, var2, var6, var7, var8)).c(this.j(var9)).a();
   }

   public d4.a0 d(String var1, long var2) {
      return this.a().i(this.r(var1, var2)).a();
   }
}
