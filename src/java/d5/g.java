package d5;

import android.content.Context;
import android.net.Uri;
import com.tmobile.rsucommon.errors.RsuException;
import i5.h;
import i5.i;

public class g {
   private static final String b = "g";
   private Context a;

   public g(Context var1) {
      this.a = var1;
   }

   public i5.a a(Uri var1) {
      h6.a.b(b).a("ackMessage");
      Object var3 = null;

      e5.b var2;
      try {
         var2 = new e5.b(this.a);
      } finally {
         ;
      }

      try {
         var1 = i5.b.a(var2.a((Uri)var1));
      } finally {
         if (var2 != null) {
            var2.f();
         }

         throw var1;
      }

   }

   public String b() {
      h6.a.b(b).a("getCarrier");

      e5.b var2;
      try {
         var2 = new e5.b(this.a);
      } finally {
         ;
      }

      String var1;
      try {
         var1 = var2.b();
      } finally {
         if (var2 != null) {
            var2.f();
         }

         throw var1;
      }

   }

   public String c() {
      h6.a.b(b).a("getImei");

      e5.b var2;
      try {
         var2 = new e5.b(this.a);
      } finally {
         ;
      }

      String var1;
      try {
         var1 = var2.c();
      } finally {
         if (var2 != null) {
            var2.f();
         }

         throw var1;
      }

   }

   public i5.d d() {
      h6.a.b(b).a("getSimlockStatus");

      e5.b var2;
      try {
         var2 = new e5.b(this.a);
      } finally {
         ;
      }

      i5.d var1;
      try {
         var1 = i5.b.b(var2.g());
      } finally {
         if (var2 != null) {
            var2.f();
         }

         throw var1;
      }

   }

   public i5.g e(Uri var1) {
      h6.a.b(b).a("UnlockEligibilityInfo");
      Object var2 = null;
      boolean var8 = false;

      e5.b var3;
      try {
         var8 = true;
         var3 = new e5.b(this.a);
         var8 = false;
      } finally {
         if (var8) {
            if (var2 != null) {
               ((e5.b)var2).f();
            }

         }
      }

      i5.g var11;
      try {
         var11 = i5.b.d(var3.d(var1));
      } finally {
         ;
      }

      var3.f();
      return var11;
   }

   public void f() {
      h6.a.b(b).a("rebootDevice");

      e5.b var1;
      label220: {
         Throwable var10000;
         e5.b var2;
         label221: {
            boolean var10001;
            RsuException var3;
            label222: {
               label212: {
                  try {
                     var1 = new e5.b(this.a);
                     break label212;
                  } catch (RsuException var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var1 = null;
                  break label222;
               }

               var2 = var1;

               try {
                  try {
                     var1.e();
                     break label220;
                  } catch (RsuException var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label221;
               }
            }

            var2 = var1;

            try {
               h6.a.b(b).a("Reboot failed!", var3);
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label221;
            }

            if (var1 == null) {
               return;
            }
            break label220;
         }

         Throwable var24 = var10000;
         if (var2 != null) {
            var2.f();
         }

         throw var24;
      }

      var1.f();
   }

   public i5.e g() {
      h6.a.b(b).a("register");

      e5.b var2;
      try {
         var2 = new e5.b(this.a);
      } finally {
         ;
      }

      i5.e var1;
      try {
         var1 = i5.b.c(var2.h());
      } finally {
         if (var2 != null) {
            var2.f();
         }

         throw var1;
      }

   }

   public h h(int var1) {
      h6.a.b(b).a("unlock");
      Object var3 = null;
      boolean var9 = false;

      e5.b var4;
      try {
         var9 = true;
         var4 = new e5.b(this.a);
         var9 = false;
      } finally {
         if (var9) {
            if (var3 != null) {
               ((e5.b)var3).f();
            }

         }
      }

      h var2;
      try {
         var2 = i5.b.e(var4.i(var1));
      } finally {
         ;
      }

      var4.f();
      return var2;
   }

   public i i(Uri var1) {
      h6.a.b(b).a("getImei");
      Object var2 = null;
      boolean var8 = false;

      e5.b var3;
      try {
         var8 = true;
         var3 = new e5.b(this.a);
         var8 = false;
      } finally {
         if (var8) {
            if (var2 != null) {
               ((e5.b)var2).f();
            }

         }
      }

      i var11;
      try {
         var11 = i5.b.f(var3.j(var1));
      } finally {
         ;
      }

      var3.f();
      return var11;
   }
}
