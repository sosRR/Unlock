package i5;

public class g {
   private byte[] a;

   public g(byte[] var1) {
      this.a = var1;
      if (var1 == null) {
         m.c("NULL Response");
      }

      j.a(var1);
   }

   public String a() {
      byte[] var1 = this.a;
      return var1 == null ? "" : new String(var1);
   }
}
