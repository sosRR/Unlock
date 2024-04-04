package y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e2.n;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

public class a {
   private static final Lock c = new ReentrantLock();
   @GuardedBy("sLk")
   private static a d;
   private final Lock a = new ReentrantLock();
   @GuardedBy("mLk")
   private final SharedPreferences b;

   a(Context var1) {
      this.b = var1.getSharedPreferences("com.google.android.gms.signin", 0);
   }

   public static a a(Context var0) {
      n.i(var0);
      Lock var1 = c;
      var1.lock();
      boolean var4 = false;

      a var6;
      try {
         var4 = true;
         if (d == null) {
            a var2 = new a(var0.getApplicationContext());
            d = var2;
         }

         var6 = d;
         var4 = false;
      } finally {
         if (var4) {
            c.unlock();
         }
      }

      var1.unlock();
      return var6;
   }

   private static final String d(String var0, String var1) {
      int var2 = String.valueOf(var1).length();
      StringBuilder var3 = new StringBuilder(var0.length() + 1 + var2);
      var3.append(var0);
      var3.append(":");
      var3.append(var1);
      return var3.toString();
   }

   public GoogleSignInAccount b() {
      String var2 = this.c("defaultGoogleSignInAccount");
      boolean var1 = TextUtils.isEmpty(var2);
      Object var3 = null;
      GoogleSignInAccount var6;
      if (var1) {
         var6 = (GoogleSignInAccount)var3;
      } else {
         String var4 = this.c(d("googleSignInAccount", var2));
         var6 = (GoogleSignInAccount)var3;
         if (var4 != null) {
            try {
               var6 = GoogleSignInAccount.F(var4);
            } catch (JSONException var5) {
               var6 = (GoogleSignInAccount)var3;
            }
         }
      }

      return var6;
   }

   protected final String c(String var1) {
      this.a.lock();

      try {
         var1 = this.b.getString(var1, (String)null);
      } finally {
         this.a.unlock();
      }

      return var1;
   }
}
