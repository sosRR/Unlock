package w4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
   private static final String[] c = new String[]{"*", "FCM", "GCM", ""};
   private final SharedPreferences a;
   private final String b;

   public b(com.google.firebase.d var1) {
      this.a = var1.j().getSharedPreferences("com.google.android.gms.appid", 0);
      this.b = b(var1);
   }

   private String a(String var1, String var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("|T|");
      var3.append(var1);
      var3.append("|");
      var3.append(var2);
      return var3.toString();
   }

   private static String b(com.google.firebase.d var0) {
      String var1 = var0.m().d();
      if (var1 != null) {
         return var1;
      } else {
         String var2 = var0.m().c();
         if (!var2.startsWith("1:") && !var2.startsWith("2:")) {
            return var2;
         } else {
            String[] var3 = var2.split(":");
            if (var3.length != 4) {
               return null;
            } else {
               var2 = var3[1];
               return var2.isEmpty() ? null : var2;
            }
         }
      }
   }

   private static String c(PublicKey var0) {
      byte[] var3 = var0.getEncoded();

      label25: {
         boolean var10001;
         try {
            var3 = MessageDigest.getInstance("SHA1").digest(var3);
         } catch (NoSuchAlgorithmException var2) {
            var10001 = false;
            break label25;
         }

         var3[0] = (byte)((var3[0] & 15) + 112 & 255);

         try {
            String var4 = Base64.encodeToString(var3, 0, 8, 11);
            return var4;
         } catch (NoSuchAlgorithmException var1) {
            var10001 = false;
         }
      }

      Log.w("ContentValues", "Unexpected error, device missing required algorithms");
      return null;
   }

   private String d(String var1) {
      try {
         JSONObject var2 = new JSONObject(var1);
         var1 = var2.getString("token");
         return var1;
      } catch (JSONException var3) {
         return null;
      }
   }

   private PublicKey e(String var1) {
      Object var7;
      try {
         byte[] var9 = Base64.decode(var1, 8);
         KeyFactory var3 = KeyFactory.getInstance("RSA");
         X509EncodedKeySpec var8 = new X509EncodedKeySpec(var9);
         PublicKey var10 = var3.generatePublic(var8);
         return var10;
      } catch (IllegalArgumentException var4) {
         var7 = var4;
      } catch (InvalidKeySpecException var5) {
         var7 = var5;
      } catch (NoSuchAlgorithmException var6) {
         var7 = var6;
      }

      StringBuilder var2 = new StringBuilder();
      var2.append("Invalid key stored ");
      var2.append(var7);
      Log.w("ContentValues", var2.toString());
      return null;
   }

   private String g() {
      // $FF: Couldn't be decompiled
   }

   private String h() {
      SharedPreferences var1 = this.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label308: {
         String var2;
         try {
            var2 = this.a.getString("|S||P|", (String)null);
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label308;
         }

         if (var2 == null) {
            label296:
            try {
               return null;
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label296;
            }
         } else {
            label304: {
               PublicKey var46;
               try {
                  var46 = this.e(var2);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label304;
               }

               if (var46 == null) {
                  label298:
                  try {
                     return null;
                  } catch (Throwable var42) {
                     var10000 = var42;
                     var10001 = false;
                     break label298;
                  }
               } else {
                  label300:
                  try {
                     var2 = c(var46);
                     return var2;
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break label300;
                  }
               }
            }
         }
      }

      while(true) {
         Throwable var47 = var10000;

         try {
            throw var47;
         } catch (Throwable var40) {
            var10000 = var40;
            var10001 = false;
            continue;
         }
      }
   }

   public String f() {
      SharedPreferences var1 = this.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label164: {
         String var2;
         try {
            var2 = this.g();
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label164;
         }

         if (var2 != null) {
            label158:
            try {
               return var2;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label158;
            }
         } else {
            label160:
            try {
               var2 = this.h();
               return var2;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label160;
            }
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   public String i() {
      SharedPreferences var5 = this.a;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label553: {
         int var2;
         String[] var3;
         try {
            var3 = c;
            var2 = var3.length;
         } catch (Throwable var62) {
            var10000 = var62;
            var10001 = false;
            break label553;
         }

         int var1 = 0;

         while(true) {
            if (var1 < var2) {
               String var4 = var3[var1];

               try {
                  var4 = this.a(this.b, var4);
                  var4 = this.a.getString(var4, (String)null);
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break;
               }

               label540: {
                  if (var4 != null) {
                     try {
                        if (!var4.isEmpty()) {
                           break label540;
                        }
                     } catch (Throwable var61) {
                        var10000 = var61;
                        var10001 = false;
                        break;
                     }
                  }

                  ++var1;
                  continue;
               }

               String var63 = var4;

               try {
                  if (var4.startsWith("{")) {
                     var63 = this.d(var4);
                  }
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break;
               }

               try {
                  return var63;
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break;
               }
            }

            try {
               return null;
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break;
            }
         }
      }

      while(true) {
         Throwable var64 = var10000;

         try {
            throw var64;
         } catch (Throwable var56) {
            var10000 = var56;
            var10001 = false;
            continue;
         }
      }
   }
}
