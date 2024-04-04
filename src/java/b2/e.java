package b2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

public class e extends f {
   public static final int d;
   private static final Object e = new Object();
   private static final e f = new e();
   private String c;

   static {
      d = b2.f.a;
   }

   public static e m() {
      return f;
   }

   public Intent b(Context var1, int var2, String var3) {
      return super.b(var1, var2, var3);
   }

   public PendingIntent c(Context var1, int var2, int var3) {
      return super.c(var1, var2, var3);
   }

   public final String e(int var1) {
      return super.e(var1);
   }

   public int g(Context var1) {
      return super.g(var1);
   }

   public int h(Context var1, int var2) {
      return super.h(var1, var2);
   }

   public final boolean j(int var1) {
      return super.j(var1);
   }

   public Dialog k(Activity var1, int var2, int var3, DialogInterface.OnCancelListener var4) {
      return this.p(var1, var2, e2.c0.b(var1, this.b(var1, var2, "d"), var3), var4);
   }

   public PendingIntent l(Context var1, b var2) {
      return var2.x() ? var2.w() : this.c(var1, var2.u(), 0);
   }

   public boolean n(Activity var1, int var2, int var3, DialogInterface.OnCancelListener var4) {
      Dialog var5 = this.k(var1, var2, var3, var4);
      if (var5 == null) {
         return false;
      } else {
         this.s(var1, var5, "GooglePlayServicesErrorDialog", var4);
         return true;
      }
   }

   public void o(Context var1, int var2) {
      this.t(var1, var2, (String)null, this.d(var1, var2, 0, "n"));
   }

   final Dialog p(Context var1, int var2, e2.c0 var3, DialogInterface.OnCancelListener var4) {
      AlertDialog.Builder var5 = null;
      if (var2 == 0) {
         return null;
      } else {
         TypedValue var6 = new TypedValue();
         var1.getTheme().resolveAttribute(16843529, var6, true);
         if ("Theme.Dialog.Alert".equals(var1.getResources().getResourceEntryName(var6.resourceId))) {
            var5 = new AlertDialog.Builder(var1, 5);
         }

         AlertDialog.Builder var9 = var5;
         if (var5 == null) {
            var9 = new AlertDialog.Builder(var1);
         }

         var9.setMessage(e2.z.d(var1, var2));
         if (var4 != null) {
            var9.setOnCancelListener(var4);
         }

         String var8 = e2.z.c(var1, var2);
         if (var8 != null) {
            var9.setPositiveButton(var8, var3);
         }

         String var7 = e2.z.g(var1, var2);
         if (var7 != null) {
            var9.setTitle(var7);
         }

         Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{var2}), new IllegalArgumentException());
         return var9.create();
      }
   }

   public final Dialog q(Activity var1, DialogInterface.OnCancelListener var2) {
      ProgressBar var3 = new ProgressBar(var1, (AttributeSet)null, 16842874);
      var3.setIndeterminate(true);
      var3.setVisibility(0);
      AlertDialog.Builder var4 = new AlertDialog.Builder(var1);
      var4.setView(var3);
      var4.setMessage(e2.z.d(var1, 18));
      var4.setPositiveButton("", (DialogInterface.OnClickListener)null);
      AlertDialog var5 = var4.create();
      this.s(var1, var5, "GooglePlayServicesUpdatingDialog", var2);
      return var5;
   }

   public final d2.p r(Context var1, d2.o var2) {
      IntentFilter var4 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
      var4.addDataScheme("package");
      d2.p var3 = new d2.p(var2);
      var1.registerReceiver(var3, var4);
      var3.a(var1);
      if (!this.i(var1, "com.google.android.gms")) {
         var2.a();
         var3.b();
         return null;
      } else {
         return var3;
      }
   }

   final void s(Activity var1, Dialog var2, String var3, DialogInterface.OnCancelListener var4) {
      label14: {
         boolean var5;
         try {
            var5 = var1 instanceof androidx.fragment.app.e;
         } catch (NoClassDefFoundError var7) {
            break label14;
         }

         if (var5) {
            androidx.fragment.app.m var9 = ((androidx.fragment.app.e)var1).x();
            k.f2(var2, var4).e2(var9, var3);
            return;
         }
      }

      FragmentManager var8 = var1.getFragmentManager();
      b2.c.a(var2, var4).show(var8, var3);
   }

   @TargetApi(20)
   final void t(Context param1, int param2, String param3, PendingIntent param4) {
      // $FF: Couldn't be decompiled
   }

   final void u(Context var1) {
      (new l(this, var1)).sendEmptyMessageDelayed(1, 120000L);
   }

   public final boolean v(Activity var1, d2.e var2, int var3, int var4, DialogInterface.OnCancelListener var5) {
      Dialog var6 = this.p(var1, var3, e2.c0.c(var2, this.b(var1, var3, "d"), 2), var5);
      if (var6 == null) {
         return false;
      } else {
         this.s(var1, var6, "GooglePlayServicesErrorDialog", var5);
         return true;
      }
   }

   public final boolean w(Context var1, b var2, int var3) {
      if (k2.a.a(var1)) {
         return false;
      } else {
         PendingIntent var4 = this.l(var1, var2);
         if (var4 != null) {
            this.t(var1, var2.u(), (String)null, o2.e.a(var1, 0, GoogleApiActivity.a(var1, var4, var3, true), o2.e.a | 134217728));
            return true;
         } else {
            return false;
         }
      }
   }
}
