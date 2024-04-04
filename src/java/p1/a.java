package p1;

import android.util.Log;

public final class a {
   public static void a(String var0, String var1, Object var2) {
      if (Log.isLoggable(d(var0), 3)) {
         String.format(var1, new Object[]{var2});
      }

   }

   public static void b(String var0, String var1, Object... var2) {
      if (Log.isLoggable(d(var0), 3)) {
         String.format(var1, var2);
      }

   }

   public static void c(String var0, String var1, Throwable var2) {
      var0 = d(var0);
      if (Log.isLoggable(var0, 6)) {
         Log.e(var0, var1, var2);
      }

   }

   private static String d(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("TRuntime.");
      var1.append(var0);
      return var1.toString();
   }

   public static void e(String var0, String var1, Object var2) {
      if (Log.isLoggable(d(var0), 4)) {
         String.format(var1, new Object[]{var2});
      }

   }

   public static void f(String var0, String var1, Object var2) {
      var0 = d(var0);
      if (Log.isLoggable(var0, 5)) {
         Log.w(var0, String.format(var1, new Object[]{var2}));
      }

   }
}
