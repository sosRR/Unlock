package b4;

import java.util.concurrent.atomic.AtomicBoolean;

class p implements Thread.UncaughtExceptionHandler {
   private final a a;
   private final i4.i b;
   private final Thread.UncaughtExceptionHandler c;
   private final y3.a d;
   private final AtomicBoolean e;

   public p(a var1, i4.i var2, Thread.UncaughtExceptionHandler var3, y3.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = new AtomicBoolean(false);
      this.d = var4;
   }

   private boolean b(Thread var1, Throwable var2) {
      if (var1 == null) {
         y3.f.f().d("Crashlytics will not record uncaught exception; null thread");
         return false;
      } else if (var2 == null) {
         y3.f.f().d("Crashlytics will not record uncaught exception; null throwable");
         return false;
      } else if (this.d.c()) {
         y3.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
         return false;
      } else {
         return true;
      }
   }

   boolean a() {
      return this.e.get();
   }

   public void uncaughtException(Thread var1, Throwable var2) {
      this.e.set(true);

      try {
         if (this.b(var1, var2)) {
            this.a.a(this.b, var1, var2);
         } else {
            y3.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
         }
      } catch (Exception var6) {
         y3.f.f().e("An error occurred in the uncaught exception handler", var6);
      } finally {
         y3.f.f().b("Completed exception processing. Invoking default exception handler.");
         this.c.uncaughtException(var1, var2);
         this.e.set(false);
      }

   }

   interface a {
      void a(i4.i var1, Thread var2, Throwable var3);
   }
}
