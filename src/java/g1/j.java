package g1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class j implements Executor {
   private final ArrayDeque m;
   private final Executor n;
   private final Object o;
   private volatile Runnable p;

   public j(Executor var1) {
      this.n = var1;
      this.m = new ArrayDeque();
      this.o = new Object();
   }

   public boolean a() {
      Object var2 = this.o;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label134: {
         boolean var1;
         label133: {
            label132: {
               try {
                  if (!this.m.isEmpty()) {
                     break label132;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label134;
               }

               var1 = false;
               break label133;
            }

            var1 = true;
         }

         label126:
         try {
            return var1;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label126;
         }
      }

      while(true) {
         Throwable var3 = var10000;

         try {
            throw var3;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   void b() {
      Object var1 = this.o;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label176: {
         Runnable var2;
         try {
            var2 = (Runnable)this.m.poll();
            this.p = var2;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label176;
         }

         if (var2 != null) {
            try {
               this.n.execute(this.p);
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            return;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label165;
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   public void execute(Runnable var1) {
      Object var2 = this.o;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            ArrayDeque var4 = this.m;
            a var3 = new a(this, var1);
            var4.add(var3);
            if (this.p == null) {
               this.b();
            }
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var18 = var10000;

         try {
            throw var18;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            continue;
         }
      }
   }

   static class a implements Runnable {
      final j m;
      final Runnable n;

      a(j var1, Runnable var2) {
         this.m = var1;
         this.n = var2;
      }

      public void run() {
         try {
            this.n.run();
         } finally {
            this.m.b();
         }

      }
   }
}
