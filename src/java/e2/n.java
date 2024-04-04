package e2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class n {
   public static void a(boolean var0) {
      if (!var0) {
         throw new IllegalArgumentException();
      }
   }

   public static void b(boolean var0, Object var1) {
      if (!var0) {
         throw new IllegalArgumentException(String.valueOf(var1));
      }
   }

   public static void c(Handler var0) {
      Looper var1 = Looper.myLooper();
      if (var1 != var0.getLooper()) {
         String var4;
         if (var1 != null) {
            var4 = var1.getThread().getName();
         } else {
            var4 = "null current looper";
         }

         String var3 = var0.getLooper().getThread().getName();
         StringBuilder var2 = new StringBuilder(String.valueOf(var3).length() + 36 + String.valueOf(var4).length());
         var2.append("Must be called on ");
         var2.append(var3);
         var2.append(" thread, but got ");
         var2.append(var4);
         var2.append(".");
         throw new IllegalStateException(var2.toString());
      }
   }

   public static void d(String var0) {
      if (!i2.q.a()) {
         throw new IllegalStateException(var0);
      }
   }

   @EnsuresNonNull({"#1"})
   public static String e(String var0) {
      if (!TextUtils.isEmpty(var0)) {
         return var0;
      } else {
         throw new IllegalArgumentException("Given String is empty or null");
      }
   }

   @EnsuresNonNull({"#1"})
   public static String f(String var0, Object var1) {
      if (!TextUtils.isEmpty(var0)) {
         return var0;
      } else {
         throw new IllegalArgumentException(String.valueOf(var1));
      }
   }

   public static void g() {
      h("Must not be called on the main application thread");
   }

   public static void h(String var0) {
      if (i2.q.a()) {
         throw new IllegalStateException(var0);
      }
   }

   @EnsuresNonNull({"#1"})
   public static Object i(Object var0) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException("null reference");
      }
   }

   @EnsuresNonNull({"#1"})
   public static Object j(Object var0, Object var1) {
      if (var0 != null) {
         return var0;
      } else {
         throw new NullPointerException(String.valueOf(var1));
      }
   }

   public static int k(int var0) {
      if (var0 != 0) {
         return var0;
      } else {
         throw new IllegalArgumentException("Given Integer is zero");
      }
   }

   public static void l(boolean var0) {
      if (!var0) {
         throw new IllegalStateException();
      }
   }

   public static void m(boolean var0, Object var1) {
      if (!var0) {
         throw new IllegalStateException(String.valueOf(var1));
      }
   }
}
