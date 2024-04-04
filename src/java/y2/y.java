package y2;

final class y implements Runnable {
   final g m;
   final z n;

   y(z var1, g var2) {
      this.n = var1;
      this.m = var2;
   }

   public final void run() {
      Object var1 = z.b(this.n);
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            z var2 = this.n;
            if (z.a(var2) != null) {
               z.a(var2).b(this.m.k());
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
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
