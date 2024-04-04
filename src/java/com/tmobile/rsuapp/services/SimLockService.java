package com.tmobile.rsuapp.services;

import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.tmobile.rsuapp.HistoryProvider;
import com.tmobile.rsucommon.errors.RsuException;
import d5.e;
import d5.g;
import g5.h;
import g5.i;
import h6.a;
import i5.d;
import java.util.Locale;
import x0.m;
import x0.o;
import x0.v;

public class SimLockService extends Worker {
   private static final String u = "SimLockService";
   private g s;
   private final Context t;

   public SimLockService(Context var1, WorkerParameters var2) {
      super(var1, var2);
      this.t = var1;
   }

   public static void A(Context var0, String var1) {
      B(var0, var1, (Uri)null, (b)null, (h)null);
   }

   public static void B(Context var0, String var1, Uri var2, b var3, h var4) {
      a.b(u).a("enqueueWork: %s", var1);
      b.a var5 = new b.a();
      var5.f("key-action", var1);
      if (var3 != null) {
         var5.c(var3);
      }

      if (var2 != null) {
         var5.f("key_uri", var2.toString());
      }

      m.a var6 = (m.a)(new m.a(SimLockService.class)).h(var5.a());
      if (VERSION.SDK_INT >= 31) {
         var6.f(o.m);
      }

      m var7 = (m)var6.b();
      v.f(var0).d(var7);
      if (var4 != null) {
         (new Handler(Looper.getMainLooper())).post(new SimLockService$a(var0, var7, var4));
      }

   }

   private String C(RsuException var1) {
      int var2 = var1.getErrorCode();
      int var4 = var1.getSleReturnCode();
      int var3 = var1.getSleVendorCode();
      String var6 = var1.getMessage();
      String var5;
      String var7;
      String var8;
      StringBuilder var9;
      if (var2 == 1) {
         if ("ERR_MSG_SLE_TIME_NOT_AVAILABLE".equals(var6)) {
            var5 = this.t.getString(2131820714);
         } else {
            var5 = this.t.getString(2131820713);
         }

         var8 = var5;
         if (!TextUtils.isEmpty(var5)) {
            var7 = String.format(Locale.US, "\n\n(SLE ERROR: ERROR CODE=%d VENDOR CODE=%d MSG=%s)", new Object[]{var4, var3, this.D(var6)});
            var9 = new StringBuilder();
            var9.append(var5);
            var9.append(var7);
            var8 = var9.toString();
         }
      } else {
         var7 = null;
         var8 = null;
         var5 = null;
         if (var2 == 2) {
            if ("ERR_MSG_SLE_NOT_REACHABLE".equals(var6)) {
               var5 = this.t.getString(2131820712);
            }

            var8 = var5;
            if (!TextUtils.isEmpty(var5)) {
               var7 = String.format(Locale.US, "\n\n(APP ERROR: ERROR CODE=%d VENDOR CODE=%d MSG=%s)", new Object[]{var4, var3, this.D(var6)});
               var9 = new StringBuilder();
               var9.append(var5);
               var9.append(var7);
               var8 = var9.toString();
            }
         } else if (var2 == 3) {
            if (this.E()) {
               var5 = this.t.getString(2131820711);
            } else {
               var5 = this.t.getString(2131820706);
            }

            var8 = var5;
            if (!TextUtils.isEmpty(var5)) {
               var7 = String.format(Locale.US, "\n\n(SERVER COMMUNICATION ERROR: ERROR CODE=%d MSG=%s)", new Object[]{var4, this.D(var6)});
               var9 = new StringBuilder();
               var9.append(var5);
               var9.append(var7);
               var8 = var9.toString();
            }
         } else if (var2 == 4) {
            if (var4 == 1) {
               var5 = this.t.getString(2131820715);
            } else if (var4 == 2) {
               var5 = this.t.getString(2131820716);
            } else if (var4 == 3) {
               var5 = this.t.getString(2131820717);
            } else if (var4 == 4) {
               var5 = this.t.getString(2131820718);
            } else {
               var5 = var7;
               if (!TextUtils.isEmpty(var6)) {
                  var5 = var7;
                  if (!var6.startsWith("ERR_MSG_")) {
                     var5 = var6;
                  }
               }
            }

            var8 = var5;
            if (!TextUtils.isEmpty(var5)) {
               var8 = String.format(Locale.US, "\n\n(SERVER ERROR: ERROR CODE=%d)", new Object[]{var4});
               StringBuilder var10 = new StringBuilder();
               var10.append(var5);
               var10.append(var8);
               var8 = var10.toString();
            }
         }
      }

      var5 = var8;
      if (var8 == null) {
         var8 = String.format(Locale.US, "\n\n(ERROR: ERROR CATEGORY=%d ERROR CODE=%d VENDOR CODE=%d MSG=%s)", new Object[]{var2, var4, var3, this.D(var6)});
         StringBuilder var11 = new StringBuilder();
         var11.append(this.t.getString(2131820709));
         var11.append(var8);
         var5 = var11.toString();
      }

      return var5;
   }

