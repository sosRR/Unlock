package a2;

import android.util.Log;

public final class g extends ClassLoader {
   protected final Class loadClass(String var1, boolean var2) {
      if ("com.google.android.gms.iid.MessengerCompat".equals(var1)) {
         Log.isLoggable("CloudMessengerCompat", 3);
         return h.class;
      } else {
         return super.loadClass(var1, var2);
      }
   }
}
