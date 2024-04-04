package g1;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

public class i {
   private static final String a = x0.k.f("ProcessUtils");

   @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
   public static String a(Context var0) {
      return Application.getProcessName();
   }

   public static boolean b(Context var0, androidx.work.a var1) {
      String var2 = a(var0);
      return !TextUtils.isEmpty(var1.c()) ? TextUtils.equals(var2, var1.c()) : TextUtils.equals(var2, var0.getApplicationInfo().processName);
   }
}
