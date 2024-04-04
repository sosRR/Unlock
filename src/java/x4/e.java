package x4;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

class e {
   private static final long d;
   private static final long e;
   private final h a = h.c();
   private long b;
   private int c;

   static {
      d = TimeUnit.HOURS.toMillis(24L);
      e = TimeUnit.MINUTES.toMillis(30L);
   }

   private long a(int var1) {
      synchronized(this){}
      boolean var9 = false;

      double var2;
      long var4;
      try {
         var9 = true;
         if (!c(var1)) {
            var4 = d;
            var9 = false;
            return var4;
         }

         var2 = Math.min(Math.pow(2.0, (double)this.c) + (double)this.a.e(), (double)e);
         var9 = false;
      } finally {
         if (var9) {
            ;
         }
      }

      var4 = (long)var2;
      return var4;
   }

   private static boolean c(int var0) {
      boolean var1;
      if (var0 == 429 || var0 >= 500 && var0 < 600) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean d(int var0) {
      boolean var1;
      if ((var0 < 200 || var0 >= 300) && var0 != 401 && var0 != 404) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private void e() {
      synchronized(this){}

      try {
         this.c = 0;
      } finally {
         ;
      }

   }

   public boolean b() {
      synchronized(this){}
      boolean var9 = false;

      boolean var1;
      label46: {
         long var2;
         long var4;
         try {
            var9 = true;
            if (this.c == 0) {
               var9 = false;
               break label46;
            }

            var4 = this.a.a();
            var2 = this.b;
            var9 = false;
         } finally {
            if (var9) {
               ;
            }
         }

         if (var4 <= var2) {
            var1 = false;
            return var1;
         }
      }

      var1 = true;
      return var1;
   }

   public void f(int var1) {
      synchronized(this){}

      try {
         if (d(var1)) {
            this.e();
            return;
         }

         ++this.c;
         long var2 = this.a(var1);
         this.b = this.a.a() + var2;
      } finally {
         ;
      }

   }
}
