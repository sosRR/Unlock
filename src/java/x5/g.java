package x5;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

public class g {
   private g() {
   }

   public static boolean a(Object var0, Object var1) {
      boolean var2;
      if (var0 == null) {
         if (var1 == null) {
            var2 = true;
         } else {
            var2 = false;
         }
      } else {
         var2 = var0.equals(var1);
      }

      return var2;
   }

   public static void b(Object var0) {
      if (var0 == null) {
         k();
      }

   }

   public static void c(Object var0, String var1) {
      if (var0 == null) {
         l(var1);
      }

   }

   public static void d(Object var0, String var1) {
      if (var0 == null) {
         StringBuilder var2 = new StringBuilder();
         var2.append(var1);
         var2.append(" must not be null");
         throw (NullPointerException)h(new NullPointerException(var2.toString()));
      }
   }

   public static void e(Object var0, String var1) {
      if (var0 == null) {
         m(var1);
      }

   }

   public static int f(int var0, int var1) {
      byte var2;
      if (var0 < var1) {
         var2 = -1;
      } else if (var0 == var1) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      return var2;
   }

   private static String g(String var0) {
      StackTraceElement var2 = Thread.currentThread().getStackTrace()[4];
      String var1 = var2.getClassName();
      String var3 = var2.getMethodName();
      StringBuilder var4 = new StringBuilder();
      var4.append("Parameter specified as non-null is null: method ");
      var4.append(var1);
      var4.append(".");
      var4.append(var3);
      var4.append(", parameter ");
      var4.append(var0);
      return var4.toString();
   }

   private static Throwable h(Throwable var0) {
      return i(var0, g.class.getName());
   }

   static Throwable i(Throwable var0, String var1) {
      StackTraceElement[] var5 = var0.getStackTrace();
      int var4 = var5.length;
      int var3 = -1;

      for(int var2 = 0; var2 < var4; ++var2) {
         if (var1.equals(var5[var2].getClassName())) {
            var3 = var2;
         }
      }

      var0.setStackTrace((StackTraceElement[])Arrays.copyOfRange(var5, var3 + 1, var4));
      return var0;
   }

   public static String j(String var0, Object var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var0);
      var2.append(var1);
      return var2.toString();
   }

   public static void k() {
      throw (NullPointerException)h(new NullPointerException());
   }

   public static void l(String var0) {
      throw (NullPointerException)h(new NullPointerException(var0));
   }

   private static void m(String var0) {
      throw (NullPointerException)h(new NullPointerException(g(var0)));
   }

   public static void n(String var0) {
      throw (UninitializedPropertyAccessException)h(new UninitializedPropertyAccessException(var0));
   }

   public static void o(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("lateinit property ");
      var1.append(var0);
      var1.append(" has not been initialized");
      n(var1.toString());
   }
}
