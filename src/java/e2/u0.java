package e2;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class u0 extends q2.e {
   final c a;

   public u0(c var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   private static final void a(Message var0) {
      v0 var1 = (v0)var0.obj;
      var1.b();
      var1.e();
   }

   private static final boolean b(Message var0) {
      int var1 = var0.what;
      return var1 == 2 || var1 == 1 || var1 == 7;
   }

   public final void handleMessage(Message var1) {
      if (this.a.C.get() != var1.arg1) {
         if (b(var1)) {
            a(var1);
         }

      } else {
         int var2 = var1.what;
         if ((var2 == 1 || var2 == 7 || var2 == 4 && !this.a.t() || var1.what == 5) && !this.a.i()) {
            a(var1);
         } else {
            var2 = var1.what;
            PendingIntent var3 = null;
            b2.b var6;
            c var7;
            if (var2 == 4) {
               c.Z(this.a, new b2.b(var1.arg2));
               if (c.h0(this.a)) {
                  var7 = this.a;
                  if (!c.f0(var7)) {
                     c.b0(var7, 3, (IInterface)null);
                     return;
                  }
               }

               var7 = this.a;
               if (c.T(var7) != null) {
                  var6 = c.T(var7);
               } else {
                  var6 = new b2.b(8);
               }

               this.a.p.c(var6);
               this.a.L(var6);
            } else if (var2 == 5) {
               var7 = this.a;
               if (c.T(var7) != null) {
                  var6 = c.T(var7);
               } else {
                  var6 = new b2.b(8);
               }

               this.a.p.c(var6);
               this.a.L(var6);
            } else if (var2 == 3) {
               Object var4 = var1.obj;
               if (var4 instanceof PendingIntent) {
                  var3 = (PendingIntent)var4;
               }

               var6 = new b2.b(var1.arg2, var3);
               this.a.p.c(var6);
               this.a.L(var6);
            } else if (var2 == 6) {
               c.b0(this.a, 5, (IInterface)null);
               c var9 = this.a;
               if (c.U(var9) != null) {
                  c.U(var9).h(var1.arg2);
               }

               this.a.M(var1.arg2);
               c.g0(this.a, 5, 1, (IInterface)null);
            } else if (var2 == 2 && !this.a.a()) {
               a(var1);
            } else if (b(var1)) {
               ((v0)var1.obj).c();
            } else {
               var2 = var1.what;
               StringBuilder var8 = new StringBuilder(45);
               var8.append("Don't know how to handle message: ");
               var8.append(var2);
               Exception var5 = new Exception();
               Log.wtf("GmsClient", var8.toString(), var5);
            }
         }
      }
   }
}
