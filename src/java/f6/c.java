package f6;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import m5.j;
import m5.k;
import x5.e;

public final class c {
   public static final b a;
   private static volatile Choreographer choreographer;

   static {
      Object var1 = null;

      j.a var0;
      Object var5;
      label32:
      try {
         var0 = j.m;
         a var6 = new a(a(Looper.getMainLooper(), true), (String)null, 2, (e)null);
         var5 = j.a(var6);
      } catch (Throwable var4) {
         var0 = j.m;
         var5 = j.a(k.a(var4));
         break label32;
      }

      if (j.c(var5)) {
         var5 = var1;
      }

      a = (b)var5;
   }

   public static final Handler a(Looper var0, boolean var1) {
      if (var1) {
         Object var2 = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object)null, new Object[]{var0});
         if (var2 != null) {
            return (Handler)var2;
         } else {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
         }
      } else {
         return new Handler(var0);
      }
   }
}
