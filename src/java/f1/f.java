package f1;

import android.database.Cursor;
import android.os.CancellationSignal;

public final class f implements e {
   private final androidx.room.h a;
   private final m0.a b;

   public f(androidx.room.h var1) {
      this.a = var1;
      this.b = new f$a(this, var1);
   }

   public Long a(String var1) {
      m0.c var3 = m0.c.g("SELECT long_value FROM Preference where `key`=?", 1);
      if (var1 == null) {
         var3.q(1);
      } else {
         var3.j(1, var1);
      }

      this.a.b();
      androidx.room.h var8 = this.a;
      Object var2 = null;
      Cursor var4 = o0.c.b(var8, var3, false, (CancellationSignal)null);
      Long var9 = (Long)var2;
      boolean var6 = false;

      label56: {
         try {
            var6 = true;
            if (!var4.moveToFirst()) {
               var6 = false;
               break label56;
            }

            if (!var4.isNull(0)) {
               var9 = var4.getLong(0);
               var6 = false;
               break label56;
            }

            var6 = false;
         } finally {
            if (var6) {
               var4.close();
               var3.x();
            }
         }

         var9 = (Long)var2;
      }

      var4.close();
      var3.x();
      return var9;
   }

   public void b(d var1) {
      this.a.b();
      this.a.c();

      try {
         this.b.h(var1);
         this.a.t();
      } finally {
         this.a.g();
      }

   }
}
