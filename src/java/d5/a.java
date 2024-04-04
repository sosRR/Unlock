package d5;

import android.content.Context;
import android.net.Uri;
import com.tmobile.rsuapp.services.SimLockService;
import g5.h;

public class a {
   private static final String d = f.class.getSimpleName();
   private Context a;
   private <undefinedtype> b;
   private String c;

   public a(Context var1) {
      h6.a.b(d).a("AutoUnlockManager");
      this.a = var1;
      this.b = new h(this, null) {
         final a a;

         private {
            this.a = var1;
         }

         public void a(int var1, androidx.work.b var2) {
            String var5 = var2.j("key-action");
            String var6 = var2.j("key-result-string");
            var5.hashCode();
            int var4 = var5.hashCode();
            byte var3 = -1;
            switch (var4) {
               case -792964015:
                  if (var5.equals("com.tmobile.rsuapp.PERMANENT_UNLOCK")) {
                     var3 = 0;
                  }
                  break;
               case -373331745:
                  if (var5.equals("com.tmobile.rsuapp.REGISTER_KEY")) {
                     var3 = 1;
                  }
                  break;
               case -2908850:
                  if (var5.equals("com.tmobile.rsuapp.TEMPORARY_UNLOCK")) {
                     var3 = 2;
                  }
                  break;
               case 1851269107:
                  if (var5.equals("com.tmobile.rsuapp.CHECK_LOCK_STATUS")) {
                     var3 = 3;
                  }
            }

            a var7;
            switch (var3) {
               case 0:
               case 2:
                  if (var1 == 0) {
                     h6.a.b(d5.a.d).a("unlock successful");
                  } else {
                     h6.a.b(d5.a.d).a("unlock failed: %s", var6);
                  }
                  break;
               case 1:
                  if (var1 == 0) {
                     h6.a.b(d5.a.d).a("Successfully registered the key");
                     if (this.a.c != null) {
                        var7 = this.a;
                        var7.h(var7.c);
                        this.a.c = null;
                     }
                  } else {
                     h6.a.b(d5.a.d).a("Error registering the key: %s", var6);
                  }
                  break;
               case 3:
                  h6.a.b(d5.a.d).a("ACTION_CHECK_LOCK_STATUS");
                  if (e.l(this.a.a)) {
                     if (this.a.i()) {
                        this.a.h("com.tmobile.rsuapp.REGISTER_KEY");
                     } else if (this.a.c != null) {
                        var7 = this.a;
                        var7.h(var7.c);
                        this.a.c = null;
                     }
                  }
            }

         }
      };
   }

   private void h(String var1) {
      h6.a.b(d).a("launchAction: action = %s", var1);
      StringBuilder var2 = new StringBuilder();
      var2.append("launchAction: action = ");
      var2.append(var1);
      SimLockService.B(this.a, var1, (Uri)null, (androidx.work.b)null, this.b);
   }

   private boolean i() {
      boolean var1;
      if (!e.k(this.a) && !e.r(this.a)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void g() {
      h6.a.b(d).a("autoPermanentUnlock");
      this.c = "com.tmobile.rsuapp.PERMANENT_UNLOCK";
      this.h("com.tmobile.rsuapp.CHECK_LOCK_STATUS");
   }
}