   private String D(String var1) {
      String var2 = var1;
      if (!TextUtils.isEmpty(var1)) {
         var2 = var1;
         if (var1.startsWith("ERR_MSG_")) {
            var2 = var1.replace("ERR_MSG_", "");
         }
      }

      return var2;
   }

   private boolean E() {
      a.b var3 = a.b(u);
      boolean var2 = false;
      var3.a("isActiveNetworkConnected");
      NetworkInfo var4 = ((ConnectivityManager)this.t.getSystemService("connectivity")).getActiveNetworkInfo();
      boolean var1 = var2;
      if (var4 != null) {
         var1 = var2;
         if (var4.isConnected()) {
            var1 = true;
         }
      }

      return var1;
   }

   private ListenableWorker.a F() {
      a.b(u).a("onHandleRequest");
      String var5 = this.g().j("key-action");
      Uri var4 = Uri.EMPTY;
      if (this.g().k("key_uri", String.class)) {
         var4 = Uri.parse(this.g().j("key_uri"));
      }

      ContentValues var6 = new ContentValues();

      boolean var1;
      int var2;
      StringBuilder var8;
      String var21;
      label134: {
         label133: {
            label144: {
               RsuException var20;
               label130: {
                  RsuException var10000;
                  label142: {
                     boolean var3;
                     boolean var10001;
                     try {
                        var3 = "com.tmobile.rsuapp.CHECK_LOCK_STATUS".equals(var5);
                     } catch (RsuException var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label142;
                     }

                     if (var3) {
                        try {
                           this.s();
                        } catch (RsuException var10) {
                           var20 = var10;
                           var1 = false;
                           break label130;
                        }

                        var21 = "";
                        var1 = false;
                        break label133;
                     }

                     try {
                        if ("com.tmobile.rsuapp.REGISTER_KEY".equals(var5)) {
                           var21 = this.x();
                           break label144;
                        }
                     } catch (RsuException var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.PERMANENT_UNLOCK".equals(var5)) {
                           var21 = this.w();
                           break label144;
                        }
                     } catch (RsuException var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.TEMPORARY_UNLOCK".equals(var5)) {
                           var21 = this.y(var6);
                           break label144;
                        }
                     } catch (RsuException var14) {
                        var10000 = var14;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.GET_IMEI".equals(var5)) {
                           var21 = this.v();
                           break label144;
                        }
                     } catch (RsuException var18) {
                        var10000 = var18;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.UPDATE_TOKEN".equals(var5)) {
                           var21 = this.z(var4);
                           break label144;
                        }
                     } catch (RsuException var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.ACK_MESSAGE".equals(var5)) {
                           var21 = this.r(var4);
                           break label144;
                        }
                     } catch (RsuException var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.GET_ELIGIBILITY_INFO".equals(var5)) {
                           var21 = this.u(var4);
                           break label144;
                        }
                     } catch (RsuException var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        if ("com.tmobile.rsuapp.GET_CARRIER".equals(var5)) {
                           var21 = this.t();
                           break label144;
                        }
                     } catch (RsuException var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label142;
                     }

