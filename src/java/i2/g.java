package i2;

import android.os.SystemClock;

public class g implements d {
   private static final g a = new g();

   private g() {
   }

   public static d d() {
      return a;
   }

   public final long a() {
      return System.currentTimeMillis();
   }

   public final long b() {
      return SystemClock.elapsedRealtime();
   }

   public final long c() {
      return System.nanoTime();
   }
}
