package b4;

import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class l0 {
   private final n a;
   private final g4.e b;
   private final h4.b c;
   private final c4.c d;
   private final c4.g e;

   l0(n var1, g4.e var2, h4.b var3, c4.c var4, c4.g var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   public static boolean a(l0 var0, y2.g var1) {
      return var0.p(var1);
   }

   // $FF: synthetic method
   public static int b(d4.a0.c var0, d4.a0.c var1) {
      return m(var0, var1);
   }

   private d4.a0.e.d c(d4.a0.e.d var1) {
      return this.d(var1, this.d, this.e);
   }

   private d4.a0.e.d d(d4.a0.e.d var1, c4.c var2, c4.g var3) {
      d4.a0.e.d.b var4 = var1.g();
      String var5 = var2.c();
      if (var5 != null) {
         var4.d(d4.a0.e.d.d.a().b(var5).a());
      } else {
         y3.f.f().i("No log data to include with this event.");
      }

      List var6 = k(var3.a());
      List var7 = k(var3.b());
      if (!var6.isEmpty() || !var7.isEmpty()) {
         var4.b(var1.b().g().c(d4.b0.d(var6)).e(d4.b0.d(var7)).a());
      }

      return var4.a();
   }

   private static d4.a0.a e(ApplicationExitInfo var0) {
      Object var2 = null;

      IOException var10000;
      String var1;
      label28: {
         boolean var10001;
         InputStream var3;
         try {
            var3 = b0.a(var0);
         } catch (IOException var6) {
            var10000 = var6;
            var10001 = false;
            break label28;
         }

         var1 = (String)var2;
         if (var3 == null) {
            return d4.a0.a.a().b(d0.a(var0)).d(e0.a(var0)).f(g1.d.a(var0)).h(f0.a(var0)).c(g0.a(var0)).e(h0.a(var0)).g(i0.a(var0)).i(var1).a();
         }

         try {
            var1 = f(var3);
            return d4.a0.a.a().b(d0.a(var0)).d(e0.a(var0)).f(g1.d.a(var0)).h(f0.a(var0)).c(g0.a(var0)).e(h0.a(var0)).g(i0.a(var0)).i(var1).a();
         } catch (IOException var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      IOException var4 = var10000;
      y3.f var7 = y3.f.f();
      StringBuilder var8 = new StringBuilder();
      var8.append("Could not get input trace in application exit info: ");
      var8.append(c0.a(var0));
      var8.append(" Error: ");
      var8.append(var4);
      var7.k(var8.toString());
      var1 = (String)var2;
      return d4.a0.a.a().b(d0.a(var0)).d(e0.a(var0)).f(g1.d.a(var0)).h(f0.a(var0)).c(g0.a(var0)).e(h0.a(var0)).g(i0.a(var0)).i(var1).a();
   }

   public static String f(InputStream var0) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var2 = new byte[8192];

      while(true) {
         int var1 = var0.read(var2);
         if (var1 == -1) {
            return var3.toString(StandardCharsets.UTF_8.name());
         }

         var3.write(var2, 0, var1);
      }
   }

   public static l0 g(Context var0, v var1, g4.f var2, a var3, c4.c var4, c4.g var5, j4.d var6, i4.i var7, a0 var8) {
      return new l0(new n(var0, var1, var3, var6), new g4.e(var2, var7), h4.b.b(var0, var7, var8), var4, var5);
   }

   private ApplicationExitInfo j(String var1, List var2) {
      long var3 = this.b.q(var1);
      Iterator var6 = var2.iterator();

      ApplicationExitInfo var5;
      do {
         if (!var6.hasNext()) {
            return null;
         }

         var5 = (ApplicationExitInfo)var6.next();
         if (f0.a(var5) < var3) {
            return null;
         }
      } while(g1.d.a(var5) != 6);

      return var5;
   }

   private static List k(Map var0) {
      ArrayList var1 = new ArrayList();
      var1.ensureCapacity(var0.size());
      Iterator var2 = var0.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.add(d4.a0.c.a().b((String)var3.getKey()).c((String)var3.getValue()).a());
      }

      Collections.sort(var1, new j0());
      return var1;
   }

   // $FF: synthetic method
   private static int m(d4.a0.c var0, d4.a0.c var1) {
      return var0.b().compareTo(var1.b());
   }

   private boolean p(y2.g var1) {
      if (var1.o()) {
         o var3 = (o)var1.k();
         y3.f var2 = y3.f.f();
         StringBuilder var4 = new StringBuilder();
         var4.append("Crashlytics report successfully enqueued to DataTransport: ");
         var4.append(var3.d());
         var2.b(var4.toString());
         File var5 = var3.c();
         if (var5.delete()) {
            y3.f var7 = y3.f.f();
            StringBuilder var6 = new StringBuilder();
            var6.append("Deleted report file: ");
            var6.append(var5.getPath());
            var7.b(var6.toString());
         } else {
            var2 = y3.f.f();
            StringBuilder var8 = new StringBuilder();
            var8.append("Crashlytics could not delete report file: ");
            var8.append(var5.getPath());
            var2.k(var8.toString());
         }

         return true;
      } else {
         y3.f.f().l("Crashlytics report could not be enqueued to DataTransport", var1.j());
         return false;
      }
   }

   private void q(Throwable var1, Thread var2, String var3, String var4, long var5, boolean var7) {
      boolean var8 = var4.equals("crash");
      d4.a0.e.d var9 = this.a.c(var1, var2, var4, var5, 4, 8, var7);
      this.b.y(this.c(var9), var3, var8);
   }

   public void h(String var1, List var2) {
      y3.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
      ArrayList var3 = new ArrayList();
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         d4.a0.d.b var4 = ((y)var5.next()).c();
         if (var4 != null) {
            var3.add(var4);
         }
      }

      this.b.l(var1, d4.a0.d.a().b(d4.b0.d(var3)).a());
   }

   public void i(long var1, String var3) {
      this.b.k(var3, var1);
   }

   public boolean l() {
      return this.b.r();
   }

   public SortedSet n() {
      return this.b.p();
   }

   public void o(String var1, long var2) {
      d4.a0 var4 = this.a.d(var1, var2);
      this.b.z(var4);
   }

   public void r(Throwable var1, Thread var2, String var3, long var4) {
      y3.f var6 = y3.f.f();
      StringBuilder var7 = new StringBuilder();
      var7.append("Persisting fatal event for session ");
      var7.append(var3);
      var6.i(var7.toString());
      this.q(var1, var2, var3, "crash", var4, true);
   }

   public void s(String var1, List var2, c4.c var3, c4.g var4) {
      ApplicationExitInfo var7 = this.j(var1, var2);
      if (var7 == null) {
         y3.f var10 = y3.f.f();
         StringBuilder var9 = new StringBuilder();
         var9.append("No relevant ApplicationExitInfo occurred during session: ");
         var9.append(var1);
         var10.i(var9.toString());
      } else {
         d4.a0.e.d var8 = this.a.b(e(var7));
         y3.f var6 = y3.f.f();
         StringBuilder var5 = new StringBuilder();
         var5.append("Persisting anr for session ");
         var5.append(var1);
         var6.b(var5.toString());
         this.b.y(this.d(var8, var3, var4), var1, true);
      }
   }

   public void t() {
      this.b.i();
   }

   public y2.g u(Executor var1) {
      return this.v(var1, (String)null);
   }

   public y2.g v(Executor var1, String var2) {
      List var5 = this.b.w();
      ArrayList var4 = new ArrayList();
      Iterator var6 = var5.iterator();

      while(true) {
         o var8;
         do {
            if (!var6.hasNext()) {
               return y2.j.f(var4);
            }

            var8 = (o)var6.next();
         } while(var2 != null && !var2.equals(var8.d()));

         h4.b var7 = this.c;
         boolean var3;
         if (var2 != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         var4.add(var7.c(var8, var3).g(var1, new k0(this)));
      }
   }
}
