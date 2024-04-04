package e2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

final class h1 implements Handler.Callback {
   final i1 a;

   // $FF: synthetic method
   h1(i1 var1, g1 var2) {
      this.a = var1;
   }

   public final boolean handleMessage(Message var1) {
      int var2 = var1.what;
      Throwable var10000;
      boolean var10001;
      Throwable var166;
      if (var2 != 0) {
         if (var2 != 1) {
            return false;
         } else {
            HashMap var173 = i1.k(this.a);
            synchronized(var173){}

            label1390: {
               f1 var5;
               e1 var6;
               try {
                  var6 = (e1)var1.obj;
                  var5 = (f1)i1.k(this.a).get(var6);
               } catch (Throwable var160) {
                  var10000 = var160;
                  var10001 = false;
                  break label1390;
               }

               if (var5 != null) {
                  label1391: {
                     ComponentName var172;
                     try {
                        if (var5.a() != 3) {
                           break label1391;
                        }

                        String var169 = String.valueOf(var6);
                        var2 = var169.length();
                        StringBuilder var167 = new StringBuilder(var2 + 47);
                        var167.append("Timeout waiting for ServiceConnection callback ");
                        var167.append(var169);
                        Exception var171 = new Exception();
                        Log.e("GmsClientSupervisor", var167.toString(), var171);
                        var172 = var5.b();
                     } catch (Throwable var159) {
                        var10000 = var159;
                        var10001 = false;
                        break label1390;
                     }

                     ComponentName var168 = var172;
                     if (var172 == null) {
                        try {
                           var168 = var6.b();
                        } catch (Throwable var158) {
                           var10000 = var158;
                           var10001 = false;
                           break label1390;
                        }
                     }

                     var172 = var168;
                     if (var168 == null) {
                        try {
                           String var170 = var6.d();
                           n.i(var170);
                           var172 = new ComponentName(var170, "unknown");
                        } catch (Throwable var157) {
                           var10000 = var157;
                           var10001 = false;
                           break label1390;
                        }
                     }

                     try {
                        var5.onServiceDisconnected(var172);
                     } catch (Throwable var156) {
                        var10000 = var156;
                        var10001 = false;
                        break label1390;
                     }
                  }
               }

               label1343:
               try {
                  return true;
               } catch (Throwable var155) {
                  var10000 = var155;
                  var10001 = false;
                  break label1343;
               }
            }

            while(true) {
               var166 = var10000;

               try {
                  throw var166;
               } catch (Throwable var154) {
                  var10000 = var154;
                  var10001 = false;
                  continue;
               }
            }
         }
      } else {
         HashMap var3 = i1.k(this.a);
         synchronized(var3){}

         label1392: {
            e1 var4;
            f1 var165;
            try {
               var4 = (e1)var1.obj;
               var165 = (f1)i1.k(this.a).get(var4);
            } catch (Throwable var164) {
               var10000 = var164;
               var10001 = false;
               break label1392;
            }

            if (var165 != null) {
               label1378: {
                  try {
                     if (!var165.i()) {
                        break label1378;
                     }

                     if (var165.j()) {
                        var165.g("GmsClientSupervisor");
                     }
                  } catch (Throwable var163) {
                     var10000 = var163;
                     var10001 = false;
                     break label1392;
                  }

                  try {
                     i1.k(this.a).remove(var4);
                  } catch (Throwable var162) {
                     var10000 = var162;
                     var10001 = false;
                     break label1392;
                  }
               }
            }

            label1371:
            try {
               return true;
            } catch (Throwable var161) {
               var10000 = var161;
               var10001 = false;
               break label1371;
            }
         }

         while(true) {
            var166 = var10000;

            try {
               throw var166;
            } catch (Throwable var153) {
               var10000 = var153;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
