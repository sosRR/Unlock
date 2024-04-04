package k2;

import android.content.Context;

public class c {
   private static c b = new c();
   private b a = null;

   public static b a(Context var0) {
      return b.b(var0);
   }

   public final b b(Context var1) {
      synchronized(this){}

      Throwable var10000;
      label190: {
         boolean var10001;
         b var24;
         label195: {
            try {
               if (this.a != null) {
                  break label195;
               }
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label190;
            }

            Context var2 = var1;

            try {
               if (var1.getApplicationContext() != null) {
                  var2 = var1.getApplicationContext();
               }
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label190;
            }

            try {
               var24 = new b(var2);
               this.a = var24;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label190;
            }
         }

         label176:
         try {
            var24 = this.a;
            return var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label176;
         }
      }

      Throwable var25 = var10000;
      throw var25;
   }
}
