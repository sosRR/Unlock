package x0;

import android.util.Log;

public abstract class k {
   private static k a;
   private static final int b = 20;

   public k(int var1) {
   }

   public static k c() {
      Class var1 = k.class;
      synchronized(k.class){}

      k var0;
      try {
         if (a == null) {
            var0 = new k(3) {
               private int c;

               public {
                  this.c = var1;
               }

               public void a(String var1, String var2, Throwable... var3) {
                  if (this.c <= 3 && var3 != null && var3.length >= 1) {
                     Throwable var4 = var3[0];
                  }

               }

               public void b(String var1, String var2, Throwable... var3) {
                  if (this.c <= 6) {
                     if (var3 != null && var3.length >= 1) {
                        Log.e(var1, var2, var3[0]);
                     } else {
                        Log.e(var1, var2);
                     }
                  }

               }

               public void d(String var1, String var2, Throwable... var3) {
                  if (this.c <= 4 && var3 != null && var3.length >= 1) {
                     Throwable var4 = var3[0];
                  }

               }

               public void g(String var1, String var2, Throwable... var3) {
                  if (this.c <= 2 && var3 != null && var3.length >= 1) {
                     Throwable var4 = var3[0];
                  }

               }

               public void h(String var1, String var2, Throwable... var3) {
                  if (this.c <= 5) {
                     if (var3 != null && var3.length >= 1) {
                        Log.w(var1, var2, var3[0]);
                     } else {
                        Log.w(var1, var2);
                     }
                  }

               }
            };
            a = var0;
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public static void e(k var0) {
      Class var1 = k.class;
      synchronized(k.class){}

      try {
         a = var0;
      } finally {
         ;
      }

   }

   public static String f(String var0) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(23);
      var3.append("WM-");
      int var1 = b;
      if (var2 >= var1) {
         var3.append(var0.substring(0, var1));
      } else {
         var3.append(var0);
      }

      return var3.toString();
   }

   public abstract void a(String var1, String var2, Throwable... var3);

   public abstract void b(String var1, String var2, Throwable... var3);

   public abstract void d(String var1, String var2, Throwable... var3);

   public abstract void g(String var1, String var2, Throwable... var3);

   public abstract void h(String var1, String var2, Throwable... var3);
}
