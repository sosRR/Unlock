package t0;

import android.os.Trace;

final class c {
   public static void a(String var0) {
      Trace.beginSection(var0);
   }

   public static void b() {
      Trace.endSection();
   }
}
