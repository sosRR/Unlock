package y2;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

final class d0 {
   private final Object a = new Object();
   @GuardedBy("mLock")
   private Queue b;
   @GuardedBy("mLock")
   private boolean c;

   public final void a(c0 var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (this.b == null) {
               ArrayDeque var3 = new ArrayDeque();
               this.b = var3;
            }
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            this.b.add(var1);
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var17 = var10000;

         try {
            throw var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   public final void b(g var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var77;
      Throwable var10000;
      boolean var10001;
      label676: {
         label678: {
            try {
               if (this.b != null && !this.c) {
                  break label678;
               }
            } catch (Throwable var76) {
               var10000 = var76;
               var10001 = false;
               break label676;
            }

            try {
               return;
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label676;
            }
         }

         try {
            this.c = true;
         } catch (Throwable var74) {
            var10000 = var74;
            var10001 = false;
            break label676;
         }

         while(true) {
            var2 = this.a;
            synchronized(var2){}

            label653: {
               c0 var3;
               try {
                  var3 = (c0)this.b.poll();
               } catch (Throwable var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label653;
               }

               if (var3 == null) {
                  label646:
                  try {
                     this.c = false;
                     return;
                  } catch (Throwable var71) {
                     var10000 = var71;
                     var10001 = false;
                     break label646;
                  }
               } else {
                  label649: {
                     try {
                        ;
                     } catch (Throwable var72) {
                        var10000 = var72;
                        var10001 = false;
                        break label649;
                     }

                     var3.c(var1);
                     continue;
                  }
               }
            }

            while(true) {
               var77 = var10000;

               try {
                  throw var77;
               } catch (Throwable var69) {
                  var10000 = var69;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      while(true) {
         var77 = var10000;

         try {
            throw var77;
         } catch (Throwable var70) {
            var10000 = var70;
            var10001 = false;
            continue;
         }
      }
   }
}
