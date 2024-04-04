package w3;

public class t implements t4.b {
   private static final Object c = new Object();
   private volatile Object a;
   private volatile t4.b b;

   public t(t4.b var1) {
      this.a = c;
      this.b = var1;
   }

   public Object get() {
      Object var2 = this.a;
      Object var3 = c;
      Object var1 = var2;
      if (var2 == var3) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label206: {
            try {
               var2 = this.a;
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label206;
            }

            var1 = var2;
            if (var2 == var3) {
               try {
                  var1 = this.b.get();
                  this.a = var1;
                  this.b = null;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label206;
               }
            }

            label193:
            try {
               return var1;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label193;
            }
         }

         while(true) {
            Throwable var25 = var10000;

            try {
               throw var25;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               continue;
            }
         }
      } else {
         return var1;
      }
   }
}
