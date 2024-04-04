package b2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
final class l extends o2.f {
   private final Context a;
   final e b;

   public l(e var1, Context var2) {
      this.b = var1;
      Looper var3;
      if (Looper.myLooper() == null) {
         var3 = Looper.getMainLooper();
      } else {
         var3 = Looper.myLooper();
      }

      super(var3);
      this.a = var2.getApplicationContext();
   }

   public final void handleMessage(Message var1) {
      int var2 = var1.what;
      if (var2 != 1) {
         StringBuilder var3 = new StringBuilder(50);
         var3.append("Don't know how to handle this message: ");
         var3.append(var2);
         Log.w("GoogleApiAvailability", var3.toString());
      } else {
         var2 = this.b.g(this.a);
         if (this.b.j(var2)) {
            this.b.o(this.a, var2);
         }

      }
   }
}
