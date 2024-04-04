package g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

public class h {
   private final WorkDatabase a;

   public h(WorkDatabase var1) {
      this.a = var1;
   }

   public static void b(Context var0, q0.b var1) {
      SharedPreferences var8 = var0.getSharedPreferences("androidx.work.util.preferences", 0);
      if (var8.contains("reschedule_needed") || var8.contains("last_cancel_all_time_ms")) {
         long var2 = 0L;
         long var4 = var8.getLong("last_cancel_all_time_ms", 0L);
         if (var8.getBoolean("reschedule_needed", false)) {
            var2 = 1L;
         }

         var1.c();

         try {
            var1.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", var4});
            var1.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", var2});
            var8.edit().clear().apply();
            var1.C();
         } finally {
            var1.b();
         }
      }

   }

   public boolean a() {
      Long var2 = this.a.z().a("reschedule_needed");
      boolean var1;
      if (var2 != null && var2 == 1L) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c(long var1) {
      f1.d var3 = new f1.d("last_cancel_all_time_ms", var1);
      this.a.z().b(var3);
   }

   public void d(boolean var1) {
      f1.d var2 = new f1.d("reschedule_needed", var1);
      this.a.z().b(var2);
   }
}
