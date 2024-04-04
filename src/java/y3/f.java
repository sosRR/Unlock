package y3;

import android.util.Log;

public class f {
   static final f c = new f("FirebaseCrashlytics");
   private final String a;
   private int b;

   public f(String var1) {
      this.a = var1;
      this.b = 4;
   }

   private boolean a(int var1) {
      boolean var2;
      if (this.b > var1 && !Log.isLoggable(this.a, var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public static f f() {
      return c;
   }

   public void b(String var1) {
      this.c(var1, (Throwable)null);
   }

   public void c(String var1, Throwable var2) {
      this.a(3);
   }

   public void d(String var1) {
      this.e(var1, (Throwable)null);
   }

   public void e(String var1, Throwable var2) {
      if (this.a(6)) {
         Log.e(this.a, var1, var2);
      }

   }

   public void g(String var1) {
      this.h(var1, (Throwable)null);
   }

   public void h(String var1, Throwable var2) {
      this.a(4);
   }

   public void i(String var1) {
      this.j(var1, (Throwable)null);
   }

   public void j(String var1, Throwable var2) {
      this.a(2);
   }

   public void k(String var1) {
      this.l(var1, (Throwable)null);
   }

   public void l(String var1, Throwable var2) {
      if (this.a(5)) {
         Log.w(this.a, var1, var2);
      }

   }
}
