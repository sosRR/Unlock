package t0;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {
   private static long a;
   private static Method b;

   public static void a(String var0) {
      c.a(var0);
   }

   public static void b() {
      c.b();
   }

   private static void c(String var0, Exception var1) {
      if (var1 instanceof InvocationTargetException) {
         Throwable var2 = var1.getCause();
         if (var2 instanceof RuntimeException) {
            throw (RuntimeException)var2;
         } else {
            throw new RuntimeException(var2);
         }
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Unable to call ");
         var3.append(var0);
         var3.append(" via reflection");
      }
   }

   @SuppressLint({"NewApi"})
   public static boolean d() {
      try {
         if (b == null) {
            boolean var0 = t0.a.a();
            return var0;
         }
      } catch (NoClassDefFoundError | NoSuchMethodError var2) {
      }

      return e();
   }

   private static boolean e() {
      try {
         if (b == null) {
            a = Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
            b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
         }

         boolean var0 = (Boolean)b.invoke((Object)null, new Object[]{a});
         return var0;
      } catch (Exception var2) {
         c("isTagEnabled", var2);
         return false;
      }
   }
}
