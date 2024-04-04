package com.tmobile.rsuapp;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.tmobile.rsuapp.services.SimLockService;
import d5.a;
import d5.e;
import g5.h;
import java.time.Instant;
import java.util.Date;

public class CheckInWorker extends Worker {
   private static final String u = "CheckInWorker";
   private final Handler s = new Handler(Looper.getMainLooper());
   private final <undefinedtype> t = new h(this, (CheckInWorker$a)null) {
      final CheckInWorker a;

      private {
         this.a = var1;
      }

      public void a(int var1, b var2) {
         if ("com.tmobile.rsuapp.GET_ELIGIBILITY_INFO".equals(var2.j("key-action")) && var1 == 0 && e.m(this.a.a())) {
            (new a(this.a.a())).g();
         }

      }
   };

   public CheckInWorker(Context var1, WorkerParameters var2) {
      super(var1, var2);
   }

   public ListenableWorker.a q() {
      h6.a.b(u).a("doWork starting");
      Uri.Builder var1 = new Uri.Builder();
      var1.appendQueryParameter("client_version", "5.13.2");
      var1.appendQueryParameter("application_user_id", "RSU-s");
      if (!e.i(this.a())) {
         (new d5.b(this.a())).h();
      }

      SimLockService.B(this.a(), "com.tmobile.rsuapp.GET_ELIGIBILITY_INFO", var1.build(), (b)null, this.t);
      e.y(this.a(), Date.from(Instant.now()));
      return androidx.work.ListenableWorker.a.c();
   }
}
