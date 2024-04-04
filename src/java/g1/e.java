package g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

public class e {
   private final WorkDatabase a;

   public e(WorkDatabase var1) {
      this.a = var1;
   }

   public static void a(Context var0, q0.b var1) {
      SharedPreferences var6 = var0.getSharedPreferences("androidx.work.util.id", 0);
      if (var6.contains("next_job_scheduler_id") || var6.contains("next_job_scheduler_id")) {
         int var2 = var6.getInt("next_job_scheduler_id", 0);
         int var3 = var6.getInt("next_alarm_manager_id", 0);
         var1.c();

         try {
            var1.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", var2});
            var1.D("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", var3});
            var6.edit().clear().apply();
            var1.C();
         } finally {
            var1.b();
         }
      }

   }

   private int c(String var1) {
      this.a.c();

      int var2;
      label142: {
         Throwable var10000;
         label147: {
            boolean var10001;
            Long var4;
            try {
               var4 = this.a.z().a(var1);
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label147;
            }

            int var3 = 0;
            if (var4 != null) {
               try {
                  var2 = var4.intValue();
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label147;
               }
            } else {
               var2 = 0;
            }

            if (var2 != Integer.MAX_VALUE) {
               var3 = var2 + 1;
            }

            label133:
            try {
               this.e(var1, var3);
               this.a.t();
               break label142;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label133;
            }
         }

         Throwable var17 = var10000;
         this.a.g();
         throw var17;
      }

      this.a.g();
      return var2;
   }

   private void e(String var1, int var2) {
      this.a.z().b(new f1.d(var1, (long)var2));
   }

   public int b() {
      // $FF: Couldn't be decompiled
   }

   public int d(int var1, int var2) {
      Class var5 = e.class;
      synchronized(e.class){}

      Throwable var10000;
      boolean var10001;
      label203: {
         int var3;
         try {
            var3 = this.c("next_job_scheduler_id");
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label203;
         }

         if (var3 >= var1 && var3 <= var2) {
            var1 = var3;
         } else {
            try {
               this.e("next_job_scheduler_id", var1 + 1);
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label203;
            }
         }

         label188:
         try {
            return var1;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label188;
         }
      }

      while(true) {
         Throwable var4 = var10000;

         try {
            throw var4;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            continue;
         }
      }
   }
}
