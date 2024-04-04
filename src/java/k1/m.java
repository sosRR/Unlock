package k1;

import java.util.concurrent.Executor;

class m implements Executor {
   private final Executor m;

   m(Executor var1) {
      this.m = var1;
   }

   public void execute(Runnable var1) {
      this.m.execute(new a(var1));
   }

   static class a implements Runnable {
      private final Runnable m;

      a(Runnable var1) {
         this.m = var1;
      }

      public void run() {
         try {
            this.m.run();
         } catch (Exception var2) {
            p1.a.c("Executor", "Background execution failure.", var2);
         }

      }
   }
}
