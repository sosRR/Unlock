package b2;

import android.util.Log;
import javax.annotation.Nullable;

class h0 {
   private static final h0 d = new h0(true, (String)null, (Throwable)null);
   final boolean a;
   @Nullable
   final String b;
   @Nullable
   final Throwable c;

   h0(boolean var1, @Nullable String var2, @Nullable Throwable var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   static h0 b() {
      return d;
   }

   static h0 c(String var0) {
      return new h0(false, var0, (Throwable)null);
   }

   static h0 d(String var0, Throwable var1) {
      return new h0(false, var0, var1);
   }

   @Nullable
   String a() {
      return this.b;
   }

   final void e() {
      if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
         if (this.c != null) {
            this.a();
            return;
         }

         this.a();
      }

   }
}
