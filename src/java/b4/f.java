package b4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class f {
   private static final AtomicLong a = new AtomicLong(0L);
   private static String b;

   f(v var1) {
      byte[] var2 = new byte[10];
      this.e(var2);
      this.d(var2);
      this.c(var2);
      String var4 = g.z(var1.a());
      String var5 = g.v(var2);
      Locale var3 = Locale.US;
      b = String.format(var3, "%s%s%s%s", new Object[]{var5.substring(0, 12), var5.substring(12, 16), var5.subSequence(16, 20), var4.substring(0, 12)}).toUpperCase(var3);
   }

   private static byte[] a(long var0) {
      ByteBuffer var2 = ByteBuffer.allocate(4);
      var2.putInt((int)var0);
      var2.order(ByteOrder.BIG_ENDIAN);
      var2.position(0);
      return var2.array();
   }

   private static byte[] b(long var0) {
      ByteBuffer var2 = ByteBuffer.allocate(2);
      var2.putShort((short)((int)var0));
      var2.order(ByteOrder.BIG_ENDIAN);
      var2.position(0);
      return var2.array();
   }

   private void c(byte[] var1) {
      byte[] var2 = b((long)Integer.valueOf(Process.myPid()).shortValue());
      var1[8] = var2[0];
      var1[9] = var2[1];
   }

   private void d(byte[] var1) {
      byte[] var2 = b(a.incrementAndGet());
      var1[6] = var2[0];
      var1[7] = var2[1];
   }

   private void e(byte[] var1) {
      long var2 = (new Date()).getTime();
      byte[] var4 = a(var2 / 1000L);
      var1[0] = var4[0];
      var1[1] = var4[1];
      var1[2] = var4[2];
      var1[3] = var4[3];
      var4 = b(var2 % 1000L);
      var1[4] = var4[0];
      var1[5] = var4[1];
   }

   public String toString() {
      return b;
   }
}
