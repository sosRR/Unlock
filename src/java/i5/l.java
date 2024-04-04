package i5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class l {
   private byte[] a;

   public l(byte[] var1) {
      this.a = var1;
   }

   private l(byte[] var1, boolean var2) {
      this.a = null;

      Exception var10000;
      label27: {
         boolean var10001;
         short var3;
         ByteBuffer var4;
         try {
            var4 = ByteBuffer.wrap(var1);
            var4.order(ByteOrder.BIG_ENDIAN);
            this.a(var4.get(), (byte)0);
            var3 = var4.getShort();
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label27;
         }

         if (var3 <= 0) {
            return;
         }

         try {
            var1 = new byte[var3];
            this.a = var1;
            var4.get(var1);
            return;
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      Exception var7 = var10000;
      throw m.c(var7.getMessage());
   }

   private void a(byte var1, byte var2) {
      if (var1 != var2) {
         throw m.c("ERR_MSG_INTERNAL_FAILURE");
      }
   }

   private short b() {
      byte[] var2 = this.a;
      int var1;
      if (var2 != null) {
         var1 = var2.length;
      } else {
         var1 = 0;
      }

      return (short)var1;
   }

   public static l d(byte[] var0) {
      j.a(var0);
      return new l(var0, true);
   }

   public String c() {
      String var1;
      if (this.b() > 0) {
         var1 = new String(this.a, j5.b.a);
      } else {
         var1 = null;
      }

      return var1;
   }
}
