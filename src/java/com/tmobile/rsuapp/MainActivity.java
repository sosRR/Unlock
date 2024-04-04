package com.tmobile.rsuapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.work.b;
import com.tmobile.rsuapp.services.SimLockService;
import f5.d;
import f5.f;
import f5.g;
import f5.i;
import h6.a;

public class MainActivity extends c {
   private static final String P = "MainActivity";
   private Class J = null;
   private boolean K = true;
   private e L;
   private boolean M = true;
   private boolean N = true;
   private i O;

   // $FF: synthetic method
   static boolean S(MainActivity var0, boolean var1) {
      var0.N = var1;
      return var1;
   }

   private void X() {
      NotificationChannel var3 = new NotificationChannel("channel_app", "Application", 4);
      NotificationChannel var2 = new NotificationChannel("channel_service", "System Service", 1);
      NotificationManager var1 = (NotificationManager)this.getSystemService(NotificationManager.class);
      var1.createNotificationChannel(var3);
      var1.createNotificationChannel(var2);
   }

   private void a0(String var1, Uri var2) {
      a.b var3 = a.b(P);
      StringBuilder var4 = new StringBuilder();
      var4.append("launchAction: action = ");
      var4.append(var1);
      var3.a(var4.toString());
      SimLockService.B(this.getApplicationContext(), var1, var2, (b)null, this.L);
   }

   private void d0() {
      a.b(P).a("onDeviceLockStatusLocked");
      Uri.Builder var1 = new Uri.Builder();
      var1.appendQueryParameter("client_version", "5.13.2");
      var1.appendQueryParameter("application_user_id", "RSU-u");
      this.a0("com.tmobile.rsuapp.GET_ELIGIBILITY_INFO", var1.build());
   }

   private void e0() {
      a.b(P).a("onDeviceLockStatusUnlocked");
      this.Y();
      this.b0(g.class);
   }

   public void Y() {
      String var2 = P;
      a.b(var2).a("dismissProcessingDialog()");
      i var1 = this.O;
      if (var1 != null && var1.g0()) {
         this.O.T1();
         this.O = null;
         a.b(var2).a("dialog dismissed");
      }

   }

   public boolean Z() {
      return this.N;
   }

   public void b0(Class var1) {
      a.b var3 = a.b(P);
      StringBuilder var2 = new StringBuilder();
      var2.append("loadFragment: ");
      var2.append(var1.getSimpleName());
      var3.a(var2.toString());
      this.M = false;

      Fragment var5;
      try {
         var5 = (Fragment)var1.newInstance();
      } catch (Exception var4) {
         a.b(P).a("Failed to create new instance of fragment class.");
         throw new RuntimeException(var4);
      }

      u var6 = this.x().l();
      this.J = var1;
      var6.n(2131296533, var5).q(true).p(var5);
      if (this.K) {
         var6.h();
      } else {
         var6.g();
      }

   }

   public void c0(Class var1, Bundle var2) {
      a.b var3 = a.b(P);
      StringBuilder var4 = new StringBuilder();
      var4.append("loadFragment: ");
      var4.append(var1.getSimpleName());
      var3.a(var4.toString());
      this.M = false;

      Fragment var7;
      try {
         var7 = (Fragment)var1.newInstance();
      } catch (Exception var5) {
         a.b(P).a("Failed to create new instance of fragment class.");
         throw new RuntimeException(var5);
      }

      var7.E1(var2);
      u var6 = this.x().l();
      this.J = var1;
      var6.n(2131296533, var7).q(true).p(var7);
      if (this.K) {
         var6.h();
      } else {
         var6.g();
      }

   }

   public void f0() {
      a.b(P).a("onEligibilityInfoReceived");
      if (d5.e.r(this)) {
         this.b0(g.class);
      } else if (d5.e.s(this)) {
         this.b0(f5.c.class);
      } else {
         this.b0(d.class);
      }

   }

