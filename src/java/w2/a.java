package w2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e2.h0;
import e2.j0;
import e2.n;

public class a extends e2.g implements v2.f {
   public static final int M = 0;
   private final boolean I = true;
   private final e2.d J;
   private final Bundle K;
   private final Integer L;

   public a(Context var1, Looper var2, boolean var3, e2.d var4, Bundle var5, com.google.android.gms.common.api.c.a var6, com.google.android.gms.common.api.c.b var7) {
      super(var1, var2, 44, var4, (com.google.android.gms.common.api.c.a)var6, (com.google.android.gms.common.api.c.b)var7);
      this.J = var4;
      this.K = var5;
      this.L = var4.g();
   }

   public static Bundle l0(e2.d var0) {
      var0.f();
      Integer var2 = var0.g();
      Bundle var1 = new Bundle();
      var1.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", var0.a());
      if (var2 != null) {
         var1.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", var2);
      }

      var1.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
      var1.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
      var1.putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
      var1.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
      var1.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
      var1.putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
      var1.putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
      var1.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
      return var1;
   }

   protected final Bundle A() {
      String var1 = this.J.d();
      if (!this.y().getPackageName().equals(var1)) {
         this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
      }

      return this.K;
   }

   protected final String E() {
      return "com.google.android.gms.signin.internal.ISignInService";
   }

   protected final String F() {
      return "com.google.android.gms.signin.service.START";
   }

   public final void c(f var1) {
      e2.n.j(var1, "Expecting a valid ISignInCallbacks");

      RemoteException var10000;
      label39: {
         GoogleSignInAccount var2;
         Account var4;
         boolean var10001;
         label33: {
            try {
               var4 = this.J.b();
               if ("<<default account>>".equals(var4.name)) {
                  var2 = y1.a.a(this.y()).b();
                  break label33;
               }
            } catch (RemoteException var7) {
               var10000 = var7;
               var10001 = false;
               break label39;
            }

            var2 = null;
         }

         try {
            h0 var9 = new h0(var4, (Integer)e2.n.i(this.L), var2);
            g var10 = (g)this.D();
            j var12 = new j(1, var9);
            var10.l0(var12, var1);
            return;
         } catch (RemoteException var6) {
            var10000 = var6;
            var10001 = false;
         }
      }

      RemoteException var8 = var10000;
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");

      try {
         b2.b var11 = new b2.b(8, (PendingIntent)null);
         l var3 = new l(1, var11, (j0)null);
         var1.x(var3);
      } catch (RemoteException var5) {
         Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", var8);
      }
   }

   public final int g() {
      return 12451000;
   }

   public final boolean n() {
      return this.I;
   }

   public final void o() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   protected final IInterface s(IBinder var1) {
      g var3;
      if (var1 == null) {
         var3 = null;
      } else {
         IInterface var2 = var1.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
         if (var2 instanceof g) {
            var3 = (g)var2;
         } else {
            var3 = new g(var1);
         }
      }

      return var3;
   }
}
