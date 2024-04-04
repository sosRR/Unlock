package y2;

final class s implements Runnable {
   final t m;

   s(t var1) {
      this.m = var1;
   }

   public final void run() {
      Object var1 = t.b(this.m);
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            t var2 = this.m;
            if (t.a(var2) != null) {
               t.a(var2).a();
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
