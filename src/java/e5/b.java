package e5;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import i5.j;
import i5.m;

public class b {
   private static final String d = "b";
   private a a = null;
   private k5.a b = null;
   private Context c = null;

   public b(Context var1) {
      a var2 = new a(var1);
      k5.a var3 = var2.f();
      this.a = var2;
      this.b = var3;
      this.c = var1;
   }

   public byte[] a(Uri var1) {
      h6.a.b(d).a("ackMessage");

      try {
         byte[] var6 = this.b.z(var1);
         return var6;
      } catch (RemoteException var4) {
         h6.a.b var5 = h6.a.b(d);
         StringBuilder var2 = new StringBuilder();
         var2.append("Remote Exception: ");
         var2.append(var4.getMessage());
         var5.b(var2.toString());
         throw m.a(-1, 2, -1, var4.getMessage());
      }
   }

   public String b() {
      h6.a.b(d).a("getCarrier");

      String var5;
      try {
         var5 = this.b.N();
      } catch (RemoteException var4) {
         h6.a.b var2 = h6.a.b(d);
         StringBuilder var3 = new StringBuilder();
         var3.append("Remote Exception: ");
         var3.append(var4.getMessage());
         var2.b(var3.toString());
         throw m.a(-1, 2, -1, var4.getMessage());
      }

      String var1 = var5;
      if (var5 == null) {
         if (!h5.a.a) {
            throw m.a(-1, 2, -1, "Null Carrier returned");
         }

         var1 = "1";
      }

      return var1;
   }

   public String c() {
      h6.a.b(d).a("getImei");

      String var5;
      try {
         var5 = this.b.X();
      } catch (RemoteException var4) {
         h6.a.b var2 = h6.a.b(d);
         StringBuilder var3 = new StringBuilder();
         var3.append("Remote Exception: ");
         var3.append(var4.getMessage());
         var2.b(var3.toString());
         throw m.a(-1, 2, -1, var4.getMessage());
      }

      String var1 = var5;
      if (var5 == null) {
         if (!h5.a.a) {
            throw m.a(-1, 2, -1, "Null IMEI returned");
         }

         var1 = "1";
      }

      return var1;
   }

   public byte[] d(Uri var1) {
      h6.a.b(d).a("getUnlockEligibilityInfo");

      try {
         byte[] var6 = this.b.k0(var1);
         return var6;
      } catch (Exception var4) {
         h6.a.b var3 = h6.a.b(d);
         StringBuilder var5 = new StringBuilder();
         var5.append("Remote Exception: ");
         var5.append(var4.getMessage());
         var3.b(var5.toString());
         throw m.a(-1, 2, -1, var4.getMessage());
      }
   }

   public void e() {
      h6.a.b(d).a("rebootDevice");

      try {
         this.b.K();
      } catch (RemoteException var4) {
         h6.a.b var2 = h6.a.b(d);
         StringBuilder var1 = new StringBuilder();
         var1.append("Remote Exception: ");
         var1.append(var4.getMessage());
         var2.b(var1.toString());
      }

   }

   public void f() {
      h6.a.b(d).a("release");
      a var1 = this.a;
      if (var1 != null) {
         var1.e(this.c);
         this.a = null;
         this.b = null;
         this.c = null;
      }

   }

   public byte[] g() {
      h6.a.b(d).a("rsuGetSimlockStatus");

      byte[] var1;
      try {
         var1 = this.b.n();
      } catch (RemoteException var2) {
         h6.a.b(d).c(var2, "Remote Exception: ");
         throw m.a(-1, 2, -1, var2.getMessage());
      }

      j.a(var1);
      return var1;
   }

   public byte[] h() {
      h6.a.b(d).a("rsuRegister");

      byte[] var1;
      try {
         var1 = this.b.v();
      } catch (RemoteException var2) {
         h6.a.b(d).c(var2, "Remote Exception: ");
         throw m.a(-1, 2, -1, var2.getMessage());
      }

      j.a(var1);
      return var1;
   }

   public byte[] i(int var1) {
      h6.a.b(d).a("rsuUnlock");

      byte[] var2;
      try {
         var2 = this.b.e0(var1);
      } catch (RemoteException var3) {
         h6.a.b(d).c(var3, "Remote Exception: ");
         throw m.a(-1, 2, -1, var3.getMessage());
      }

      j.a(var2);
      return var2;
   }

   public byte[] j(Uri var1) {
      h6.a.b(d).a("updateToken");

      try {
         byte[] var6 = this.b.T(var1);
         return var6;
      } catch (RemoteException var4) {
         h6.a.b var5 = h6.a.b(d);
         StringBuilder var3 = new StringBuilder();
         var3.append("Remote Exception: ");
         var3.append(var4.getMessage());
         var5.b(var3.toString());
         throw m.a(-1, 2, -1, var4.getMessage());
      }
   }
}
