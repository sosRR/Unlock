package i5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class n {
   private final byte a;
   private final int b;

   private n(byte[] var1) {
      try {
         ByteBuffer var3 = ByteBuffer.wrap(var1);
         var3.order(ByteOrder.BIG_ENDIAN);
         this.a = var3.get();
         this.b = var3.getInt();
      } catch (Exception var2) {
         throw m.c(var2.getMessage());
      }
   }

   static n d(byte[] var0) {
      j.a(var0);
      return new n(var0);
   }

   public byte a() {
      return this.a;
   }

   public int b() {
      return 5;
   }

   public int c() {
      return this.b;
   }
}
