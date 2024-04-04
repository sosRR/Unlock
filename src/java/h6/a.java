package h6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public final class a {
   private static final b[] a;
   private static final List b;
   static volatile b[] c;
   private static final b d;

   static {
      b[] var0 = new b[0];
      a = var0;
      b = new ArrayList();
      c = var0;
      d = new a$a();
   }

   public static void a(b param0) {
      // $FF: Couldn't be decompiled
   }

   public static b b(String var0) {
      b[] var3 = c;
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1].a.set(var0);
      }

      return d;
   }

   public abstract static class b {
      final ThreadLocal a = new ThreadLocal();

      private String e(Throwable var1) {
         StringWriter var3 = new StringWriter(256);
         PrintWriter var2 = new PrintWriter(var3, false);
         var1.printStackTrace(var2);
         var2.flush();
         return var3.toString();
      }

      private void j(int var1, Throwable var2, String var3, Object... var4) {
         String var6 = this.f();
         if (this.h(var6, var1)) {
            String var5 = var3;
            if (var3 != null) {
               var5 = var3;
               if (var3.length() == 0) {
                  var5 = null;
               }
            }

            String var7;
            if (var5 == null) {
               if (var2 == null) {
                  return;
               }

               var7 = this.e(var2);
            } else {
               var3 = var5;
               if (var4 != null) {
                  var3 = var5;
                  if (var4.length > 0) {
                     var3 = this.d(var5, var4);
                  }
               }

               var7 = var3;
               if (var2 != null) {
                  StringBuilder var8 = new StringBuilder();
                  var8.append(var3);
                  var8.append("\n");
                  var8.append(this.e(var2));
                  var7 = var8.toString();
               }
            }

            this.i(var1, var6, var7, var2);
         }
      }

      public void a(String var1, Object... var2) {
         this.j(3, (Throwable)null, var1, var2);
      }

      public void b(String var1, Object... var2) {
         this.j(6, (Throwable)null, var1, var2);
      }

      public void c(Throwable var1, String var2, Object... var3) {
         this.j(6, var1, var2, var3);
      }

      protected String d(String var1, Object[] var2) {
         return String.format(var1, var2);
      }

      String f() {
         String var1 = (String)this.a.get();
         if (var1 != null) {
            this.a.remove();
         }

         return var1;
      }

      @Deprecated
      protected boolean g(int var1) {
         return true;
      }

      protected boolean h(String var1, int var2) {
         return this.g(var2);
      }

      protected abstract void i(int var1, String var2, String var3, Throwable var4);

      public void k(String var1, Object... var2) {
         this.j(5, (Throwable)null, var1, var2);
      }

      public void l(Throwable var1) {
         this.j(5, var1, (String)null);
      }

      public void m(Throwable var1, String var2, Object... var3) {
         this.j(5, var1, var2, var3);
      }
   }
}
