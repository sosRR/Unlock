package g1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

class a$c extends a {
   final y0.i n;

   a$c(y0.i var1) {
      this.n = var1;
   }

   void h() {
      WorkDatabase var1 = this.n.s();
      var1.c();

      label133: {
         Throwable var10000;
         label132: {
            boolean var10001;
            Iterator var2;
            try {
               var2 = var1.D().c().iterator();
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label132;
            }

            while(true) {
               try {
                  if (var2.hasNext()) {
                     String var3 = (String)var2.next();
                     this.a(this.n, var3);
                     continue;
                  }
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break;
               }

               try {
                  h var17 = new h(this.n.s());
                  var17.c(System.currentTimeMillis());
                  var1.t();
                  break label133;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var16 = var10000;
         var1.g();
         throw var16;
      }

      var1.g();
   }
}
