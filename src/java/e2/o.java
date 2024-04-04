package e2;

public final class o {
   private static o b;
   private static final p c = new p(0, false, false, 0, 0);
   private p a;

   private o() {
   }

   public static o b() {
      Class var1 = o.class;
      synchronized(o.class){}

      o var0;
      try {
         if (b == null) {
            var0 = new o();
            b = var0;
         }

         var0 = b;
      } finally {
         ;
      }

      return var0;
   }

   public p a() {
      return this.a;
   }

   public final void c(p var1) {
      synchronized(this){}
      Throwable var10000;
      boolean var10001;
      if (var1 == null) {
         label172: {
            try {
               this.a = c;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label172;
            }

            return;
         }
      } else {
         label186: {
            p var4;
            try {
               var4 = this.a;
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label186;
            }

            if (var4 != null) {
               int var2;
               int var3;
               try {
                  var2 = var4.y();
                  var3 = var1.y();
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label186;
               }

               if (var2 >= var3) {
                  return;
               }
            }

            try {
               this.a = var1;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label186;
            }

            return;
         }
      }

      Throwable var26 = var10000;
      throw var26;
   }
}
