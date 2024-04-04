package j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b extends c {
   private final Object a = new Object();
   private final ExecutorService b = Executors.newFixedThreadPool(4, new b$a(this));
   private volatile Handler c;

   private static Handler e(Looper var0) {
      return Handler.createAsync(var0);
   }

   public void a(Runnable var1) {
      this.b.execute(var1);
   }

   public boolean c() {
      boolean var1;
      if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void d(Runnable var1) {
      if (this.c == null) {
         label150: {
            Object var2 = this.a;
            synchronized(var2){}

            Throwable var10000;
            boolean var10001;
            label144: {
               try {
                  if (this.c == null) {
                     this.c = e(Looper.getMainLooper());
                  }
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label144;
               }

               label141:
               try {
                  break label150;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label141;
               }
            }

            while(true) {
               Throwable var16 = var10000;

               try {
                  throw var16;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      this.c.post(var1);
   }
}
