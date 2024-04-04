package f1;

class r$b extends m0.a {
   final r d;

   r$b(r var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   }

   public void i(q0.f var1, p var2) {
      String var3 = var2.a;
      if (var3 == null) {
         var1.q(1);
      } else {
         var1.j(1, var3);
      }

      var1.B(2, (long)v.j(var2.b));
      var3 = var2.c;
      if (var3 == null) {
         var1.q(3);
      } else {
         var1.j(3, var3);
      }

      var3 = var2.d;
      if (var3 == null) {
         var1.q(4);
      } else {
         var1.j(4, var3);
      }

      byte[] var6 = androidx.work.b.m(var2.e);
      if (var6 == null) {
         var1.q(5);
      } else {
         var1.F(5, var6);
      }

      var6 = androidx.work.b.m(var2.f);
      if (var6 == null) {
         var1.q(6);
      } else {
         var1.F(6, var6);
      }

      var1.B(7, var2.g);
      var1.B(8, var2.h);
      var1.B(9, var2.i);
      var1.B(10, (long)var2.k);
      var1.B(11, (long)v.a(var2.l));
      var1.B(12, var2.m);
      var1.B(13, var2.n);
      var1.B(14, var2.o);
      var1.B(15, var2.p);
      var1.B(16, (long)var2.q);
      var1.B(17, (long)v.i(var2.r));
      x0.b var4 = var2.j;
      if (var4 != null) {
         var1.B(18, (long)v.h(var4.b()));
         var1.B(19, (long)var4.g());
         var1.B(20, (long)var4.h());
         var1.B(21, (long)var4.f());
         var1.B(22, (long)var4.i());
         var1.B(23, var4.c());
         var1.B(24, var4.d());
         byte[] var5 = v.c(var4.a());
         if (var5 == null) {
            var1.q(25);
         } else {
            var1.F(25, var5);
         }
      } else {
         var1.q(18);
         var1.q(19);
         var1.q(20);
         var1.q(21);
         var1.q(22);
         var1.q(23);
         var1.q(24);
         var1.q(25);
      }

   }
}
