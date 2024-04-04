package y2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

final class z implements c0 {
   private final Executor a;
   private final Object b = new Object();
   @Nullable
   @GuardedBy("mLock")
   private e c;

   public z(Executor var1, e var2) {
      this.a = var1;
      this.c = var2;
   }

   public final void c(g var1) {
      if (var1.o()) {
         Object var2 = this.b;
         synchronized(var2){}

         Throwable var10000;
         boolean var10001;
         label153: {
            try {
               if (this.c == null) {
                  return;
               }
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label153;
            }

            try {
               ;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label153;
            }

            this.a.execute(new y(this, var1));
            return;
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
}
