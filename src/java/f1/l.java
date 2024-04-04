package f1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

public final class l implements k {
   private final androidx.room.h a;
   private final m0.a b;

   public l(androidx.room.h var1) {
      this.a = var1;
      this.b = new l$a(this, var1);
   }

   public void a(j var1) {
      this.a.b();
      this.a.c();

      try {
         this.b.h(var1);
         this.a.t();
      } finally {
         this.a.g();
      }

   }

   public List b(String var1) {
      m0.c var2 = m0.c.g("SELECT name FROM workname WHERE work_spec_id=?", 1);
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.b();
      Cursor var10 = o0.c.b(this.a, var2, false, (CancellationSignal)null);

      ArrayList var3;
      label93: {
         Throwable var10000;
         label92: {
            boolean var10001;
            try {
               var3 = new ArrayList(var10.getCount());
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label92;
            }

            while(true) {
               try {
                  if (!var10.moveToNext()) {
                     break label93;
                  }

                  var3.add(var10.getString(0));
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var11 = var10000;
         var10.close();
         var2.x();
         throw var11;
      }

      var10.close();
      var2.x();
      return var3;
   }
}
