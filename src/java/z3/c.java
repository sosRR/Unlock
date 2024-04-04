package z3;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a {
   private final e a;
   private final int b;
   private final TimeUnit c;
   private final Object d = new Object();
   private CountDownLatch e;
   private boolean f = false;

   public c(e var1, int var2, TimeUnit var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(String param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   public void l(String var1, Bundle var2) {
      CountDownLatch var3 = this.e;
      if (var3 != null) {
         if ("_ae".equals(var1)) {
            var3.countDown();
         }

      }
   }
}