   public void g0(String var1) {
      a.b var3 = a.b(P);
      StringBuilder var2 = new StringBuilder();
      var2.append("showProcessingDialog: message = ");
      var2.append(var1);
      var3.a(var2.toString());
      if (this.O == null) {
         this.O = new i();
      }

      this.O.g2(var1);
      this.O.e2(this.x(), (String)null);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      a.a(new g5.c(this.getApplicationContext()));
      if (var1 == null) {
         this.K = false;
      }

      String var2 = P;
      a.b(var2).a("onCreate");
      a.b(var2).a("RSU App v%s", "5.13.2");
      if (this.L == null) {
         this.L = new e(this, (MainActivity$a)null);
      }

      this.X();
      this.setContentView(2131492892);
      this.O((Toolbar)this.findViewById(2131296761));
      ActionMenuView var3 = (ActionMenuView)this.findViewById(2131296320);
      var3.setDescendantFocusability(262144);
      var3.setOnFocusChangeListener(new MainActivity$a(this));
      Menu var4 = var3.getMenu();
      this.G().u(2131820792);
      this.G().s(true);
      this.getMenuInflater().inflate(2131558400, var4);
      var4.getItem(0).setOnMenuItemClickListener(new MainActivity$b(this));
      this.findViewById(2131296491).setOnKeyListener(new MainActivity$c(this));
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      if (var1.getItemId() == 16908332) {
         if (this.getParentActivityIntent() == null) {
            this.onBackPressed();
         } else {
            h.e(this);
         }

         return true;
      } else {
         return super.onOptionsItemSelected(var1);
      }
   }

   public void onRestoreInstanceState(Bundle var1) {
      a.b(P).a("onRestoreInstanceState");
      Class var2 = (Class)var1.getSerializable("CURRENT_CLASS");
      if (var2 != null) {
         this.K = true;
         this.b0(var2);
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      a.b(P).a("onSaveInstanceState");
      var1.putSerializable("CURRENT_CLASS", this.J);
      this.K = true;
      super.onSaveInstanceState(var1);
   }

   protected void onStart() {
      super.onStart();
      a.b(P).a("onStart");
      if (this.K) {
         this.K = false;
      } else {
         this.g0("Loading");
         g5.e.a(this, new MainActivity$d(this));
         this.a0("com.tmobile.rsuapp.REGISTER_KEY", (Uri)null);
      }
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         this.getWindow().getDecorView().setSystemUiVisibility(1024);
      }

   }

   private class e implements g5.h {
      final MainActivity a;

      private e(MainActivity var1) {
         this.a = var1;
      }

      // $FF: synthetic method
      e(MainActivity var1, MainActivity$a var2) {
         this(var1);
      }

      public void a(int var1, b var2) {
         String var3 = var2.j("key-action");
         String var4 = var2.j("key-result-string");
         if ("com.tmobile.rsuapp.CHECK_LOCK_STATUS".equals(var3)) {
            MainActivity.P;
            if (d5.e.r(this.a.getApplicationContext())) {
               this.a.e0();
            } else {
               this.a.d0();
            }
         } else {
            Bundle var5;
            if ("com.tmobile.rsuapp.GET_ELIGIBILITY_INFO".equals(var3)) {
               MainActivity.P;
               this.a.Y();
               if (var1 != 0) {
                  if (this.a.N) {
                     var5 = new Bundle();
                     var5.putString("key-error-string-arg", var4);
                     this.a.c0(f.class, var5);
                  }
               } else {
                  this.a.f0();
               }
            } else if ("com.tmobile.rsuapp.REGISTER_KEY".equals(var3)) {
               if (var1 == 0) {
                  MainActivity.P;
                  this.a.a0("com.tmobile.rsuapp.CHECK_LOCK_STATUS", (Uri)null);
               } else {
                  this.a.Y();
                  var5 = new Bundle();
                  var5.putString("key-error-string-arg", var4);
                  this.a.c0(f.class, var5);
               }
            }
         }

      }
   }
}
