package d0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends c {
   public static b h(ByteBuffer var0) {
      return i(var0, new b());
   }

   public static b i(ByteBuffer var0, b var1) {
      var0.order(ByteOrder.LITTLE_ENDIAN);
      return var1.f(var0.getInt(var0.position()) + var0.position(), var0);
   }

   public b f(int var1, ByteBuffer var2) {
      this.g(var1, var2);
      return this;
   }

   public void g(int var1, ByteBuffer var2) {
      this.c(var1, var2);
   }

   public a j(a var1, int var2) {
      int var3 = this.b(6);
      if (var3 != 0) {
         var1 = var1.f(this.a(this.d(var3) + var2 * 4), super.b);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int k() {
      int var1 = this.b(6);
      if (var1 != 0) {
         var1 = this.e(var1);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int l() {
      int var1 = this.b(4);
      if (var1 != 0) {
         var1 = super.b.getInt(var1 + super.a);
      } else {
         var1 = 0;
      }

      return var1;
   }
}
