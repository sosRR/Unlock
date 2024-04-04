package m2;

import android.os.Process;

final class a extends Thread {
   a(ThreadGroup var1, String var2) {
      super(var1, "GmsDynamite");
   }

   public final void run() {
      Process.setThreadPriority(19);
      synchronized(this){}

      while(true) {
         Throwable var10000;
         boolean var10001;
         label129: {
            try {
               try {
                  this.wait();
                  continue;
               } catch (InterruptedException var17) {
               }
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label129;
            }

            label124:
            try {
               return;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label124;
            }
         }

         while(true) {
            Throwable var1 = var10000;

            try {
               throw var1;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
