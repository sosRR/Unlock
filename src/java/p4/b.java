package p4;

import java.io.OutputStream;

final class b extends OutputStream {
   private long m = 0L;

   long a() {
      return this.m;
   }

   public void write(int var1) {
      ++this.m;
   }

   public void write(byte[] var1) {
      this.m += (long)var1.length;
   }

   public void write(byte[] var1, int var2, int var3) {
      if (var2 >= 0 && var2 <= var1.length && var3 >= 0) {
         var2 += var3;
         if (var2 <= var1.length && var2 >= 0) {
            this.m += (long)var3;
            return;
         }
      }

      throw new IndexOutOfBoundsException();
   }
}
