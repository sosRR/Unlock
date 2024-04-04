package i5;

import com.tmobile.rsucommon.errors.RsuException;

public class m {
   public static RsuException a(int var0, int var1, int var2, String var3) {
      return new a(var0, var1, var2, var3);
   }

   public static RsuException b(byte[] var0) {
      Object var3;
      try {
         k var1 = k.g(var0);
         var3 = new a(var1.e(), var1.b(), var1.d(), var1.c());
      } catch (RsuException var2) {
         var3 = var2;
      }

      return (RsuException)var3;
   }

   public static RsuException c(String var0) {
      return a(-1, 2, -1, var0);
   }

   private static class a extends RsuException {
      protected a(int var1, int var2, int var3, String var4) {
         super(var1, var2, var3, var4);
      }
   }
}
