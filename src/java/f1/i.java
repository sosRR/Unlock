package f1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

public final class i implements h {
   private final androidx.room.h a;
   private final m0.a b;
   private final m0.d c;

   public i(androidx.room.h var1) {
      this.a = var1;
      this.b = new i$a(this, var1);
      this.c = new m0.d(this, var1) {
         final i d;

         {
            this.d = var1;
         }

         public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
         }
      };
   }

   public void a(g var1) {
      this.a.b();
      this.a.c();

      try {
         this.b.h(var1);
         this.a.t();
      } finally {
         this.a.g();
      }

   }

   public List b() {
      m0.c var2 = m0.c.g("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
      this.a.b();
      Cursor var1 = o0.c.b(this.a, var2, false, (CancellationSignal)null);

      ArrayList var3;
      label78: {
         Throwable var10000;
         label77: {
            boolean var10001;
            try {
               var3 = new ArrayList(var1.getCount());
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label77;
            }

            while(true) {
               try {
                  if (!var1.moveToNext()) {
                     break label78;
                  }

                  var3.add(var1.getString(0));
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var10 = var10000;
         var1.close();
         var2.x();
         throw var10;
      }

      var1.close();
      var2.x();
      return var3;
   }

   public g c(String var1) {
      m0.c var4 = m0.c.g("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
      if (var1 == null) {
         var4.q(1);
      } else {
         var4.j(1, var1);
      }

      this.a.b();
      androidx.room.h var5 = this.a;
      g var8 = null;
      Cursor var9 = o0.c.b(var5, var4, false, (CancellationSignal)null);

      try {
         int var2 = o0.b.c(var9, "work_spec_id");
         int var3 = o0.b.c(var9, "system_id");
         if (var9.moveToFirst()) {
            var8 = new g(var9.getString(var2), var9.getInt(var3));
         }
      } finally {
         var9.close();
         var4.x();
      }

      return var8;
   }

   public void d(String var1) {
      this.a.b();
      q0.f var2 = this.c.a();
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.c();

      try {
         var2.n();
         this.a.t();
      } finally {
         this.a.g();
         this.c.f(var2);
      }

   }
}
