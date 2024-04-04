package g1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

class a$b extends a {
   final y0.i n;
   final String o;
   final boolean p;

   a$b(y0.i var1, String var2, boolean var3) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
   }

   void h() {
      WorkDatabase var1 = this.n.s();
      var1.c();

      label149: {
         Throwable var10000;
         label148: {
            boolean var10001;
            Iterator var2;
            try {
               var2 = var1.D().f(this.o).iterator();
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label148;
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
                  var1.t();
                  break label149;
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
      if (this.p) {
         this.g(this.n);
      }

   }
}
