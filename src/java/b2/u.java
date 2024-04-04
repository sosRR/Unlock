package b2;

import java.util.Arrays;

final class u extends t {
   private final byte[] b;

   u(byte[] var1) {
      super(Arrays.copyOfRange(var1, 0, 25));
      this.b = var1;
   }

   final byte[] l0() {
      return this.b;
   }
}
