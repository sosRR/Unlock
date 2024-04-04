package y3;

import d4.c0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements a {
   private static final g c = new b((d$a)null);
   private final t4.a a;
   private final AtomicReference b = new AtomicReference((Object)null);

   public d(t4.a var1) {
      this.a = var1;
      var1.a(new y3.b(this));
   }

   // $FF: synthetic method
   public static void e(d var0, t4.b var1) {
      var0.g(var1);
   }

   // $FF: synthetic method
   public static void f(String var0, String var1, long var2, c0 var4, t4.b var5) {
      h(var0, var1, var2, var4, var5);
   }

   // $FF: synthetic method
   private void g(t4.b var1) {
      f.f().b("Crashlytics native component now available.");
      this.b.set((a)var1.get());
   }

   // $FF: synthetic method
   private static void h(String var0, String var1, long var2, c0 var4, t4.b var5) {
      ((a)var5.get()).a(var0, var1, var2, var4);
   }

   public void a(String var1, String var2, long var3, c0 var5) {
      f var6 = f.f();
      StringBuilder var7 = new StringBuilder();
      var7.append("Deferring native open session: ");
      var7.append(var1);
      var6.i(var7.toString());
      this.a.a(new c(var1, var2, var3, var5));
   }

   public g b(String var1) {
      a var2 = (a)this.b.get();
      g var3;
      if (var2 == null) {
         var3 = c;
      } else {
         var3 = var2.b(var1);
      }

      return var3;
   }

   public boolean c() {
      a var2 = (a)this.b.get();
      boolean var1;
      if (var2 != null && var2.c()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean d(String var1) {
      a var3 = (a)this.b.get();
      boolean var2;
      if (var3 != null && var3.d(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private static final class b implements g {
      private b() {
      }

      // $FF: synthetic method
      b(d$a var1) {
         this();
      }

      public File a() {
         return null;
      }

      public File b() {
         return null;
      }

      public File c() {
         return null;
      }

      public File d() {
         return null;
      }

      public File e() {
         return null;
      }

      public File f() {
         return null;
      }
   }
}
