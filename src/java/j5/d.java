package j5;

import android.content.ComponentName;
import android.content.Intent;

public class d {
   public static Intent a() {
      Intent var0 = new Intent("com.tmobile.rsusrv.aidl.IRsuAppRemoteService");
      var0.setComponent(new ComponentName("com.tmobile.rsusrv", "com.tmobile.rsusrv.aidl.RsuAppSystemService"));
      return var0;
   }
}
