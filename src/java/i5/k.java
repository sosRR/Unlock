package i5;

class k {
   private int a = 2;
   private int b = -1;
   private int c = -1;
   private byte[] d;

   private k(byte[] var1) {
      this.h(var1);
   }

   private void a(byte var1, byte var2) {
      if (var1 != var2) {
         throw m.c("ERR_MSG_INTERNAL_FAILURE");
      }
   }

   private short f() {
      byte[] var2 = this.d;
      int var1;
      if (var2 != null) {
         var1 = var2.length;
      } else {
         var1 = 0;
      }

      return (short)var1;
   }

   public static k g(byte[] var0) {
      return new k(var0);
   }

   private void h(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public int b() {
      return this.a;
   }

   public String c() {
      String var1;
      if (this.f() > 0) {
         var1 = new String(this.d, j5.b.a);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
