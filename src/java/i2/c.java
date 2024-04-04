package i2;

import android.util.Base64;

public final class c {
   public static String a(byte[] var0) {
      return var0 == null ? null : Base64.encodeToString(var0, 11);
   }
}
