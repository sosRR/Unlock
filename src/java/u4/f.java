package u4;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class f {
   private static final byte a = Byte.parseByte("01110000", 2);
   private static final byte b = Byte.parseByte("00001111", 2);

   private static String b(byte[] var0) {
      return (new String(Base64.encode(var0, 11), Charset.defaultCharset())).substring(0, 22);
   }

   private static byte[] c(UUID var0, byte[] var1) {
      ByteBuffer var2 = ByteBuffer.wrap(var1);
      var2.putLong(var0.getMostSignificantBits());
      var2.putLong(var0.getLeastSignificantBits());
      return var2.array();
   }

   public String a() {
      byte[] var2 = c(UUID.randomUUID(), new byte[17]);
      byte var1 = var2[0];
      var2[16] = var1;
      var2[0] = (byte)(var1 & b | a);
      return b(var2);
   }
}
