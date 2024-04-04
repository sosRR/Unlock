package g1;

class f$a$a implements Runnable {
   final Object m;
   final f$a n;

   f$a$a(f$a var1, Object var2) {
      this.n = var1;
      this.m = var2;
   }

   public void run() {
      Object var1 = this.n.c;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label290: {
         Object var2;
         Object var3;
         f$a var4;
         try {
            var2 = this.n.d.apply(this.m);
            var4 = this.n;
            var3 = var4.a;
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label290;
         }

         if (var3 == null && var2 != null) {
            try {
               var4.a = var2;
               var4.e.j(var2);
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label290;
            }
         } else if (var3 != null) {
            try {
               if (!var3.equals(var2)) {
                  f$a var37 = this.n;
                  var37.a = var2;
                  var37.e.j(var2);
               }
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label290;
            }
         }

         label272:
         try {
            return;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label272;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            continue;
         }
      }
   }
}
