package i2;

import android.content.Context;
import android.util.Log;

public final class f {
   private static final String[] a = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};

   public static boolean a(Context var0, Throwable var1) {
      try {
         e2.n.i(var0);
         e2.n.i(var1);
      } catch (Exception var2) {
         Log.e("CrashUtils", "Error adding exception to DropBox!", var2);
      }

      return false;
   }
}
