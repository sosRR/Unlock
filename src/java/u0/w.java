package u0;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;

class w {
   private static boolean a;

   static u a(ViewGroup var0) {
      return new t(var0);
   }

   @SuppressLint({"NewApi"})
   private static void b(ViewGroup var0, boolean var1) {
      if (a) {
         try {
            v.a(var0, var1);
         } catch (NoSuchMethodError var2) {
            a = false;
         }
      }

   }

   static void c(ViewGroup var0, boolean var1) {
      if (VERSION.SDK_INT >= 29) {
         v.a(var0, var1);
      } else {
         b(var0, var1);
      }

   }
}
