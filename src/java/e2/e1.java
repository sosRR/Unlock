package e2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class e1 {
   private static final Uri f = (new Uri.Builder()).scheme("content").authority("com.google.android.gms.chimera").build();
   private final String a;
   private final String b;
   private final ComponentName c;
   private final int d;
   private final boolean e;

   public e1(String var1, String var2, int var3, boolean var4) {
      n.e(var1);
      this.a = var1;
      n.e(var2);
      this.b = var2;
      this.c = null;
      this.d = var3;
      this.e = var4;
   }

   public final int a() {
      return this.d;
   }

   public final ComponentName b() {
      return this.c;
   }

   public final Intent c(Context var1) {
      Intent var3;
      if (this.a != null) {
         boolean var2 = this.e;
         var3 = null;
         Object var4 = null;
         if (var2) {
            Bundle var8 = new Bundle();
            var8.putString("serviceActionBundleKey", this.a);

            Bundle var6;
            try {
               var6 = var1.getContentResolver().call(f, "serviceIntentCall", (String)null, var8);
            } catch (IllegalArgumentException var5) {
               Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(var5.toString()));
               var6 = null;
            }

            Intent var7;
            if (var6 == null) {
               var7 = (Intent)var4;
            } else {
               var7 = (Intent)var6.getParcelable("serviceResponseIntentKey");
            }

            var3 = var7;
            if (var7 == null) {
               String var9 = String.valueOf(this.a);
               if (var9.length() != 0) {
                  var9 = "Dynamic lookup for intent failed for action: ".concat(var9);
               } else {
                  var9 = new String("Dynamic lookup for intent failed for action: ");
               }

               Log.w("ConnectionStatusConfig", var9);
               var3 = var7;
            }
         }

         if (var3 == null) {
            return (new Intent(this.a)).setPackage(this.b);
         }
      } else {
         var3 = (new Intent()).setComponent(this.c);
      }

      return var3;
   }

   public final String d() {
      return this.b;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof e1)) {
         return false;
      } else {
         e1 var2 = (e1)var1;
         return m.a(this.a, var2.a) && m.a(this.b, var2.b) && m.a(this.c, var2.c) && this.d == var2.d && this.e == var2.e;
      }
   }

   public final int hashCode() {
      return m.b(this.a, this.b, this.c, this.d, this.e);
   }

   public final String toString() {
      String var2 = this.a;
      String var1 = var2;
      if (var2 == null) {
         n.i(this.c);
         var1 = this.c.flattenToString();
      }

      return var1;
   }
}
