package d5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class e {
   private static final String a = "e";

   public static void A(Context var0, boolean var1) {
      h6.a.b(a).a("setPermUnlockEligible");
      e(var0).edit().putBoolean("PERM_UNLOCK_ELIGIBLE", var1).apply();
   }

   public static void B(Context var0, Set var1) {
      e(var0).edit().putStringSet("PERM_UNLOCK_INELIGIBILITY_REASONS", var1).apply();
   }

   public static void C(Context var0, String var1) {
      h6.a.b(a).a("setProvider");
      e(var0).edit().putString("PROVIDER", var1).apply();
   }

   public static void D(Context var0, boolean var1) {
      h6.a.b(a).a("setRestartInProgress");
      e(var0).edit().putBoolean("RESTART_IN_PROGRESS", var1).apply();
   }

   public static void E(Context var0, boolean var1) {
      h6.a.b(a).a("setRestartRequired");
      e(var0).edit().putBoolean("RESTART_REQUIRED", var1).apply();
   }

   public static void F(Context var0, boolean var1) {
      h6.a.b(a).a("setTempUnlockEligible");
      e(var0).edit().putBoolean("TEMP_UNLOCK_ELIGIBLE", var1).apply();
   }

   public static void G(Context var0, Set var1) {
      h6.a.b(a).a("setTempUnlockIneligibilityReasons");
      e(var0).edit().putStringSet("TEMP_UNLOCK_INELIGIBILITY_REASONS", var1).apply();
   }

   public static void H(Context var0, long var1) {
      h6.a.b(a).a("setUnlockEndTime");
      e(var0).edit().putLong("UNLOCK_END_TIME", var1).apply();
   }

   public static void I(Context var0, int var1) {
      h6.a.b(a).a("setUnlockState");
      e(var0).edit().putInt("UNLOCK_STATE", var1).apply();
      e(var0).edit().putString("UNLOCK_MESSAGE", (String)null).apply();
      J(var0, false);
   }

   public static void J(Context var0, boolean var1) {
      h6.a.b(a).a("setUnlockTempReminderShowed");
      e(var0).edit().putBoolean("UNLOCK_TEMP_REMINDER_SHOWED", var1).apply();
   }

   public static void K(Context var0, String var1) {
      h6.a.b var2 = h6.a.b(a);
      StringBuilder var3 = new StringBuilder();
      var3.append("setUnlockedMessage: ");
      var3.append(var1);
      var2.a(var3.toString());
      e(var0).edit().putString("UNLOCK_MESSAGE", var1).apply();
   }

   public static void L(Context var0) {
      h6.a.b(a).a("setUnlockedPermanent");
      I(var0, 2);
   }

   public static void M(Context var0, long var1) {
      h6.a.b(a).a("setUnlockedTemporary");
      I(var0, 1);
      H(var0, var1);
   }

   public static Date a(Context var0) {
      h6.a.b(a).a("getLastCheckin");
      return new Date(e(var0).getLong("LAST_CHECKIN", 0L));
   }

   public static int b(Context var0) {
      h6.a.b(a).a("getLastKnownUnlockState");
      return e(var0).getInt("UNLOCK_STATE", -1);
   }

   public static List c(Context var0) {
      Set var1 = e(var0).getStringSet("PERM_UNLOCK_INELIGIBILITY_REASONS", (Set)null);
      return var1 != null ? new ArrayList(var1) : new ArrayList();
   }

   public static String d(Context var0) {
      h6.a.b(a).a("getProvider");
      return e(var0).getString("PROVIDER", "TMOBILE");
   }

   public static SharedPreferences e(Context var0) {
      return var0.getApplicationContext().getSharedPreferences("SIM.UNLOCK", 0);
   }

   public static List f(Context var0) {
      h6.a.b(a).a("getTempUnlockIneligibilityReasons");
      SharedPreferences var1 = e(var0);
      ArrayList var2 = null;
      Set var3 = var1.getStringSet("TEMP_UNLOCK_INELIGIBILITY_REASONS", (Set)null);
      if (var3 != null) {
         var2 = new ArrayList(var3);
      }

      return var2;
   }

   public static long g(Context var0) {
      h6.a.b(a).a("getUnlockEndTime");
      int var1 = b(var0);
      long var2 = -1L;
      if (var1 == 1) {
         var2 = e(var0).getLong("UNLOCK_END_TIME", -1L);
      }

      return var2;
   }

   public static String h(Context var0) {
      String var4 = e(var0).getString("UNLOCK_MESSAGE", (String)null);
      String var3 = var4;
      StringBuilder var5;
      h6.a.b var6;
      if (var4 == null) {
         if (r(var0)) {
            var3 = var0.getString(2131820786);
         } else {
            var3 = var4;
            if (s(var0)) {
               long var1 = g(var0);
               var3 = var4;
               if (var1 > 0L) {
                  var3 = DateFormat.format("MM/dd/yyyy", new Date(var1)).toString();
                  var3 = String.format(var0.getString(2131820787), new Object[]{var3});
               }

               var6 = h6.a.b(a);
               var5 = new StringBuilder();
               var5.append("getUnlockedMessage: until timestamp: ");
               var5.append(var1);
               var6.a(var5.toString());
            }
         }
      }

      var6 = h6.a.b(a);
      var5 = new StringBuilder();
      var5.append("getUnlockedMessage: ");
      var5.append(var3);
      var6.a(var5.toString());
      return var3;
   }

   public static boolean i(Context var0) {
      h6.a.b(a).a("isFirebaseKeyBeingRegistered");
      return e(var0).getBoolean("FIREBASE_KEY_BEING_REGISTERED", false);
   }

   public static boolean j(Context var0) {
      h6.a.b(a).a("isFirstBoot");
      return e(var0).getBoolean("FIRST_BOOT", true);
   }

   public static boolean k(Context var0) {
      h6.a.b(a).a("isKeyRegistered");
      return e(var0).getBoolean("KEY_REGISTERED", false);
   }

   public static boolean l(Context var0) {
      h6.a.b var3 = h6.a.b(a);
      boolean var2 = false;
      var3.a("isLocked");
      boolean var1 = var2;
      if (!s(var0)) {
         var1 = var2;
         if (b(var0) == -1) {
            var1 = true;
         }
      }

      return var1;
   }

   public static boolean m(Context var0) {
      h6.a.b(a).a("isPermUnlockEligible");
      return e(var0).getBoolean("PERM_UNLOCK_ELIGIBLE", true);
   }

   public static boolean n(Context var0) {
      h6.a.b(a).a("isRestartInProgress");
      return e(var0).getBoolean("RESTART_IN_PROGRESS", false);
   }

   public static boolean o(Context var0) {
      h6.a.b(a).a("isRestartRequired");
      return e(var0).getBoolean("RESTART_REQUIRED", false);
   }

   public static boolean p(Context var0) {
      h6.a.b(a).a("isTempUnlockEligible");
      return e(var0).getBoolean("TEMP_UNLOCK_ELIGIBLE", true);
   }

   public static boolean q(Context var0) {
      h6.a.b(a).a("isUnlockTempReminderShowed");
      return e(var0).getBoolean("UNLOCK_TEMP_REMINDER_SHOWED", false);
   }

   public static boolean r(Context var0) {
      h6.a.b var2 = h6.a.b(a);
      boolean var1 = false;
      var2.a("isUnlockedPermanent");
      if (b(var0) == 2) {
         var1 = true;
      }

      return var1;
   }

   public static boolean s(Context var0) {
      h6.a.b var2 = h6.a.b(a);
      boolean var1 = false;
      var2.a("isUnlockedTemporary");
      if (b(var0) == 1) {
         var1 = true;
      }

      return var1;
   }

   public static void t(Context var0, boolean var1) {
      h6.a.b(a).a("setFirebaseKeyBeingRegistered");
      e(var0).edit().putBoolean("FIREBASE_KEY_BEING_REGISTERED", var1).apply();
   }

   public static void u(Context var0, boolean var1) {
      h6.a.b(a).a("setFirebaseKeyRegistered");
      e(var0).edit().putBoolean("FIREBASE_KEY_REGISTERED", var1).apply();
   }

   public static void v(Context var0) {
      h6.a.b(a).a("setFirstBootDone");
      e(var0).edit().putBoolean("FIRST_BOOT", false).apply();
   }

   public static void w(Context var0) {
      h6.a.b(a).a("setKeyRegistered");
      e(var0).edit().putBoolean("KEY_REGISTERED", true).apply();
   }

   public static void x(Context var0, boolean var1) {
      h6.a.b(a).a("setKeyRegistered");
      e(var0).edit().putBoolean("KEY_REGISTERED", false).apply();
   }

   public static void y(Context var0, Date var1) {
      h6.a.b(a).a("setLastCheckin");
      e(var0).edit().putLong("LAST_CHECKIN", var1.getTime()).apply();
   }

   public static void z(Context var0) {
      h6.a.b(a).a("setLocked");
      I(var0, -1);
   }
}
