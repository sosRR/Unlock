package b2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b extends f2.a {
   public static final Parcelable.Creator CREATOR = new m();
   public static final b q = new b(0);
   final int m;
   private final int n;
   private final PendingIntent o;
   private final String p;

   public b(int var1) {
      this(var1, (PendingIntent)null, (String)null);
   }

   b(int var1, int var2, PendingIntent var3, String var4) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = var4;
   }

   public b(int var1, PendingIntent var2) {
      this(var1, var2, (String)null);
   }

   public b(int var1, PendingIntent var2, String var3) {
      this(1, var1, var2, var3);
   }

   static String z(int var0) {
      if (var0 != 99) {
         if (var0 != 1500) {
            switch (var0) {
               case -1:
                  return "UNKNOWN";
               case 0:
                  return "SUCCESS";
               case 1:
                  return "SERVICE_MISSING";
               case 2:
                  return "SERVICE_VERSION_UPDATE_REQUIRED";
               case 3:
                  return "SERVICE_DISABLED";
               case 4:
                  return "SIGN_IN_REQUIRED";
               case 5:
                  return "INVALID_ACCOUNT";
               case 6:
                  return "RESOLUTION_REQUIRED";
               case 7:
                  return "NETWORK_ERROR";
               case 8:
                  return "INTERNAL_ERROR";
               case 9:
                  return "SERVICE_INVALID";
               case 10:
                  return "DEVELOPER_ERROR";
               case 11:
                  return "LICENSE_CHECK_FAILED";
               default:
                  switch (var0) {
                     case 13:
                        return "CANCELED";
                     case 14:
                        return "TIMEOUT";
                     case 15:
                        return "INTERRUPTED";
                     case 16:
                        return "API_UNAVAILABLE";
                     case 17:
                        return "SIGN_IN_FAILED";
                     case 18:
                        return "SERVICE_UPDATING";
                     case 19:
                        return "SERVICE_MISSING_PERMISSION";
                     case 20:
                        return "RESTRICTED_PROFILE";
                     case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                     case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                     case 23:
                        return "API_DISABLED";
                     case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                     default:
                        StringBuilder var1 = new StringBuilder(31);
                        var1.append("UNKNOWN_ERROR_CODE(");
                        var1.append(var0);
                        var1.append(")");
                        return var1.toString();
                  }
            }
         } else {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
         }
      } else {
         return "UNFINISHED";
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof b)) {
         return false;
      } else {
         b var2 = (b)var1;
         return this.n == var2.n && e2.m.a(this.o, var2.o) && e2.m.a(this.p, var2.p);
      }
   }

   public int hashCode() {
      return e2.m.b(this.n, this.o, this.p);
   }

   public String toString() {
      e2.m.a var1 = e2.m.c(this);
      var1.a("statusCode", z(this.n));
      var1.a("resolution", this.o);
      var1.a("message", this.p);
      return var1.toString();
   }

   public int u() {
      return this.n;
   }

   public String v() {
      return this.p;
   }

   public PendingIntent w() {
      return this.o;
   }

   public void writeToParcel(Parcel var1, int var2) {
      int var3 = f2.b.a(var1);
      f2.b.i(var1, 1, this.m);
      f2.b.i(var1, 2, this.u());
      f2.b.m(var1, 3, this.w(), var2, false);
      f2.b.n(var1, 4, this.v(), false);
      f2.b.b(var1, var3);
   }

   public boolean x() {
      return this.n != 0 && this.o != null;
   }

   public boolean y() {
      return this.n == 0;
   }
}
