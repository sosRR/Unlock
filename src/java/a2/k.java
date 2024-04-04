package a2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class k {
   private final Context a;
   @GuardedBy("this")
   private int b;
   @GuardedBy("this")
   private int c = 0;

   public k(Context var1) {
      this.a = var1;
   }

   public final int a() {
      // $FF: Couldn't be decompiled
   }

   public final int b() {
      synchronized(this){}

      Throwable var10000;
      label1350: {
         int var1;
         boolean var10001;
         try {
            var1 = this.c;
         } catch (Throwable var136) {
            var10000 = var136;
            var10001 = false;
            break label1350;
         }

         if (var1 != 0) {
            return var1;
         }

         PackageManager var3;
         try {
            var3 = this.a.getPackageManager();
            if (k2.c.a(this.a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
               Log.e("Metadata", "Google Play services missing or without correct permission.");
               return 0;
            }
         } catch (Throwable var137) {
            var10000 = var137;
            var10001 = false;
            break label1350;
         }

         boolean var2;
         try {
            var2 = i2.k.h();
         } catch (Throwable var135) {
            var10000 = var135;
            var10001 = false;
            break label1350;
         }

         byte var138 = 1;
         Intent var4;
         if (!var2) {
            List var141;
            try {
               var4 = new Intent("com.google.android.c2dm.intent.REGISTER");
               var4.setPackage("com.google.android.gms");
               var141 = var3.queryIntentServices(var4, 0);
            } catch (Throwable var133) {
               var10000 = var133;
               var10001 = false;
               break label1350;
            }

            if (var141 != null) {
               label1343: {
                  label1311:
                  try {
                     if (var141.size() > 0) {
                        break label1311;
                     }
                     break label1343;
                  } catch (Throwable var134) {
                     var10000 = var134;
                     var10001 = false;
                     break label1350;
                  }

                  try {
                     this.c = 1;
                  } catch (Throwable var127) {
                     var10000 = var127;
                     var10001 = false;
                     break label1350;
                  }

                  return 1;
               }
            }
         }

         List var139;
         try {
            var4 = new Intent("com.google.iid.TOKEN_REQUEST");
            var4.setPackage("com.google.android.gms");
            var139 = var3.queryBroadcastReceivers(var4, 0);
         } catch (Throwable var132) {
            var10000 = var132;
            var10001 = false;
            break label1350;
         }

         if (var139 != null) {
            label1341: {
               try {
                  if (var139.size() <= 0) {
                     break label1341;
                  }
               } catch (Throwable var131) {
                  var10000 = var131;
                  var10001 = false;
                  break label1350;
               }

               try {
                  this.c = 2;
               } catch (Throwable var128) {
                  var10000 = var128;
                  var10001 = false;
                  break label1350;
               }

               return 2;
            }
         }

         label1284: {
            try {
               Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
               if (i2.k.h()) {
                  this.c = 2;
                  break label1284;
               }
            } catch (Throwable var130) {
               var10000 = var130;
               var10001 = false;
               break label1350;
            }

            try {
               this.c = 1;
               return var138;
            } catch (Throwable var129) {
               var10000 = var129;
               var10001 = false;
               break label1350;
            }
         }

         var138 = 2;
         return var138;
      }

      Throwable var140 = var10000;
      throw var140;
   }
}
