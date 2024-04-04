package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

public final class z {
   @GuardedBy("sCache")
   private static final n.g a = new n.g();
   @GuardedBy("sCache")
   private static Locale b;

   public static String a(Context var0) {
      String var1 = var0.getPackageName();

      try {
         String var2 = k2.c.a(var0).d(var1).toString();
         return var2;
      } catch (NullPointerException | PackageManager.NameNotFoundException var3) {
         String var4 = var0.getApplicationInfo().name;
         return TextUtils.isEmpty(var4) ? var1 : var4;
      }
   }

   public static String b(Context var0) {
      return var0.getResources().getString(z1.b.g);
   }

   public static String c(Context var0, int var1) {
      Resources var2 = var0.getResources();
      if (var1 != 1) {
         if (var1 != 2) {
            return var1 != 3 ? var2.getString(17039370) : var2.getString(z1.b.a);
         } else {
            return var2.getString(z1.b.j);
         }
      } else {
         return var2.getString(z1.b.d);
      }
   }

   public static String d(Context var0, int var1) {
      Resources var3 = var0.getResources();
      String var2 = a(var0);
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               if (var1 != 5) {
                  if (var1 != 7) {
                     if (var1 != 9) {
                        if (var1 != 20) {
                           switch (var1) {
                              case 16:
                                 return h(var0, "common_google_play_services_api_unavailable_text", var2);
                              case 17:
                                 return h(var0, "common_google_play_services_sign_in_failed_text", var2);
                              case 18:
                                 return var3.getString(z1.b.m, new Object[]{var2});
                              default:
                                 return var3.getString(b2.j.a, new Object[]{var2});
                           }
                        } else {
                           return h(var0, "common_google_play_services_restricted_profile_text", var2);
                        }
                     } else {
                        return var3.getString(z1.b.i, new Object[]{var2});
                     }
                  } else {
                     return h(var0, "common_google_play_services_network_error_text", var2);
                  }
               } else {
                  return h(var0, "common_google_play_services_invalid_account_text", var2);
               }
            } else {
               return var3.getString(z1.b.b, new Object[]{var2});
            }
         } else {
            return i2.h.d(var0) ? var3.getString(z1.b.n) : var3.getString(z1.b.k, new Object[]{var2});
         }
      } else {
         return var3.getString(z1.b.e, new Object[]{var2});
      }
   }

   public static String e(Context var0, int var1) {
      return var1 != 6 && var1 != 19 ? d(var0, var1) : h(var0, "common_google_play_services_resolution_required_text", a(var0));
   }

   public static String f(Context var0, int var1) {
      String var2;
      if (var1 == 6) {
         var2 = i(var0, "common_google_play_services_resolution_required_title");
      } else {
         var2 = g(var0, var1);
      }

      return var2 == null ? var0.getResources().getString(z1.b.h) : var2;
   }

   public static String g(Context var0, int var1) {
      Resources var2 = var0.getResources();
      switch (var1) {
         case 1:
            return var2.getString(z1.b.f);
         case 2:
            return var2.getString(z1.b.l);
         case 3:
            return var2.getString(z1.b.c);
         case 4:
         case 6:
         case 18:
            return null;
         case 5:
            Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
            return i(var0, "common_google_play_services_invalid_account_title");
         case 7:
            Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
            return i(var0, "common_google_play_services_network_error_title");
         case 8:
            Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
            return null;
         case 9:
            Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
            return null;
         case 10:
            Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
            return null;
         case 11:
            Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
            return null;
         case 12:
         case 13:
         case 14:
         case 15:
         case 19:
         default:
            StringBuilder var3 = new StringBuilder(33);
            var3.append("Unexpected error code ");
            var3.append(var1);
            Log.e("GoogleApiAvailability", var3.toString());
            return null;
         case 16:
            Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
            return null;
         case 17:
            Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
            return i(var0, "common_google_play_services_sign_in_failed_title");
         case 20:
            Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
            return i(var0, "common_google_play_services_restricted_profile_title");
      }
   }

   private static String h(Context var0, String var1, String var2) {
      Resources var3 = var0.getResources();
      var1 = i(var0, var1);
      String var4 = var1;
      if (var1 == null) {
         var4 = var3.getString(b2.j.a);
      }

      return String.format(var3.getConfiguration().locale, var4, new Object[]{var2});
   }

   private static String i(Context var0, String var1) {
      n.g var3 = a;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label1631: {
         try {
            Locale var4 = androidx.core.os.f.a(var0.getResources().getConfiguration()).b(0);
            if (!var4.equals(b)) {
               var3.clear();
               b = var4;
            }
         } catch (Throwable var215) {
            var10000 = var215;
            var10001 = false;
            break label1631;
         }

         String var219;
         try {
            var219 = (String)var3.get(var1);
         } catch (Throwable var214) {
            var10000 = var214;
            var10001 = false;
            break label1631;
         }

         if (var219 != null) {
            label1579:
            try {
               return var219;
            } catch (Throwable var203) {
               var10000 = var203;
               var10001 = false;
               break label1579;
            }
         } else {
            label1620: {
               Resources var216;
               try {
                  var216 = b2.g.c(var0);
               } catch (Throwable var213) {
                  var10000 = var213;
                  var10001 = false;
                  break label1620;
               }

               if (var216 == null) {
                  label1581:
                  try {
                     return null;
                  } catch (Throwable var204) {
                     var10000 = var204;
                     var10001 = false;
                     break label1581;
                  }
               } else {
                  label1616: {
                     int var2;
                     try {
                        var2 = var216.getIdentifier(var1, "string", "com.google.android.gms");
                     } catch (Throwable var212) {
                        var10000 = var212;
                        var10001 = false;
                        break label1616;
                     }

                     String var217;
                     if (var2 == 0) {
                        label1633: {
                           label1592: {
                              try {
                                 if (var1.length() != 0) {
                                    var217 = "Missing resource: ".concat(var1);
                                    break label1592;
                                 }
                              } catch (Throwable var207) {
                                 var10000 = var207;
                                 var10001 = false;
                                 break label1633;
                              }

                              try {
                                 var217 = new String("Missing resource: ");
                              } catch (Throwable var206) {
                                 var10000 = var206;
                                 var10001 = false;
                                 break label1633;
                              }
                           }

                           label1583:
                           try {
                              Log.w("GoogleApiAvailability", var217);
                              return null;
                           } catch (Throwable var205) {
                              var10000 = var205;
                              var10001 = false;
                              break label1583;
                           }
                        }
                     } else {
                        label1612: {
                           label1611: {
                              label1634: {
                                 try {
                                    var217 = var216.getString(var2);
                                    if (!TextUtils.isEmpty(var217)) {
                                       break label1634;
                                    }

                                    if (var1.length() != 0) {
                                       var217 = "Got empty resource: ".concat(var1);
                                       break label1611;
                                    }
                                 } catch (Throwable var211) {
                                    var10000 = var211;
                                    var10001 = false;
                                    break label1612;
                                 }

                                 try {
                                    var217 = new String("Got empty resource: ");
                                    break label1611;
                                 } catch (Throwable var210) {
                                    var10000 = var210;
                                    var10001 = false;
                                    break label1612;
                                 }
                              }

                              try {
                                 var3.put(var1, var217);
                                 return var217;
                              } catch (Throwable var209) {
                                 var10000 = var209;
                                 var10001 = false;
                                 break label1612;
                              }
                           }

                           label1596:
                           try {
                              Log.w("GoogleApiAvailability", var217);
                              return null;
                           } catch (Throwable var208) {
                              var10000 = var208;
                              var10001 = false;
                              break label1596;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      while(true) {
         Throwable var218 = var10000;

         try {
            throw var218;
         } catch (Throwable var202) {
            var10000 = var202;
            var10001 = false;
            continue;
         }
      }
   }
}
