package e2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public final class x0 implements ServiceConnection {
   private final int a;
   final c b;

   public x0(c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void onServiceConnected(ComponentName var1, IBinder var2) {
      c var36 = this.b;
      if (var2 == null) {
         c.d0(var36, 16);
      } else {
         Object var3 = c.W(var36);
         synchronized(var3){}

         label320: {
            Throwable var10000;
            boolean var10001;
            label322: {
               c var4;
               IInterface var37;
               try {
                  var4 = this.b;
                  var37 = var2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label322;
               }

               Object var38;
               label308: {
                  if (var37 != null) {
                     try {
                        if (var37 instanceof k) {
                           var38 = (k)var37;
                           break label308;
                        }
                     } catch (Throwable var34) {
                        var10000 = var34;
                        var10001 = false;
                        break label322;
                     }
                  }

                  try {
                     var38 = new n0(var2);
                  } catch (Throwable var33) {
                     var10000 = var33;
                     var10001 = false;
                     break label322;
                  }
               }

               label300:
               try {
                  c.a0(var4, (k)var38);
                  break label320;
               } catch (Throwable var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label300;
               }
            }

            while(true) {
               Throwable var39 = var10000;

               try {
                  throw var39;
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  continue;
               }
            }
         }

         this.b.e0(0, (Bundle)null, this.a);
      }
   }

   public final void onServiceDisconnected(ComponentName param1) {
      // $FF: Couldn't be decompiled
   }
}