                     try {
                        throw i5.m.a(-1, 2, -1, "ERR_MSG_INTERNAL_INVALID_OPERATION");
                     } catch (RsuException var9) {
                        var10000 = var9;
                        var10001 = false;
                     }
                  }

                  var20 = var10000;
                  var1 = true;
               }

               a.b var7 = a.b(u);
               var8 = new StringBuilder();
               var8.append("sleVendor: ");
               var8.append(var20.getSleVendorCode());
               var8.append(" errorCode: ");
               var8.append(var20.getErrorCode());
               var8.append(" sleReturnCode: ");
               var8.append(var20.getSleReturnCode());
               var8.append(" errorMessage: ");
               var8.append(var20.getMessage());
               var7.b(var8.toString());
               if (var20.getErrorCode() == 2 && 2 == var20.getSleVendorCode() && "ERR_MSG_INVALID_CORRELATION_ID".equals(var20.getMessage())) {
                  e.x(this.t, false);
               }

               var2 = var20.getErrorCode();
               var21 = this.C(var20);
               break label134;
            }

            var1 = true;
         }

         var2 = 0;
      }

      String var23 = u;
      var8 = new StringBuilder();
      var8.append("onHandleRequest: resultCode: ");
      var8.append(var2);
      var8.append(" resultString: ");
      var8.append(var21);
      b.a var24 = new b.a();
      if (var1) {
         var6.put("action", var5);
         var6.put("status", var2);
         var6.put("result", var21);
         var6.put("stamp", System.currentTimeMillis());
         Uri var22 = this.t.getContentResolver().insert(HistoryProvider.o, var6);
         if (var22 != null) {
            var24.f("key-result-uri", var22.toString());
         }
      }

      a.b(var23).a("Done with %s", var5);
      var24.f("key-action", var5);
      var24.f("key-result-string", var21);
      var24.e("key_result_code", var2);
      return androidx.work.ListenableWorker.a.d(var24.a());
   }

   private void G() {
      a.b(u).a("onRebootDevice");
      this.s.f();
   }

   private String r(Uri var1) {
      a.b(u).a("ACTION_ACK_MESSAGE");
      return this.s.a(var1).a();
   }

   private void s() {
      String var2 = u;
      a.b(var2).a("ACTION_CHECK_LOCK_STATUS");
      d var3 = this.s.d();
      byte var1 = var3.a();
      a.b(var2).a("lockStatusCode: %s", Integer.valueOf(var1));
      if (var1 == 0) {
         e.z(this.t);
      } else if (var1 == 1) {
         if (!e.s(this.t)) {
            e.M(this.t, System.currentTimeMillis() + (long)var3.c() * 1000L);
         } else {
            e.H(this.t, System.currentTimeMillis() + (long)var3.c() * 1000L);
         }

         if (!e.q(this.t)) {
            A(this.t, "com.tmobile.rsuapp.SCHEDULE_NOTIFICATIONS");
         }
      } else if (var1 == 2) {
         a.b(var2).a("Modem is permanently unlocked");
         e.L(this.t);
      }

   }

   private String t() {
      String var2 = u;
      a.b(var2).a("ACTION_GET_CARRIER");
      String var1 = this.s.b();
      if (var1 != null && !"".equals(var1)) {
         e.C(this.t, var1);
      } else {
         a.b(var2).a("actionGetCarrier returned null");
         e.C(this.t, "TMOBILE");
      }

      return var1;
   }

   private String u(Uri var1) {
      a.b(u).a("ACTION_GET_ELIGIBILITY_INFO");
      i5.g var4 = this.s.e(var1);
      g5.d var2 = new g5.d(var4.a());
      if (!var2.d()) {
         i var3;
         if (var2.f()) {
            var3 = var2.b();
            e.F(this.t, var3.a());
            e.G(this.t, var3.b());
         }

         if (var2.e()) {
            var3 = var2.a();
            e.A(this.t, var3.a());
            e.B(this.t, var3.b());
         }

         if (!"UNKNOWN".equals(var2.c()) && !"NULL".equals(var2.c()) && !"".equals(var2.c())) {
            e.C(this.t, var2.c());
         } else {
            this.t();
         }
      }

      return var4.a();
   }

   private String v() {
      a.b(u).a("ACTION_GET_IMEI");
      return this.s.c();
   }

   private String w() {
      a.b(u).a("ACTION_PERMANENT_UNLOCK");
      String var2 = this.s.h(2).d();
      e.L(this.t);
      e.K(this.t, var2);
      e.E(this.t, true);
      String var1 = var2;
      if (TextUtils.isEmpty(var2)) {
         var1 = e.h(this.t);
      }

      return var1;
   }

   private String x() {
      a.b(u).a("ACTION_REGISTER_KEY");
      String var2 = this.s.g().a();
      String var1 = var2;
      if (TextUtils.isEmpty(var2)) {
         var1 = this.t.getString(2131820774);
      }

      e.w(this.t);
      return var1;
   }

   private String y(ContentValues var1) {
      String var6 = u;
      a.b(var6).a("ACTION_TEMPORARY_UNLOCK");
      i5.h var5 = this.s.h(1);
      String var4 = var5.d();
      long var2 = System.currentTimeMillis() + (long)var5.c() * 1000L;
      a.b var9 = a.b(var6);
      StringBuilder var7 = new StringBuilder();
      var7.append("ACTION_TEMPORARY_UNLOCK until timestamp: ");
      var7.append(var2);
      var7.append(" with duration: ");
      var7.append((long)var5.c());
      var9.a(var7.toString());
      var1.put("until", var2);
      e.M(this.t, var2);
      e.K(this.t, var4);
      e.E(this.t, true);
      String var8 = var4;
      if (TextUtils.isEmpty(var4)) {
         var8 = e.h(this.t);
      }

      A(this.t, "com.tmobile.rsuapp.SCHEDULE_NOTIFICATIONS");
      return var8;
   }

   private String z(Uri var1) {
      a.b(u).a("ACTION_UPDATE_TOKEN");
      return this.s.i(var1).a();
   }

   public ListenableWorker.a q() {
      String var1 = this.g().j("key-action");
      a.b(u).a("onHandleIntent: %s", var1);
      this.s = new g(this.a());
      if ("com.tmobile.rsuapp.SCHEDULE_NOTIFICATIONS".equals(var1)) {
         d5.d.e(this.a());
      } else if ("com.tmobile.rsuapp.SHOW_EXPIRE_REMINDER_NOTIFICATION".equals(var1)) {
         d5.d.f(this.a());
      } else if ("com.tmobile.rsuapp.REBOOT_DEVICE".equals(var1)) {
         this.G();
      } else {
         if (!"com.tmobile.rsuapp.SHOW_RESTART_REMINDER_NOTIFICATION".equals(var1)) {
            return this.F();
         }

         d5.d.g(this.a());
      }

      return androidx.work.ListenableWorker.a.d((new b.a()).f("key-action", var1).a());
   }
}
