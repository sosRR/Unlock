package d0;

import java.nio.ByteBuffer;

public final class a extends c {
   public a f(int var1, ByteBuffer var2) {
      this.g(var1, var2);
      return this;
   }

   public void g(int var1, ByteBuffer var2) {
      this.c(var1, var2);
   }

   public int h(int var1) {
      int var2 = this.b(16);
      if (var2 != 0) {
         var1 = super.b.getInt(this.d(var2) + var1 * 4);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int i() {
      int var1 = this.b(16);
      if (var1 != 0) {
         var1 = this.e(var1);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public boolean j() {
      int var1 = this.b(6);
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 != 0) {
         var2 = var3;
         if (super.b.get(var1 + super.a) != 0) {
            var2 = true;
         }
      }

      return var2;
   }

   public short k() {
      int var2 = this.b(14);
      short var1;
      if (var2 != 0) {
         var1 = super.b.getShort(var2 + super.a);
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

   public short m() {
      int var2 = this.b(8);
      short var1;
      if (var2 != 0) {
         var1 = super.b.getShort(var2 + super.a);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public short n() {
      int var2 = this.b(12);
      short var1;
      if (var2 != 0) {
         var1 = super.b.getShort(var2 + super.a);
      } else {
         var1 = 0;
      }

      return var1;
   }
}
