package d2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import java.util.Collections;
import java.util.Set;

public final class g implements com.google.android.gms.common.api.a.f, ServiceConnection {
   private final String a;
   private final String b;
   private final ComponentName c;
   private final Context d;
   private final c e;
   private final Handler f;
   private final h g;
   private IBinder h;
   private boolean i;
   private String j;
   private String k;

   private final void s() {
      if (Thread.currentThread() != this.f.getLooper().getThread()) {
         throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
      }
   }

   private final void t(String var1) {
      String.valueOf(this.h);
   }

   public final boolean a() {
      this.s();
      return this.h != null;
   }

   public final Set b() {
      return Collections.emptySet();
   }

   public final void d(String var1) {
      this.s();
      this.j = var1;
      this.m();
   }

   public final void e(e2.i var1, Set var2) {
   }

   public final boolean f() {
      return false;
   }

   public final int g() {
      return 0;
   }

   public final void h(e2.c.c var1) {
      this.s();
      this.t("Connect started.");
      if (this.a()) {
         try {
            this.d("connect() called when already connected");
         } catch (Exception var4) {
         }
      }

      boolean var2;
      label42: {
         SecurityException var10000;
         label47: {
            boolean var10001;
            ComponentName var3;
            Intent var9;
            try {
               var9 = new Intent();
               var3 = this.c;
            } catch (SecurityException var8) {
               var10000 = var8;
               var10001 = false;
               break label47;
            }

            if (var3 != null) {
               try {
                  var9.setComponent(var3);
               } catch (SecurityException var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label47;
               }
            } else {
               try {
                  var9.setPackage(this.a).setAction(this.b);
               } catch (SecurityException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label47;
               }
            }

            try {
               var2 = this.d.bindService(var9, this, e2.h.a());
               this.i = var2;
               break label42;
            } catch (SecurityException var5) {
               var10000 = var5;
               var10001 = false;
            }
         }

         SecurityException var10 = var10000;
         this.i = false;
         this.h = null;
         throw var10;
      }

      if (!var2) {
         this.h = null;
         this.g.f(new b2.b(16));
      }

      this.t("Finished connect.");
   }

   public final boolean i() {
      this.s();
      return this.i;
   }

   public final b2.d[] j() {
      return new b2.d[0];
   }

   public final String k() {
      String var1 = this.a;
      if (var1 != null) {
         return var1;
      } else {
         e2.n.i(this.c);
         return this.c.getPackageName();
      }
   }

   public final String l() {
      return this.j;
   }

   public final void m() {
      this.s();
      this.t("Disconnect called.");

      try {
         this.d.unbindService(this);
      } catch (IllegalArgumentException var2) {
      }

      this.i = false;
      this.h = null;
   }

   public final boolean n() {
      return false;
   }

   // $FF: synthetic method
   final void o() {
      this.i = false;
      this.h = null;
      this.t("Disconnected.");
      this.e.h(1);
   }

   public final void onServiceConnected(ComponentName var1, IBinder var2) {
      this.f.post(new s(this, var2));
   }

   public final void onServiceDisconnected(ComponentName var1) {
      this.f.post(new r(this));
   }

   public final void p(e2.c.e var1) {
   }

   // $FF: synthetic method
   final void q(IBinder var1) {
      this.i = false;
      this.h = var1;
      this.t("Connected.");
      this.e.m(new Bundle());
   }

   public final void r(String var1) {
      this.k = var1;
   }
}
