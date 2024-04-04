package f1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {
   private final androidx.room.h a;
   private final m0.a b;

   public c(androidx.room.h var1) {
      this.a = var1;
      this.b = new c$a(this, var1);
   }

   public boolean a(String var1) {
      boolean var4 = true;
      m0.c var5 = m0.c.g("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
      if (var1 == null) {
         var5.q(1);
      } else {
         var5.j(1, var1);
      }

      this.a.b();
      androidx.room.h var10 = this.a;
      boolean var3 = false;
      Cursor var6 = o0.c.b(var10, var5, false, (CancellationSignal)null);
      boolean var8 = false;

      label52: {
         int var2;
         try {
            var8 = true;
            if (!var6.moveToFirst()) {
               var8 = false;
               break label52;
            }

            var2 = var6.getInt(0);
            var8 = false;
         } finally {
            if (var8) {
               var6.close();
               var5.x();
            }
         }

         if (var2 != 0) {
            var3 = var4;
         } else {
            var3 = false;
         }
      }

      var6.close();
      var5.x();
      return var3;
   }

   public boolean b(String var1) {
      boolean var4 = true;
      m0.c var5 = m0.c.g("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
      if (var1 == null) {
         var5.q(1);
      } else {
         var5.j(1, var1);
      }

      this.a.b();
      androidx.room.h var10 = this.a;
      boolean var3 = false;
      Cursor var11 = o0.c.b(var10, var5, false, (CancellationSignal)null);
      boolean var8 = false;

      label52: {
         int var2;
         try {
            var8 = true;
            if (!var11.moveToFirst()) {
               var8 = false;
               break label52;
            }

            var2 = var11.getInt(0);
            var8 = false;
         } finally {
            if (var8) {
               var11.close();
               var5.x();
            }
         }

         if (var2 != 0) {
            var3 = var4;
         } else {
            var3 = false;
         }
      }

      var11.close();
      var5.x();
      return var3;
   }

   public void c(a var1) {
      this.a.b();
      this.a.c();

      try {
         this.b.h(var1);
         this.a.t();
      } finally {
         this.a.g();
      }

   }

   public List d(String var1) {
      m0.c var2 = m0.c.g("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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
