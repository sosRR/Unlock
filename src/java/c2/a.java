package c2;

public class a {
   public static String a(int var0) {
      switch (var0) {
         case -1:
            return "SUCCESS_CACHE";
         case 0:
            return "SUCCESS";
         case 1:
         case 9:
         case 11:
         case 12:
         default:
            StringBuilder var1 = new StringBuilder(32);
            var1.append("unknown status code: ");
            var1.append(var0);
            return var1.toString();
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
         case 10:
            return "DEVELOPER_ERROR";
         case 13:
            return "ERROR";
         case 14:
            return "INTERRUPTED";
         case 15:
            return "TIMEOUT";
         case 16:
            return "CANCELED";
         case 17:
            return "API_NOT_CONNECTED";
         case 18:
            return "DEAD_CLIENT";
         case 19:
            return "REMOTE_EXCEPTION";
         case 20:
            return "CONNECTION_SUSPENDED_DURING_CALL";
         case 21:
            return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
         case 22:
            return "RECONNECTION_TIMED_OUT";
      }
   }
}
