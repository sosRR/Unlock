package b4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class d {
   private final Float a;
   private final boolean b;

   private d(Float var1, boolean var2) {
      this.b = var2;
      this.a = var1;
   }

   public static d a(Context var0) {
      boolean var3 = false;
      boolean var2 = false;
      Object var4 = null;
      boolean var1 = var2;

      Float var11;
      label63: {
         IllegalStateException var10000;
         label56: {
            IntentFilter var5;
            boolean var10001;
            try {
               var5 = new IntentFilter;
            } catch (IllegalStateException var10) {
               var10000 = var10;
               var10001 = false;
               break label56;
            }

            var1 = var2;

            try {
               var5.<init>("android.intent.action.BATTERY_CHANGED");
            } catch (IllegalStateException var9) {
               var10000 = var9;
               var10001 = false;
               break label56;
            }

            var1 = var2;

            Intent var13;
            try {
               var13 = var0.registerReceiver((BroadcastReceiver)null, var5);
            } catch (IllegalStateException var8) {
               var10000 = var8;
               var10001 = false;
               break label56;
            }

            var1 = var3;
            var11 = (Float)var4;
            if (var13 == null) {
               return new d(var11, var1);
            }

            var1 = var2;

            try {
               var2 = e(var13);
            } catch (IllegalStateException var7) {
               var10000 = var7;
               var10001 = false;
               break label56;
            }

            var1 = var2;

            try {
               var11 = d(var13);
               break label63;
            } catch (IllegalStateException var6) {
               var10000 = var6;
               var10001 = false;
            }
         }

         IllegalStateException var12 = var10000;
         y3.f.f().e("An error occurred getting battery state.", var12);
         var11 = (Float)var4;
         return new d(var11, var1);
      }

      var1 = var2;
      return new d(var11, var1);
   }

   private static Float d(Intent var0) {
      int var1 = var0.getIntExtra("level", -1);
      int var2 = var0.getIntExtra("scale", -1);
      return var1 != -1 && var2 != -1 ? (float)var1 / (float)var2 : null;
   }

   private static boolean e(Intent var0) {
      int var1 = var0.getIntExtra("status", -1);
      boolean var2 = false;
      if (var1 == -1) {
         return false;
      } else {
         if (var1 == 2 || var1 == 5) {
            var2 = true;
         }

         return var2;
      }
   }

   public Float b() {
      return this.a;
   }

   public int c() {
      if (this.b) {
         Float var1 = this.a;
         if (var1 != null) {
            if ((double)var1 < 0.99) {
               return 2;
            }

            return 3;
         }
      }

      return 1;
   }
}
