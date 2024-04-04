package e2;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

public final class r0 {
   private static final Object a = new Object();
   @GuardedBy("sLock")
   private static boolean b;
   private static String c;
   private static int d;

   public static int a(Context var0) {
      b(var0);
      return d;
   }

   private static void b(Context param0) {
      // $FF: Couldn't be decompiled
   }
}
