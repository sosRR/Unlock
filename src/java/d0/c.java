package d0;

import java.nio.ByteBuffer;

public class c {
   protected int a;
   protected ByteBuffer b;
   private int c;
   private int d;
   d e = d0.d.a();

   protected int a(int var1) {
      return var1 + this.b.getInt(var1);
   }

   protected int b(int var1) {
      short var2;
      if (var1 < this.d) {
         var2 = this.b.getShort(this.c + var1);
      } else {
         var2 = 0;
      }

      return var2;
   }

   protected void c(int var1, ByteBuffer var2) {
      this.b = var2;
      if (var2 != null) {
         this.a = var1;
         var1 -= var2.getInt(var1);
         this.c = var1;
         this.d = this.b.getShort(var1);
      } else {
         this.a = 0;
         this.c = 0;
         this.d = 0;
      }

   }

   protected int d(int var1) {
      var1 += this.a;
      return var1 + this.b.getInt(var1) + 4;
   }

   protected int e(int var1) {
      int var2 = var1 + this.a;
      var1 = this.b.getInt(var2);
      return this.b.getInt(var2 + var1);
   }
}
