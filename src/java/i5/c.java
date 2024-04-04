package i5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class c {
   private n a;
   private byte[] b;

   private c(byte[] var1) {
      this.a = n.d(var1);
      ByteBuffer var4 = ByteBuffer.wrap(var1);
      var4.order(ByteOrder.BIG_ENDIAN);
      var4.position(this.a.b());
      short var2 = var4.getShort();
      if (var2 > 0) {
         byte[] var3 = new byte[var2];
         this.b = var3;
         var4.get(var3);
      }

   }

   public static c d(byte[] var0) {
      return new c(var0);
   }

   public byte a() {
      return this.a.a();
   }

   public String b() {
      byte[] var1 = this.b;
      String var2;
      if (var1 != null) {
         var2 = new String(var1, j5.b.a);
      } else {
         var2 = null;
      }

      return var2;
   }

   public int c() {
      return this.a.c();
   }
}
