package i5;

public class j {
   public static void a(byte[] var0) {
      if (var0 != null && var0.length > 0) {
         if (var0[0] == -128) {
            throw m.b(var0);
         }
      } else {
         throw m.c("ERR_MSG_INVALID_SLE_BLOB");
      }
   }
}
