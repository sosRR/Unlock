package i2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
   @Deprecated
   public static byte[] a(Context var0, String var1) {
      PackageInfo var2 = k2.c.a(var0).e(var1, 64);
      Signature[] var3 = var2.signatures;
      if (var3 != null && var3.length == 1) {
         MessageDigest var4 = b("SHA1");
         if (var4 != null) {
            return var4.digest(var2.signatures[0].toByteArray());
         }
      }

      return null;
   }

   public static MessageDigest b(String var0) {
      for(int var1 = 0; var1 < 2; ++var1) {
         MessageDigest var2;
         try {
            var2 = MessageDigest.getInstance(var0);
         } catch (NoSuchAlgorithmException var3) {
            continue;
         }

         if (var2 != null) {
            return var2;
         }
      }

      return null;
   }
}
